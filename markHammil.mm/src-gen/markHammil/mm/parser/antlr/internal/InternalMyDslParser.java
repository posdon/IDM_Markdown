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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BL", "RULE_WS", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_DIGIT", "RULE_ANY_OTHER", "'-'", "'*'", "'_'", "'+'", "'.'", "'>'", "'|'", "'['", "']:'", "']('", "')'", "'!['", "'[!['", "')]('", "'#'", "'##'", "'###'", "'####'", "'#####'", "'######'", "'**'", "'~~'", "'\\''", "'\"'"
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

                if ( (LA1_0==RULE_BL||(LA1_0>=RULE_INT && LA1_0<=RULE_STRING)||(LA1_0>=13 && LA1_0<=16)||(LA1_0>=18 && LA1_0<=20)||(LA1_0>=24 && LA1_0<=25)||(LA1_0>=27 && LA1_0<=36)) ) {
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
                    alt4 = dfa4.predict(input);
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


    // $ANTLR start "entryRuleBreakLineExpression"
    // InternalMyDsl.g:330:1: entryRuleBreakLineExpression returns [EObject current=null] : iv_ruleBreakLineExpression= ruleBreakLineExpression EOF ;
    public final EObject entryRuleBreakLineExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakLineExpression = null;


        try {
            // InternalMyDsl.g:330:60: (iv_ruleBreakLineExpression= ruleBreakLineExpression EOF )
            // InternalMyDsl.g:331:2: iv_ruleBreakLineExpression= ruleBreakLineExpression EOF
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
    // InternalMyDsl.g:337:1: ruleBreakLineExpression returns [EObject current=null] : ( () this_BL_1= RULE_BL ) ;
    public final EObject ruleBreakLineExpression() throws RecognitionException {
        EObject current = null;

        Token this_BL_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:343:2: ( ( () this_BL_1= RULE_BL ) )
            // InternalMyDsl.g:344:2: ( () this_BL_1= RULE_BL )
            {
            // InternalMyDsl.g:344:2: ( () this_BL_1= RULE_BL )
            // InternalMyDsl.g:345:3: () this_BL_1= RULE_BL
            {
            // InternalMyDsl.g:345:3: ()
            // InternalMyDsl.g:346:4: 
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
    // InternalMyDsl.g:360:1: entryRuleHorizontalExpression returns [EObject current=null] : iv_ruleHorizontalExpression= ruleHorizontalExpression EOF ;
    public final EObject entryRuleHorizontalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHorizontalExpression = null;


        try {
            // InternalMyDsl.g:360:61: (iv_ruleHorizontalExpression= ruleHorizontalExpression EOF )
            // InternalMyDsl.g:361:2: iv_ruleHorizontalExpression= ruleHorizontalExpression EOF
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
    // InternalMyDsl.g:367:1: ruleHorizontalExpression returns [EObject current=null] : ( () (otherlv_1= '-' | otherlv_2= '*' | otherlv_3= '_' ) (otherlv_4= '-' | otherlv_5= '*' | otherlv_6= '_' ) (otherlv_7= '-' | otherlv_8= '*' | otherlv_9= '_' )+ ) ;
    public final EObject ruleHorizontalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalMyDsl.g:373:2: ( ( () (otherlv_1= '-' | otherlv_2= '*' | otherlv_3= '_' ) (otherlv_4= '-' | otherlv_5= '*' | otherlv_6= '_' ) (otherlv_7= '-' | otherlv_8= '*' | otherlv_9= '_' )+ ) )
            // InternalMyDsl.g:374:2: ( () (otherlv_1= '-' | otherlv_2= '*' | otherlv_3= '_' ) (otherlv_4= '-' | otherlv_5= '*' | otherlv_6= '_' ) (otherlv_7= '-' | otherlv_8= '*' | otherlv_9= '_' )+ )
            {
            // InternalMyDsl.g:374:2: ( () (otherlv_1= '-' | otherlv_2= '*' | otherlv_3= '_' ) (otherlv_4= '-' | otherlv_5= '*' | otherlv_6= '_' ) (otherlv_7= '-' | otherlv_8= '*' | otherlv_9= '_' )+ )
            // InternalMyDsl.g:375:3: () (otherlv_1= '-' | otherlv_2= '*' | otherlv_3= '_' ) (otherlv_4= '-' | otherlv_5= '*' | otherlv_6= '_' ) (otherlv_7= '-' | otherlv_8= '*' | otherlv_9= '_' )+
            {
            // InternalMyDsl.g:375:3: ()
            // InternalMyDsl.g:376:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHorizontalExpressionAccess().getHorizontalExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:382:3: (otherlv_1= '-' | otherlv_2= '*' | otherlv_3= '_' )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt7=1;
                }
                break;
            case 14:
                {
                alt7=2;
                }
                break;
            case 15:
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
                    // InternalMyDsl.g:383:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:388:4: otherlv_2= '*'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getHorizontalExpressionAccess().getAsteriskKeyword_1_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:393:4: otherlv_3= '_'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getHorizontalExpressionAccess().get_Keyword_1_2());
                      			
                    }

                    }
                    break;

            }

            // InternalMyDsl.g:398:3: (otherlv_4= '-' | otherlv_5= '*' | otherlv_6= '_' )
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
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:399:4: otherlv_4= '-'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:404:4: otherlv_5= '*'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getHorizontalExpressionAccess().getAsteriskKeyword_2_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:409:4: otherlv_6= '_'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getHorizontalExpressionAccess().get_Keyword_2_2());
                      			
                    }

                    }
                    break;

            }

            // InternalMyDsl.g:414:3: (otherlv_7= '-' | otherlv_8= '*' | otherlv_9= '_' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=4;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:415:4: otherlv_7= '-'
            	    {
            	    otherlv_7=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_7, grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:420:4: otherlv_8= '*'
            	    {
            	    otherlv_8=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_8, grammarAccess.getHorizontalExpressionAccess().getAsteriskKeyword_3_1());
            	      			
            	    }

            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:425:4: otherlv_9= '_'
            	    {
            	    otherlv_9=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_9, grammarAccess.getHorizontalExpressionAccess().get_Keyword_3_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
    // $ANTLR end "ruleHorizontalExpression"


    // $ANTLR start "entryRuleTextExpression"
    // InternalMyDsl.g:434:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalMyDsl.g:436:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // InternalMyDsl.g:437:2: iv_ruleTextExpression= ruleTextExpression EOF
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
    // InternalMyDsl.g:446:1: ruleTextExpression returns [EObject current=null] : ( ( ( ( ( ( ruleURLedExpression )=> ruleURLedExpression ) | ruleTabExpression | ruleQuoteExpression ) )=> ( ( ( ruleURLedExpression )=>this_URLedExpression_0= ruleURLedExpression ) | this_TabExpression_1= ruleTabExpression | this_QuoteExpression_2= ruleQuoteExpression ) ) | this_EmphasisExpression_3= ruleEmphasisExpression ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject this_URLedExpression_0 = null;

        EObject this_TabExpression_1 = null;

        EObject this_QuoteExpression_2 = null;

        EObject this_EmphasisExpression_3 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalMyDsl.g:453:2: ( ( ( ( ( ( ( ruleURLedExpression )=> ruleURLedExpression ) | ruleTabExpression | ruleQuoteExpression ) )=> ( ( ( ruleURLedExpression )=>this_URLedExpression_0= ruleURLedExpression ) | this_TabExpression_1= ruleTabExpression | this_QuoteExpression_2= ruleQuoteExpression ) ) | this_EmphasisExpression_3= ruleEmphasisExpression ) )
            // InternalMyDsl.g:454:2: ( ( ( ( ( ( ruleURLedExpression )=> ruleURLedExpression ) | ruleTabExpression | ruleQuoteExpression ) )=> ( ( ( ruleURLedExpression )=>this_URLedExpression_0= ruleURLedExpression ) | this_TabExpression_1= ruleTabExpression | this_QuoteExpression_2= ruleQuoteExpression ) ) | this_EmphasisExpression_3= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:454:2: ( ( ( ( ( ( ruleURLedExpression )=> ruleURLedExpression ) | ruleTabExpression | ruleQuoteExpression ) )=> ( ( ( ruleURLedExpression )=>this_URLedExpression_0= ruleURLedExpression ) | this_TabExpression_1= ruleTabExpression | this_QuoteExpression_2= ruleQuoteExpression ) ) | this_EmphasisExpression_3= ruleEmphasisExpression )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:455:3: ( ( ( ( ( ruleURLedExpression )=> ruleURLedExpression ) | ruleTabExpression | ruleQuoteExpression ) )=> ( ( ( ruleURLedExpression )=>this_URLedExpression_0= ruleURLedExpression ) | this_TabExpression_1= ruleTabExpression | this_QuoteExpression_2= ruleQuoteExpression ) )
                    {
                    // InternalMyDsl.g:455:3: ( ( ( ( ( ruleURLedExpression )=> ruleURLedExpression ) | ruleTabExpression | ruleQuoteExpression ) )=> ( ( ( ruleURLedExpression )=>this_URLedExpression_0= ruleURLedExpression ) | this_TabExpression_1= ruleTabExpression | this_QuoteExpression_2= ruleQuoteExpression ) )
                    // InternalMyDsl.g:456:4: ( ( ( ( ruleURLedExpression )=> ruleURLedExpression ) | ruleTabExpression | ruleQuoteExpression ) )=> ( ( ( ruleURLedExpression )=>this_URLedExpression_0= ruleURLedExpression ) | this_TabExpression_1= ruleTabExpression | this_QuoteExpression_2= ruleQuoteExpression )
                    {
                    // InternalMyDsl.g:467:4: ( ( ( ruleURLedExpression )=>this_URLedExpression_0= ruleURLedExpression ) | this_TabExpression_1= ruleTabExpression | this_QuoteExpression_2= ruleQuoteExpression )
                    int alt10=3;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==24) && (synpred11_InternalMyDsl())) {
                        alt10=1;
                    }
                    else if ( (LA10_0==25) && (synpred11_InternalMyDsl())) {
                        alt10=1;
                    }
                    else if ( (LA10_0==20) && (synpred11_InternalMyDsl())) {
                        alt10=1;
                    }
                    else if ( ((LA10_0>=RULE_INT && LA10_0<=RULE_STRING)||LA10_0==13||LA10_0==19||(LA10_0>=35 && LA10_0<=36)) ) {
                        alt10=2;
                    }
                    else if ( (LA10_0==18) ) {
                        alt10=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMyDsl.g:468:5: ( ( ruleURLedExpression )=>this_URLedExpression_0= ruleURLedExpression )
                            {
                            // InternalMyDsl.g:468:5: ( ( ruleURLedExpression )=>this_URLedExpression_0= ruleURLedExpression )
                            // InternalMyDsl.g:469:6: ( ruleURLedExpression )=>this_URLedExpression_0= ruleURLedExpression
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
                            // InternalMyDsl.g:480:5: this_TabExpression_1= ruleTabExpression
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
                            // InternalMyDsl.g:489:5: this_QuoteExpression_2= ruleQuoteExpression
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
                    // InternalMyDsl.g:500:3: this_EmphasisExpression_3= ruleEmphasisExpression
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


    // $ANTLR start "entryRuleURLedExpression"
    // InternalMyDsl.g:515:1: entryRuleURLedExpression returns [EObject current=null] : iv_ruleURLedExpression= ruleURLedExpression EOF ;
    public final EObject entryRuleURLedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURLedExpression = null;


        try {
            // InternalMyDsl.g:515:56: (iv_ruleURLedExpression= ruleURLedExpression EOF )
            // InternalMyDsl.g:516:2: iv_ruleURLedExpression= ruleURLedExpression EOF
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
    // InternalMyDsl.g:522:1: ruleURLedExpression returns [EObject current=null] : ( () ( ( ( ( ( ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) )=> ( ( (lv_c_1_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_2_0= ruleVideoExpression ) ) ) ) | ( (lv_c_3_0= ruleLinkExpression ) ) ) ) ;
    public final EObject ruleURLedExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_c_1_0 = null;

        EObject lv_c_2_0 = null;

        EObject lv_c_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:528:2: ( ( () ( ( ( ( ( ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) )=> ( ( (lv_c_1_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_2_0= ruleVideoExpression ) ) ) ) | ( (lv_c_3_0= ruleLinkExpression ) ) ) ) )
            // InternalMyDsl.g:529:2: ( () ( ( ( ( ( ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) )=> ( ( (lv_c_1_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_2_0= ruleVideoExpression ) ) ) ) | ( (lv_c_3_0= ruleLinkExpression ) ) ) )
            {
            // InternalMyDsl.g:529:2: ( () ( ( ( ( ( ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) )=> ( ( (lv_c_1_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_2_0= ruleVideoExpression ) ) ) ) | ( (lv_c_3_0= ruleLinkExpression ) ) ) )
            // InternalMyDsl.g:530:3: () ( ( ( ( ( ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) )=> ( ( (lv_c_1_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_2_0= ruleVideoExpression ) ) ) ) | ( (lv_c_3_0= ruleLinkExpression ) ) )
            {
            // InternalMyDsl.g:530:3: ()
            // InternalMyDsl.g:531:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getURLedExpressionAccess().getURLedExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:537:3: ( ( ( ( ( ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) )=> ( ( (lv_c_1_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_2_0= ruleVideoExpression ) ) ) ) | ( (lv_c_3_0= ruleLinkExpression ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) && (synpred13_InternalMyDsl())) {
                alt13=1;
            }
            else if ( (LA13_0==25) && (synpred13_InternalMyDsl())) {
                alt13=1;
            }
            else if ( (LA13_0==20) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:538:4: ( ( ( ( ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) )=> ( ( (lv_c_1_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_2_0= ruleVideoExpression ) ) ) )
                    {
                    // InternalMyDsl.g:538:4: ( ( ( ( ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) )=> ( ( (lv_c_1_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_2_0= ruleVideoExpression ) ) ) )
                    // InternalMyDsl.g:539:5: ( ( ( ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) )=> ( ( (lv_c_1_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_2_0= ruleVideoExpression ) ) )
                    {
                    // InternalMyDsl.g:557:5: ( ( (lv_c_1_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_2_0= ruleVideoExpression ) ) )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==24) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==25) && (synpred14_InternalMyDsl())) {
                        alt12=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalMyDsl.g:558:6: ( (lv_c_1_0= ruleImageExpression ) )
                            {
                            // InternalMyDsl.g:558:6: ( (lv_c_1_0= ruleImageExpression ) )
                            // InternalMyDsl.g:559:7: (lv_c_1_0= ruleImageExpression )
                            {
                            // InternalMyDsl.g:559:7: (lv_c_1_0= ruleImageExpression )
                            // InternalMyDsl.g:560:8: lv_c_1_0= ruleImageExpression
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
                            // InternalMyDsl.g:578:6: ( ( ( ruleVideoExpression ) )=> (lv_c_2_0= ruleVideoExpression ) )
                            {
                            // InternalMyDsl.g:578:6: ( ( ( ruleVideoExpression ) )=> (lv_c_2_0= ruleVideoExpression ) )
                            // InternalMyDsl.g:579:7: ( ( ruleVideoExpression ) )=> (lv_c_2_0= ruleVideoExpression )
                            {
                            // InternalMyDsl.g:583:7: (lv_c_2_0= ruleVideoExpression )
                            // InternalMyDsl.g:584:8: lv_c_2_0= ruleVideoExpression
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
                    // InternalMyDsl.g:604:4: ( (lv_c_3_0= ruleLinkExpression ) )
                    {
                    // InternalMyDsl.g:604:4: ( (lv_c_3_0= ruleLinkExpression ) )
                    // InternalMyDsl.g:605:5: (lv_c_3_0= ruleLinkExpression )
                    {
                    // InternalMyDsl.g:605:5: (lv_c_3_0= ruleLinkExpression )
                    // InternalMyDsl.g:606:6: lv_c_3_0= ruleLinkExpression
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


    // $ANTLR start "entryRuleListExpression"
    // InternalMyDsl.g:628:1: entryRuleListExpression returns [EObject current=null] : iv_ruleListExpression= ruleListExpression EOF ;
    public final EObject entryRuleListExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:630:2: (iv_ruleListExpression= ruleListExpression EOF )
            // InternalMyDsl.g:631:2: iv_ruleListExpression= ruleListExpression EOF
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
    // InternalMyDsl.g:640:1: ruleListExpression returns [EObject current=null] : ( ( () ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )+ ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+ ) | (this_INT_7= RULE_INT otherlv_8= '.' (this_WS_9= RULE_WS )+ ( (lv_contentOrdered_10_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_11= RULE_BL )? )+ ) ;
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
            // InternalMyDsl.g:647:2: ( ( ( () ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )+ ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+ ) | (this_INT_7= RULE_INT otherlv_8= '.' (this_WS_9= RULE_WS )+ ( (lv_contentOrdered_10_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_11= RULE_BL )? )+ ) )
            // InternalMyDsl.g:648:2: ( ( () ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )+ ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+ ) | (this_INT_7= RULE_INT otherlv_8= '.' (this_WS_9= RULE_WS )+ ( (lv_contentOrdered_10_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_11= RULE_BL )? )+ )
            {
            // InternalMyDsl.g:648:2: ( ( () ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )+ ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+ ) | (this_INT_7= RULE_INT otherlv_8= '.' (this_WS_9= RULE_WS )+ ( (lv_contentOrdered_10_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_11= RULE_BL )? )+ )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=13 && LA21_0<=14)||LA21_0==16) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_INT) ) {
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
                    // InternalMyDsl.g:649:3: ( () ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )+ ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+ )
                    {
                    // InternalMyDsl.g:649:3: ( () ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )+ ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+ )
                    // InternalMyDsl.g:650:4: () ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )+ ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+
                    {
                    // InternalMyDsl.g:650:4: ()
                    // InternalMyDsl.g:651:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getListExpressionAccess().getListExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMyDsl.g:657:4: ( (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )+ ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        switch ( input.LA(1) ) {
                        case 13:
                            {
                            alt17=1;
                            }
                            break;
                        case 14:
                            {
                            alt17=1;
                            }
                            break;
                        case 16:
                            {
                            alt17=1;
                            }
                            break;

                        }

                        switch (alt17) {
                    	case 1 :
                    	    // InternalMyDsl.g:658:5: (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' ) (this_WS_4= RULE_WS )+ ( (lv_contentUnordered_5_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )?
                    	    {
                    	    // InternalMyDsl.g:658:5: (otherlv_1= '*' | otherlv_2= '-' | otherlv_3= '+' )
                    	    int alt14=3;
                    	    switch ( input.LA(1) ) {
                    	    case 14:
                    	        {
                    	        alt14=1;
                    	        }
                    	        break;
                    	    case 13:
                    	        {
                    	        alt14=2;
                    	        }
                    	        break;
                    	    case 16:
                    	        {
                    	        alt14=3;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 14, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt14) {
                    	        case 1 :
                    	            // InternalMyDsl.g:659:6: otherlv_1= '*'
                    	            {
                    	            otherlv_1=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_1, grammarAccess.getListExpressionAccess().getAsteriskKeyword_0_1_0_0());
                    	              					
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalMyDsl.g:664:6: otherlv_2= '-'
                    	            {
                    	            otherlv_2=(Token)match(input,13,FOLLOW_7); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_2, grammarAccess.getListExpressionAccess().getHyphenMinusKeyword_0_1_0_1());
                    	              					
                    	            }

                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalMyDsl.g:669:6: otherlv_3= '+'
                    	            {
                    	            otherlv_3=(Token)match(input,16,FOLLOW_7); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_3, grammarAccess.getListExpressionAccess().getPlusSignKeyword_0_1_0_2());
                    	              					
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // InternalMyDsl.g:674:5: (this_WS_4= RULE_WS )+
                    	    int cnt15=0;
                    	    loop15:
                    	    do {
                    	        int alt15=2;
                    	        int LA15_0 = input.LA(1);

                    	        if ( (LA15_0==RULE_WS) ) {
                    	            alt15=1;
                    	        }


                    	        switch (alt15) {
                    	    	case 1 :
                    	    	    // InternalMyDsl.g:675:6: this_WS_4= RULE_WS
                    	    	    {
                    	    	    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_8); if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	      						newLeafNode(this_WS_4, grammarAccess.getListExpressionAccess().getWSTerminalRuleCall_0_1_1());
                    	    	      					
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

                    	    // InternalMyDsl.g:680:5: ( (lv_contentUnordered_5_0= ruleTextExpression ) )
                    	    // InternalMyDsl.g:681:6: (lv_contentUnordered_5_0= ruleTextExpression )
                    	    {
                    	    // InternalMyDsl.g:681:6: (lv_contentUnordered_5_0= ruleTextExpression )
                    	    // InternalMyDsl.g:682:7: lv_contentUnordered_5_0= ruleTextExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getListExpressionAccess().getContentUnorderedTextExpressionParserRuleCall_0_1_2_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_9);
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

                    	    // InternalMyDsl.g:699:5: ( ( RULE_BL )=>this_BL_6= RULE_BL )?
                    	    int alt16=2;
                    	    int LA16_0 = input.LA(1);

                    	    if ( (LA16_0==RULE_BL) ) {
                    	        int LA16_1 = input.LA(2);

                    	        if ( (synpred15_InternalMyDsl()) ) {
                    	            alt16=1;
                    	        }
                    	    }
                    	    switch (alt16) {
                    	        case 1 :
                    	            // InternalMyDsl.g:700:6: ( RULE_BL )=>this_BL_6= RULE_BL
                    	            {
                    	            this_BL_6=(Token)match(input,RULE_BL,FOLLOW_10); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(this_BL_6, grammarAccess.getListExpressionAccess().getBLTerminalRuleCall_0_1_3());
                    	              					
                    	            }

                    	            }
                    	            break;

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


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:709:3: (this_INT_7= RULE_INT otherlv_8= '.' (this_WS_9= RULE_WS )+ ( (lv_contentOrdered_10_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_11= RULE_BL )? )+
                    {
                    // InternalMyDsl.g:709:3: (this_INT_7= RULE_INT otherlv_8= '.' (this_WS_9= RULE_WS )+ ( (lv_contentOrdered_10_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_11= RULE_BL )? )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_INT) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalMyDsl.g:710:4: this_INT_7= RULE_INT otherlv_8= '.' (this_WS_9= RULE_WS )+ ( (lv_contentOrdered_10_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_11= RULE_BL )?
                    	    {
                    	    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				newLeafNode(this_INT_7, grammarAccess.getListExpressionAccess().getINTTerminalRuleCall_1_0());
                    	      			
                    	    }
                    	    otherlv_8=(Token)match(input,17,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				newLeafNode(otherlv_8, grammarAccess.getListExpressionAccess().getFullStopKeyword_1_1());
                    	      			
                    	    }
                    	    // InternalMyDsl.g:718:4: (this_WS_9= RULE_WS )+
                    	    int cnt18=0;
                    	    loop18:
                    	    do {
                    	        int alt18=2;
                    	        int LA18_0 = input.LA(1);

                    	        if ( (LA18_0==RULE_WS) ) {
                    	            alt18=1;
                    	        }


                    	        switch (alt18) {
                    	    	case 1 :
                    	    	    // InternalMyDsl.g:719:5: this_WS_9= RULE_WS
                    	    	    {
                    	    	    this_WS_9=(Token)match(input,RULE_WS,FOLLOW_8); if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	      					newLeafNode(this_WS_9, grammarAccess.getListExpressionAccess().getWSTerminalRuleCall_1_2());
                    	    	      				
                    	    	    }

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt18 >= 1 ) break loop18;
                    	    	    if (state.backtracking>0) {state.failed=true; return current;}
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(18, input);
                    	                throw eee;
                    	        }
                    	        cnt18++;
                    	    } while (true);

                    	    // InternalMyDsl.g:724:4: ( (lv_contentOrdered_10_0= ruleTextExpression ) )
                    	    // InternalMyDsl.g:725:5: (lv_contentOrdered_10_0= ruleTextExpression )
                    	    {
                    	    // InternalMyDsl.g:725:5: (lv_contentOrdered_10_0= ruleTextExpression )
                    	    // InternalMyDsl.g:726:6: lv_contentOrdered_10_0= ruleTextExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getListExpressionAccess().getContentOrderedTextExpressionParserRuleCall_1_3_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_12);
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

                    	    // InternalMyDsl.g:743:4: ( ( RULE_BL )=>this_BL_11= RULE_BL )?
                    	    int alt19=2;
                    	    int LA19_0 = input.LA(1);

                    	    if ( (LA19_0==RULE_BL) ) {
                    	        int LA19_1 = input.LA(2);

                    	        if ( (synpred16_InternalMyDsl()) ) {
                    	            alt19=1;
                    	        }
                    	    }
                    	    switch (alt19) {
                    	        case 1 :
                    	            // InternalMyDsl.g:744:5: ( RULE_BL )=>this_BL_11= RULE_BL
                    	            {
                    	            this_BL_11=(Token)match(input,RULE_BL,FOLLOW_13); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              					newLeafNode(this_BL_11, grammarAccess.getListExpressionAccess().getBLTerminalRuleCall_1_4());
                    	              				
                    	            }

                    	            }
                    	            break;

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
    // InternalMyDsl.g:758:1: entryRuleQuoteExpression returns [EObject current=null] : iv_ruleQuoteExpression= ruleQuoteExpression EOF ;
    public final EObject entryRuleQuoteExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuoteExpression = null;


        try {
            // InternalMyDsl.g:758:56: (iv_ruleQuoteExpression= ruleQuoteExpression EOF )
            // InternalMyDsl.g:759:2: iv_ruleQuoteExpression= ruleQuoteExpression EOF
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
    // InternalMyDsl.g:765:1: ruleQuoteExpression returns [EObject current=null] : ( () ( ( '>' )=>otherlv_1= '>' ) ( (lv_content_2_0= ruleTextExpression ) )+ ( ( RULE_BL )=>this_BL_3= RULE_BL )? ) ;
    public final EObject ruleQuoteExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BL_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:771:2: ( ( () ( ( '>' )=>otherlv_1= '>' ) ( (lv_content_2_0= ruleTextExpression ) )+ ( ( RULE_BL )=>this_BL_3= RULE_BL )? ) )
            // InternalMyDsl.g:772:2: ( () ( ( '>' )=>otherlv_1= '>' ) ( (lv_content_2_0= ruleTextExpression ) )+ ( ( RULE_BL )=>this_BL_3= RULE_BL )? )
            {
            // InternalMyDsl.g:772:2: ( () ( ( '>' )=>otherlv_1= '>' ) ( (lv_content_2_0= ruleTextExpression ) )+ ( ( RULE_BL )=>this_BL_3= RULE_BL )? )
            // InternalMyDsl.g:773:3: () ( ( '>' )=>otherlv_1= '>' ) ( (lv_content_2_0= ruleTextExpression ) )+ ( ( RULE_BL )=>this_BL_3= RULE_BL )?
            {
            // InternalMyDsl.g:773:3: ()
            // InternalMyDsl.g:774:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getQuoteExpressionAccess().getQuoteExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:780:3: ( ( '>' )=>otherlv_1= '>' )
            // InternalMyDsl.g:781:4: ( '>' )=>otherlv_1= '>'
            {
            otherlv_1=(Token)match(input,18,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getQuoteExpressionAccess().getGreaterThanSignKeyword_1());
              			
            }

            }

            // InternalMyDsl.g:787:3: ( (lv_content_2_0= ruleTextExpression ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:788:4: (lv_content_2_0= ruleTextExpression )
            	    {
            	    // InternalMyDsl.g:788:4: (lv_content_2_0= ruleTextExpression )
            	    // InternalMyDsl.g:789:5: lv_content_2_0= ruleTextExpression
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
            	    if ( cnt22 >= 1 ) break loop22;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            // InternalMyDsl.g:806:3: ( ( RULE_BL )=>this_BL_3= RULE_BL )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_BL) ) {
                int LA23_1 = input.LA(2);

                if ( (synpred18_InternalMyDsl()) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:807:4: ( RULE_BL )=>this_BL_3= RULE_BL
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


    // $ANTLR start "entryRuleTabExpression"
    // InternalMyDsl.g:817:1: entryRuleTabExpression returns [EObject current=null] : iv_ruleTabExpression= ruleTabExpression EOF ;
    public final EObject entryRuleTabExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabExpression = null;


        try {
            // InternalMyDsl.g:817:54: (iv_ruleTabExpression= ruleTabExpression EOF )
            // InternalMyDsl.g:818:2: iv_ruleTabExpression= ruleTabExpression EOF
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
    // InternalMyDsl.g:824:1: ruleTabExpression returns [EObject current=null] : ( () ( ( ( ( ( '|' )=> ( ruleLineExpression ) ) RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )* ) )=> ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* ) ) ) ;
    public final EObject ruleTabExpression() throws RecognitionException {
        EObject current = null;

        Token this_BL_2=null;
        Token this_BL_4=null;
        EObject lv_header_1_0 = null;

        EObject lv_lines_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:830:2: ( ( () ( ( ( ( ( '|' )=> ( ruleLineExpression ) ) RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )* ) )=> ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* ) ) ) )
            // InternalMyDsl.g:831:2: ( () ( ( ( ( ( '|' )=> ( ruleLineExpression ) ) RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )* ) )=> ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* ) ) )
            {
            // InternalMyDsl.g:831:2: ( () ( ( ( ( ( '|' )=> ( ruleLineExpression ) ) RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )* ) )=> ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* ) ) )
            // InternalMyDsl.g:832:3: () ( ( ( ( ( '|' )=> ( ruleLineExpression ) ) RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )* ) )=> ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* ) )
            {
            // InternalMyDsl.g:832:3: ()
            // InternalMyDsl.g:833:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTabExpressionAccess().getTabExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:839:3: ( ( ( ( ( '|' )=> ( ruleLineExpression ) ) RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )* ) )=> ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* ) )
            // InternalMyDsl.g:840:4: ( ( ( ( '|' )=> ( ruleLineExpression ) ) RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )* ) )=> ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* )
            {
            // InternalMyDsl.g:878:4: ( ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )* )
            // InternalMyDsl.g:879:5: ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) ) this_BL_2= RULE_BL ruleTabSeparation ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )*
            {
            // InternalMyDsl.g:879:5: ( ( '|' )=> (lv_header_1_0= ruleLineExpression ) )
            // InternalMyDsl.g:880:6: ( '|' )=> (lv_header_1_0= ruleLineExpression )
            {
            // InternalMyDsl.g:881:6: (lv_header_1_0= ruleLineExpression )
            // InternalMyDsl.g:882:7: lv_header_1_0= ruleLineExpression
            {
            if ( state.backtracking==0 ) {

              							newCompositeNode(grammarAccess.getTabExpressionAccess().getHeaderLineExpressionParserRuleCall_1_0_0_0());
              						
            }
            pushFollow(FOLLOW_15);
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

            this_BL_2=(Token)match(input,RULE_BL,FOLLOW_16); if (state.failed) return current;
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
            // InternalMyDsl.g:910:5: ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )*
            loop24:
            do {
                int alt24=2;
                alt24 = dfa24.predict(input);
                switch (alt24) {
            	case 1 :
            	    // InternalMyDsl.g:911:6: ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) )
            	    {
            	    // InternalMyDsl.g:924:6: (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) )
            	    // InternalMyDsl.g:925:7: this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) )
            	    {
            	    this_BL_4=(Token)match(input,RULE_BL,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(this_BL_4, grammarAccess.getTabExpressionAccess().getBLTerminalRuleCall_1_0_3_0_0());
            	      						
            	    }
            	    // InternalMyDsl.g:929:7: ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) )
            	    // InternalMyDsl.g:930:8: ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression )
            	    {
            	    // InternalMyDsl.g:934:8: (lv_lines_5_0= ruleLineExpression )
            	    // InternalMyDsl.g:935:9: lv_lines_5_0= ruleLineExpression
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
            	    break loop24;
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
    // InternalMyDsl.g:960:1: entryRuleTabSeparation returns [String current=null] : iv_ruleTabSeparation= ruleTabSeparation EOF ;
    public final String entryRuleTabSeparation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTabSeparation = null;


        try {
            // InternalMyDsl.g:960:53: (iv_ruleTabSeparation= ruleTabSeparation EOF )
            // InternalMyDsl.g:961:2: iv_ruleTabSeparation= ruleTabSeparation EOF
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
    // InternalMyDsl.g:967:1: ruleTabSeparation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '|' )? kw= '-' (kw= '-' )+ (kw= '|' kw= '-' (kw= '-' )+ )+ (kw= '|' )? ) ;
    public final AntlrDatatypeRuleToken ruleTabSeparation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:973:2: ( ( (kw= '|' )? kw= '-' (kw= '-' )+ (kw= '|' kw= '-' (kw= '-' )+ )+ (kw= '|' )? ) )
            // InternalMyDsl.g:974:2: ( (kw= '|' )? kw= '-' (kw= '-' )+ (kw= '|' kw= '-' (kw= '-' )+ )+ (kw= '|' )? )
            {
            // InternalMyDsl.g:974:2: ( (kw= '|' )? kw= '-' (kw= '-' )+ (kw= '|' kw= '-' (kw= '-' )+ )+ (kw= '|' )? )
            // InternalMyDsl.g:975:3: (kw= '|' )? kw= '-' (kw= '-' )+ (kw= '|' kw= '-' (kw= '-' )+ )+ (kw= '|' )?
            {
            // InternalMyDsl.g:975:3: (kw= '|' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==19) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:976:4: kw= '|'
                    {
                    kw=(Token)match(input,19,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTabSeparationAccess().getVerticalLineKeyword_0());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,13,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_1());
              		
            }
            // InternalMyDsl.g:987:3: (kw= '-' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==13) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyDsl.g:988:4: kw= '-'
            	    {
            	    kw=(Token)match(input,13,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_2());
            	      			
            	    }

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

            // InternalMyDsl.g:994:3: (kw= '|' kw= '-' (kw= '-' )+ )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==19) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==13) ) {
                        int LA28_3 = input.LA(3);

                        if ( (LA28_3==13) ) {
                            alt28=1;
                        }


                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:995:4: kw= '|' kw= '-' (kw= '-' )+
            	    {
            	    kw=(Token)match(input,19,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getTabSeparationAccess().getVerticalLineKeyword_3_0());
            	      			
            	    }
            	    kw=(Token)match(input,13,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_3_1());
            	      			
            	    }
            	    // InternalMyDsl.g:1005:4: (kw= '-' )+
            	    int cnt27=0;
            	    loop27:
            	    do {
            	        int alt27=2;
            	        int LA27_0 = input.LA(1);

            	        if ( (LA27_0==13) ) {
            	            alt27=1;
            	        }


            	        switch (alt27) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:1006:5: kw= '-'
            	    	    {
            	    	    kw=(Token)match(input,13,FOLLOW_19); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					current.merge(kw);
            	    	      					newLeafNode(kw, grammarAccess.getTabSeparationAccess().getHyphenMinusKeyword_3_2());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt27 >= 1 ) break loop27;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(27, input);
            	                throw eee;
            	        }
            	        cnt27++;
            	    } while (true);


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

            // InternalMyDsl.g:1013:3: (kw= '|' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==19) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:1014:4: kw= '|'
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
    // InternalMyDsl.g:1024:1: entryRuleLineExpression returns [EObject current=null] : iv_ruleLineExpression= ruleLineExpression EOF ;
    public final EObject entryRuleLineExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineExpression = null;


        try {
            // InternalMyDsl.g:1024:55: (iv_ruleLineExpression= ruleLineExpression EOF )
            // InternalMyDsl.g:1025:2: iv_ruleLineExpression= ruleLineExpression EOF
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
    // InternalMyDsl.g:1031:1: ruleLineExpression returns [EObject current=null] : ( ( ( '|' )=>otherlv_0= '|' )? ( (lv_cells_1_0= ruleNaturalExpression ) ) ( ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) ) )* ( ( '|' )=>otherlv_4= '|' )? ) ;
    public final EObject ruleLineExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_cells_1_0 = null;

        EObject lv_cells_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1037:2: ( ( ( ( '|' )=>otherlv_0= '|' )? ( (lv_cells_1_0= ruleNaturalExpression ) ) ( ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) ) )* ( ( '|' )=>otherlv_4= '|' )? ) )
            // InternalMyDsl.g:1038:2: ( ( ( '|' )=>otherlv_0= '|' )? ( (lv_cells_1_0= ruleNaturalExpression ) ) ( ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) ) )* ( ( '|' )=>otherlv_4= '|' )? )
            {
            // InternalMyDsl.g:1038:2: ( ( ( '|' )=>otherlv_0= '|' )? ( (lv_cells_1_0= ruleNaturalExpression ) ) ( ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) ) )* ( ( '|' )=>otherlv_4= '|' )? )
            // InternalMyDsl.g:1039:3: ( ( '|' )=>otherlv_0= '|' )? ( (lv_cells_1_0= ruleNaturalExpression ) ) ( ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) ) )* ( ( '|' )=>otherlv_4= '|' )?
            {
            // InternalMyDsl.g:1039:3: ( ( '|' )=>otherlv_0= '|' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==19) ) {
                int LA30_1 = input.LA(2);

                if ( (synpred28_InternalMyDsl()) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:1040:4: ( '|' )=>otherlv_0= '|'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getLineExpressionAccess().getVerticalLineKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalMyDsl.g:1046:3: ( (lv_cells_1_0= ruleNaturalExpression ) )
            // InternalMyDsl.g:1047:4: (lv_cells_1_0= ruleNaturalExpression )
            {
            // InternalMyDsl.g:1047:4: (lv_cells_1_0= ruleNaturalExpression )
            // InternalMyDsl.g:1048:5: lv_cells_1_0= ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLineExpressionAccess().getCellsNaturalExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_20);
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

            // InternalMyDsl.g:1065:3: ( ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) ) )*
            loop31:
            do {
                int alt31=2;
                alt31 = dfa31.predict(input);
                switch (alt31) {
            	case 1 :
            	    // InternalMyDsl.g:1066:4: ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) )
            	    {
            	    // InternalMyDsl.g:1066:4: ( ( '|' )=>otherlv_2= '|' )
            	    // InternalMyDsl.g:1067:5: ( '|' )=>otherlv_2= '|'
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getLineExpressionAccess().getVerticalLineKeyword_2_0());
            	      				
            	    }

            	    }

            	    // InternalMyDsl.g:1073:4: ( (lv_cells_3_0= ruleNaturalExpression ) )
            	    // InternalMyDsl.g:1074:5: (lv_cells_3_0= ruleNaturalExpression )
            	    {
            	    // InternalMyDsl.g:1074:5: (lv_cells_3_0= ruleNaturalExpression )
            	    // InternalMyDsl.g:1075:6: lv_cells_3_0= ruleNaturalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLineExpressionAccess().getCellsNaturalExpressionParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
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
            	    break loop31;
                }
            } while (true);

            // InternalMyDsl.g:1093:3: ( ( '|' )=>otherlv_4= '|' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==19) ) {
                int LA32_1 = input.LA(2);

                if ( (synpred30_InternalMyDsl()) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:1094:4: ( '|' )=>otherlv_4= '|'
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


    // $ANTLR start "entryRuleRefExpression"
    // InternalMyDsl.g:1104:1: entryRuleRefExpression returns [EObject current=null] : iv_ruleRefExpression= ruleRefExpression EOF ;
    public final EObject entryRuleRefExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefExpression = null;


        try {
            // InternalMyDsl.g:1104:54: (iv_ruleRefExpression= ruleRefExpression EOF )
            // InternalMyDsl.g:1105:2: iv_ruleRefExpression= ruleRefExpression EOF
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
    // InternalMyDsl.g:1111:1: ruleRefExpression returns [EObject current=null] : ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_refName_2_0= ruleNaturalExpression ) ) ( ( ']:' )=>otherlv_3= ']:' ) ( (lv_refContent_4_0= ruleNaturalExpression ) )? ( ( RULE_BL )=>this_BL_5= RULE_BL )? ) ;
    public final EObject ruleRefExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_5=null;
        EObject lv_refName_2_0 = null;

        EObject lv_refContent_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1117:2: ( ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_refName_2_0= ruleNaturalExpression ) ) ( ( ']:' )=>otherlv_3= ']:' ) ( (lv_refContent_4_0= ruleNaturalExpression ) )? ( ( RULE_BL )=>this_BL_5= RULE_BL )? ) )
            // InternalMyDsl.g:1118:2: ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_refName_2_0= ruleNaturalExpression ) ) ( ( ']:' )=>otherlv_3= ']:' ) ( (lv_refContent_4_0= ruleNaturalExpression ) )? ( ( RULE_BL )=>this_BL_5= RULE_BL )? )
            {
            // InternalMyDsl.g:1118:2: ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_refName_2_0= ruleNaturalExpression ) ) ( ( ']:' )=>otherlv_3= ']:' ) ( (lv_refContent_4_0= ruleNaturalExpression ) )? ( ( RULE_BL )=>this_BL_5= RULE_BL )? )
            // InternalMyDsl.g:1119:3: () ( ( '[' )=>otherlv_1= '[' ) ( (lv_refName_2_0= ruleNaturalExpression ) ) ( ( ']:' )=>otherlv_3= ']:' ) ( (lv_refContent_4_0= ruleNaturalExpression ) )? ( ( RULE_BL )=>this_BL_5= RULE_BL )?
            {
            // InternalMyDsl.g:1119:3: ()
            // InternalMyDsl.g:1120:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRefExpressionAccess().getRefExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:1126:3: ( ( '[' )=>otherlv_1= '[' )
            // InternalMyDsl.g:1127:4: ( '[' )=>otherlv_1= '['
            {
            otherlv_1=(Token)match(input,20,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getRefExpressionAccess().getLeftSquareBracketKeyword_1());
              			
            }

            }

            // InternalMyDsl.g:1133:3: ( (lv_refName_2_0= ruleNaturalExpression ) )
            // InternalMyDsl.g:1134:4: (lv_refName_2_0= ruleNaturalExpression )
            {
            // InternalMyDsl.g:1134:4: (lv_refName_2_0= ruleNaturalExpression )
            // InternalMyDsl.g:1135:5: lv_refName_2_0= ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRefExpressionAccess().getRefNameNaturalExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_21);
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

            // InternalMyDsl.g:1152:3: ( ( ']:' )=>otherlv_3= ']:' )
            // InternalMyDsl.g:1153:4: ( ']:' )=>otherlv_3= ']:'
            {
            otherlv_3=(Token)match(input,21,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getRefExpressionAccess().getRightSquareBracketColonKeyword_3());
              			
            }

            }

            // InternalMyDsl.g:1159:3: ( (lv_refContent_4_0= ruleNaturalExpression ) )?
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
                case 35:
                    {
                    alt33=1;
                    }
                    break;
                case 13:
                    {
                    alt33=1;
                    }
                    break;
                case 19:
                    {
                    alt33=1;
                    }
                    break;
                case 36:
                    {
                    alt33=1;
                    }
                    break;
            }

            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:1160:4: (lv_refContent_4_0= ruleNaturalExpression )
                    {
                    // InternalMyDsl.g:1160:4: (lv_refContent_4_0= ruleNaturalExpression )
                    // InternalMyDsl.g:1161:5: lv_refContent_4_0= ruleNaturalExpression
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

            // InternalMyDsl.g:1178:3: ( ( RULE_BL )=>this_BL_5= RULE_BL )?
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
                    // InternalMyDsl.g:1179:4: ( RULE_BL )=>this_BL_5= RULE_BL
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
    // InternalMyDsl.g:1189:1: entryRuleLinkExpression returns [EObject current=null] : iv_ruleLinkExpression= ruleLinkExpression EOF ;
    public final EObject entryRuleLinkExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkExpression = null;


        try {
            // InternalMyDsl.g:1189:55: (iv_ruleLinkExpression= ruleLinkExpression EOF )
            // InternalMyDsl.g:1190:2: iv_ruleLinkExpression= ruleLinkExpression EOF
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
    // InternalMyDsl.g:1196:1: ruleLinkExpression returns [EObject current=null] : ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) ;
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
            // InternalMyDsl.g:1202:2: ( ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) )
            // InternalMyDsl.g:1203:2: ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )
            {
            // InternalMyDsl.g:1203:2: ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )
            // InternalMyDsl.g:1204:3: () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )?
            {
            // InternalMyDsl.g:1204:3: ()
            // InternalMyDsl.g:1205:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLinkExpressionAccess().getLinkExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:1211:3: ( ( '[' )=>otherlv_1= '[' )
            // InternalMyDsl.g:1212:4: ( '[' )=>otherlv_1= '['
            {
            otherlv_1=(Token)match(input,20,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getLinkExpressionAccess().getLeftSquareBracketKeyword_1());
              			
            }

            }

            // InternalMyDsl.g:1218:3: ( (lv_altText_2_0= ruleNaturalExpression ) )
            // InternalMyDsl.g:1219:4: (lv_altText_2_0= ruleNaturalExpression )
            {
            // InternalMyDsl.g:1219:4: (lv_altText_2_0= ruleNaturalExpression )
            // InternalMyDsl.g:1220:5: lv_altText_2_0= ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLinkExpressionAccess().getAltTextNaturalExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_23);
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

            // InternalMyDsl.g:1237:3: ( ( '](' )=>otherlv_3= '](' )
            // InternalMyDsl.g:1238:4: ( '](' )=>otherlv_3= ']('
            {
            otherlv_3=(Token)match(input,22,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getLinkExpressionAccess().getRightSquareBracketLeftParenthesisKeyword_3());
              			
            }

            }

            // InternalMyDsl.g:1244:3: ( (lv_linkContent_4_0= ruleNaturalExpression ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_INT && LA35_0<=RULE_STRING)||LA35_0==13||LA35_0==19||(LA35_0>=35 && LA35_0<=36)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:1245:4: (lv_linkContent_4_0= ruleNaturalExpression )
                    {
                    // InternalMyDsl.g:1245:4: (lv_linkContent_4_0= ruleNaturalExpression )
                    // InternalMyDsl.g:1246:5: lv_linkContent_4_0= ruleNaturalExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLinkExpressionAccess().getLinkContentNaturalExpressionParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_25);
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

            // InternalMyDsl.g:1263:3: ( ( ')' )=>otherlv_5= ')' )
            // InternalMyDsl.g:1264:4: ( ')' )=>otherlv_5= ')'
            {
            otherlv_5=(Token)match(input,23,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getLinkExpressionAccess().getRightParenthesisKeyword_5());
              			
            }

            }

            // InternalMyDsl.g:1270:3: ( ( RULE_BL )=>this_BL_6= RULE_BL )?
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
                    // InternalMyDsl.g:1271:4: ( RULE_BL )=>this_BL_6= RULE_BL
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
    // InternalMyDsl.g:1281:1: entryRuleImageExpression returns [EObject current=null] : iv_ruleImageExpression= ruleImageExpression EOF ;
    public final EObject entryRuleImageExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageExpression = null;


        try {
            // InternalMyDsl.g:1281:56: (iv_ruleImageExpression= ruleImageExpression EOF )
            // InternalMyDsl.g:1282:2: iv_ruleImageExpression= ruleImageExpression EOF
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
    // InternalMyDsl.g:1288:1: ruleImageExpression returns [EObject current=null] : ( () ( ( '![' )=>otherlv_1= '![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) ;
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
            // InternalMyDsl.g:1294:2: ( ( () ( ( '![' )=>otherlv_1= '![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) )
            // InternalMyDsl.g:1295:2: ( () ( ( '![' )=>otherlv_1= '![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )
            {
            // InternalMyDsl.g:1295:2: ( () ( ( '![' )=>otherlv_1= '![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )
            // InternalMyDsl.g:1296:3: () ( ( '![' )=>otherlv_1= '![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )?
            {
            // InternalMyDsl.g:1296:3: ()
            // InternalMyDsl.g:1297:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getImageExpressionAccess().getImageExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:1303:3: ( ( '![' )=>otherlv_1= '![' )
            // InternalMyDsl.g:1304:4: ( '![' )=>otherlv_1= '!['
            {
            otherlv_1=(Token)match(input,24,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getImageExpressionAccess().getExclamationMarkLeftSquareBracketKeyword_1());
              			
            }

            }

            // InternalMyDsl.g:1310:3: ( (lv_altText_2_0= ruleNaturalExpression ) )
            // InternalMyDsl.g:1311:4: (lv_altText_2_0= ruleNaturalExpression )
            {
            // InternalMyDsl.g:1311:4: (lv_altText_2_0= ruleNaturalExpression )
            // InternalMyDsl.g:1312:5: lv_altText_2_0= ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImageExpressionAccess().getAltTextNaturalExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_23);
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

            // InternalMyDsl.g:1329:3: ( ( '](' )=>otherlv_3= '](' )
            // InternalMyDsl.g:1330:4: ( '](' )=>otherlv_3= ']('
            {
            otherlv_3=(Token)match(input,22,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getImageExpressionAccess().getRightSquareBracketLeftParenthesisKeyword_3());
              			
            }

            }

            // InternalMyDsl.g:1336:3: ( (lv_linkContent_4_0= ruleNaturalExpression ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_INT && LA37_0<=RULE_STRING)||LA37_0==13||LA37_0==19||(LA37_0>=35 && LA37_0<=36)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:1337:4: (lv_linkContent_4_0= ruleNaturalExpression )
                    {
                    // InternalMyDsl.g:1337:4: (lv_linkContent_4_0= ruleNaturalExpression )
                    // InternalMyDsl.g:1338:5: lv_linkContent_4_0= ruleNaturalExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImageExpressionAccess().getLinkContentNaturalExpressionParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_25);
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

            // InternalMyDsl.g:1355:3: ( ( ')' )=>otherlv_5= ')' )
            // InternalMyDsl.g:1356:4: ( ')' )=>otherlv_5= ')'
            {
            otherlv_5=(Token)match(input,23,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getImageExpressionAccess().getRightParenthesisKeyword_5());
              			
            }

            }

            // InternalMyDsl.g:1362:3: ( ( RULE_BL )=>this_BL_6= RULE_BL )?
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
                    // InternalMyDsl.g:1363:4: ( RULE_BL )=>this_BL_6= RULE_BL
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
    // InternalMyDsl.g:1373:1: entryRuleVideoExpression returns [EObject current=null] : iv_ruleVideoExpression= ruleVideoExpression EOF ;
    public final EObject entryRuleVideoExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoExpression = null;


        try {
            // InternalMyDsl.g:1373:56: (iv_ruleVideoExpression= ruleVideoExpression EOF )
            // InternalMyDsl.g:1374:2: iv_ruleVideoExpression= ruleVideoExpression EOF
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
    // InternalMyDsl.g:1380:1: ruleVideoExpression returns [EObject current=null] : ( () ( ( '[![' )=>otherlv_1= '[![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkImage_4_0= ruleNaturalExpression ) )? ( ( ')](' )=>otherlv_5= ')](' ) ( (lv_linkVideo_6_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_7= ')' ) ( ( RULE_BL )=>this_BL_8= RULE_BL )? ) ;
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
            // InternalMyDsl.g:1386:2: ( ( () ( ( '[![' )=>otherlv_1= '[![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkImage_4_0= ruleNaturalExpression ) )? ( ( ')](' )=>otherlv_5= ')](' ) ( (lv_linkVideo_6_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_7= ')' ) ( ( RULE_BL )=>this_BL_8= RULE_BL )? ) )
            // InternalMyDsl.g:1387:2: ( () ( ( '[![' )=>otherlv_1= '[![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkImage_4_0= ruleNaturalExpression ) )? ( ( ')](' )=>otherlv_5= ')](' ) ( (lv_linkVideo_6_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_7= ')' ) ( ( RULE_BL )=>this_BL_8= RULE_BL )? )
            {
            // InternalMyDsl.g:1387:2: ( () ( ( '[![' )=>otherlv_1= '[![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkImage_4_0= ruleNaturalExpression ) )? ( ( ')](' )=>otherlv_5= ')](' ) ( (lv_linkVideo_6_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_7= ')' ) ( ( RULE_BL )=>this_BL_8= RULE_BL )? )
            // InternalMyDsl.g:1388:3: () ( ( '[![' )=>otherlv_1= '[![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkImage_4_0= ruleNaturalExpression ) )? ( ( ')](' )=>otherlv_5= ')](' ) ( (lv_linkVideo_6_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_7= ')' ) ( ( RULE_BL )=>this_BL_8= RULE_BL )?
            {
            // InternalMyDsl.g:1388:3: ()
            // InternalMyDsl.g:1389:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVideoExpressionAccess().getVideoExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:1395:3: ( ( '[![' )=>otherlv_1= '[![' )
            // InternalMyDsl.g:1396:4: ( '[![' )=>otherlv_1= '[!['
            {
            otherlv_1=(Token)match(input,25,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getVideoExpressionAccess().getLeftSquareBracketExclamationMarkLeftSquareBracketKeyword_1());
              			
            }

            }

            // InternalMyDsl.g:1402:3: ( (lv_altText_2_0= ruleNaturalExpression ) )
            // InternalMyDsl.g:1403:4: (lv_altText_2_0= ruleNaturalExpression )
            {
            // InternalMyDsl.g:1403:4: (lv_altText_2_0= ruleNaturalExpression )
            // InternalMyDsl.g:1404:5: lv_altText_2_0= ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVideoExpressionAccess().getAltTextNaturalExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_23);
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

            // InternalMyDsl.g:1421:3: ( ( '](' )=>otherlv_3= '](' )
            // InternalMyDsl.g:1422:4: ( '](' )=>otherlv_3= ']('
            {
            otherlv_3=(Token)match(input,22,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getVideoExpressionAccess().getRightSquareBracketLeftParenthesisKeyword_3());
              			
            }

            }

            // InternalMyDsl.g:1428:3: ( (lv_linkImage_4_0= ruleNaturalExpression ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_INT && LA39_0<=RULE_STRING)||LA39_0==13||LA39_0==19||(LA39_0>=35 && LA39_0<=36)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:1429:4: (lv_linkImage_4_0= ruleNaturalExpression )
                    {
                    // InternalMyDsl.g:1429:4: (lv_linkImage_4_0= ruleNaturalExpression )
                    // InternalMyDsl.g:1430:5: lv_linkImage_4_0= ruleNaturalExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVideoExpressionAccess().getLinkImageNaturalExpressionParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_27);
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

            // InternalMyDsl.g:1447:3: ( ( ')](' )=>otherlv_5= ')](' )
            // InternalMyDsl.g:1448:4: ( ')](' )=>otherlv_5= ')]('
            {
            otherlv_5=(Token)match(input,26,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getVideoExpressionAccess().getRightParenthesisRightSquareBracketLeftParenthesisKeyword_5());
              			
            }

            }

            // InternalMyDsl.g:1454:3: ( (lv_linkVideo_6_0= ruleNaturalExpression ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_INT && LA40_0<=RULE_STRING)||LA40_0==13||LA40_0==19||(LA40_0>=35 && LA40_0<=36)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:1455:4: (lv_linkVideo_6_0= ruleNaturalExpression )
                    {
                    // InternalMyDsl.g:1455:4: (lv_linkVideo_6_0= ruleNaturalExpression )
                    // InternalMyDsl.g:1456:5: lv_linkVideo_6_0= ruleNaturalExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVideoExpressionAccess().getLinkVideoNaturalExpressionParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_25);
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

            // InternalMyDsl.g:1473:3: ( ( ')' )=>otherlv_7= ')' )
            // InternalMyDsl.g:1474:4: ( ')' )=>otherlv_7= ')'
            {
            otherlv_7=(Token)match(input,23,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_7, grammarAccess.getVideoExpressionAccess().getRightParenthesisKeyword_7());
              			
            }

            }

            // InternalMyDsl.g:1480:3: ( ( RULE_BL )=>this_BL_8= RULE_BL )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_BL) ) {
                int LA41_1 = input.LA(2);

                if ( (synpred46_InternalMyDsl()) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:1481:4: ( RULE_BL )=>this_BL_8= RULE_BL
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
    // InternalMyDsl.g:1491:1: entryRuleHeaderExpression returns [EObject current=null] : iv_ruleHeaderExpression= ruleHeaderExpression EOF ;
    public final EObject entryRuleHeaderExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderExpression = null;


        try {
            // InternalMyDsl.g:1491:57: (iv_ruleHeaderExpression= ruleHeaderExpression EOF )
            // InternalMyDsl.g:1492:2: iv_ruleHeaderExpression= ruleHeaderExpression EOF
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
    // InternalMyDsl.g:1498:1: ruleHeaderExpression returns [EObject current=null] : (this_Header1Expression_0= ruleHeader1Expression | this_Header2Expression_1= ruleHeader2Expression | this_Header3Expression_2= ruleHeader3Expression | this_Header4Expression_3= ruleHeader4Expression | this_Header5Expression_4= ruleHeader5Expression | this_Header6Expression_5= ruleHeader6Expression ) ;
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
            // InternalMyDsl.g:1504:2: ( (this_Header1Expression_0= ruleHeader1Expression | this_Header2Expression_1= ruleHeader2Expression | this_Header3Expression_2= ruleHeader3Expression | this_Header4Expression_3= ruleHeader4Expression | this_Header5Expression_4= ruleHeader5Expression | this_Header6Expression_5= ruleHeader6Expression ) )
            // InternalMyDsl.g:1505:2: (this_Header1Expression_0= ruleHeader1Expression | this_Header2Expression_1= ruleHeader2Expression | this_Header3Expression_2= ruleHeader3Expression | this_Header4Expression_3= ruleHeader4Expression | this_Header5Expression_4= ruleHeader5Expression | this_Header6Expression_5= ruleHeader6Expression )
            {
            // InternalMyDsl.g:1505:2: (this_Header1Expression_0= ruleHeader1Expression | this_Header2Expression_1= ruleHeader2Expression | this_Header3Expression_2= ruleHeader3Expression | this_Header4Expression_3= ruleHeader4Expression | this_Header5Expression_4= ruleHeader5Expression | this_Header6Expression_5= ruleHeader6Expression )
            int alt42=6;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt42=1;
                }
                break;
            case 28:
                {
                alt42=2;
                }
                break;
            case 29:
                {
                alt42=3;
                }
                break;
            case 30:
                {
                alt42=4;
                }
                break;
            case 31:
                {
                alt42=5;
                }
                break;
            case 32:
                {
                alt42=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:1506:3: this_Header1Expression_0= ruleHeader1Expression
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
                    // InternalMyDsl.g:1515:3: this_Header2Expression_1= ruleHeader2Expression
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
                    // InternalMyDsl.g:1524:3: this_Header3Expression_2= ruleHeader3Expression
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
                    // InternalMyDsl.g:1533:3: this_Header4Expression_3= ruleHeader4Expression
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
                    // InternalMyDsl.g:1542:3: this_Header5Expression_4= ruleHeader5Expression
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
                    // InternalMyDsl.g:1551:3: this_Header6Expression_5= ruleHeader6Expression
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
    // InternalMyDsl.g:1563:1: entryRuleHeader1Expression returns [EObject current=null] : iv_ruleHeader1Expression= ruleHeader1Expression EOF ;
    public final EObject entryRuleHeader1Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader1Expression = null;


        try {
            // InternalMyDsl.g:1563:58: (iv_ruleHeader1Expression= ruleHeader1Expression EOF )
            // InternalMyDsl.g:1564:2: iv_ruleHeader1Expression= ruleHeader1Expression EOF
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
    // InternalMyDsl.g:1570:1: ruleHeader1Expression returns [EObject current=null] : ( () otherlv_1= '#' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader1Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1576:2: ( ( () otherlv_1= '#' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:1577:2: ( () otherlv_1= '#' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:1577:2: ( () otherlv_1= '#' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:1578:3: () otherlv_1= '#' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:1578:3: ()
            // InternalMyDsl.g:1579:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader1ExpressionAccess().getHeader1ExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeader1ExpressionAccess().getNumberSignKeyword_1());
              		
            }
            // InternalMyDsl.g:1589:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1590:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1590:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1591:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_28);
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

            // InternalMyDsl.g:1608:3: ( ( '#' )=>otherlv_3= '#' )*
            loop43:
            do {
                int alt43=2;
                alt43 = dfa43.predict(input);
                switch (alt43) {
            	case 1 :
            	    // InternalMyDsl.g:1609:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,27,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader1ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            // InternalMyDsl.g:1616:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
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
                    // InternalMyDsl.g:1617:4: ( RULE_BL )=>this_BL_4= RULE_BL
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
    // InternalMyDsl.g:1627:1: entryRuleHeader2Expression returns [EObject current=null] : iv_ruleHeader2Expression= ruleHeader2Expression EOF ;
    public final EObject entryRuleHeader2Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader2Expression = null;


        try {
            // InternalMyDsl.g:1627:58: (iv_ruleHeader2Expression= ruleHeader2Expression EOF )
            // InternalMyDsl.g:1628:2: iv_ruleHeader2Expression= ruleHeader2Expression EOF
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
    // InternalMyDsl.g:1634:1: ruleHeader2Expression returns [EObject current=null] : ( () otherlv_1= '##' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader2Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1640:2: ( ( () otherlv_1= '##' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:1641:2: ( () otherlv_1= '##' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:1641:2: ( () otherlv_1= '##' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:1642:3: () otherlv_1= '##' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:1642:3: ()
            // InternalMyDsl.g:1643:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader2ExpressionAccess().getHeader2ExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeader2ExpressionAccess().getNumberSignNumberSignKeyword_1());
              		
            }
            // InternalMyDsl.g:1653:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1654:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1654:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1655:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader2ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_28);
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

            // InternalMyDsl.g:1672:3: ( ( '#' )=>otherlv_3= '#' )*
            loop45:
            do {
                int alt45=2;
                alt45 = dfa45.predict(input);
                switch (alt45) {
            	case 1 :
            	    // InternalMyDsl.g:1673:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,27,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader2ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            // InternalMyDsl.g:1680:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
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
                    // InternalMyDsl.g:1681:4: ( RULE_BL )=>this_BL_4= RULE_BL
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
    // InternalMyDsl.g:1691:1: entryRuleHeader3Expression returns [EObject current=null] : iv_ruleHeader3Expression= ruleHeader3Expression EOF ;
    public final EObject entryRuleHeader3Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader3Expression = null;


        try {
            // InternalMyDsl.g:1691:58: (iv_ruleHeader3Expression= ruleHeader3Expression EOF )
            // InternalMyDsl.g:1692:2: iv_ruleHeader3Expression= ruleHeader3Expression EOF
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
    // InternalMyDsl.g:1698:1: ruleHeader3Expression returns [EObject current=null] : ( () otherlv_1= '###' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader3Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1704:2: ( ( () otherlv_1= '###' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:1705:2: ( () otherlv_1= '###' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:1705:2: ( () otherlv_1= '###' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:1706:3: () otherlv_1= '###' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:1706:3: ()
            // InternalMyDsl.g:1707:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader3ExpressionAccess().getHeader3ExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeader3ExpressionAccess().getNumberSignNumberSignNumberSignKeyword_1());
              		
            }
            // InternalMyDsl.g:1717:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1718:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1718:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1719:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader3ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_28);
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

            // InternalMyDsl.g:1736:3: ( ( '#' )=>otherlv_3= '#' )*
            loop47:
            do {
                int alt47=2;
                alt47 = dfa47.predict(input);
                switch (alt47) {
            	case 1 :
            	    // InternalMyDsl.g:1737:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,27,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader3ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            // InternalMyDsl.g:1744:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
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
                    // InternalMyDsl.g:1745:4: ( RULE_BL )=>this_BL_4= RULE_BL
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
    // InternalMyDsl.g:1755:1: entryRuleHeader4Expression returns [EObject current=null] : iv_ruleHeader4Expression= ruleHeader4Expression EOF ;
    public final EObject entryRuleHeader4Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader4Expression = null;


        try {
            // InternalMyDsl.g:1755:58: (iv_ruleHeader4Expression= ruleHeader4Expression EOF )
            // InternalMyDsl.g:1756:2: iv_ruleHeader4Expression= ruleHeader4Expression EOF
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
    // InternalMyDsl.g:1762:1: ruleHeader4Expression returns [EObject current=null] : ( () otherlv_1= '####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader4Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1768:2: ( ( () otherlv_1= '####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:1769:2: ( () otherlv_1= '####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:1769:2: ( () otherlv_1= '####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:1770:3: () otherlv_1= '####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:1770:3: ()
            // InternalMyDsl.g:1771:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader4ExpressionAccess().getHeader4ExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeader4ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignKeyword_1());
              		
            }
            // InternalMyDsl.g:1781:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1782:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1782:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1783:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader4ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_28);
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

            // InternalMyDsl.g:1800:3: ( ( '#' )=>otherlv_3= '#' )*
            loop49:
            do {
                int alt49=2;
                alt49 = dfa49.predict(input);
                switch (alt49) {
            	case 1 :
            	    // InternalMyDsl.g:1801:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,27,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader4ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            // InternalMyDsl.g:1808:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
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
                    // InternalMyDsl.g:1809:4: ( RULE_BL )=>this_BL_4= RULE_BL
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
    // InternalMyDsl.g:1819:1: entryRuleHeader5Expression returns [EObject current=null] : iv_ruleHeader5Expression= ruleHeader5Expression EOF ;
    public final EObject entryRuleHeader5Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader5Expression = null;


        try {
            // InternalMyDsl.g:1819:58: (iv_ruleHeader5Expression= ruleHeader5Expression EOF )
            // InternalMyDsl.g:1820:2: iv_ruleHeader5Expression= ruleHeader5Expression EOF
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
    // InternalMyDsl.g:1826:1: ruleHeader5Expression returns [EObject current=null] : ( () otherlv_1= '#####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader5Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1832:2: ( ( () otherlv_1= '#####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:1833:2: ( () otherlv_1= '#####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:1833:2: ( () otherlv_1= '#####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:1834:3: () otherlv_1= '#####' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:1834:3: ()
            // InternalMyDsl.g:1835:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader5ExpressionAccess().getHeader5ExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeader5ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_1());
              		
            }
            // InternalMyDsl.g:1845:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1846:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1846:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1847:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader5ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_28);
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

            // InternalMyDsl.g:1864:3: ( ( '#' )=>otherlv_3= '#' )*
            loop51:
            do {
                int alt51=2;
                alt51 = dfa51.predict(input);
                switch (alt51) {
            	case 1 :
            	    // InternalMyDsl.g:1865:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,27,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader5ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            // InternalMyDsl.g:1872:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
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
                    // InternalMyDsl.g:1873:4: ( RULE_BL )=>this_BL_4= RULE_BL
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
    // InternalMyDsl.g:1883:1: entryRuleHeader6Expression returns [EObject current=null] : iv_ruleHeader6Expression= ruleHeader6Expression EOF ;
    public final EObject entryRuleHeader6Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader6Expression = null;


        try {
            // InternalMyDsl.g:1883:58: (iv_ruleHeader6Expression= ruleHeader6Expression EOF )
            // InternalMyDsl.g:1884:2: iv_ruleHeader6Expression= ruleHeader6Expression EOF
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
    // InternalMyDsl.g:1890:1: ruleHeader6Expression returns [EObject current=null] : ( () otherlv_1= '######' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader6Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1896:2: ( ( () otherlv_1= '######' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:1897:2: ( () otherlv_1= '######' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:1897:2: ( () otherlv_1= '######' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:1898:3: () otherlv_1= '######' ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:1898:3: ()
            // InternalMyDsl.g:1899:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader6ExpressionAccess().getHeader6ExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeader6ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_1());
              		
            }
            // InternalMyDsl.g:1909:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1910:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1910:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1911:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader6ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_28);
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

            // InternalMyDsl.g:1928:3: ( ( '#' )=>otherlv_3= '#' )*
            loop53:
            do {
                int alt53=2;
                alt53 = dfa53.predict(input);
                switch (alt53) {
            	case 1 :
            	    // InternalMyDsl.g:1929:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,27,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader6ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            // InternalMyDsl.g:1936:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_BL) ) {
                int LA54_1 = input.LA(2);

                if ( (synpred58_InternalMyDsl()) ) {
                    alt54=1;
                }
            }
            switch (alt54) {
                case 1 :
                    // InternalMyDsl.g:1937:4: ( RULE_BL )=>this_BL_4= RULE_BL
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
    // InternalMyDsl.g:1947:1: entryRuleEmphasisExpression returns [EObject current=null] : iv_ruleEmphasisExpression= ruleEmphasisExpression EOF ;
    public final EObject entryRuleEmphasisExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmphasisExpression = null;


        try {
            // InternalMyDsl.g:1947:59: (iv_ruleEmphasisExpression= ruleEmphasisExpression EOF )
            // InternalMyDsl.g:1948:2: iv_ruleEmphasisExpression= ruleEmphasisExpression EOF
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
    // InternalMyDsl.g:1954:1: ruleEmphasisExpression returns [EObject current=null] : ( ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) ) | ( (lv_c_3_0= ruleNaturalExpression ) ) )+ ;
    public final EObject ruleEmphasisExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_c_0_0 = null;

        EObject lv_c_1_0 = null;

        EObject lv_c_2_0 = null;

        EObject lv_c_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1960:2: ( ( ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) ) | ( (lv_c_3_0= ruleNaturalExpression ) ) )+ )
            // InternalMyDsl.g:1961:2: ( ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) ) | ( (lv_c_3_0= ruleNaturalExpression ) ) )+
            {
            // InternalMyDsl.g:1961:2: ( ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) ) | ( (lv_c_3_0= ruleNaturalExpression ) ) )+
            int cnt56=0;
            loop56:
            do {
                int alt56=3;
                alt56 = dfa56.predict(input);
                switch (alt56) {
            	case 1 :
            	    // InternalMyDsl.g:1962:3: ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) )
            	    {
            	    // InternalMyDsl.g:1962:3: ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) )
            	    // InternalMyDsl.g:1963:4: ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) )
            	    {
            	    // InternalMyDsl.g:1987:4: ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) )
            	    int alt55=3;
            	    int LA55_0 = input.LA(1);

            	    if ( (LA55_0==33) && (synpred61_InternalMyDsl())) {
            	        alt55=1;
            	    }
            	    else if ( (LA55_0==14) ) {
            	        alt55=2;
            	    }
            	    else if ( (LA55_0==34) ) {
            	        alt55=3;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 55, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // InternalMyDsl.g:1988:5: ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) )
            	            {
            	            // InternalMyDsl.g:1988:5: ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) )
            	            // InternalMyDsl.g:1989:6: ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression )
            	            {
            	            // InternalMyDsl.g:1993:6: (lv_c_0_0= ruleStrongExpression )
            	            // InternalMyDsl.g:1994:7: lv_c_0_0= ruleStrongExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getCStrongExpressionParserRuleCall_0_0_0_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_29);
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
            	            // InternalMyDsl.g:2012:5: ( (lv_c_1_0= ruleItalicExpression ) )
            	            {
            	            // InternalMyDsl.g:2012:5: ( (lv_c_1_0= ruleItalicExpression ) )
            	            // InternalMyDsl.g:2013:6: (lv_c_1_0= ruleItalicExpression )
            	            {
            	            // InternalMyDsl.g:2013:6: (lv_c_1_0= ruleItalicExpression )
            	            // InternalMyDsl.g:2014:7: lv_c_1_0= ruleItalicExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getCItalicExpressionParserRuleCall_0_0_1_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_29);
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
            	            // InternalMyDsl.g:2032:5: ( (lv_c_2_0= ruleScratchExpression ) )
            	            {
            	            // InternalMyDsl.g:2032:5: ( (lv_c_2_0= ruleScratchExpression ) )
            	            // InternalMyDsl.g:2033:6: (lv_c_2_0= ruleScratchExpression )
            	            {
            	            // InternalMyDsl.g:2033:6: (lv_c_2_0= ruleScratchExpression )
            	            // InternalMyDsl.g:2034:7: lv_c_2_0= ruleScratchExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getCScratchExpressionParserRuleCall_0_0_2_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_29);
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
            	    // InternalMyDsl.g:2054:3: ( (lv_c_3_0= ruleNaturalExpression ) )
            	    {
            	    // InternalMyDsl.g:2054:3: ( (lv_c_3_0= ruleNaturalExpression ) )
            	    // InternalMyDsl.g:2055:4: (lv_c_3_0= ruleNaturalExpression )
            	    {
            	    // InternalMyDsl.g:2055:4: (lv_c_3_0= ruleNaturalExpression )
            	    // InternalMyDsl.g:2056:5: lv_c_3_0= ruleNaturalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getCNaturalExpressionParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_29);
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
            	    if ( cnt56 >= 1 ) break loop56;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(56, input);
                        throw eee;
                }
                cnt56++;
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
    // InternalMyDsl.g:2077:1: entryRuleStrongExpression returns [EObject current=null] : iv_ruleStrongExpression= ruleStrongExpression EOF ;
    public final EObject entryRuleStrongExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrongExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:2079:2: (iv_ruleStrongExpression= ruleStrongExpression EOF )
            // InternalMyDsl.g:2080:2: iv_ruleStrongExpression= ruleStrongExpression EOF
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
    // InternalMyDsl.g:2089:1: ruleStrongExpression returns [EObject current=null] : ( () otherlv_1= '**' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '**' ) ;
    public final EObject ruleStrongExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:2096:2: ( ( () otherlv_1= '**' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '**' ) )
            // InternalMyDsl.g:2097:2: ( () otherlv_1= '**' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '**' )
            {
            // InternalMyDsl.g:2097:2: ( () otherlv_1= '**' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '**' )
            // InternalMyDsl.g:2098:3: () otherlv_1= '**' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '**'
            {
            // InternalMyDsl.g:2098:3: ()
            // InternalMyDsl.g:2099:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStrongExpressionAccess().getStrongExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getStrongExpressionAccess().getAsteriskAsteriskKeyword_1());
              		
            }
            // InternalMyDsl.g:2109:3: ( (lv_content_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:2110:4: (lv_content_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:2110:4: (lv_content_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:2111:5: lv_content_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStrongExpressionAccess().getContentEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_30);
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

            otherlv_3=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:2139:1: entryRuleItalicExpression returns [EObject current=null] : iv_ruleItalicExpression= ruleItalicExpression EOF ;
    public final EObject entryRuleItalicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItalicExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:2141:2: (iv_ruleItalicExpression= ruleItalicExpression EOF )
            // InternalMyDsl.g:2142:2: iv_ruleItalicExpression= ruleItalicExpression EOF
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
    // InternalMyDsl.g:2151:1: ruleItalicExpression returns [EObject current=null] : ( () otherlv_1= '*' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '*' ) ;
    public final EObject ruleItalicExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:2158:2: ( ( () otherlv_1= '*' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '*' ) )
            // InternalMyDsl.g:2159:2: ( () otherlv_1= '*' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '*' )
            {
            // InternalMyDsl.g:2159:2: ( () otherlv_1= '*' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '*' )
            // InternalMyDsl.g:2160:3: () otherlv_1= '*' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '*'
            {
            // InternalMyDsl.g:2160:3: ()
            // InternalMyDsl.g:2161:4: 
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
            // InternalMyDsl.g:2171:3: ( (lv_content_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:2172:4: (lv_content_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:2172:4: (lv_content_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:2173:5: lv_content_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getItalicExpressionAccess().getContentEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:2201:1: entryRuleScratchExpression returns [EObject current=null] : iv_ruleScratchExpression= ruleScratchExpression EOF ;
    public final EObject entryRuleScratchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScratchExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:2203:2: (iv_ruleScratchExpression= ruleScratchExpression EOF )
            // InternalMyDsl.g:2204:2: iv_ruleScratchExpression= ruleScratchExpression EOF
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
    // InternalMyDsl.g:2213:1: ruleScratchExpression returns [EObject current=null] : ( () otherlv_1= '~~' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '~~' ) ;
    public final EObject ruleScratchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:2220:2: ( ( () otherlv_1= '~~' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '~~' ) )
            // InternalMyDsl.g:2221:2: ( () otherlv_1= '~~' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '~~' )
            {
            // InternalMyDsl.g:2221:2: ( () otherlv_1= '~~' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '~~' )
            // InternalMyDsl.g:2222:3: () otherlv_1= '~~' ( (lv_content_2_0= ruleEmphasisExpression ) ) otherlv_3= '~~'
            {
            // InternalMyDsl.g:2222:3: ()
            // InternalMyDsl.g:2223:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getScratchExpressionAccess().getScratchExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getScratchExpressionAccess().getTildeTildeKeyword_1());
              		
            }
            // InternalMyDsl.g:2233:3: ( (lv_content_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:2234:4: (lv_content_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:2234:4: (lv_content_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:2235:5: lv_content_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getScratchExpressionAccess().getContentEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_32);
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

            otherlv_3=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:2263:1: entryRuleNaturalExpression returns [EObject current=null] : iv_ruleNaturalExpression= ruleNaturalExpression EOF ;
    public final EObject entryRuleNaturalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalExpression = null;


        try {
            // InternalMyDsl.g:2263:58: (iv_ruleNaturalExpression= ruleNaturalExpression EOF )
            // InternalMyDsl.g:2264:2: iv_ruleNaturalExpression= ruleNaturalExpression EOF
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
    // InternalMyDsl.g:2270:1: ruleNaturalExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleContent ) ) ) ;
    public final EObject ruleNaturalExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2276:2: ( ( () ( (lv_value_1_0= ruleContent ) ) ) )
            // InternalMyDsl.g:2277:2: ( () ( (lv_value_1_0= ruleContent ) ) )
            {
            // InternalMyDsl.g:2277:2: ( () ( (lv_value_1_0= ruleContent ) ) )
            // InternalMyDsl.g:2278:3: () ( (lv_value_1_0= ruleContent ) )
            {
            // InternalMyDsl.g:2278:3: ()
            // InternalMyDsl.g:2279:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNaturalExpressionAccess().getNaturalExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:2285:3: ( (lv_value_1_0= ruleContent ) )
            // InternalMyDsl.g:2286:4: (lv_value_1_0= ruleContent )
            {
            // InternalMyDsl.g:2286:4: (lv_value_1_0= ruleContent )
            // InternalMyDsl.g:2287:5: lv_value_1_0= ruleContent
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
    // InternalMyDsl.g:2308:1: entryRuleContent returns [String current=null] : iv_ruleContent= ruleContent EOF ;
    public final String entryRuleContent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContent = null;


        try {
            // InternalMyDsl.g:2308:47: (iv_ruleContent= ruleContent EOF )
            // InternalMyDsl.g:2309:2: iv_ruleContent= ruleContent EOF
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
    // InternalMyDsl.g:2315:1: ruleContent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) ) | kw= '\\'' | kw= '-' | kw= '|' | kw= '\"' ) ;
    public final AntlrDatatypeRuleToken ruleContent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;
        Token this_INT_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2321:2: ( ( ( ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) ) | kw= '\\'' | kw= '-' | kw= '|' | kw= '\"' ) )
            // InternalMyDsl.g:2322:2: ( ( ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) ) | kw= '\\'' | kw= '-' | kw= '|' | kw= '\"' )
            {
            // InternalMyDsl.g:2322:2: ( ( ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) ) | kw= '\\'' | kw= '-' | kw= '|' | kw= '\"' )
            int alt58=5;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) && (synpred62_InternalMyDsl())) {
                alt58=1;
            }
            else if ( (LA58_0==RULE_STRING) && (synpred62_InternalMyDsl())) {
                alt58=1;
            }
            else if ( (LA58_0==RULE_INT) && (synpred62_InternalMyDsl())) {
                alt58=1;
            }
            else if ( (LA58_0==35) ) {
                alt58=2;
            }
            else if ( (LA58_0==13) ) {
                alt58=3;
            }
            else if ( (LA58_0==19) ) {
                alt58=4;
            }
            else if ( (LA58_0==36) ) {
                alt58=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalMyDsl.g:2323:3: ( ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) )
                    {
                    // InternalMyDsl.g:2323:3: ( ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) )
                    // InternalMyDsl.g:2324:4: ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT )
                    {
                    // InternalMyDsl.g:2332:4: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT )
                    int alt57=3;
                    switch ( input.LA(1) ) {
                    case RULE_ID:
                        {
                        alt57=1;
                        }
                        break;
                    case RULE_STRING:
                        {
                        alt57=2;
                        }
                        break;
                    case RULE_INT:
                        {
                        alt57=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 0, input);

                        throw nvae;
                    }

                    switch (alt57) {
                        case 1 :
                            // InternalMyDsl.g:2333:5: this_ID_0= RULE_ID
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
                            // InternalMyDsl.g:2341:5: this_STRING_1= RULE_STRING
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
                            // InternalMyDsl.g:2349:5: this_INT_2= RULE_INT
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
                    // InternalMyDsl.g:2359:3: kw= '\\''
                    {
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getContentAccess().getApostropheKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2365:3: kw= '-'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getContentAccess().getHyphenMinusKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2371:3: kw= '|'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getContentAccess().getVerticalLineKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:2377:3: kw= '\"'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
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
        int alt61=5;
        alt61 = dfa61.predict(input);
        switch (alt61) {
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
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==RULE_BL) && (synpred2_InternalMyDsl())) {
                    alt59=1;
                }
                switch (alt59) {
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
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_BL) && (synpred3_InternalMyDsl())) {
                    alt60=1;
                }
                switch (alt60) {
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
        // InternalMyDsl.g:458:6: ( ruleURLedExpression )
        // InternalMyDsl.g:458:7: ruleURLedExpression
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
        // InternalMyDsl.g:456:4: ( ( ( ( ruleURLedExpression )=> ruleURLedExpression ) | ruleTabExpression | ruleQuoteExpression ) )
        // InternalMyDsl.g:456:5: ( ( ( ruleURLedExpression )=> ruleURLedExpression ) | ruleTabExpression | ruleQuoteExpression )
        {
        // InternalMyDsl.g:456:5: ( ( ( ruleURLedExpression )=> ruleURLedExpression ) | ruleTabExpression | ruleQuoteExpression )
        int alt62=3;
        int LA62_0 = input.LA(1);

        if ( (LA62_0==24) && (synpred9_InternalMyDsl())) {
            alt62=1;
        }
        else if ( (LA62_0==25) && (synpred9_InternalMyDsl())) {
            alt62=1;
        }
        else if ( (LA62_0==20) && (synpred9_InternalMyDsl())) {
            alt62=1;
        }
        else if ( ((LA62_0>=RULE_INT && LA62_0<=RULE_STRING)||LA62_0==13||LA62_0==19||(LA62_0>=35 && LA62_0<=36)) ) {
            alt62=2;
        }
        else if ( (LA62_0==18) ) {
            alt62=3;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 62, 0, input);

            throw nvae;
        }
        switch (alt62) {
            case 1 :
                // InternalMyDsl.g:457:5: ( ( ruleURLedExpression )=> ruleURLedExpression )
                {
                // InternalMyDsl.g:457:5: ( ( ruleURLedExpression )=> ruleURLedExpression )
                // InternalMyDsl.g:458:6: ( ruleURLedExpression )=> ruleURLedExpression
                {
                pushFollow(FOLLOW_2);
                ruleURLedExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // InternalMyDsl.g:462:5: ruleTabExpression
                {
                pushFollow(FOLLOW_2);
                ruleTabExpression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 3 :
                // InternalMyDsl.g:464:5: ruleQuoteExpression
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
        // InternalMyDsl.g:469:6: ( ruleURLedExpression )
        // InternalMyDsl.g:469:7: ruleURLedExpression
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
        // InternalMyDsl.g:547:7: ( ( ruleVideoExpression ) )
        // InternalMyDsl.g:547:8: ( ruleVideoExpression )
        {
        // InternalMyDsl.g:547:8: ( ruleVideoExpression )
        // InternalMyDsl.g:548:8: ruleVideoExpression
        {
        pushFollow(FOLLOW_2);
        ruleVideoExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalMyDsl

    // $ANTLR start synpred13_InternalMyDsl
    public final void synpred13_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:539:5: ( ( ( ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) )
        // InternalMyDsl.g:539:6: ( ( ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) )
        {
        // InternalMyDsl.g:539:6: ( ( ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) )
        int alt63=2;
        int LA63_0 = input.LA(1);

        if ( (LA63_0==24) ) {
            alt63=1;
        }
        else if ( (LA63_0==25) && (synpred12_InternalMyDsl())) {
            alt63=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 63, 0, input);

            throw nvae;
        }
        switch (alt63) {
            case 1 :
                // InternalMyDsl.g:540:6: ( ( ruleImageExpression ) )
                {
                // InternalMyDsl.g:540:6: ( ( ruleImageExpression ) )
                // InternalMyDsl.g:541:7: ( ruleImageExpression )
                {
                // InternalMyDsl.g:541:7: ( ruleImageExpression )
                // InternalMyDsl.g:542:8: ruleImageExpression
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
                // InternalMyDsl.g:546:6: ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) )
                {
                // InternalMyDsl.g:546:6: ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) )
                // InternalMyDsl.g:547:7: ( ( ruleVideoExpression ) )=> ( ruleVideoExpression )
                {
                // InternalMyDsl.g:551:7: ( ruleVideoExpression )
                // InternalMyDsl.g:552:8: ruleVideoExpression
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
    // $ANTLR end synpred13_InternalMyDsl

    // $ANTLR start synpred14_InternalMyDsl
    public final void synpred14_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:579:7: ( ( ruleVideoExpression ) )
        // InternalMyDsl.g:579:8: ( ruleVideoExpression )
        {
        // InternalMyDsl.g:579:8: ( ruleVideoExpression )
        // InternalMyDsl.g:580:8: ruleVideoExpression
        {
        pushFollow(FOLLOW_2);
        ruleVideoExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalMyDsl

    // $ANTLR start synpred15_InternalMyDsl
    public final void synpred15_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:700:6: ( RULE_BL )
        // InternalMyDsl.g:700:7: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalMyDsl

    // $ANTLR start synpred16_InternalMyDsl
    public final void synpred16_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:744:5: ( RULE_BL )
        // InternalMyDsl.g:744:6: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalMyDsl

    // $ANTLR start synpred18_InternalMyDsl
    public final void synpred18_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:807:4: ( RULE_BL )
        // InternalMyDsl.g:807:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalMyDsl

    // $ANTLR start synpred26_InternalMyDsl
    public final void synpred26_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:911:6: ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )
        // InternalMyDsl.g:911:7: ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) )
        {
        // InternalMyDsl.g:911:7: ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) )
        // InternalMyDsl.g:912:7: RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) )
        {
        match(input,RULE_BL,FOLLOW_17); if (state.failed) return ;
        // InternalMyDsl.g:913:7: ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) )
        // InternalMyDsl.g:914:8: ( ( ruleLineExpression ) )=> ( ruleLineExpression )
        {
        // InternalMyDsl.g:918:8: ( ruleLineExpression )
        // InternalMyDsl.g:919:9: ruleLineExpression
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
    // $ANTLR end synpred26_InternalMyDsl

    // $ANTLR start synpred28_InternalMyDsl
    public final void synpred28_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1040:4: ( '|' )
        // InternalMyDsl.g:1040:5: '|'
        {
        match(input,19,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalMyDsl

    // $ANTLR start synpred29_InternalMyDsl
    public final void synpred29_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1067:5: ( '|' )
        // InternalMyDsl.g:1067:6: '|'
        {
        match(input,19,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalMyDsl

    // $ANTLR start synpred30_InternalMyDsl
    public final void synpred30_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1094:4: ( '|' )
        // InternalMyDsl.g:1094:5: '|'
        {
        match(input,19,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalMyDsl

    // $ANTLR start synpred33_InternalMyDsl
    public final void synpred33_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1179:4: ( RULE_BL )
        // InternalMyDsl.g:1179:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalMyDsl

    // $ANTLR start synpred36_InternalMyDsl
    public final void synpred36_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1264:4: ( ')' )
        // InternalMyDsl.g:1264:5: ')'
        {
        match(input,23,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_InternalMyDsl

    // $ANTLR start synpred37_InternalMyDsl
    public final void synpred37_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1271:4: ( RULE_BL )
        // InternalMyDsl.g:1271:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalMyDsl

    // $ANTLR start synpred40_InternalMyDsl
    public final void synpred40_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1356:4: ( ')' )
        // InternalMyDsl.g:1356:5: ')'
        {
        match(input,23,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_InternalMyDsl

    // $ANTLR start synpred41_InternalMyDsl
    public final void synpred41_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1363:4: ( RULE_BL )
        // InternalMyDsl.g:1363:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_InternalMyDsl

    // $ANTLR start synpred44_InternalMyDsl
    public final void synpred44_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1448:4: ( ')](' )
        // InternalMyDsl.g:1448:5: ')]('
        {
        match(input,26,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_InternalMyDsl

    // $ANTLR start synpred45_InternalMyDsl
    public final void synpred45_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1474:4: ( ')' )
        // InternalMyDsl.g:1474:5: ')'
        {
        match(input,23,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_InternalMyDsl

    // $ANTLR start synpred46_InternalMyDsl
    public final void synpred46_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1481:4: ( RULE_BL )
        // InternalMyDsl.g:1481:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_InternalMyDsl

    // $ANTLR start synpred47_InternalMyDsl
    public final void synpred47_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1609:4: ( '#' )
        // InternalMyDsl.g:1609:5: '#'
        {
        match(input,27,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_InternalMyDsl

    // $ANTLR start synpred48_InternalMyDsl
    public final void synpred48_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1617:4: ( RULE_BL )
        // InternalMyDsl.g:1617:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_InternalMyDsl

    // $ANTLR start synpred49_InternalMyDsl
    public final void synpred49_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1673:4: ( '#' )
        // InternalMyDsl.g:1673:5: '#'
        {
        match(input,27,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_InternalMyDsl

    // $ANTLR start synpred50_InternalMyDsl
    public final void synpred50_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1681:4: ( RULE_BL )
        // InternalMyDsl.g:1681:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_InternalMyDsl

    // $ANTLR start synpred51_InternalMyDsl
    public final void synpred51_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1737:4: ( '#' )
        // InternalMyDsl.g:1737:5: '#'
        {
        match(input,27,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_InternalMyDsl

    // $ANTLR start synpred52_InternalMyDsl
    public final void synpred52_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1745:4: ( RULE_BL )
        // InternalMyDsl.g:1745:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_InternalMyDsl

    // $ANTLR start synpred53_InternalMyDsl
    public final void synpred53_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1801:4: ( '#' )
        // InternalMyDsl.g:1801:5: '#'
        {
        match(input,27,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_InternalMyDsl

    // $ANTLR start synpred54_InternalMyDsl
    public final void synpred54_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1809:4: ( RULE_BL )
        // InternalMyDsl.g:1809:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_InternalMyDsl

    // $ANTLR start synpred55_InternalMyDsl
    public final void synpred55_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1865:4: ( '#' )
        // InternalMyDsl.g:1865:5: '#'
        {
        match(input,27,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_InternalMyDsl

    // $ANTLR start synpred56_InternalMyDsl
    public final void synpred56_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1873:4: ( RULE_BL )
        // InternalMyDsl.g:1873:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_InternalMyDsl

    // $ANTLR start synpred57_InternalMyDsl
    public final void synpred57_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1929:4: ( '#' )
        // InternalMyDsl.g:1929:5: '#'
        {
        match(input,27,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_InternalMyDsl

    // $ANTLR start synpred58_InternalMyDsl
    public final void synpred58_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1937:4: ( RULE_BL )
        // InternalMyDsl.g:1937:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_InternalMyDsl

    // $ANTLR start synpred59_InternalMyDsl
    public final void synpred59_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1965:6: ( ( ruleStrongExpression ) )
        // InternalMyDsl.g:1965:7: ( ruleStrongExpression )
        {
        // InternalMyDsl.g:1965:7: ( ruleStrongExpression )
        // InternalMyDsl.g:1966:7: ruleStrongExpression
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
        // InternalMyDsl.g:1963:4: ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )
        // InternalMyDsl.g:1963:5: ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) )
        {
        // InternalMyDsl.g:1963:5: ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) )
        int alt65=3;
        int LA65_0 = input.LA(1);

        if ( (LA65_0==33) && (synpred59_InternalMyDsl())) {
            alt65=1;
        }
        else if ( (LA65_0==14) ) {
            alt65=2;
        }
        else if ( (LA65_0==34) ) {
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
                // InternalMyDsl.g:1964:5: ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) )
                {
                // InternalMyDsl.g:1964:5: ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) )
                // InternalMyDsl.g:1965:6: ( ( ruleStrongExpression ) )=> ( ruleStrongExpression )
                {
                // InternalMyDsl.g:1969:6: ( ruleStrongExpression )
                // InternalMyDsl.g:1970:7: ruleStrongExpression
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
                // InternalMyDsl.g:1974:5: ( ( ruleItalicExpression ) )
                {
                // InternalMyDsl.g:1974:5: ( ( ruleItalicExpression ) )
                // InternalMyDsl.g:1975:6: ( ruleItalicExpression )
                {
                // InternalMyDsl.g:1975:6: ( ruleItalicExpression )
                // InternalMyDsl.g:1976:7: ruleItalicExpression
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
                // InternalMyDsl.g:1980:5: ( ( ruleScratchExpression ) )
                {
                // InternalMyDsl.g:1980:5: ( ( ruleScratchExpression ) )
                // InternalMyDsl.g:1981:6: ( ruleScratchExpression )
                {
                // InternalMyDsl.g:1981:6: ( ruleScratchExpression )
                // InternalMyDsl.g:1982:7: ruleScratchExpression
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
    // $ANTLR end synpred60_InternalMyDsl

    // $ANTLR start synpred61_InternalMyDsl
    public final void synpred61_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1989:6: ( ( ruleStrongExpression ) )
        // InternalMyDsl.g:1989:7: ( ruleStrongExpression )
        {
        // InternalMyDsl.g:1989:7: ( ruleStrongExpression )
        // InternalMyDsl.g:1990:7: ruleStrongExpression
        {
        pushFollow(FOLLOW_2);
        ruleStrongExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred61_InternalMyDsl

    // $ANTLR start synpred62_InternalMyDsl
    public final void synpred62_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2324:4: ( ( RULE_ID | RULE_STRING | RULE_INT ) )
        // InternalMyDsl.g:2324:5: ( RULE_ID | RULE_STRING | RULE_INT )
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
    // $ANTLR end synpred62_InternalMyDsl

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
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA61 dfa61 = new DFA61(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\1\4\7\uffff\3\0\2\uffff\1\0\12\uffff";
    static final String dfa_3s = "\1\44\7\uffff\3\0\2\uffff\1\0\12\uffff";
    static final String dfa_4s = "\1\uffff\7\1\3\uffff\2\1\1\uffff\1\2\11\uffff";
    static final String dfa_5s = "\1\0\7\uffff\1\1\1\2\1\3\2\uffff\1\4\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\7\1\uffff\1\15\2\16\4\uffff\1\11\1\12\1\13\1\14\1\uffff\2\16\1\10\3\uffff\2\16\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\4\16",
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

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "123:2: ( ( ( ( ( ( ruleHeaderExpression ) ) | ( ( ruleBreakLineExpression ) ) | ( ( ruleRefExpression ) ) | ( ( ( ( ruleHorizontalExpression ) )=> ( ruleHorizontalExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) | ( ( ( ruleListExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) ) )=> ( ( (lv_c_0_0= ruleHeaderExpression ) ) | ( (lv_c_1_0= ruleBreakLineExpression ) ) | ( (lv_c_2_0= ruleRefExpression ) ) | ( ( ( ( ruleHorizontalExpression ) )=> (lv_c_3_0= ruleHorizontalExpression ) ) ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) | ( ( (lv_c_5_0= ruleListExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) ) ) | ( ( (lv_c_7_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_8= RULE_BL )? ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_0 = input.LA(1);

                         
                        int index6_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA6_0==27) && (synpred4_InternalMyDsl())) {s = 1;}

                        else if ( (LA6_0==28) && (synpred4_InternalMyDsl())) {s = 2;}

                        else if ( (LA6_0==29) && (synpred4_InternalMyDsl())) {s = 3;}

                        else if ( (LA6_0==30) && (synpred4_InternalMyDsl())) {s = 4;}

                        else if ( (LA6_0==31) && (synpred4_InternalMyDsl())) {s = 5;}

                        else if ( (LA6_0==32) && (synpred4_InternalMyDsl())) {s = 6;}

                        else if ( (LA6_0==RULE_BL) && (synpred4_InternalMyDsl())) {s = 7;}

                        else if ( (LA6_0==20) ) {s = 8;}

                        else if ( (LA6_0==13) ) {s = 9;}

                        else if ( (LA6_0==14) ) {s = 10;}

                        else if ( (LA6_0==15) && (synpred4_InternalMyDsl())) {s = 11;}

                        else if ( (LA6_0==16) && (synpred4_InternalMyDsl())) {s = 12;}

                        else if ( (LA6_0==RULE_INT) ) {s = 13;}

                        else if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_STRING)||(LA6_0>=18 && LA6_0<=19)||(LA6_0>=24 && LA6_0<=25)||(LA6_0>=33 && LA6_0<=36)) ) {s = 14;}

                         
                        input.seek(index6_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_8 = input.LA(1);

                         
                        int index6_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 12;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index6_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA6_9 = input.LA(1);

                         
                        int index6_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 12;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index6_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA6_10 = input.LA(1);

                         
                        int index6_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 12;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index6_10);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA6_13 = input.LA(1);

                         
                        int index6_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 12;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index6_13);
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
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\1\4\3\uffff\2\5\5\uffff";
    static final String dfa_9s = "\1\40\3\uffff\2\17\5\uffff";
    static final String dfa_10s = "\1\uffff\1\1\1\2\1\3\2\uffff\1\4\1\5\3\4";
    static final String dfa_11s = "\1\2\3\uffff\1\0\1\1\5\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\1\uffff\1\7\6\uffff\1\4\1\5\1\6\1\7\3\uffff\1\3\6\uffff\6\1",
            "",
            "",
            "",
            "\1\7\7\uffff\1\10\1\11\1\12",
            "\1\7\7\uffff\1\10\1\11\1\12",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "173:4: ( ( (lv_c_0_0= ruleHeaderExpression ) ) | ( (lv_c_1_0= ruleBreakLineExpression ) ) | ( (lv_c_2_0= ruleRefExpression ) ) | ( ( ( ( ruleHorizontalExpression ) )=> (lv_c_3_0= ruleHorizontalExpression ) ) ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) | ( ( (lv_c_5_0= ruleListExpression ) ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_4 = input.LA(1);

                         
                        int index4_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA4_4==RULE_WS) ) {s = 7;}

                        else if ( (LA4_4==13) && (synpred5_InternalMyDsl())) {s = 8;}

                        else if ( (LA4_4==14) && (synpred5_InternalMyDsl())) {s = 9;}

                        else if ( (LA4_4==15) && (synpred5_InternalMyDsl())) {s = 10;}

                         
                        input.seek(index4_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_5 = input.LA(1);

                         
                        int index4_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA4_5==13) && (synpred5_InternalMyDsl())) {s = 8;}

                        else if ( (LA4_5==14) && (synpred5_InternalMyDsl())) {s = 9;}

                        else if ( (LA4_5==15) && (synpred5_InternalMyDsl())) {s = 10;}

                        else if ( (LA4_5==RULE_WS) ) {s = 7;}

                         
                        input.seek(index4_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_0 = input.LA(1);

                         
                        int index4_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA4_0>=27 && LA4_0<=32)) ) {s = 1;}

                        else if ( (LA4_0==RULE_BL) ) {s = 2;}

                        else if ( (LA4_0==20) ) {s = 3;}

                        else if ( (LA4_0==13) ) {s = 4;}

                        else if ( (LA4_0==14) ) {s = 5;}

                        else if ( (LA4_0==15) && (synpred5_InternalMyDsl())) {s = 6;}

                        else if ( (LA4_0==RULE_INT||LA4_0==16) ) {s = 7;}

                         
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
    static final String dfa_13s = "\31\uffff";
    static final String dfa_14s = "\1\1\30\uffff";
    static final String dfa_15s = "\1\4\30\uffff";
    static final String dfa_16s = "\1\44\30\uffff";
    static final String dfa_17s = "\1\uffff\1\4\10\uffff\1\1\1\2\1\3\14\uffff";
    static final String dfa_18s = "\31\uffff}>";
    static final String[] dfa_19s = {
            "\1\1\1\uffff\3\1\4\uffff\1\12\1\13\1\14\1\1\1\uffff\3\1\3\uffff\2\1\1\uffff\12\1",
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

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "()+ loopback of 414:3: (otherlv_7= '-' | otherlv_8= '*' | otherlv_9= '_' )+";
        }
    }
    static final String dfa_20s = "\26\uffff";
    static final String dfa_21s = "\5\uffff\6\14\3\uffff\7\14\1\uffff";
    static final String dfa_22s = "\1\6\3\uffff\1\0\6\4\2\uffff\1\0\7\4\1\0";
    static final String dfa_23s = "\1\44\3\uffff\1\0\6\44\2\uffff\1\0\7\44\1\0";
    static final String dfa_24s = "\1\uffff\3\1\7\uffff\1\1\1\2\11\uffff";
    static final String dfa_25s = "\1\1\3\uffff\1\0\10\uffff\1\2\7\uffff\1\3}>";
    static final String[] dfa_26s = {
            "\1\7\1\5\1\6\4\uffff\1\11\1\14\3\uffff\1\13\1\4\1\3\3\uffff\1\1\1\2\7\uffff\2\14\1\10\1\12",
            "",
            "",
            "",
            "\1\uffff",
            "\1\16\1\uffff\3\14\4\uffff\4\14\1\uffff\1\14\1\15\1\14\3\uffff\2\14\1\uffff\12\14",
            "\1\16\1\uffff\3\14\4\uffff\4\14\1\uffff\1\14\1\15\1\14\3\uffff\2\14\1\uffff\12\14",
            "\1\16\1\uffff\3\14\4\uffff\4\14\1\uffff\1\14\1\15\1\14\3\uffff\2\14\1\uffff\12\14",
            "\1\16\1\uffff\3\14\4\uffff\4\14\1\uffff\1\14\1\15\1\14\3\uffff\2\14\1\uffff\12\14",
            "\1\16\1\uffff\3\14\4\uffff\4\14\1\uffff\1\14\1\15\1\14\3\uffff\2\14\1\uffff\12\14",
            "\1\16\1\uffff\3\14\4\uffff\4\14\1\uffff\1\14\1\15\1\14\3\uffff\2\14\1\uffff\12\14",
            "",
            "",
            "\1\uffff",
            "\1\14\1\uffff\3\14\4\uffff\1\20\3\14\1\uffff\1\14\1\17\1\14\3\uffff\2\14\1\uffff\12\14",
            "\1\14\1\uffff\3\14\4\uffff\1\20\3\14\1\uffff\3\14\3\uffff\2\14\1\uffff\12\14",
            "\5\14\4\uffff\1\21\3\14\1\uffff\3\14\3\uffff\2\14\1\uffff\12\14",
            "\5\14\4\uffff\1\23\3\14\1\uffff\1\14\1\22\1\14\3\uffff\2\14\1\uffff\12\14",
            "\1\14\1\uffff\3\14\4\uffff\1\24\3\14\1\uffff\3\14\3\uffff\2\14\1\uffff\12\14",
            "\5\14\4\uffff\1\23\3\14\1\uffff\1\14\1\22\1\14\3\uffff\2\14\1\uffff\12\14",
            "\5\14\4\uffff\1\25\3\14\1\uffff\3\14\3\uffff\2\14\1\uffff\12\14",
            "\1\uffff"
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "454:2: ( ( ( ( ( ( ruleURLedExpression )=> ruleURLedExpression ) | ruleTabExpression | ruleQuoteExpression ) )=> ( ( ( ruleURLedExpression )=>this_URLedExpression_0= ruleURLedExpression ) | this_TabExpression_1= ruleTabExpression | this_QuoteExpression_2= ruleQuoteExpression ) ) | this_EmphasisExpression_3= ruleEmphasisExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalMyDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index11_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_0 = input.LA(1);

                         
                        int index11_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_0==24) && (synpred10_InternalMyDsl())) {s = 1;}

                        else if ( (LA11_0==25) && (synpred10_InternalMyDsl())) {s = 2;}

                        else if ( (LA11_0==20) && (synpred10_InternalMyDsl())) {s = 3;}

                        else if ( (LA11_0==19) ) {s = 4;}

                        else if ( (LA11_0==RULE_ID) ) {s = 5;}

                        else if ( (LA11_0==RULE_STRING) ) {s = 6;}

                        else if ( (LA11_0==RULE_INT) ) {s = 7;}

                        else if ( (LA11_0==35) ) {s = 8;}

                        else if ( (LA11_0==13) ) {s = 9;}

                        else if ( (LA11_0==36) ) {s = 10;}

                        else if ( (LA11_0==18) && (synpred10_InternalMyDsl())) {s = 11;}

                        else if ( (LA11_0==14||(LA11_0>=33 && LA11_0<=34)) ) {s = 12;}

                         
                        input.seek(index11_0);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_13 = input.LA(1);

                         
                        int index11_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalMyDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index11_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_21 = input.LA(1);

                         
                        int index11_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalMyDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 12;}

                         
                        input.seek(index11_21);
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
    static final String dfa_27s = "\1\uffff\1\2\7\uffff\3\1\2\uffff\13\1";
    static final String[] dfa_28s = {
            "\1\1\1\uffff\1\16\1\22\1\23\4\uffff\1\12\1\13\2\1\1\uffff\1\26\1\21\1\11\3\uffff\1\17\1\20\1\uffff\6\1\1\27\1\30\1\24\1\25",
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
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_27;
            this.special = dfa_18;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "()+ loopback of 787:3: ( (lv_content_2_0= ruleTextExpression ) )+";
        }
    }
    static final String dfa_29s = "\2\2\11\uffff";
    static final String dfa_30s = "\2\4\1\uffff\7\0\1\uffff";
    static final String dfa_31s = "\2\44\1\uffff\7\0\1\uffff";
    static final String dfa_32s = "\2\uffff\1\2\7\uffff\1\1";
    static final String dfa_33s = "\3\uffff\1\5\1\3\1\1\1\6\1\2\1\4\1\0\1\uffff}>";
    static final String[] dfa_34s = {
            "\1\1\1\uffff\3\2\4\uffff\4\2\1\uffff\3\2\3\uffff\2\2\1\uffff\12\2",
            "\1\2\1\uffff\1\4\1\6\1\7\4\uffff\1\3\3\2\1\uffff\1\2\1\5\1\2\3\uffff\2\2\1\uffff\10\2\1\10\1\11",
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
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[][] dfa_34 = unpackEncodedStringArray(dfa_34s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_7;
            this.eof = dfa_29;
            this.min = dfa_30;
            this.max = dfa_31;
            this.accept = dfa_32;
            this.special = dfa_33;
            this.transition = dfa_34;
        }
        public String getDescription() {
            return "()* loopback of 910:5: ( ( ( RULE_BL ( ( ( ruleLineExpression ) )=> ( ruleLineExpression ) ) ) )=> (this_BL_4= RULE_BL ( ( ( ruleLineExpression ) )=> (lv_lines_5_0= ruleLineExpression ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_9 = input.LA(1);

                         
                        int index24_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index24_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_5 = input.LA(1);

                         
                        int index24_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index24_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_7 = input.LA(1);

                         
                        int index24_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index24_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA24_4 = input.LA(1);

                         
                        int index24_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index24_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA24_8 = input.LA(1);

                         
                        int index24_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index24_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA24_3 = input.LA(1);

                         
                        int index24_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index24_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA24_6 = input.LA(1);

                         
                        int index24_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index24_6);
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
    static final String dfa_35s = "\3\uffff\1\6\1\1\1\3\1\0\1\4\1\2\1\5\1\uffff}>";
    static final String[] dfa_36s = {
            "\1\2\1\uffff\3\2\4\uffff\4\2\1\uffff\1\2\1\1\1\2\3\uffff\2\2\1\uffff\12\2",
            "\1\2\1\uffff\1\5\1\6\1\7\4\uffff\1\4\3\2\1\uffff\1\2\1\3\1\2\3\uffff\2\2\1\uffff\10\2\1\10\1\11",
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
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[][] dfa_36 = unpackEncodedStringArray(dfa_36s);

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_7;
            this.eof = dfa_29;
            this.min = dfa_30;
            this.max = dfa_31;
            this.accept = dfa_32;
            this.special = dfa_35;
            this.transition = dfa_36;
        }
        public String getDescription() {
            return "()* loopback of 1065:3: ( ( ( '|' )=>otherlv_2= '|' ) ( (lv_cells_3_0= ruleNaturalExpression ) ) )*";
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
                        if ( (synpred29_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_4 = input.LA(1);

                         
                        int index31_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA31_8 = input.LA(1);

                         
                        int index31_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA31_5 = input.LA(1);

                         
                        int index31_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA31_7 = input.LA(1);

                         
                        int index31_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA31_9 = input.LA(1);

                         
                        int index31_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA31_3 = input.LA(1);

                         
                        int index31_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_3);
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
    static final String dfa_37s = "\32\uffff";
    static final String dfa_38s = "\1\1\31\uffff";
    static final String dfa_39s = "\1\4\2\uffff\1\0\26\uffff";
    static final String dfa_40s = "\1\44\2\uffff\1\0\26\uffff";
    static final String dfa_41s = "\1\uffff\1\2\27\uffff\1\1";
    static final String dfa_42s = "\3\uffff\1\0\26\uffff}>";
    static final String[] dfa_43s = {
            "\1\1\1\uffff\3\1\4\uffff\4\1\1\uffff\3\1\3\uffff\2\1\1\uffff\1\3\11\1",
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

    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[][] dfa_43 = unpackEncodedStringArray(dfa_43s);

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = dfa_37;
            this.eof = dfa_38;
            this.min = dfa_39;
            this.max = dfa_40;
            this.accept = dfa_41;
            this.special = dfa_42;
            this.transition = dfa_43;
        }
        public String getDescription() {
            return "()* loopback of 1608:3: ( ( '#' )=>otherlv_3= '#' )*";
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
                        if ( (synpred47_InternalMyDsl()) ) {s = 25;}

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
            this.eot = dfa_37;
            this.eof = dfa_38;
            this.min = dfa_39;
            this.max = dfa_40;
            this.accept = dfa_41;
            this.special = dfa_42;
            this.transition = dfa_43;
        }
        public String getDescription() {
            return "()* loopback of 1672:3: ( ( '#' )=>otherlv_3= '#' )*";
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
                        if ( (synpred49_InternalMyDsl()) ) {s = 25;}

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
            this.eot = dfa_37;
            this.eof = dfa_38;
            this.min = dfa_39;
            this.max = dfa_40;
            this.accept = dfa_41;
            this.special = dfa_42;
            this.transition = dfa_43;
        }
        public String getDescription() {
            return "()* loopback of 1736:3: ( ( '#' )=>otherlv_3= '#' )*";
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
                        if ( (synpred51_InternalMyDsl()) ) {s = 25;}

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
            this.eot = dfa_37;
            this.eof = dfa_38;
            this.min = dfa_39;
            this.max = dfa_40;
            this.accept = dfa_41;
            this.special = dfa_42;
            this.transition = dfa_43;
        }
        public String getDescription() {
            return "()* loopback of 1800:3: ( ( '#' )=>otherlv_3= '#' )*";
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
                        if ( (synpred53_InternalMyDsl()) ) {s = 25;}

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
            this.eot = dfa_37;
            this.eof = dfa_38;
            this.min = dfa_39;
            this.max = dfa_40;
            this.accept = dfa_41;
            this.special = dfa_42;
            this.transition = dfa_43;
        }
        public String getDescription() {
            return "()* loopback of 1864:3: ( ( '#' )=>otherlv_3= '#' )*";
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
                        if ( (synpred55_InternalMyDsl()) ) {s = 25;}

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
            this.eot = dfa_37;
            this.eof = dfa_38;
            this.min = dfa_39;
            this.max = dfa_40;
            this.accept = dfa_41;
            this.special = dfa_42;
            this.transition = dfa_43;
        }
        public String getDescription() {
            return "()* loopback of 1928:3: ( ( '#' )=>otherlv_3= '#' )*";
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
                        if ( (synpred57_InternalMyDsl()) ) {s = 25;}

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
    static final String dfa_44s = "\1\4\12\uffff\1\0\13\uffff\2\0\1\uffff";
    static final String dfa_45s = "\1\44\12\uffff\1\0\13\uffff\2\0\1\uffff";
    static final String dfa_46s = "\1\uffff\1\3\10\uffff\1\2\3\uffff\1\2\2\uffff\5\2\3\uffff\1\1";
    static final String dfa_47s = "\13\uffff\1\0\13\uffff\1\1\1\2\1\uffff}>";
    static final String[] dfa_48s = {
            "\1\1\1\uffff\1\16\1\22\1\23\4\uffff\1\12\1\13\2\1\1\uffff\1\1\1\21\1\1\3\uffff\2\1\1\uffff\6\1\1\27\1\30\1\24\1\25",
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
            "\1\uffff",
            "\1\uffff",
            ""
    };
    static final char[] dfa_44 = DFA.unpackEncodedStringToUnsignedChars(dfa_44s);
    static final char[] dfa_45 = DFA.unpackEncodedStringToUnsignedChars(dfa_45s);
    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final short[][] dfa_48 = unpackEncodedStringArray(dfa_48s);

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_37;
            this.eof = dfa_38;
            this.min = dfa_44;
            this.max = dfa_45;
            this.accept = dfa_46;
            this.special = dfa_47;
            this.transition = dfa_48;
        }
        public String getDescription() {
            return "()+ loopback of 1961:2: ( ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) ) | ( (lv_c_3_0= ruleNaturalExpression ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_11 = input.LA(1);

                         
                        int index56_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA56_23 = input.LA(1);

                         
                        int index56_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_23);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA56_24 = input.LA(1);

                         
                        int index56_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalMyDsl()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_24);
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

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "125:5: ( ( ( ruleHeaderExpression ) ) | ( ( ruleBreakLineExpression ) ) | ( ( ruleRefExpression ) ) | ( ( ( ( ruleHorizontalExpression ) )=> ( ruleHorizontalExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) | ( ( ( ruleListExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_4 = input.LA(1);

                         
                        int index61_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA61_4==13) && (synpred1_InternalMyDsl())) {s = 8;}

                        else if ( (LA61_4==14) && (synpred1_InternalMyDsl())) {s = 9;}

                        else if ( (LA61_4==15) && (synpred1_InternalMyDsl())) {s = 10;}

                        else if ( (LA61_4==RULE_WS) ) {s = 7;}

                         
                        input.seek(index61_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA61_5 = input.LA(1);

                         
                        int index61_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA61_5==RULE_WS) ) {s = 7;}

                        else if ( (LA61_5==13) && (synpred1_InternalMyDsl())) {s = 8;}

                        else if ( (LA61_5==14) && (synpred1_InternalMyDsl())) {s = 9;}

                        else if ( (LA61_5==15) && (synpred1_InternalMyDsl())) {s = 10;}

                         
                        input.seek(index61_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA61_0 = input.LA(1);

                         
                        int index61_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA61_0>=27 && LA61_0<=32)) ) {s = 1;}

                        else if ( (LA61_0==RULE_BL) ) {s = 2;}

                        else if ( (LA61_0==20) ) {s = 3;}

                        else if ( (LA61_0==13) ) {s = 4;}

                        else if ( (LA61_0==14) ) {s = 5;}

                        else if ( (LA61_0==15) && (synpred1_InternalMyDsl())) {s = 6;}

                        else if ( (LA61_0==RULE_INT||LA61_0==16) ) {s = 7;}

                         
                        input.seek(index61_0);
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001FFB1DE1D2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000E002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001FFB1DE1F0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000016012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000016002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001FFB1DE1D0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000018000821C0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000082002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000018000821D2L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000018008821C0L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000018040821C0L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000008000012L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001E000861C2L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});

}