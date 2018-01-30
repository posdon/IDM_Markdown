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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BL", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_DIGIT", "RULE_ANY_OTHER", "'>'", "'['", "']:'", "']('", "')'", "']['", "']'", "'!['", "'[!['", "')]('", "'#'", "'##'", "'###'", "'####'", "'#####'", "'######'", "'**'", "'*'", "'~~'", "'\\''", "'-'", "'|'", "'\"'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_DIGIT=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
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

                if ( ((LA1_0>=RULE_BL && LA1_0<=RULE_INT)||(LA1_0>=13 && LA1_0<=14)||(LA1_0>=20 && LA1_0<=21)||(LA1_0>=23 && LA1_0<=35)) ) {
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
    // InternalMyDsl.g:116:1: ruleExpression returns [EObject current=null] : ( ( ( ( ( ( ( ruleHeaderExpression ) )=> ( ruleHeaderExpression ) ) | ( ( ( ruleTextExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) ) )=> ( ( ( ( ruleHeaderExpression ) )=> (lv_c_0_0= ruleHeaderExpression ) ) | ( ( (lv_c_1_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_2= RULE_BL )? ) ) ) | ( (lv_c_3_0= ruleBreakLineExpression ) ) | ( (lv_c_4_0= ruleRefExpression ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token this_BL_2=null;
        EObject lv_c_0_0 = null;

        EObject lv_c_1_0 = null;

        EObject lv_c_3_0 = null;

        EObject lv_c_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:122:2: ( ( ( ( ( ( ( ( ruleHeaderExpression ) )=> ( ruleHeaderExpression ) ) | ( ( ( ruleTextExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) ) )=> ( ( ( ( ruleHeaderExpression ) )=> (lv_c_0_0= ruleHeaderExpression ) ) | ( ( (lv_c_1_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_2= RULE_BL )? ) ) ) | ( (lv_c_3_0= ruleBreakLineExpression ) ) | ( (lv_c_4_0= ruleRefExpression ) ) ) )
            // InternalMyDsl.g:123:2: ( ( ( ( ( ( ( ruleHeaderExpression ) )=> ( ruleHeaderExpression ) ) | ( ( ( ruleTextExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) ) )=> ( ( ( ( ruleHeaderExpression ) )=> (lv_c_0_0= ruleHeaderExpression ) ) | ( ( (lv_c_1_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_2= RULE_BL )? ) ) ) | ( (lv_c_3_0= ruleBreakLineExpression ) ) | ( (lv_c_4_0= ruleRefExpression ) ) )
            {
            // InternalMyDsl.g:123:2: ( ( ( ( ( ( ( ruleHeaderExpression ) )=> ( ruleHeaderExpression ) ) | ( ( ( ruleTextExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) ) )=> ( ( ( ( ruleHeaderExpression ) )=> (lv_c_0_0= ruleHeaderExpression ) ) | ( ( (lv_c_1_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_2= RULE_BL )? ) ) ) | ( (lv_c_3_0= ruleBreakLineExpression ) ) | ( (lv_c_4_0= ruleRefExpression ) ) )
            int alt4=3;
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

                    if ( (LA3_0==23) && (synpred4_InternalMyDsl())) {
                        alt3=1;
                    }
                    else if ( (LA3_0==24) && (synpred4_InternalMyDsl())) {
                        alt3=1;
                    }
                    else if ( (LA3_0==25) && (synpred4_InternalMyDsl())) {
                        alt3=1;
                    }
                    else if ( (LA3_0==26) && (synpred4_InternalMyDsl())) {
                        alt3=1;
                    }
                    else if ( (LA3_0==27) && (synpred4_InternalMyDsl())) {
                        alt3=1;
                    }
                    else if ( (LA3_0==28) && (synpred4_InternalMyDsl())) {
                        alt3=1;
                    }
                    else if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_INT)||(LA3_0>=13 && LA3_0<=14)||(LA3_0>=20 && LA3_0<=21)||(LA3_0>=29 && LA3_0<=35)) ) {
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
                case 3 :
                    // InternalMyDsl.g:225:3: ( (lv_c_4_0= ruleRefExpression ) )
                    {
                    // InternalMyDsl.g:225:3: ( (lv_c_4_0= ruleRefExpression ) )
                    // InternalMyDsl.g:226:4: (lv_c_4_0= ruleRefExpression )
                    {
                    // InternalMyDsl.g:226:4: (lv_c_4_0= ruleRefExpression )
                    // InternalMyDsl.g:227:5: lv_c_4_0= ruleRefExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExpressionAccess().getCRefExpressionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_c_4_0=ruleRefExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExpressionRule());
                      					}
                      					set(
                      						current,
                      						"c",
                      						lv_c_4_0,
                      						"markHammil.mm.MyDsl.RefExpression");
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
    // InternalMyDsl.g:248:1: entryRuleBreakLineExpression returns [EObject current=null] : iv_ruleBreakLineExpression= ruleBreakLineExpression EOF ;
    public final EObject entryRuleBreakLineExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreakLineExpression = null;


        try {
            // InternalMyDsl.g:248:60: (iv_ruleBreakLineExpression= ruleBreakLineExpression EOF )
            // InternalMyDsl.g:249:2: iv_ruleBreakLineExpression= ruleBreakLineExpression EOF
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
    // InternalMyDsl.g:255:1: ruleBreakLineExpression returns [EObject current=null] : ( () this_BL_1= RULE_BL ) ;
    public final EObject ruleBreakLineExpression() throws RecognitionException {
        EObject current = null;

        Token this_BL_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:261:2: ( ( () this_BL_1= RULE_BL ) )
            // InternalMyDsl.g:262:2: ( () this_BL_1= RULE_BL )
            {
            // InternalMyDsl.g:262:2: ( () this_BL_1= RULE_BL )
            // InternalMyDsl.g:263:3: () this_BL_1= RULE_BL
            {
            // InternalMyDsl.g:263:3: ()
            // InternalMyDsl.g:264:4: 
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
    // InternalMyDsl.g:278:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // InternalMyDsl.g:278:55: (iv_ruleTextExpression= ruleTextExpression EOF )
            // InternalMyDsl.g:279:2: iv_ruleTextExpression= ruleTextExpression EOF
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
    // InternalMyDsl.g:285:1: ruleTextExpression returns [EObject current=null] : ( ( (lv_c_0_0= ruleEmphasisExpression ) ) | ( ( ( ( ( ruleQuoteExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) ) )=> ( ( (lv_c_1_0= ruleQuoteExpression ) ) | ( ( (lv_c_2_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_3_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_4_0= ruleVideoExpression ) ) ) ) ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_c_0_0 = null;

        EObject lv_c_1_0 = null;

        EObject lv_c_2_0 = null;

        EObject lv_c_3_0 = null;

        EObject lv_c_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:291:2: ( ( ( (lv_c_0_0= ruleEmphasisExpression ) ) | ( ( ( ( ( ruleQuoteExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) ) )=> ( ( (lv_c_1_0= ruleQuoteExpression ) ) | ( ( (lv_c_2_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_3_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_4_0= ruleVideoExpression ) ) ) ) ) ) )
            // InternalMyDsl.g:292:2: ( ( (lv_c_0_0= ruleEmphasisExpression ) ) | ( ( ( ( ( ruleQuoteExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) ) )=> ( ( (lv_c_1_0= ruleQuoteExpression ) ) | ( ( (lv_c_2_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_3_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_4_0= ruleVideoExpression ) ) ) ) ) )
            {
            // InternalMyDsl.g:292:2: ( ( (lv_c_0_0= ruleEmphasisExpression ) ) | ( ( ( ( ( ruleQuoteExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) ) )=> ( ( (lv_c_1_0= ruleQuoteExpression ) ) | ( ( (lv_c_2_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_3_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_4_0= ruleVideoExpression ) ) ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_INT)||(LA7_0>=29 && LA7_0<=35)) ) {
                alt7=1;
            }
            else if ( (LA7_0==13) && (synpred8_InternalMyDsl())) {
                alt7=2;
            }
            else if ( (LA7_0==14) && (synpred8_InternalMyDsl())) {
                alt7=2;
            }
            else if ( (LA7_0==20) && (synpred8_InternalMyDsl())) {
                alt7=2;
            }
            else if ( (LA7_0==21) && (synpred8_InternalMyDsl())) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:293:3: ( (lv_c_0_0= ruleEmphasisExpression ) )
                    {
                    // InternalMyDsl.g:293:3: ( (lv_c_0_0= ruleEmphasisExpression ) )
                    // InternalMyDsl.g:294:4: (lv_c_0_0= ruleEmphasisExpression )
                    {
                    // InternalMyDsl.g:294:4: (lv_c_0_0= ruleEmphasisExpression )
                    // InternalMyDsl.g:295:5: lv_c_0_0= ruleEmphasisExpression
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
                    // InternalMyDsl.g:313:3: ( ( ( ( ( ruleQuoteExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) ) )=> ( ( (lv_c_1_0= ruleQuoteExpression ) ) | ( ( (lv_c_2_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_3_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_4_0= ruleVideoExpression ) ) ) ) )
                    {
                    // InternalMyDsl.g:313:3: ( ( ( ( ( ruleQuoteExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) ) )=> ( ( (lv_c_1_0= ruleQuoteExpression ) ) | ( ( (lv_c_2_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_3_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_4_0= ruleVideoExpression ) ) ) ) )
                    // InternalMyDsl.g:314:4: ( ( ( ( ruleQuoteExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) ) )=> ( ( (lv_c_1_0= ruleQuoteExpression ) ) | ( ( (lv_c_2_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_3_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_4_0= ruleVideoExpression ) ) ) )
                    {
                    // InternalMyDsl.g:350:4: ( ( (lv_c_1_0= ruleQuoteExpression ) ) | ( ( (lv_c_2_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_3_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_4_0= ruleVideoExpression ) ) ) )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==13) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==14||(LA6_0>=20 && LA6_0<=21)) ) {
                        alt6=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalMyDsl.g:351:5: ( (lv_c_1_0= ruleQuoteExpression ) )
                            {
                            // InternalMyDsl.g:351:5: ( (lv_c_1_0= ruleQuoteExpression ) )
                            // InternalMyDsl.g:352:6: (lv_c_1_0= ruleQuoteExpression )
                            {
                            // InternalMyDsl.g:352:6: (lv_c_1_0= ruleQuoteExpression )
                            // InternalMyDsl.g:353:7: lv_c_1_0= ruleQuoteExpression
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
                        case 2 :
                            // InternalMyDsl.g:371:5: ( ( (lv_c_2_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_3_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_4_0= ruleVideoExpression ) ) )
                            {
                            // InternalMyDsl.g:371:5: ( ( (lv_c_2_0= ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> (lv_c_3_0= ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> (lv_c_4_0= ruleVideoExpression ) ) )
                            int alt5=3;
                            int LA5_0 = input.LA(1);

                            if ( (LA5_0==14) ) {
                                alt5=1;
                            }
                            else if ( (LA5_0==20) && (synpred9_InternalMyDsl())) {
                                alt5=2;
                            }
                            else if ( (LA5_0==21) && (synpred10_InternalMyDsl())) {
                                alt5=3;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 0, input);

                                throw nvae;
                            }
                            switch (alt5) {
                                case 1 :
                                    // InternalMyDsl.g:372:6: ( (lv_c_2_0= ruleLinkExpression ) )
                                    {
                                    // InternalMyDsl.g:372:6: ( (lv_c_2_0= ruleLinkExpression ) )
                                    // InternalMyDsl.g:373:7: (lv_c_2_0= ruleLinkExpression )
                                    {
                                    // InternalMyDsl.g:373:7: (lv_c_2_0= ruleLinkExpression )
                                    // InternalMyDsl.g:374:8: lv_c_2_0= ruleLinkExpression
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getTextExpressionAccess().getCLinkExpressionParserRuleCall_1_0_1_0_0());
                                      							
                                    }
                                    pushFollow(FOLLOW_2);
                                    lv_c_2_0=ruleLinkExpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getTextExpressionRule());
                                      								}
                                      								add(
                                      									current,
                                      									"c",
                                      									lv_c_2_0,
                                      									"markHammil.mm.MyDsl.LinkExpression");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalMyDsl.g:392:6: ( ( ( ruleImageExpression ) )=> (lv_c_3_0= ruleImageExpression ) )
                                    {
                                    // InternalMyDsl.g:392:6: ( ( ( ruleImageExpression ) )=> (lv_c_3_0= ruleImageExpression ) )
                                    // InternalMyDsl.g:393:7: ( ( ruleImageExpression ) )=> (lv_c_3_0= ruleImageExpression )
                                    {
                                    // InternalMyDsl.g:397:7: (lv_c_3_0= ruleImageExpression )
                                    // InternalMyDsl.g:398:8: lv_c_3_0= ruleImageExpression
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getTextExpressionAccess().getCImageExpressionParserRuleCall_1_0_1_1_0());
                                      							
                                    }
                                    pushFollow(FOLLOW_2);
                                    lv_c_3_0=ruleImageExpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getTextExpressionRule());
                                      								}
                                      								add(
                                      									current,
                                      									"c",
                                      									lv_c_3_0,
                                      									"markHammil.mm.MyDsl.ImageExpression");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 3 :
                                    // InternalMyDsl.g:416:6: ( ( ( ruleVideoExpression ) )=> (lv_c_4_0= ruleVideoExpression ) )
                                    {
                                    // InternalMyDsl.g:416:6: ( ( ( ruleVideoExpression ) )=> (lv_c_4_0= ruleVideoExpression ) )
                                    // InternalMyDsl.g:417:7: ( ( ruleVideoExpression ) )=> (lv_c_4_0= ruleVideoExpression )
                                    {
                                    // InternalMyDsl.g:421:7: (lv_c_4_0= ruleVideoExpression )
                                    // InternalMyDsl.g:422:8: lv_c_4_0= ruleVideoExpression
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getTextExpressionAccess().getCVideoExpressionParserRuleCall_1_0_1_2_0());
                                      							
                                    }
                                    pushFollow(FOLLOW_2);
                                    lv_c_4_0=ruleVideoExpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getTextExpressionRule());
                                      								}
                                      								add(
                                      									current,
                                      									"c",
                                      									lv_c_4_0,
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
        }
        return current;
    }
    // $ANTLR end "ruleTextExpression"


    // $ANTLR start "entryRuleQuoteExpression"
    // InternalMyDsl.g:446:1: entryRuleQuoteExpression returns [EObject current=null] : iv_ruleQuoteExpression= ruleQuoteExpression EOF ;
    public final EObject entryRuleQuoteExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuoteExpression = null;


        try {
            // InternalMyDsl.g:446:56: (iv_ruleQuoteExpression= ruleQuoteExpression EOF )
            // InternalMyDsl.g:447:2: iv_ruleQuoteExpression= ruleQuoteExpression EOF
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
    // InternalMyDsl.g:453:1: ruleQuoteExpression returns [EObject current=null] : ( () ( ( '>' )=>otherlv_1= '>' ) ( (lv_content_2_0= ruleTextExpression ) )+ ( ( RULE_BL )=>this_BL_3= RULE_BL )? ) ;
    public final EObject ruleQuoteExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BL_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:459:2: ( ( () ( ( '>' )=>otherlv_1= '>' ) ( (lv_content_2_0= ruleTextExpression ) )+ ( ( RULE_BL )=>this_BL_3= RULE_BL )? ) )
            // InternalMyDsl.g:460:2: ( () ( ( '>' )=>otherlv_1= '>' ) ( (lv_content_2_0= ruleTextExpression ) )+ ( ( RULE_BL )=>this_BL_3= RULE_BL )? )
            {
            // InternalMyDsl.g:460:2: ( () ( ( '>' )=>otherlv_1= '>' ) ( (lv_content_2_0= ruleTextExpression ) )+ ( ( RULE_BL )=>this_BL_3= RULE_BL )? )
            // InternalMyDsl.g:461:3: () ( ( '>' )=>otherlv_1= '>' ) ( (lv_content_2_0= ruleTextExpression ) )+ ( ( RULE_BL )=>this_BL_3= RULE_BL )?
            {
            // InternalMyDsl.g:461:3: ()
            // InternalMyDsl.g:462:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getQuoteExpressionAccess().getTextExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:468:3: ( ( '>' )=>otherlv_1= '>' )
            // InternalMyDsl.g:469:4: ( '>' )=>otherlv_1= '>'
            {
            otherlv_1=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getQuoteExpressionAccess().getGreaterThanSignKeyword_1());
              			
            }

            }

            // InternalMyDsl.g:475:3: ( (lv_content_2_0= ruleTextExpression ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:476:4: (lv_content_2_0= ruleTextExpression )
            	    {
            	    // InternalMyDsl.g:476:4: (lv_content_2_0= ruleTextExpression )
            	    // InternalMyDsl.g:477:5: lv_content_2_0= ruleTextExpression
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
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // InternalMyDsl.g:494:3: ( ( RULE_BL )=>this_BL_3= RULE_BL )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_BL) ) {
                int LA9_1 = input.LA(2);

                if ( (synpred12_InternalMyDsl()) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:495:4: ( RULE_BL )=>this_BL_3= RULE_BL
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
    // InternalMyDsl.g:505:1: entryRuleRefExpression returns [EObject current=null] : iv_ruleRefExpression= ruleRefExpression EOF ;
    public final EObject entryRuleRefExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefExpression = null;


        try {
            // InternalMyDsl.g:505:54: (iv_ruleRefExpression= ruleRefExpression EOF )
            // InternalMyDsl.g:506:2: iv_ruleRefExpression= ruleRefExpression EOF
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
    // InternalMyDsl.g:512:1: ruleRefExpression returns [EObject current=null] : ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_refName_2_0= ruleNaturalExpression ) ) ( ( ']:' )=>otherlv_3= ']:' ) ( (lv_refContent_4_0= ruleNaturalExpression ) )? ( ( RULE_BL )=>this_BL_5= RULE_BL )? ) ;
    public final EObject ruleRefExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_5=null;
        EObject lv_refName_2_0 = null;

        EObject lv_refContent_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:518:2: ( ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_refName_2_0= ruleNaturalExpression ) ) ( ( ']:' )=>otherlv_3= ']:' ) ( (lv_refContent_4_0= ruleNaturalExpression ) )? ( ( RULE_BL )=>this_BL_5= RULE_BL )? ) )
            // InternalMyDsl.g:519:2: ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_refName_2_0= ruleNaturalExpression ) ) ( ( ']:' )=>otherlv_3= ']:' ) ( (lv_refContent_4_0= ruleNaturalExpression ) )? ( ( RULE_BL )=>this_BL_5= RULE_BL )? )
            {
            // InternalMyDsl.g:519:2: ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_refName_2_0= ruleNaturalExpression ) ) ( ( ']:' )=>otherlv_3= ']:' ) ( (lv_refContent_4_0= ruleNaturalExpression ) )? ( ( RULE_BL )=>this_BL_5= RULE_BL )? )
            // InternalMyDsl.g:520:3: () ( ( '[' )=>otherlv_1= '[' ) ( (lv_refName_2_0= ruleNaturalExpression ) ) ( ( ']:' )=>otherlv_3= ']:' ) ( (lv_refContent_4_0= ruleNaturalExpression ) )? ( ( RULE_BL )=>this_BL_5= RULE_BL )?
            {
            // InternalMyDsl.g:520:3: ()
            // InternalMyDsl.g:521:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRefExpressionAccess().getRefExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:527:3: ( ( '[' )=>otherlv_1= '[' )
            // InternalMyDsl.g:528:4: ( '[' )=>otherlv_1= '['
            {
            otherlv_1=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getRefExpressionAccess().getLeftSquareBracketKeyword_1());
              			
            }

            }

            // InternalMyDsl.g:534:3: ( (lv_refName_2_0= ruleNaturalExpression ) )
            // InternalMyDsl.g:535:4: (lv_refName_2_0= ruleNaturalExpression )
            {
            // InternalMyDsl.g:535:4: (lv_refName_2_0= ruleNaturalExpression )
            // InternalMyDsl.g:536:5: lv_refName_2_0= ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRefExpressionAccess().getRefNameNaturalExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_7);
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

            // InternalMyDsl.g:553:3: ( ( ']:' )=>otherlv_3= ']:' )
            // InternalMyDsl.g:554:4: ( ']:' )=>otherlv_3= ']:'
            {
            otherlv_3=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getRefExpressionAccess().getRightSquareBracketColonKeyword_3());
              			
            }

            }

            // InternalMyDsl.g:560:3: ( (lv_refContent_4_0= ruleNaturalExpression ) )?
            int alt10=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt10=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt10=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt10=1;
                    }
                    break;
                case 32:
                    {
                    alt10=1;
                    }
                    break;
                case 33:
                    {
                    alt10=1;
                    }
                    break;
                case 34:
                    {
                    alt10=1;
                    }
                    break;
                case 35:
                    {
                    alt10=1;
                    }
                    break;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:561:4: (lv_refContent_4_0= ruleNaturalExpression )
                    {
                    // InternalMyDsl.g:561:4: (lv_refContent_4_0= ruleNaturalExpression )
                    // InternalMyDsl.g:562:5: lv_refContent_4_0= ruleNaturalExpression
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

            // InternalMyDsl.g:579:3: ( ( RULE_BL )=>this_BL_5= RULE_BL )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_BL) ) {
                int LA11_1 = input.LA(2);

                if ( (synpred15_InternalMyDsl()) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:580:4: ( RULE_BL )=>this_BL_5= RULE_BL
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
    // InternalMyDsl.g:590:1: entryRuleLinkExpression returns [EObject current=null] : iv_ruleLinkExpression= ruleLinkExpression EOF ;
    public final EObject entryRuleLinkExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkExpression = null;


        try {
            // InternalMyDsl.g:590:55: (iv_ruleLinkExpression= ruleLinkExpression EOF )
            // InternalMyDsl.g:591:2: iv_ruleLinkExpression= ruleLinkExpression EOF
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
    // InternalMyDsl.g:597:1: ruleLinkExpression returns [EObject current=null] : ( ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) | ( ( ( '[' )=>otherlv_7= '[' ) ( (lv_altText_8_0= ruleNaturalExpression ) ) ( ( '][' )=>otherlv_9= '][' ) ( (lv_refName_10_0= ruleNaturalExpression ) )? ( ( ']' )=>otherlv_11= ']' ) ( ( RULE_BL )=>this_BL_12= RULE_BL )? ) ) ;
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
            // InternalMyDsl.g:603:2: ( ( ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) | ( ( ( '[' )=>otherlv_7= '[' ) ( (lv_altText_8_0= ruleNaturalExpression ) ) ( ( '][' )=>otherlv_9= '][' ) ( (lv_refName_10_0= ruleNaturalExpression ) )? ( ( ']' )=>otherlv_11= ']' ) ( ( RULE_BL )=>this_BL_12= RULE_BL )? ) ) )
            // InternalMyDsl.g:604:2: ( ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) | ( ( ( '[' )=>otherlv_7= '[' ) ( (lv_altText_8_0= ruleNaturalExpression ) ) ( ( '][' )=>otherlv_9= '][' ) ( (lv_refName_10_0= ruleNaturalExpression ) )? ( ( ']' )=>otherlv_11= ']' ) ( ( RULE_BL )=>this_BL_12= RULE_BL )? ) )
            {
            // InternalMyDsl.g:604:2: ( ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) | ( ( ( '[' )=>otherlv_7= '[' ) ( (lv_altText_8_0= ruleNaturalExpression ) ) ( ( '][' )=>otherlv_9= '][' ) ( (lv_refName_10_0= ruleNaturalExpression ) )? ( ( ']' )=>otherlv_11= ']' ) ( ( RULE_BL )=>this_BL_12= RULE_BL )? ) )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:605:3: ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )
                    {
                    // InternalMyDsl.g:605:3: ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )
                    // InternalMyDsl.g:606:4: () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )?
                    {
                    // InternalMyDsl.g:606:4: ()
                    // InternalMyDsl.g:607:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getLinkExpressionAccess().getLinkExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMyDsl.g:613:4: ( ( '[' )=>otherlv_1= '[' )
                    // InternalMyDsl.g:614:5: ( '[' )=>otherlv_1= '['
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getLinkExpressionAccess().getLeftSquareBracketKeyword_0_1());
                      				
                    }

                    }

                    // InternalMyDsl.g:620:4: ( (lv_altText_2_0= ruleNaturalExpression ) )
                    // InternalMyDsl.g:621:5: (lv_altText_2_0= ruleNaturalExpression )
                    {
                    // InternalMyDsl.g:621:5: (lv_altText_2_0= ruleNaturalExpression )
                    // InternalMyDsl.g:622:6: lv_altText_2_0= ruleNaturalExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLinkExpressionAccess().getAltTextNaturalExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
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

                    // InternalMyDsl.g:639:4: ( ( '](' )=>otherlv_3= '](' )
                    // InternalMyDsl.g:640:5: ( '](' )=>otherlv_3= ']('
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getLinkExpressionAccess().getRightSquareBracketLeftParenthesisKeyword_0_3());
                      				
                    }

                    }

                    // InternalMyDsl.g:646:4: ( (lv_linkContent_4_0= ruleNaturalExpression ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_INT)||(LA12_0>=32 && LA12_0<=35)) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalMyDsl.g:647:5: (lv_linkContent_4_0= ruleNaturalExpression )
                            {
                            // InternalMyDsl.g:647:5: (lv_linkContent_4_0= ruleNaturalExpression )
                            // InternalMyDsl.g:648:6: lv_linkContent_4_0= ruleNaturalExpression
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getLinkExpressionAccess().getLinkContentNaturalExpressionParserRuleCall_0_4_0());
                              					
                            }
                            pushFollow(FOLLOW_11);
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

                    // InternalMyDsl.g:665:4: ( ( ')' )=>otherlv_5= ')' )
                    // InternalMyDsl.g:666:5: ( ')' )=>otherlv_5= ')'
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getLinkExpressionAccess().getRightParenthesisKeyword_0_5());
                      				
                    }

                    }

                    // InternalMyDsl.g:672:4: ( ( RULE_BL )=>this_BL_6= RULE_BL )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_BL) ) {
                        int LA13_1 = input.LA(2);

                        if ( (synpred19_InternalMyDsl()) ) {
                            alt13=1;
                        }
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalMyDsl.g:673:5: ( RULE_BL )=>this_BL_6= RULE_BL
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
                    // InternalMyDsl.g:681:3: ( ( ( '[' )=>otherlv_7= '[' ) ( (lv_altText_8_0= ruleNaturalExpression ) ) ( ( '][' )=>otherlv_9= '][' ) ( (lv_refName_10_0= ruleNaturalExpression ) )? ( ( ']' )=>otherlv_11= ']' ) ( ( RULE_BL )=>this_BL_12= RULE_BL )? )
                    {
                    // InternalMyDsl.g:681:3: ( ( ( '[' )=>otherlv_7= '[' ) ( (lv_altText_8_0= ruleNaturalExpression ) ) ( ( '][' )=>otherlv_9= '][' ) ( (lv_refName_10_0= ruleNaturalExpression ) )? ( ( ']' )=>otherlv_11= ']' ) ( ( RULE_BL )=>this_BL_12= RULE_BL )? )
                    // InternalMyDsl.g:682:4: ( ( '[' )=>otherlv_7= '[' ) ( (lv_altText_8_0= ruleNaturalExpression ) ) ( ( '][' )=>otherlv_9= '][' ) ( (lv_refName_10_0= ruleNaturalExpression ) )? ( ( ']' )=>otherlv_11= ']' ) ( ( RULE_BL )=>this_BL_12= RULE_BL )?
                    {
                    // InternalMyDsl.g:682:4: ( ( '[' )=>otherlv_7= '[' )
                    // InternalMyDsl.g:683:5: ( '[' )=>otherlv_7= '['
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getLinkExpressionAccess().getLeftSquareBracketKeyword_1_0());
                      				
                    }

                    }

                    // InternalMyDsl.g:689:4: ( (lv_altText_8_0= ruleNaturalExpression ) )
                    // InternalMyDsl.g:690:5: (lv_altText_8_0= ruleNaturalExpression )
                    {
                    // InternalMyDsl.g:690:5: (lv_altText_8_0= ruleNaturalExpression )
                    // InternalMyDsl.g:691:6: lv_altText_8_0= ruleNaturalExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLinkExpressionAccess().getAltTextNaturalExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
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

                    // InternalMyDsl.g:708:4: ( ( '][' )=>otherlv_9= '][' )
                    // InternalMyDsl.g:709:5: ( '][' )=>otherlv_9= ']['
                    {
                    otherlv_9=(Token)match(input,18,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getLinkExpressionAccess().getRightSquareBracketLeftSquareBracketKeyword_1_2());
                      				
                    }

                    }

                    // InternalMyDsl.g:715:4: ( (lv_refName_10_0= ruleNaturalExpression ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_INT)||(LA14_0>=32 && LA14_0<=35)) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalMyDsl.g:716:5: (lv_refName_10_0= ruleNaturalExpression )
                            {
                            // InternalMyDsl.g:716:5: (lv_refName_10_0= ruleNaturalExpression )
                            // InternalMyDsl.g:717:6: lv_refName_10_0= ruleNaturalExpression
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getLinkExpressionAccess().getRefNameNaturalExpressionParserRuleCall_1_3_0());
                              					
                            }
                            pushFollow(FOLLOW_14);
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

                    // InternalMyDsl.g:734:4: ( ( ']' )=>otherlv_11= ']' )
                    // InternalMyDsl.g:735:5: ( ']' )=>otherlv_11= ']'
                    {
                    otherlv_11=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getLinkExpressionAccess().getRightSquareBracketKeyword_1_4());
                      				
                    }

                    }

                    // InternalMyDsl.g:741:4: ( ( RULE_BL )=>this_BL_12= RULE_BL )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_BL) ) {
                        int LA15_1 = input.LA(2);

                        if ( (synpred23_InternalMyDsl()) ) {
                            alt15=1;
                        }
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalMyDsl.g:742:5: ( RULE_BL )=>this_BL_12= RULE_BL
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
    // InternalMyDsl.g:753:1: entryRuleImageExpression returns [EObject current=null] : iv_ruleImageExpression= ruleImageExpression EOF ;
    public final EObject entryRuleImageExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageExpression = null;


        try {
            // InternalMyDsl.g:753:56: (iv_ruleImageExpression= ruleImageExpression EOF )
            // InternalMyDsl.g:754:2: iv_ruleImageExpression= ruleImageExpression EOF
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
    // InternalMyDsl.g:760:1: ruleImageExpression returns [EObject current=null] : ( () ( ( '![' )=>otherlv_1= '![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) ;
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
            // InternalMyDsl.g:766:2: ( ( () ( ( '![' )=>otherlv_1= '![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) )
            // InternalMyDsl.g:767:2: ( () ( ( '![' )=>otherlv_1= '![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )
            {
            // InternalMyDsl.g:767:2: ( () ( ( '![' )=>otherlv_1= '![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? )
            // InternalMyDsl.g:768:3: () ( ( '![' )=>otherlv_1= '![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )?
            {
            // InternalMyDsl.g:768:3: ()
            // InternalMyDsl.g:769:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getImageExpressionAccess().getImageExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:775:3: ( ( '![' )=>otherlv_1= '![' )
            // InternalMyDsl.g:776:4: ( '![' )=>otherlv_1= '!['
            {
            otherlv_1=(Token)match(input,20,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getImageExpressionAccess().getExclamationMarkLeftSquareBracketKeyword_1());
              			
            }

            }

            // InternalMyDsl.g:782:3: ( (lv_altText_2_0= ruleNaturalExpression ) )
            // InternalMyDsl.g:783:4: (lv_altText_2_0= ruleNaturalExpression )
            {
            // InternalMyDsl.g:783:4: (lv_altText_2_0= ruleNaturalExpression )
            // InternalMyDsl.g:784:5: lv_altText_2_0= ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImageExpressionAccess().getAltTextNaturalExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_9);
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

            // InternalMyDsl.g:801:3: ( ( '](' )=>otherlv_3= '](' )
            // InternalMyDsl.g:802:4: ( '](' )=>otherlv_3= ']('
            {
            otherlv_3=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getImageExpressionAccess().getRightSquareBracketLeftParenthesisKeyword_3());
              			
            }

            }

            // InternalMyDsl.g:808:3: ( (lv_linkContent_4_0= ruleNaturalExpression ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_INT)||(LA17_0>=32 && LA17_0<=35)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:809:4: (lv_linkContent_4_0= ruleNaturalExpression )
                    {
                    // InternalMyDsl.g:809:4: (lv_linkContent_4_0= ruleNaturalExpression )
                    // InternalMyDsl.g:810:5: lv_linkContent_4_0= ruleNaturalExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getImageExpressionAccess().getLinkContentNaturalExpressionParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_11);
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

            // InternalMyDsl.g:827:3: ( ( ')' )=>otherlv_5= ')' )
            // InternalMyDsl.g:828:4: ( ')' )=>otherlv_5= ')'
            {
            otherlv_5=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getImageExpressionAccess().getRightParenthesisKeyword_5());
              			
            }

            }

            // InternalMyDsl.g:834:3: ( ( RULE_BL )=>this_BL_6= RULE_BL )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_BL) ) {
                int LA18_1 = input.LA(2);

                if ( (synpred27_InternalMyDsl()) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:835:4: ( RULE_BL )=>this_BL_6= RULE_BL
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
    // InternalMyDsl.g:845:1: entryRuleVideoExpression returns [EObject current=null] : iv_ruleVideoExpression= ruleVideoExpression EOF ;
    public final EObject entryRuleVideoExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoExpression = null;


        try {
            // InternalMyDsl.g:845:56: (iv_ruleVideoExpression= ruleVideoExpression EOF )
            // InternalMyDsl.g:846:2: iv_ruleVideoExpression= ruleVideoExpression EOF
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
    // InternalMyDsl.g:852:1: ruleVideoExpression returns [EObject current=null] : ( () ( ( '[![' )=>otherlv_1= '[![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkImage_4_0= ruleNaturalExpression ) )? ( ( ')](' )=>otherlv_5= ')](' ) ( (lv_linkVideo_6_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_7= ')' ) ( ( RULE_BL )=>this_BL_8= RULE_BL )? ) ;
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
            // InternalMyDsl.g:858:2: ( ( () ( ( '[![' )=>otherlv_1= '[![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkImage_4_0= ruleNaturalExpression ) )? ( ( ')](' )=>otherlv_5= ')](' ) ( (lv_linkVideo_6_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_7= ')' ) ( ( RULE_BL )=>this_BL_8= RULE_BL )? ) )
            // InternalMyDsl.g:859:2: ( () ( ( '[![' )=>otherlv_1= '[![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkImage_4_0= ruleNaturalExpression ) )? ( ( ')](' )=>otherlv_5= ')](' ) ( (lv_linkVideo_6_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_7= ')' ) ( ( RULE_BL )=>this_BL_8= RULE_BL )? )
            {
            // InternalMyDsl.g:859:2: ( () ( ( '[![' )=>otherlv_1= '[![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkImage_4_0= ruleNaturalExpression ) )? ( ( ')](' )=>otherlv_5= ')](' ) ( (lv_linkVideo_6_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_7= ')' ) ( ( RULE_BL )=>this_BL_8= RULE_BL )? )
            // InternalMyDsl.g:860:3: () ( ( '[![' )=>otherlv_1= '[![' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkImage_4_0= ruleNaturalExpression ) )? ( ( ')](' )=>otherlv_5= ')](' ) ( (lv_linkVideo_6_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_7= ')' ) ( ( RULE_BL )=>this_BL_8= RULE_BL )?
            {
            // InternalMyDsl.g:860:3: ()
            // InternalMyDsl.g:861:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVideoExpressionAccess().getVideoExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:867:3: ( ( '[![' )=>otherlv_1= '[![' )
            // InternalMyDsl.g:868:4: ( '[![' )=>otherlv_1= '[!['
            {
            otherlv_1=(Token)match(input,21,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getVideoExpressionAccess().getLeftSquareBracketExclamationMarkLeftSquareBracketKeyword_1());
              			
            }

            }

            // InternalMyDsl.g:874:3: ( (lv_altText_2_0= ruleNaturalExpression ) )
            // InternalMyDsl.g:875:4: (lv_altText_2_0= ruleNaturalExpression )
            {
            // InternalMyDsl.g:875:4: (lv_altText_2_0= ruleNaturalExpression )
            // InternalMyDsl.g:876:5: lv_altText_2_0= ruleNaturalExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVideoExpressionAccess().getAltTextNaturalExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_9);
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

            // InternalMyDsl.g:893:3: ( ( '](' )=>otherlv_3= '](' )
            // InternalMyDsl.g:894:4: ( '](' )=>otherlv_3= ']('
            {
            otherlv_3=(Token)match(input,16,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getVideoExpressionAccess().getRightSquareBracketLeftParenthesisKeyword_3());
              			
            }

            }

            // InternalMyDsl.g:900:3: ( (lv_linkImage_4_0= ruleNaturalExpression ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_INT)||(LA19_0>=32 && LA19_0<=35)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:901:4: (lv_linkImage_4_0= ruleNaturalExpression )
                    {
                    // InternalMyDsl.g:901:4: (lv_linkImage_4_0= ruleNaturalExpression )
                    // InternalMyDsl.g:902:5: lv_linkImage_4_0= ruleNaturalExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVideoExpressionAccess().getLinkImageNaturalExpressionParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_16);
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

            // InternalMyDsl.g:919:3: ( ( ')](' )=>otherlv_5= ')](' )
            // InternalMyDsl.g:920:4: ( ')](' )=>otherlv_5= ')]('
            {
            otherlv_5=(Token)match(input,22,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getVideoExpressionAccess().getRightParenthesisRightSquareBracketLeftParenthesisKeyword_5());
              			
            }

            }

            // InternalMyDsl.g:926:3: ( (lv_linkVideo_6_0= ruleNaturalExpression ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_INT)||(LA20_0>=32 && LA20_0<=35)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:927:4: (lv_linkVideo_6_0= ruleNaturalExpression )
                    {
                    // InternalMyDsl.g:927:4: (lv_linkVideo_6_0= ruleNaturalExpression )
                    // InternalMyDsl.g:928:5: lv_linkVideo_6_0= ruleNaturalExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVideoExpressionAccess().getLinkVideoNaturalExpressionParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_11);
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

            // InternalMyDsl.g:945:3: ( ( ')' )=>otherlv_7= ')' )
            // InternalMyDsl.g:946:4: ( ')' )=>otherlv_7= ')'
            {
            otherlv_7=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_7, grammarAccess.getVideoExpressionAccess().getRightParenthesisKeyword_7());
              			
            }

            }

            // InternalMyDsl.g:952:3: ( ( RULE_BL )=>this_BL_8= RULE_BL )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_BL) ) {
                int LA21_1 = input.LA(2);

                if ( (synpred32_InternalMyDsl()) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:953:4: ( RULE_BL )=>this_BL_8= RULE_BL
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
    // InternalMyDsl.g:963:1: entryRuleHeaderExpression returns [EObject current=null] : iv_ruleHeaderExpression= ruleHeaderExpression EOF ;
    public final EObject entryRuleHeaderExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderExpression = null;


        try {
            // InternalMyDsl.g:963:57: (iv_ruleHeaderExpression= ruleHeaderExpression EOF )
            // InternalMyDsl.g:964:2: iv_ruleHeaderExpression= ruleHeaderExpression EOF
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
    // InternalMyDsl.g:970:1: ruleHeaderExpression returns [EObject current=null] : (this_Header1Expression_0= ruleHeader1Expression | this_Header2Expression_1= ruleHeader2Expression | this_Header3Expression_2= ruleHeader3Expression | this_Header4Expression_3= ruleHeader4Expression | this_Header5Expression_4= ruleHeader5Expression | this_Header6Expression_5= ruleHeader6Expression ) ;
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
            // InternalMyDsl.g:976:2: ( (this_Header1Expression_0= ruleHeader1Expression | this_Header2Expression_1= ruleHeader2Expression | this_Header3Expression_2= ruleHeader3Expression | this_Header4Expression_3= ruleHeader4Expression | this_Header5Expression_4= ruleHeader5Expression | this_Header6Expression_5= ruleHeader6Expression ) )
            // InternalMyDsl.g:977:2: (this_Header1Expression_0= ruleHeader1Expression | this_Header2Expression_1= ruleHeader2Expression | this_Header3Expression_2= ruleHeader3Expression | this_Header4Expression_3= ruleHeader4Expression | this_Header5Expression_4= ruleHeader5Expression | this_Header6Expression_5= ruleHeader6Expression )
            {
            // InternalMyDsl.g:977:2: (this_Header1Expression_0= ruleHeader1Expression | this_Header2Expression_1= ruleHeader2Expression | this_Header3Expression_2= ruleHeader3Expression | this_Header4Expression_3= ruleHeader4Expression | this_Header5Expression_4= ruleHeader5Expression | this_Header6Expression_5= ruleHeader6Expression )
            int alt22=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt22=1;
                }
                break;
            case 24:
                {
                alt22=2;
                }
                break;
            case 25:
                {
                alt22=3;
                }
                break;
            case 26:
                {
                alt22=4;
                }
                break;
            case 27:
                {
                alt22=5;
                }
                break;
            case 28:
                {
                alt22=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:978:3: this_Header1Expression_0= ruleHeader1Expression
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
                    // InternalMyDsl.g:987:3: this_Header2Expression_1= ruleHeader2Expression
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
                    // InternalMyDsl.g:996:3: this_Header3Expression_2= ruleHeader3Expression
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
                    // InternalMyDsl.g:1005:3: this_Header4Expression_3= ruleHeader4Expression
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
                    // InternalMyDsl.g:1014:3: this_Header5Expression_4= ruleHeader5Expression
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
                    // InternalMyDsl.g:1023:3: this_Header6Expression_5= ruleHeader6Expression
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
    // InternalMyDsl.g:1035:1: entryRuleHeader1Expression returns [EObject current=null] : iv_ruleHeader1Expression= ruleHeader1Expression EOF ;
    public final EObject entryRuleHeader1Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader1Expression = null;


        try {
            // InternalMyDsl.g:1035:58: (iv_ruleHeader1Expression= ruleHeader1Expression EOF )
            // InternalMyDsl.g:1036:2: iv_ruleHeader1Expression= ruleHeader1Expression EOF
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
    // InternalMyDsl.g:1042:1: ruleHeader1Expression returns [EObject current=null] : ( () ( ( '#' )=>otherlv_1= '#' ) ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader1Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1048:2: ( ( () ( ( '#' )=>otherlv_1= '#' ) ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:1049:2: ( () ( ( '#' )=>otherlv_1= '#' ) ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:1049:2: ( () ( ( '#' )=>otherlv_1= '#' ) ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:1050:3: () ( ( '#' )=>otherlv_1= '#' ) ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:1050:3: ()
            // InternalMyDsl.g:1051:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader1ExpressionAccess().getHeader1ExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:1057:3: ( ( '#' )=>otherlv_1= '#' )
            // InternalMyDsl.g:1058:4: ( '#' )=>otherlv_1= '#'
            {
            otherlv_1=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getHeader1ExpressionAccess().getNumberSignKeyword_1());
              			
            }

            }

            // InternalMyDsl.g:1064:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1065:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1065:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1066:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            // InternalMyDsl.g:1083:3: ( ( '#' )=>otherlv_3= '#' )*
            loop23:
            do {
                int alt23=2;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:1084:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader1ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // InternalMyDsl.g:1091:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_BL) ) {
                int LA24_1 = input.LA(2);

                if ( (synpred35_InternalMyDsl()) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1092:4: ( RULE_BL )=>this_BL_4= RULE_BL
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
    // InternalMyDsl.g:1102:1: entryRuleHeader2Expression returns [EObject current=null] : iv_ruleHeader2Expression= ruleHeader2Expression EOF ;
    public final EObject entryRuleHeader2Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader2Expression = null;


        try {
            // InternalMyDsl.g:1102:58: (iv_ruleHeader2Expression= ruleHeader2Expression EOF )
            // InternalMyDsl.g:1103:2: iv_ruleHeader2Expression= ruleHeader2Expression EOF
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
    // InternalMyDsl.g:1109:1: ruleHeader2Expression returns [EObject current=null] : ( () ( ( '##' )=>otherlv_1= '##' ) ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader2Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1115:2: ( ( () ( ( '##' )=>otherlv_1= '##' ) ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:1116:2: ( () ( ( '##' )=>otherlv_1= '##' ) ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:1116:2: ( () ( ( '##' )=>otherlv_1= '##' ) ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:1117:3: () ( ( '##' )=>otherlv_1= '##' ) ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:1117:3: ()
            // InternalMyDsl.g:1118:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader2ExpressionAccess().getHeader2ExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:1124:3: ( ( '##' )=>otherlv_1= '##' )
            // InternalMyDsl.g:1125:4: ( '##' )=>otherlv_1= '##'
            {
            otherlv_1=(Token)match(input,24,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getHeader2ExpressionAccess().getNumberSignNumberSignKeyword_1());
              			
            }

            }

            // InternalMyDsl.g:1131:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1132:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1132:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1133:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader2ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            // InternalMyDsl.g:1150:3: ( ( '#' )=>otherlv_3= '#' )*
            loop25:
            do {
                int alt25=2;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:1151:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader2ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // InternalMyDsl.g:1158:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_BL) ) {
                int LA26_1 = input.LA(2);

                if ( (synpred38_InternalMyDsl()) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1159:4: ( RULE_BL )=>this_BL_4= RULE_BL
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
    // InternalMyDsl.g:1169:1: entryRuleHeader3Expression returns [EObject current=null] : iv_ruleHeader3Expression= ruleHeader3Expression EOF ;
    public final EObject entryRuleHeader3Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader3Expression = null;


        try {
            // InternalMyDsl.g:1169:58: (iv_ruleHeader3Expression= ruleHeader3Expression EOF )
            // InternalMyDsl.g:1170:2: iv_ruleHeader3Expression= ruleHeader3Expression EOF
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
    // InternalMyDsl.g:1176:1: ruleHeader3Expression returns [EObject current=null] : ( () ( ( '###' )=>otherlv_1= '###' ) ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader3Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1182:2: ( ( () ( ( '###' )=>otherlv_1= '###' ) ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:1183:2: ( () ( ( '###' )=>otherlv_1= '###' ) ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:1183:2: ( () ( ( '###' )=>otherlv_1= '###' ) ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:1184:3: () ( ( '###' )=>otherlv_1= '###' ) ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:1184:3: ()
            // InternalMyDsl.g:1185:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader3ExpressionAccess().getHeader3ExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:1191:3: ( ( '###' )=>otherlv_1= '###' )
            // InternalMyDsl.g:1192:4: ( '###' )=>otherlv_1= '###'
            {
            otherlv_1=(Token)match(input,25,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getHeader3ExpressionAccess().getNumberSignNumberSignNumberSignKeyword_1());
              			
            }

            }

            // InternalMyDsl.g:1198:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1199:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1199:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1200:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader3ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            // InternalMyDsl.g:1217:3: ( ( '#' )=>otherlv_3= '#' )*
            loop27:
            do {
                int alt27=2;
                alt27 = dfa27.predict(input);
                switch (alt27) {
            	case 1 :
            	    // InternalMyDsl.g:1218:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader3ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // InternalMyDsl.g:1225:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
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
                    // InternalMyDsl.g:1226:4: ( RULE_BL )=>this_BL_4= RULE_BL
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
    // InternalMyDsl.g:1236:1: entryRuleHeader4Expression returns [EObject current=null] : iv_ruleHeader4Expression= ruleHeader4Expression EOF ;
    public final EObject entryRuleHeader4Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader4Expression = null;


        try {
            // InternalMyDsl.g:1236:58: (iv_ruleHeader4Expression= ruleHeader4Expression EOF )
            // InternalMyDsl.g:1237:2: iv_ruleHeader4Expression= ruleHeader4Expression EOF
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
    // InternalMyDsl.g:1243:1: ruleHeader4Expression returns [EObject current=null] : ( () ( ( '####' )=>otherlv_1= '####' ) ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader4Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1249:2: ( ( () ( ( '####' )=>otherlv_1= '####' ) ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:1250:2: ( () ( ( '####' )=>otherlv_1= '####' ) ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:1250:2: ( () ( ( '####' )=>otherlv_1= '####' ) ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:1251:3: () ( ( '####' )=>otherlv_1= '####' ) ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:1251:3: ()
            // InternalMyDsl.g:1252:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader4ExpressionAccess().getHeader4ExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:1258:3: ( ( '####' )=>otherlv_1= '####' )
            // InternalMyDsl.g:1259:4: ( '####' )=>otherlv_1= '####'
            {
            otherlv_1=(Token)match(input,26,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getHeader4ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignKeyword_1());
              			
            }

            }

            // InternalMyDsl.g:1265:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1266:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1266:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1267:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader4ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            // InternalMyDsl.g:1284:3: ( ( '#' )=>otherlv_3= '#' )*
            loop29:
            do {
                int alt29=2;
                alt29 = dfa29.predict(input);
                switch (alt29) {
            	case 1 :
            	    // InternalMyDsl.g:1285:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader4ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // InternalMyDsl.g:1292:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_BL) ) {
                int LA30_1 = input.LA(2);

                if ( (synpred44_InternalMyDsl()) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:1293:4: ( RULE_BL )=>this_BL_4= RULE_BL
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
    // InternalMyDsl.g:1303:1: entryRuleHeader5Expression returns [EObject current=null] : iv_ruleHeader5Expression= ruleHeader5Expression EOF ;
    public final EObject entryRuleHeader5Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader5Expression = null;


        try {
            // InternalMyDsl.g:1303:58: (iv_ruleHeader5Expression= ruleHeader5Expression EOF )
            // InternalMyDsl.g:1304:2: iv_ruleHeader5Expression= ruleHeader5Expression EOF
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
    // InternalMyDsl.g:1310:1: ruleHeader5Expression returns [EObject current=null] : ( () ( ( '#####' )=>otherlv_1= '#####' ) ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader5Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1316:2: ( ( () ( ( '#####' )=>otherlv_1= '#####' ) ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:1317:2: ( () ( ( '#####' )=>otherlv_1= '#####' ) ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:1317:2: ( () ( ( '#####' )=>otherlv_1= '#####' ) ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:1318:3: () ( ( '#####' )=>otherlv_1= '#####' ) ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:1318:3: ()
            // InternalMyDsl.g:1319:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader5ExpressionAccess().getHeader5ExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:1325:3: ( ( '#####' )=>otherlv_1= '#####' )
            // InternalMyDsl.g:1326:4: ( '#####' )=>otherlv_1= '#####'
            {
            otherlv_1=(Token)match(input,27,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getHeader5ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_1());
              			
            }

            }

            // InternalMyDsl.g:1332:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1333:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1333:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1334:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader5ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            // InternalMyDsl.g:1351:3: ( ( '#' )=>otherlv_3= '#' )*
            loop31:
            do {
                int alt31=2;
                alt31 = dfa31.predict(input);
                switch (alt31) {
            	case 1 :
            	    // InternalMyDsl.g:1352:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader5ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // InternalMyDsl.g:1359:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_BL) ) {
                int LA32_1 = input.LA(2);

                if ( (synpred47_InternalMyDsl()) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:1360:4: ( RULE_BL )=>this_BL_4= RULE_BL
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
    // InternalMyDsl.g:1370:1: entryRuleHeader6Expression returns [EObject current=null] : iv_ruleHeader6Expression= ruleHeader6Expression EOF ;
    public final EObject entryRuleHeader6Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader6Expression = null;


        try {
            // InternalMyDsl.g:1370:58: (iv_ruleHeader6Expression= ruleHeader6Expression EOF )
            // InternalMyDsl.g:1371:2: iv_ruleHeader6Expression= ruleHeader6Expression EOF
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
    // InternalMyDsl.g:1377:1: ruleHeader6Expression returns [EObject current=null] : ( () ( ( '######' )=>otherlv_1= '######' ) ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) ;
    public final EObject ruleHeader6Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        EObject lv_title_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1383:2: ( ( () ( ( '######' )=>otherlv_1= '######' ) ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? ) )
            // InternalMyDsl.g:1384:2: ( () ( ( '######' )=>otherlv_1= '######' ) ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            {
            // InternalMyDsl.g:1384:2: ( () ( ( '######' )=>otherlv_1= '######' ) ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )? )
            // InternalMyDsl.g:1385:3: () ( ( '######' )=>otherlv_1= '######' ) ( (lv_title_2_0= ruleEmphasisExpression ) ) ( ( '#' )=>otherlv_3= '#' )* ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            {
            // InternalMyDsl.g:1385:3: ()
            // InternalMyDsl.g:1386:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeader6ExpressionAccess().getHeader6ExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:1392:3: ( ( '######' )=>otherlv_1= '######' )
            // InternalMyDsl.g:1393:4: ( '######' )=>otherlv_1= '######'
            {
            otherlv_1=(Token)match(input,28,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getHeader6ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_1());
              			
            }

            }

            // InternalMyDsl.g:1399:3: ( (lv_title_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1400:4: (lv_title_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1400:4: (lv_title_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1401:5: lv_title_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeader6ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            // InternalMyDsl.g:1418:3: ( ( '#' )=>otherlv_3= '#' )*
            loop33:
            do {
                int alt33=2;
                alt33 = dfa33.predict(input);
                switch (alt33) {
            	case 1 :
            	    // InternalMyDsl.g:1419:4: ( '#' )=>otherlv_3= '#'
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getHeader6ExpressionAccess().getNumberSignKeyword_3_0());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // InternalMyDsl.g:1426:3: ( ( RULE_BL )=>this_BL_4= RULE_BL )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_BL) ) {
                int LA34_1 = input.LA(2);

                if ( (synpred50_InternalMyDsl()) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:1427:4: ( RULE_BL )=>this_BL_4= RULE_BL
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
    // InternalMyDsl.g:1437:1: entryRuleEmphasisExpression returns [EObject current=null] : iv_ruleEmphasisExpression= ruleEmphasisExpression EOF ;
    public final EObject entryRuleEmphasisExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmphasisExpression = null;


        try {
            // InternalMyDsl.g:1437:59: (iv_ruleEmphasisExpression= ruleEmphasisExpression EOF )
            // InternalMyDsl.g:1438:2: iv_ruleEmphasisExpression= ruleEmphasisExpression EOF
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
    // InternalMyDsl.g:1444:1: ruleEmphasisExpression returns [EObject current=null] : ( ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) ) | ( (lv_c_3_0= ruleNaturalExpression ) ) )+ ;
    public final EObject ruleEmphasisExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_c_0_0 = null;

        EObject lv_c_1_0 = null;

        EObject lv_c_2_0 = null;

        EObject lv_c_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1450:2: ( ( ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) ) | ( (lv_c_3_0= ruleNaturalExpression ) ) )+ )
            // InternalMyDsl.g:1451:2: ( ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) ) | ( (lv_c_3_0= ruleNaturalExpression ) ) )+
            {
            // InternalMyDsl.g:1451:2: ( ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) ) | ( (lv_c_3_0= ruleNaturalExpression ) ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=3;
                alt36 = dfa36.predict(input);
                switch (alt36) {
            	case 1 :
            	    // InternalMyDsl.g:1452:3: ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) )
            	    {
            	    // InternalMyDsl.g:1452:3: ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) )
            	    // InternalMyDsl.g:1453:4: ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) )
            	    {
            	    // InternalMyDsl.g:1477:4: ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) )
            	    int alt35=3;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==29) && (synpred53_InternalMyDsl())) {
            	        alt35=1;
            	    }
            	    else if ( (LA35_0==30) ) {
            	        alt35=2;
            	    }
            	    else if ( (LA35_0==31) ) {
            	        alt35=3;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // InternalMyDsl.g:1478:5: ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) )
            	            {
            	            // InternalMyDsl.g:1478:5: ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) )
            	            // InternalMyDsl.g:1479:6: ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression )
            	            {
            	            // InternalMyDsl.g:1483:6: (lv_c_0_0= ruleStrongExpression )
            	            // InternalMyDsl.g:1484:7: lv_c_0_0= ruleStrongExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getCStrongExpressionParserRuleCall_0_0_0_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_18);
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
            	            // InternalMyDsl.g:1502:5: ( (lv_c_1_0= ruleItalicExpression ) )
            	            {
            	            // InternalMyDsl.g:1502:5: ( (lv_c_1_0= ruleItalicExpression ) )
            	            // InternalMyDsl.g:1503:6: (lv_c_1_0= ruleItalicExpression )
            	            {
            	            // InternalMyDsl.g:1503:6: (lv_c_1_0= ruleItalicExpression )
            	            // InternalMyDsl.g:1504:7: lv_c_1_0= ruleItalicExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getCItalicExpressionParserRuleCall_0_0_1_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_18);
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
            	            // InternalMyDsl.g:1522:5: ( (lv_c_2_0= ruleScratchExpression ) )
            	            {
            	            // InternalMyDsl.g:1522:5: ( (lv_c_2_0= ruleScratchExpression ) )
            	            // InternalMyDsl.g:1523:6: (lv_c_2_0= ruleScratchExpression )
            	            {
            	            // InternalMyDsl.g:1523:6: (lv_c_2_0= ruleScratchExpression )
            	            // InternalMyDsl.g:1524:7: lv_c_2_0= ruleScratchExpression
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getCScratchExpressionParserRuleCall_0_0_2_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_18);
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
            	    // InternalMyDsl.g:1544:3: ( (lv_c_3_0= ruleNaturalExpression ) )
            	    {
            	    // InternalMyDsl.g:1544:3: ( (lv_c_3_0= ruleNaturalExpression ) )
            	    // InternalMyDsl.g:1545:4: (lv_c_3_0= ruleNaturalExpression )
            	    {
            	    // InternalMyDsl.g:1545:4: (lv_c_3_0= ruleNaturalExpression )
            	    // InternalMyDsl.g:1546:5: lv_c_3_0= ruleNaturalExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getCNaturalExpressionParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
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
            	    if ( cnt36 >= 1 ) break loop36;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
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
    // InternalMyDsl.g:1567:1: entryRuleStrongExpression returns [EObject current=null] : iv_ruleStrongExpression= ruleStrongExpression EOF ;
    public final EObject entryRuleStrongExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrongExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:1569:2: (iv_ruleStrongExpression= ruleStrongExpression EOF )
            // InternalMyDsl.g:1570:2: iv_ruleStrongExpression= ruleStrongExpression EOF
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
    // InternalMyDsl.g:1579:1: ruleStrongExpression returns [EObject current=null] : ( () ( ( '**' )=>otherlv_1= '**' ) ( (lv_content_2_0= ruleEmphasisExpression ) ) ( ( '**' )=>otherlv_3= '**' ) ) ;
    public final EObject ruleStrongExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:1586:2: ( ( () ( ( '**' )=>otherlv_1= '**' ) ( (lv_content_2_0= ruleEmphasisExpression ) ) ( ( '**' )=>otherlv_3= '**' ) ) )
            // InternalMyDsl.g:1587:2: ( () ( ( '**' )=>otherlv_1= '**' ) ( (lv_content_2_0= ruleEmphasisExpression ) ) ( ( '**' )=>otherlv_3= '**' ) )
            {
            // InternalMyDsl.g:1587:2: ( () ( ( '**' )=>otherlv_1= '**' ) ( (lv_content_2_0= ruleEmphasisExpression ) ) ( ( '**' )=>otherlv_3= '**' ) )
            // InternalMyDsl.g:1588:3: () ( ( '**' )=>otherlv_1= '**' ) ( (lv_content_2_0= ruleEmphasisExpression ) ) ( ( '**' )=>otherlv_3= '**' )
            {
            // InternalMyDsl.g:1588:3: ()
            // InternalMyDsl.g:1589:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStrongExpressionAccess().getStrongExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:1595:3: ( ( '**' )=>otherlv_1= '**' )
            // InternalMyDsl.g:1596:4: ( '**' )=>otherlv_1= '**'
            {
            otherlv_1=(Token)match(input,29,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getStrongExpressionAccess().getAsteriskAsteriskKeyword_1());
              			
            }

            }

            // InternalMyDsl.g:1602:3: ( (lv_content_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1603:4: (lv_content_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1603:4: (lv_content_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1604:5: lv_content_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStrongExpressionAccess().getContentEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_19);
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

            // InternalMyDsl.g:1621:3: ( ( '**' )=>otherlv_3= '**' )
            // InternalMyDsl.g:1622:4: ( '**' )=>otherlv_3= '**'
            {
            otherlv_3=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getStrongExpressionAccess().getAsteriskAsteriskKeyword_3());
              			
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleStrongExpression"


    // $ANTLR start "entryRuleItalicExpression"
    // InternalMyDsl.g:1635:1: entryRuleItalicExpression returns [EObject current=null] : iv_ruleItalicExpression= ruleItalicExpression EOF ;
    public final EObject entryRuleItalicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItalicExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:1637:2: (iv_ruleItalicExpression= ruleItalicExpression EOF )
            // InternalMyDsl.g:1638:2: iv_ruleItalicExpression= ruleItalicExpression EOF
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
    // InternalMyDsl.g:1647:1: ruleItalicExpression returns [EObject current=null] : ( () ( ( '*' )=>otherlv_1= '*' ) ( (lv_content_2_0= ruleEmphasisExpression ) ) ( ( '*' )=>otherlv_3= '*' ) ) ;
    public final EObject ruleItalicExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:1654:2: ( ( () ( ( '*' )=>otherlv_1= '*' ) ( (lv_content_2_0= ruleEmphasisExpression ) ) ( ( '*' )=>otherlv_3= '*' ) ) )
            // InternalMyDsl.g:1655:2: ( () ( ( '*' )=>otherlv_1= '*' ) ( (lv_content_2_0= ruleEmphasisExpression ) ) ( ( '*' )=>otherlv_3= '*' ) )
            {
            // InternalMyDsl.g:1655:2: ( () ( ( '*' )=>otherlv_1= '*' ) ( (lv_content_2_0= ruleEmphasisExpression ) ) ( ( '*' )=>otherlv_3= '*' ) )
            // InternalMyDsl.g:1656:3: () ( ( '*' )=>otherlv_1= '*' ) ( (lv_content_2_0= ruleEmphasisExpression ) ) ( ( '*' )=>otherlv_3= '*' )
            {
            // InternalMyDsl.g:1656:3: ()
            // InternalMyDsl.g:1657:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getItalicExpressionAccess().getItalicExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:1663:3: ( ( '*' )=>otherlv_1= '*' )
            // InternalMyDsl.g:1664:4: ( '*' )=>otherlv_1= '*'
            {
            otherlv_1=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getItalicExpressionAccess().getAsteriskKeyword_1());
              			
            }

            }

            // InternalMyDsl.g:1670:3: ( (lv_content_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1671:4: (lv_content_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1671:4: (lv_content_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1672:5: lv_content_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getItalicExpressionAccess().getContentEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_20);
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

            // InternalMyDsl.g:1689:3: ( ( '*' )=>otherlv_3= '*' )
            // InternalMyDsl.g:1690:4: ( '*' )=>otherlv_3= '*'
            {
            otherlv_3=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getItalicExpressionAccess().getAsteriskKeyword_3());
              			
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleItalicExpression"


    // $ANTLR start "entryRuleScratchExpression"
    // InternalMyDsl.g:1703:1: entryRuleScratchExpression returns [EObject current=null] : iv_ruleScratchExpression= ruleScratchExpression EOF ;
    public final EObject entryRuleScratchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScratchExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:1705:2: (iv_ruleScratchExpression= ruleScratchExpression EOF )
            // InternalMyDsl.g:1706:2: iv_ruleScratchExpression= ruleScratchExpression EOF
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
    // InternalMyDsl.g:1715:1: ruleScratchExpression returns [EObject current=null] : ( () ( ( '~~' )=>otherlv_1= '~~' ) ( (lv_content_2_0= ruleEmphasisExpression ) ) ( ( '~~' )=>otherlv_3= '~~' ) ) ;
    public final EObject ruleScratchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalMyDsl.g:1722:2: ( ( () ( ( '~~' )=>otherlv_1= '~~' ) ( (lv_content_2_0= ruleEmphasisExpression ) ) ( ( '~~' )=>otherlv_3= '~~' ) ) )
            // InternalMyDsl.g:1723:2: ( () ( ( '~~' )=>otherlv_1= '~~' ) ( (lv_content_2_0= ruleEmphasisExpression ) ) ( ( '~~' )=>otherlv_3= '~~' ) )
            {
            // InternalMyDsl.g:1723:2: ( () ( ( '~~' )=>otherlv_1= '~~' ) ( (lv_content_2_0= ruleEmphasisExpression ) ) ( ( '~~' )=>otherlv_3= '~~' ) )
            // InternalMyDsl.g:1724:3: () ( ( '~~' )=>otherlv_1= '~~' ) ( (lv_content_2_0= ruleEmphasisExpression ) ) ( ( '~~' )=>otherlv_3= '~~' )
            {
            // InternalMyDsl.g:1724:3: ()
            // InternalMyDsl.g:1725:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getScratchExpressionAccess().getScratchExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:1731:3: ( ( '~~' )=>otherlv_1= '~~' )
            // InternalMyDsl.g:1732:4: ( '~~' )=>otherlv_1= '~~'
            {
            otherlv_1=(Token)match(input,31,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getScratchExpressionAccess().getTildeTildeKeyword_1());
              			
            }

            }

            // InternalMyDsl.g:1738:3: ( (lv_content_2_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:1739:4: (lv_content_2_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:1739:4: (lv_content_2_0= ruleEmphasisExpression )
            // InternalMyDsl.g:1740:5: lv_content_2_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getScratchExpressionAccess().getContentEmphasisExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_21);
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

            // InternalMyDsl.g:1757:3: ( ( '~~' )=>otherlv_3= '~~' )
            // InternalMyDsl.g:1758:4: ( '~~' )=>otherlv_3= '~~'
            {
            otherlv_3=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getScratchExpressionAccess().getTildeTildeKeyword_3());
              			
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleScratchExpression"


    // $ANTLR start "entryRuleNaturalExpression"
    // InternalMyDsl.g:1771:1: entryRuleNaturalExpression returns [EObject current=null] : iv_ruleNaturalExpression= ruleNaturalExpression EOF ;
    public final EObject entryRuleNaturalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalExpression = null;


        try {
            // InternalMyDsl.g:1771:58: (iv_ruleNaturalExpression= ruleNaturalExpression EOF )
            // InternalMyDsl.g:1772:2: iv_ruleNaturalExpression= ruleNaturalExpression EOF
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
    // InternalMyDsl.g:1778:1: ruleNaturalExpression returns [EObject current=null] : ( () ( (lv_value_1_0= ruleContent ) ) ) ;
    public final EObject ruleNaturalExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1784:2: ( ( () ( (lv_value_1_0= ruleContent ) ) ) )
            // InternalMyDsl.g:1785:2: ( () ( (lv_value_1_0= ruleContent ) ) )
            {
            // InternalMyDsl.g:1785:2: ( () ( (lv_value_1_0= ruleContent ) ) )
            // InternalMyDsl.g:1786:3: () ( (lv_value_1_0= ruleContent ) )
            {
            // InternalMyDsl.g:1786:3: ()
            // InternalMyDsl.g:1787:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNaturalExpressionAccess().getEmphasisExpressionAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:1793:3: ( (lv_value_1_0= ruleContent ) )
            // InternalMyDsl.g:1794:4: (lv_value_1_0= ruleContent )
            {
            // InternalMyDsl.g:1794:4: (lv_value_1_0= ruleContent )
            // InternalMyDsl.g:1795:5: lv_value_1_0= ruleContent
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
    // InternalMyDsl.g:1816:1: entryRuleContent returns [String current=null] : iv_ruleContent= ruleContent EOF ;
    public final String entryRuleContent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContent = null;


        try {
            // InternalMyDsl.g:1816:47: (iv_ruleContent= ruleContent EOF )
            // InternalMyDsl.g:1817:2: iv_ruleContent= ruleContent EOF
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
    // InternalMyDsl.g:1823:1: ruleContent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) ) | kw= '\\'' | kw= '-' | kw= '|' | kw= '\"' ) ;
    public final AntlrDatatypeRuleToken ruleContent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;
        Token this_INT_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1829:2: ( ( ( ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) ) | kw= '\\'' | kw= '-' | kw= '|' | kw= '\"' ) )
            // InternalMyDsl.g:1830:2: ( ( ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) ) | kw= '\\'' | kw= '-' | kw= '|' | kw= '\"' )
            {
            // InternalMyDsl.g:1830:2: ( ( ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) ) | kw= '\\'' | kw= '-' | kw= '|' | kw= '\"' )
            int alt38=5;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) && (synpred60_InternalMyDsl())) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_STRING) && (synpred60_InternalMyDsl())) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_INT) && (synpred60_InternalMyDsl())) {
                alt38=1;
            }
            else if ( (LA38_0==32) ) {
                alt38=2;
            }
            else if ( (LA38_0==33) ) {
                alt38=3;
            }
            else if ( (LA38_0==34) ) {
                alt38=4;
            }
            else if ( (LA38_0==35) ) {
                alt38=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:1831:3: ( ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) )
                    {
                    // InternalMyDsl.g:1831:3: ( ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) )
                    // InternalMyDsl.g:1832:4: ( ( RULE_ID | RULE_STRING | RULE_INT ) )=> (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT )
                    {
                    // InternalMyDsl.g:1840:4: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT )
                    int alt37=3;
                    switch ( input.LA(1) ) {
                    case RULE_ID:
                        {
                        alt37=1;
                        }
                        break;
                    case RULE_STRING:
                        {
                        alt37=2;
                        }
                        break;
                    case RULE_INT:
                        {
                        alt37=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }

                    switch (alt37) {
                        case 1 :
                            // InternalMyDsl.g:1841:5: this_ID_0= RULE_ID
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
                            // InternalMyDsl.g:1849:5: this_STRING_1= RULE_STRING
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
                            // InternalMyDsl.g:1857:5: this_INT_2= RULE_INT
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
                    // InternalMyDsl.g:1867:3: kw= '\\''
                    {
                    kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getContentAccess().getApostropheKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1873:3: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getContentAccess().getHyphenMinusKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1879:3: kw= '|'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getContentAccess().getVerticalLineKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1885:3: kw= '\"'
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
        int alt40=2;
        int LA40_0 = input.LA(1);

        if ( (LA40_0==23) && (synpred1_InternalMyDsl())) {
            alt40=1;
        }
        else if ( (LA40_0==24) && (synpred1_InternalMyDsl())) {
            alt40=1;
        }
        else if ( (LA40_0==25) && (synpred1_InternalMyDsl())) {
            alt40=1;
        }
        else if ( (LA40_0==26) && (synpred1_InternalMyDsl())) {
            alt40=1;
        }
        else if ( (LA40_0==27) && (synpred1_InternalMyDsl())) {
            alt40=1;
        }
        else if ( (LA40_0==28) && (synpred1_InternalMyDsl())) {
            alt40=1;
        }
        else if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_INT)||(LA40_0>=13 && LA40_0<=14)||(LA40_0>=20 && LA40_0<=21)||(LA40_0>=29 && LA40_0<=35)) ) {
            alt40=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 40, 0, input);

            throw nvae;
        }
        switch (alt40) {
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
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_BL) && (synpred2_InternalMyDsl())) {
                    alt39=1;
                }
                switch (alt39) {
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
        // InternalMyDsl.g:329:7: ( ( ruleImageExpression ) )
        // InternalMyDsl.g:329:8: ( ruleImageExpression )
        {
        // InternalMyDsl.g:329:8: ( ruleImageExpression )
        // InternalMyDsl.g:330:8: ruleImageExpression
        {
        pushFollow(FOLLOW_2);
        ruleImageExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_InternalMyDsl

    // $ANTLR start synpred7_InternalMyDsl
    public final void synpred7_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:339:7: ( ( ruleVideoExpression ) )
        // InternalMyDsl.g:339:8: ( ruleVideoExpression )
        {
        // InternalMyDsl.g:339:8: ( ruleVideoExpression )
        // InternalMyDsl.g:340:8: ruleVideoExpression
        {
        pushFollow(FOLLOW_2);
        ruleVideoExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalMyDsl

    // $ANTLR start synpred8_InternalMyDsl
    public final void synpred8_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:314:4: ( ( ( ( ruleQuoteExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) ) )
        // InternalMyDsl.g:314:5: ( ( ( ruleQuoteExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) )
        {
        // InternalMyDsl.g:314:5: ( ( ( ruleQuoteExpression ) ) | ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) ) )
        int alt42=2;
        int LA42_0 = input.LA(1);

        if ( (LA42_0==13) ) {
            alt42=1;
        }
        else if ( (LA42_0==14||(LA42_0>=20 && LA42_0<=21)) ) {
            alt42=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 42, 0, input);

            throw nvae;
        }
        switch (alt42) {
            case 1 :
                // InternalMyDsl.g:315:5: ( ( ruleQuoteExpression ) )
                {
                // InternalMyDsl.g:315:5: ( ( ruleQuoteExpression ) )
                // InternalMyDsl.g:316:6: ( ruleQuoteExpression )
                {
                // InternalMyDsl.g:316:6: ( ruleQuoteExpression )
                // InternalMyDsl.g:317:7: ruleQuoteExpression
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
                // InternalMyDsl.g:321:5: ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) )
                {
                // InternalMyDsl.g:321:5: ( ( ( ruleLinkExpression ) ) | ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) ) | ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) ) )
                int alt41=3;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==14) ) {
                    alt41=1;
                }
                else if ( (LA41_0==20) && (synpred6_InternalMyDsl())) {
                    alt41=2;
                }
                else if ( (LA41_0==21) && (synpred7_InternalMyDsl())) {
                    alt41=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 0, input);

                    throw nvae;
                }
                switch (alt41) {
                    case 1 :
                        // InternalMyDsl.g:322:6: ( ( ruleLinkExpression ) )
                        {
                        // InternalMyDsl.g:322:6: ( ( ruleLinkExpression ) )
                        // InternalMyDsl.g:323:7: ( ruleLinkExpression )
                        {
                        // InternalMyDsl.g:323:7: ( ruleLinkExpression )
                        // InternalMyDsl.g:324:8: ruleLinkExpression
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
                        // InternalMyDsl.g:328:6: ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) )
                        {
                        // InternalMyDsl.g:328:6: ( ( ( ruleImageExpression ) )=> ( ruleImageExpression ) )
                        // InternalMyDsl.g:329:7: ( ( ruleImageExpression ) )=> ( ruleImageExpression )
                        {
                        // InternalMyDsl.g:333:7: ( ruleImageExpression )
                        // InternalMyDsl.g:334:8: ruleImageExpression
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
                        // InternalMyDsl.g:338:6: ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) )
                        {
                        // InternalMyDsl.g:338:6: ( ( ( ruleVideoExpression ) )=> ( ruleVideoExpression ) )
                        // InternalMyDsl.g:339:7: ( ( ruleVideoExpression ) )=> ( ruleVideoExpression )
                        {
                        // InternalMyDsl.g:343:7: ( ruleVideoExpression )
                        // InternalMyDsl.g:344:8: ruleVideoExpression
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
    // $ANTLR end synpred8_InternalMyDsl

    // $ANTLR start synpred9_InternalMyDsl
    public final void synpred9_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:393:7: ( ( ruleImageExpression ) )
        // InternalMyDsl.g:393:8: ( ruleImageExpression )
        {
        // InternalMyDsl.g:393:8: ( ruleImageExpression )
        // InternalMyDsl.g:394:8: ruleImageExpression
        {
        pushFollow(FOLLOW_2);
        ruleImageExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalMyDsl

    // $ANTLR start synpred10_InternalMyDsl
    public final void synpred10_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:417:7: ( ( ruleVideoExpression ) )
        // InternalMyDsl.g:417:8: ( ruleVideoExpression )
        {
        // InternalMyDsl.g:417:8: ( ruleVideoExpression )
        // InternalMyDsl.g:418:8: ruleVideoExpression
        {
        pushFollow(FOLLOW_2);
        ruleVideoExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalMyDsl

    // $ANTLR start synpred12_InternalMyDsl
    public final void synpred12_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:495:4: ( RULE_BL )
        // InternalMyDsl.g:495:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalMyDsl

    // $ANTLR start synpred15_InternalMyDsl
    public final void synpred15_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:580:4: ( RULE_BL )
        // InternalMyDsl.g:580:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalMyDsl

    // $ANTLR start synpred18_InternalMyDsl
    public final void synpred18_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:666:5: ( ')' )
        // InternalMyDsl.g:666:6: ')'
        {
        match(input,17,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalMyDsl

    // $ANTLR start synpred19_InternalMyDsl
    public final void synpred19_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:673:5: ( RULE_BL )
        // InternalMyDsl.g:673:6: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_InternalMyDsl

    // $ANTLR start synpred20_InternalMyDsl
    public final void synpred20_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:683:5: ( '[' )
        // InternalMyDsl.g:683:6: '['
        {
        match(input,14,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_InternalMyDsl

    // $ANTLR start synpred22_InternalMyDsl
    public final void synpred22_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:735:5: ( ']' )
        // InternalMyDsl.g:735:6: ']'
        {
        match(input,19,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalMyDsl

    // $ANTLR start synpred23_InternalMyDsl
    public final void synpred23_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:742:5: ( RULE_BL )
        // InternalMyDsl.g:742:6: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalMyDsl

    // $ANTLR start synpred26_InternalMyDsl
    public final void synpred26_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:828:4: ( ')' )
        // InternalMyDsl.g:828:5: ')'
        {
        match(input,17,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalMyDsl

    // $ANTLR start synpred27_InternalMyDsl
    public final void synpred27_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:835:4: ( RULE_BL )
        // InternalMyDsl.g:835:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalMyDsl

    // $ANTLR start synpred30_InternalMyDsl
    public final void synpred30_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:920:4: ( ')](' )
        // InternalMyDsl.g:920:5: ')]('
        {
        match(input,22,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalMyDsl

    // $ANTLR start synpred31_InternalMyDsl
    public final void synpred31_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:946:4: ( ')' )
        // InternalMyDsl.g:946:5: ')'
        {
        match(input,17,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalMyDsl

    // $ANTLR start synpred32_InternalMyDsl
    public final void synpred32_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:953:4: ( RULE_BL )
        // InternalMyDsl.g:953:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalMyDsl

    // $ANTLR start synpred34_InternalMyDsl
    public final void synpred34_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1084:4: ( '#' )
        // InternalMyDsl.g:1084:5: '#'
        {
        match(input,23,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalMyDsl

    // $ANTLR start synpred35_InternalMyDsl
    public final void synpred35_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1092:4: ( RULE_BL )
        // InternalMyDsl.g:1092:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalMyDsl

    // $ANTLR start synpred37_InternalMyDsl
    public final void synpred37_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1151:4: ( '#' )
        // InternalMyDsl.g:1151:5: '#'
        {
        match(input,23,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalMyDsl

    // $ANTLR start synpred38_InternalMyDsl
    public final void synpred38_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1159:4: ( RULE_BL )
        // InternalMyDsl.g:1159:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_InternalMyDsl

    // $ANTLR start synpred40_InternalMyDsl
    public final void synpred40_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1218:4: ( '#' )
        // InternalMyDsl.g:1218:5: '#'
        {
        match(input,23,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_InternalMyDsl

    // $ANTLR start synpred41_InternalMyDsl
    public final void synpred41_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1226:4: ( RULE_BL )
        // InternalMyDsl.g:1226:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_InternalMyDsl

    // $ANTLR start synpred43_InternalMyDsl
    public final void synpred43_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1285:4: ( '#' )
        // InternalMyDsl.g:1285:5: '#'
        {
        match(input,23,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_InternalMyDsl

    // $ANTLR start synpred44_InternalMyDsl
    public final void synpred44_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1293:4: ( RULE_BL )
        // InternalMyDsl.g:1293:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_InternalMyDsl

    // $ANTLR start synpred46_InternalMyDsl
    public final void synpred46_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1352:4: ( '#' )
        // InternalMyDsl.g:1352:5: '#'
        {
        match(input,23,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_InternalMyDsl

    // $ANTLR start synpred47_InternalMyDsl
    public final void synpred47_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1360:4: ( RULE_BL )
        // InternalMyDsl.g:1360:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_InternalMyDsl

    // $ANTLR start synpred49_InternalMyDsl
    public final void synpred49_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1419:4: ( '#' )
        // InternalMyDsl.g:1419:5: '#'
        {
        match(input,23,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_InternalMyDsl

    // $ANTLR start synpred50_InternalMyDsl
    public final void synpred50_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1427:4: ( RULE_BL )
        // InternalMyDsl.g:1427:5: RULE_BL
        {
        match(input,RULE_BL,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_InternalMyDsl

    // $ANTLR start synpred51_InternalMyDsl
    public final void synpred51_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1455:6: ( ( ruleStrongExpression ) )
        // InternalMyDsl.g:1455:7: ( ruleStrongExpression )
        {
        // InternalMyDsl.g:1455:7: ( ruleStrongExpression )
        // InternalMyDsl.g:1456:7: ruleStrongExpression
        {
        pushFollow(FOLLOW_2);
        ruleStrongExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred51_InternalMyDsl

    // $ANTLR start synpred52_InternalMyDsl
    public final void synpred52_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1453:4: ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )
        // InternalMyDsl.g:1453:5: ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) )
        {
        // InternalMyDsl.g:1453:5: ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) )
        int alt43=3;
        int LA43_0 = input.LA(1);

        if ( (LA43_0==29) && (synpred51_InternalMyDsl())) {
            alt43=1;
        }
        else if ( (LA43_0==30) ) {
            alt43=2;
        }
        else if ( (LA43_0==31) ) {
            alt43=3;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 43, 0, input);

            throw nvae;
        }
        switch (alt43) {
            case 1 :
                // InternalMyDsl.g:1454:5: ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) )
                {
                // InternalMyDsl.g:1454:5: ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) )
                // InternalMyDsl.g:1455:6: ( ( ruleStrongExpression ) )=> ( ruleStrongExpression )
                {
                // InternalMyDsl.g:1459:6: ( ruleStrongExpression )
                // InternalMyDsl.g:1460:7: ruleStrongExpression
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
                // InternalMyDsl.g:1464:5: ( ( ruleItalicExpression ) )
                {
                // InternalMyDsl.g:1464:5: ( ( ruleItalicExpression ) )
                // InternalMyDsl.g:1465:6: ( ruleItalicExpression )
                {
                // InternalMyDsl.g:1465:6: ( ruleItalicExpression )
                // InternalMyDsl.g:1466:7: ruleItalicExpression
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
                // InternalMyDsl.g:1470:5: ( ( ruleScratchExpression ) )
                {
                // InternalMyDsl.g:1470:5: ( ( ruleScratchExpression ) )
                // InternalMyDsl.g:1471:6: ( ruleScratchExpression )
                {
                // InternalMyDsl.g:1471:6: ( ruleScratchExpression )
                // InternalMyDsl.g:1472:7: ruleScratchExpression
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
    // $ANTLR end synpred52_InternalMyDsl

    // $ANTLR start synpred53_InternalMyDsl
    public final void synpred53_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1479:6: ( ( ruleStrongExpression ) )
        // InternalMyDsl.g:1479:7: ( ruleStrongExpression )
        {
        // InternalMyDsl.g:1479:7: ( ruleStrongExpression )
        // InternalMyDsl.g:1480:7: ruleStrongExpression
        {
        pushFollow(FOLLOW_2);
        ruleStrongExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred53_InternalMyDsl

    // $ANTLR start synpred60_InternalMyDsl
    public final void synpred60_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:1832:4: ( ( RULE_ID | RULE_STRING | RULE_INT ) )
        // InternalMyDsl.g:1832:5: ( RULE_ID | RULE_STRING | RULE_INT )
        {
        if ( (input.LA(1)>=RULE_ID && input.LA(1)<=RULE_INT) ) {
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


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA36 dfa36 = new DFA36(this);
    static final String dfa_1s = "\40\uffff";
    static final String dfa_2s = "\1\4\21\uffff\1\5\3\uffff\7\17\3\uffff";
    static final String dfa_3s = "\1\43\21\uffff\1\43\3\uffff\7\22\3\uffff";
    static final String dfa_4s = "\1\uffff\21\1\1\uffff\2\1\1\2\7\uffff\2\1\1\3";
    static final String dfa_5s = "\1\4\25\uffff\1\2\1\0\1\7\1\1\1\5\1\6\1\3\3\uffff}>";
    static final String[] dfa_6s = {
            "\1\25\1\12\1\13\1\14\5\uffff\1\21\1\22\5\uffff\1\23\1\24\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\15\1\16\1\17\1\20",
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
            "\1\26\1\27\1\30\30\uffff\1\31\1\32\1\33\1\34",
            "",
            "",
            "",
            "\1\37\1\35\1\uffff\1\36",
            "\1\37\1\35\1\uffff\1\36",
            "\1\37\1\35\1\uffff\1\36",
            "\1\37\1\35\1\uffff\1\36",
            "\1\37\1\35\1\uffff\1\36",
            "\1\37\1\35\1\uffff\1\36",
            "\1\37\1\35\1\uffff\1\36",
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
            return "123:2: ( ( ( ( ( ( ( ruleHeaderExpression ) )=> ( ruleHeaderExpression ) ) | ( ( ( ruleTextExpression ) ) ( ( RULE_BL )=> RULE_BL )? ) ) )=> ( ( ( ( ruleHeaderExpression ) )=> (lv_c_0_0= ruleHeaderExpression ) ) | ( ( (lv_c_1_0= ruleTextExpression ) ) ( ( RULE_BL )=>this_BL_2= RULE_BL )? ) ) ) | ( (lv_c_3_0= ruleBreakLineExpression ) ) | ( (lv_c_4_0= ruleRefExpression ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_23 = input.LA(1);

                         
                        int index4_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA4_23==15) ) {s = 31;}

                        else if ( (LA4_23==16) && (synpred3_InternalMyDsl())) {s = 29;}

                        else if ( (LA4_23==18) && (synpred3_InternalMyDsl())) {s = 30;}

                         
                        input.seek(index4_23);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_25 = input.LA(1);

                         
                        int index4_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA4_25==15) ) {s = 31;}

                        else if ( (LA4_25==16) && (synpred3_InternalMyDsl())) {s = 29;}

                        else if ( (LA4_25==18) && (synpred3_InternalMyDsl())) {s = 30;}

                         
                        input.seek(index4_25);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_22 = input.LA(1);

                         
                        int index4_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA4_22==16) && (synpred3_InternalMyDsl())) {s = 29;}

                        else if ( (LA4_22==18) && (synpred3_InternalMyDsl())) {s = 30;}

                        else if ( (LA4_22==15) ) {s = 31;}

                         
                        input.seek(index4_22);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_28 = input.LA(1);

                         
                        int index4_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA4_28==15) ) {s = 31;}

                        else if ( (LA4_28==16) && (synpred3_InternalMyDsl())) {s = 29;}

                        else if ( (LA4_28==18) && (synpred3_InternalMyDsl())) {s = 30;}

                         
                        input.seek(index4_28);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA4_0 = input.LA(1);

                         
                        int index4_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA4_0==23) && (synpred3_InternalMyDsl())) {s = 1;}

                        else if ( (LA4_0==24) && (synpred3_InternalMyDsl())) {s = 2;}

                        else if ( (LA4_0==25) && (synpred3_InternalMyDsl())) {s = 3;}

                        else if ( (LA4_0==26) && (synpred3_InternalMyDsl())) {s = 4;}

                        else if ( (LA4_0==27) && (synpred3_InternalMyDsl())) {s = 5;}

                        else if ( (LA4_0==28) && (synpred3_InternalMyDsl())) {s = 6;}

                        else if ( (LA4_0==29) && (synpred3_InternalMyDsl())) {s = 7;}

                        else if ( (LA4_0==30) && (synpred3_InternalMyDsl())) {s = 8;}

                        else if ( (LA4_0==31) && (synpred3_InternalMyDsl())) {s = 9;}

                        else if ( (LA4_0==RULE_ID) && (synpred3_InternalMyDsl())) {s = 10;}

                        else if ( (LA4_0==RULE_STRING) && (synpred3_InternalMyDsl())) {s = 11;}

                        else if ( (LA4_0==RULE_INT) && (synpred3_InternalMyDsl())) {s = 12;}

                        else if ( (LA4_0==32) && (synpred3_InternalMyDsl())) {s = 13;}

                        else if ( (LA4_0==33) && (synpred3_InternalMyDsl())) {s = 14;}

                        else if ( (LA4_0==34) && (synpred3_InternalMyDsl())) {s = 15;}

                        else if ( (LA4_0==35) && (synpred3_InternalMyDsl())) {s = 16;}

                        else if ( (LA4_0==13) && (synpred3_InternalMyDsl())) {s = 17;}

                        else if ( (LA4_0==14) ) {s = 18;}

                        else if ( (LA4_0==20) && (synpred3_InternalMyDsl())) {s = 19;}

                        else if ( (LA4_0==21) && (synpred3_InternalMyDsl())) {s = 20;}

                        else if ( (LA4_0==RULE_BL) ) {s = 21;}

                         
                        input.seek(index4_0);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA4_26 = input.LA(1);

                         
                        int index4_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA4_26==15) ) {s = 31;}

                        else if ( (LA4_26==16) && (synpred3_InternalMyDsl())) {s = 29;}

                        else if ( (LA4_26==18) && (synpred3_InternalMyDsl())) {s = 30;}

                         
                        input.seek(index4_26);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA4_27 = input.LA(1);

                         
                        int index4_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA4_27==18) && (synpred3_InternalMyDsl())) {s = 30;}

                        else if ( (LA4_27==15) ) {s = 31;}

                        else if ( (LA4_27==16) && (synpred3_InternalMyDsl())) {s = 29;}

                         
                        input.seek(index4_27);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA4_24 = input.LA(1);

                         
                        int index4_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA4_24==15) ) {s = 31;}

                        else if ( (LA4_24==16) && (synpred3_InternalMyDsl())) {s = 29;}

                        else if ( (LA4_24==18) && (synpred3_InternalMyDsl())) {s = 30;}

                         
                        input.seek(index4_24);
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
    static final String dfa_7s = "\27\uffff";
    static final String dfa_8s = "\1\1\26\uffff";
    static final String dfa_9s = "\1\4\26\uffff";
    static final String dfa_10s = "\1\43\26\uffff";
    static final String dfa_11s = "\1\uffff\1\2\7\uffff\16\1";
    static final String dfa_12s = "\27\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\1\14\1\15\1\16\5\uffff\1\23\1\24\5\uffff\1\25\1\26\1\uffff\6\1\1\11\1\12\1\13\1\17\1\20\1\21\1\22",
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
            return "()+ loopback of 475:3: ( (lv_content_2_0= ruleTextExpression ) )+";
        }
    }
    static final String dfa_14s = "\13\uffff";
    static final String dfa_15s = "\1\16\1\5\7\20\2\uffff";
    static final String dfa_16s = "\1\16\1\43\7\22\2\uffff";
    static final String dfa_17s = "\11\uffff\1\1\1\2";
    static final String dfa_18s = "\2\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff}>";
    static final String[] dfa_19s = {
            "\1\1",
            "\1\2\1\3\1\4\30\uffff\1\5\1\6\1\7\1\10",
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

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "604:2: ( ( () ( ( '[' )=>otherlv_1= '[' ) ( (lv_altText_2_0= ruleNaturalExpression ) ) ( ( '](' )=>otherlv_3= '](' ) ( (lv_linkContent_4_0= ruleNaturalExpression ) )? ( ( ')' )=>otherlv_5= ')' ) ( ( RULE_BL )=>this_BL_6= RULE_BL )? ) | ( ( ( '[' )=>otherlv_7= '[' ) ( (lv_altText_8_0= ruleNaturalExpression ) ) ( ( '][' )=>otherlv_9= '][' ) ( (lv_refName_10_0= ruleNaturalExpression ) )? ( ( ']' )=>otherlv_11= ']' ) ( ( RULE_BL )=>this_BL_12= RULE_BL )? ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_2 = input.LA(1);

                         
                        int index16_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA16_2==16) ) {s = 9;}

                        else if ( (LA16_2==18) && (synpred20_InternalMyDsl())) {s = 10;}

                         
                        input.seek(index16_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_3 = input.LA(1);

                         
                        int index16_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA16_3==18) && (synpred20_InternalMyDsl())) {s = 10;}

                        else if ( (LA16_3==16) ) {s = 9;}

                         
                        input.seek(index16_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_4 = input.LA(1);

                         
                        int index16_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA16_4==16) ) {s = 9;}

                        else if ( (LA16_4==18) && (synpred20_InternalMyDsl())) {s = 10;}

                         
                        input.seek(index16_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_5 = input.LA(1);

                         
                        int index16_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA16_5==18) && (synpred20_InternalMyDsl())) {s = 10;}

                        else if ( (LA16_5==16) ) {s = 9;}

                         
                        input.seek(index16_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_6 = input.LA(1);

                         
                        int index16_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA16_6==16) ) {s = 9;}

                        else if ( (LA16_6==18) && (synpred20_InternalMyDsl())) {s = 10;}

                         
                        input.seek(index16_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA16_7 = input.LA(1);

                         
                        int index16_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA16_7==16) ) {s = 9;}

                        else if ( (LA16_7==18) && (synpred20_InternalMyDsl())) {s = 10;}

                         
                        input.seek(index16_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA16_8 = input.LA(1);

                         
                        int index16_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA16_8==16) ) {s = 9;}

                        else if ( (LA16_8==18) && (synpred20_InternalMyDsl())) {s = 10;}

                         
                        input.seek(index16_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_20s = "\30\uffff";
    static final String dfa_21s = "\1\1\27\uffff";
    static final String dfa_22s = "\1\4\2\uffff\1\0\24\uffff";
    static final String dfa_23s = "\1\43\2\uffff\1\0\24\uffff";
    static final String dfa_24s = "\1\uffff\1\2\25\uffff\1\1";
    static final String dfa_25s = "\3\uffff\1\0\24\uffff}>";
    static final String[] dfa_26s = {
            "\4\1\5\uffff\2\1\5\uffff\2\1\1\uffff\1\3\14\1",
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
            ""
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "()* loopback of 1083:3: ( ( '#' )=>otherlv_3= '#' )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_3 = input.LA(1);

                         
                        int index23_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalMyDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index23_3);
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

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "()* loopback of 1150:3: ( ( '#' )=>otherlv_3= '#' )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_3 = input.LA(1);

                         
                        int index25_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalMyDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index25_3);
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

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "()* loopback of 1217:3: ( ( '#' )=>otherlv_3= '#' )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_3 = input.LA(1);

                         
                        int index27_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_InternalMyDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_3);
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

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "()* loopback of 1284:3: ( ( '#' )=>otherlv_3= '#' )*";
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
                        if ( (synpred43_InternalMyDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index29_3);
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

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "()* loopback of 1351:3: ( ( '#' )=>otherlv_3= '#' )*";
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
                        if ( (synpred46_InternalMyDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
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

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "()* loopback of 1418:3: ( ( '#' )=>otherlv_3= '#' )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_3 = input.LA(1);

                         
                        int index33_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_InternalMyDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index33_3);
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
    static final String dfa_27s = "\1\4\10\uffff\3\0\14\uffff";
    static final String dfa_28s = "\1\43\10\uffff\3\0\14\uffff";
    static final String dfa_29s = "\1\uffff\1\3\12\uffff\7\2\4\uffff\1\1";
    static final String dfa_30s = "\11\uffff\1\0\1\1\1\2\14\uffff}>";
    static final String[] dfa_31s = {
            "\1\1\1\14\1\15\1\16\5\uffff\2\1\5\uffff\2\1\1\uffff\6\1\1\11\1\12\1\13\1\17\1\20\1\21\1\22",
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
            ""
    };
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[][] dfa_31 = unpackEncodedStringArray(dfa_31s);

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_30;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "()+ loopback of 1451:2: ( ( ( ( ( ( ( ruleStrongExpression ) )=> ( ruleStrongExpression ) ) | ( ( ruleItalicExpression ) ) | ( ( ruleScratchExpression ) ) ) )=> ( ( ( ( ruleStrongExpression ) )=> (lv_c_0_0= ruleStrongExpression ) ) | ( (lv_c_1_0= ruleItalicExpression ) ) | ( (lv_c_2_0= ruleScratchExpression ) ) ) ) | ( (lv_c_3_0= ruleNaturalExpression ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_9 = input.LA(1);

                         
                        int index36_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalMyDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA36_10 = input.LA(1);

                         
                        int index36_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalMyDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA36_11 = input.LA(1);

                         
                        int index36_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalMyDsl()) ) {s = 23;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_11);
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
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000FFFB060F2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000FFFB060E0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000FE00000E0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000FE00000F2L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000FE00200E0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000FE00800E0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000FE04000E0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000FE00000E2L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});

}