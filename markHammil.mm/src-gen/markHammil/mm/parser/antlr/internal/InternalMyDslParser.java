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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BL", "RULE_WS", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_DIGIT", "RULE_ANY_OTHER", "'*'", "'-'", "'+'", "'.'", "'>'", "'['", "']:'", "']('", "')'", "']['", "']'", "'!['", "'[!['", "')]('", "'|'", "'#'", "'##'", "'###'", "'####'", "'#####'", "'######'", "'**'", "'~~'", "'\\''", "'\"'"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
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

                if ( (LA1_0==RULE_BL||(LA1_0>=RULE_INT && LA1_0<=RULE_STRING)||(LA1_0>=13 && LA1_0<=15)||(LA1_0>=17 && LA1_0<=18)||(LA1_0>=24 && LA1_0<=25)||(LA1_0>=27 && LA1_0<=37)) ) {
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
    // InternalMyDsl.g:116:1: ruleExpression returns [EObject current=null] : ( ( ( ( ( ruleHeaderExpression ) )=> (lv_c_0_0= ruleHeaderExpression ) ) | ( (lv_c_1_0= ruleBreakLineExpression ) ) | ( (lv_c_2_0= ruleRefExpression ) ) | ( ( (lv_c_3_0= ruleListExpression ) ) ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ) | ( ( (lv_c_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token this_BL_4=null;
        Token this_BL_6=null;
        EObject lv_c_0_0 = null;

        EObject lv_c_1_0 = null;

        EObject lv_c_2_0 = null;

        EObject lv_c_3_0 = null;

        EObject lv_c_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:122:2: ( ( ( ( ( ( ruleHeaderExpression ) )=> (lv_c_0_0= ruleHeaderExpression ) ) | ( (lv_c_1_0= ruleBreakLineExpression ) ) | ( (lv_c_2_0= ruleRefExpression ) ) | ( ( (lv_c_3_0= ruleListExpression ) ) ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ) | ( ( (lv_c_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) ) )
            // InternalMyDsl.g:123:2: ( ( ( ( ( ruleHeaderExpression ) )=> (lv_c_0_0= ruleHeaderExpression ) ) | ( (lv_c_1_0= ruleBreakLineExpression ) ) | ( (lv_c_2_0= ruleRefExpression ) ) | ( ( (lv_c_3_0= ruleListExpression ) ) ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ) | ( ( (lv_c_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) )
            {
            // InternalMyDsl.g:123:2: ( ( ( ( ( ruleHeaderExpression ) )=> (lv_c_0_0= ruleHeaderExpression ) ) | ( (lv_c_1_0= ruleBreakLineExpression ) ) | ( (lv_c_2_0= ruleRefExpression ) ) | ( ( (lv_c_3_0= ruleListExpression ) ) ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ) | ( ( (lv_c_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:124:3: ( ( ( ( ruleHeaderExpression ) )=> (lv_c_0_0= ruleHeaderExpression ) ) | ( (lv_c_1_0= ruleBreakLineExpression ) ) | ( (lv_c_2_0= ruleRefExpression ) ) | ( ( (lv_c_3_0= ruleListExpression ) ) ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
                    {
                    // InternalMyDsl.g:124:3: ( ( ( ( ruleHeaderExpression ) )=> (lv_c_0_0= ruleHeaderExpression ) ) | ( (lv_c_1_0= ruleBreakLineExpression ) ) | ( (lv_c_2_0= ruleRefExpression ) ) | ( ( (lv_c_3_0= ruleListExpression ) ) ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
                    int alt3=4;
                    alt3 = dfa3.predict(input);
                    switch (alt3) {
                        case 1 :
                            // InternalMyDsl.g:125:4: ( ( ( ruleHeaderExpression ) )=> (lv_c_0_0= ruleHeaderExpression ) )
                            {
                            // InternalMyDsl.g:125:4: ( ( ( ruleHeaderExpression ) )=> (lv_c_0_0= ruleHeaderExpression ) )
                            // InternalMyDsl.g:126:5: ( ( ruleHeaderExpression ) )=> (lv_c_0_0= ruleHeaderExpression )
                            {
                            // InternalMyDsl.g:130:5: (lv_c_0_0= ruleHeaderExpression )
                            // InternalMyDsl.g:131:6: lv_c_0_0= ruleHeaderExpression
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getExpressionAccess().getCHeaderExpressionParserRuleCall_0_0_0());
                              					
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
                            // InternalMyDsl.g:149:4: ( (lv_c_1_0= ruleBreakLineExpression ) )
                            {
                            // InternalMyDsl.g:149:4: ( (lv_c_1_0= ruleBreakLineExpression ) )
                            // InternalMyDsl.g:150:5: (lv_c_1_0= ruleBreakLineExpression )
                            {
                            // InternalMyDsl.g:150:5: (lv_c_1_0= ruleBreakLineExpression )
                            // InternalMyDsl.g:151:6: lv_c_1_0= ruleBreakLineExpression
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getExpressionAccess().getCBreakLineExpressionParserRuleCall_0_1_0());
                              					
                            }
                            pushFollow(FOLLOW_2);
                            lv_c_1_0=ruleBreakLineExpression();

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
                              							"markHammil.mm.MyDsl.BreakLineExpression");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:169:4: ( (lv_c_2_0= ruleRefExpression ) )
                            {
                            // InternalMyDsl.g:169:4: ( (lv_c_2_0= ruleRefExpression ) )
                            // InternalMyDsl.g:170:5: (lv_c_2_0= ruleRefExpression )
                            {
                            // InternalMyDsl.g:170:5: (lv_c_2_0= ruleRefExpression )
                            // InternalMyDsl.g:171:6: lv_c_2_0= ruleRefExpression
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getExpressionAccess().getCRefExpressionParserRuleCall_0_2_0());
                              					
                            }
                            pushFollow(FOLLOW_2);
                            lv_c_2_0=ruleRefExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getExpressionRule());
                              						}
                              						set(
                              							current,
                              							"c",
                              							lv_c_2_0,
                              							"markHammil.mm.MyDsl.RefExpression");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }


                            }
                            break;
                        case 4 :
                            // InternalMyDsl.g:189:4: ( ( (lv_c_3_0= ruleListExpression ) ) ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
                            {
                            // InternalMyDsl.g:189:4: ( ( (lv_c_3_0= ruleListExpression ) ) ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
                            // InternalMyDsl.g:190:5: ( (lv_c_3_0= ruleListExpression ) ) ( ( RULE_BL )=>this_BL_4= RULE_BL )?
                            {
                            // InternalMyDsl.g:190:5: ( (lv_c_3_0= ruleListExpression ) )
                            // InternalMyDsl.g:191:6: (lv_c_3_0= ruleListExpression )
                            {
                            // InternalMyDsl.g:191:6: (lv_c_3_0= ruleListExpression )
                            // InternalMyDsl.g:192:7: lv_c_3_0= ruleListExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExpressionAccess().getCListExpressionParserRuleCall_0_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_4);
                            lv_c_3_0=ruleListExpression();

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
                              								"markHammil.mm.MyDsl.ListExpression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalMyDsl.g:209:5: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
                            int alt2=2;
                            int LA2_0 = input.LA(1);

                            if ( (LA2_0==RULE_BL) ) {
                                int LA2_1 = input.LA(2);

                                if ( (synpred2_InternalMyDsl()) ) {
                                    alt2=1;
                                }
                            }
                            switch (alt2) {
                                case 1 :
                                    // InternalMyDsl.g:210:6: ( RULE_BL )=>this_BL_4= RULE_BL
                                    {
                                    this_BL_4=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						newLeafNode(this_BL_4, grammarAccess.getExpressionAccess().getBLTerminalRuleCall_0_3_1());
                                      					
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
                    // InternalMyDsl.g:219:3: ( ( (lv_c_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )
                    {
                    // InternalMyDsl.g:219:3: ( ( (lv_c_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )
                    // InternalMyDsl.g:220:4: ( (lv_c_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )?
                    {
                    // InternalMyDsl.g:220:4: ( (lv_c_5_0= ruleTextExpression ) )
                    // InternalMyDsl.g:221:5: (lv_c_5_0= ruleTextExpression )
                    {
                    // InternalMyDsl.g:221:5: (lv_c_5_0= ruleTextExpression )
                    // InternalMyDsl.g:222:6: lv_c_5_0= ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getCTextExpressionParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_c_5_0=ruleTextExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionRule());
                      						}
                      						set(
                      							current,
                      							"c",
                      							lv_c_5_0,
                      							"markHammil.mm.MyDsl.TextExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMyDsl.g:239:4: ( ( RULE_BL )=>this_BL_6= RULE_BL )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_BL) ) {
                        int LA4_1 = input.LA(2);

                        if ( (synpred3_InternalMyDsl()) ) {
                            alt4=1;
                        }
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalMyDsl.g:240:5: ( RULE_BL )=>this_BL_6= RULE_BL
                            {
                            this_BL_6=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_BL_6, grammarAccess.getExpressionAccess().getBLTerminalRuleCall_1_1());
                              				
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
    // InternalMyDsl.g:251:1: entryRuleBreakLineExpression returns [EObject current=null] : iv_ruleBreakLineExpression= ruleBreakLineExpression EOF ;
    public final EObject entryRuleBreakLineExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakLineExpression = null;


        try {
            // InternalMyDsl.g:251:60: (iv_ruleBreakLineExpression= ruleBreakLineExpression EOF )
            // InternalMyDsl.g:252:2: iv_ruleBreakLineExpression= ruleBreakLineExpression EOF
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
    // InternalMyDsl.g:258:1: ruleBreakLineExpression returns [EObject current=null] : ( () this_BL_1= RULE_BL ) ;
    public final EObject ruleBreakLineExpression() throws RecognitionException {
        EObject current = null;

        Token this_BL_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:264:2: ( ( () this_BL_1= RULE_BL ) )
            // InternalMyDsl.g:265:2: ( () this_BL_1= RULE_BL )
            {
            // InternalMyDsl.g:265:2: ( () this_BL_1= RULE_BL )
            // InternalMyDsl.g:266:3: () this_BL_1= RULE_BL
            {
            // InternalMyDsl.g:266:3: ()
            // InternalMyDsl.g:267:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBreakLineExpressionAccess().getBreakLineExpressionAction_0(),
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
    // InternalMyDsl.g:281:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalMyDsl.g:283:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // InternalMyDsl.g:284:2: iv_ruleTextExpression= ruleTextExpression EOF
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
    // InternalMyDsl.g:293:1: ruleTextExpression returns [EObject current=null] : ( ( (lv_c_0_0= ruleEmphasisExpression ) ) | ( ( ( ( ( ruleQuoteExpression ) ) | ( ( ruleTabExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) ) )=> ( ( (lv_c_1_0= ruleQuoteExpression ) ) | ( (lv_c_2_0= ruleTabExpression ) ) | ( ( (lv_c_3_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_4_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_5_0= ruleVideoExpression ) ) ) ) ) ) ;
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
            // InternalMyDsl.g:300:2: ( ( ( (lv_c_0_0= ruleEmphasisExpression ) ) | ( ( ( ( ( ruleQuoteExpression ) ) | ( ( ruleTabExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) ) )=> ( ( (lv_c_1_0= ruleQuoteExpression ) ) | ( (lv_c_2_0= ruleTabExpression ) ) | ( ( (lv_c_3_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_4_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_5_0= ruleVideoExpression ) ) ) ) ) ) )
            // InternalMyDsl.g:301:2: ( ( (lv_c_0_0= ruleEmphasisExpression ) ) | ( ( ( ( ( ruleQuoteExpression ) ) | ( ( ruleTabExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) ) )=> ( ( (lv_c_1_0= ruleQuoteExpression ) ) | ( (lv_c_2_0= ruleTabExpression ) ) | ( ( (lv_c_3_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_4_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_5_0= ruleVideoExpression ) ) ) ) ) )
            {
            // InternalMyDsl.g:301:2: ( ( (lv_c_0_0= ruleEmphasisExpression ) ) | ( ( ( ( ( ruleQuoteExpression ) ) | ( ( ruleTabExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) ) )=> ( ( (lv_c_1_0= ruleQuoteExpression ) ) | ( (lv_c_2_0= ruleTabExpression ) ) | ( ( (lv_c_3_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_4_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_5_0= ruleVideoExpression ) ) ) ) ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:302:3: ( (lv_c_0_0= ruleEmphasisExpression ) )
                    {
                    // InternalMyDsl.g:302:3: ( (lv_c_0_0= ruleEmphasisExpression ) )
                    // InternalMyDsl.g:303:4: (lv_c_0_0= ruleEmphasisExpression )
                    {
                    // InternalMyDsl.g:303:4: (lv_c_0_0= ruleEmphasisExpression )
                    // InternalMyDsl.g:304:5: lv_c_0_0= ruleEmphasisExpression
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
                    // InternalMyDsl.g:322:3: ( ( ( ( ( ruleQuoteExpression ) ) | ( ( ruleTabExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) ) )=> ( ( (lv_c_1_0= ruleQuoteExpression ) ) | ( (lv_c_2_0= ruleTabExpression ) ) | ( ( (lv_c_3_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_4_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_5_0= ruleVideoExpression ) ) ) ) )
                    {
                    // InternalMyDsl.g:322:3: ( ( ( ( ( ruleQuoteExpression ) ) | ( ( ruleTabExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) ) )=> ( ( (lv_c_1_0= ruleQuoteExpression ) ) | ( (lv_c_2_0= ruleTabExpression ) ) | ( ( (lv_c_3_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_4_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_5_0= ruleVideoExpression ) ) ) ) )
                    // InternalMyDsl.g:323:4: ( ( ( ( ruleQuoteExpression ) ) | ( ( ruleTabExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) ) )=> ( ( (lv_c_1_0= ruleQuoteExpression ) ) | ( (lv_c_2_0= ruleTabExpression ) ) | ( ( (lv_c_3_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_4_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_5_0= ruleVideoExpression ) ) ) )
                    {
                    // InternalMyDsl.g:365:4: ( ( (lv_c_1_0= ruleQuoteExpression ) ) | ( (lv_c_2_0= ruleTabExpression ) ) | ( ( (lv_c_3_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_4_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_5_0= ruleVideoExpression ) ) ) )
                    int alt7=3;
                    switch ( input.LA(1) ) {
                    case 17:
                        {
                        alt7=1;
                        }
                        break;
                    case RULE_INT:
                    case RULE_ID:
                    case RULE_STRING:
                    case 14:
                    case 27:
                    case 36:
                    case 37:
                        {
                        alt7=2;
                        }
                        break;
                    case 18:
                    case 24:
                    case 25:
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
                            // InternalMyDsl.g:366:5: ( (lv_c_1_0= ruleQuoteExpression ) )
                            {
                            // InternalMyDsl.g:366:5: ( (lv_c_1_0= ruleQuoteExpression ) )
                            // InternalMyDsl.g:367:6: (lv_c_1_0= ruleQuoteExpression )
                            {
                            // InternalMyDsl.g:367:6: (lv_c_1_0= ruleQuoteExpression )
                            // InternalMyDsl.g:368:7: lv_c_1_0= ruleQuoteExpression
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
                            // InternalMyDsl.g:386:5: ( (lv_c_2_0= ruleTabExpression ) )
                            {
                            // InternalMyDsl.g:386:5: ( (lv_c_2_0= ruleTabExpression ) )
                            // InternalMyDsl.g:387:6: (lv_c_2_0= ruleTabExpression )
                            {
                            // InternalMyDsl.g:387:6: (lv_c_2_0= ruleTabExpression )
                            // InternalMyDsl.g:388:7: lv_c_2_0= ruleTabExpression
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
                            // InternalMyDsl.g:406:5: ( ( (lv_c_3_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_4_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_5_0= ruleVideoExpression ) ) )
                            {
                            // InternalMyDsl.g:406:5: ( ( (lv_c_3_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_4_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_5_0= ruleVideoExpression ) ) )
                            int alt6=3;
                            int LA6_0 = input.LA(1);

                            if ( (LA6_0==18) ) {
                                alt6=1;
                            }
                            else if ( (LA6_0==24) && (synpred7_InternalMyDsl())) {
                                alt6=2;
                            }
                            else if ( (LA6_0==25) && (synpred8_InternalMyDsl())) {
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
                                    // InternalMyDsl.g:407:6: ( (lv_c_3_0= ruleLinkExpression ) )
                                    {
                                    // InternalMyDsl.g:407:6: ( (lv_c_3_0= ruleLinkExpression ) )
                                    // InternalMyDsl.g:408:7: (lv_c_3_0= ruleLinkExpression )
                                    {
                                    // InternalMyDsl.g:408:7: (lv_c_3_0= ruleLinkExpression )
                                    // InternalMyDsl.g:409:8: lv_c_3_0= ruleLinkExpression
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
                                    // InternalMyDsl.g:427:6: ( ( ( ruleImageExpression ) )=> (lv_c_4_0= ruleImageExpression ) )
                                    {
                                    // InternalMyDsl.g:427:6: ( ( ( ruleImageExpression ) )=> (lv_c_4_0= ruleImageExpression ) )
                                    // InternalMyDsl.g:428:7: ( ( ruleImageExpression ) )=> (lv_c_4_0= ruleImageExpression )
                                    {
                                    // InternalMyDsl.g:432:7: (lv_c_4_0= ruleImageExpression )
                                    // InternalMyDsl.g:433:8: lv_c_4_0= ruleImageExpression
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
                                    // InternalMyDsl.g:451:6: ( ( ( ruleVideoExpression ) )=> (lv_c_5_0= ruleVideoExpression ) )
                                    {
                                    // InternalMyDsl.g:451:6: ( ( ( ruleVideoExpression ) )=> (lv_c_5_0= ruleVideoExpression ) )
                                    // InternalMyDsl.g:452:7: ( ( ruleVideoExpression ) )=> (lv_c_5_0= ruleVideoExpression )
                                    {
                                    // InternalMyDsl.g:456:7: (lv_c_5_0= ruleVideoExpression )
                                    // InternalMyDsl.g:457:8: lv_c_5_0= ruleVideoExpression
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
    // InternalMyDsl.g:484:1: entryRuleListExpression returns [EObject current=null] : iv_ruleListExpression= ruleListExpression EOF ;
    public final EObject entryRuleListExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:486:2: (iv_ruleListExpression= ruleListExpression EOF )
            // InternalMyDsl.g:487:2: iv_ruleListExpression= ruleListExpression EOF
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
    // InternalMyDsl.g:496:1: ruleListExpression returns [EObject current=null] : ( ( () ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )+ ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+ ) | (this_INT_7= RULE_INT otherlv_8= '.' (this_WS_9= RULE_WS )* ( (lv_contentOrdered_10_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_11= RULE_BL )? )+ ) ;
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
            // InternalMyDsl.g:503:2: ( ( ( () ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )+ ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+ ) | (this_INT_7= RULE_INT otherlv_8= '.' (this_WS_9= RULE_WS )* ( (lv_contentOrdered_10_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_11= RULE_BL )? )+ ) )
            // InternalMyDsl.g:504:2: ( ( () ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )+ ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+ ) | (this_INT_7= RULE_INT otherlv_8= '.' (this_WS_9= RULE_WS )* ( (lv_contentOrdered_10_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_11= RULE_BL )? )+ )
            {
            // InternalMyDsl.g:504:2: ( ( () ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )+ ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+ ) | (this_INT_7= RULE_INT otherlv_8= '.' (this_WS_9= RULE_WS )* ( (lv_contentOrdered_10_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_11= RULE_BL )? )+ )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=13 && LA16_0<=15)) ) {
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
                    // InternalMyDsl.g:505:3: ( () ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )+ ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+ )
                    {
                    // InternalMyDsl.g:505:3: ( () ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )+ ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+ )
                    // InternalMyDsl.g:506:4: () ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )+ ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+
                    {
                    // InternalMyDsl.g:506:4: ()
                    // InternalMyDsl.g:507:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getListExpressionAccess().getListExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMyDsl.g:513:4: ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )+ ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        switch ( input.LA(1) ) {
                        case 13:
                            {
                            alt12=1;
                            }
                            break;
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

                        }

                        switch (alt12) {
                    	case 1 :
                    	    // InternalMyDsl.g:514:5: (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )+ ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )?
                    	    {
                    	    // InternalMyDsl.g:514:5: (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' )
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
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 9, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt9) {
                    	        case 1 :
                    	            // InternalMyDsl.g:515:6: otherlv_1= '*'
                    	            {
                    	            otherlv_1=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_1, grammarAccess.getListExpressionAccess().getAsteriskKeyword_0_1_0_0());
                    	              					
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalMyDsl.g:520:6: otherlv_2= '-'
                    	            {
                    	            otherlv_2=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_2, grammarAccess.getListExpressionAccess().getHyphenMinusKeyword_0_1_0_1());
                    	              					
                    	            }

                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalMyDsl.g:525:6: otherlv_3= '+'
                    	            {
                    	            otherlv_3=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_3, grammarAccess.getListExpressionAccess().getPlusSignKeyword_0_1_0_2());
                    	              					
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // InternalMyDsl.g:530:5: (this_WS_4= RULE_WS )+
                    	    int cnt10=0;
                    	    loop10:
                    	    do {
                    	        int alt10=2;
                    	        int LA10_0 = input.LA(1);

                    	        if ( (LA10_0==RULE_WS) ) {
                    	            alt10=1;
                    	        }


                    	        switch (alt10) {
                    	    	case 1 :
                    	    	    // InternalMyDsl.g:531:6: this_WS_4= RULE_WS
                    	    	    {
                    	    	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_6); if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	      						newLeafNode(this_WS_4, grammarAccess.getListExpressionAccess().getWSTerminalRuleCall_0_1_1());
                    	    	      					
                    	    	    }

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt10 >= 1 ) break loop10;
                    	    	    if (state.backtracking>0) {state.failed=true; return current;}
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(10, input);
                    	                throw eee;
                    	        }
                    	        cnt10++;
                    	    } while (true);

                    	    // InternalMyDsl.g:536:5: ( (lv_contentUnordered_5_0= ruleTextExpression ) )
                    	    // InternalMyDsl.g:537:6: (lv_contentUnordered_5_0= ruleTextExpression )
                    	    {
                    	    // InternalMyDsl.g:537:6: (lv_contentUnordered_5_0= ruleTextExpression )
                    	    // InternalMyDsl.g:538:7: lv_contentUnordered_5_0= ruleTextExpression
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

                    	    // InternalMyDsl.g:555:5: ( ( RULE_BL )=>this_BL_6= RULE_BL )?
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
                    	            // InternalMyDsl.g:556:6: ( RULE_BL )=>this_BL_6= RULE_BL
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
                    // InternalMyDsl.g:565:3: (this_INT_7= RULE_INT otherlv_8= '.' (this_WS_9= RULE_WS )* ( (lv_contentOrdered_10_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_11= RULE_BL )? )+
                    {
                    // InternalMyDsl.g:565:3: (this_INT_7= RULE_INT otherlv_8= '.' (this_WS_9= RULE_WS )* ( (lv_contentOrdered_10_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_11= RULE_BL )? )+
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
                    	    // InternalMyDsl.g:566:4: this_INT_7= RULE_INT otherlv_8= '.' (this_WS_9= RULE_WS )* ( (lv_contentOrdered_10_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_11= RULE_BL )?
                    	    {
                    	    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				newLeafNode(this_INT_7, grammarAccess.getListExpressionAccess().getINTTerminalRuleCall_1_0());
                    	      			
                    	    }
                    	    otherlv_8=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				newLeafNode(otherlv_8, grammarAccess.getListExpressionAccess().getFullStopKeyword_1_1());
                    	      			
                    	    }
                    	    // InternalMyDsl.g:574:4: (this_WS_9= RULE_WS )*
                    	    loop13:
                    	    do {
                    	        int alt13=2;
                    	        int LA13_0 = input.LA(1);

                    	        if ( (LA13_0==RULE_WS) ) {
                    	            alt13=1;
                    	        }


                    	        switch (alt13) {
                    	    	case 1 :
                    	    	    // InternalMyDsl.g:575:5: this_WS_9= RULE_WS
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

                    	    // InternalMyDsl.g:580:4: ( (lv_contentOrdered_10_0= ruleTextExpression ) )
                    	    // InternalMyDsl.g:581:5: (lv_contentOrdered_10_0= ruleTextExpression )
                    	    {
                    	    // InternalMyDsl.g:581:5: (lv_contentOrdered_10_0= ruleTextExpression )
                    	    // InternalMyDsl.g:582:6: lv_contentOrdered_10_0= ruleTextExpression
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

                    	    // InternalMyDsl.g:599:4: ( ( RULE_BL )=>this_BL_11= RULE_BL )?
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
                    	            // InternalMyDsl.g:600:5: ( RULE_BL )=>this_BL_11= RULE_BL
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
    // InternalMyDsl.g:614:1: entryRuleQuoteExpression returns [EObject current=null] : iv_ruleQuoteExpression= ruleQuoteExpression EOF ;
    public final EObject entryRuleQuoteExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuoteExpression = null;


        try {
            // InternalMyDsl.g:614:56: (iv_ruleQuoteExpression= ruleQuoteExpression EOF )
            // InternalMyDsl.g:615:2: iv_ruleQuoteExpression= ruleQuoteExpression EOF
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
    // InternalMyDsl.g:621:1: ruleQuoteExpression returns [EObject current=null] : ( () ( ( '>' )=>otherlv_1= '>' ) ( (lv_content_2_0= ruleTextExpression ) )+ ( ( RULE_BL )=>this_BL_3= RULE_BL )? ) ;
    public final EObject ruleQuoteExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BL_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:627:2: ( ( () ( ( '>' )=>otherlv_1= '>' ) ( (lv_content_2_0= ruleTextExpression ) )+ ( ( RULE_BL )=>this_BL_3= RULE_BL )? ) )
            // InternalMyDsl.g:628:2: ( () ( ( '>' )=>otherlv_1= '>' ) ( (lv_content_2_0= ruleTextExpression ) )+ ( ( RULE_BL )=>this_BL_3= RULE_BL )? )
            {
            // InternalMyDsl.g:628:2: ( () ( ( '>' )=>otherlv_1= '>' ) ( (lv_content_2_0= ruleTextExpression ) )+ ( ( RULE_BL )=>this_BL_3= RULE_BL )? )
            // InternalMyDsl.g:629:3: () ( ( '>' )=>otherlv_1= '>' ) ( (lv_content_2_0= ruleTextExpression ) )+ ( ( RULE_BL )=>this_BL_3= RULE_BL )?
            {
            // InternalMyDsl.g:629:3: ()
            // InternalMyDsl.g:630:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getQuoteExpressionAccess().getTextExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:636:3: ( ( '>' )=>otherlv_1= '>' )
            // InternalMyDsl.g:637:4: ( '>' )=>otherlv_1= '>'
            {
            otherlv_1=(Token)match(input,17,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getQuoteExpressionAccess().getGreaterThanSignKeyword_1());
              			
            }

            }

            // InternalMyDsl.g:643:3: ( (lv_content_2_0= ruleTextExpression ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:644:4: (lv_content_2_0= ruleTextExpression )
            	    {
            	    // InternalMyDsl.g:644:4: (lv_content_2_0= ruleTextExpression )
            	    // InternalMyDsl.g:645:5: lv_content_2_0= ruleTextExpression
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
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            // InternalMyDsl.g:662:3: ( ( RULE_BL )=>this_BL_3= RULE_BL )?
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
                    // InternalMyDsl.g:663:4: ( RULE_BL )=>this_BL_3= RULE_BL
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


    // $ANTLR start "entryRuleRefExpression"
    // InternalMyDsl.g:673:1: entryRuleRefExpression returns [EObject current=null] : iv_ruleRefExpression= ruleRefExpression EOF ;
    public final EObject entryRuleRefExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefExpression = null;


        try {
            // InternalMyDsl.g:673:54: (iv_ruleRefExpression= ruleRefExpression EOF )
            // InternalMyDsl.g:674:2: iv_ruleRefExpression= ruleRefExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRefExpression=ruleRefExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRefExpression; 
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
    // $ANTLR end "entryRuleRefExpression"


    // $ANTLR start "ruleRefExpression"
    // InternalMyDsl.g:680:1: ruleRefExpression returns [EObject current=null] : ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_refName_2_0= ruleNaturalExpression ) ) ( ( ']:' )=>otherlv_3= ']:' ) ( (lv_refContent_4_0= ruleNaturalExpression ) )? ( ( RULE_BL )=>this_BL_5= RULE_BL )? ) ;
    public final EObject ruleRefExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_5=null;
        EObject lv_refName_2_0 = null;

        EObject lv_refContent_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:686:2: ( ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_refName_2_0= ruleNaturalExpression ) ) ( ( ']:' )=>otherlv_3= ']:' ) ( (lv_refContent_4_0= ruleNaturalExpression ) )? ( ( RULE_BL )=>this_BL_5= RULE_BL )? ) )
            // InternalMyDsl.g:687:2: ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_refName_2_0= ruleNaturalExpression ) ) ( ( ']:' )=>otherlv_3= ']:' ) ( (lv_refContent_4_0= ruleNaturalExpression ) )? ( ( RULE_BL )=>this_BL_5= RULE_BL )? )
            {
            // InternalMyDsl.g:687:2: ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_refName_2_0= ruleNaturalExpression ) ) ( ( ']:' )=>otherlv_3= ']:' ) ( (lv_refContent_4_0= ruleNaturalExpression ) )? ( ( RULE_BL )=>this_BL_5= RULE_BL )? )
            // InternalMyDsl.g:688:3: () ( ( '[' )=>otherlv_1= '[' ) ( (lv_refName_2_0= ruleNaturalExpression ) ) ( ( ']:' )=>otherlv_3= ']:' ) ( (lv_refContent_4_0= ruleNaturalExpression ) )? ( ( RULE_BL )=>this_BL_5= RULE_BL )?
            {
            // InternalMyDsl.g:688:3: ()
            // InternalMyDsl.g:689:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRefExpressionAccess().getRefExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:695:3: ( ( '[' )=>otherlv_1= '[' )
            // InternalMyDsl.g:696:4: ( '[' )=>otherlv_1= '['
            {
            otherlv_1=(Token)match(input,18,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getRefExpressionAccess().getLeftSquareBracketKeyword_1());
              			
            }

            }

            // InternalMyDsl.g:702:3: ( (lv_refName_2_0= ruleNaturalExpression ) )
            // InternalMyDsl.g:703:4: (lv_refName_2_0= ruleNaturalExpression )
            {
            // InternalMyDsl.g:703:4: (lv_refName_2_0= ruleNaturalExpression )
            // InternalMyDsl.g:704:5: lv_refName_2_0= ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRefExpressionAccess().getRefNameNaturalExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_refName_2_0=ruleNaturalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRefExpressionRule());
              					}
              					set(
              						current,
              						"refName",
              						lv_refName_2_0,
              						"markHammil.mm.MyDsl.NaturalExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMyDsl.g:721:3: ( ( ']:' )=>otherlv_3= ']:' )
            // InternalMyDsl.g:722:4: ( ']:' )=>otherlv_3= ']:'
            {
            otherlv_3=(Token)match(input,19,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getRefExpressionAccess().getRightSquareBracketColonKeyword_3());
              			
            }

            }

            // InternalMyDsl.g:728:3: ( (lv_refContent_4_0= ruleNaturalExpression ) )?
            int alt19=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt19=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt19=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt19=1;
                    }
                    break;
                case 36:
                    {
                    alt19=1;
                    }
                    break;
                case 14:
                    {
                    alt19=1;
                    }
                    break;
                case 27:
                    {
                    alt19=1;
                    }
                    break;
                case 37:
                    {
                    alt19=1;
                    }
                    break;
            }

            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:729:4: (lv_refContent_4_0= ruleNaturalExpression )
                    {
                    // InternalMyDsl.g:729:4: (lv_refContent_4_0= ruleNaturalExpression )
                    // InternalMyDsl.g:730:5: lv_refContent_4_0= ruleNaturalExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getRefExpressionAccess().getRefContentNaturalExpressionParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_4);
                    lv_refContent_4_0=ruleNaturalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getRefExpressionRule());
                      					}
                      					set(
                      						current,
                      						"refContent",
                      						lv_refContent_4_0,
                      						"markHammil.mm.MyDsl.NaturalExpression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:747:3: ( ( RULE_BL )=>this_BL_5= RULE_BL )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_BL) ) {
                int LA20_1 = input.LA(2);

                if ( (synpred15_InternalMyDsl()) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:748:4: ( RULE_BL )=>this_BL_5= RULE_BL
                    {
                    this_BL_5=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BL_5, grammarAccess.getRefExpressionAccess().getBLTerminalRuleCall_5());
                      			
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
    // $ANTLR end "ruleRefExpression"


    // $ANTLR start "entryRuleLinkExpression"
    // InternalMyDsl.g:758:1: entryRuleLinkExpression returns [EObject current=null] : iv_ruleLinkExpression= ruleLinkExpression EOF ;
    public final EObject entryRuleLinkExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkExpression = null;


        try {
            // InternalMyDsl.g:758:55: (iv_ruleLinkExpression= ruleLinkExpression EOF )
            // InternalMyDsl.g:759:2: iv_ruleLinkExpression= ruleLinkExpression EOF
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
    // InternalMyDsl.g:765:1: ruleLinkExpression returns [EObject current=null] : ( ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) | ( ( ( '[' )=>otherlv_7= '[' ) ( (lv_altText_8_0= ruleNaturalExpression ) ) ( ( '][' )=>otherlv_9= '][' ) ( (lv_refName_10_0= ruleNaturalExpression ) )? ( ( ']' )=>otherlv_11= ']' ) ( ( RULE_BL )=>this_BL_12= RULE_BL )? ) ) ;
    public final EObject ruleLinkExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_BL_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token this_BL_12=null;
        EObject lv_altText_2_0 = null;

        EObject lv_linkContent_4_0 = null;

        EObject lv_altText_8_0 = null;

        EObject lv_refName_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:771:2: ( ( ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) | ( ( ( '[' )=>otherlv_7= '[' ) ( (lv_altText_8_0= ruleNaturalExpression ) ) ( ( '][' )=>otherlv_9= '][' ) ( (lv_refName_10_0= ruleNaturalExpression ) )? ( ( ']' )=>otherlv_11= ']' ) ( ( RULE_BL )=>this_BL_12= RULE_BL )? ) ) )
            // InternalMyDsl.g:772:2: ( ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) | ( ( ( '[' )=>otherlv_7= '[' ) ( (lv_altText_8_0= ruleNaturalExpression ) ) ( ( '][' )=>otherlv_9= '][' ) ( (lv_refName_10_0= ruleNaturalExpression ) )? ( ( ']' )=>otherlv_11= ']' ) ( ( RULE_BL )=>this_BL_12= RULE_BL )? ) )
            {
            // InternalMyDsl.g:772:2: ( ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) | ( ( ( '[' )=>otherlv_7= '[' ) ( (lv_altText_8_0= ruleNaturalExpression ) ) ( ( '][' )=>otherlv_9= '][' ) ( (lv_refName_10_0= ruleNaturalExpression ) )? ( ( ']' )=>otherlv_11= ']' ) ( ( RULE_BL )=>this_BL_12= RULE_BL )? ) )
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:773:3: ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )
                    {
                    // InternalMyDsl.g:773:3: ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )
                    // InternalMyDsl.g:774:4: () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )?
                    {
                    // InternalMyDsl.g:774:4: ()
                    // InternalMyDsl.g:775:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getLinkExpressionAccess().getLinkExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMyDsl.g:781:4: ( ( '[' )=>otherlv_1= '[' )
                    // InternalMyDsl.g:782:5: ( '[' )=>otherlv_1= '['
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getLinkExpressionAccess().getLeftSquareBracketKeyword_0_1());
                      				
                    }

                    }

                    // InternalMyDsl.g:788:4: ( (lv_altText_2_0= ruleNaturalExpression ) )
                    // InternalMyDsl.g:789:5: (lv_altText_2_0= ruleNaturalExpression )
                    {
                    // InternalMyDsl.g:789:5: (lv_altText_2_0= ruleNaturalExpression )
                    // InternalMyDsl.g:790:6: lv_altText_2_0= ruleNaturalExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLinkExpressionAccess().getAltTextNaturalExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
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

                    // InternalMyDsl.g:807:4: ( ( '](' )=>otherlv_3= '](' )
                    // InternalMyDsl.g:808:5: ( '](' )=>otherlv_3= ']('
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getLinkExpressionAccess().getRightSquareBracketLeftParenthesisKeyword_0_3());
                      				
                    }

                    }

                    // InternalMyDsl.g:814:4: ( (lv_linkContent_4_0= ruleNaturalExpression ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=RULE_INT && LA21_0<=RULE_STRING)||LA21_0==14||LA21_0==27||(LA21_0>=36 && LA21_0<=37)) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalMyDsl.g:815:5: (lv_linkContent_4_0= ruleNaturalExpression )
                            {
                            // InternalMyDsl.g:815:5: (lv_linkContent_4_0= ruleNaturalExpression )
                            // InternalMyDsl.g:816:6: lv_linkContent_4_0= ruleNaturalExpression
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getLinkExpressionAccess().getLinkContentNaturalExpressionParserRuleCall_0_4_0());
                              					
                            }
                            pushFollow(FOLLOW_18);
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

                    // InternalMyDsl.g:833:4: ( ( ')' )=>otherlv_5= ')' )
                    // InternalMyDsl.g:834:5: ( ')' )=>otherlv_5= ')'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getLinkExpressionAccess().getRightParenthesisKeyword_0_5());
                      				
                    }

                    }

                    // InternalMyDsl.g:840:4: ( ( RULE_BL )=>this_BL_6= RULE_BL )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_BL) ) {
                        int LA22_1 = input.LA(2);

                        if ( (synpred19_InternalMyDsl()) ) {
                            alt22=1;
                        }
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalMyDsl.g:841:5: ( RULE_BL )=>this_BL_6= RULE_BL
                            {
                            this_BL_6=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_BL_6, grammarAccess.getLinkExpressionAccess().getBLTerminalRuleCall_0_6());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:849:3: ( ( ( '[' )=>otherlv_7= '[' ) ( (lv_altText_8_0= ruleNaturalExpression ) ) ( ( '][' )=>otherlv_9= '][' ) ( (lv_refName_10_0= ruleNaturalExpression ) )? ( ( ']' )=>otherlv_11= ']' ) ( ( RULE_BL )=>this_BL_12= RULE_BL )? )
                    {
                    // InternalMyDsl.g:849:3: ( ( ( '[' )=>otherlv_7= '[' ) ( (lv_altText_8_0= ruleNaturalExpression ) ) ( ( '][' )=>otherlv_9= '][' ) ( (lv_refName_10_0= ruleNaturalExpression ) )? ( ( ']' )=>otherlv_11= ']' ) ( ( RULE_BL )=>this_BL_12= RULE_BL )? )
                    // InternalMyDsl.g:850:4: ( ( '[' )=>otherlv_7= '[' ) ( (lv_altText_8_0= ruleNaturalExpression ) ) ( ( '][' )=>otherlv_9= '][' ) ( (lv_refName_10_0= ruleNaturalExpression ) )? ( ( ']' )=>otherlv_11= ']' ) ( ( RULE_BL )=>this_BL_12= RULE_BL )?
                    {
                    // InternalMyDsl.g:850:4: ( ( '[' )=>otherlv_7= '[' )
                    // InternalMyDsl.g:851:5: ( '[' )=>otherlv_7= '['
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getLinkExpressionAccess().getLeftSquareBracketKeyword_1_0());
                      				
                    }

                    }

                    // InternalMyDsl.g:857:4: ( (lv_altText_8_0= ruleNaturalExpression ) )
                    // InternalMyDsl.g:858:5: (lv_altText_8_0= ruleNaturalExpression )
                    {
                    // InternalMyDsl.g:858:5: (lv_altText_8_0= ruleNaturalExpression )
                    // InternalMyDsl.g:859:6: lv_altText_8_0= ruleNaturalExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLinkExpressionAccess().getAltTextNaturalExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_altText_8_0=ruleNaturalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLinkExpressionRule());
                      						}
                      						set(
                      							current,
                      							"altText",
                      							lv_altText_8_0,
                      							"markHammil.mm.MyDsl.NaturalExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMyDsl.g:876:4: ( ( '][' )=>otherlv_9= '][' )
                    // InternalMyDsl.g:877:5: ( '][' )=>otherlv_9= ']['
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getLinkExpressionAccess().getRightSquareBracketLeftSquareBracketKeyword_1_2());
                      				
                    }

                    }

                    // InternalMyDsl.g:883:4: ( (lv_refName_10_0= ruleNaturalExpression ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=RULE_INT && LA23_0<=RULE_STRING)||LA23_0==14||LA23_0==27||(LA23_0>=36 && LA23_0<=37)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalMyDsl.g:884:5: (lv_refName_10_0= ruleNaturalExpression )
                            {
                            // InternalMyDsl.g:884:5: (lv_refName_10_0= ruleNaturalExpression )
                            // InternalMyDsl.g:885:6: lv_refName_10_0= ruleNaturalExpression
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getLinkExpressionAccess().getRefNameNaturalExpressionParserRuleCall_1_3_0());
                              					
                            }
                            pushFollow(FOLLOW_21);
                            lv_refName_10_0=ruleNaturalExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getLinkExpressionRule());
                              						}
                              						set(
                              							current,
                              							"refName",
                              							lv_refName_10_0,
                              							"markHammil.mm.MyDsl.NaturalExpression");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalMyDsl.g:902:4: ( ( ']' )=>otherlv_11= ']' )
                    // InternalMyDsl.g:903:5: ( ']' )=>otherlv_11= ']'
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getLinkExpressionAccess().getRightSquareBracketKeyword_1_4());
                      				
                    }

                    }

                    // InternalMyDsl.g:909:4: ( ( RULE_BL )=>this_BL_12= RULE_BL )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_BL) ) {
                        int LA24_1 = input.LA(2);

                        if ( (synpred23_InternalMyDsl()) ) {
                            alt24=1;
                        }
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalMyDsl.g:910:5: ( RULE_BL )=>this_BL_12= RULE_BL
                            {
                            this_BL_12=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_BL_12, grammarAccess.getLinkExpressionAccess().getBLTerminalRuleCall_1_5());
                              				
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
    // $ANTLR end "ruleLinkExpression"


    // $ANTLR start "entryRuleImageExpression"
    // InternalMyDsl.g:921:1: entryRuleImageExpression returns [EObject current=null] : iv_ruleImageExpression= ruleImageExpression EOF ;
    public final EObject entryRuleImageExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageExpression = null;


        try {
            // InternalMyDsl.g:921:56: (iv_ruleImageExpression= ruleImageExpression EOF )
            // InternalMyDsl.g:922:2: iv_ruleImageExpression= ruleImageExpression EOF
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
    // InternalMyDsl.g:928:1: ruleImageExpression returns [EObject current=null] : ( () ( ( '![' )=>otherlv_1= '![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) ;
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
            // InternalMyDsl.g:934:2: ( ( () ( ( '![' )=>otherlv_1= '![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) )
            // InternalMyDsl.g:935:2: ( () ( ( '![' )=>otherlv_1= '![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )
            {
            // InternalMyDsl.g:935:2: ( () ( ( '![' )=>otherlv_1= '![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )
            // InternalMyDsl.g:936:3: () ( ( '![' )=>otherlv_1= '![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )?
            {
            // InternalMyDsl.g:936:3: ()
            // InternalMyDsl.g:937:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getImageExpressionAccess().getImageExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:943:3: ( ( '![' )=>otherlv_1= '![' )
            // InternalMyDsl.g:944:4: ( '![' )=>otherlv_1= '!['
            {
            otherlv_1=(Token)match(input,24,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getImageExpressionAccess().getExclamationMarkLeftSquareBracketKeyword_1());
              			
            }

            }

            // InternalMyDsl.g:950:3: ( (lv_altText_2_0= ruleNaturalExpression ) )
            // InternalMyDsl.g:951:4: (lv_altText_2_0= ruleNaturalExpression )
            {
            // InternalMyDsl.g:951:4: (lv_altText_2_0= ruleNaturalExpression )
            // InternalMyDsl.g:952:5: lv_altText_2_0= ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImageExpressionAccess().getAltTextNaturalExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_16);
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

            // InternalMyDsl.g:969:3: ( ( '](' )=>otherlv_3= '](' )
            // InternalMyDsl.g:970:4: ( '](' )=>otherlv_3= ']('
            {
            otherlv_3=(Token)match(input,20,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getImageExpressionAccess().getRightSquareBracketLeftParenthesisKeyword_3());
              			
            }

            }

            // InternalMyDsl.g:976:3: ( (lv_linkContent_4_0= ruleNaturalExpression ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_INT && LA26_0<=RULE_STRING)||LA26_0==14||LA26_0==27||(LA26_0>=36 && LA26_0<=37)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:977:4: (lv_linkContent_4_0= ruleNaturalExpression )
                    {
                    // InternalMyDsl.g:977:4: (lv_linkContent_4_0= ruleNaturalExpression )
                    // InternalMyDsl.g:978:5: lv_linkContent_4_0= ruleNaturalExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImageExpressionAccess().getLinkContentNaturalExpressionParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_18);
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

            // InternalMyDsl.g:995:3: ( ( ')' )=>otherlv_5= ')' )
            // InternalMyDsl.g:996:4: ( ')' )=>otherlv_5= ')'
            {
            otherlv_5=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getImageExpressionAccess().getRightParenthesisKeyword_5());
              			
            }

            }

            // InternalMyDsl.g:1002:3: ( ( RULE_BL )=>this_BL_6= RULE_BL )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_BL) ) {
                int LA27_1 = input.LA(2);

                if ( (synpred27_InternalMyDsl()) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1003:4: ( RULE_BL )=>this_BL_6= RULE_BL
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
    // InternalMyDsl.g:1013:1: entryRuleVideoExpression returns [EObject current=null] : iv_ruleVideoExpression= ruleVideoExpression EOF ;
    public final EObject entryRuleVideoExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoExpression = null;


        try {
            // InternalMyDsl.g:1013:56: (iv_ruleVideoExpression= ruleVideoExpression EOF )
            // InternalMyDsl.g:1014:2: iv_ruleVideoExpression= ruleVideoExpression EOF
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
    // InternalMyDsl.g:1020:1: ruleVideoExpression returns [EObject current=null] : ( () ( ( '[![' )=>otherlv_1= '[![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkImage_4_0= ruleNaturalExpression ) )? ( ( ')](' )=>otherlv_5= ')](' ) ( (lv_linkVideo_6_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_7= ')' ) ( ( RULE_BL )=>this_BL_8= RULE_BL )? ) ;
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
            // InternalMyDsl.g:1026:2: ( ( () ( ( '[![' )=>otherlv_1= '[![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkImage_4_0= ruleNaturalExpression ) )? ( ( ')](' )=>otherlv_5= ')](' ) ( (lv_linkVideo_6_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_7= ')' ) ( ( RULE_BL )=>this_BL_8= RULE_BL )? ) )
            // InternalMyDsl.g:1027:2: ( () ( ( '[![' )=>otherlv_1= '[![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkImage_4_0= ruleNaturalExpression ) )? ( ( ')](' )=>otherlv_5= ')](' ) ( (lv_linkVideo_6_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_7= ')' ) ( ( RULE_BL )=>this_BL_8= RULE_BL )? )
            {
            // InternalMyDsl.g:1027:2: ( () ( ( '[![' )=>otherlv_1= '[![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkImage_4_0= ruleNaturalExpression ) )? ( ( ')](' )=>otherlv_5= ')](' ) ( (lv_linkVideo_6_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_7= ')' ) ( ( RULE_BL )=>this_BL_8= RULE_BL )? )
            // InternalMyDsl.g:1028:3: () ( ( '[![' )=>otherlv_1= '[![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkImage_4_0= ruleNaturalExpression ) )? ( ( ')](' )=>otherlv_5= ')](' ) ( (lv_linkVideo_6_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_7= ')' ) ( ( RULE_BL )=>this_BL_8= RULE_BL )?
            {
            // InternalMyDsl.g:1028:3: ()
            // InternalMyDsl.g:1029:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVideoExpressionAccess().getVideoExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:1035:3: ( ( '[![' )=>otherlv_1= '[![' )
            // InternalMyDsl.g:1036:4: ( '[![' )=>otherlv_1= '[!['
            {
            otherlv_1=(Token)match(input,25,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getVideoExpressionAccess().getLeftSquareBracketExclamationMarkLeftSquareBracketKeyword_1());
              			
            }

            }

            // InternalMyDsl.g:1042:3: ( (lv_altText_2_0= ruleNaturalExpression ) )
            // InternalMyDsl.g:1043:4: (lv_altText_2_0= ruleNaturalExpression )
            {
            // InternalMyDsl.g:1043:4: (lv_altText_2_0= ruleNaturalExpression )
            // InternalMyDsl.g:1044:5: lv_altText_2_0= ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVideoExpressionAccess().getAltTextNaturalExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_16);
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

            // InternalMyDsl.g:1061:3: ( ( '](' )=>otherlv_3= '](' )
            // InternalMyDsl.g:1062:4: ( '](' )=>otherlv_3= ']('
            {
            otherlv_3=(Token)match(input,20,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getVideoExpressionAccess().getRightSquareBracketLeftParenthesisKeyword_3());
              			
            }

            }

            // InternalMyDsl.g:1068:3: ( (lv_linkImage_4_0= ruleNaturalExpression ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_INT && LA28_0<=RULE_STRING)||LA28_0==14||LA28_0==27||(LA28_0>=36 && LA28_0<=37)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:1069:4: (lv_linkImage_4_0= ruleNaturalExpression )
                    {
                    // InternalMyDsl.g:1069:4: (lv_linkImage_4_0= ruleNaturalExpression )
                    // InternalMyDsl.g:1070:5: lv_linkImage_4_0= ruleNaturalExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVideoExpressionAccess().getLinkImageNaturalExpressionParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_23);
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

            // InternalMyDsl.g:1087:3: ( ( ')](' )=>otherlv_5= ')](' )
            // InternalMyDsl.g:1088:4: ( ')](' )=>otherlv_5= ')]('
            {
            otherlv_5=(Token)match(input,26,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getVideoExpressionAccess().getRightParenthesisRightSquareBracketLeftParenthesisKeyword_5());
              			
            }

            }

            // InternalMyDsl.g:1094:3: ( (lv_linkVideo_6_0= ruleNaturalExpression ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_INT && LA29_0<=RULE_STRING)||LA29_0==14||LA29_0==27||(LA29_0>=36 && LA29_0<=37)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:1095:4: (lv_linkVideo_6_0= ruleNaturalExpression )
                    {
                    // InternalMyDsl.g:1095:4: (lv_linkVideo_6_0= ruleNaturalExpression )
                    // InternalMyDsl.g:1096:5: lv_linkVideo_6_0= ruleNaturalExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVideoExpressionAccess().getLinkVideoNaturalExpressionParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_18);
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

            // InternalMyDsl.g:1113:3: ( ( ')' )=>otherlv_7= ')' )
            // InternalMyDsl.g:1114:4: ( ')' )=>otherlv_7= ')'
            {
            otherlv_7=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_7, grammarAccess.getVideoExpressionAccess().getRightParenthesisKeyword_7());
              			
            }

            }

            // InternalMyDsl.g:1120:3: ( ( RULE_BL )=>this_BL_8= RULE_BL )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_BL) ) {
                int LA30_1 = input.LA(2);

                if ( (synpred32_InternalMyDsl()) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:1121:4: ( RULE_BL )=>this_BL_8= RULE_BL
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
    // InternalMyDsl.g:1131:1: entryRuleTabExpression returns [EObject current=null] : iv_ruleTabExpression= ruleTabExpression EOF ;
    public final EObject entryRuleTabExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabExpression = null;


        try {
            // InternalMyDsl.g:1131:54: (iv_ruleTabExpression= ruleTabExpression EOF )
            // InternalMyDsl.g:1132:2: iv_ruleTabExpression= ruleTabExpression EOF
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
    // InternalMyDsl.g:1138:1: ruleTabExpression returns [EObject current=null] : ( () ( ( ( ( ( '|' )=> ( ruleLineExpression ) ) RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )* ) )=> ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* ) ) ) ;
    public final EObject ruleTabExpression() throws RecognitionException {
        EObject current = null;

        Token this_BL_2=null;
        Token this_BL_4=null;
        EObject lv_header_1_0 = null;

        EObject lv_lines_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1144:2: ( ( () ( ( ( ( ( '|' )=> ( ruleLineExpression ) ) RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )* ) )=> ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* ) ) ) )
            // InternalMyDsl.g:1145:2: ( () ( ( ( ( ( '|' )=> ( ruleLineExpression ) ) RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )* ) )=> ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* ) ) )
            {
            // InternalMyDsl.g:1145:2: ( () ( ( ( ( ( '|' )=> ( ruleLineExpression ) ) RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )* ) )=> ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* ) ) )
            // InternalMyDsl.g:1146:3: () ( ( ( ( ( '|' )=> ( ruleLineExpression ) ) RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )* ) )=> ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* ) )
            {
            // InternalMyDsl.g:1146:3: ()
            // InternalMyDsl.g:1147:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTabExpressionAccess().getTabExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:1153:3: ( ( ( ( ( '|' )=> ( ruleLineExpression ) ) RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )* ) )=> ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* ) )
            // InternalMyDsl.g:1154:4: ( ( ( ( '|' )=> ( ruleLineExpression ) ) RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )* ) )=> ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* )
            {
            // InternalMyDsl.g:1192:4: ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* )
            // InternalMyDsl.g:1193:5: ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )*
            {
            // InternalMyDsl.g:1193:5: ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) )
            // InternalMyDsl.g:1194:6: ( '|' )=> (lv_header_1_0= ruleLineExpression )
            {
            // InternalMyDsl.g:1195:6: (lv_header_1_0= ruleLineExpression )
            // InternalMyDsl.g:1196:7: lv_header_1_0= ruleLineExpression
            {
            if ( state.backtracking==0 ) {

              							newCompositeNode(grammarAccess.getTabExpressionAccess().getHeaderLineExpressionParserRuleCall_1_0_0_0());
              						
            }
            pushFollow(FOLLOW_24);
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

            this_BL_2=(Token)match(input,RULE_BL,FOLLOW_25); if (state.failed) return current;
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
            // InternalMyDsl.g:1224:5: ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )*
            loop31:
            do {
                int alt31=2;
                alt31 = dfa31.predict(input);
                switch (alt31) {
            	case 1 :
            	    // InternalMyDsl.g:1225:6: ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) )
            	    {
            	    // InternalMyDsl.g:1238:6: (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) )
            	    // InternalMyDsl.g:1239:7: this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) )
            	    {
            	    this_BL_4=(Token)match(input,RULE_BL,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(this_BL_4, grammarAccess.getTabExpressionAccess().getBLTerminalRuleCall_1_0_3_0_0());
            	      						
            	    }
            	    // InternalMyDsl.g:1243:7: ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) )
            	    // InternalMyDsl.g:1244:8: ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression )
            	    {
            	    // InternalMyDsl.g:1248:8: (lv_lines_5_0= ruleLineExpression )
            	    // InternalMyDsl.g:1249:9: lv_lines_5_0= ruleLineExpression
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
            	    break loop31;
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
    // InternalMyDsl.g:1274:1: entryRuleTabSeparation returns [String current=null] : iv_ruleTabSeparation= ruleTabSeparation EOF ;
    public final String entryRuleTabSeparation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTabSeparation = null;


        try {
            // InternalMyDsl.g:1274:53: (iv_ruleTabSeparation= ruleTabSeparation EOF )
            // InternalMyDsl.g:1275:2: iv_ruleTabSeparation= ruleTabSeparation EOF
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
    // InternalMyDsl.g:1281:1: ruleTabSeparation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '|' )? kw= '-' (kw= '-' )+ (kw= '|' kw= '-' (kw= '-' )+ )+ (kw= '|' )? ) ;
    public final AntlrDatatypeRuleToken ruleTabSeparation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1287:2: ( ( (kw= '|' )? kw= '-' (kw= '-' )+ (kw= '|' kw= '-' (kw= '-' )+ )+ (kw= '|' )? ) )
            // InternalMyDsl.g:1288:2: ( (kw= '|' )? kw= '-' (kw= '-' )+ (kw= '|' kw= '-' (kw= '-' )+ )+ (kw= '|' )? )
            {
            // InternalMyDsl.g:1288:2: ( (kw= '|' )? kw= '-' (kw= '-' )+ (kw= '|' kw= '-' (kw= '-' )+ )+ (kw= '|' )? )
            // InternalMyDsl.g:1289:3: (kw= '|' )? kw= '-' (kw= '-' )+ (kw= '|' kw= '-' (kw= '-' )+ )+ (kw= '|' )?
            {
            // InternalMyDsl.g:1289:3: (kw= '|' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==27) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:1290:4: kw= '|'
                    {
                    kw=(Token)match(input,27,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTabSeparationAccess().getVerticalLineKeyword_0());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,14,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_1());
              		
            }
            // InternalMyDsl.g:1301:3: (kw= '-' )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==14) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMyDsl.g:1302:4: kw= '-'
            	    {
            	    kw=(Token)match(input,14,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);

            // InternalMyDsl.g:1308:3: (kw= '|' kw= '-' (kw= '-' )+ )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==27) ) {
                    int LA35_1 = input.LA(2);

                    if ( (LA35_1==14) ) {
                        int LA35_3 = input.LA(3);

                        if ( (LA35_3==14) ) {
                            alt35=1;
                        }


                    }


                }


                switch (alt35) {
            	case 1 :
            	    // InternalMyDsl.g:1309:4: kw= '|' kw= '-' (kw= '-' )+
            	    {
            	    kw=(Token)match(input,27,FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getTabSeparationAccess().getVerticalLineKeyword_3_0());
            	      			
            	    }
            	    kw=(Token)match(input,14,FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_3_1());
            	      			
            	    }
            	    // InternalMyDsl.g:1319:4: (kw= '-' )+
            	    int cnt34=0;
            	    loop34:
            	    do {
            	        int alt34=2;
            	        int LA34_0 = input.LA(1);

            	        if ( (LA34_0==14) ) {
            	            alt34=1;
            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:1320:5: kw= '-'
            	    	    {
            	    	    kw=(Token)match(input,14,FOLLOW_27); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					current.merge(kw);
            	    	      					newLeafNode(kw, grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_3_2());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt34 >= 1 ) break loop34;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(34, input);
            	                throw eee;
            	        }
            	        cnt34++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            // InternalMyDsl.g:1327:3: (kw= '|' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==27) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:1328:4: kw= '|'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:1338:1: entryRuleLineExpression returns [EObject current=null] : iv_ruleLineExpression= ruleLineExpression EOF ;
    public final EObject entryRuleLineExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineExpression = null;


        try {
            // InternalMyDsl.g:1338:55: (iv_ruleLineExpression= ruleLineExpression EOF )
            // InternalMyDsl.g:1339:2: iv_ruleLineExpression= ruleLineExpression EOF
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
    // InternalMyDsl.g:1345:1: ruleLineExpression returns [EObject current=null] : ( ( ( '|' )=>otherlv_0= '|' )? ( (lv_cells_1_0= ruleNaturalExpression ) ) ( ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) ) )* ( ( '|' )=>otherlv_4= '|' )? ) ;
    public final EObject ruleLineExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_cells_1_0 = null;

        EObject lv_cells_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1351:2: ( ( ( ( '|' )=>otherlv_0= '|' )? ( (lv_cells_1_0= ruleNaturalExpression ) ) ( ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) ) )* ( ( '|' )=>otherlv_4= '|' )? ) )
            // InternalMyDsl.g:1352:2: ( ( ( '|' )=>otherlv_0= '|' )? ( (lv_cells_1_0= ruleNaturalExpression ) ) ( ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) ) )* ( ( '|' )=>otherlv_4= '|' )? )
            {
            // InternalMyDsl.g:1352:2: ( ( ( '|' )=>otherlv_0= '|' )? ( (lv_cells_1_0= ruleNaturalExpression ) ) ( ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) ) )* ( ( '|' )=>otherlv_4= '|' )? )
            // InternalMyDsl.g:1353:3: ( ( '|' )=>otherlv_0= '|' )? ( (lv_cells_1_0= ruleNaturalExpression ) ) ( ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) ) )* ( ( '|' )=>otherlv_4= '|' )?
            {
            // InternalMyDsl.g:1353:3: ( ( '|' )=>otherlv_0= '|' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==27) ) {
                int LA37_1 = input.LA(2);

                if ( (synpred42_InternalMyDsl()) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:1354:4: ( '|' )=>otherlv_0= '|'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getLineExpressionAccess().getVerticalLineKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalMyDsl.g:1360:3: ( (lv_cells_1_0= ruleNaturalExpression ) )
            // InternalMyDsl.g:1361:4: (lv_cells_1_0= ruleNaturalExpression )
            {
            // InternalMyDsl.g:1361:4: (lv_cells_1_0= ruleNaturalExpression )
            // InternalMyDsl.g:1362:5: lv_cells_1_0= ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLineExpressionAccess().getCellsNaturalExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_28);
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

            // InternalMyDsl.g:1379:3: ( ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) ) )*
            loop38:
            do {
                int alt38=2;
                alt38 = dfa38.predict(input);
                switch (alt38) {
            	case 1 :
            	    // InternalMyDsl.g:1380:4: ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) )
            	    {
            	    // InternalMyDsl.g:1380:4: ( ( '|' )=>otherlv_2= '|' )
            	    // InternalMyDsl.g:1381:5: ( '|' )=>otherlv_2= '|'
            	    {
            	    otherlv_2=(Token)match(input,27,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getLineExpressionAccess().getVerticalLineKeyword_2_0());
            	      				
            	    }

            	    }

            	    // InternalMyDsl.g:1387:4: ( (lv_cells_3_0= ruleNaturalExpression ) )
            	    // InternalMyDsl.g:1388:5: (lv_cells_3_0= ruleNaturalExpression )
            	    {
            	    // InternalMyDsl.g:1388:5: (lv_cells_3_0= ruleNaturalExpression )
            	    // InternalMyDsl.g:1389:6: lv_cells_3_0= ruleNaturalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLineExpressionAccess().getCellsNaturalExpressionParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_28);
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
            	    break loop38;
                }
            } while (true);

            // InternalMyDsl.g:1407:3: ( ( '|' )=>otherlv_4= '|' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==27) ) {
                int LA39_1 = input.LA(2);

                if ( (synpred44_InternalMyDsl()) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:1408:4: ( '|' )=>otherlv_4= '|'
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:1418:1: entryRuleHeaderExpression returns [EObject current=null] : iv_ruleHeaderExpression= ruleHeaderExpression EOF ;
    public final EObject entryRuleHeaderExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderExpression = null;


        try {
            // InternalMyDsl.g:1418:57: (iv_ruleHeaderExpression= ruleHeaderExpression EOF )
            // InternalMyDsl.g:1419:2: iv_ruleHeaderExpression= ruleHeaderExpression EOF
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
    // InternalMyDsl.g:1425:1: ruleHeaderExpression returns [EObject current=null] : (this_Header1Expression_0= ruleHeader1Expression | this_Header2Expression_1= ruleHeader2Expression | this_Header3Expression_2= ruleHeader3Expression | this_Header4Expression_3= ruleHeader4Expression | this_Header5Expression_4= ruleHeader5Expression | this_Header6Expression_5= ruleHeader6Expression ) ;
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
            // InternalMyDsl.g:1431:2: ( (this_Header1Expression_0= ruleHeader1Expression | this_Header2Expression_1= ruleHeader2Expression | this_Header3Expression_2= ruleHeader3Expression | this_Header4Expression_3= ruleHeader4Expression | this_Header5Expression_4= ruleHeader5Expression | this_Header6Expression_5= ruleHeader6Expression ) )
            // InternalMyDsl.g:1432:2: (this_Header1Expression_0= ruleHeader1Expression | this_Header2Expression_1= ruleHeader2Expression | this_Header3Expression_2= ruleHeader3Expression | this_Header4Expression_3= ruleHeader4Expression | this_Header5Expression_4= ruleHeader5Expression | this_Header6Expression_5= ruleHeader6Expression )
            {
            // InternalMyDsl.g:1432:2: (this_Header1Expression_0= ruleHeader1Expression | this_Header2Expression_1= ruleHeader2Expression | this_Header3Expression_2= ruleHeader3Expression | this_Header4Expression_3= ruleHeader4Expression | this_Header5Expression_4= ruleHeader5Expression | this_Header6Expression_5= ruleHeader6Expression )
            int alt40=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt40=1;
                }
                break;
            case 29:
                {
                alt40=2;
                }
                break;
            case 30:
                {
                alt40=3;
                }
                break;
            case 31:
                {
                alt40=4;
                }
                break;
            case 32:
                {
                alt40=5;
                }
                break;
            case 33:
                {
                alt40=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:1433:3: this_Header1Expression_0= ruleHeader1Expression
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
                    // InternalMyDsl.g:1442:3: this_Header2Expression_1= ruleHeader2Expression
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
                    // InternalMyDsl.g:1451:3: this_Header3Expression_2= ruleHeader3Expression
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
                    // InternalMyDsl.g:1460:3: this_Header4Expression_3= ruleHeader4Expression
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
                    // InternalMyDsl.g:1469:3: this_Header5Expression_4= ruleHeader5Expression
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
                    // InternalMyDsl.g:1478:3: this_Header6Expression_5= ruleHeader6Expression
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
    // InternalMyDsl.g:1490:1: entryRuleHeader1Expression returns [EObject current=null] : iv_ruleHeader1Expression= ruleHeader1Expression EOF ;
    public final EObject entryRuleHeader1Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader1Expression = null;


        try {
            // InternalMyDsl.g:1490:58: (iv_ruleHeader1Expression= ruleHeader1Expression EOF )
            // InternalMyDsl.g:1491:2: iv_ruleHeader1Expression= ruleHeader1Expression EOF
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
    // InternalMyDsl.g:1497:1: ruleHeader1Expression returns [EObject current=null] : ( () otherlv_1= '#' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader1Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1503:2: ( ( () otherlv_1= '#' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:1504:2: ( () otherlv_1= '#' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:1504:2: ( () otherlv_1= '#' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:1505:3: () otherlv_1= '#' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:1505:3: ()
            // InternalMyDsl.g:1506:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader1ExpressionAccess().getHeader1ExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeader1ExpressionAccess().getNumberSignKeyword_1());
              		
            }
            // InternalMyDsl.g:1516:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1517:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1517:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1518:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_29);
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

            // InternalMyDsl.g:1535:3: ( ( '#' )=>otherlv_3= '#' )*
            loop41:
            do {
                int alt41=2;
                alt41 = dfa41.predict(input);
                switch (alt41) {
            	case 1 :
            	    // InternalMyDsl.g:1536:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,28,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader1ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            // InternalMyDsl.g:1543:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_BL) ) {
                int LA42_1 = input.LA(2);

                if ( (synpred46_InternalMyDsl()) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:1544:4: ( RULE_BL )=>this_BL_4= RULE_BL
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
    // InternalMyDsl.g:1554:1: entryRuleHeader2Expression returns [EObject current=null] : iv_ruleHeader2Expression= ruleHeader2Expression EOF ;
    public final EObject entryRuleHeader2Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader2Expression = null;


        try {
            // InternalMyDsl.g:1554:58: (iv_ruleHeader2Expression= ruleHeader2Expression EOF )
            // InternalMyDsl.g:1555:2: iv_ruleHeader2Expression= ruleHeader2Expression EOF
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
    // InternalMyDsl.g:1561:1: ruleHeader2Expression returns [EObject current=null] : ( () otherlv_1= '##' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader2Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1567:2: ( ( () otherlv_1= '##' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:1568:2: ( () otherlv_1= '##' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:1568:2: ( () otherlv_1= '##' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:1569:3: () otherlv_1= '##' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:1569:3: ()
            // InternalMyDsl.g:1570:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader2ExpressionAccess().getHeader2ExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeader2ExpressionAccess().getNumberSignNumberSignKeyword_1());
              		
            }
            // InternalMyDsl.g:1580:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1581:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1581:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1582:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader2ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_29);
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

            // InternalMyDsl.g:1599:3: ( ( '#' )=>otherlv_3= '#' )*
            loop43:
            do {
                int alt43=2;
                alt43 = dfa43.predict(input);
                switch (alt43) {
            	case 1 :
            	    // InternalMyDsl.g:1600:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,28,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader2ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            // InternalMyDsl.g:1607:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_BL) ) {
                int LA44_1 = input.LA(2);

                if ( (synpred48_InternalMyDsl()) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:1608:4: ( RULE_BL )=>this_BL_4= RULE_BL
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
    // InternalMyDsl.g:1618:1: entryRuleHeader3Expression returns [EObject current=null] : iv_ruleHeader3Expression= ruleHeader3Expression EOF ;
    public final EObject entryRuleHeader3Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader3Expression = null;


        try {
            // InternalMyDsl.g:1618:58: (iv_ruleHeader3Expression= ruleHeader3Expression EOF )
            // InternalMyDsl.g:1619:2: iv_ruleHeader3Expression= ruleHeader3Expression EOF
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
    // InternalMyDsl.g:1625:1: ruleHeader3Expression returns [EObject current=null] : ( () otherlv_1= '###' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader3Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1631:2: ( ( () otherlv_1= '###' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:1632:2: ( () otherlv_1= '###' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:1632:2: ( () otherlv_1= '###' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:1633:3: () otherlv_1= '###' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:1633:3: ()
            // InternalMyDsl.g:1634:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader3ExpressionAccess().getHeader3ExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeader3ExpressionAccess().getNumberSignNumberSignNumberSignKeyword_1());
              		
            }
            // InternalMyDsl.g:1644:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1645:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1645:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1646:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader3ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_29);
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

            // InternalMyDsl.g:1663:3: ( ( '#' )=>otherlv_3= '#' )*
            loop45:
            do {
                int alt45=2;
                alt45 = dfa45.predict(input);
                switch (alt45) {
            	case 1 :
            	    // InternalMyDsl.g:1664:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,28,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader3ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            // InternalMyDsl.g:1671:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_BL) ) {
                int LA46_1 = input.LA(2);

                if ( (synpred50_InternalMyDsl()) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:1672:4: ( RULE_BL )=>this_BL_4= RULE_BL
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
    // InternalMyDsl.g:1682:1: entryRuleHeader4Expression returns [EObject current=null] : iv_ruleHeader4Expression= ruleHeader4Expression EOF ;
    public final EObject entryRuleHeader4Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader4Expression = null;


        try {
            // InternalMyDsl.g:1682:58: (iv_ruleHeader4Expression= ruleHeader4Expression EOF )
            // InternalMyDsl.g:1683:2: iv_ruleHeader4Expression= ruleHeader4Expression EOF
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
    // InternalMyDsl.g:1689:1: ruleHeader4Expression returns [EObject current=null] : ( () otherlv_1= '####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader4Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1695:2: ( ( () otherlv_1= '####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:1696:2: ( () otherlv_1= '####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:1696:2: ( () otherlv_1= '####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:1697:3: () otherlv_1= '####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:1697:3: ()
            // InternalMyDsl.g:1698:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader4ExpressionAccess().getHeader4ExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeader4ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignKeyword_1());
              		
            }
            // InternalMyDsl.g:1708:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1709:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1709:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1710:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader4ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_29);
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

            // InternalMyDsl.g:1727:3: ( ( '#' )=>otherlv_3= '#' )*
            loop47:
            do {
                int alt47=2;
                alt47 = dfa47.predict(input);
                switch (alt47) {
            	case 1 :
            	    // InternalMyDsl.g:1728:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,28,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader4ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            // InternalMyDsl.g:1735:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_BL) ) {
                int LA48_1 = input.LA(2);

                if ( (synpred52_InternalMyDsl()) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:1736:4: ( RULE_BL )=>this_BL_4= RULE_BL
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
    // InternalMyDsl.g:1746:1: entryRuleHeader5Expression returns [EObject current=null] : iv_ruleHeader5Expression= ruleHeader5Expression EOF ;
    public final EObject entryRuleHeader5Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader5Expression = null;


        try {
            // InternalMyDsl.g:1746:58: (iv_ruleHeader5Expression= ruleHeader5Expression EOF )
            // InternalMyDsl.g:1747:2: iv_ruleHeader5Expression= ruleHeader5Expression EOF
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
    // InternalMyDsl.g:1753:1: ruleHeader5Expression returns [EObject current=null] : ( () otherlv_1= '#####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader5Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1759:2: ( ( () otherlv_1= '#####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:1760:2: ( () otherlv_1= '#####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:1760:2: ( () otherlv_1= '#####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:1761:3: () otherlv_1= '#####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:1761:3: ()
            // InternalMyDsl.g:1762:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader5ExpressionAccess().getHeader5ExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeader5ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_1());
              		
            }
            // InternalMyDsl.g:1772:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1773:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1773:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1774:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader5ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_29);
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

            // InternalMyDsl.g:1791:3: ( ( '#' )=>otherlv_3= '#' )*
            loop49:
            do {
                int alt49=2;
                alt49 = dfa49.predict(input);
                switch (alt49) {
            	case 1 :
            	    // InternalMyDsl.g:1792:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,28,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader5ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            // InternalMyDsl.g:1799:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_BL) ) {
                int LA50_1 = input.LA(2);

                if ( (synpred54_InternalMyDsl()) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // InternalMyDsl.g:1800:4: ( RULE_BL )=>this_BL_4= RULE_BL
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
    // InternalMyDsl.g:1810:1: entryRuleHeader6Expression returns [EObject current=null] : iv_ruleHeader6Expression= ruleHeader6Expression EOF ;
    public final EObject entryRuleHeader6Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader6Expression = null;


        try {
            // InternalMyDsl.g:1810:58: (iv_ruleHeader6Expression= ruleHeader6Expression EOF )
            // InternalMyDsl.g:1811:2: iv_ruleHeader6Expression= ruleHeader6Expression EOF
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
    // InternalMyDsl.g:1817:1: ruleHeader6Expression returns [EObject current=null] : ( () otherlv_1= '######' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader6Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1823:2: ( ( () otherlv_1= '######' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:1824:2: ( () otherlv_1= '######' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:1824:2: ( () otherlv_1= '######' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:1825:3: () otherlv_1= '######' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:1825:3: ()
            // InternalMyDsl.g:1826:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader6ExpressionAccess().getHeader6ExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeader6ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_1());
              		
            }
            // InternalMyDsl.g:1836:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1837:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1837:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1838:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader6ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_29);
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

            // InternalMyDsl.g:1855:3: ( ( '#' )=>otherlv_3= '#' )*
            loop51:
            do {
                int alt51=2;
                alt51 = dfa51.predict(input);
                switch (alt51) {
            	case 1 :
            	    // InternalMyDsl.g:1856:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,28,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader6ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            // InternalMyDsl.g:1863:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_BL) ) {
                int LA52_1 = input.LA(2);

                if ( (synpred56_InternalMyDsl()) ) {
                    alt52=1;
                }
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:1864:4: ( RULE_BL )=>this_BL_4= RULE_BL
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
    // InternalMyDsl.g:1874:1: entryRuleEmphasisExpression returns [EObject current=null] : iv_ruleEmphasisExpression= ruleEmphasisExpression EOF ;
    public final EObject entryRuleEmphasisExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmphasisExpression = null;


        try {
            // InternalMyDsl.g:1874:59: (iv_ruleEmphasisExpression= ruleEmphasisExpression EOF )
            // InternalMyDsl.g:1875:2: iv_ruleEmphasisExpression= ruleEmphasisExpression EOF
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
    // InternalMyDsl.g:1881:1: ruleEmphasisExpression returns [EObject current=null] : ( ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) ) | ( (lv_c_3_0= ruleNaturalExpression ) ) )+ ;
    public final EObject ruleEmphasisExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_c_0_0 = null;

        EObject lv_c_1_0 = null;

        EObject lv_c_2_0 = null;

        EObject lv_c_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1887:2: ( ( ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) ) | ( (lv_c_3_0= ruleNaturalExpression ) ) )+ )
            // InternalMyDsl.g:1888:2: ( ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) ) | ( (lv_c_3_0= ruleNaturalExpression ) ) )+
            {
            // InternalMyDsl.g:1888:2: ( ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) ) | ( (lv_c_3_0= ruleNaturalExpression ) ) )+
            int cnt54=0;
            loop54:
            do {
                int alt54=3;
                alt54 = dfa54.predict(input);
                switch (alt54) {
            	case 1 :
            	    // InternalMyDsl.g:1889:3: ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) )
            	    {
            	    // InternalMyDsl.g:1889:3: ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) )
            	    // InternalMyDsl.g:1890:4: ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) )
            	    {
            	    // InternalMyDsl.g:1914:4: ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) )
            	    int alt53=3;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==34) && (synpred59_InternalMyDsl())) {
            	        alt53=1;
            	    }
            	    else if ( (LA53_0==13) ) {
            	        alt53=2;
            	    }
            	    else if ( (LA53_0==35) ) {
            	        alt53=3;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 53, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // InternalMyDsl.g:1915:5: ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) )
            	            {
            	            // InternalMyDsl.g:1915:5: ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) )
            	            // InternalMyDsl.g:1916:6: ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression )
            	            {
            	            // InternalMyDsl.g:1920:6: (lv_c_0_0= ruleStrongExpression )
            	            // InternalMyDsl.g:1921:7: lv_c_0_0= ruleStrongExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getCStrongExpressionParserRuleCall_0_0_0_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_30);
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
            	            // InternalMyDsl.g:1939:5: ( (lv_c_1_0= ruleItalicExpression ) )
            	            {
            	            // InternalMyDsl.g:1939:5: ( (lv_c_1_0= ruleItalicExpression ) )
            	            // InternalMyDsl.g:1940:6: (lv_c_1_0= ruleItalicExpression )
            	            {
            	            // InternalMyDsl.g:1940:6: (lv_c_1_0= ruleItalicExpression )
            	            // InternalMyDsl.g:1941:7: lv_c_1_0= ruleItalicExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getCItalicExpressionParserRuleCall_0_0_1_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_30);
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
            	            // InternalMyDsl.g:1959:5: ( (lv_c_2_0= ruleScratchExpression ) )
            	            {
            	            // InternalMyDsl.g:1959:5: ( (lv_c_2_0= ruleScratchExpression ) )
            	            // InternalMyDsl.g:1960:6: (lv_c_2_0= ruleScratchExpression )
            	            {
            	            // InternalMyDsl.g:1960:6: (lv_c_2_0= ruleScratchExpression )
            	            // InternalMyDsl.g:1961:7: lv_c_2_0= ruleScratchExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getCScratchExpressionParserRuleCall_0_0_2_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_30);
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
            	    // InternalMyDsl.g:1981:3: ( (lv_c_3_0= ruleNaturalExpression ) )
            	    {
            	    // InternalMyDsl.g:1981:3: ( (lv_c_3_0= ruleNaturalExpression ) )
            	    // InternalMyDsl.g:1982:4: (lv_c_3_0= ruleNaturalExpression )
            	    {
            	    // InternalMyDsl.g:1982:4: (lv_c_3_0= ruleNaturalExpression )
            	    // InternalMyDsl.g:1983:5: lv_c_3_0= ruleNaturalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getCNaturalExpressionParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_30);
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
            	    if ( cnt54 >= 1 ) break loop54;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
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
    // InternalMyDsl.g:2004:1: entryRuleStrongExpression returns [EObject current=null] : iv_ruleStrongExpression= ruleStrongExpression EOF ;
    public final EObject entryRuleStrongExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrongExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:2006:2: (iv_ruleStrongExpression= ruleStrongExpression EOF )
            // InternalMyDsl.g:2007:2: iv_ruleStrongExpression= ruleStrongExpression EOF
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
    // InternalMyDsl.g:2016:1: ruleStrongExpression returns [EObject current=null] : ( () otherlv_1= '**' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '**' ) ;
    public final EObject ruleStrongExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:2023:2: ( ( () otherlv_1= '**' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '**' ) )
            // InternalMyDsl.g:2024:2: ( () otherlv_1= '**' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '**' )
            {
            // InternalMyDsl.g:2024:2: ( () otherlv_1= '**' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '**' )
            // InternalMyDsl.g:2025:3: () otherlv_1= '**' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '**'
            {
            // InternalMyDsl.g:2025:3: ()
            // InternalMyDsl.g:2026:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStrongExpressionAccess().getStrongExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getStrongExpressionAccess().getAsteriskAsteriskKeyword_1());
              		
            }
            // InternalMyDsl.g:2036:3: ( (lv_content_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:2037:4: (lv_content_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:2037:4: (lv_content_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:2038:5: lv_content_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStrongExpressionAccess().getContentEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_31);
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

            otherlv_3=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:2066:1: entryRuleItalicExpression returns [EObject current=null] : iv_ruleItalicExpression= ruleItalicExpression EOF ;
    public final EObject entryRuleItalicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItalicExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:2068:2: (iv_ruleItalicExpression= ruleItalicExpression EOF )
            // InternalMyDsl.g:2069:2: iv_ruleItalicExpression= ruleItalicExpression EOF
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
    // InternalMyDsl.g:2078:1: ruleItalicExpression returns [EObject current=null] : ( () otherlv_1= '*' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '*' ) ;
    public final EObject ruleItalicExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:2085:2: ( ( () otherlv_1= '*' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '*' ) )
            // InternalMyDsl.g:2086:2: ( () otherlv_1= '*' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '*' )
            {
            // InternalMyDsl.g:2086:2: ( () otherlv_1= '*' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '*' )
            // InternalMyDsl.g:2087:3: () otherlv_1= '*' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '*'
            {
            // InternalMyDsl.g:2087:3: ()
            // InternalMyDsl.g:2088:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getItalicExpressionAccess().getItalicExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getItalicExpressionAccess().getAsteriskKeyword_1());
              		
            }
            // InternalMyDsl.g:2098:3: ( (lv_content_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:2099:4: (lv_content_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:2099:4: (lv_content_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:2100:5: lv_content_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getItalicExpressionAccess().getContentEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_32);
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

            otherlv_3=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:2128:1: entryRuleScratchExpression returns [EObject current=null] : iv_ruleScratchExpression= ruleScratchExpression EOF ;
    public final EObject entryRuleScratchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScratchExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:2130:2: (iv_ruleScratchExpression= ruleScratchExpression EOF )
            // InternalMyDsl.g:2131:2: iv_ruleScratchExpression= ruleScratchExpression EOF
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
    // InternalMyDsl.g:2140:1: ruleScratchExpression returns [EObject current=null] : ( () otherlv_1= '~~' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '~~' ) ;
    public final EObject ruleScratchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:2147:2: ( ( () otherlv_1= '~~' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '~~' ) )
            // InternalMyDsl.g:2148:2: ( () otherlv_1= '~~' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '~~' )
            {
            // InternalMyDsl.g:2148:2: ( () otherlv_1= '~~' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '~~' )
            // InternalMyDsl.g:2149:3: () otherlv_1= '~~' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '~~'
            {
            // InternalMyDsl.g:2149:3: ()
            // InternalMyDsl.g:2150:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getScratchExpressionAccess().getScratchExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getScratchExpressionAccess().getTildeTildeKeyword_1());
              		
            }
            // InternalMyDsl.g:2160:3: ( (lv_content_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:2161:4: (lv_content_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:2161:4: (lv_content_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:2162:5: lv_content_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getScratchExpressionAccess().getContentEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_33);
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

            otherlv_3=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:2190:1: entryRuleNaturalExpression returns [EObject current=null] : iv_ruleNaturalExpression= ruleNaturalExpression EOF ;
    public final EObject entryRuleNaturalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalExpression = null;


        try {
            // InternalMyDsl.g:2190:58: (iv_ruleNaturalExpression= ruleNaturalExpression EOF )
            // InternalMyDsl.g:2191:2: iv_ruleNaturalExpression= ruleNaturalExpression EOF
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
    // InternalMyDsl.g:2197:1: ruleNaturalExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleContent ) ) ) ;
    public final EObject ruleNaturalExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2203:2: ( ( () ( (lv_value_1_0= ruleContent ) ) ) )
            // InternalMyDsl.g:2204:2: ( () ( (lv_value_1_0= ruleContent ) ) )
            {
            // InternalMyDsl.g:2204:2: ( () ( (lv_value_1_0= ruleContent ) ) )
            // InternalMyDsl.g:2205:3: () ( (lv_value_1_0= ruleContent ) )
            {
            // InternalMyDsl.g:2205:3: ()
            // InternalMyDsl.g:2206:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNaturalExpressionAccess().getNaturalExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:2212:3: ( (lv_value_1_0= ruleContent ) )
            // InternalMyDsl.g:2213:4: (lv_value_1_0= ruleContent )
            {
            // InternalMyDsl.g:2213:4: (lv_value_1_0= ruleContent )
            // InternalMyDsl.g:2214:5: lv_value_1_0= ruleContent
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
    // InternalMyDsl.g:2235:1: entryRuleContent returns [String current=null] : iv_ruleContent= ruleContent EOF ;
    public final String entryRuleContent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContent = null;


        try {
            // InternalMyDsl.g:2235:47: (iv_ruleContent= ruleContent EOF )
            // InternalMyDsl.g:2236:2: iv_ruleContent= ruleContent EOF
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
    // InternalMyDsl.g:2242:1: ruleContent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) ) | kw= '\\'' | kw= '-' | kw= '|' | kw= '\"' ) ;
    public final AntlrDatatypeRuleToken ruleContent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;
        Token this_INT_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2248:2: ( ( ( ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) ) | kw= '\\'' | kw= '-' | kw= '|' | kw= '\"' ) )
            // InternalMyDsl.g:2249:2: ( ( ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) ) | kw= '\\'' | kw= '-' | kw= '|' | kw= '\"' )
            {
            // InternalMyDsl.g:2249:2: ( ( ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) ) | kw= '\\'' | kw= '-' | kw= '|' | kw= '\"' )
            int alt56=5;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) && (synpred60_InternalMyDsl())) {
                alt56=1;
            }
            else if ( (LA56_0==RULE_STRING) && (synpred60_InternalMyDsl())) {
                alt56=1;
            }
            else if ( (LA56_0==RULE_INT) && (synpred60_InternalMyDsl())) {
                alt56=1;
            }
            else if ( (LA56_0==36) ) {
                alt56=2;
            }
            else if ( (LA56_0==14) ) {
                alt56=3;
            }
            else if ( (LA56_0==27) ) {
                alt56=4;
            }
            else if ( (LA56_0==37) ) {
                alt56=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalMyDsl.g:2250:3: ( ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) )
                    {
                    // InternalMyDsl.g:2250:3: ( ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) )
                    // InternalMyDsl.g:2251:4: ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT )
                    {
                    // InternalMyDsl.g:2259:4: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT )
                    int alt55=3;
                    switch ( input.LA(1) ) {
                    case RULE_ID:
                        {
                        alt55=1;
                        }
                        break;
                    case RULE_STRING:
                        {
                        alt55=2;
                        }
                        break;
                    case RULE_INT:
                        {
                        alt55=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }

                    switch (alt55) {
                        case 1 :
                            // InternalMyDsl.g:2260:5: this_ID_0= RULE_ID
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
                            // InternalMyDsl.g:2268:5: this_STRING_1= RULE_STRING
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
                            // InternalMyDsl.g:2276:5: this_INT_2= RULE_INT
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
                    // InternalMyDsl.g:2286:3: kw= '\\''
                    {
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getContentAccess().getApostropheKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2292:3: kw= '-'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getContentAccess().getHyphenMinusKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2298:3: kw= '|'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getContentAccess().getVerticalLineKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:2304:3: kw= '\"'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
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
        // InternalMyDsl.g:126:5: ( ( ruleHeaderExpression ) )
        // InternalMyDsl.g:126:6: ( ruleHeaderExpression )
        {
        // InternalMyDsl.g:126:6: ( ruleHeaderExpression )
        // InternalMyDsl.g:127:6: ruleHeaderExpression
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
        // InternalMyDsl.g:210:6: ( RULE_BL )
        // InternalMyDsl.g:210:7: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalMyDsl

    // $ANTLR start synpred3_InternalMyDsl
    public final void synpred3_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:240:5: ( RULE_BL )
        // InternalMyDsl.g:240:6: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalMyDsl

    // $ANTLR start synpred4_InternalMyDsl
    public final void synpred4_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:344:7: ( ( ruleImageExpression ) )
        // InternalMyDsl.g:344:8: ( ruleImageExpression )
        {
        // InternalMyDsl.g:344:8: ( ruleImageExpression )
        // InternalMyDsl.g:345:8: ruleImageExpression
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
        // InternalMyDsl.g:354:7: ( ( ruleVideoExpression ) )
        // InternalMyDsl.g:354:8: ( ruleVideoExpression )
        {
        // InternalMyDsl.g:354:8: ( ruleVideoExpression )
        // InternalMyDsl.g:355:8: ruleVideoExpression
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
        // InternalMyDsl.g:323:4: ( ( ( ( ruleQuoteExpression ) ) | ( ( ruleTabExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) ) )
        // InternalMyDsl.g:323:5: ( ( ( ruleQuoteExpression ) ) | ( ( ruleTabExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) )
        {
        // InternalMyDsl.g:323:5: ( ( ( ruleQuoteExpression ) ) | ( ( ruleTabExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) )
        int alt58=3;
        switch ( input.LA(1) ) {
        case 17:
            {
            alt58=1;
            }
            break;
        case RULE_INT:
        case RULE_ID:
        case RULE_STRING:
        case 14:
        case 27:
        case 36:
        case 37:
            {
            alt58=2;
            }
            break;
        case 18:
        case 24:
        case 25:
            {
            alt58=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 58, 0, input);

            throw nvae;
        }

        switch (alt58) {
            case 1 :
                // InternalMyDsl.g:324:5: ( ( ruleQuoteExpression ) )
                {
                // InternalMyDsl.g:324:5: ( ( ruleQuoteExpression ) )
                // InternalMyDsl.g:325:6: ( ruleQuoteExpression )
                {
                // InternalMyDsl.g:325:6: ( ruleQuoteExpression )
                // InternalMyDsl.g:326:7: ruleQuoteExpression
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
                // InternalMyDsl.g:330:5: ( ( ruleTabExpression ) )
                {
                // InternalMyDsl.g:330:5: ( ( ruleTabExpression ) )
                // InternalMyDsl.g:331:6: ( ruleTabExpression )
                {
                // InternalMyDsl.g:331:6: ( ruleTabExpression )
                // InternalMyDsl.g:332:7: ruleTabExpression
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
                // InternalMyDsl.g:336:5: ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) )
                {
                // InternalMyDsl.g:336:5: ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) )
                int alt57=3;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==18) ) {
                    alt57=1;
                }
                else if ( (LA57_0==24) && (synpred4_InternalMyDsl())) {
                    alt57=2;
                }
                else if ( (LA57_0==25) && (synpred5_InternalMyDsl())) {
                    alt57=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 0, input);

                    throw nvae;
                }
                switch (alt57) {
                    case 1 :
                        // InternalMyDsl.g:337:6: ( ( ruleLinkExpression ) )
                        {
                        // InternalMyDsl.g:337:6: ( ( ruleLinkExpression ) )
                        // InternalMyDsl.g:338:7: ( ruleLinkExpression )
                        {
                        // InternalMyDsl.g:338:7: ( ruleLinkExpression )
                        // InternalMyDsl.g:339:8: ruleLinkExpression
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
                        // InternalMyDsl.g:343:6: ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) )
                        {
                        // InternalMyDsl.g:343:6: ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) )
                        // InternalMyDsl.g:344:7: ( ( ruleImageExpression ) )=> ( ruleImageExpression )
                        {
                        // InternalMyDsl.g:348:7: ( ruleImageExpression )
                        // InternalMyDsl.g:349:8: ruleImageExpression
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
                        // InternalMyDsl.g:353:6: ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) )
                        {
                        // InternalMyDsl.g:353:6: ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) )
                        // InternalMyDsl.g:354:7: ( ( ruleVideoExpression ) )=> ( ruleVideoExpression )
                        {
                        // InternalMyDsl.g:358:7: ( ruleVideoExpression )
                        // InternalMyDsl.g:359:8: ruleVideoExpression
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
        // InternalMyDsl.g:428:7: ( ( ruleImageExpression ) )
        // InternalMyDsl.g:428:8: ( ruleImageExpression )
        {
        // InternalMyDsl.g:428:8: ( ruleImageExpression )
        // InternalMyDsl.g:429:8: ruleImageExpression
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
        // InternalMyDsl.g:452:7: ( ( ruleVideoExpression ) )
        // InternalMyDsl.g:452:8: ( ruleVideoExpression )
        {
        // InternalMyDsl.g:452:8: ( ruleVideoExpression )
        // InternalMyDsl.g:453:8: ruleVideoExpression
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
        // InternalMyDsl.g:556:6: ( RULE_BL )
        // InternalMyDsl.g:556:7: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalMyDsl

    // $ANTLR start synpred10_InternalMyDsl
    public final void synpred10_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:600:5: ( RULE_BL )
        // InternalMyDsl.g:600:6: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_InternalMyDsl

    // $ANTLR start synpred12_InternalMyDsl
    public final void synpred12_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:663:4: ( RULE_BL )
        // InternalMyDsl.g:663:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalMyDsl

    // $ANTLR start synpred15_InternalMyDsl
    public final void synpred15_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:748:4: ( RULE_BL )
        // InternalMyDsl.g:748:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalMyDsl

    // $ANTLR start synpred18_InternalMyDsl
    public final void synpred18_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:834:5: ( ')' )
        // InternalMyDsl.g:834:6: ')'
        {
        match(input,21,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalMyDsl

    // $ANTLR start synpred19_InternalMyDsl
    public final void synpred19_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:841:5: ( RULE_BL )
        // InternalMyDsl.g:841:6: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_InternalMyDsl

    // $ANTLR start synpred20_InternalMyDsl
    public final void synpred20_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:851:5: ( '[' )
        // InternalMyDsl.g:851:6: '['
        {
        match(input,18,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_InternalMyDsl

    // $ANTLR start synpred22_InternalMyDsl
    public final void synpred22_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:903:5: ( ']' )
        // InternalMyDsl.g:903:6: ']'
        {
        match(input,23,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalMyDsl

    // $ANTLR start synpred23_InternalMyDsl
    public final void synpred23_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:910:5: ( RULE_BL )
        // InternalMyDsl.g:910:6: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalMyDsl

    // $ANTLR start synpred26_InternalMyDsl
    public final void synpred26_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:996:4: ( ')' )
        // InternalMyDsl.g:996:5: ')'
        {
        match(input,21,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalMyDsl

    // $ANTLR start synpred27_InternalMyDsl
    public final void synpred27_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1003:4: ( RULE_BL )
        // InternalMyDsl.g:1003:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalMyDsl

    // $ANTLR start synpred30_InternalMyDsl
    public final void synpred30_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1088:4: ( ')](' )
        // InternalMyDsl.g:1088:5: ')]('
        {
        match(input,26,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalMyDsl

    // $ANTLR start synpred31_InternalMyDsl
    public final void synpred31_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1114:4: ( ')' )
        // InternalMyDsl.g:1114:5: ')'
        {
        match(input,21,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalMyDsl

    // $ANTLR start synpred32_InternalMyDsl
    public final void synpred32_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1121:4: ( RULE_BL )
        // InternalMyDsl.g:1121:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalMyDsl

    // $ANTLR start synpred40_InternalMyDsl
    public final void synpred40_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1225:6: ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )
        // InternalMyDsl.g:1225:7: ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) )
        {
        // InternalMyDsl.g:1225:7: ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) )
        // InternalMyDsl.g:1226:7: RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) )
        {
        match(input,RULE_BL,FOLLOW_13); if (state.failed) return ;
        // InternalMyDsl.g:1227:7: ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) )
        // InternalMyDsl.g:1228:8: ( ( ruleLineExpression ) )=> ( ruleLineExpression )
        {
        // InternalMyDsl.g:1232:8: ( ruleLineExpression )
        // InternalMyDsl.g:1233:9: ruleLineExpression
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
    // $ANTLR end synpred40_InternalMyDsl

    // $ANTLR start synpred42_InternalMyDsl
    public final void synpred42_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1354:4: ( '|' )
        // InternalMyDsl.g:1354:5: '|'
        {
        match(input,27,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_InternalMyDsl

    // $ANTLR start synpred43_InternalMyDsl
    public final void synpred43_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1381:5: ( '|' )
        // InternalMyDsl.g:1381:6: '|'
        {
        match(input,27,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_InternalMyDsl

    // $ANTLR start synpred44_InternalMyDsl
    public final void synpred44_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1408:4: ( '|' )
        // InternalMyDsl.g:1408:5: '|'
        {
        match(input,27,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_InternalMyDsl

    // $ANTLR start synpred45_InternalMyDsl
    public final void synpred45_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1536:4: ( '#' )
        // InternalMyDsl.g:1536:5: '#'
        {
        match(input,28,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_InternalMyDsl

    // $ANTLR start synpred46_InternalMyDsl
    public final void synpred46_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1544:4: ( RULE_BL )
        // InternalMyDsl.g:1544:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_InternalMyDsl

    // $ANTLR start synpred47_InternalMyDsl
    public final void synpred47_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1600:4: ( '#' )
        // InternalMyDsl.g:1600:5: '#'
        {
        match(input,28,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_InternalMyDsl

    // $ANTLR start synpred48_InternalMyDsl
    public final void synpred48_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1608:4: ( RULE_BL )
        // InternalMyDsl.g:1608:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_InternalMyDsl

    // $ANTLR start synpred49_InternalMyDsl
    public final void synpred49_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1664:4: ( '#' )
        // InternalMyDsl.g:1664:5: '#'
        {
        match(input,28,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_InternalMyDsl

    // $ANTLR start synpred50_InternalMyDsl
    public final void synpred50_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1672:4: ( RULE_BL )
        // InternalMyDsl.g:1672:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_InternalMyDsl

    // $ANTLR start synpred51_InternalMyDsl
    public final void synpred51_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1728:4: ( '#' )
        // InternalMyDsl.g:1728:5: '#'
        {
        match(input,28,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_InternalMyDsl

    // $ANTLR start synpred52_InternalMyDsl
    public final void synpred52_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1736:4: ( RULE_BL )
        // InternalMyDsl.g:1736:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_InternalMyDsl

    // $ANTLR start synpred53_InternalMyDsl
    public final void synpred53_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1792:4: ( '#' )
        // InternalMyDsl.g:1792:5: '#'
        {
        match(input,28,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_InternalMyDsl

    // $ANTLR start synpred54_InternalMyDsl
    public final void synpred54_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1800:4: ( RULE_BL )
        // InternalMyDsl.g:1800:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_InternalMyDsl

    // $ANTLR start synpred55_InternalMyDsl
    public final void synpred55_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1856:4: ( '#' )
        // InternalMyDsl.g:1856:5: '#'
        {
        match(input,28,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_InternalMyDsl

    // $ANTLR start synpred56_InternalMyDsl
    public final void synpred56_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1864:4: ( RULE_BL )
        // InternalMyDsl.g:1864:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_InternalMyDsl

    // $ANTLR start synpred57_InternalMyDsl
    public final void synpred57_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1892:6: ( ( ruleStrongExpression ) )
        // InternalMyDsl.g:1892:7: ( ruleStrongExpression )
        {
        // InternalMyDsl.g:1892:7: ( ruleStrongExpression )
        // InternalMyDsl.g:1893:7: ruleStrongExpression
        {
        pushFollow(FOLLOW_2);
        ruleStrongExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred57_InternalMyDsl

    // $ANTLR start synpred58_InternalMyDsl
    public final void synpred58_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1890:4: ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )
        // InternalMyDsl.g:1890:5: ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) )
        {
        // InternalMyDsl.g:1890:5: ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) )
        int alt60=3;
        int LA60_0 = input.LA(1);

        if ( (LA60_0==34) && (synpred57_InternalMyDsl())) {
            alt60=1;
        }
        else if ( (LA60_0==13) ) {
            alt60=2;
        }
        else if ( (LA60_0==35) ) {
            alt60=3;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 60, 0, input);

            throw nvae;
        }
        switch (alt60) {
            case 1 :
                // InternalMyDsl.g:1891:5: ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) )
                {
                // InternalMyDsl.g:1891:5: ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) )
                // InternalMyDsl.g:1892:6: ( ( ruleStrongExpression ) )=> ( ruleStrongExpression )
                {
                // InternalMyDsl.g:1896:6: ( ruleStrongExpression )
                // InternalMyDsl.g:1897:7: ruleStrongExpression
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
                // InternalMyDsl.g:1901:5: ( ( ruleItalicExpression ) )
                {
                // InternalMyDsl.g:1901:5: ( ( ruleItalicExpression ) )
                // InternalMyDsl.g:1902:6: ( ruleItalicExpression )
                {
                // InternalMyDsl.g:1902:6: ( ruleItalicExpression )
                // InternalMyDsl.g:1903:7: ruleItalicExpression
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
                // InternalMyDsl.g:1907:5: ( ( ruleScratchExpression ) )
                {
                // InternalMyDsl.g:1907:5: ( ( ruleScratchExpression ) )
                // InternalMyDsl.g:1908:6: ( ruleScratchExpression )
                {
                // InternalMyDsl.g:1908:6: ( ruleScratchExpression )
                // InternalMyDsl.g:1909:7: ruleScratchExpression
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
    // $ANTLR end synpred58_InternalMyDsl

    // $ANTLR start synpred59_InternalMyDsl
    public final void synpred59_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1916:6: ( ( ruleStrongExpression ) )
        // InternalMyDsl.g:1916:7: ( ruleStrongExpression )
        {
        // InternalMyDsl.g:1916:7: ( ruleStrongExpression )
        // InternalMyDsl.g:1917:7: ruleStrongExpression
        {
        pushFollow(FOLLOW_2);
        ruleStrongExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred59_InternalMyDsl

    // $ANTLR start synpred60_InternalMyDsl
    public final void synpred60_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2251:4: ( ( RULE_ID | RULE_STRING | RULE_INT ) )
        // InternalMyDsl.g:2251:5: ( RULE_ID | RULE_STRING | RULE_INT )
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
    // $ANTLR end synpred60_InternalMyDsl

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
    public final boolean synpred22_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalMyDsl_fragment(); // can never throw exception
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
    public final boolean synpred30_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalMyDsl_fragment(); // can never throw exception
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
    public final boolean synpred26_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalMyDsl_fragment(); // can never throw exception
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
    public final boolean synpred27_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalMyDsl_fragment(); // can never throw exception
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


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA54 dfa54 = new DFA54(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\4\uffff\2\6\10\uffff";
    static final String dfa_3s = "\1\4\1\uffff\1\6\1\5\2\4\1\uffff\7\23";
    static final String dfa_4s = "\1\45\1\uffff\4\45\1\uffff\7\26";
    static final String dfa_5s = "\1\uffff\1\1\4\uffff\1\2\7\uffff";
    static final String dfa_6s = "\16\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\uffff\1\5\2\6\4\uffff\1\3\1\4\1\1\1\uffff\1\6\1\2\5\uffff\2\6\1\uffff\1\6\6\1\4\6",
            "",
            "\1\11\1\7\1\10\5\uffff\1\13\14\uffff\1\14\10\uffff\1\12\1\15",
            "\1\1\3\6\4\uffff\2\6\14\uffff\1\6\6\uffff\4\6",
            "\1\6\1\1\3\6\4\uffff\3\6\1\uffff\2\6\5\uffff\2\6\1\uffff\13\6",
            "\1\6\1\uffff\3\6\4\uffff\3\6\1\1\2\6\5\uffff\2\6\1\uffff\13\6",
            "",
            "\1\1\1\6\1\uffff\1\6",
            "\1\1\1\6\1\uffff\1\6",
            "\1\1\1\6\1\uffff\1\6",
            "\1\1\1\6\1\uffff\1\6",
            "\1\1\1\6\1\uffff\1\6",
            "\1\1\1\6\1\uffff\1\6",
            "\1\1\1\6\1\uffff\1\6"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "123:2: ( ( ( ( ( ruleHeaderExpression ) )=> (lv_c_0_0= ruleHeaderExpression ) ) | ( (lv_c_1_0= ruleBreakLineExpression ) ) | ( (lv_c_2_0= ruleRefExpression ) ) | ( ( (lv_c_3_0= ruleListExpression ) ) ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ) | ( ( (lv_c_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) )";
        }
    }
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\1\4\11\uffff";
    static final String dfa_10s = "\1\41\11\uffff";
    static final String dfa_11s = "\1\uffff\6\1\1\2\1\3\1\4";
    static final String dfa_12s = "\1\0\11\uffff}>";
    static final String[] dfa_13s = {
            "\1\7\1\uffff\1\11\6\uffff\3\11\2\uffff\1\10\11\uffff\1\1\1\2\1\3\1\4\1\5\1\6",
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

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "124:3: ( ( ( ( ruleHeaderExpression ) )=> (lv_c_0_0= ruleHeaderExpression ) ) | ( (lv_c_1_0= ruleBreakLineExpression ) ) | ( (lv_c_2_0= ruleRefExpression ) ) | ( ( (lv_c_3_0= ruleListExpression ) ) ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_0 = input.LA(1);

                         
                        int index3_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_0==28) && (synpred1_InternalMyDsl())) {s = 1;}

                        else if ( (LA3_0==29) && (synpred1_InternalMyDsl())) {s = 2;}

                        else if ( (LA3_0==30) && (synpred1_InternalMyDsl())) {s = 3;}

                        else if ( (LA3_0==31) && (synpred1_InternalMyDsl())) {s = 4;}

                        else if ( (LA3_0==32) && (synpred1_InternalMyDsl())) {s = 5;}

                        else if ( (LA3_0==33) && (synpred1_InternalMyDsl())) {s = 6;}

                        else if ( (LA3_0==RULE_BL) ) {s = 7;}

                        else if ( (LA3_0==18) ) {s = 8;}

                        else if ( (LA3_0==RULE_INT||(LA3_0>=13 && LA3_0<=15)) ) {s = 9;}

                         
                        input.seek(index3_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\25\uffff";
    static final String dfa_15s = "\2\uffff\5\1\1\uffff\1\1\5\uffff\6\1\1\uffff";
    static final String dfa_16s = "\1\6\1\uffff\5\4\1\0\1\4\4\uffff\1\0\6\4\1\0";
    static final String dfa_17s = "\1\45\1\uffff\5\45\1\0\1\45\4\uffff\1\0\6\45\1\0";
    static final String dfa_18s = "\1\uffff\1\1\7\uffff\4\2\10\uffff";
    static final String dfa_19s = "\1\0\6\uffff\1\3\5\uffff\1\2\6\uffff\1\1}>";
    static final String[] dfa_20s = {
            "\1\4\1\2\1\3\4\uffff\1\1\1\6\2\uffff\1\11\1\12\5\uffff\1\13\1\14\1\uffff\1\7\6\uffff\2\1\1\5\1\10",
            "",
            "\1\16\1\uffff\3\1\4\uffff\3\1\1\uffff\2\1\5\uffff\2\1\1\uffff\1\15\12\1",
            "\1\16\1\uffff\3\1\4\uffff\3\1\1\uffff\2\1\5\uffff\2\1\1\uffff\1\15\12\1",
            "\1\16\1\uffff\3\1\4\uffff\3\1\1\uffff\2\1\5\uffff\2\1\1\uffff\1\15\12\1",
            "\1\16\1\uffff\3\1\4\uffff\3\1\1\uffff\2\1\5\uffff\2\1\1\uffff\1\15\12\1",
            "\1\16\1\uffff\3\1\4\uffff\3\1\1\uffff\2\1\5\uffff\2\1\1\uffff\1\15\12\1",
            "\1\uffff",
            "\1\16\1\uffff\3\1\4\uffff\3\1\1\uffff\2\1\5\uffff\2\1\1\uffff\1\15\12\1",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\1\1\uffff\3\1\4\uffff\1\1\1\17\1\1\1\uffff\2\1\5\uffff\2\1\1\uffff\1\20\12\1",
            "\5\1\4\uffff\1\1\1\21\1\1\1\uffff\2\1\5\uffff\2\1\1\uffff\13\1",
            "\1\1\1\uffff\3\1\4\uffff\1\1\1\17\1\1\1\uffff\2\1\5\uffff\2\1\1\uffff\13\1",
            "\5\1\4\uffff\1\1\1\21\1\1\1\uffff\2\1\5\uffff\2\1\1\uffff\1\22\12\1",
            "\1\1\1\uffff\3\1\4\uffff\1\1\1\23\1\1\1\uffff\2\1\5\uffff\2\1\1\uffff\13\1",
            "\5\1\4\uffff\1\1\1\24\1\1\1\uffff\2\1\5\uffff\2\1\1\uffff\13\1",
            "\1\uffff"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "301:2: ( ( (lv_c_0_0= ruleEmphasisExpression ) ) | ( ( ( ( ( ruleQuoteExpression ) ) | ( ( ruleTabExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) ) )=> ( ( (lv_c_1_0= ruleQuoteExpression ) ) | ( (lv_c_2_0= ruleTabExpression ) ) | ( ( (lv_c_3_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_4_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_5_0= ruleVideoExpression ) ) ) ) ) )";
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
                        if ( (LA8_0==13||(LA8_0>=34 && LA8_0<=35)) ) {s = 1;}

                        else if ( (LA8_0==RULE_ID) ) {s = 2;}

                        else if ( (LA8_0==RULE_STRING) ) {s = 3;}

                        else if ( (LA8_0==RULE_INT) ) {s = 4;}

                        else if ( (LA8_0==36) ) {s = 5;}

                        else if ( (LA8_0==14) ) {s = 6;}

                        else if ( (LA8_0==27) ) {s = 7;}

                        else if ( (LA8_0==37) ) {s = 8;}

                        else if ( (LA8_0==17) && (synpred6_InternalMyDsl())) {s = 9;}

                        else if ( (LA8_0==18) && (synpred6_InternalMyDsl())) {s = 10;}

                        else if ( (LA8_0==24) && (synpred6_InternalMyDsl())) {s = 11;}

                        else if ( (LA8_0==25) && (synpred6_InternalMyDsl())) {s = 12;}

                         
                        input.seek(index8_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_20 = input.LA(1);

                         
                        int index8_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 1;}

                        else if ( (synpred6_InternalMyDsl()) ) {s = 12;}

                         
                        input.seek(index8_20);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_13 = input.LA(1);

                         
                        int index8_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 1;}

                        else if ( (synpred6_InternalMyDsl()) ) {s = 12;}

                         
                        input.seek(index8_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA8_7 = input.LA(1);

                         
                        int index8_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (true) ) {s = 1;}

                        else if ( (synpred6_InternalMyDsl()) ) {s = 12;}

                         
                        input.seek(index8_7);
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
    static final String dfa_21s = "\30\uffff";
    static final String dfa_22s = "\1\1\27\uffff";
    static final String dfa_23s = "\1\4\27\uffff";
    static final String dfa_24s = "\1\45\27\uffff";
    static final String dfa_25s = "\1\uffff\1\2\7\uffff\3\1\1\uffff\13\1";
    static final String dfa_26s = "\30\uffff}>";
    static final String[] dfa_27s = {
            "\1\1\1\uffff\1\15\1\20\1\21\4\uffff\1\12\1\13\1\1\1\uffff\1\25\1\11\5\uffff\1\26\1\27\1\uffff\1\23\6\1\1\16\1\17\1\22\1\24",
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

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[][] dfa_27 = unpackEncodedStringArray(dfa_27s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_21;
            this.eof = dfa_22;
            this.min = dfa_23;
            this.max = dfa_24;
            this.accept = dfa_25;
            this.special = dfa_26;
            this.transition = dfa_27;
        }
        public String getDescription() {
            return "()+ loopback of 643:3: ( (lv_content_2_0= ruleTextExpression ) )+";
        }
    }
    static final String dfa_28s = "\13\uffff";
    static final String dfa_29s = "\1\22\1\6\7\24\2\uffff";
    static final String dfa_30s = "\1\22\1\45\7\26\2\uffff";
    static final String dfa_31s = "\11\uffff\1\1\1\2";
    static final String dfa_32s = "\2\uffff\1\0\1\5\1\6\1\1\1\2\1\3\1\4\2\uffff}>";
    static final String[] dfa_33s = {
            "\1\1",
            "\1\4\1\2\1\3\5\uffff\1\6\14\uffff\1\7\10\uffff\1\5\1\10",
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

    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_28;
            this.eof = dfa_28;
            this.min = dfa_29;
            this.max = dfa_30;
            this.accept = dfa_31;
            this.special = dfa_32;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "772:2: ( ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) | ( ( ( '[' )=>otherlv_7= '[' ) ( (lv_altText_8_0= ruleNaturalExpression ) ) ( ( '][' )=>otherlv_9= '][' ) ( (lv_refName_10_0= ruleNaturalExpression ) )? ( ( ']' )=>otherlv_11= ']' ) ( ( RULE_BL )=>this_BL_12= RULE_BL )? ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_2 = input.LA(1);

                         
                        int index25_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_2==20) ) {s = 9;}

                        else if ( (LA25_2==22) && (synpred20_InternalMyDsl())) {s = 10;}

                         
                        input.seek(index25_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_5 = input.LA(1);

                         
                        int index25_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_5==22) && (synpred20_InternalMyDsl())) {s = 10;}

                        else if ( (LA25_5==20) ) {s = 9;}

                         
                        input.seek(index25_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_6 = input.LA(1);

                         
                        int index25_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_6==20) ) {s = 9;}

                        else if ( (LA25_6==22) && (synpred20_InternalMyDsl())) {s = 10;}

                         
                        input.seek(index25_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA25_7 = input.LA(1);

                         
                        int index25_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_7==20) ) {s = 9;}

                        else if ( (LA25_7==22) && (synpred20_InternalMyDsl())) {s = 10;}

                         
                        input.seek(index25_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA25_8 = input.LA(1);

                         
                        int index25_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_8==20) ) {s = 9;}

                        else if ( (LA25_8==22) && (synpred20_InternalMyDsl())) {s = 10;}

                         
                        input.seek(index25_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA25_3 = input.LA(1);

                         
                        int index25_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_3==22) && (synpred20_InternalMyDsl())) {s = 10;}

                        else if ( (LA25_3==20) ) {s = 9;}

                         
                        input.seek(index25_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA25_4 = input.LA(1);

                         
                        int index25_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_4==20) ) {s = 9;}

                        else if ( (LA25_4==22) && (synpred20_InternalMyDsl())) {s = 10;}

                         
                        input.seek(index25_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_34s = "\2\2\11\uffff";
    static final String dfa_35s = "\2\4\1\uffff\7\0\1\uffff";
    static final String dfa_36s = "\2\45\1\uffff\7\0\1\uffff";
    static final String dfa_37s = "\2\uffff\1\2\7\uffff\1\1";
    static final String dfa_38s = "\3\uffff\1\4\1\3\1\6\1\1\1\2\1\0\1\5\1\uffff}>";
    static final String[] dfa_39s = {
            "\1\1\1\uffff\3\2\4\uffff\3\2\1\uffff\2\2\5\uffff\2\2\1\uffff\13\2",
            "\1\2\1\uffff\1\4\1\5\1\6\4\uffff\1\2\1\3\1\2\1\uffff\2\2\5\uffff\2\2\1\uffff\1\10\10\2\1\7\1\11",
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
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[][] dfa_39 = unpackEncodedStringArray(dfa_39s);

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_28;
            this.eof = dfa_34;
            this.min = dfa_35;
            this.max = dfa_36;
            this.accept = dfa_37;
            this.special = dfa_38;
            this.transition = dfa_39;
        }
        public String getDescription() {
            return "()* loopback of 1224:5: ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_8 = input.LA(1);

                         
                        int index31_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_6 = input.LA(1);

                         
                        int index31_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA31_7 = input.LA(1);

                         
                        int index31_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA31_4 = input.LA(1);

                         
                        int index31_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA31_3 = input.LA(1);

                         
                        int index31_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_3);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA31_9 = input.LA(1);

                         
                        int index31_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA31_5 = input.LA(1);

                         
                        int index31_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_5);
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
    static final String dfa_40s = "\3\uffff\1\0\1\2\1\4\1\5\1\3\1\6\1\1\1\uffff}>";
    static final String[] dfa_41s = {
            "\1\2\1\uffff\3\2\4\uffff\3\2\1\uffff\2\2\5\uffff\2\2\1\uffff\1\1\12\2",
            "\1\2\1\uffff\1\6\1\4\1\5\4\uffff\1\2\1\10\1\2\1\uffff\2\2\5\uffff\2\2\1\uffff\1\3\10\2\1\7\1\11",
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
    static final short[][] dfa_41 = unpackEncodedStringArray(dfa_41s);

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_28;
            this.eof = dfa_34;
            this.min = dfa_35;
            this.max = dfa_36;
            this.accept = dfa_37;
            this.special = dfa_40;
            this.transition = dfa_41;
        }
        public String getDescription() {
            return "()* loopback of 1379:3: ( ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) ) )*";
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
                        if ( (synpred43_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index38_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA38_9 = input.LA(1);

                         
                        int index38_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index38_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA38_4 = input.LA(1);

                         
                        int index38_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index38_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA38_7 = input.LA(1);

                         
                        int index38_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index38_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA38_5 = input.LA(1);

                         
                        int index38_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index38_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA38_6 = input.LA(1);

                         
                        int index38_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index38_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA38_8 = input.LA(1);

                         
                        int index38_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalMyDsl()) ) {s = 10;}

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
    static final String dfa_42s = "\31\uffff";
    static final String dfa_43s = "\1\1\30\uffff";
    static final String dfa_44s = "\1\4\2\uffff\1\0\25\uffff";
    static final String dfa_45s = "\1\45\2\uffff\1\0\25\uffff";
    static final String dfa_46s = "\1\uffff\1\2\26\uffff\1\1";
    static final String dfa_47s = "\3\uffff\1\0\25\uffff}>";
    static final String[] dfa_48s = {
            "\1\1\1\uffff\3\1\4\uffff\3\1\1\uffff\2\1\5\uffff\2\1\1\uffff\1\1\1\3\11\1",
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
            ""
    };

    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final char[] dfa_44 = DFA.unpackEncodedStringToUnsignedChars(dfa_44s);
    static final char[] dfa_45 = DFA.unpackEncodedStringToUnsignedChars(dfa_45s);
    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final short[][] dfa_48 = unpackEncodedStringArray(dfa_48s);

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_42;
            this.eof = dfa_43;
            this.min = dfa_44;
            this.max = dfa_45;
            this.accept = dfa_46;
            this.special = dfa_47;
            this.transition = dfa_48;
        }
        public String getDescription() {
            return "()* loopback of 1535:3: ( ( '#' )=>otherlv_3= '#' )*";
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
                        if ( (synpred45_InternalMyDsl()) ) {s = 24;}

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
            this.eot = dfa_42;
            this.eof = dfa_43;
            this.min = dfa_44;
            this.max = dfa_45;
            this.accept = dfa_46;
            this.special = dfa_47;
            this.transition = dfa_48;
        }
        public String getDescription() {
            return "()* loopback of 1599:3: ( ( '#' )=>otherlv_3= '#' )*";
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
                        if ( (synpred47_InternalMyDsl()) ) {s = 24;}

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
            this.eot = dfa_42;
            this.eof = dfa_43;
            this.min = dfa_44;
            this.max = dfa_45;
            this.accept = dfa_46;
            this.special = dfa_47;
            this.transition = dfa_48;
        }
        public String getDescription() {
            return "()* loopback of 1663:3: ( ( '#' )=>otherlv_3= '#' )*";
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
                        if ( (synpred49_InternalMyDsl()) ) {s = 24;}

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
            this.eot = dfa_42;
            this.eof = dfa_43;
            this.min = dfa_44;
            this.max = dfa_45;
            this.accept = dfa_46;
            this.special = dfa_47;
            this.transition = dfa_48;
        }
        public String getDescription() {
            return "()* loopback of 1727:3: ( ( '#' )=>otherlv_3= '#' )*";
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
                        if ( (synpred51_InternalMyDsl()) ) {s = 24;}

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
            this.eot = dfa_42;
            this.eof = dfa_43;
            this.min = dfa_44;
            this.max = dfa_45;
            this.accept = dfa_46;
            this.special = dfa_47;
            this.transition = dfa_48;
        }
        public String getDescription() {
            return "()* loopback of 1791:3: ( ( '#' )=>otherlv_3= '#' )*";
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
                        if ( (synpred53_InternalMyDsl()) ) {s = 24;}

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
            this.eot = dfa_42;
            this.eof = dfa_43;
            this.min = dfa_44;
            this.max = dfa_45;
            this.accept = dfa_46;
            this.special = dfa_47;
            this.transition = dfa_48;
        }
        public String getDescription() {
            return "()* loopback of 1855:3: ( ( '#' )=>otherlv_3= '#' )*";
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
                        if ( (synpred55_InternalMyDsl()) ) {s = 24;}

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
    static final String dfa_49s = "\1\4\11\uffff\1\0\3\uffff\2\0\11\uffff";
    static final String dfa_50s = "\1\45\11\uffff\1\0\3\uffff\2\0\11\uffff";
    static final String dfa_51s = "\1\uffff\1\3\11\uffff\1\2\1\uffff\1\2\2\uffff\5\2\3\uffff\1\1";
    static final String dfa_52s = "\12\uffff\1\0\3\uffff\1\1\1\2\11\uffff}>";
    static final String[] dfa_53s = {
            "\1\1\1\uffff\1\15\1\20\1\21\4\uffff\1\12\1\13\1\1\1\uffff\2\1\5\uffff\2\1\1\uffff\1\23\6\1\1\16\1\17\1\22\1\24",
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
            ""
    };
    static final char[] dfa_49 = DFA.unpackEncodedStringToUnsignedChars(dfa_49s);
    static final char[] dfa_50 = DFA.unpackEncodedStringToUnsignedChars(dfa_50s);
    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final short[] dfa_52 = DFA.unpackEncodedString(dfa_52s);
    static final short[][] dfa_53 = unpackEncodedStringArray(dfa_53s);

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = dfa_42;
            this.eof = dfa_43;
            this.min = dfa_49;
            this.max = dfa_50;
            this.accept = dfa_51;
            this.special = dfa_52;
            this.transition = dfa_53;
        }
        public String getDescription() {
            return "()+ loopback of 1888:2: ( ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) ) | ( (lv_c_3_0= ruleNaturalExpression ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_10 = input.LA(1);

                         
                        int index54_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalMyDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index54_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA54_14 = input.LA(1);

                         
                        int index54_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalMyDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index54_14);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA54_15 = input.LA(1);

                         
                        int index54_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalMyDsl()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index54_15);
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
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000003FFB06E1D2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000003FFB06E1F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000E012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000E002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000003FFB06E1D0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000003C080061C0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000003C080061D2L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000003C082061C0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000003C088061C0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000003C0C0061C0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008004002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000012L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000003C080061C2L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L});

}