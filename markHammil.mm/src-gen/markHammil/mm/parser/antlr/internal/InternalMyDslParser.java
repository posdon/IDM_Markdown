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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BL", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_DIGIT", "RULE_ANY_OTHER", "'>'", "'#'", "'##'", "'###'", "'####'", "'#####'", "'######'", "'**'", "'*'", "'~~'", "'\\''", "'-'", "'|'", "'\"'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_DIGIT=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int RULE_INT=7;
    public static final int RULE_BL=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
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

                if ( ((LA1_0>=RULE_BL && LA1_0<=RULE_INT)||(LA1_0>=13 && LA1_0<=26)) ) {
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
    // InternalMyDsl.g:116:1: ruleExpression returns [EObject current=null] : ( ( ( ( ( ( ( ruleHeaderExpression ) )=> ( ruleHeaderExpression ) ) | ( ( ( ruleTextExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) ) )=> ( ( ( ( ruleHeaderExpression ) )=> (lv_c_0_0= ruleHeaderExpression ) ) | ( ( (lv_c_1_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_2= RULE_BL )? ) ) ) | ( (lv_c_3_0= ruleBreakLineExpression ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token this_BL_2=null;
        EObject lv_c_0_0 = null;

        EObject lv_c_1_0 = null;

        EObject lv_c_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:122:2: ( ( ( ( ( ( ( ( ruleHeaderExpression ) )=> ( ruleHeaderExpression ) ) | ( ( ( ruleTextExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) ) )=> ( ( ( ( ruleHeaderExpression ) )=> (lv_c_0_0= ruleHeaderExpression ) ) | ( ( (lv_c_1_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_2= RULE_BL )? ) ) ) | ( (lv_c_3_0= ruleBreakLineExpression ) ) ) )
            // InternalMyDsl.g:123:2: ( ( ( ( ( ( ( ruleHeaderExpression ) )=> ( ruleHeaderExpression ) ) | ( ( ( ruleTextExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) ) )=> ( ( ( ( ruleHeaderExpression ) )=> (lv_c_0_0= ruleHeaderExpression ) ) | ( ( (lv_c_1_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_2= RULE_BL )? ) ) ) | ( (lv_c_3_0= ruleBreakLineExpression ) ) )
            {
            // InternalMyDsl.g:123:2: ( ( ( ( ( ( ( ruleHeaderExpression ) )=> ( ruleHeaderExpression ) ) | ( ( ( ruleTextExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) ) )=> ( ( ( ( ruleHeaderExpression ) )=> (lv_c_0_0= ruleHeaderExpression ) ) | ( ( (lv_c_1_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_2= RULE_BL )? ) ) ) | ( (lv_c_3_0= ruleBreakLineExpression ) ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:124:3: ( ( ( ( ( ( ruleHeaderExpression ) )=> ( ruleHeaderExpression ) ) | ( ( ( ruleTextExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) ) )=> ( ( ( ( ruleHeaderExpression ) )=> (lv_c_0_0= ruleHeaderExpression ) ) | ( ( (lv_c_1_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_2= RULE_BL )? ) ) )
                    {
                    // InternalMyDsl.g:124:3: ( ( ( ( ( ( ruleHeaderExpression ) )=> ( ruleHeaderExpression ) ) | ( ( ( ruleTextExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) ) )=> ( ( ( ( ruleHeaderExpression ) )=> (lv_c_0_0= ruleHeaderExpression ) ) | ( ( (lv_c_1_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_2= RULE_BL )? ) ) )
                    // InternalMyDsl.g:125:4: ( ( ( ( ( ruleHeaderExpression ) )=> ( ruleHeaderExpression ) ) | ( ( ( ruleTextExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) ) )=> ( ( ( ( ruleHeaderExpression ) )=> (lv_c_0_0= ruleHeaderExpression ) ) | ( ( (lv_c_1_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_2= RULE_BL )? ) )
                    {
                    // InternalMyDsl.g:149:4: ( ( ( ( ruleHeaderExpression ) )=> (lv_c_0_0= ruleHeaderExpression ) ) | ( ( (lv_c_1_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_2= RULE_BL )? ) )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==14) && (synpred4_InternalMyDsl())) {
                        alt3=1;
                    }
                    else if ( (LA3_0==15) && (synpred4_InternalMyDsl())) {
                        alt3=1;
                    }
                    else if ( (LA3_0==16) && (synpred4_InternalMyDsl())) {
                        alt3=1;
                    }
                    else if ( (LA3_0==17) && (synpred4_InternalMyDsl())) {
                        alt3=1;
                    }
                    else if ( (LA3_0==18) && (synpred4_InternalMyDsl())) {
                        alt3=1;
                    }
                    else if ( (LA3_0==19) && (synpred4_InternalMyDsl())) {
                        alt3=1;
                    }
                    else if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_INT)||LA3_0==13||(LA3_0>=20 && LA3_0<=26)) ) {
                        alt3=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalMyDsl.g:150:5: ( ( ( ruleHeaderExpression ) )=> (lv_c_0_0= ruleHeaderExpression ) )
                            {
                            // InternalMyDsl.g:150:5: ( ( ( ruleHeaderExpression ) )=> (lv_c_0_0= ruleHeaderExpression ) )
                            // InternalMyDsl.g:151:6: ( ( ruleHeaderExpression ) )=> (lv_c_0_0= ruleHeaderExpression )
                            {
                            // InternalMyDsl.g:155:6: (lv_c_0_0= ruleHeaderExpression )
                            // InternalMyDsl.g:156:7: lv_c_0_0= ruleHeaderExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExpressionAccess().getCHeaderExpressionParserRuleCall_0_0_0_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_c_0_0=ruleHeaderExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getExpressionRule());
                              							}
                              							set(
                              								current,
                              								"c",
                              								lv_c_0_0,
                              								"markHammil.mm.MyDsl.HeaderExpression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:174:5: ( ( (lv_c_1_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_2= RULE_BL )? )
                            {
                            // InternalMyDsl.g:174:5: ( ( (lv_c_1_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_2= RULE_BL )? )
                            // InternalMyDsl.g:175:6: ( (lv_c_1_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_2= RULE_BL )?
                            {
                            // InternalMyDsl.g:175:6: ( (lv_c_1_0= ruleTextExpression ) )
                            // InternalMyDsl.g:176:7: (lv_c_1_0= ruleTextExpression )
                            {
                            // InternalMyDsl.g:176:7: (lv_c_1_0= ruleTextExpression )
                            // InternalMyDsl.g:177:8: lv_c_1_0= ruleTextExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getExpressionAccess().getCTextExpressionParserRuleCall_0_0_1_0_0());
                              							
                            }
                            pushFollow(FOLLOW_4);
                            lv_c_1_0=ruleTextExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getExpressionRule());
                              								}
                              								set(
                              									current,
                              									"c",
                              									lv_c_1_0,
                              									"markHammil.mm.MyDsl.TextExpression");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalMyDsl.g:194:6: ( ( RULE_BL )=>this_BL_2= RULE_BL )?
                            int alt2=2;
                            int LA2_0 = input.LA(1);

                            if ( (LA2_0==RULE_BL) ) {
                                int LA2_1 = input.LA(2);

                                if ( (synpred5_InternalMyDsl()) ) {
                                    alt2=1;
                                }
                            }
                            switch (alt2) {
                                case 1 :
                                    // InternalMyDsl.g:195:7: ( RULE_BL )=>this_BL_2= RULE_BL
                                    {
                                    this_BL_2=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(this_BL_2, grammarAccess.getExpressionAccess().getBLTerminalRuleCall_0_0_1_1());
                                      						
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:205:3: ( (lv_c_3_0= ruleBreakLineExpression ) )
                    {
                    // InternalMyDsl.g:205:3: ( (lv_c_3_0= ruleBreakLineExpression ) )
                    // InternalMyDsl.g:206:4: (lv_c_3_0= ruleBreakLineExpression )
                    {
                    // InternalMyDsl.g:206:4: (lv_c_3_0= ruleBreakLineExpression )
                    // InternalMyDsl.g:207:5: lv_c_3_0= ruleBreakLineExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpressionAccess().getCBreakLineExpressionParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_c_3_0=ruleBreakLineExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpressionRule());
                      					}
                      					set(
                      						current,
                      						"c",
                      						lv_c_3_0,
                      						"markHammil.mm.MyDsl.BreakLineExpression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

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
    // InternalMyDsl.g:228:1: entryRuleBreakLineExpression returns [EObject current=null] : iv_ruleBreakLineExpression= ruleBreakLineExpression EOF ;
    public final EObject entryRuleBreakLineExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakLineExpression = null;


        try {
            // InternalMyDsl.g:228:60: (iv_ruleBreakLineExpression= ruleBreakLineExpression EOF )
            // InternalMyDsl.g:229:2: iv_ruleBreakLineExpression= ruleBreakLineExpression EOF
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
    // InternalMyDsl.g:235:1: ruleBreakLineExpression returns [EObject current=null] : ( () this_BL_1= RULE_BL ) ;
    public final EObject ruleBreakLineExpression() throws RecognitionException {
        EObject current = null;

        Token this_BL_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:241:2: ( ( () this_BL_1= RULE_BL ) )
            // InternalMyDsl.g:242:2: ( () this_BL_1= RULE_BL )
            {
            // InternalMyDsl.g:242:2: ( () this_BL_1= RULE_BL )
            // InternalMyDsl.g:243:3: () this_BL_1= RULE_BL
            {
            // InternalMyDsl.g:243:3: ()
            // InternalMyDsl.g:244:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBreakLineExpressionAccess().getBreakLineExpressionBAction_0(),
              					current);
              			
            }

            }

            this_BL_1=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BL_1, grammarAccess.getBreakLineExpressionAccess().getBLTerminalRuleCall_1());
              		
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
    // InternalMyDsl.g:258:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // InternalMyDsl.g:258:55: (iv_ruleTextExpression= ruleTextExpression EOF )
            // InternalMyDsl.g:259:2: iv_ruleTextExpression= ruleTextExpression EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleTextExpression"


    // $ANTLR start "ruleTextExpression"
    // InternalMyDsl.g:265:1: ruleTextExpression returns [EObject current=null] : ( ( (lv_c_0_0= ruleEmphasisExpression ) ) | ( (lv_c_1_0= ruleQuoteExpression ) ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_c_0_0 = null;

        EObject lv_c_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:271:2: ( ( ( (lv_c_0_0= ruleEmphasisExpression ) ) | ( (lv_c_1_0= ruleQuoteExpression ) ) ) )
            // InternalMyDsl.g:272:2: ( ( (lv_c_0_0= ruleEmphasisExpression ) ) | ( (lv_c_1_0= ruleQuoteExpression ) ) )
            {
            // InternalMyDsl.g:272:2: ( ( (lv_c_0_0= ruleEmphasisExpression ) ) | ( (lv_c_1_0= ruleQuoteExpression ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_INT)||(LA5_0>=20 && LA5_0<=26)) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:273:3: ( (lv_c_0_0= ruleEmphasisExpression ) )
                    {
                    // InternalMyDsl.g:273:3: ( (lv_c_0_0= ruleEmphasisExpression ) )
                    // InternalMyDsl.g:274:4: (lv_c_0_0= ruleEmphasisExpression )
                    {
                    // InternalMyDsl.g:274:4: (lv_c_0_0= ruleEmphasisExpression )
                    // InternalMyDsl.g:275:5: lv_c_0_0= ruleEmphasisExpression
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
                      					add(
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
                    // InternalMyDsl.g:293:3: ( (lv_c_1_0= ruleQuoteExpression ) )
                    {
                    // InternalMyDsl.g:293:3: ( (lv_c_1_0= ruleQuoteExpression ) )
                    // InternalMyDsl.g:294:4: (lv_c_1_0= ruleQuoteExpression )
                    {
                    // InternalMyDsl.g:294:4: (lv_c_1_0= ruleQuoteExpression )
                    // InternalMyDsl.g:295:5: lv_c_1_0= ruleQuoteExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTextExpressionAccess().getCQuoteExpressionParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_c_1_0=ruleQuoteExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTextExpressionRule());
                      					}
                      					add(
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
    // $ANTLR end "ruleTextExpression"


    // $ANTLR start "entryRuleQuoteExpression"
    // InternalMyDsl.g:316:1: entryRuleQuoteExpression returns [EObject current=null] : iv_ruleQuoteExpression= ruleQuoteExpression EOF ;
    public final EObject entryRuleQuoteExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuoteExpression = null;


        try {
            // InternalMyDsl.g:316:56: (iv_ruleQuoteExpression= ruleQuoteExpression EOF )
            // InternalMyDsl.g:317:2: iv_ruleQuoteExpression= ruleQuoteExpression EOF
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
    // InternalMyDsl.g:323:1: ruleQuoteExpression returns [EObject current=null] : ( () otherlv_1= '>' ( (lv_content_2_0= ruleTextExpression ) )+ ( ( RULE_BL )=>this_BL_3= RULE_BL )? ) ;
    public final EObject ruleQuoteExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BL_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:329:2: ( ( () otherlv_1= '>' ( (lv_content_2_0= ruleTextExpression ) )+ ( ( RULE_BL )=>this_BL_3= RULE_BL )? ) )
            // InternalMyDsl.g:330:2: ( () otherlv_1= '>' ( (lv_content_2_0= ruleTextExpression ) )+ ( ( RULE_BL )=>this_BL_3= RULE_BL )? )
            {
            // InternalMyDsl.g:330:2: ( () otherlv_1= '>' ( (lv_content_2_0= ruleTextExpression ) )+ ( ( RULE_BL )=>this_BL_3= RULE_BL )? )
            // InternalMyDsl.g:331:3: () otherlv_1= '>' ( (lv_content_2_0= ruleTextExpression ) )+ ( ( RULE_BL )=>this_BL_3= RULE_BL )?
            {
            // InternalMyDsl.g:331:3: ()
            // InternalMyDsl.g:332:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getQuoteExpressionAccess().getTextExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getQuoteExpressionAccess().getGreaterThanSignKeyword_1());
              		
            }
            // InternalMyDsl.g:342:3: ( (lv_content_2_0= ruleTextExpression ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:343:4: (lv_content_2_0= ruleTextExpression )
            	    {
            	    // InternalMyDsl.g:343:4: (lv_content_2_0= ruleTextExpression )
            	    // InternalMyDsl.g:344:5: lv_content_2_0= ruleTextExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getQuoteExpressionAccess().getContentTextExpressionParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
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
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            // InternalMyDsl.g:361:3: ( ( RULE_BL )=>this_BL_3= RULE_BL )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_BL) ) {
                int LA7_1 = input.LA(2);

                if ( (synpred6_InternalMyDsl()) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:362:4: ( RULE_BL )=>this_BL_3= RULE_BL
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


    // $ANTLR start "entryRuleHeaderExpression"
    // InternalMyDsl.g:372:1: entryRuleHeaderExpression returns [EObject current=null] : iv_ruleHeaderExpression= ruleHeaderExpression EOF ;
    public final EObject entryRuleHeaderExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderExpression = null;


        try {
            // InternalMyDsl.g:372:57: (iv_ruleHeaderExpression= ruleHeaderExpression EOF )
            // InternalMyDsl.g:373:2: iv_ruleHeaderExpression= ruleHeaderExpression EOF
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
    // InternalMyDsl.g:379:1: ruleHeaderExpression returns [EObject current=null] : (this_Header1Expression_0= ruleHeader1Expression | this_Header2Expression_1= ruleHeader2Expression | this_Header3Expression_2= ruleHeader3Expression | this_Header4Expression_3= ruleHeader4Expression | this_Header5Expression_4= ruleHeader5Expression | this_Header6Expression_5= ruleHeader6Expression ) ;
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
            // InternalMyDsl.g:385:2: ( (this_Header1Expression_0= ruleHeader1Expression | this_Header2Expression_1= ruleHeader2Expression | this_Header3Expression_2= ruleHeader3Expression | this_Header4Expression_3= ruleHeader4Expression | this_Header5Expression_4= ruleHeader5Expression | this_Header6Expression_5= ruleHeader6Expression ) )
            // InternalMyDsl.g:386:2: (this_Header1Expression_0= ruleHeader1Expression | this_Header2Expression_1= ruleHeader2Expression | this_Header3Expression_2= ruleHeader3Expression | this_Header4Expression_3= ruleHeader4Expression | this_Header5Expression_4= ruleHeader5Expression | this_Header6Expression_5= ruleHeader6Expression )
            {
            // InternalMyDsl.g:386:2: (this_Header1Expression_0= ruleHeader1Expression | this_Header2Expression_1= ruleHeader2Expression | this_Header3Expression_2= ruleHeader3Expression | this_Header4Expression_3= ruleHeader4Expression | this_Header5Expression_4= ruleHeader5Expression | this_Header6Expression_5= ruleHeader6Expression )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt8=1;
                }
                break;
            case 15:
                {
                alt8=2;
                }
                break;
            case 16:
                {
                alt8=3;
                }
                break;
            case 17:
                {
                alt8=4;
                }
                break;
            case 18:
                {
                alt8=5;
                }
                break;
            case 19:
                {
                alt8=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:387:3: this_Header1Expression_0= ruleHeader1Expression
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
                    // InternalMyDsl.g:396:3: this_Header2Expression_1= ruleHeader2Expression
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
                    // InternalMyDsl.g:405:3: this_Header3Expression_2= ruleHeader3Expression
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
                    // InternalMyDsl.g:414:3: this_Header4Expression_3= ruleHeader4Expression
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
                    // InternalMyDsl.g:423:3: this_Header5Expression_4= ruleHeader5Expression
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
                    // InternalMyDsl.g:432:3: this_Header6Expression_5= ruleHeader6Expression
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
    // InternalMyDsl.g:444:1: entryRuleHeader1Expression returns [EObject current=null] : iv_ruleHeader1Expression= ruleHeader1Expression EOF ;
    public final EObject entryRuleHeader1Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader1Expression = null;


        try {
            // InternalMyDsl.g:444:58: (iv_ruleHeader1Expression= ruleHeader1Expression EOF )
            // InternalMyDsl.g:445:2: iv_ruleHeader1Expression= ruleHeader1Expression EOF
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
    // InternalMyDsl.g:451:1: ruleHeader1Expression returns [EObject current=null] : ( () otherlv_1= '#' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader1Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:457:2: ( ( () otherlv_1= '#' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:458:2: ( () otherlv_1= '#' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:458:2: ( () otherlv_1= '#' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:459:3: () otherlv_1= '#' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:459:3: ()
            // InternalMyDsl.g:460:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader1ExpressionAccess().getHeader1ExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeader1ExpressionAccess().getNumberSignKeyword_1());
              		
            }
            // InternalMyDsl.g:470:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:471:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:471:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:472:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_7);
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

            // InternalMyDsl.g:489:3: ( ( '#' )=>otherlv_3= '#' )*
            loop9:
            do {
                int alt9=2;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:490:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader1ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalMyDsl.g:497:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_BL) ) {
                int LA10_1 = input.LA(2);

                if ( (synpred8_InternalMyDsl()) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:498:4: ( RULE_BL )=>this_BL_4= RULE_BL
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
    // InternalMyDsl.g:508:1: entryRuleHeader2Expression returns [EObject current=null] : iv_ruleHeader2Expression= ruleHeader2Expression EOF ;
    public final EObject entryRuleHeader2Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader2Expression = null;


        try {
            // InternalMyDsl.g:508:58: (iv_ruleHeader2Expression= ruleHeader2Expression EOF )
            // InternalMyDsl.g:509:2: iv_ruleHeader2Expression= ruleHeader2Expression EOF
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
    // InternalMyDsl.g:515:1: ruleHeader2Expression returns [EObject current=null] : ( () otherlv_1= '##' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader2Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:521:2: ( ( () otherlv_1= '##' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:522:2: ( () otherlv_1= '##' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:522:2: ( () otherlv_1= '##' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:523:3: () otherlv_1= '##' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:523:3: ()
            // InternalMyDsl.g:524:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader2ExpressionAccess().getHeader2ExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeader2ExpressionAccess().getNumberSignNumberSignKeyword_1());
              		
            }
            // InternalMyDsl.g:534:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:535:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:535:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:536:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader2ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_7);
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

            // InternalMyDsl.g:553:3: ( ( '#' )=>otherlv_3= '#' )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:554:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader2ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalMyDsl.g:561:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_BL) ) {
                int LA12_1 = input.LA(2);

                if ( (synpred10_InternalMyDsl()) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:562:4: ( RULE_BL )=>this_BL_4= RULE_BL
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
    // InternalMyDsl.g:572:1: entryRuleHeader3Expression returns [EObject current=null] : iv_ruleHeader3Expression= ruleHeader3Expression EOF ;
    public final EObject entryRuleHeader3Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader3Expression = null;


        try {
            // InternalMyDsl.g:572:58: (iv_ruleHeader3Expression= ruleHeader3Expression EOF )
            // InternalMyDsl.g:573:2: iv_ruleHeader3Expression= ruleHeader3Expression EOF
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
    // InternalMyDsl.g:579:1: ruleHeader3Expression returns [EObject current=null] : ( () otherlv_1= '###' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader3Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:585:2: ( ( () otherlv_1= '###' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:586:2: ( () otherlv_1= '###' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:586:2: ( () otherlv_1= '###' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:587:3: () otherlv_1= '###' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:587:3: ()
            // InternalMyDsl.g:588:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader3ExpressionAccess().getHeader3ExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeader3ExpressionAccess().getNumberSignNumberSignNumberSignKeyword_1());
              		
            }
            // InternalMyDsl.g:598:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:599:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:599:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:600:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader3ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_7);
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

            // InternalMyDsl.g:617:3: ( ( '#' )=>otherlv_3= '#' )*
            loop13:
            do {
                int alt13=2;
                alt13 = dfa13.predict(input);
                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:618:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader3ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalMyDsl.g:625:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_BL) ) {
                int LA14_1 = input.LA(2);

                if ( (synpred12_InternalMyDsl()) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:626:4: ( RULE_BL )=>this_BL_4= RULE_BL
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
    // InternalMyDsl.g:636:1: entryRuleHeader4Expression returns [EObject current=null] : iv_ruleHeader4Expression= ruleHeader4Expression EOF ;
    public final EObject entryRuleHeader4Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader4Expression = null;


        try {
            // InternalMyDsl.g:636:58: (iv_ruleHeader4Expression= ruleHeader4Expression EOF )
            // InternalMyDsl.g:637:2: iv_ruleHeader4Expression= ruleHeader4Expression EOF
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
    // InternalMyDsl.g:643:1: ruleHeader4Expression returns [EObject current=null] : ( () otherlv_1= '####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader4Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:649:2: ( ( () otherlv_1= '####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:650:2: ( () otherlv_1= '####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:650:2: ( () otherlv_1= '####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:651:3: () otherlv_1= '####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:651:3: ()
            // InternalMyDsl.g:652:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader4ExpressionAccess().getHeader4ExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeader4ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignKeyword_1());
              		
            }
            // InternalMyDsl.g:662:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:663:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:663:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:664:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader4ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_7);
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

            // InternalMyDsl.g:681:3: ( ( '#' )=>otherlv_3= '#' )*
            loop15:
            do {
                int alt15=2;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:682:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader4ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalMyDsl.g:689:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_BL) ) {
                int LA16_1 = input.LA(2);

                if ( (synpred14_InternalMyDsl()) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:690:4: ( RULE_BL )=>this_BL_4= RULE_BL
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
    // InternalMyDsl.g:700:1: entryRuleHeader5Expression returns [EObject current=null] : iv_ruleHeader5Expression= ruleHeader5Expression EOF ;
    public final EObject entryRuleHeader5Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader5Expression = null;


        try {
            // InternalMyDsl.g:700:58: (iv_ruleHeader5Expression= ruleHeader5Expression EOF )
            // InternalMyDsl.g:701:2: iv_ruleHeader5Expression= ruleHeader5Expression EOF
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
    // InternalMyDsl.g:707:1: ruleHeader5Expression returns [EObject current=null] : ( () otherlv_1= '#####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader5Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:713:2: ( ( () otherlv_1= '#####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:714:2: ( () otherlv_1= '#####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:714:2: ( () otherlv_1= '#####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:715:3: () otherlv_1= '#####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:715:3: ()
            // InternalMyDsl.g:716:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader5ExpressionAccess().getHeader5ExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeader5ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_1());
              		
            }
            // InternalMyDsl.g:726:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:727:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:727:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:728:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader5ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_7);
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

            // InternalMyDsl.g:745:3: ( ( '#' )=>otherlv_3= '#' )*
            loop17:
            do {
                int alt17=2;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:746:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader5ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalMyDsl.g:753:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_BL) ) {
                int LA18_1 = input.LA(2);

                if ( (synpred16_InternalMyDsl()) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:754:4: ( RULE_BL )=>this_BL_4= RULE_BL
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
    // InternalMyDsl.g:764:1: entryRuleHeader6Expression returns [EObject current=null] : iv_ruleHeader6Expression= ruleHeader6Expression EOF ;
    public final EObject entryRuleHeader6Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader6Expression = null;


        try {
            // InternalMyDsl.g:764:58: (iv_ruleHeader6Expression= ruleHeader6Expression EOF )
            // InternalMyDsl.g:765:2: iv_ruleHeader6Expression= ruleHeader6Expression EOF
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
    // InternalMyDsl.g:771:1: ruleHeader6Expression returns [EObject current=null] : ( () otherlv_1= '######' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader6Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:777:2: ( ( () otherlv_1= '######' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:778:2: ( () otherlv_1= '######' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:778:2: ( () otherlv_1= '######' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:779:3: () otherlv_1= '######' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:779:3: ()
            // InternalMyDsl.g:780:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader6ExpressionAccess().getHeader6ExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,19,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeader6ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_1());
              		
            }
            // InternalMyDsl.g:790:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:791:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:791:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:792:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader6ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_7);
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

            // InternalMyDsl.g:809:3: ( ( '#' )=>otherlv_3= '#' )*
            loop19:
            do {
                int alt19=2;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:810:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader6ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalMyDsl.g:817:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_BL) ) {
                int LA20_1 = input.LA(2);

                if ( (synpred18_InternalMyDsl()) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:818:4: ( RULE_BL )=>this_BL_4= RULE_BL
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
    // InternalMyDsl.g:828:1: entryRuleEmphasisExpression returns [EObject current=null] : iv_ruleEmphasisExpression= ruleEmphasisExpression EOF ;
    public final EObject entryRuleEmphasisExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmphasisExpression = null;


        try {
            // InternalMyDsl.g:828:59: (iv_ruleEmphasisExpression= ruleEmphasisExpression EOF )
            // InternalMyDsl.g:829:2: iv_ruleEmphasisExpression= ruleEmphasisExpression EOF
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
    // InternalMyDsl.g:835:1: ruleEmphasisExpression returns [EObject current=null] : ( ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) ) | ( (lv_c_3_0= ruleNaturalExpression ) ) )+ ;
    public final EObject ruleEmphasisExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_c_0_0 = null;

        EObject lv_c_1_0 = null;

        EObject lv_c_2_0 = null;

        EObject lv_c_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:841:2: ( ( ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) ) | ( (lv_c_3_0= ruleNaturalExpression ) ) )+ )
            // InternalMyDsl.g:842:2: ( ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) ) | ( (lv_c_3_0= ruleNaturalExpression ) ) )+
            {
            // InternalMyDsl.g:842:2: ( ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) ) | ( (lv_c_3_0= ruleNaturalExpression ) ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=3;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:843:3: ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) )
            	    {
            	    // InternalMyDsl.g:843:3: ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) )
            	    // InternalMyDsl.g:844:4: ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) )
            	    {
            	    // InternalMyDsl.g:868:4: ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) )
            	    int alt21=3;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==20) && (synpred21_InternalMyDsl())) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==21) ) {
            	        alt21=2;
            	    }
            	    else if ( (LA21_0==22) ) {
            	        alt21=3;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalMyDsl.g:869:5: ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) )
            	            {
            	            // InternalMyDsl.g:869:5: ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) )
            	            // InternalMyDsl.g:870:6: ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression )
            	            {
            	            // InternalMyDsl.g:874:6: (lv_c_0_0= ruleStrongExpression )
            	            // InternalMyDsl.g:875:7: lv_c_0_0= ruleStrongExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getCStrongExpressionParserRuleCall_0_0_0_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_8);
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
            	            // InternalMyDsl.g:893:5: ( (lv_c_1_0= ruleItalicExpression ) )
            	            {
            	            // InternalMyDsl.g:893:5: ( (lv_c_1_0= ruleItalicExpression ) )
            	            // InternalMyDsl.g:894:6: (lv_c_1_0= ruleItalicExpression )
            	            {
            	            // InternalMyDsl.g:894:6: (lv_c_1_0= ruleItalicExpression )
            	            // InternalMyDsl.g:895:7: lv_c_1_0= ruleItalicExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getCItalicExpressionParserRuleCall_0_0_1_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_8);
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
            	            // InternalMyDsl.g:913:5: ( (lv_c_2_0= ruleScratchExpression ) )
            	            {
            	            // InternalMyDsl.g:913:5: ( (lv_c_2_0= ruleScratchExpression ) )
            	            // InternalMyDsl.g:914:6: (lv_c_2_0= ruleScratchExpression )
            	            {
            	            // InternalMyDsl.g:914:6: (lv_c_2_0= ruleScratchExpression )
            	            // InternalMyDsl.g:915:7: lv_c_2_0= ruleScratchExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getCScratchExpressionParserRuleCall_0_0_2_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_8);
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
            	    // InternalMyDsl.g:935:3: ( (lv_c_3_0= ruleNaturalExpression ) )
            	    {
            	    // InternalMyDsl.g:935:3: ( (lv_c_3_0= ruleNaturalExpression ) )
            	    // InternalMyDsl.g:936:4: (lv_c_3_0= ruleNaturalExpression )
            	    {
            	    // InternalMyDsl.g:936:4: (lv_c_3_0= ruleNaturalExpression )
            	    // InternalMyDsl.g:937:5: lv_c_3_0= ruleNaturalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getCNaturalExpressionParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
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
            	    if ( cnt22 >= 1 ) break loop22;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
    // InternalMyDsl.g:958:1: entryRuleStrongExpression returns [EObject current=null] : iv_ruleStrongExpression= ruleStrongExpression EOF ;
    public final EObject entryRuleStrongExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrongExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:960:2: (iv_ruleStrongExpression= ruleStrongExpression EOF )
            // InternalMyDsl.g:961:2: iv_ruleStrongExpression= ruleStrongExpression EOF
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
    // InternalMyDsl.g:970:1: ruleStrongExpression returns [EObject current=null] : ( () otherlv_1= '**' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '**' ) ;
    public final EObject ruleStrongExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:977:2: ( ( () otherlv_1= '**' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '**' ) )
            // InternalMyDsl.g:978:2: ( () otherlv_1= '**' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '**' )
            {
            // InternalMyDsl.g:978:2: ( () otherlv_1= '**' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '**' )
            // InternalMyDsl.g:979:3: () otherlv_1= '**' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '**'
            {
            // InternalMyDsl.g:979:3: ()
            // InternalMyDsl.g:980:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStrongExpressionAccess().getStrongExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getStrongExpressionAccess().getAsteriskAsteriskKeyword_1());
              		
            }
            // InternalMyDsl.g:990:3: ( (lv_content_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:991:4: (lv_content_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:991:4: (lv_content_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:992:5: lv_content_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStrongExpressionAccess().getContentEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_9);
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

            otherlv_3=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:1020:1: entryRuleItalicExpression returns [EObject current=null] : iv_ruleItalicExpression= ruleItalicExpression EOF ;
    public final EObject entryRuleItalicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItalicExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:1022:2: (iv_ruleItalicExpression= ruleItalicExpression EOF )
            // InternalMyDsl.g:1023:2: iv_ruleItalicExpression= ruleItalicExpression EOF
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
    // InternalMyDsl.g:1032:1: ruleItalicExpression returns [EObject current=null] : ( () otherlv_1= '*' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '*' ) ;
    public final EObject ruleItalicExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:1039:2: ( ( () otherlv_1= '*' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '*' ) )
            // InternalMyDsl.g:1040:2: ( () otherlv_1= '*' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '*' )
            {
            // InternalMyDsl.g:1040:2: ( () otherlv_1= '*' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '*' )
            // InternalMyDsl.g:1041:3: () otherlv_1= '*' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '*'
            {
            // InternalMyDsl.g:1041:3: ()
            // InternalMyDsl.g:1042:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getItalicExpressionAccess().getItalicExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getItalicExpressionAccess().getAsteriskKeyword_1());
              		
            }
            // InternalMyDsl.g:1052:3: ( (lv_content_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1053:4: (lv_content_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1053:4: (lv_content_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1054:5: lv_content_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getItalicExpressionAccess().getContentEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_10);
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

            otherlv_3=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:1082:1: entryRuleScratchExpression returns [EObject current=null] : iv_ruleScratchExpression= ruleScratchExpression EOF ;
    public final EObject entryRuleScratchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScratchExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:1084:2: (iv_ruleScratchExpression= ruleScratchExpression EOF )
            // InternalMyDsl.g:1085:2: iv_ruleScratchExpression= ruleScratchExpression EOF
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
    // InternalMyDsl.g:1094:1: ruleScratchExpression returns [EObject current=null] : ( () otherlv_1= '~~' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '~~' ) ;
    public final EObject ruleScratchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:1101:2: ( ( () otherlv_1= '~~' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '~~' ) )
            // InternalMyDsl.g:1102:2: ( () otherlv_1= '~~' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '~~' )
            {
            // InternalMyDsl.g:1102:2: ( () otherlv_1= '~~' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '~~' )
            // InternalMyDsl.g:1103:3: () otherlv_1= '~~' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '~~'
            {
            // InternalMyDsl.g:1103:3: ()
            // InternalMyDsl.g:1104:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getScratchExpressionAccess().getScratchExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getScratchExpressionAccess().getTildeTildeKeyword_1());
              		
            }
            // InternalMyDsl.g:1114:3: ( (lv_content_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1115:4: (lv_content_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1115:4: (lv_content_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1116:5: lv_content_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getScratchExpressionAccess().getContentEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_11);
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

            otherlv_3=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:1144:1: entryRuleNaturalExpression returns [EObject current=null] : iv_ruleNaturalExpression= ruleNaturalExpression EOF ;
    public final EObject entryRuleNaturalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalExpression = null;


        try {
            // InternalMyDsl.g:1144:58: (iv_ruleNaturalExpression= ruleNaturalExpression EOF )
            // InternalMyDsl.g:1145:2: iv_ruleNaturalExpression= ruleNaturalExpression EOF
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
    // InternalMyDsl.g:1151:1: ruleNaturalExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleContent ) ) ) ;
    public final EObject ruleNaturalExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1157:2: ( ( () ( (lv_value_1_0= ruleContent ) ) ) )
            // InternalMyDsl.g:1158:2: ( () ( (lv_value_1_0= ruleContent ) ) )
            {
            // InternalMyDsl.g:1158:2: ( () ( (lv_value_1_0= ruleContent ) ) )
            // InternalMyDsl.g:1159:3: () ( (lv_value_1_0= ruleContent ) )
            {
            // InternalMyDsl.g:1159:3: ()
            // InternalMyDsl.g:1160:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNaturalExpressionAccess().getEmphasisExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:1166:3: ( (lv_value_1_0= ruleContent ) )
            // InternalMyDsl.g:1167:4: (lv_value_1_0= ruleContent )
            {
            // InternalMyDsl.g:1167:4: (lv_value_1_0= ruleContent )
            // InternalMyDsl.g:1168:5: lv_value_1_0= ruleContent
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
    // InternalMyDsl.g:1189:1: entryRuleContent returns [String current=null] : iv_ruleContent= ruleContent EOF ;
    public final String entryRuleContent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContent = null;


        try {
            // InternalMyDsl.g:1189:47: (iv_ruleContent= ruleContent EOF )
            // InternalMyDsl.g:1190:2: iv_ruleContent= ruleContent EOF
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
    // InternalMyDsl.g:1196:1: ruleContent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | kw= '\\'' | kw= '-' | kw= '|' | kw= '\"' ) ;
    public final AntlrDatatypeRuleToken ruleContent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;
        Token this_INT_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1202:2: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | kw= '\\'' | kw= '-' | kw= '|' | kw= '\"' ) )
            // InternalMyDsl.g:1203:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | kw= '\\'' | kw= '-' | kw= '|' | kw= '\"' )
            {
            // InternalMyDsl.g:1203:2: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT | kw= '\\'' | kw= '-' | kw= '|' | kw= '\"' )
            int alt23=7;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt23=1;
                }
                break;
            case RULE_STRING:
                {
                alt23=2;
                }
                break;
            case RULE_INT:
                {
                alt23=3;
                }
                break;
            case 23:
                {
                alt23=4;
                }
                break;
            case 24:
                {
                alt23=5;
                }
                break;
            case 25:
                {
                alt23=6;
                }
                break;
            case 26:
                {
                alt23=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1204:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_0, grammarAccess.getContentAccess().getIDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1212:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_1, grammarAccess.getContentAccess().getSTRINGTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1220:3: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_2, grammarAccess.getContentAccess().getINTTerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1228:3: kw= '\\''
                    {
                    kw=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getContentAccess().getApostropheKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1234:3: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getContentAccess().getHyphenMinusKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1240:3: kw= '|'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getContentAccess().getVerticalLineKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1246:3: kw= '\"'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getContentAccess().getQuotationMarkKeyword_6());
                      		
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
        // InternalMyDsl.g:127:6: ( ( ruleHeaderExpression ) )
        // InternalMyDsl.g:127:7: ( ruleHeaderExpression )
        {
        // InternalMyDsl.g:127:7: ( ruleHeaderExpression )
        // InternalMyDsl.g:128:7: ruleHeaderExpression
        {
        pushFollow(FOLLOW_2);
        ruleHeaderExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalMyDsl

    // $ANTLR start synpred2_InternalMyDsl
    public final void synpred2_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:143:7: ( RULE_BL )
        // InternalMyDsl.g:143:8: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalMyDsl

    // $ANTLR start synpred3_InternalMyDsl
    public final void synpred3_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:125:4: ( ( ( ( ( ruleHeaderExpression ) )=> ( ruleHeaderExpression ) ) | ( ( ( ruleTextExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) ) )
        // InternalMyDsl.g:125:5: ( ( ( ( ruleHeaderExpression ) )=> ( ruleHeaderExpression ) ) | ( ( ( ruleTextExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) )
        {
        // InternalMyDsl.g:125:5: ( ( ( ( ruleHeaderExpression ) )=> ( ruleHeaderExpression ) ) | ( ( ( ruleTextExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) )
        int alt25=2;
        int LA25_0 = input.LA(1);

        if ( (LA25_0==14) && (synpred1_InternalMyDsl())) {
            alt25=1;
        }
        else if ( (LA25_0==15) && (synpred1_InternalMyDsl())) {
            alt25=1;
        }
        else if ( (LA25_0==16) && (synpred1_InternalMyDsl())) {
            alt25=1;
        }
        else if ( (LA25_0==17) && (synpred1_InternalMyDsl())) {
            alt25=1;
        }
        else if ( (LA25_0==18) && (synpred1_InternalMyDsl())) {
            alt25=1;
        }
        else if ( (LA25_0==19) && (synpred1_InternalMyDsl())) {
            alt25=1;
        }
        else if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_INT)||LA25_0==13||(LA25_0>=20 && LA25_0<=26)) ) {
            alt25=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 25, 0, input);

            throw nvae;
        }
        switch (alt25) {
            case 1 :
                // InternalMyDsl.g:126:5: ( ( ( ruleHeaderExpression ) )=> ( ruleHeaderExpression ) )
                {
                // InternalMyDsl.g:126:5: ( ( ( ruleHeaderExpression ) )=> ( ruleHeaderExpression ) )
                // InternalMyDsl.g:127:6: ( ( ruleHeaderExpression ) )=> ( ruleHeaderExpression )
                {
                // InternalMyDsl.g:131:6: ( ruleHeaderExpression )
                // InternalMyDsl.g:132:7: ruleHeaderExpression
                {
                pushFollow(FOLLOW_2);
                ruleHeaderExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // InternalMyDsl.g:136:5: ( ( ( ruleTextExpression ) ) ( ( RULE_BL )=> RULE_BL )? )
                {
                // InternalMyDsl.g:136:5: ( ( ( ruleTextExpression ) ) ( ( RULE_BL )=> RULE_BL )? )
                // InternalMyDsl.g:137:6: ( ( ruleTextExpression ) ) ( ( RULE_BL )=> RULE_BL )?
                {
                // InternalMyDsl.g:137:6: ( ( ruleTextExpression ) )
                // InternalMyDsl.g:138:7: ( ruleTextExpression )
                {
                // InternalMyDsl.g:138:7: ( ruleTextExpression )
                // InternalMyDsl.g:139:8: ruleTextExpression
                {
                pushFollow(FOLLOW_4);
                ruleTextExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalMyDsl.g:142:6: ( ( RULE_BL )=> RULE_BL )?
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_BL) && (synpred2_InternalMyDsl())) {
                    alt24=1;
                }
                switch (alt24) {
                    case 1 :
                        // InternalMyDsl.g:143:7: ( RULE_BL )=> RULE_BL
                        {
                        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

                        }
                        break;

                }


                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred3_InternalMyDsl

    // $ANTLR start synpred4_InternalMyDsl
    public final void synpred4_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:151:6: ( ( ruleHeaderExpression ) )
        // InternalMyDsl.g:151:7: ( ruleHeaderExpression )
        {
        // InternalMyDsl.g:151:7: ( ruleHeaderExpression )
        // InternalMyDsl.g:152:7: ruleHeaderExpression
        {
        pushFollow(FOLLOW_2);
        ruleHeaderExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalMyDsl

    // $ANTLR start synpred5_InternalMyDsl
    public final void synpred5_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:195:7: ( RULE_BL )
        // InternalMyDsl.g:195:8: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalMyDsl

    // $ANTLR start synpred6_InternalMyDsl
    public final void synpred6_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:362:4: ( RULE_BL )
        // InternalMyDsl.g:362:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalMyDsl

    // $ANTLR start synpred7_InternalMyDsl
    public final void synpred7_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:490:4: ( '#' )
        // InternalMyDsl.g:490:5: '#'
        {
        match(input,14,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalMyDsl

    // $ANTLR start synpred8_InternalMyDsl
    public final void synpred8_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:498:4: ( RULE_BL )
        // InternalMyDsl.g:498:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalMyDsl

    // $ANTLR start synpred9_InternalMyDsl
    public final void synpred9_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:554:4: ( '#' )
        // InternalMyDsl.g:554:5: '#'
        {
        match(input,14,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalMyDsl

    // $ANTLR start synpred10_InternalMyDsl
    public final void synpred10_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:562:4: ( RULE_BL )
        // InternalMyDsl.g:562:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_InternalMyDsl

    // $ANTLR start synpred11_InternalMyDsl
    public final void synpred11_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:618:4: ( '#' )
        // InternalMyDsl.g:618:5: '#'
        {
        match(input,14,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_InternalMyDsl

    // $ANTLR start synpred12_InternalMyDsl
    public final void synpred12_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:626:4: ( RULE_BL )
        // InternalMyDsl.g:626:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalMyDsl

    // $ANTLR start synpred13_InternalMyDsl
    public final void synpred13_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:682:4: ( '#' )
        // InternalMyDsl.g:682:5: '#'
        {
        match(input,14,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalMyDsl

    // $ANTLR start synpred14_InternalMyDsl
    public final void synpred14_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:690:4: ( RULE_BL )
        // InternalMyDsl.g:690:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalMyDsl

    // $ANTLR start synpred15_InternalMyDsl
    public final void synpred15_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:746:4: ( '#' )
        // InternalMyDsl.g:746:5: '#'
        {
        match(input,14,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalMyDsl

    // $ANTLR start synpred16_InternalMyDsl
    public final void synpred16_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:754:4: ( RULE_BL )
        // InternalMyDsl.g:754:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalMyDsl

    // $ANTLR start synpred17_InternalMyDsl
    public final void synpred17_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:810:4: ( '#' )
        // InternalMyDsl.g:810:5: '#'
        {
        match(input,14,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_InternalMyDsl

    // $ANTLR start synpred18_InternalMyDsl
    public final void synpred18_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:818:4: ( RULE_BL )
        // InternalMyDsl.g:818:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalMyDsl

    // $ANTLR start synpred19_InternalMyDsl
    public final void synpred19_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:846:6: ( ( ruleStrongExpression ) )
        // InternalMyDsl.g:846:7: ( ruleStrongExpression )
        {
        // InternalMyDsl.g:846:7: ( ruleStrongExpression )
        // InternalMyDsl.g:847:7: ruleStrongExpression
        {
        pushFollow(FOLLOW_2);
        ruleStrongExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalMyDsl

    // $ANTLR start synpred20_InternalMyDsl
    public final void synpred20_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:844:4: ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )
        // InternalMyDsl.g:844:5: ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) )
        {
        // InternalMyDsl.g:844:5: ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) )
        int alt26=3;
        int LA26_0 = input.LA(1);

        if ( (LA26_0==20) && (synpred19_InternalMyDsl())) {
            alt26=1;
        }
        else if ( (LA26_0==21) ) {
            alt26=2;
        }
        else if ( (LA26_0==22) ) {
            alt26=3;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 26, 0, input);

            throw nvae;
        }
        switch (alt26) {
            case 1 :
                // InternalMyDsl.g:845:5: ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) )
                {
                // InternalMyDsl.g:845:5: ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) )
                // InternalMyDsl.g:846:6: ( ( ruleStrongExpression ) )=> ( ruleStrongExpression )
                {
                // InternalMyDsl.g:850:6: ( ruleStrongExpression )
                // InternalMyDsl.g:851:7: ruleStrongExpression
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
                // InternalMyDsl.g:855:5: ( ( ruleItalicExpression ) )
                {
                // InternalMyDsl.g:855:5: ( ( ruleItalicExpression ) )
                // InternalMyDsl.g:856:6: ( ruleItalicExpression )
                {
                // InternalMyDsl.g:856:6: ( ruleItalicExpression )
                // InternalMyDsl.g:857:7: ruleItalicExpression
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
                // InternalMyDsl.g:861:5: ( ( ruleScratchExpression ) )
                {
                // InternalMyDsl.g:861:5: ( ( ruleScratchExpression ) )
                // InternalMyDsl.g:862:6: ( ruleScratchExpression )
                {
                // InternalMyDsl.g:862:6: ( ruleScratchExpression )
                // InternalMyDsl.g:863:7: ruleScratchExpression
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
    // $ANTLR end synpred20_InternalMyDsl

    // $ANTLR start synpred21_InternalMyDsl
    public final void synpred21_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:870:6: ( ( ruleStrongExpression ) )
        // InternalMyDsl.g:870:7: ( ruleStrongExpression )
        {
        // InternalMyDsl.g:870:7: ( ruleStrongExpression )
        // InternalMyDsl.g:871:7: ruleStrongExpression
        {
        pushFollow(FOLLOW_2);
        ruleStrongExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalMyDsl

    // Delegated rules

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
    public final boolean synpred21_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalMyDsl_fragment(); // can never throw exception
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
    public final boolean synpred17_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalMyDsl_fragment(); // can never throw exception
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
    public final boolean synpred14_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalMyDsl_fragment(); // can never throw exception
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


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String dfa_1s = "\23\uffff";
    static final String dfa_2s = "\1\4\22\uffff";
    static final String dfa_3s = "\1\32\22\uffff";
    static final String dfa_4s = "\1\uffff\21\1\1\2";
    static final String dfa_5s = "\1\0\22\uffff}>";
    static final String[] dfa_6s = {
            "\1\22\1\12\1\13\1\14\5\uffff\1\21\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\15\1\16\1\17\1\20",
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "123:2: ( ( ( ( ( ( ( ruleHeaderExpression ) )=> ( ruleHeaderExpression ) ) | ( ( ( ruleTextExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) ) )=> ( ( ( ( ruleHeaderExpression ) )=> (lv_c_0_0= ruleHeaderExpression ) ) | ( ( (lv_c_1_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_2= RULE_BL )? ) ) ) | ( (lv_c_3_0= ruleBreakLineExpression ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_0 = input.LA(1);

                         
                        int index4_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA4_0==14) && (synpred3_InternalMyDsl())) {s = 1;}

                        else if ( (LA4_0==15) && (synpred3_InternalMyDsl())) {s = 2;}

                        else if ( (LA4_0==16) && (synpred3_InternalMyDsl())) {s = 3;}

                        else if ( (LA4_0==17) && (synpred3_InternalMyDsl())) {s = 4;}

                        else if ( (LA4_0==18) && (synpred3_InternalMyDsl())) {s = 5;}

                        else if ( (LA4_0==19) && (synpred3_InternalMyDsl())) {s = 6;}

                        else if ( (LA4_0==20) && (synpred3_InternalMyDsl())) {s = 7;}

                        else if ( (LA4_0==21) && (synpred3_InternalMyDsl())) {s = 8;}

                        else if ( (LA4_0==22) && (synpred3_InternalMyDsl())) {s = 9;}

                        else if ( (LA4_0==RULE_ID) && (synpred3_InternalMyDsl())) {s = 10;}

                        else if ( (LA4_0==RULE_STRING) && (synpred3_InternalMyDsl())) {s = 11;}

                        else if ( (LA4_0==RULE_INT) && (synpred3_InternalMyDsl())) {s = 12;}

                        else if ( (LA4_0==23) && (synpred3_InternalMyDsl())) {s = 13;}

                        else if ( (LA4_0==24) && (synpred3_InternalMyDsl())) {s = 14;}

                        else if ( (LA4_0==25) && (synpred3_InternalMyDsl())) {s = 15;}

                        else if ( (LA4_0==26) && (synpred3_InternalMyDsl())) {s = 16;}

                        else if ( (LA4_0==13) && (synpred3_InternalMyDsl())) {s = 17;}

                        else if ( (LA4_0==RULE_BL) ) {s = 18;}

                         
                        input.seek(index4_0);
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
    static final String dfa_7s = "\24\uffff";
    static final String dfa_8s = "\1\1\23\uffff";
    static final String dfa_9s = "\1\4\23\uffff";
    static final String dfa_10s = "\1\32\23\uffff";
    static final String dfa_11s = "\1\uffff\1\2\7\uffff\13\1";
    static final String dfa_12s = "\24\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\1\14\1\15\1\16\5\uffff\1\23\6\1\1\11\1\12\1\13\1\17\1\20\1\21\1\22",
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

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()+ loopback of 342:3: ( (lv_content_2_0= ruleTextExpression ) )+";
        }
    }
    static final String dfa_14s = "\25\uffff";
    static final String dfa_15s = "\1\1\24\uffff";
    static final String dfa_16s = "\1\4\2\uffff\1\0\21\uffff";
    static final String dfa_17s = "\1\32\2\uffff\1\0\21\uffff";
    static final String dfa_18s = "\1\uffff\1\2\22\uffff\1\1";
    static final String dfa_19s = "\3\uffff\1\0\21\uffff}>";
    static final String[] dfa_20s = {
            "\4\1\5\uffff\1\1\1\3\14\1",
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
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "()* loopback of 489:3: ( ( '#' )=>otherlv_3= '#' )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_3 = input.LA(1);

                         
                        int index9_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalMyDsl()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index9_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "()* loopback of 553:3: ( ( '#' )=>otherlv_3= '#' )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_3);
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

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "()* loopback of 617:3: ( ( '#' )=>otherlv_3= '#' )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_3 = input.LA(1);

                         
                        int index13_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalMyDsl()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index13_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "()* loopback of 681:3: ( ( '#' )=>otherlv_3= '#' )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_3 = input.LA(1);

                         
                        int index15_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalMyDsl()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }

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
            return "()* loopback of 745:3: ( ( '#' )=>otherlv_3= '#' )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_3 = input.LA(1);

                         
                        int index17_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalMyDsl()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "()* loopback of 809:3: ( ( '#' )=>otherlv_3= '#' )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_3 = input.LA(1);

                         
                        int index19_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalMyDsl()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_21s = "\1\4\10\uffff\3\0\11\uffff";
    static final String dfa_22s = "\1\32\10\uffff\3\0\11\uffff";
    static final String dfa_23s = "\1\uffff\1\3\12\uffff\7\2\1\uffff\1\1";
    static final String dfa_24s = "\11\uffff\1\0\1\1\1\2\11\uffff}>";
    static final String[] dfa_25s = {
            "\1\1\1\14\1\15\1\16\5\uffff\7\1\1\11\1\12\1\13\1\17\1\20\1\21\1\22",
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
            ""
    };
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "()+ loopback of 842:2: ( ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) ) | ( (lv_c_3_0= ruleNaturalExpression ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_9 = input.LA(1);

                         
                        int index22_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalMyDsl()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_10 = input.LA(1);

                         
                        int index22_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalMyDsl()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_11 = input.LA(1);

                         
                        int index22_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalMyDsl()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_11);
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
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000007FFE0F2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000007FFE0E0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000007F000E0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000007F000E2L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});

}