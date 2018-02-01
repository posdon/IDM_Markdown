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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BL", "RULE_WS", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_DIGIT", "RULE_ANY_OTHER", "'*'", "'-'", "'+'", "'.'", "'>'", "'_'", "'|'", "'['", "']:'", "']('", "')'", "']['", "']'", "'!['", "'[!['", "')]('", "'#'", "'##'", "'###'", "'####'", "'#####'", "'######'", "'**'", "'~~'", "'\\''", "'\"'"
    };
    public static final int RULE_STRING=8;
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

                if ( (LA1_0==RULE_BL||(LA1_0>=RULE_INT && LA1_0<=RULE_STRING)||(LA1_0>=13 && LA1_0<=15)||(LA1_0>=17 && LA1_0<=20)||(LA1_0>=26 && LA1_0<=27)||(LA1_0>=29 && LA1_0<=38)) ) {
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
    // InternalMyDsl.g:116:1: ruleExpression returns [EObject current=null] : ( ( ( ( ( ( ruleHeaderExpression ) ) | ( ( ruleBreakLineExpression ) ) | ( ( ruleRefExpression ) ) | ( ( ( ( ruleHorizontalExpression ) )=> ( ruleHorizontalExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) | ( ( ( ruleListExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) ) )=> ( ( (lv_c_0_0= ruleHeaderExpression ) ) | ( (lv_c_1_0= ruleBreakLineExpression ) ) | ( (lv_c_2_0= ruleRefExpression ) ) | ( ( ( ( ruleHorizontalExpression ) )=> (lv_c_3_0= ruleHorizontalExpression ) ) ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) | ( ( (lv_c_5_0= ruleListExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) ) ) | ( ( (lv_c_7_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_8= RULE_BL )? ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token this_BL_4=null;
        Token this_BL_6=null;
        Token this_BL_8=null;
        EObject lv_c_0_0 = null;

        EObject lv_c_1_0 = null;

        EObject lv_c_2_0 = null;

        EObject lv_c_3_0 = null;

        EObject lv_c_5_0 = null;

        EObject lv_c_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:122:2: ( ( ( ( ( ( ( ruleHeaderExpression ) ) | ( ( ruleBreakLineExpression ) ) | ( ( ruleRefExpression ) ) | ( ( ( ( ruleHorizontalExpression ) )=> ( ruleHorizontalExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) | ( ( ( ruleListExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) ) )=> ( ( (lv_c_0_0= ruleHeaderExpression ) ) | ( (lv_c_1_0= ruleBreakLineExpression ) ) | ( (lv_c_2_0= ruleRefExpression ) ) | ( ( ( ( ruleHorizontalExpression ) )=> (lv_c_3_0= ruleHorizontalExpression ) ) ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) | ( ( (lv_c_5_0= ruleListExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) ) ) | ( ( (lv_c_7_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_8= RULE_BL )? ) ) )
            // InternalMyDsl.g:123:2: ( ( ( ( ( ( ruleHeaderExpression ) ) | ( ( ruleBreakLineExpression ) ) | ( ( ruleRefExpression ) ) | ( ( ( ( ruleHorizontalExpression ) )=> ( ruleHorizontalExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) | ( ( ( ruleListExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) ) )=> ( ( (lv_c_0_0= ruleHeaderExpression ) ) | ( (lv_c_1_0= ruleBreakLineExpression ) ) | ( (lv_c_2_0= ruleRefExpression ) ) | ( ( ( ( ruleHorizontalExpression ) )=> (lv_c_3_0= ruleHorizontalExpression ) ) ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) | ( ( (lv_c_5_0= ruleListExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) ) ) | ( ( (lv_c_7_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_8= RULE_BL )? ) )
            {
            // InternalMyDsl.g:123:2: ( ( ( ( ( ( ruleHeaderExpression ) ) | ( ( ruleBreakLineExpression ) ) | ( ( ruleRefExpression ) ) | ( ( ( ( ruleHorizontalExpression ) )=> ( ruleHorizontalExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) | ( ( ( ruleListExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) ) )=> ( ( (lv_c_0_0= ruleHeaderExpression ) ) | ( (lv_c_1_0= ruleBreakLineExpression ) ) | ( (lv_c_2_0= ruleRefExpression ) ) | ( ( ( ( ruleHorizontalExpression ) )=> (lv_c_3_0= ruleHorizontalExpression ) ) ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) | ( ( (lv_c_5_0= ruleListExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) ) ) | ( ( (lv_c_7_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_8= RULE_BL )? ) )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:124:3: ( ( ( ( ( ruleHeaderExpression ) ) | ( ( ruleBreakLineExpression ) ) | ( ( ruleRefExpression ) ) | ( ( ( ( ruleHorizontalExpression ) )=> ( ruleHorizontalExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) | ( ( ( ruleListExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) ) )=> ( ( (lv_c_0_0= ruleHeaderExpression ) ) | ( (lv_c_1_0= ruleBreakLineExpression ) ) | ( (lv_c_2_0= ruleRefExpression ) ) | ( ( ( ( ruleHorizontalExpression ) )=> (lv_c_3_0= ruleHorizontalExpression ) ) ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) | ( ( (lv_c_5_0= ruleListExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) ) )
                    {
                    // InternalMyDsl.g:124:3: ( ( ( ( ( ruleHeaderExpression ) ) | ( ( ruleBreakLineExpression ) ) | ( ( ruleRefExpression ) ) | ( ( ( ( ruleHorizontalExpression ) )=> ( ruleHorizontalExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) | ( ( ( ruleListExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) ) )=> ( ( (lv_c_0_0= ruleHeaderExpression ) ) | ( (lv_c_1_0= ruleBreakLineExpression ) ) | ( (lv_c_2_0= ruleRefExpression ) ) | ( ( ( ( ruleHorizontalExpression ) )=> (lv_c_3_0= ruleHorizontalExpression ) ) ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) | ( ( (lv_c_5_0= ruleListExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) ) )
                    // InternalMyDsl.g:125:4: ( ( ( ( ruleHeaderExpression ) ) | ( ( ruleBreakLineExpression ) ) | ( ( ruleRefExpression ) ) | ( ( ( ( ruleHorizontalExpression ) )=> ( ruleHorizontalExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) | ( ( ( ruleListExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) ) )=> ( ( (lv_c_0_0= ruleHeaderExpression ) ) | ( (lv_c_1_0= ruleBreakLineExpression ) ) | ( (lv_c_2_0= ruleRefExpression ) ) | ( ( ( ( ruleHorizontalExpression ) )=> (lv_c_3_0= ruleHorizontalExpression ) ) ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) | ( ( (lv_c_5_0= ruleListExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) )
                    {
                    // InternalMyDsl.g:173:4: ( ( (lv_c_0_0= ruleHeaderExpression ) ) | ( (lv_c_1_0= ruleBreakLineExpression ) ) | ( (lv_c_2_0= ruleRefExpression ) ) | ( ( ( ( ruleHorizontalExpression ) )=> (lv_c_3_0= ruleHorizontalExpression ) ) ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) | ( ( (lv_c_5_0= ruleListExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) )
                    int alt4=5;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0>=29 && LA4_0<=34)) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==RULE_BL) ) {
                        alt4=2;
                    }
                    else if ( (LA4_0==20) ) {
                        alt4=3;
                    }
                    else if ( (LA4_0==14) ) {
                        int LA4_4 = input.LA(2);

                        if ( (LA4_4==RULE_WS) ) {
                            alt4=5;
                        }
                        else if ( (LA4_4==14) && (synpred5_InternalMyDsl())) {
                            alt4=4;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA4_0==18) && (synpred5_InternalMyDsl())) {
                        alt4=4;
                    }
                    else if ( (LA4_0==RULE_INT||LA4_0==13||LA4_0==15) ) {
                        alt4=5;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalMyDsl.g:174:5: ( (lv_c_0_0= ruleHeaderExpression ) )
                            {
                            // InternalMyDsl.g:174:5: ( (lv_c_0_0= ruleHeaderExpression ) )
                            // InternalMyDsl.g:175:6: (lv_c_0_0= ruleHeaderExpression )
                            {
                            // InternalMyDsl.g:175:6: (lv_c_0_0= ruleHeaderExpression )
                            // InternalMyDsl.g:176:7: lv_c_0_0= ruleHeaderExpression
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
                            // InternalMyDsl.g:194:5: ( (lv_c_1_0= ruleBreakLineExpression ) )
                            {
                            // InternalMyDsl.g:194:5: ( (lv_c_1_0= ruleBreakLineExpression ) )
                            // InternalMyDsl.g:195:6: (lv_c_1_0= ruleBreakLineExpression )
                            {
                            // InternalMyDsl.g:195:6: (lv_c_1_0= ruleBreakLineExpression )
                            // InternalMyDsl.g:196:7: lv_c_1_0= ruleBreakLineExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExpressionAccess().getCBreakLineExpressionParserRuleCall_0_0_1_0());
                              						
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
                            // InternalMyDsl.g:214:5: ( (lv_c_2_0= ruleRefExpression ) )
                            {
                            // InternalMyDsl.g:214:5: ( (lv_c_2_0= ruleRefExpression ) )
                            // InternalMyDsl.g:215:6: (lv_c_2_0= ruleRefExpression )
                            {
                            // InternalMyDsl.g:215:6: (lv_c_2_0= ruleRefExpression )
                            // InternalMyDsl.g:216:7: lv_c_2_0= ruleRefExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExpressionAccess().getCRefExpressionParserRuleCall_0_0_2_0());
                              						
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
                            // InternalMyDsl.g:234:5: ( ( ( ( ruleHorizontalExpression ) )=> (lv_c_3_0= ruleHorizontalExpression ) ) ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
                            {
                            // InternalMyDsl.g:234:5: ( ( ( ( ruleHorizontalExpression ) )=> (lv_c_3_0= ruleHorizontalExpression ) ) ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
                            // InternalMyDsl.g:235:6: ( ( ( ruleHorizontalExpression ) )=> (lv_c_3_0= ruleHorizontalExpression ) ) ( ( RULE_BL )=>this_BL_4= RULE_BL )?
                            {
                            // InternalMyDsl.g:235:6: ( ( ( ruleHorizontalExpression ) )=> (lv_c_3_0= ruleHorizontalExpression ) )
                            // InternalMyDsl.g:236:7: ( ( ruleHorizontalExpression ) )=> (lv_c_3_0= ruleHorizontalExpression )
                            {
                            // InternalMyDsl.g:240:7: (lv_c_3_0= ruleHorizontalExpression )
                            // InternalMyDsl.g:241:8: lv_c_3_0= ruleHorizontalExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getExpressionAccess().getCHorizontalExpressionParserRuleCall_0_0_3_0_0());
                              							
                            }
                            pushFollow(FOLLOW_4);
                            lv_c_3_0=ruleHorizontalExpression();

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
                              									"markHammil.mm.MyDsl.HorizontalExpression");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalMyDsl.g:258:6: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
                            int alt2=2;
                            int LA2_0 = input.LA(1);

                            if ( (LA2_0==RULE_BL) ) {
                                int LA2_1 = input.LA(2);

                                if ( (synpred6_InternalMyDsl()) ) {
                                    alt2=1;
                                }
                            }
                            switch (alt2) {
                                case 1 :
                                    // InternalMyDsl.g:259:7: ( RULE_BL )=>this_BL_4= RULE_BL
                                    {
                                    this_BL_4=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(this_BL_4, grammarAccess.getExpressionAccess().getBLTerminalRuleCall_0_0_3_1());
                                      						
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 5 :
                            // InternalMyDsl.g:267:5: ( ( (lv_c_5_0= ruleListExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )
                            {
                            // InternalMyDsl.g:267:5: ( ( (lv_c_5_0= ruleListExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )
                            // InternalMyDsl.g:268:6: ( (lv_c_5_0= ruleListExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )?
                            {
                            // InternalMyDsl.g:268:6: ( (lv_c_5_0= ruleListExpression ) )
                            // InternalMyDsl.g:269:7: (lv_c_5_0= ruleListExpression )
                            {
                            // InternalMyDsl.g:269:7: (lv_c_5_0= ruleListExpression )
                            // InternalMyDsl.g:270:8: lv_c_5_0= ruleListExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getExpressionAccess().getCListExpressionParserRuleCall_0_0_4_0_0());
                              							
                            }
                            pushFollow(FOLLOW_4);
                            lv_c_5_0=ruleListExpression();

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
                              									"markHammil.mm.MyDsl.ListExpression");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalMyDsl.g:287:6: ( ( RULE_BL )=>this_BL_6= RULE_BL )?
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( (LA3_0==RULE_BL) ) {
                                int LA3_1 = input.LA(2);

                                if ( (synpred7_InternalMyDsl()) ) {
                                    alt3=1;
                                }
                            }
                            switch (alt3) {
                                case 1 :
                                    // InternalMyDsl.g:288:7: ( RULE_BL )=>this_BL_6= RULE_BL
                                    {
                                    this_BL_6=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(this_BL_6, grammarAccess.getExpressionAccess().getBLTerminalRuleCall_0_0_4_1());
                                      						
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
                    // InternalMyDsl.g:298:3: ( ( (lv_c_7_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_8= RULE_BL )? )
                    {
                    // InternalMyDsl.g:298:3: ( ( (lv_c_7_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_8= RULE_BL )? )
                    // InternalMyDsl.g:299:4: ( (lv_c_7_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_8= RULE_BL )?
                    {
                    // InternalMyDsl.g:299:4: ( (lv_c_7_0= ruleTextExpression ) )
                    // InternalMyDsl.g:300:5: (lv_c_7_0= ruleTextExpression )
                    {
                    // InternalMyDsl.g:300:5: (lv_c_7_0= ruleTextExpression )
                    // InternalMyDsl.g:301:6: lv_c_7_0= ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getCTextExpressionParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_c_7_0=ruleTextExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionRule());
                      						}
                      						set(
                      							current,
                      							"c",
                      							lv_c_7_0,
                      							"markHammil.mm.MyDsl.TextExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMyDsl.g:318:4: ( ( RULE_BL )=>this_BL_8= RULE_BL )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_BL) ) {
                        int LA5_1 = input.LA(2);

                        if ( (synpred8_InternalMyDsl()) ) {
                            alt5=1;
                        }
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalMyDsl.g:319:5: ( RULE_BL )=>this_BL_8= RULE_BL
                            {
                            this_BL_8=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_BL_8, grammarAccess.getExpressionAccess().getBLTerminalRuleCall_1_1());
                              				
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


    // $ANTLR start "entryRuleTextExpression"
    // InternalMyDsl.g:330:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalMyDsl.g:332:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // InternalMyDsl.g:333:2: iv_ruleTextExpression= ruleTextExpression EOF
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
    // InternalMyDsl.g:342:1: ruleTextExpression returns [EObject current=null] : ( ( ( ( ( ( ruleURLedExpression )=> ruleURLedExpression ) | ruleTabExpression | ruleQuoteExpression ) )=> ( ( ( ruleURLedExpression )=>this_URLedExpression_0= ruleURLedExpression ) | this_TabExpression_1= ruleTabExpression | this_QuoteExpression_2= ruleQuoteExpression ) ) | this_EmphasisExpression_3= ruleEmphasisExpression ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject this_URLedExpression_0 = null;

        EObject this_TabExpression_1 = null;

        EObject this_QuoteExpression_2 = null;

        EObject this_EmphasisExpression_3 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalMyDsl.g:349:2: ( ( ( ( ( ( ( ruleURLedExpression )=> ruleURLedExpression ) | ruleTabExpression | ruleQuoteExpression ) )=> ( ( ( ruleURLedExpression )=>this_URLedExpression_0= ruleURLedExpression ) | this_TabExpression_1= ruleTabExpression | this_QuoteExpression_2= ruleQuoteExpression ) ) | this_EmphasisExpression_3= ruleEmphasisExpression ) )
            // InternalMyDsl.g:350:2: ( ( ( ( ( ( ruleURLedExpression )=> ruleURLedExpression ) | ruleTabExpression | ruleQuoteExpression ) )=> ( ( ( ruleURLedExpression )=>this_URLedExpression_0= ruleURLedExpression ) | this_TabExpression_1= ruleTabExpression | this_QuoteExpression_2= ruleQuoteExpression ) ) | this_EmphasisExpression_3= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:350:2: ( ( ( ( ( ( ruleURLedExpression )=> ruleURLedExpression ) | ruleTabExpression | ruleQuoteExpression ) )=> ( ( ( ruleURLedExpression )=>this_URLedExpression_0= ruleURLedExpression ) | this_TabExpression_1= ruleTabExpression | this_QuoteExpression_2= ruleQuoteExpression ) ) | this_EmphasisExpression_3= ruleEmphasisExpression )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:351:3: ( ( ( ( ( ruleURLedExpression )=> ruleURLedExpression ) | ruleTabExpression | ruleQuoteExpression ) )=> ( ( ( ruleURLedExpression )=>this_URLedExpression_0= ruleURLedExpression ) | this_TabExpression_1= ruleTabExpression | this_QuoteExpression_2= ruleQuoteExpression ) )
                    {
                    // InternalMyDsl.g:351:3: ( ( ( ( ( ruleURLedExpression )=> ruleURLedExpression ) | ruleTabExpression | ruleQuoteExpression ) )=> ( ( ( ruleURLedExpression )=>this_URLedExpression_0= ruleURLedExpression ) | this_TabExpression_1= ruleTabExpression | this_QuoteExpression_2= ruleQuoteExpression ) )
                    // InternalMyDsl.g:352:4: ( ( ( ( ruleURLedExpression )=> ruleURLedExpression ) | ruleTabExpression | ruleQuoteExpression ) )=> ( ( ( ruleURLedExpression )=>this_URLedExpression_0= ruleURLedExpression ) | this_TabExpression_1= ruleTabExpression | this_QuoteExpression_2= ruleQuoteExpression )
                    {
                    // InternalMyDsl.g:363:4: ( ( ( ruleURLedExpression )=>this_URLedExpression_0= ruleURLedExpression ) | this_TabExpression_1= ruleTabExpression | this_QuoteExpression_2= ruleQuoteExpression )
                    int alt7=3;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==26) && (synpred11_InternalMyDsl())) {
                        alt7=1;
                    }
                    else if ( (LA7_0==27) && (synpred11_InternalMyDsl())) {
                        alt7=1;
                    }
                    else if ( (LA7_0==20) && (synpred11_InternalMyDsl())) {
                        alt7=1;
                    }
                    else if ( ((LA7_0>=RULE_INT && LA7_0<=RULE_STRING)||LA7_0==14||LA7_0==19||(LA7_0>=37 && LA7_0<=38)) ) {
                        alt7=2;
                    }
                    else if ( (LA7_0==17) ) {
                        alt7=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalMyDsl.g:364:5: ( ( ruleURLedExpression )=>this_URLedExpression_0= ruleURLedExpression )
                            {
                            // InternalMyDsl.g:364:5: ( ( ruleURLedExpression )=>this_URLedExpression_0= ruleURLedExpression )
                            // InternalMyDsl.g:365:6: ( ruleURLedExpression )=>this_URLedExpression_0= ruleURLedExpression
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getTextExpressionAccess().getURLedExpressionParserRuleCall_0_0_0());
                              					
                            }
                            pushFollow(FOLLOW_2);
                            this_URLedExpression_0=ruleURLedExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current = this_URLedExpression_0;
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:376:5: this_TabExpression_1= ruleTabExpression
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getTextExpressionAccess().getTabExpressionParserRuleCall_0_0_1());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_TabExpression_1=ruleTabExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current = this_TabExpression_1;
                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:385:5: this_QuoteExpression_2= ruleQuoteExpression
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getTextExpressionAccess().getQuoteExpressionParserRuleCall_0_0_2());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_QuoteExpression_2=ruleQuoteExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current = this_QuoteExpression_2;
                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:396:3: this_EmphasisExpression_3= ruleEmphasisExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTextExpressionAccess().getEmphasisExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EmphasisExpression_3=ruleEmphasisExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EmphasisExpression_3;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleTextExpression"


    // $ANTLR start "entryRuleListExpression"
    // InternalMyDsl.g:411:1: entryRuleListExpression returns [EObject current=null] : iv_ruleListExpression= ruleListExpression EOF ;
    public final EObject entryRuleListExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:413:2: (iv_ruleListExpression= ruleListExpression EOF )
            // InternalMyDsl.g:414:2: iv_ruleListExpression= ruleListExpression EOF
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
    // InternalMyDsl.g:423:1: ruleListExpression returns [EObject current=null] : ( ( () ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )+ ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+ ) | (this_INT_7= RULE_INT otherlv_8= '.' (this_WS_9= RULE_WS )+ ( (lv_contentOrdered_10_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_11= RULE_BL )? )+ ) ;
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
            // InternalMyDsl.g:430:2: ( ( ( () ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )+ ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+ ) | (this_INT_7= RULE_INT otherlv_8= '.' (this_WS_9= RULE_WS )+ ( (lv_contentOrdered_10_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_11= RULE_BL )? )+ ) )
            // InternalMyDsl.g:431:2: ( ( () ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )+ ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+ ) | (this_INT_7= RULE_INT otherlv_8= '.' (this_WS_9= RULE_WS )+ ( (lv_contentOrdered_10_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_11= RULE_BL )? )+ )
            {
            // InternalMyDsl.g:431:2: ( ( () ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )+ ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+ ) | (this_INT_7= RULE_INT otherlv_8= '.' (this_WS_9= RULE_WS )+ ( (lv_contentOrdered_10_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_11= RULE_BL )? )+ )
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
                    // InternalMyDsl.g:432:3: ( () ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )+ ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+ )
                    {
                    // InternalMyDsl.g:432:3: ( () ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )+ ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+ )
                    // InternalMyDsl.g:433:4: () ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )+ ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+
                    {
                    // InternalMyDsl.g:433:4: ()
                    // InternalMyDsl.g:434:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getListExpressionAccess().getListExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMyDsl.g:440:4: ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )+ ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+
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
                        case 13:
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
                    	    // InternalMyDsl.g:441:5: (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )+ ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )?
                    	    {
                    	    // InternalMyDsl.g:441:5: (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' )
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
                    	            // InternalMyDsl.g:442:6: otherlv_1= '*'
                    	            {
                    	            otherlv_1=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_1, grammarAccess.getListExpressionAccess().getAsteriskKeyword_0_1_0_0());
                    	              					
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalMyDsl.g:447:6: otherlv_2= '-'
                    	            {
                    	            otherlv_2=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_2, grammarAccess.getListExpressionAccess().getHyphenMinusKeyword_0_1_0_1());
                    	              					
                    	            }

                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalMyDsl.g:452:6: otherlv_3= '+'
                    	            {
                    	            otherlv_3=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_3, grammarAccess.getListExpressionAccess().getPlusSignKeyword_0_1_0_2());
                    	              					
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // InternalMyDsl.g:457:5: (this_WS_4= RULE_WS )+
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
                    	    	    // InternalMyDsl.g:458:6: this_WS_4= RULE_WS
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

                    	    // InternalMyDsl.g:463:5: ( (lv_contentUnordered_5_0= ruleTextExpression ) )
                    	    // InternalMyDsl.g:464:6: (lv_contentUnordered_5_0= ruleTextExpression )
                    	    {
                    	    // InternalMyDsl.g:464:6: (lv_contentUnordered_5_0= ruleTextExpression )
                    	    // InternalMyDsl.g:465:7: lv_contentUnordered_5_0= ruleTextExpression
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

                    	    // InternalMyDsl.g:482:5: ( ( RULE_BL )=>this_BL_6= RULE_BL )?
                    	    int alt11=2;
                    	    int LA11_0 = input.LA(1);

                    	    if ( (LA11_0==RULE_BL) ) {
                    	        int LA11_1 = input.LA(2);

                    	        if ( (synpred12_InternalMyDsl()) ) {
                    	            alt11=1;
                    	        }
                    	    }
                    	    switch (alt11) {
                    	        case 1 :
                    	            // InternalMyDsl.g:483:6: ( RULE_BL )=>this_BL_6= RULE_BL
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
                    // InternalMyDsl.g:492:3: (this_INT_7= RULE_INT otherlv_8= '.' (this_WS_9= RULE_WS )+ ( (lv_contentOrdered_10_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_11= RULE_BL )? )+
                    {
                    // InternalMyDsl.g:492:3: (this_INT_7= RULE_INT otherlv_8= '.' (this_WS_9= RULE_WS )+ ( (lv_contentOrdered_10_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_11= RULE_BL )? )+
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
                    	    // InternalMyDsl.g:493:4: this_INT_7= RULE_INT otherlv_8= '.' (this_WS_9= RULE_WS )+ ( (lv_contentOrdered_10_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_11= RULE_BL )?
                    	    {
                    	    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				newLeafNode(this_INT_7, grammarAccess.getListExpressionAccess().getINTTerminalRuleCall_1_0());
                    	      			
                    	    }
                    	    otherlv_8=(Token)match(input,16,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				newLeafNode(otherlv_8, grammarAccess.getListExpressionAccess().getFullStopKeyword_1_1());
                    	      			
                    	    }
                    	    // InternalMyDsl.g:501:4: (this_WS_9= RULE_WS )+
                    	    int cnt13=0;
                    	    loop13:
                    	    do {
                    	        int alt13=2;
                    	        int LA13_0 = input.LA(1);

                    	        if ( (LA13_0==RULE_WS) ) {
                    	            alt13=1;
                    	        }


                    	        switch (alt13) {
                    	    	case 1 :
                    	    	    // InternalMyDsl.g:502:5: this_WS_9= RULE_WS
                    	    	    {
                    	    	    this_WS_9=(Token)match(input,RULE_WS,FOLLOW_6); if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	      					newLeafNode(this_WS_9, grammarAccess.getListExpressionAccess().getWSTerminalRuleCall_1_2());
                    	    	      				
                    	    	    }

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt13 >= 1 ) break loop13;
                    	    	    if (state.backtracking>0) {state.failed=true; return current;}
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(13, input);
                    	                throw eee;
                    	        }
                    	        cnt13++;
                    	    } while (true);

                    	    // InternalMyDsl.g:507:4: ( (lv_contentOrdered_10_0= ruleTextExpression ) )
                    	    // InternalMyDsl.g:508:5: (lv_contentOrdered_10_0= ruleTextExpression )
                    	    {
                    	    // InternalMyDsl.g:508:5: (lv_contentOrdered_10_0= ruleTextExpression )
                    	    // InternalMyDsl.g:509:6: lv_contentOrdered_10_0= ruleTextExpression
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

                    	    // InternalMyDsl.g:526:4: ( ( RULE_BL )=>this_BL_11= RULE_BL )?
                    	    int alt14=2;
                    	    int LA14_0 = input.LA(1);

                    	    if ( (LA14_0==RULE_BL) ) {
                    	        int LA14_1 = input.LA(2);

                    	        if ( (synpred13_InternalMyDsl()) ) {
                    	            alt14=1;
                    	        }
                    	    }
                    	    switch (alt14) {
                    	        case 1 :
                    	            // InternalMyDsl.g:527:5: ( RULE_BL )=>this_BL_11= RULE_BL
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
    // InternalMyDsl.g:541:1: entryRuleQuoteExpression returns [EObject current=null] : iv_ruleQuoteExpression= ruleQuoteExpression EOF ;
    public final EObject entryRuleQuoteExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuoteExpression = null;


        try {
            // InternalMyDsl.g:541:56: (iv_ruleQuoteExpression= ruleQuoteExpression EOF )
            // InternalMyDsl.g:542:2: iv_ruleQuoteExpression= ruleQuoteExpression EOF
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
    // InternalMyDsl.g:548:1: ruleQuoteExpression returns [EObject current=null] : ( () ( ( '>' )=>otherlv_1= '>' ) ( (lv_content_2_0= ruleTextExpression ) )+ ( ( RULE_BL )=>this_BL_3= RULE_BL )? ) ;
    public final EObject ruleQuoteExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BL_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:554:2: ( ( () ( ( '>' )=>otherlv_1= '>' ) ( (lv_content_2_0= ruleTextExpression ) )+ ( ( RULE_BL )=>this_BL_3= RULE_BL )? ) )
            // InternalMyDsl.g:555:2: ( () ( ( '>' )=>otherlv_1= '>' ) ( (lv_content_2_0= ruleTextExpression ) )+ ( ( RULE_BL )=>this_BL_3= RULE_BL )? )
            {
            // InternalMyDsl.g:555:2: ( () ( ( '>' )=>otherlv_1= '>' ) ( (lv_content_2_0= ruleTextExpression ) )+ ( ( RULE_BL )=>this_BL_3= RULE_BL )? )
            // InternalMyDsl.g:556:3: () ( ( '>' )=>otherlv_1= '>' ) ( (lv_content_2_0= ruleTextExpression ) )+ ( ( RULE_BL )=>this_BL_3= RULE_BL )?
            {
            // InternalMyDsl.g:556:3: ()
            // InternalMyDsl.g:557:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getQuoteExpressionAccess().getQuoteExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:563:3: ( ( '>' )=>otherlv_1= '>' )
            // InternalMyDsl.g:564:4: ( '>' )=>otherlv_1= '>'
            {
            otherlv_1=(Token)match(input,17,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getQuoteExpressionAccess().getGreaterThanSignKeyword_1());
              			
            }

            }

            // InternalMyDsl.g:570:3: ( (lv_content_2_0= ruleTextExpression ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:571:4: (lv_content_2_0= ruleTextExpression )
            	    {
            	    // InternalMyDsl.g:571:4: (lv_content_2_0= ruleTextExpression )
            	    // InternalMyDsl.g:572:5: lv_content_2_0= ruleTextExpression
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

            // InternalMyDsl.g:589:3: ( ( RULE_BL )=>this_BL_3= RULE_BL )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_BL) ) {
                int LA18_1 = input.LA(2);

                if ( (synpred15_InternalMyDsl()) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:590:4: ( RULE_BL )=>this_BL_3= RULE_BL
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


    // $ANTLR start "entryRuleBreakLineExpression"
    // InternalMyDsl.g:600:1: entryRuleBreakLineExpression returns [EObject current=null] : iv_ruleBreakLineExpression= ruleBreakLineExpression EOF ;
    public final EObject entryRuleBreakLineExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakLineExpression = null;


        try {
            // InternalMyDsl.g:600:60: (iv_ruleBreakLineExpression= ruleBreakLineExpression EOF )
            // InternalMyDsl.g:601:2: iv_ruleBreakLineExpression= ruleBreakLineExpression EOF
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
    // InternalMyDsl.g:607:1: ruleBreakLineExpression returns [EObject current=null] : ( () this_BL_1= RULE_BL ) ;
    public final EObject ruleBreakLineExpression() throws RecognitionException {
        EObject current = null;

        Token this_BL_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:613:2: ( ( () this_BL_1= RULE_BL ) )
            // InternalMyDsl.g:614:2: ( () this_BL_1= RULE_BL )
            {
            // InternalMyDsl.g:614:2: ( () this_BL_1= RULE_BL )
            // InternalMyDsl.g:615:3: () this_BL_1= RULE_BL
            {
            // InternalMyDsl.g:615:3: ()
            // InternalMyDsl.g:616:4: 
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


    // $ANTLR start "entryRuleHorizontalExpression"
    // InternalMyDsl.g:630:1: entryRuleHorizontalExpression returns [EObject current=null] : iv_ruleHorizontalExpression= ruleHorizontalExpression EOF ;
    public final EObject entryRuleHorizontalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHorizontalExpression = null;


        try {
            // InternalMyDsl.g:630:61: (iv_ruleHorizontalExpression= ruleHorizontalExpression EOF )
            // InternalMyDsl.g:631:2: iv_ruleHorizontalExpression= ruleHorizontalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHorizontalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHorizontalExpression=ruleHorizontalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHorizontalExpression; 
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
    // $ANTLR end "entryRuleHorizontalExpression"


    // $ANTLR start "ruleHorizontalExpression"
    // InternalMyDsl.g:637:1: ruleHorizontalExpression returns [EObject current=null] : ( ( () (otherlv_1= '-' otherlv_2= '-' (otherlv_3= '-' )+ ) ) | (otherlv_4= '_' otherlv_5= '_' (otherlv_6= '_' )+ ) ) ;
    public final EObject ruleHorizontalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMyDsl.g:643:2: ( ( ( () (otherlv_1= '-' otherlv_2= '-' (otherlv_3= '-' )+ ) ) | (otherlv_4= '_' otherlv_5= '_' (otherlv_6= '_' )+ ) ) )
            // InternalMyDsl.g:644:2: ( ( () (otherlv_1= '-' otherlv_2= '-' (otherlv_3= '-' )+ ) ) | (otherlv_4= '_' otherlv_5= '_' (otherlv_6= '_' )+ ) )
            {
            // InternalMyDsl.g:644:2: ( ( () (otherlv_1= '-' otherlv_2= '-' (otherlv_3= '-' )+ ) ) | (otherlv_4= '_' otherlv_5= '_' (otherlv_6= '_' )+ ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==14) ) {
                alt21=1;
            }
            else if ( (LA21_0==18) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:645:3: ( () (otherlv_1= '-' otherlv_2= '-' (otherlv_3= '-' )+ ) )
                    {
                    // InternalMyDsl.g:645:3: ( () (otherlv_1= '-' otherlv_2= '-' (otherlv_3= '-' )+ ) )
                    // InternalMyDsl.g:646:4: () (otherlv_1= '-' otherlv_2= '-' (otherlv_3= '-' )+ )
                    {
                    // InternalMyDsl.g:646:4: ()
                    // InternalMyDsl.g:647:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getHorizontalExpressionAccess().getHorizontalExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMyDsl.g:653:4: (otherlv_1= '-' otherlv_2= '-' (otherlv_3= '-' )+ )
                    // InternalMyDsl.g:654:5: otherlv_1= '-' otherlv_2= '-' (otherlv_3= '-' )+
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_0_1_0());
                      				
                    }
                    otherlv_2=(Token)match(input,14,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_0_1_1());
                      				
                    }
                    // InternalMyDsl.g:662:5: (otherlv_3= '-' )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==14) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalMyDsl.g:663:6: otherlv_3= '-'
                    	    {
                    	    otherlv_3=(Token)match(input,14,FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_3, grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_0_1_2());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:671:3: (otherlv_4= '_' otherlv_5= '_' (otherlv_6= '_' )+ )
                    {
                    // InternalMyDsl.g:671:3: (otherlv_4= '_' otherlv_5= '_' (otherlv_6= '_' )+ )
                    // InternalMyDsl.g:672:4: otherlv_4= '_' otherlv_5= '_' (otherlv_6= '_' )+
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getHorizontalExpressionAccess().get_Keyword_1_0());
                      			
                    }
                    otherlv_5=(Token)match(input,18,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getHorizontalExpressionAccess().get_Keyword_1_1());
                      			
                    }
                    // InternalMyDsl.g:680:4: (otherlv_6= '_' )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==18) ) {
                            int LA20_2 = input.LA(2);

                            if ( (LA20_2==EOF||LA20_2==RULE_BL||(LA20_2>=RULE_INT && LA20_2<=RULE_STRING)||(LA20_2>=13 && LA20_2<=15)||(LA20_2>=17 && LA20_2<=20)||(LA20_2>=26 && LA20_2<=27)||(LA20_2>=29 && LA20_2<=38)) ) {
                                alt20=1;
                            }


                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalMyDsl.g:681:5: otherlv_6= '_'
                    	    {
                    	    otherlv_6=(Token)match(input,18,FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getHorizontalExpressionAccess().get_Keyword_1_2());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);


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
    // $ANTLR end "ruleHorizontalExpression"


    // $ANTLR start "entryRuleTabExpression"
    // InternalMyDsl.g:691:1: entryRuleTabExpression returns [EObject current=null] : iv_ruleTabExpression= ruleTabExpression EOF ;
    public final EObject entryRuleTabExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabExpression = null;


        try {
            // InternalMyDsl.g:691:54: (iv_ruleTabExpression= ruleTabExpression EOF )
            // InternalMyDsl.g:692:2: iv_ruleTabExpression= ruleTabExpression EOF
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
    // InternalMyDsl.g:698:1: ruleTabExpression returns [EObject current=null] : ( () ( ( ( ( ( '|' )=> ( ruleLineExpression ) ) RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )* ) )=> ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* ) ) ) ;
    public final EObject ruleTabExpression() throws RecognitionException {
        EObject current = null;

        Token this_BL_2=null;
        Token this_BL_4=null;
        EObject lv_header_1_0 = null;

        EObject lv_lines_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:704:2: ( ( () ( ( ( ( ( '|' )=> ( ruleLineExpression ) ) RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )* ) )=> ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* ) ) ) )
            // InternalMyDsl.g:705:2: ( () ( ( ( ( ( '|' )=> ( ruleLineExpression ) ) RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )* ) )=> ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* ) ) )
            {
            // InternalMyDsl.g:705:2: ( () ( ( ( ( ( '|' )=> ( ruleLineExpression ) ) RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )* ) )=> ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* ) ) )
            // InternalMyDsl.g:706:3: () ( ( ( ( ( '|' )=> ( ruleLineExpression ) ) RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )* ) )=> ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* ) )
            {
            // InternalMyDsl.g:706:3: ()
            // InternalMyDsl.g:707:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTabExpressionAccess().getTabExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:713:3: ( ( ( ( ( '|' )=> ( ruleLineExpression ) ) RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )* ) )=> ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* ) )
            // InternalMyDsl.g:714:4: ( ( ( ( '|' )=> ( ruleLineExpression ) ) RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )* ) )=> ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* )
            {
            // InternalMyDsl.g:752:4: ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* )
            // InternalMyDsl.g:753:5: ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )*
            {
            // InternalMyDsl.g:753:5: ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) )
            // InternalMyDsl.g:754:6: ( '|' )=> (lv_header_1_0= ruleLineExpression )
            {
            // InternalMyDsl.g:755:6: (lv_header_1_0= ruleLineExpression )
            // InternalMyDsl.g:756:7: lv_header_1_0= ruleLineExpression
            {
            if ( state.backtracking==0 ) {

              							newCompositeNode(grammarAccess.getTabExpressionAccess().getHeaderLineExpressionParserRuleCall_1_0_0_0());
              						
            }
            pushFollow(FOLLOW_17);
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

            this_BL_2=(Token)match(input,RULE_BL,FOLLOW_18); if (state.failed) return current;
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
            // InternalMyDsl.g:784:5: ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )*
            loop22:
            do {
                int alt22=2;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:785:6: ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) )
            	    {
            	    // InternalMyDsl.g:798:6: (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) )
            	    // InternalMyDsl.g:799:7: this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) )
            	    {
            	    this_BL_4=(Token)match(input,RULE_BL,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(this_BL_4, grammarAccess.getTabExpressionAccess().getBLTerminalRuleCall_1_0_3_0_0());
            	      						
            	    }
            	    // InternalMyDsl.g:803:7: ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) )
            	    // InternalMyDsl.g:804:8: ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression )
            	    {
            	    // InternalMyDsl.g:808:8: (lv_lines_5_0= ruleLineExpression )
            	    // InternalMyDsl.g:809:9: lv_lines_5_0= ruleLineExpression
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
            	    break loop22;
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
    // InternalMyDsl.g:834:1: entryRuleTabSeparation returns [String current=null] : iv_ruleTabSeparation= ruleTabSeparation EOF ;
    public final String entryRuleTabSeparation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTabSeparation = null;


        try {
            // InternalMyDsl.g:834:53: (iv_ruleTabSeparation= ruleTabSeparation EOF )
            // InternalMyDsl.g:835:2: iv_ruleTabSeparation= ruleTabSeparation EOF
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
    // InternalMyDsl.g:841:1: ruleTabSeparation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '|' )? kw= '-' (kw= '-' )+ (kw= '|' kw= '-' (kw= '-' )+ )+ (kw= '|' )? ) ;
    public final AntlrDatatypeRuleToken ruleTabSeparation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:847:2: ( ( (kw= '|' )? kw= '-' (kw= '-' )+ (kw= '|' kw= '-' (kw= '-' )+ )+ (kw= '|' )? ) )
            // InternalMyDsl.g:848:2: ( (kw= '|' )? kw= '-' (kw= '-' )+ (kw= '|' kw= '-' (kw= '-' )+ )+ (kw= '|' )? )
            {
            // InternalMyDsl.g:848:2: ( (kw= '|' )? kw= '-' (kw= '-' )+ (kw= '|' kw= '-' (kw= '-' )+ )+ (kw= '|' )? )
            // InternalMyDsl.g:849:3: (kw= '|' )? kw= '-' (kw= '-' )+ (kw= '|' kw= '-' (kw= '-' )+ )+ (kw= '|' )?
            {
            // InternalMyDsl.g:849:3: (kw= '|' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==19) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:850:4: kw= '|'
                    {
                    kw=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTabSeparationAccess().getVerticalLineKeyword_0());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,14,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_1());
              		
            }
            // InternalMyDsl.g:861:3: (kw= '-' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==14) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMyDsl.g:862:4: kw= '-'
            	    {
            	    kw=(Token)match(input,14,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            // InternalMyDsl.g:868:3: (kw= '|' kw= '-' (kw= '-' )+ )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==19) ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==14) ) {
                        int LA26_3 = input.LA(3);

                        if ( (LA26_3==14) ) {
                            alt26=1;
                        }


                    }


                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyDsl.g:869:4: kw= '|' kw= '-' (kw= '-' )+
            	    {
            	    kw=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getTabSeparationAccess().getVerticalLineKeyword_3_0());
            	      			
            	    }
            	    kw=(Token)match(input,14,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_3_1());
            	      			
            	    }
            	    // InternalMyDsl.g:879:4: (kw= '-' )+
            	    int cnt25=0;
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( (LA25_0==14) ) {
            	            alt25=1;
            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:880:5: kw= '-'
            	    	    {
            	    	    kw=(Token)match(input,14,FOLLOW_20); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					current.merge(kw);
            	    	      					newLeafNode(kw, grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_3_2());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt25 >= 1 ) break loop25;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(25, input);
            	                throw eee;
            	        }
            	        cnt25++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            // InternalMyDsl.g:887:3: (kw= '|' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==19) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:888:4: kw= '|'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:898:1: entryRuleLineExpression returns [EObject current=null] : iv_ruleLineExpression= ruleLineExpression EOF ;
    public final EObject entryRuleLineExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineExpression = null;


        try {
            // InternalMyDsl.g:898:55: (iv_ruleLineExpression= ruleLineExpression EOF )
            // InternalMyDsl.g:899:2: iv_ruleLineExpression= ruleLineExpression EOF
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
    // InternalMyDsl.g:905:1: ruleLineExpression returns [EObject current=null] : ( ( ( '|' )=>otherlv_0= '|' )? ( (lv_cells_1_0= ruleNaturalExpression ) ) ( ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) ) )* ( ( '|' )=>otherlv_4= '|' )? ) ;
    public final EObject ruleLineExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_cells_1_0 = null;

        EObject lv_cells_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:911:2: ( ( ( ( '|' )=>otherlv_0= '|' )? ( (lv_cells_1_0= ruleNaturalExpression ) ) ( ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) ) )* ( ( '|' )=>otherlv_4= '|' )? ) )
            // InternalMyDsl.g:912:2: ( ( ( '|' )=>otherlv_0= '|' )? ( (lv_cells_1_0= ruleNaturalExpression ) ) ( ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) ) )* ( ( '|' )=>otherlv_4= '|' )? )
            {
            // InternalMyDsl.g:912:2: ( ( ( '|' )=>otherlv_0= '|' )? ( (lv_cells_1_0= ruleNaturalExpression ) ) ( ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) ) )* ( ( '|' )=>otherlv_4= '|' )? )
            // InternalMyDsl.g:913:3: ( ( '|' )=>otherlv_0= '|' )? ( (lv_cells_1_0= ruleNaturalExpression ) ) ( ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) ) )* ( ( '|' )=>otherlv_4= '|' )?
            {
            // InternalMyDsl.g:913:3: ( ( '|' )=>otherlv_0= '|' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==19) ) {
                int LA28_1 = input.LA(2);

                if ( (synpred25_InternalMyDsl()) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:914:4: ( '|' )=>otherlv_0= '|'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getLineExpressionAccess().getVerticalLineKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalMyDsl.g:920:3: ( (lv_cells_1_0= ruleNaturalExpression ) )
            // InternalMyDsl.g:921:4: (lv_cells_1_0= ruleNaturalExpression )
            {
            // InternalMyDsl.g:921:4: (lv_cells_1_0= ruleNaturalExpression )
            // InternalMyDsl.g:922:5: lv_cells_1_0= ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLineExpressionAccess().getCellsNaturalExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_21);
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

            // InternalMyDsl.g:939:3: ( ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) ) )*
            loop29:
            do {
                int alt29=2;
                alt29 = dfa29.predict(input);
                switch (alt29) {
            	case 1 :
            	    // InternalMyDsl.g:940:4: ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) )
            	    {
            	    // InternalMyDsl.g:940:4: ( ( '|' )=>otherlv_2= '|' )
            	    // InternalMyDsl.g:941:5: ( '|' )=>otherlv_2= '|'
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getLineExpressionAccess().getVerticalLineKeyword_2_0());
            	      				
            	    }

            	    }

            	    // InternalMyDsl.g:947:4: ( (lv_cells_3_0= ruleNaturalExpression ) )
            	    // InternalMyDsl.g:948:5: (lv_cells_3_0= ruleNaturalExpression )
            	    {
            	    // InternalMyDsl.g:948:5: (lv_cells_3_0= ruleNaturalExpression )
            	    // InternalMyDsl.g:949:6: lv_cells_3_0= ruleNaturalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLineExpressionAccess().getCellsNaturalExpressionParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_21);
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
            	    break loop29;
                }
            } while (true);

            // InternalMyDsl.g:967:3: ( ( '|' )=>otherlv_4= '|' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==19) ) {
                int LA30_1 = input.LA(2);

                if ( (synpred27_InternalMyDsl()) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:968:4: ( '|' )=>otherlv_4= '|'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleURLedExpression"
    // InternalMyDsl.g:978:1: entryRuleURLedExpression returns [EObject current=null] : iv_ruleURLedExpression= ruleURLedExpression EOF ;
    public final EObject entryRuleURLedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURLedExpression = null;


        try {
            // InternalMyDsl.g:978:56: (iv_ruleURLedExpression= ruleURLedExpression EOF )
            // InternalMyDsl.g:979:2: iv_ruleURLedExpression= ruleURLedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURLedExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleURLedExpression=ruleURLedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURLedExpression; 
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
    // $ANTLR end "entryRuleURLedExpression"


    // $ANTLR start "ruleURLedExpression"
    // InternalMyDsl.g:985:1: ruleURLedExpression returns [EObject current=null] : ( () ( ( ( ( ( ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) )=> ( ( (lv_c_1_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_2_0= ruleVideoExpression ) ) ) ) | ( (lv_c_3_0= ruleLinkExpression ) ) ) ) ;
    public final EObject ruleURLedExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_c_1_0 = null;

        EObject lv_c_2_0 = null;

        EObject lv_c_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:991:2: ( ( () ( ( ( ( ( ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) )=> ( ( (lv_c_1_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_2_0= ruleVideoExpression ) ) ) ) | ( (lv_c_3_0= ruleLinkExpression ) ) ) ) )
            // InternalMyDsl.g:992:2: ( () ( ( ( ( ( ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) )=> ( ( (lv_c_1_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_2_0= ruleVideoExpression ) ) ) ) | ( (lv_c_3_0= ruleLinkExpression ) ) ) )
            {
            // InternalMyDsl.g:992:2: ( () ( ( ( ( ( ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) )=> ( ( (lv_c_1_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_2_0= ruleVideoExpression ) ) ) ) | ( (lv_c_3_0= ruleLinkExpression ) ) ) )
            // InternalMyDsl.g:993:3: () ( ( ( ( ( ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) )=> ( ( (lv_c_1_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_2_0= ruleVideoExpression ) ) ) ) | ( (lv_c_3_0= ruleLinkExpression ) ) )
            {
            // InternalMyDsl.g:993:3: ()
            // InternalMyDsl.g:994:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getURLedExpressionAccess().getURLedExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:1000:3: ( ( ( ( ( ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) )=> ( ( (lv_c_1_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_2_0= ruleVideoExpression ) ) ) ) | ( (lv_c_3_0= ruleLinkExpression ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==26) && (synpred29_InternalMyDsl())) {
                alt32=1;
            }
            else if ( (LA32_0==27) && (synpred29_InternalMyDsl())) {
                alt32=1;
            }
            else if ( (LA32_0==20) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:1001:4: ( ( ( ( ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) )=> ( ( (lv_c_1_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_2_0= ruleVideoExpression ) ) ) )
                    {
                    // InternalMyDsl.g:1001:4: ( ( ( ( ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) )=> ( ( (lv_c_1_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_2_0= ruleVideoExpression ) ) ) )
                    // InternalMyDsl.g:1002:5: ( ( ( ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) )=> ( ( (lv_c_1_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_2_0= ruleVideoExpression ) ) )
                    {
                    // InternalMyDsl.g:1020:5: ( ( (lv_c_1_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_2_0= ruleVideoExpression ) ) )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==26) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==27) && (synpred30_InternalMyDsl())) {
                        alt31=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalMyDsl.g:1021:6: ( (lv_c_1_0= ruleImageExpression ) )
                            {
                            // InternalMyDsl.g:1021:6: ( (lv_c_1_0= ruleImageExpression ) )
                            // InternalMyDsl.g:1022:7: (lv_c_1_0= ruleImageExpression )
                            {
                            // InternalMyDsl.g:1022:7: (lv_c_1_0= ruleImageExpression )
                            // InternalMyDsl.g:1023:8: lv_c_1_0= ruleImageExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getURLedExpressionAccess().getCImageExpressionParserRuleCall_1_0_0_0_0());
                              							
                            }
                            pushFollow(FOLLOW_2);
                            lv_c_1_0=ruleImageExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getURLedExpressionRule());
                              								}
                              								set(
                              									current,
                              									"c",
                              									lv_c_1_0,
                              									"markHammil.mm.MyDsl.ImageExpression");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:1041:6: ( ( ( ruleVideoExpression ) )=> (lv_c_2_0= ruleVideoExpression ) )
                            {
                            // InternalMyDsl.g:1041:6: ( ( ( ruleVideoExpression ) )=> (lv_c_2_0= ruleVideoExpression ) )
                            // InternalMyDsl.g:1042:7: ( ( ruleVideoExpression ) )=> (lv_c_2_0= ruleVideoExpression )
                            {
                            // InternalMyDsl.g:1046:7: (lv_c_2_0= ruleVideoExpression )
                            // InternalMyDsl.g:1047:8: lv_c_2_0= ruleVideoExpression
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getURLedExpressionAccess().getCVideoExpressionParserRuleCall_1_0_0_1_0());
                              							
                            }
                            pushFollow(FOLLOW_2);
                            lv_c_2_0=ruleVideoExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getURLedExpressionRule());
                              								}
                              								set(
                              									current,
                              									"c",
                              									lv_c_2_0,
                              									"markHammil.mm.MyDsl.VideoExpression");
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
                    // InternalMyDsl.g:1067:4: ( (lv_c_3_0= ruleLinkExpression ) )
                    {
                    // InternalMyDsl.g:1067:4: ( (lv_c_3_0= ruleLinkExpression ) )
                    // InternalMyDsl.g:1068:5: (lv_c_3_0= ruleLinkExpression )
                    {
                    // InternalMyDsl.g:1068:5: (lv_c_3_0= ruleLinkExpression )
                    // InternalMyDsl.g:1069:6: lv_c_3_0= ruleLinkExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getURLedExpressionAccess().getCLinkExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_c_3_0=ruleLinkExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getURLedExpressionRule());
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
    // $ANTLR end "ruleURLedExpression"


    // $ANTLR start "entryRuleRefExpression"
    // InternalMyDsl.g:1091:1: entryRuleRefExpression returns [EObject current=null] : iv_ruleRefExpression= ruleRefExpression EOF ;
    public final EObject entryRuleRefExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefExpression = null;


        try {
            // InternalMyDsl.g:1091:54: (iv_ruleRefExpression= ruleRefExpression EOF )
            // InternalMyDsl.g:1092:2: iv_ruleRefExpression= ruleRefExpression EOF
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
    // InternalMyDsl.g:1098:1: ruleRefExpression returns [EObject current=null] : ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_refName_2_0= ruleNaturalExpression ) ) ( ( ']:' )=>otherlv_3= ']:' ) ( (lv_refContent_4_0= ruleNaturalExpression ) )? ( ( RULE_BL )=>this_BL_5= RULE_BL )? ) ;
    public final EObject ruleRefExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_5=null;
        EObject lv_refName_2_0 = null;

        EObject lv_refContent_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1104:2: ( ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_refName_2_0= ruleNaturalExpression ) ) ( ( ']:' )=>otherlv_3= ']:' ) ( (lv_refContent_4_0= ruleNaturalExpression ) )? ( ( RULE_BL )=>this_BL_5= RULE_BL )? ) )
            // InternalMyDsl.g:1105:2: ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_refName_2_0= ruleNaturalExpression ) ) ( ( ']:' )=>otherlv_3= ']:' ) ( (lv_refContent_4_0= ruleNaturalExpression ) )? ( ( RULE_BL )=>this_BL_5= RULE_BL )? )
            {
            // InternalMyDsl.g:1105:2: ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_refName_2_0= ruleNaturalExpression ) ) ( ( ']:' )=>otherlv_3= ']:' ) ( (lv_refContent_4_0= ruleNaturalExpression ) )? ( ( RULE_BL )=>this_BL_5= RULE_BL )? )
            // InternalMyDsl.g:1106:3: () ( ( '[' )=>otherlv_1= '[' ) ( (lv_refName_2_0= ruleNaturalExpression ) ) ( ( ']:' )=>otherlv_3= ']:' ) ( (lv_refContent_4_0= ruleNaturalExpression ) )? ( ( RULE_BL )=>this_BL_5= RULE_BL )?
            {
            // InternalMyDsl.g:1106:3: ()
            // InternalMyDsl.g:1107:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRefExpressionAccess().getRefExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:1113:3: ( ( '[' )=>otherlv_1= '[' )
            // InternalMyDsl.g:1114:4: ( '[' )=>otherlv_1= '['
            {
            otherlv_1=(Token)match(input,20,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getRefExpressionAccess().getLeftSquareBracketKeyword_1());
              			
            }

            }

            // InternalMyDsl.g:1120:3: ( (lv_refName_2_0= ruleNaturalExpression ) )
            // InternalMyDsl.g:1121:4: (lv_refName_2_0= ruleNaturalExpression )
            {
            // InternalMyDsl.g:1121:4: (lv_refName_2_0= ruleNaturalExpression )
            // InternalMyDsl.g:1122:5: lv_refName_2_0= ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRefExpressionAccess().getRefNameNaturalExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_22);
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

            // InternalMyDsl.g:1139:3: ( ( ']:' )=>otherlv_3= ']:' )
            // InternalMyDsl.g:1140:4: ( ']:' )=>otherlv_3= ']:'
            {
            otherlv_3=(Token)match(input,21,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getRefExpressionAccess().getRightSquareBracketColonKeyword_3());
              			
            }

            }

            // InternalMyDsl.g:1146:3: ( (lv_refContent_4_0= ruleNaturalExpression ) )?
            int alt33=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt33=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt33=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt33=1;
                    }
                    break;
                case 37:
                    {
                    alt33=1;
                    }
                    break;
                case 14:
                    {
                    alt33=1;
                    }
                    break;
                case 19:
                    {
                    alt33=1;
                    }
                    break;
                case 38:
                    {
                    alt33=1;
                    }
                    break;
            }

            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:1147:4: (lv_refContent_4_0= ruleNaturalExpression )
                    {
                    // InternalMyDsl.g:1147:4: (lv_refContent_4_0= ruleNaturalExpression )
                    // InternalMyDsl.g:1148:5: lv_refContent_4_0= ruleNaturalExpression
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

            // InternalMyDsl.g:1165:3: ( ( RULE_BL )=>this_BL_5= RULE_BL )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_BL) ) {
                int LA34_1 = input.LA(2);

                if ( (synpred33_InternalMyDsl()) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:1166:4: ( RULE_BL )=>this_BL_5= RULE_BL
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
    // InternalMyDsl.g:1176:1: entryRuleLinkExpression returns [EObject current=null] : iv_ruleLinkExpression= ruleLinkExpression EOF ;
    public final EObject entryRuleLinkExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkExpression = null;


        try {
            // InternalMyDsl.g:1176:55: (iv_ruleLinkExpression= ruleLinkExpression EOF )
            // InternalMyDsl.g:1177:2: iv_ruleLinkExpression= ruleLinkExpression EOF
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
    // InternalMyDsl.g:1183:1: ruleLinkExpression returns [EObject current=null] : ( ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) | ( ( ( '[' )=>otherlv_7= '[' ) ( (lv_altText_8_0= ruleNaturalExpression ) ) ( ( '][' )=>otherlv_9= '][' ) ( (lv_refName_10_0= ruleNaturalExpression ) )? ( ( ']' )=>otherlv_11= ']' ) ( ( RULE_BL )=>this_BL_12= RULE_BL )? ) ) ;
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
            // InternalMyDsl.g:1189:2: ( ( ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) | ( ( ( '[' )=>otherlv_7= '[' ) ( (lv_altText_8_0= ruleNaturalExpression ) ) ( ( '][' )=>otherlv_9= '][' ) ( (lv_refName_10_0= ruleNaturalExpression ) )? ( ( ']' )=>otherlv_11= ']' ) ( ( RULE_BL )=>this_BL_12= RULE_BL )? ) ) )
            // InternalMyDsl.g:1190:2: ( ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) | ( ( ( '[' )=>otherlv_7= '[' ) ( (lv_altText_8_0= ruleNaturalExpression ) ) ( ( '][' )=>otherlv_9= '][' ) ( (lv_refName_10_0= ruleNaturalExpression ) )? ( ( ']' )=>otherlv_11= ']' ) ( ( RULE_BL )=>this_BL_12= RULE_BL )? ) )
            {
            // InternalMyDsl.g:1190:2: ( ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) | ( ( ( '[' )=>otherlv_7= '[' ) ( (lv_altText_8_0= ruleNaturalExpression ) ) ( ( '][' )=>otherlv_9= '][' ) ( (lv_refName_10_0= ruleNaturalExpression ) )? ( ( ']' )=>otherlv_11= ']' ) ( ( RULE_BL )=>this_BL_12= RULE_BL )? ) )
            int alt39=2;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:1191:3: ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )
                    {
                    // InternalMyDsl.g:1191:3: ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )
                    // InternalMyDsl.g:1192:4: () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )?
                    {
                    // InternalMyDsl.g:1192:4: ()
                    // InternalMyDsl.g:1193:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getLinkExpressionAccess().getLinkExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMyDsl.g:1199:4: ( ( '[' )=>otherlv_1= '[' )
                    // InternalMyDsl.g:1200:5: ( '[' )=>otherlv_1= '['
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getLinkExpressionAccess().getLeftSquareBracketKeyword_0_1());
                      				
                    }

                    }

                    // InternalMyDsl.g:1206:4: ( (lv_altText_2_0= ruleNaturalExpression ) )
                    // InternalMyDsl.g:1207:5: (lv_altText_2_0= ruleNaturalExpression )
                    {
                    // InternalMyDsl.g:1207:5: (lv_altText_2_0= ruleNaturalExpression )
                    // InternalMyDsl.g:1208:6: lv_altText_2_0= ruleNaturalExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLinkExpressionAccess().getAltTextNaturalExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
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

                    // InternalMyDsl.g:1225:4: ( ( '](' )=>otherlv_3= '](' )
                    // InternalMyDsl.g:1226:5: ( '](' )=>otherlv_3= ']('
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getLinkExpressionAccess().getRightSquareBracketLeftParenthesisKeyword_0_3());
                      				
                    }

                    }

                    // InternalMyDsl.g:1232:4: ( (lv_linkContent_4_0= ruleNaturalExpression ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( ((LA35_0>=RULE_INT && LA35_0<=RULE_STRING)||LA35_0==14||LA35_0==19||(LA35_0>=37 && LA35_0<=38)) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalMyDsl.g:1233:5: (lv_linkContent_4_0= ruleNaturalExpression )
                            {
                            // InternalMyDsl.g:1233:5: (lv_linkContent_4_0= ruleNaturalExpression )
                            // InternalMyDsl.g:1234:6: lv_linkContent_4_0= ruleNaturalExpression
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getLinkExpressionAccess().getLinkContentNaturalExpressionParserRuleCall_0_4_0());
                              					
                            }
                            pushFollow(FOLLOW_26);
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

                    // InternalMyDsl.g:1251:4: ( ( ')' )=>otherlv_5= ')' )
                    // InternalMyDsl.g:1252:5: ( ')' )=>otherlv_5= ')'
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getLinkExpressionAccess().getRightParenthesisKeyword_0_5());
                      				
                    }

                    }

                    // InternalMyDsl.g:1258:4: ( ( RULE_BL )=>this_BL_6= RULE_BL )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==RULE_BL) ) {
                        int LA36_1 = input.LA(2);

                        if ( (synpred37_InternalMyDsl()) ) {
                            alt36=1;
                        }
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalMyDsl.g:1259:5: ( RULE_BL )=>this_BL_6= RULE_BL
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
                    // InternalMyDsl.g:1267:3: ( ( ( '[' )=>otherlv_7= '[' ) ( (lv_altText_8_0= ruleNaturalExpression ) ) ( ( '][' )=>otherlv_9= '][' ) ( (lv_refName_10_0= ruleNaturalExpression ) )? ( ( ']' )=>otherlv_11= ']' ) ( ( RULE_BL )=>this_BL_12= RULE_BL )? )
                    {
                    // InternalMyDsl.g:1267:3: ( ( ( '[' )=>otherlv_7= '[' ) ( (lv_altText_8_0= ruleNaturalExpression ) ) ( ( '][' )=>otherlv_9= '][' ) ( (lv_refName_10_0= ruleNaturalExpression ) )? ( ( ']' )=>otherlv_11= ']' ) ( ( RULE_BL )=>this_BL_12= RULE_BL )? )
                    // InternalMyDsl.g:1268:4: ( ( '[' )=>otherlv_7= '[' ) ( (lv_altText_8_0= ruleNaturalExpression ) ) ( ( '][' )=>otherlv_9= '][' ) ( (lv_refName_10_0= ruleNaturalExpression ) )? ( ( ']' )=>otherlv_11= ']' ) ( ( RULE_BL )=>this_BL_12= RULE_BL )?
                    {
                    // InternalMyDsl.g:1268:4: ( ( '[' )=>otherlv_7= '[' )
                    // InternalMyDsl.g:1269:5: ( '[' )=>otherlv_7= '['
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getLinkExpressionAccess().getLeftSquareBracketKeyword_1_0());
                      				
                    }

                    }

                    // InternalMyDsl.g:1275:4: ( (lv_altText_8_0= ruleNaturalExpression ) )
                    // InternalMyDsl.g:1276:5: (lv_altText_8_0= ruleNaturalExpression )
                    {
                    // InternalMyDsl.g:1276:5: (lv_altText_8_0= ruleNaturalExpression )
                    // InternalMyDsl.g:1277:6: lv_altText_8_0= ruleNaturalExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLinkExpressionAccess().getAltTextNaturalExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_27);
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

                    // InternalMyDsl.g:1294:4: ( ( '][' )=>otherlv_9= '][' )
                    // InternalMyDsl.g:1295:5: ( '][' )=>otherlv_9= ']['
                    {
                    otherlv_9=(Token)match(input,24,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getLinkExpressionAccess().getRightSquareBracketLeftSquareBracketKeyword_1_2());
                      				
                    }

                    }

                    // InternalMyDsl.g:1301:4: ( (lv_refName_10_0= ruleNaturalExpression ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( ((LA37_0>=RULE_INT && LA37_0<=RULE_STRING)||LA37_0==14||LA37_0==19||(LA37_0>=37 && LA37_0<=38)) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalMyDsl.g:1302:5: (lv_refName_10_0= ruleNaturalExpression )
                            {
                            // InternalMyDsl.g:1302:5: (lv_refName_10_0= ruleNaturalExpression )
                            // InternalMyDsl.g:1303:6: lv_refName_10_0= ruleNaturalExpression
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getLinkExpressionAccess().getRefNameNaturalExpressionParserRuleCall_1_3_0());
                              					
                            }
                            pushFollow(FOLLOW_29);
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

                    // InternalMyDsl.g:1320:4: ( ( ']' )=>otherlv_11= ']' )
                    // InternalMyDsl.g:1321:5: ( ']' )=>otherlv_11= ']'
                    {
                    otherlv_11=(Token)match(input,25,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getLinkExpressionAccess().getRightSquareBracketKeyword_1_4());
                      				
                    }

                    }

                    // InternalMyDsl.g:1327:4: ( ( RULE_BL )=>this_BL_12= RULE_BL )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==RULE_BL) ) {
                        int LA38_1 = input.LA(2);

                        if ( (synpred41_InternalMyDsl()) ) {
                            alt38=1;
                        }
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalMyDsl.g:1328:5: ( RULE_BL )=>this_BL_12= RULE_BL
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
    // InternalMyDsl.g:1339:1: entryRuleImageExpression returns [EObject current=null] : iv_ruleImageExpression= ruleImageExpression EOF ;
    public final EObject entryRuleImageExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageExpression = null;


        try {
            // InternalMyDsl.g:1339:56: (iv_ruleImageExpression= ruleImageExpression EOF )
            // InternalMyDsl.g:1340:2: iv_ruleImageExpression= ruleImageExpression EOF
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
    // InternalMyDsl.g:1346:1: ruleImageExpression returns [EObject current=null] : ( () ( ( '![' )=>otherlv_1= '![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) ;
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
            // InternalMyDsl.g:1352:2: ( ( () ( ( '![' )=>otherlv_1= '![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) )
            // InternalMyDsl.g:1353:2: ( () ( ( '![' )=>otherlv_1= '![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )
            {
            // InternalMyDsl.g:1353:2: ( () ( ( '![' )=>otherlv_1= '![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )
            // InternalMyDsl.g:1354:3: () ( ( '![' )=>otherlv_1= '![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )?
            {
            // InternalMyDsl.g:1354:3: ()
            // InternalMyDsl.g:1355:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getImageExpressionAccess().getImageExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:1361:3: ( ( '![' )=>otherlv_1= '![' )
            // InternalMyDsl.g:1362:4: ( '![' )=>otherlv_1= '!['
            {
            otherlv_1=(Token)match(input,26,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getImageExpressionAccess().getExclamationMarkLeftSquareBracketKeyword_1());
              			
            }

            }

            // InternalMyDsl.g:1368:3: ( (lv_altText_2_0= ruleNaturalExpression ) )
            // InternalMyDsl.g:1369:4: (lv_altText_2_0= ruleNaturalExpression )
            {
            // InternalMyDsl.g:1369:4: (lv_altText_2_0= ruleNaturalExpression )
            // InternalMyDsl.g:1370:5: lv_altText_2_0= ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImageExpressionAccess().getAltTextNaturalExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_24);
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

            // InternalMyDsl.g:1387:3: ( ( '](' )=>otherlv_3= '](' )
            // InternalMyDsl.g:1388:4: ( '](' )=>otherlv_3= ']('
            {
            otherlv_3=(Token)match(input,22,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getImageExpressionAccess().getRightSquareBracketLeftParenthesisKeyword_3());
              			
            }

            }

            // InternalMyDsl.g:1394:3: ( (lv_linkContent_4_0= ruleNaturalExpression ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_INT && LA40_0<=RULE_STRING)||LA40_0==14||LA40_0==19||(LA40_0>=37 && LA40_0<=38)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:1395:4: (lv_linkContent_4_0= ruleNaturalExpression )
                    {
                    // InternalMyDsl.g:1395:4: (lv_linkContent_4_0= ruleNaturalExpression )
                    // InternalMyDsl.g:1396:5: lv_linkContent_4_0= ruleNaturalExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImageExpressionAccess().getLinkContentNaturalExpressionParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_26);
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

            // InternalMyDsl.g:1413:3: ( ( ')' )=>otherlv_5= ')' )
            // InternalMyDsl.g:1414:4: ( ')' )=>otherlv_5= ')'
            {
            otherlv_5=(Token)match(input,23,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getImageExpressionAccess().getRightParenthesisKeyword_5());
              			
            }

            }

            // InternalMyDsl.g:1420:3: ( ( RULE_BL )=>this_BL_6= RULE_BL )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_BL) ) {
                int LA41_1 = input.LA(2);

                if ( (synpred45_InternalMyDsl()) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:1421:4: ( RULE_BL )=>this_BL_6= RULE_BL
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
    // InternalMyDsl.g:1431:1: entryRuleVideoExpression returns [EObject current=null] : iv_ruleVideoExpression= ruleVideoExpression EOF ;
    public final EObject entryRuleVideoExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoExpression = null;


        try {
            // InternalMyDsl.g:1431:56: (iv_ruleVideoExpression= ruleVideoExpression EOF )
            // InternalMyDsl.g:1432:2: iv_ruleVideoExpression= ruleVideoExpression EOF
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
    // InternalMyDsl.g:1438:1: ruleVideoExpression returns [EObject current=null] : ( () ( ( '[![' )=>otherlv_1= '[![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkImage_4_0= ruleNaturalExpression ) )? ( ( ')](' )=>otherlv_5= ')](' ) ( (lv_linkVideo_6_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_7= ')' ) ( ( RULE_BL )=>this_BL_8= RULE_BL )? ) ;
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
            // InternalMyDsl.g:1444:2: ( ( () ( ( '[![' )=>otherlv_1= '[![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkImage_4_0= ruleNaturalExpression ) )? ( ( ')](' )=>otherlv_5= ')](' ) ( (lv_linkVideo_6_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_7= ')' ) ( ( RULE_BL )=>this_BL_8= RULE_BL )? ) )
            // InternalMyDsl.g:1445:2: ( () ( ( '[![' )=>otherlv_1= '[![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkImage_4_0= ruleNaturalExpression ) )? ( ( ')](' )=>otherlv_5= ')](' ) ( (lv_linkVideo_6_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_7= ')' ) ( ( RULE_BL )=>this_BL_8= RULE_BL )? )
            {
            // InternalMyDsl.g:1445:2: ( () ( ( '[![' )=>otherlv_1= '[![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkImage_4_0= ruleNaturalExpression ) )? ( ( ')](' )=>otherlv_5= ')](' ) ( (lv_linkVideo_6_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_7= ')' ) ( ( RULE_BL )=>this_BL_8= RULE_BL )? )
            // InternalMyDsl.g:1446:3: () ( ( '[![' )=>otherlv_1= '[![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkImage_4_0= ruleNaturalExpression ) )? ( ( ')](' )=>otherlv_5= ')](' ) ( (lv_linkVideo_6_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_7= ')' ) ( ( RULE_BL )=>this_BL_8= RULE_BL )?
            {
            // InternalMyDsl.g:1446:3: ()
            // InternalMyDsl.g:1447:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVideoExpressionAccess().getVideoExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:1453:3: ( ( '[![' )=>otherlv_1= '[![' )
            // InternalMyDsl.g:1454:4: ( '[![' )=>otherlv_1= '[!['
            {
            otherlv_1=(Token)match(input,27,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getVideoExpressionAccess().getLeftSquareBracketExclamationMarkLeftSquareBracketKeyword_1());
              			
            }

            }

            // InternalMyDsl.g:1460:3: ( (lv_altText_2_0= ruleNaturalExpression ) )
            // InternalMyDsl.g:1461:4: (lv_altText_2_0= ruleNaturalExpression )
            {
            // InternalMyDsl.g:1461:4: (lv_altText_2_0= ruleNaturalExpression )
            // InternalMyDsl.g:1462:5: lv_altText_2_0= ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVideoExpressionAccess().getAltTextNaturalExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_24);
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

            // InternalMyDsl.g:1479:3: ( ( '](' )=>otherlv_3= '](' )
            // InternalMyDsl.g:1480:4: ( '](' )=>otherlv_3= ']('
            {
            otherlv_3=(Token)match(input,22,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getVideoExpressionAccess().getRightSquareBracketLeftParenthesisKeyword_3());
              			
            }

            }

            // InternalMyDsl.g:1486:3: ( (lv_linkImage_4_0= ruleNaturalExpression ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_INT && LA42_0<=RULE_STRING)||LA42_0==14||LA42_0==19||(LA42_0>=37 && LA42_0<=38)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:1487:4: (lv_linkImage_4_0= ruleNaturalExpression )
                    {
                    // InternalMyDsl.g:1487:4: (lv_linkImage_4_0= ruleNaturalExpression )
                    // InternalMyDsl.g:1488:5: lv_linkImage_4_0= ruleNaturalExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVideoExpressionAccess().getLinkImageNaturalExpressionParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_31);
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

            // InternalMyDsl.g:1505:3: ( ( ')](' )=>otherlv_5= ')](' )
            // InternalMyDsl.g:1506:4: ( ')](' )=>otherlv_5= ')]('
            {
            otherlv_5=(Token)match(input,28,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getVideoExpressionAccess().getRightParenthesisRightSquareBracketLeftParenthesisKeyword_5());
              			
            }

            }

            // InternalMyDsl.g:1512:3: ( (lv_linkVideo_6_0= ruleNaturalExpression ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_INT && LA43_0<=RULE_STRING)||LA43_0==14||LA43_0==19||(LA43_0>=37 && LA43_0<=38)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:1513:4: (lv_linkVideo_6_0= ruleNaturalExpression )
                    {
                    // InternalMyDsl.g:1513:4: (lv_linkVideo_6_0= ruleNaturalExpression )
                    // InternalMyDsl.g:1514:5: lv_linkVideo_6_0= ruleNaturalExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVideoExpressionAccess().getLinkVideoNaturalExpressionParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_26);
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

            // InternalMyDsl.g:1531:3: ( ( ')' )=>otherlv_7= ')' )
            // InternalMyDsl.g:1532:4: ( ')' )=>otherlv_7= ')'
            {
            otherlv_7=(Token)match(input,23,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_7, grammarAccess.getVideoExpressionAccess().getRightParenthesisKeyword_7());
              			
            }

            }

            // InternalMyDsl.g:1538:3: ( ( RULE_BL )=>this_BL_8= RULE_BL )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_BL) ) {
                int LA44_1 = input.LA(2);

                if ( (synpred50_InternalMyDsl()) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:1539:4: ( RULE_BL )=>this_BL_8= RULE_BL
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


    // $ANTLR start "entryRuleHeaderExpression"
    // InternalMyDsl.g:1549:1: entryRuleHeaderExpression returns [EObject current=null] : iv_ruleHeaderExpression= ruleHeaderExpression EOF ;
    public final EObject entryRuleHeaderExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderExpression = null;


        try {
            // InternalMyDsl.g:1549:57: (iv_ruleHeaderExpression= ruleHeaderExpression EOF )
            // InternalMyDsl.g:1550:2: iv_ruleHeaderExpression= ruleHeaderExpression EOF
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
    // InternalMyDsl.g:1556:1: ruleHeaderExpression returns [EObject current=null] : (this_Header1Expression_0= ruleHeader1Expression | this_Header2Expression_1= ruleHeader2Expression | this_Header3Expression_2= ruleHeader3Expression | this_Header4Expression_3= ruleHeader4Expression | this_Header5Expression_4= ruleHeader5Expression | this_Header6Expression_5= ruleHeader6Expression ) ;
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
            // InternalMyDsl.g:1562:2: ( (this_Header1Expression_0= ruleHeader1Expression | this_Header2Expression_1= ruleHeader2Expression | this_Header3Expression_2= ruleHeader3Expression | this_Header4Expression_3= ruleHeader4Expression | this_Header5Expression_4= ruleHeader5Expression | this_Header6Expression_5= ruleHeader6Expression ) )
            // InternalMyDsl.g:1563:2: (this_Header1Expression_0= ruleHeader1Expression | this_Header2Expression_1= ruleHeader2Expression | this_Header3Expression_2= ruleHeader3Expression | this_Header4Expression_3= ruleHeader4Expression | this_Header5Expression_4= ruleHeader5Expression | this_Header6Expression_5= ruleHeader6Expression )
            {
            // InternalMyDsl.g:1563:2: (this_Header1Expression_0= ruleHeader1Expression | this_Header2Expression_1= ruleHeader2Expression | this_Header3Expression_2= ruleHeader3Expression | this_Header4Expression_3= ruleHeader4Expression | this_Header5Expression_4= ruleHeader5Expression | this_Header6Expression_5= ruleHeader6Expression )
            int alt45=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt45=1;
                }
                break;
            case 30:
                {
                alt45=2;
                }
                break;
            case 31:
                {
                alt45=3;
                }
                break;
            case 32:
                {
                alt45=4;
                }
                break;
            case 33:
                {
                alt45=5;
                }
                break;
            case 34:
                {
                alt45=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:1564:3: this_Header1Expression_0= ruleHeader1Expression
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
                    // InternalMyDsl.g:1573:3: this_Header2Expression_1= ruleHeader2Expression
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
                    // InternalMyDsl.g:1582:3: this_Header3Expression_2= ruleHeader3Expression
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
                    // InternalMyDsl.g:1591:3: this_Header4Expression_3= ruleHeader4Expression
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
                    // InternalMyDsl.g:1600:3: this_Header5Expression_4= ruleHeader5Expression
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
                    // InternalMyDsl.g:1609:3: this_Header6Expression_5= ruleHeader6Expression
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
    // InternalMyDsl.g:1621:1: entryRuleHeader1Expression returns [EObject current=null] : iv_ruleHeader1Expression= ruleHeader1Expression EOF ;
    public final EObject entryRuleHeader1Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader1Expression = null;


        try {
            // InternalMyDsl.g:1621:58: (iv_ruleHeader1Expression= ruleHeader1Expression EOF )
            // InternalMyDsl.g:1622:2: iv_ruleHeader1Expression= ruleHeader1Expression EOF
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
    // InternalMyDsl.g:1628:1: ruleHeader1Expression returns [EObject current=null] : ( () otherlv_1= '#' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader1Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1634:2: ( ( () otherlv_1= '#' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:1635:2: ( () otherlv_1= '#' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:1635:2: ( () otherlv_1= '#' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:1636:3: () otherlv_1= '#' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:1636:3: ()
            // InternalMyDsl.g:1637:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader1ExpressionAccess().getHeader1ExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeader1ExpressionAccess().getNumberSignKeyword_1());
              		
            }
            // InternalMyDsl.g:1647:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1648:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1648:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1649:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_32);
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

            // InternalMyDsl.g:1666:3: ( ( '#' )=>otherlv_3= '#' )*
            loop46:
            do {
                int alt46=2;
                alt46 = dfa46.predict(input);
                switch (alt46) {
            	case 1 :
            	    // InternalMyDsl.g:1667:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader1ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            // InternalMyDsl.g:1674:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_BL) ) {
                int LA47_1 = input.LA(2);

                if ( (synpred52_InternalMyDsl()) ) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:1675:4: ( RULE_BL )=>this_BL_4= RULE_BL
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
    // InternalMyDsl.g:1685:1: entryRuleHeader2Expression returns [EObject current=null] : iv_ruleHeader2Expression= ruleHeader2Expression EOF ;
    public final EObject entryRuleHeader2Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader2Expression = null;


        try {
            // InternalMyDsl.g:1685:58: (iv_ruleHeader2Expression= ruleHeader2Expression EOF )
            // InternalMyDsl.g:1686:2: iv_ruleHeader2Expression= ruleHeader2Expression EOF
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
    // InternalMyDsl.g:1692:1: ruleHeader2Expression returns [EObject current=null] : ( () otherlv_1= '##' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader2Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1698:2: ( ( () otherlv_1= '##' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:1699:2: ( () otherlv_1= '##' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:1699:2: ( () otherlv_1= '##' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:1700:3: () otherlv_1= '##' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:1700:3: ()
            // InternalMyDsl.g:1701:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader2ExpressionAccess().getHeader2ExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeader2ExpressionAccess().getNumberSignNumberSignKeyword_1());
              		
            }
            // InternalMyDsl.g:1711:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1712:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1712:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1713:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader2ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_32);
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

            // InternalMyDsl.g:1730:3: ( ( '#' )=>otherlv_3= '#' )*
            loop48:
            do {
                int alt48=2;
                alt48 = dfa48.predict(input);
                switch (alt48) {
            	case 1 :
            	    // InternalMyDsl.g:1731:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader2ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            // InternalMyDsl.g:1738:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_BL) ) {
                int LA49_1 = input.LA(2);

                if ( (synpred54_InternalMyDsl()) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // InternalMyDsl.g:1739:4: ( RULE_BL )=>this_BL_4= RULE_BL
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
    // InternalMyDsl.g:1749:1: entryRuleHeader3Expression returns [EObject current=null] : iv_ruleHeader3Expression= ruleHeader3Expression EOF ;
    public final EObject entryRuleHeader3Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader3Expression = null;


        try {
            // InternalMyDsl.g:1749:58: (iv_ruleHeader3Expression= ruleHeader3Expression EOF )
            // InternalMyDsl.g:1750:2: iv_ruleHeader3Expression= ruleHeader3Expression EOF
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
    // InternalMyDsl.g:1756:1: ruleHeader3Expression returns [EObject current=null] : ( () otherlv_1= '###' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader3Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1762:2: ( ( () otherlv_1= '###' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:1763:2: ( () otherlv_1= '###' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:1763:2: ( () otherlv_1= '###' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:1764:3: () otherlv_1= '###' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:1764:3: ()
            // InternalMyDsl.g:1765:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader3ExpressionAccess().getHeader3ExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeader3ExpressionAccess().getNumberSignNumberSignNumberSignKeyword_1());
              		
            }
            // InternalMyDsl.g:1775:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1776:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1776:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1777:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader3ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_32);
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

            // InternalMyDsl.g:1794:3: ( ( '#' )=>otherlv_3= '#' )*
            loop50:
            do {
                int alt50=2;
                alt50 = dfa50.predict(input);
                switch (alt50) {
            	case 1 :
            	    // InternalMyDsl.g:1795:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader3ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            // InternalMyDsl.g:1802:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_BL) ) {
                int LA51_1 = input.LA(2);

                if ( (synpred56_InternalMyDsl()) ) {
                    alt51=1;
                }
            }
            switch (alt51) {
                case 1 :
                    // InternalMyDsl.g:1803:4: ( RULE_BL )=>this_BL_4= RULE_BL
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
    // InternalMyDsl.g:1813:1: entryRuleHeader4Expression returns [EObject current=null] : iv_ruleHeader4Expression= ruleHeader4Expression EOF ;
    public final EObject entryRuleHeader4Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader4Expression = null;


        try {
            // InternalMyDsl.g:1813:58: (iv_ruleHeader4Expression= ruleHeader4Expression EOF )
            // InternalMyDsl.g:1814:2: iv_ruleHeader4Expression= ruleHeader4Expression EOF
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
    // InternalMyDsl.g:1820:1: ruleHeader4Expression returns [EObject current=null] : ( () otherlv_1= '####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader4Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1826:2: ( ( () otherlv_1= '####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:1827:2: ( () otherlv_1= '####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:1827:2: ( () otherlv_1= '####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:1828:3: () otherlv_1= '####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:1828:3: ()
            // InternalMyDsl.g:1829:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader4ExpressionAccess().getHeader4ExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeader4ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignKeyword_1());
              		
            }
            // InternalMyDsl.g:1839:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1840:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1840:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1841:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader4ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_32);
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

            // InternalMyDsl.g:1858:3: ( ( '#' )=>otherlv_3= '#' )*
            loop52:
            do {
                int alt52=2;
                alt52 = dfa52.predict(input);
                switch (alt52) {
            	case 1 :
            	    // InternalMyDsl.g:1859:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader4ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            // InternalMyDsl.g:1866:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_BL) ) {
                int LA53_1 = input.LA(2);

                if ( (synpred58_InternalMyDsl()) ) {
                    alt53=1;
                }
            }
            switch (alt53) {
                case 1 :
                    // InternalMyDsl.g:1867:4: ( RULE_BL )=>this_BL_4= RULE_BL
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
    // InternalMyDsl.g:1877:1: entryRuleHeader5Expression returns [EObject current=null] : iv_ruleHeader5Expression= ruleHeader5Expression EOF ;
    public final EObject entryRuleHeader5Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader5Expression = null;


        try {
            // InternalMyDsl.g:1877:58: (iv_ruleHeader5Expression= ruleHeader5Expression EOF )
            // InternalMyDsl.g:1878:2: iv_ruleHeader5Expression= ruleHeader5Expression EOF
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
    // InternalMyDsl.g:1884:1: ruleHeader5Expression returns [EObject current=null] : ( () otherlv_1= '#####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader5Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1890:2: ( ( () otherlv_1= '#####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:1891:2: ( () otherlv_1= '#####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:1891:2: ( () otherlv_1= '#####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:1892:3: () otherlv_1= '#####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:1892:3: ()
            // InternalMyDsl.g:1893:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader5ExpressionAccess().getHeader5ExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeader5ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_1());
              		
            }
            // InternalMyDsl.g:1903:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1904:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1904:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1905:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader5ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_32);
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

            // InternalMyDsl.g:1922:3: ( ( '#' )=>otherlv_3= '#' )*
            loop54:
            do {
                int alt54=2;
                alt54 = dfa54.predict(input);
                switch (alt54) {
            	case 1 :
            	    // InternalMyDsl.g:1923:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader5ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            // InternalMyDsl.g:1930:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_BL) ) {
                int LA55_1 = input.LA(2);

                if ( (synpred60_InternalMyDsl()) ) {
                    alt55=1;
                }
            }
            switch (alt55) {
                case 1 :
                    // InternalMyDsl.g:1931:4: ( RULE_BL )=>this_BL_4= RULE_BL
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
    // InternalMyDsl.g:1941:1: entryRuleHeader6Expression returns [EObject current=null] : iv_ruleHeader6Expression= ruleHeader6Expression EOF ;
    public final EObject entryRuleHeader6Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader6Expression = null;


        try {
            // InternalMyDsl.g:1941:58: (iv_ruleHeader6Expression= ruleHeader6Expression EOF )
            // InternalMyDsl.g:1942:2: iv_ruleHeader6Expression= ruleHeader6Expression EOF
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
    // InternalMyDsl.g:1948:1: ruleHeader6Expression returns [EObject current=null] : ( () otherlv_1= '######' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader6Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1954:2: ( ( () otherlv_1= '######' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:1955:2: ( () otherlv_1= '######' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:1955:2: ( () otherlv_1= '######' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:1956:3: () otherlv_1= '######' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:1956:3: ()
            // InternalMyDsl.g:1957:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader6ExpressionAccess().getHeader6ExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeader6ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_1());
              		
            }
            // InternalMyDsl.g:1967:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1968:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1968:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1969:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader6ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_32);
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

            // InternalMyDsl.g:1986:3: ( ( '#' )=>otherlv_3= '#' )*
            loop56:
            do {
                int alt56=2;
                alt56 = dfa56.predict(input);
                switch (alt56) {
            	case 1 :
            	    // InternalMyDsl.g:1987:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader6ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            // InternalMyDsl.g:1994:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_BL) ) {
                int LA57_1 = input.LA(2);

                if ( (synpred62_InternalMyDsl()) ) {
                    alt57=1;
                }
            }
            switch (alt57) {
                case 1 :
                    // InternalMyDsl.g:1995:4: ( RULE_BL )=>this_BL_4= RULE_BL
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
    // InternalMyDsl.g:2005:1: entryRuleEmphasisExpression returns [EObject current=null] : iv_ruleEmphasisExpression= ruleEmphasisExpression EOF ;
    public final EObject entryRuleEmphasisExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmphasisExpression = null;


        try {
            // InternalMyDsl.g:2005:59: (iv_ruleEmphasisExpression= ruleEmphasisExpression EOF )
            // InternalMyDsl.g:2006:2: iv_ruleEmphasisExpression= ruleEmphasisExpression EOF
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
    // InternalMyDsl.g:2012:1: ruleEmphasisExpression returns [EObject current=null] : ( ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) ) | ( (lv_c_3_0= ruleNaturalExpression ) ) )+ ;
    public final EObject ruleEmphasisExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_c_0_0 = null;

        EObject lv_c_1_0 = null;

        EObject lv_c_2_0 = null;

        EObject lv_c_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2018:2: ( ( ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) ) | ( (lv_c_3_0= ruleNaturalExpression ) ) )+ )
            // InternalMyDsl.g:2019:2: ( ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) ) | ( (lv_c_3_0= ruleNaturalExpression ) ) )+
            {
            // InternalMyDsl.g:2019:2: ( ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) ) | ( (lv_c_3_0= ruleNaturalExpression ) ) )+
            int cnt59=0;
            loop59:
            do {
                int alt59=3;
                alt59 = dfa59.predict(input);
                switch (alt59) {
            	case 1 :
            	    // InternalMyDsl.g:2020:3: ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) )
            	    {
            	    // InternalMyDsl.g:2020:3: ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) )
            	    // InternalMyDsl.g:2021:4: ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) )
            	    {
            	    // InternalMyDsl.g:2045:4: ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) )
            	    int alt58=3;
            	    int LA58_0 = input.LA(1);

            	    if ( (LA58_0==35) && (synpred65_InternalMyDsl())) {
            	        alt58=1;
            	    }
            	    else if ( (LA58_0==13) ) {
            	        alt58=2;
            	    }
            	    else if ( (LA58_0==36) ) {
            	        alt58=3;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 58, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt58) {
            	        case 1 :
            	            // InternalMyDsl.g:2046:5: ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) )
            	            {
            	            // InternalMyDsl.g:2046:5: ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) )
            	            // InternalMyDsl.g:2047:6: ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression )
            	            {
            	            // InternalMyDsl.g:2051:6: (lv_c_0_0= ruleStrongExpression )
            	            // InternalMyDsl.g:2052:7: lv_c_0_0= ruleStrongExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getCStrongExpressionParserRuleCall_0_0_0_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_33);
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
            	            // InternalMyDsl.g:2070:5: ( (lv_c_1_0= ruleItalicExpression ) )
            	            {
            	            // InternalMyDsl.g:2070:5: ( (lv_c_1_0= ruleItalicExpression ) )
            	            // InternalMyDsl.g:2071:6: (lv_c_1_0= ruleItalicExpression )
            	            {
            	            // InternalMyDsl.g:2071:6: (lv_c_1_0= ruleItalicExpression )
            	            // InternalMyDsl.g:2072:7: lv_c_1_0= ruleItalicExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getCItalicExpressionParserRuleCall_0_0_1_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_33);
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
            	            // InternalMyDsl.g:2090:5: ( (lv_c_2_0= ruleScratchExpression ) )
            	            {
            	            // InternalMyDsl.g:2090:5: ( (lv_c_2_0= ruleScratchExpression ) )
            	            // InternalMyDsl.g:2091:6: (lv_c_2_0= ruleScratchExpression )
            	            {
            	            // InternalMyDsl.g:2091:6: (lv_c_2_0= ruleScratchExpression )
            	            // InternalMyDsl.g:2092:7: lv_c_2_0= ruleScratchExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getCScratchExpressionParserRuleCall_0_0_2_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_33);
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
            	    // InternalMyDsl.g:2112:3: ( (lv_c_3_0= ruleNaturalExpression ) )
            	    {
            	    // InternalMyDsl.g:2112:3: ( (lv_c_3_0= ruleNaturalExpression ) )
            	    // InternalMyDsl.g:2113:4: (lv_c_3_0= ruleNaturalExpression )
            	    {
            	    // InternalMyDsl.g:2113:4: (lv_c_3_0= ruleNaturalExpression )
            	    // InternalMyDsl.g:2114:5: lv_c_3_0= ruleNaturalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getCNaturalExpressionParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_33);
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
            	    if ( cnt59 >= 1 ) break loop59;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        throw eee;
                }
                cnt59++;
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
    // InternalMyDsl.g:2135:1: entryRuleStrongExpression returns [EObject current=null] : iv_ruleStrongExpression= ruleStrongExpression EOF ;
    public final EObject entryRuleStrongExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrongExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:2137:2: (iv_ruleStrongExpression= ruleStrongExpression EOF )
            // InternalMyDsl.g:2138:2: iv_ruleStrongExpression= ruleStrongExpression EOF
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
    // InternalMyDsl.g:2147:1: ruleStrongExpression returns [EObject current=null] : ( () otherlv_1= '**' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '**' ) ;
    public final EObject ruleStrongExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:2154:2: ( ( () otherlv_1= '**' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '**' ) )
            // InternalMyDsl.g:2155:2: ( () otherlv_1= '**' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '**' )
            {
            // InternalMyDsl.g:2155:2: ( () otherlv_1= '**' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '**' )
            // InternalMyDsl.g:2156:3: () otherlv_1= '**' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '**'
            {
            // InternalMyDsl.g:2156:3: ()
            // InternalMyDsl.g:2157:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStrongExpressionAccess().getStrongExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getStrongExpressionAccess().getAsteriskAsteriskKeyword_1());
              		
            }
            // InternalMyDsl.g:2167:3: ( (lv_content_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:2168:4: (lv_content_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:2168:4: (lv_content_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:2169:5: lv_content_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStrongExpressionAccess().getContentEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_34);
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

            otherlv_3=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:2197:1: entryRuleItalicExpression returns [EObject current=null] : iv_ruleItalicExpression= ruleItalicExpression EOF ;
    public final EObject entryRuleItalicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItalicExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:2199:2: (iv_ruleItalicExpression= ruleItalicExpression EOF )
            // InternalMyDsl.g:2200:2: iv_ruleItalicExpression= ruleItalicExpression EOF
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
    // InternalMyDsl.g:2209:1: ruleItalicExpression returns [EObject current=null] : ( () otherlv_1= '*' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '*' ) ;
    public final EObject ruleItalicExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:2216:2: ( ( () otherlv_1= '*' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '*' ) )
            // InternalMyDsl.g:2217:2: ( () otherlv_1= '*' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '*' )
            {
            // InternalMyDsl.g:2217:2: ( () otherlv_1= '*' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '*' )
            // InternalMyDsl.g:2218:3: () otherlv_1= '*' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '*'
            {
            // InternalMyDsl.g:2218:3: ()
            // InternalMyDsl.g:2219:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getItalicExpressionAccess().getItalicExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,13,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getItalicExpressionAccess().getAsteriskKeyword_1());
              		
            }
            // InternalMyDsl.g:2229:3: ( (lv_content_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:2230:4: (lv_content_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:2230:4: (lv_content_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:2231:5: lv_content_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getItalicExpressionAccess().getContentEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:2259:1: entryRuleScratchExpression returns [EObject current=null] : iv_ruleScratchExpression= ruleScratchExpression EOF ;
    public final EObject entryRuleScratchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScratchExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:2261:2: (iv_ruleScratchExpression= ruleScratchExpression EOF )
            // InternalMyDsl.g:2262:2: iv_ruleScratchExpression= ruleScratchExpression EOF
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
    // InternalMyDsl.g:2271:1: ruleScratchExpression returns [EObject current=null] : ( () otherlv_1= '~~' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '~~' ) ;
    public final EObject ruleScratchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:2278:2: ( ( () otherlv_1= '~~' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '~~' ) )
            // InternalMyDsl.g:2279:2: ( () otherlv_1= '~~' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '~~' )
            {
            // InternalMyDsl.g:2279:2: ( () otherlv_1= '~~' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '~~' )
            // InternalMyDsl.g:2280:3: () otherlv_1= '~~' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '~~'
            {
            // InternalMyDsl.g:2280:3: ()
            // InternalMyDsl.g:2281:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getScratchExpressionAccess().getScratchExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getScratchExpressionAccess().getTildeTildeKeyword_1());
              		
            }
            // InternalMyDsl.g:2291:3: ( (lv_content_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:2292:4: (lv_content_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:2292:4: (lv_content_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:2293:5: lv_content_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getScratchExpressionAccess().getContentEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_36);
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

            otherlv_3=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:2321:1: entryRuleNaturalExpression returns [EObject current=null] : iv_ruleNaturalExpression= ruleNaturalExpression EOF ;
    public final EObject entryRuleNaturalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalExpression = null;


        try {
            // InternalMyDsl.g:2321:58: (iv_ruleNaturalExpression= ruleNaturalExpression EOF )
            // InternalMyDsl.g:2322:2: iv_ruleNaturalExpression= ruleNaturalExpression EOF
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
    // InternalMyDsl.g:2328:1: ruleNaturalExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleContent ) ) ) ;
    public final EObject ruleNaturalExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2334:2: ( ( () ( (lv_value_1_0= ruleContent ) ) ) )
            // InternalMyDsl.g:2335:2: ( () ( (lv_value_1_0= ruleContent ) ) )
            {
            // InternalMyDsl.g:2335:2: ( () ( (lv_value_1_0= ruleContent ) ) )
            // InternalMyDsl.g:2336:3: () ( (lv_value_1_0= ruleContent ) )
            {
            // InternalMyDsl.g:2336:3: ()
            // InternalMyDsl.g:2337:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNaturalExpressionAccess().getNaturalExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:2343:3: ( (lv_value_1_0= ruleContent ) )
            // InternalMyDsl.g:2344:4: (lv_value_1_0= ruleContent )
            {
            // InternalMyDsl.g:2344:4: (lv_value_1_0= ruleContent )
            // InternalMyDsl.g:2345:5: lv_value_1_0= ruleContent
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
    // InternalMyDsl.g:2366:1: entryRuleContent returns [String current=null] : iv_ruleContent= ruleContent EOF ;
    public final String entryRuleContent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContent = null;


        try {
            // InternalMyDsl.g:2366:47: (iv_ruleContent= ruleContent EOF )
            // InternalMyDsl.g:2367:2: iv_ruleContent= ruleContent EOF
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
    // InternalMyDsl.g:2373:1: ruleContent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) ) | kw= '\\'' | kw= '-' | kw= '|' | kw= '\"' ) ;
    public final AntlrDatatypeRuleToken ruleContent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;
        Token this_INT_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2379:2: ( ( ( ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) ) | kw= '\\'' | kw= '-' | kw= '|' | kw= '\"' ) )
            // InternalMyDsl.g:2380:2: ( ( ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) ) | kw= '\\'' | kw= '-' | kw= '|' | kw= '\"' )
            {
            // InternalMyDsl.g:2380:2: ( ( ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) ) | kw= '\\'' | kw= '-' | kw= '|' | kw= '\"' )
            int alt61=5;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) && (synpred66_InternalMyDsl())) {
                alt61=1;
            }
            else if ( (LA61_0==RULE_STRING) && (synpred66_InternalMyDsl())) {
                alt61=1;
            }
            else if ( (LA61_0==RULE_INT) && (synpred66_InternalMyDsl())) {
                alt61=1;
            }
            else if ( (LA61_0==37) ) {
                alt61=2;
            }
            else if ( (LA61_0==14) ) {
                alt61=3;
            }
            else if ( (LA61_0==19) ) {
                alt61=4;
            }
            else if ( (LA61_0==38) ) {
                alt61=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalMyDsl.g:2381:3: ( ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) )
                    {
                    // InternalMyDsl.g:2381:3: ( ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) )
                    // InternalMyDsl.g:2382:4: ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT )
                    {
                    // InternalMyDsl.g:2390:4: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT )
                    int alt60=3;
                    switch ( input.LA(1) ) {
                    case RULE_ID:
                        {
                        alt60=1;
                        }
                        break;
                    case RULE_STRING:
                        {
                        alt60=2;
                        }
                        break;
                    case RULE_INT:
                        {
                        alt60=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 60, 0, input);

                        throw nvae;
                    }

                    switch (alt60) {
                        case 1 :
                            // InternalMyDsl.g:2391:5: this_ID_0= RULE_ID
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
                            // InternalMyDsl.g:2399:5: this_STRING_1= RULE_STRING
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
                            // InternalMyDsl.g:2407:5: this_INT_2= RULE_INT
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
                    // InternalMyDsl.g:2417:3: kw= '\\''
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getContentAccess().getApostropheKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2423:3: kw= '-'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getContentAccess().getHyphenMinusKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2429:3: kw= '|'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getContentAccess().getVerticalLineKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:2435:3: kw= '\"'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
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
        // InternalMyDsl.g:146:7: ( ( ruleHorizontalExpression ) )
        // InternalMyDsl.g:146:8: ( ruleHorizontalExpression )
        {
        // InternalMyDsl.g:146:8: ( ruleHorizontalExpression )
        // InternalMyDsl.g:147:8: ruleHorizontalExpression
        {
        pushFollow(FOLLOW_2);
        ruleHorizontalExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalMyDsl

    // $ANTLR start synpred2_InternalMyDsl
    public final void synpred2_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:155:7: ( RULE_BL )
        // InternalMyDsl.g:155:8: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalMyDsl

    // $ANTLR start synpred3_InternalMyDsl
    public final void synpred3_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:167:7: ( RULE_BL )
        // InternalMyDsl.g:167:8: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalMyDsl

    // $ANTLR start synpred4_InternalMyDsl
    public final void synpred4_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:125:4: ( ( ( ( ruleHeaderExpression ) ) | ( ( ruleBreakLineExpression ) ) | ( ( ruleRefExpression ) ) | ( ( ( ( ruleHorizontalExpression ) )=> ( ruleHorizontalExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) | ( ( ( ruleListExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) ) )
        // InternalMyDsl.g:125:5: ( ( ( ruleHeaderExpression ) ) | ( ( ruleBreakLineExpression ) ) | ( ( ruleRefExpression ) ) | ( ( ( ( ruleHorizontalExpression ) )=> ( ruleHorizontalExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) | ( ( ( ruleListExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) )
        {
        // InternalMyDsl.g:125:5: ( ( ( ruleHeaderExpression ) ) | ( ( ruleBreakLineExpression ) ) | ( ( ruleRefExpression ) ) | ( ( ( ( ruleHorizontalExpression ) )=> ( ruleHorizontalExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) | ( ( ( ruleListExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) )
        int alt64=5;
        int LA64_0 = input.LA(1);

        if ( ((LA64_0>=29 && LA64_0<=34)) ) {
            alt64=1;
        }
        else if ( (LA64_0==RULE_BL) ) {
            alt64=2;
        }
        else if ( (LA64_0==20) ) {
            alt64=3;
        }
        else if ( (LA64_0==14) ) {
            int LA64_4 = input.LA(2);

            if ( (LA64_4==RULE_WS) ) {
                alt64=5;
            }
            else if ( (LA64_4==14) && (synpred1_InternalMyDsl())) {
                alt64=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 4, input);

                throw nvae;
            }
        }
        else if ( (LA64_0==18) && (synpred1_InternalMyDsl())) {
            alt64=4;
        }
        else if ( (LA64_0==RULE_INT||LA64_0==13||LA64_0==15) ) {
            alt64=5;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 64, 0, input);

            throw nvae;
        }
        switch (alt64) {
            case 1 :
                // InternalMyDsl.g:126:5: ( ( ruleHeaderExpression ) )
                {
                // InternalMyDsl.g:126:5: ( ( ruleHeaderExpression ) )
                // InternalMyDsl.g:127:6: ( ruleHeaderExpression )
                {
                // InternalMyDsl.g:127:6: ( ruleHeaderExpression )
                // InternalMyDsl.g:128:7: ruleHeaderExpression
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
                // InternalMyDsl.g:132:5: ( ( ruleBreakLineExpression ) )
                {
                // InternalMyDsl.g:132:5: ( ( ruleBreakLineExpression ) )
                // InternalMyDsl.g:133:6: ( ruleBreakLineExpression )
                {
                // InternalMyDsl.g:133:6: ( ruleBreakLineExpression )
                // InternalMyDsl.g:134:7: ruleBreakLineExpression
                {
                pushFollow(FOLLOW_2);
                ruleBreakLineExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // InternalMyDsl.g:138:5: ( ( ruleRefExpression ) )
                {
                // InternalMyDsl.g:138:5: ( ( ruleRefExpression ) )
                // InternalMyDsl.g:139:6: ( ruleRefExpression )
                {
                // InternalMyDsl.g:139:6: ( ruleRefExpression )
                // InternalMyDsl.g:140:7: ruleRefExpression
                {
                pushFollow(FOLLOW_2);
                ruleRefExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 4 :
                // InternalMyDsl.g:144:5: ( ( ( ( ruleHorizontalExpression ) )=> ( ruleHorizontalExpression ) ) ( ( RULE_BL )=> RULE_BL )? )
                {
                // InternalMyDsl.g:144:5: ( ( ( ( ruleHorizontalExpression ) )=> ( ruleHorizontalExpression ) ) ( ( RULE_BL )=> RULE_BL )? )
                // InternalMyDsl.g:145:6: ( ( ( ruleHorizontalExpression ) )=> ( ruleHorizontalExpression ) ) ( ( RULE_BL )=> RULE_BL )?
                {
                // InternalMyDsl.g:145:6: ( ( ( ruleHorizontalExpression ) )=> ( ruleHorizontalExpression ) )
                // InternalMyDsl.g:146:7: ( ( ruleHorizontalExpression ) )=> ( ruleHorizontalExpression )
                {
                // InternalMyDsl.g:150:7: ( ruleHorizontalExpression )
                // InternalMyDsl.g:151:8: ruleHorizontalExpression
                {
                pushFollow(FOLLOW_4);
                ruleHorizontalExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalMyDsl.g:154:6: ( ( RULE_BL )=> RULE_BL )?
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_BL) && (synpred2_InternalMyDsl())) {
                    alt62=1;
                }
                switch (alt62) {
                    case 1 :
                        // InternalMyDsl.g:155:7: ( RULE_BL )=> RULE_BL
                        {
                        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

                        }
                        break;

                }


                }


                }
                break;
            case 5 :
                // InternalMyDsl.g:160:5: ( ( ( ruleListExpression ) ) ( ( RULE_BL )=> RULE_BL )? )
                {
                // InternalMyDsl.g:160:5: ( ( ( ruleListExpression ) ) ( ( RULE_BL )=> RULE_BL )? )
                // InternalMyDsl.g:161:6: ( ( ruleListExpression ) ) ( ( RULE_BL )=> RULE_BL )?
                {
                // InternalMyDsl.g:161:6: ( ( ruleListExpression ) )
                // InternalMyDsl.g:162:7: ( ruleListExpression )
                {
                // InternalMyDsl.g:162:7: ( ruleListExpression )
                // InternalMyDsl.g:163:8: ruleListExpression
                {
                pushFollow(FOLLOW_4);
                ruleListExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalMyDsl.g:166:6: ( ( RULE_BL )=> RULE_BL )?
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_BL) && (synpred3_InternalMyDsl())) {
                    alt63=1;
                }
                switch (alt63) {
                    case 1 :
                        // InternalMyDsl.g:167:7: ( RULE_BL )=> RULE_BL
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
    // $ANTLR end synpred4_InternalMyDsl

    // $ANTLR start synpred5_InternalMyDsl
    public final void synpred5_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:236:7: ( ( ruleHorizontalExpression ) )
        // InternalMyDsl.g:236:8: ( ruleHorizontalExpression )
        {
        // InternalMyDsl.g:236:8: ( ruleHorizontalExpression )
        // InternalMyDsl.g:237:8: ruleHorizontalExpression
        {
        pushFollow(FOLLOW_2);
        ruleHorizontalExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalMyDsl

    // $ANTLR start synpred6_InternalMyDsl
    public final void synpred6_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:259:7: ( RULE_BL )
        // InternalMyDsl.g:259:8: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalMyDsl

    // $ANTLR start synpred7_InternalMyDsl
    public final void synpred7_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:288:7: ( RULE_BL )
        // InternalMyDsl.g:288:8: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalMyDsl

    // $ANTLR start synpred8_InternalMyDsl
    public final void synpred8_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:319:5: ( RULE_BL )
        // InternalMyDsl.g:319:6: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalMyDsl

    // $ANTLR start synpred9_InternalMyDsl
    public final void synpred9_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:354:6: ( ruleURLedExpression )
        // InternalMyDsl.g:354:7: ruleURLedExpression
        {
        pushFollow(FOLLOW_2);
        ruleURLedExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalMyDsl

    // $ANTLR start synpred10_InternalMyDsl
    public final void synpred10_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:352:4: ( ( ( ( ruleURLedExpression )=> ruleURLedExpression ) | ruleTabExpression | ruleQuoteExpression ) )
        // InternalMyDsl.g:352:5: ( ( ( ruleURLedExpression )=> ruleURLedExpression ) | ruleTabExpression | ruleQuoteExpression )
        {
        // InternalMyDsl.g:352:5: ( ( ( ruleURLedExpression )=> ruleURLedExpression ) | ruleTabExpression | ruleQuoteExpression )
        int alt65=3;
        int LA65_0 = input.LA(1);

        if ( (LA65_0==26) && (synpred9_InternalMyDsl())) {
            alt65=1;
        }
        else if ( (LA65_0==27) && (synpred9_InternalMyDsl())) {
            alt65=1;
        }
        else if ( (LA65_0==20) && (synpred9_InternalMyDsl())) {
            alt65=1;
        }
        else if ( ((LA65_0>=RULE_INT && LA65_0<=RULE_STRING)||LA65_0==14||LA65_0==19||(LA65_0>=37 && LA65_0<=38)) ) {
            alt65=2;
        }
        else if ( (LA65_0==17) ) {
            alt65=3;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 65, 0, input);

            throw nvae;
        }
        switch (alt65) {
            case 1 :
                // InternalMyDsl.g:353:5: ( ( ruleURLedExpression )=> ruleURLedExpression )
                {
                // InternalMyDsl.g:353:5: ( ( ruleURLedExpression )=> ruleURLedExpression )
                // InternalMyDsl.g:354:6: ( ruleURLedExpression )=> ruleURLedExpression
                {
                pushFollow(FOLLOW_2);
                ruleURLedExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalMyDsl.g:358:5: ruleTabExpression
                {
                pushFollow(FOLLOW_2);
                ruleTabExpression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 3 :
                // InternalMyDsl.g:360:5: ruleQuoteExpression
                {
                pushFollow(FOLLOW_2);
                ruleQuoteExpression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred10_InternalMyDsl

    // $ANTLR start synpred11_InternalMyDsl
    public final void synpred11_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:365:6: ( ruleURLedExpression )
        // InternalMyDsl.g:365:7: ruleURLedExpression
        {
        pushFollow(FOLLOW_2);
        ruleURLedExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_InternalMyDsl

    // $ANTLR start synpred12_InternalMyDsl
    public final void synpred12_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:483:6: ( RULE_BL )
        // InternalMyDsl.g:483:7: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalMyDsl

    // $ANTLR start synpred13_InternalMyDsl
    public final void synpred13_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:527:5: ( RULE_BL )
        // InternalMyDsl.g:527:6: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalMyDsl

    // $ANTLR start synpred15_InternalMyDsl
    public final void synpred15_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:590:4: ( RULE_BL )
        // InternalMyDsl.g:590:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalMyDsl

    // $ANTLR start synpred23_InternalMyDsl
    public final void synpred23_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:785:6: ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )
        // InternalMyDsl.g:785:7: ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) )
        {
        // InternalMyDsl.g:785:7: ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) )
        // InternalMyDsl.g:786:7: RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) )
        {
        match(input,RULE_BL,FOLLOW_19); if (state.failed) return ;
        // InternalMyDsl.g:787:7: ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) )
        // InternalMyDsl.g:788:8: ( ( ruleLineExpression ) )=> ( ruleLineExpression )
        {
        // InternalMyDsl.g:792:8: ( ruleLineExpression )
        // InternalMyDsl.g:793:9: ruleLineExpression
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
    // $ANTLR end synpred23_InternalMyDsl

    // $ANTLR start synpred25_InternalMyDsl
    public final void synpred25_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:914:4: ( '|' )
        // InternalMyDsl.g:914:5: '|'
        {
        match(input,19,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalMyDsl

    // $ANTLR start synpred26_InternalMyDsl
    public final void synpred26_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:941:5: ( '|' )
        // InternalMyDsl.g:941:6: '|'
        {
        match(input,19,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalMyDsl

    // $ANTLR start synpred27_InternalMyDsl
    public final void synpred27_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:968:4: ( '|' )
        // InternalMyDsl.g:968:5: '|'
        {
        match(input,19,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalMyDsl

    // $ANTLR start synpred28_InternalMyDsl
    public final void synpred28_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1010:7: ( ( ruleVideoExpression ) )
        // InternalMyDsl.g:1010:8: ( ruleVideoExpression )
        {
        // InternalMyDsl.g:1010:8: ( ruleVideoExpression )
        // InternalMyDsl.g:1011:8: ruleVideoExpression
        {
        pushFollow(FOLLOW_2);
        ruleVideoExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalMyDsl

    // $ANTLR start synpred29_InternalMyDsl
    public final void synpred29_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1002:5: ( ( ( ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) )
        // InternalMyDsl.g:1002:6: ( ( ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) )
        {
        // InternalMyDsl.g:1002:6: ( ( ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) )
        int alt67=2;
        int LA67_0 = input.LA(1);

        if ( (LA67_0==26) ) {
            alt67=1;
        }
        else if ( (LA67_0==27) && (synpred28_InternalMyDsl())) {
            alt67=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 67, 0, input);

            throw nvae;
        }
        switch (alt67) {
            case 1 :
                // InternalMyDsl.g:1003:6: ( ( ruleImageExpression ) )
                {
                // InternalMyDsl.g:1003:6: ( ( ruleImageExpression ) )
                // InternalMyDsl.g:1004:7: ( ruleImageExpression )
                {
                // InternalMyDsl.g:1004:7: ( ruleImageExpression )
                // InternalMyDsl.g:1005:8: ruleImageExpression
                {
                pushFollow(FOLLOW_2);
                ruleImageExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // InternalMyDsl.g:1009:6: ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) )
                {
                // InternalMyDsl.g:1009:6: ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) )
                // InternalMyDsl.g:1010:7: ( ( ruleVideoExpression ) )=> ( ruleVideoExpression )
                {
                // InternalMyDsl.g:1014:7: ( ruleVideoExpression )
                // InternalMyDsl.g:1015:8: ruleVideoExpression
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
    }
    // $ANTLR end synpred29_InternalMyDsl

    // $ANTLR start synpred30_InternalMyDsl
    public final void synpred30_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1042:7: ( ( ruleVideoExpression ) )
        // InternalMyDsl.g:1042:8: ( ruleVideoExpression )
        {
        // InternalMyDsl.g:1042:8: ( ruleVideoExpression )
        // InternalMyDsl.g:1043:8: ruleVideoExpression
        {
        pushFollow(FOLLOW_2);
        ruleVideoExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred30_InternalMyDsl

    // $ANTLR start synpred33_InternalMyDsl
    public final void synpred33_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1166:4: ( RULE_BL )
        // InternalMyDsl.g:1166:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalMyDsl

    // $ANTLR start synpred36_InternalMyDsl
    public final void synpred36_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1252:5: ( ')' )
        // InternalMyDsl.g:1252:6: ')'
        {
        match(input,23,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_InternalMyDsl

    // $ANTLR start synpred37_InternalMyDsl
    public final void synpred37_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1259:5: ( RULE_BL )
        // InternalMyDsl.g:1259:6: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalMyDsl

    // $ANTLR start synpred38_InternalMyDsl
    public final void synpred38_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1269:5: ( '[' )
        // InternalMyDsl.g:1269:6: '['
        {
        match(input,20,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_InternalMyDsl

    // $ANTLR start synpred40_InternalMyDsl
    public final void synpred40_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1321:5: ( ']' )
        // InternalMyDsl.g:1321:6: ']'
        {
        match(input,25,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_InternalMyDsl

    // $ANTLR start synpred41_InternalMyDsl
    public final void synpred41_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1328:5: ( RULE_BL )
        // InternalMyDsl.g:1328:6: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_InternalMyDsl

    // $ANTLR start synpred44_InternalMyDsl
    public final void synpred44_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1414:4: ( ')' )
        // InternalMyDsl.g:1414:5: ')'
        {
        match(input,23,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_InternalMyDsl

    // $ANTLR start synpred45_InternalMyDsl
    public final void synpred45_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1421:4: ( RULE_BL )
        // InternalMyDsl.g:1421:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_InternalMyDsl

    // $ANTLR start synpred48_InternalMyDsl
    public final void synpred48_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1506:4: ( ')](' )
        // InternalMyDsl.g:1506:5: ')]('
        {
        match(input,28,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_InternalMyDsl

    // $ANTLR start synpred49_InternalMyDsl
    public final void synpred49_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1532:4: ( ')' )
        // InternalMyDsl.g:1532:5: ')'
        {
        match(input,23,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_InternalMyDsl

    // $ANTLR start synpred50_InternalMyDsl
    public final void synpred50_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1539:4: ( RULE_BL )
        // InternalMyDsl.g:1539:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_InternalMyDsl

    // $ANTLR start synpred51_InternalMyDsl
    public final void synpred51_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1667:4: ( '#' )
        // InternalMyDsl.g:1667:5: '#'
        {
        match(input,29,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_InternalMyDsl

    // $ANTLR start synpred52_InternalMyDsl
    public final void synpred52_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1675:4: ( RULE_BL )
        // InternalMyDsl.g:1675:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_InternalMyDsl

    // $ANTLR start synpred53_InternalMyDsl
    public final void synpred53_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1731:4: ( '#' )
        // InternalMyDsl.g:1731:5: '#'
        {
        match(input,29,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_InternalMyDsl

    // $ANTLR start synpred54_InternalMyDsl
    public final void synpred54_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1739:4: ( RULE_BL )
        // InternalMyDsl.g:1739:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_InternalMyDsl

    // $ANTLR start synpred55_InternalMyDsl
    public final void synpred55_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1795:4: ( '#' )
        // InternalMyDsl.g:1795:5: '#'
        {
        match(input,29,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_InternalMyDsl

    // $ANTLR start synpred56_InternalMyDsl
    public final void synpred56_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1803:4: ( RULE_BL )
        // InternalMyDsl.g:1803:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_InternalMyDsl

    // $ANTLR start synpred57_InternalMyDsl
    public final void synpred57_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1859:4: ( '#' )
        // InternalMyDsl.g:1859:5: '#'
        {
        match(input,29,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_InternalMyDsl

    // $ANTLR start synpred58_InternalMyDsl
    public final void synpred58_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1867:4: ( RULE_BL )
        // InternalMyDsl.g:1867:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_InternalMyDsl

    // $ANTLR start synpred59_InternalMyDsl
    public final void synpred59_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1923:4: ( '#' )
        // InternalMyDsl.g:1923:5: '#'
        {
        match(input,29,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_InternalMyDsl

    // $ANTLR start synpred60_InternalMyDsl
    public final void synpred60_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1931:4: ( RULE_BL )
        // InternalMyDsl.g:1931:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_InternalMyDsl

    // $ANTLR start synpred61_InternalMyDsl
    public final void synpred61_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1987:4: ( '#' )
        // InternalMyDsl.g:1987:5: '#'
        {
        match(input,29,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_InternalMyDsl

    // $ANTLR start synpred62_InternalMyDsl
    public final void synpred62_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1995:4: ( RULE_BL )
        // InternalMyDsl.g:1995:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_InternalMyDsl

    // $ANTLR start synpred63_InternalMyDsl
    public final void synpred63_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2023:6: ( ( ruleStrongExpression ) )
        // InternalMyDsl.g:2023:7: ( ruleStrongExpression )
        {
        // InternalMyDsl.g:2023:7: ( ruleStrongExpression )
        // InternalMyDsl.g:2024:7: ruleStrongExpression
        {
        pushFollow(FOLLOW_2);
        ruleStrongExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred63_InternalMyDsl

    // $ANTLR start synpred64_InternalMyDsl
    public final void synpred64_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2021:4: ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )
        // InternalMyDsl.g:2021:5: ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) )
        {
        // InternalMyDsl.g:2021:5: ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) )
        int alt68=3;
        int LA68_0 = input.LA(1);

        if ( (LA68_0==35) && (synpred63_InternalMyDsl())) {
            alt68=1;
        }
        else if ( (LA68_0==13) ) {
            alt68=2;
        }
        else if ( (LA68_0==36) ) {
            alt68=3;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 68, 0, input);

            throw nvae;
        }
        switch (alt68) {
            case 1 :
                // InternalMyDsl.g:2022:5: ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) )
                {
                // InternalMyDsl.g:2022:5: ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) )
                // InternalMyDsl.g:2023:6: ( ( ruleStrongExpression ) )=> ( ruleStrongExpression )
                {
                // InternalMyDsl.g:2027:6: ( ruleStrongExpression )
                // InternalMyDsl.g:2028:7: ruleStrongExpression
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
                // InternalMyDsl.g:2032:5: ( ( ruleItalicExpression ) )
                {
                // InternalMyDsl.g:2032:5: ( ( ruleItalicExpression ) )
                // InternalMyDsl.g:2033:6: ( ruleItalicExpression )
                {
                // InternalMyDsl.g:2033:6: ( ruleItalicExpression )
                // InternalMyDsl.g:2034:7: ruleItalicExpression
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
                // InternalMyDsl.g:2038:5: ( ( ruleScratchExpression ) )
                {
                // InternalMyDsl.g:2038:5: ( ( ruleScratchExpression ) )
                // InternalMyDsl.g:2039:6: ( ruleScratchExpression )
                {
                // InternalMyDsl.g:2039:6: ( ruleScratchExpression )
                // InternalMyDsl.g:2040:7: ruleScratchExpression
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
    // $ANTLR end synpred64_InternalMyDsl

    // $ANTLR start synpred65_InternalMyDsl
    public final void synpred65_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2047:6: ( ( ruleStrongExpression ) )
        // InternalMyDsl.g:2047:7: ( ruleStrongExpression )
        {
        // InternalMyDsl.g:2047:7: ( ruleStrongExpression )
        // InternalMyDsl.g:2048:7: ruleStrongExpression
        {
        pushFollow(FOLLOW_2);
        ruleStrongExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred65_InternalMyDsl

    // $ANTLR start synpred66_InternalMyDsl
    public final void synpred66_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2382:4: ( ( RULE_ID | RULE_STRING | RULE_INT ) )
        // InternalMyDsl.g:2382:5: ( RULE_ID | RULE_STRING | RULE_INT )
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
    // $ANTLR end synpred66_InternalMyDsl

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
    public final boolean synpred28_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalMyDsl_fragment(); // can never throw exception
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
    public final boolean synpred29_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalMyDsl_fragment(); // can never throw exception
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


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA59 dfa59 = new DFA59(this);
    static final String dfa_1s = "\33\uffff";
    static final String dfa_2s = "\11\uffff\1\16\3\uffff\1\16\10\uffff\1\16\4\uffff";
    static final String dfa_3s = "\1\4\7\uffff\1\6\1\4\1\uffff\1\5\1\uffff\1\4\1\uffff\7\25\1\4\3\uffff\1\0";
    static final String dfa_4s = "\1\46\7\uffff\2\46\1\uffff\1\46\1\uffff\1\46\1\uffff\7\30\1\46\3\uffff\1\0";
    static final String dfa_5s = "\1\uffff\7\1\2\uffff\1\1\1\uffff\1\1\1\uffff\1\2\10\uffff\3\1\1\uffff";
    static final String dfa_6s = "\1\10\10\uffff\1\7\1\uffff\1\11\1\uffff\1\1\1\uffff\1\4\1\0\1\12\1\2\1\6\1\13\1\5\4\uffff\1\3}>";
    static final String[] dfa_7s = {
            "\1\7\1\uffff\1\15\2\16\4\uffff\1\13\1\11\1\14\1\uffff\1\16\1\12\1\16\1\10\5\uffff\2\16\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\4\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\21\1\17\1\20\5\uffff\1\23\4\uffff\1\24\21\uffff\1\22\1\25",
            "\1\16\1\27\3\16\4\uffff\1\16\1\26\1\16\1\uffff\4\16\5\uffff\2\16\1\uffff\12\16",
            "",
            "\1\27\3\16\4\uffff\2\16\4\uffff\1\16\17\uffff\4\16",
            "",
            "\1\16\1\uffff\3\16\4\uffff\3\16\1\30\4\16\5\uffff\2\16\1\uffff\12\16",
            "",
            "\1\31\1\16\1\uffff\1\16",
            "\1\31\1\16\1\uffff\1\16",
            "\1\31\1\16\1\uffff\1\16",
            "\1\31\1\16\1\uffff\1\16",
            "\1\31\1\16\1\uffff\1\16",
            "\1\31\1\16\1\uffff\1\16",
            "\1\31\1\16\1\uffff\1\16",
            "\5\16\4\uffff\1\16\1\32\1\16\1\uffff\4\16\5\uffff\2\16\1\uffff\12\16",
            "",
            "",
            "",
            "\1\uffff"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "123:2: ( ( ( ( ( ( ruleHeaderExpression ) ) | ( ( ruleBreakLineExpression ) ) | ( ( ruleRefExpression ) ) | ( ( ( ( ruleHorizontalExpression ) )=> ( ruleHorizontalExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) | ( ( ( ruleListExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) ) )=> ( ( (lv_c_0_0= ruleHeaderExpression ) ) | ( (lv_c_1_0= ruleBreakLineExpression ) ) | ( (lv_c_2_0= ruleRefExpression ) ) | ( ( ( ( ruleHorizontalExpression ) )=> (lv_c_3_0= ruleHorizontalExpression ) ) ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) | ( ( (lv_c_5_0= ruleListExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) ) ) | ( ( (lv_c_7_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_8= RULE_BL )? ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_16 = input.LA(1);

                         
                        int index6_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA6_16==22||LA6_16==24) ) {s = 14;}

                        else if ( (LA6_16==21) && (synpred4_InternalMyDsl())) {s = 25;}

                         
                        input.seek(index6_16);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_13 = input.LA(1);

                         
                        int index6_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA6_13==EOF||LA6_13==RULE_BL||(LA6_13>=RULE_INT && LA6_13<=RULE_STRING)||(LA6_13>=13 && LA6_13<=15)||(LA6_13>=17 && LA6_13<=20)||(LA6_13>=26 && LA6_13<=27)||(LA6_13>=29 && LA6_13<=38)) ) {s = 14;}

                        else if ( (LA6_13==16) && (synpred4_InternalMyDsl())) {s = 24;}

                         
                        input.seek(index6_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA6_18 = input.LA(1);

                         
                        int index6_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA6_18==22||LA6_18==24) ) {s = 14;}

                        else if ( (LA6_18==21) && (synpred4_InternalMyDsl())) {s = 25;}

                         
                        input.seek(index6_18);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA6_26 = input.LA(1);

                         
                        int index6_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index6_26);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA6_15 = input.LA(1);

                         
                        int index6_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA6_15==22||LA6_15==24) ) {s = 14;}

                        else if ( (LA6_15==21) && (synpred4_InternalMyDsl())) {s = 25;}

                         
                        input.seek(index6_15);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA6_21 = input.LA(1);

                         
                        int index6_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA6_21==22||LA6_21==24) ) {s = 14;}

                        else if ( (LA6_21==21) && (synpred4_InternalMyDsl())) {s = 25;}

                         
                        input.seek(index6_21);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA6_19 = input.LA(1);

                         
                        int index6_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA6_19==22||LA6_19==24) ) {s = 14;}

                        else if ( (LA6_19==21) && (synpred4_InternalMyDsl())) {s = 25;}

                         
                        input.seek(index6_19);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA6_9 = input.LA(1);

                         
                        int index6_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA6_9==EOF||LA6_9==RULE_BL||(LA6_9>=RULE_INT && LA6_9<=RULE_STRING)||LA6_9==13||LA6_9==15||(LA6_9>=17 && LA6_9<=20)||(LA6_9>=26 && LA6_9<=27)||(LA6_9>=29 && LA6_9<=38)) ) {s = 14;}

                        else if ( (LA6_9==14) ) {s = 22;}

                        else if ( (LA6_9==RULE_WS) && (synpred4_InternalMyDsl())) {s = 23;}

                         
                        input.seek(index6_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA6_0 = input.LA(1);

                         
                        int index6_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA6_0==29) && (synpred4_InternalMyDsl())) {s = 1;}

                        else if ( (LA6_0==30) && (synpred4_InternalMyDsl())) {s = 2;}

                        else if ( (LA6_0==31) && (synpred4_InternalMyDsl())) {s = 3;}

                        else if ( (LA6_0==32) && (synpred4_InternalMyDsl())) {s = 4;}

                        else if ( (LA6_0==33) && (synpred4_InternalMyDsl())) {s = 5;}

                        else if ( (LA6_0==34) && (synpred4_InternalMyDsl())) {s = 6;}

                        else if ( (LA6_0==RULE_BL) && (synpred4_InternalMyDsl())) {s = 7;}

                        else if ( (LA6_0==20) ) {s = 8;}

                        else if ( (LA6_0==14) ) {s = 9;}

                        else if ( (LA6_0==18) && (synpred4_InternalMyDsl())) {s = 10;}

                        else if ( (LA6_0==13) ) {s = 11;}

                        else if ( (LA6_0==15) && (synpred4_InternalMyDsl())) {s = 12;}

                        else if ( (LA6_0==RULE_INT) ) {s = 13;}

                        else if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_STRING)||LA6_0==17||LA6_0==19||(LA6_0>=26 && LA6_0<=27)||(LA6_0>=35 && LA6_0<=38)) ) {s = 14;}

                         
                        input.seek(index6_0);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA6_11 = input.LA(1);

                         
                        int index6_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA6_11>=RULE_INT && LA6_11<=RULE_STRING)||(LA6_11>=13 && LA6_11<=14)||LA6_11==19||(LA6_11>=35 && LA6_11<=38)) ) {s = 14;}

                        else if ( (LA6_11==RULE_WS) && (synpred4_InternalMyDsl())) {s = 23;}

                         
                        input.seek(index6_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA6_17 = input.LA(1);

                         
                        int index6_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA6_17==22||LA6_17==24) ) {s = 14;}

                        else if ( (LA6_17==21) && (synpred4_InternalMyDsl())) {s = 25;}

                         
                        input.seek(index6_17);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA6_20 = input.LA(1);

                         
                        int index6_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA6_20==22||LA6_20==24) ) {s = 14;}

                        else if ( (LA6_20==21) && (synpred4_InternalMyDsl())) {s = 25;}

                         
                        input.seek(index6_20);
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
    static final String dfa_8s = "\26\uffff";
    static final String dfa_9s = "\5\uffff\6\14\3\uffff\7\14\1\uffff";
    static final String dfa_10s = "\1\6\3\uffff\1\0\6\4\2\uffff\1\0\7\4\1\0";
    static final String dfa_11s = "\1\46\3\uffff\1\0\6\46\2\uffff\1\0\7\46\1\0";
    static final String dfa_12s = "\1\uffff\3\1\7\uffff\1\1\1\2\11\uffff";
    static final String dfa_13s = "\1\1\3\uffff\1\2\10\uffff\1\0\7\uffff\1\3}>";
    static final String[] dfa_14s = {
            "\1\7\1\5\1\6\4\uffff\1\14\1\11\2\uffff\1\13\1\uffff\1\4\1\3\5\uffff\1\1\1\2\7\uffff\2\14\1\10\1\12",
            "",
            "",
            "",
            "\1\uffff",
            "\1\16\1\uffff\3\14\4\uffff\3\14\1\uffff\2\14\1\15\1\14\5\uffff\2\14\1\uffff\12\14",
            "\1\16\1\uffff\3\14\4\uffff\3\14\1\uffff\2\14\1\15\1\14\5\uffff\2\14\1\uffff\12\14",
            "\1\16\1\uffff\3\14\4\uffff\3\14\1\uffff\2\14\1\15\1\14\5\uffff\2\14\1\uffff\12\14",
            "\1\16\1\uffff\3\14\4\uffff\3\14\1\uffff\2\14\1\15\1\14\5\uffff\2\14\1\uffff\12\14",
            "\1\16\1\uffff\3\14\4\uffff\3\14\1\uffff\2\14\1\15\1\14\5\uffff\2\14\1\uffff\12\14",
            "\1\16\1\uffff\3\14\4\uffff\3\14\1\uffff\2\14\1\15\1\14\5\uffff\2\14\1\uffff\12\14",
            "",
            "",
            "\1\uffff",
            "\1\14\1\uffff\3\14\4\uffff\1\14\1\17\1\14\1\uffff\2\14\1\20\1\14\5\uffff\2\14\1\uffff\12\14",
            "\5\14\4\uffff\1\14\1\21\1\14\1\uffff\4\14\5\uffff\2\14\1\uffff\12\14",
            "\1\14\1\uffff\3\14\4\uffff\1\14\1\17\1\14\1\uffff\4\14\5\uffff\2\14\1\uffff\12\14",
            "\5\14\4\uffff\1\14\1\23\1\14\1\uffff\2\14\1\22\1\14\5\uffff\2\14\1\uffff\12\14",
            "\1\14\1\uffff\3\14\4\uffff\1\14\1\24\1\14\1\uffff\4\14\5\uffff\2\14\1\uffff\12\14",
            "\5\14\4\uffff\1\14\1\23\1\14\1\uffff\2\14\1\22\1\14\5\uffff\2\14\1\uffff\12\14",
            "\5\14\4\uffff\1\14\1\25\1\14\1\uffff\4\14\5\uffff\2\14\1\uffff\12\14",
            "\1\uffff"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "350:2: ( ( ( ( ( ( ruleURLedExpression )=> ruleURLedExpression ) | ruleTabExpression | ruleQuoteExpression ) )=> ( ( ( ruleURLedExpression )=>this_URLedExpression_0= ruleURLedExpression ) | this_TabExpression_1= ruleTabExpression | this_QuoteExpression_2= ruleQuoteExpression ) ) | this_EmphasisExpression_3= ruleEmphasisExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_13 = input.LA(1);

                         
                        int index8_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalMyDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index8_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_0 = input.LA(1);

                         
                        int index8_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA8_0==26) && (synpred10_InternalMyDsl())) {s = 1;}

                        else if ( (LA8_0==27) && (synpred10_InternalMyDsl())) {s = 2;}

                        else if ( (LA8_0==20) && (synpred10_InternalMyDsl())) {s = 3;}

                        else if ( (LA8_0==19) ) {s = 4;}

                        else if ( (LA8_0==RULE_ID) ) {s = 5;}

                        else if ( (LA8_0==RULE_STRING) ) {s = 6;}

                        else if ( (LA8_0==RULE_INT) ) {s = 7;}

                        else if ( (LA8_0==37) ) {s = 8;}

                        else if ( (LA8_0==14) ) {s = 9;}

                        else if ( (LA8_0==38) ) {s = 10;}

                        else if ( (LA8_0==17) && (synpred10_InternalMyDsl())) {s = 11;}

                        else if ( (LA8_0==13||(LA8_0>=35 && LA8_0<=36)) ) {s = 12;}

                         
                        input.seek(index8_0);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_4 = input.LA(1);

                         
                        int index8_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalMyDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index8_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA8_21 = input.LA(1);

                         
                        int index8_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalMyDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index8_21);
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
    static final String dfa_15s = "\31\uffff";
    static final String dfa_16s = "\1\1\30\uffff";
    static final String dfa_17s = "\1\4\30\uffff";
    static final String dfa_18s = "\1\46\30\uffff";
    static final String dfa_19s = "\1\uffff\1\2\7\uffff\2\1\1\uffff\1\1\1\uffff\13\1";
    static final String dfa_20s = "\31\uffff}>";
    static final String[] dfa_21s = {
            "\1\1\1\uffff\1\16\1\22\1\23\4\uffff\1\14\1\12\1\1\1\uffff\1\26\1\1\1\21\1\11\5\uffff\1\17\1\20\1\uffff\6\1\1\27\1\30\1\24\1\25",
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

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "()+ loopback of 570:3: ( (lv_content_2_0= ruleTextExpression ) )+";
        }
    }
    static final String dfa_22s = "\13\uffff";
    static final String dfa_23s = "\2\2\11\uffff";
    static final String dfa_24s = "\2\4\1\uffff\7\0\1\uffff";
    static final String dfa_25s = "\2\46\1\uffff\7\0\1\uffff";
    static final String dfa_26s = "\2\uffff\1\2\7\uffff\1\1";
    static final String dfa_27s = "\3\uffff\1\1\1\5\1\4\1\6\1\2\1\0\1\3\1\uffff}>";
    static final String[] dfa_28s = {
            "\1\1\1\uffff\3\2\4\uffff\3\2\1\uffff\4\2\5\uffff\2\2\1\uffff\12\2",
            "\1\2\1\uffff\1\4\1\6\1\7\4\uffff\1\2\1\3\1\2\1\uffff\2\2\1\5\1\2\5\uffff\2\2\1\uffff\10\2\1\10\1\11",
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

    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_22;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "()* loopback of 784:5: ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_8 = input.LA(1);

                         
                        int index22_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index22_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_3 = input.LA(1);

                         
                        int index22_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index22_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_7 = input.LA(1);

                         
                        int index22_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index22_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA22_9 = input.LA(1);

                         
                        int index22_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index22_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA22_5 = input.LA(1);

                         
                        int index22_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index22_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA22_4 = input.LA(1);

                         
                        int index22_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index22_4);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA22_6 = input.LA(1);

                         
                        int index22_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index22_6);
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
    static final String dfa_29s = "\3\uffff\1\0\1\4\1\1\1\5\1\2\1\3\1\6\1\uffff}>";
    static final String[] dfa_30s = {
            "\1\2\1\uffff\3\2\4\uffff\3\2\1\uffff\2\2\1\1\1\2\5\uffff\2\2\1\uffff\12\2",
            "\1\2\1\uffff\1\4\1\6\1\7\4\uffff\1\2\1\3\1\2\1\uffff\2\2\1\5\1\2\5\uffff\2\2\1\uffff\10\2\1\10\1\11",
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
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_22;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_29;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "()* loopback of 939:3: ( ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_3 = input.LA(1);

                         
                        int index29_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index29_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_5 = input.LA(1);

                         
                        int index29_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index29_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA29_7 = input.LA(1);

                         
                        int index29_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index29_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA29_8 = input.LA(1);

                         
                        int index29_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index29_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA29_4 = input.LA(1);

                         
                        int index29_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index29_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA29_6 = input.LA(1);

                         
                        int index29_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index29_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA29_9 = input.LA(1);

                         
                        int index29_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index29_9);
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
    static final String dfa_31s = "\1\24\1\6\7\26\2\uffff";
    static final String dfa_32s = "\1\24\1\46\7\30\2\uffff";
    static final String dfa_33s = "\11\uffff\1\1\1\2";
    static final String dfa_34s = "\2\uffff\1\0\1\5\1\6\1\1\1\2\1\3\1\4\2\uffff}>";
    static final String[] dfa_35s = {
            "\1\1",
            "\1\4\1\2\1\3\5\uffff\1\6\4\uffff\1\7\21\uffff\1\5\1\10",
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
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[][] dfa_35 = unpackEncodedStringArray(dfa_35s);

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = dfa_22;
            this.eof = dfa_22;
            this.min = dfa_31;
            this.max = dfa_32;
            this.accept = dfa_33;
            this.special = dfa_34;
            this.transition = dfa_35;
        }
        public String getDescription() {
            return "1190:2: ( ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) | ( ( ( '[' )=>otherlv_7= '[' ) ( (lv_altText_8_0= ruleNaturalExpression ) ) ( ( '][' )=>otherlv_9= '][' ) ( (lv_refName_10_0= ruleNaturalExpression ) )? ( ( ']' )=>otherlv_11= ']' ) ( ( RULE_BL )=>this_BL_12= RULE_BL )? ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA39_2 = input.LA(1);

                         
                        int index39_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA39_2==22) ) {s = 9;}

                        else if ( (LA39_2==24) && (synpred38_InternalMyDsl())) {s = 10;}

                         
                        input.seek(index39_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA39_5 = input.LA(1);

                         
                        int index39_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA39_5==24) && (synpred38_InternalMyDsl())) {s = 10;}

                        else if ( (LA39_5==22) ) {s = 9;}

                         
                        input.seek(index39_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA39_6 = input.LA(1);

                         
                        int index39_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA39_6==22) ) {s = 9;}

                        else if ( (LA39_6==24) && (synpred38_InternalMyDsl())) {s = 10;}

                         
                        input.seek(index39_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA39_7 = input.LA(1);

                         
                        int index39_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA39_7==22) ) {s = 9;}

                        else if ( (LA39_7==24) && (synpred38_InternalMyDsl())) {s = 10;}

                         
                        input.seek(index39_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA39_8 = input.LA(1);

                         
                        int index39_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA39_8==22) ) {s = 9;}

                        else if ( (LA39_8==24) && (synpred38_InternalMyDsl())) {s = 10;}

                         
                        input.seek(index39_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA39_3 = input.LA(1);

                         
                        int index39_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA39_3==24) && (synpred38_InternalMyDsl())) {s = 10;}

                        else if ( (LA39_3==22) ) {s = 9;}

                         
                        input.seek(index39_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA39_4 = input.LA(1);

                         
                        int index39_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA39_4==22) ) {s = 9;}

                        else if ( (LA39_4==24) && (synpred38_InternalMyDsl())) {s = 10;}

                         
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
    static final String dfa_36s = "\32\uffff";
    static final String dfa_37s = "\1\1\31\uffff";
    static final String dfa_38s = "\1\4\2\uffff\1\0\26\uffff";
    static final String dfa_39s = "\1\46\2\uffff\1\0\26\uffff";
    static final String dfa_40s = "\1\uffff\1\2\27\uffff\1\1";
    static final String dfa_41s = "\3\uffff\1\0\26\uffff}>";
    static final String[] dfa_42s = {
            "\1\1\1\uffff\3\1\4\uffff\3\1\1\uffff\4\1\5\uffff\2\1\1\uffff\1\3\11\1",
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

    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final char[] dfa_38 = DFA.unpackEncodedStringToUnsignedChars(dfa_38s);
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[][] dfa_42 = unpackEncodedStringArray(dfa_42s);

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = dfa_36;
            this.eof = dfa_37;
            this.min = dfa_38;
            this.max = dfa_39;
            this.accept = dfa_40;
            this.special = dfa_41;
            this.transition = dfa_42;
        }
        public String getDescription() {
            return "()* loopback of 1666:3: ( ( '#' )=>otherlv_3= '#' )*";
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
                        if ( (synpred51_InternalMyDsl()) ) {s = 25;}

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

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = dfa_36;
            this.eof = dfa_37;
            this.min = dfa_38;
            this.max = dfa_39;
            this.accept = dfa_40;
            this.special = dfa_41;
            this.transition = dfa_42;
        }
        public String getDescription() {
            return "()* loopback of 1730:3: ( ( '#' )=>otherlv_3= '#' )*";
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
                        if ( (synpred53_InternalMyDsl()) ) {s = 25;}

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
            this.eot = dfa_36;
            this.eof = dfa_37;
            this.min = dfa_38;
            this.max = dfa_39;
            this.accept = dfa_40;
            this.special = dfa_41;
            this.transition = dfa_42;
        }
        public String getDescription() {
            return "()* loopback of 1794:3: ( ( '#' )=>otherlv_3= '#' )*";
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
                        if ( (synpred55_InternalMyDsl()) ) {s = 25;}

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
            this.eot = dfa_36;
            this.eof = dfa_37;
            this.min = dfa_38;
            this.max = dfa_39;
            this.accept = dfa_40;
            this.special = dfa_41;
            this.transition = dfa_42;
        }
        public String getDescription() {
            return "()* loopback of 1858:3: ( ( '#' )=>otherlv_3= '#' )*";
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
                        if ( (synpred57_InternalMyDsl()) ) {s = 25;}

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
            this.eot = dfa_36;
            this.eof = dfa_37;
            this.min = dfa_38;
            this.max = dfa_39;
            this.accept = dfa_40;
            this.special = dfa_41;
            this.transition = dfa_42;
        }
        public String getDescription() {
            return "()* loopback of 1922:3: ( ( '#' )=>otherlv_3= '#' )*";
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
                        if ( (synpred59_InternalMyDsl()) ) {s = 25;}

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
            this.eot = dfa_36;
            this.eof = dfa_37;
            this.min = dfa_38;
            this.max = dfa_39;
            this.accept = dfa_40;
            this.special = dfa_41;
            this.transition = dfa_42;
        }
        public String getDescription() {
            return "()* loopback of 1986:3: ( ( '#' )=>otherlv_3= '#' )*";
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
                        if ( (synpred61_InternalMyDsl()) ) {s = 25;}

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
    static final String dfa_43s = "\1\4\13\uffff\1\0\12\uffff\2\0\1\uffff";
    static final String dfa_44s = "\1\46\13\uffff\1\0\12\uffff\2\0\1\uffff";
    static final String dfa_45s = "\1\uffff\1\3\10\uffff\1\2\3\uffff\1\2\2\uffff\5\2\3\uffff\1\1";
    static final String dfa_46s = "\14\uffff\1\0\12\uffff\1\1\1\2\1\uffff}>";
    static final String[] dfa_47s = {
            "\1\1\1\uffff\1\16\1\22\1\23\4\uffff\1\14\1\12\1\1\1\uffff\2\1\1\21\1\1\5\uffff\2\1\1\uffff\6\1\1\27\1\30\1\24\1\25",
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
            "\1\uffff",
            "\1\uffff",
            ""
    };
    static final char[] dfa_43 = DFA.unpackEncodedStringToUnsignedChars(dfa_43s);
    static final char[] dfa_44 = DFA.unpackEncodedStringToUnsignedChars(dfa_44s);
    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final short[][] dfa_47 = unpackEncodedStringArray(dfa_47s);

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = dfa_36;
            this.eof = dfa_37;
            this.min = dfa_43;
            this.max = dfa_44;
            this.accept = dfa_45;
            this.special = dfa_46;
            this.transition = dfa_47;
        }
        public String getDescription() {
            return "()+ loopback of 2019:2: ( ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) ) | ( (lv_c_3_0= ruleNaturalExpression ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_12 = input.LA(1);

                         
                        int index59_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index59_12);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA59_23 = input.LA(1);

                         
                        int index59_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index59_23);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA59_24 = input.LA(1);

                         
                        int index59_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index59_24);
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000007FEC1EE1D2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000007FEC1EE1F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000E012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000E002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000007FEC1EE1D0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000060000841C0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000084002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000060000841D2L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000060008841C0L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000060020841C0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000060100841C0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020000012L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000078000861C2L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000000000L});

}