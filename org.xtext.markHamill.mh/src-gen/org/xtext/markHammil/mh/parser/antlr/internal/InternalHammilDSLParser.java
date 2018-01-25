package org.xtext.markHammil.mh.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.markHammil.mh.services.HammilDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalHammilDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_S", "RULE_DIGIT", "RULE_INT", "RULE_DOUBLE", "RULE_ID", "RULE_WS", "RULE_ANY_OTHER", "'#'", "'='", "'##'", "'-'", "'###'", "'#####'", "'######'", "'####'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=11;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_ID=12;
    public static final int RULE_WS=13;
    public static final int RULE_DIGIT=9;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_S=8;
    public static final int RULE_INT=10;
    public static final int RULE_BL=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=6;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalHammilDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHammilDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHammilDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalHammilDSL.g"; }



     	private HammilDSLGrammarAccess grammarAccess;

        public InternalHammilDSLParser(TokenStream input, HammilDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "File";
       	}

       	@Override
       	protected HammilDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFile"
    // InternalHammilDSL.g:64:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // InternalHammilDSL.g:64:45: (iv_ruleFile= ruleFile EOF )
            // InternalHammilDSL.g:65:2: iv_ruleFile= ruleFile EOF
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
    // InternalHammilDSL.g:71:1: ruleFile returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleExpression ) )* ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalHammilDSL.g:77:2: ( ( () ( (lv_expression_1_0= ruleExpression ) )* ) )
            // InternalHammilDSL.g:78:2: ( () ( (lv_expression_1_0= ruleExpression ) )* )
            {
            // InternalHammilDSL.g:78:2: ( () ( (lv_expression_1_0= ruleExpression ) )* )
            // InternalHammilDSL.g:79:3: () ( (lv_expression_1_0= ruleExpression ) )*
            {
            // InternalHammilDSL.g:79:3: ()
            // InternalHammilDSL.g:80:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFileAccess().getFileAction_0(),
              					current);
              			
            }

            }

            // InternalHammilDSL.g:86:3: ( (lv_expression_1_0= ruleExpression ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_STRING||LA1_0==15||LA1_0==17||(LA1_0>=19 && LA1_0<=22)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalHammilDSL.g:87:4: (lv_expression_1_0= ruleExpression )
            	    {
            	    // InternalHammilDSL.g:87:4: (lv_expression_1_0= ruleExpression )
            	    // InternalHammilDSL.g:88:5: lv_expression_1_0= ruleExpression
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
            	      						"org.xtext.markHammil.mh.HammilDSL.Expression");
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
    // InternalHammilDSL.g:109:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalHammilDSL.g:109:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalHammilDSL.g:110:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalHammilDSL.g:116:1: ruleExpression returns [EObject current=null] : (this_TextualExpression_0= ruleTextualExpression | ( ( ( ruleHeaderDepth1Expression | ruleHeaderDepth2Expression | ruleHeaderDepth3Expression | ruleHeaderDepth4Expression | ruleHeaderDepth5Expression | ruleHeaderDepth6Expression ) )=> (this_HeaderDepth1Expression_1= ruleHeaderDepth1Expression | this_HeaderDepth2Expression_2= ruleHeaderDepth2Expression | this_HeaderDepth3Expression_3= ruleHeaderDepth3Expression | this_HeaderDepth4Expression_4= ruleHeaderDepth4Expression | this_HeaderDepth5Expression_5= ruleHeaderDepth5Expression | this_HeaderDepth6Expression_6= ruleHeaderDepth6Expression ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TextualExpression_0 = null;

        EObject this_HeaderDepth1Expression_1 = null;

        EObject this_HeaderDepth2Expression_2 = null;

        EObject this_HeaderDepth3Expression_3 = null;

        EObject this_HeaderDepth4Expression_4 = null;

        EObject this_HeaderDepth5Expression_5 = null;

        EObject this_HeaderDepth6Expression_6 = null;



        	enterRule();

        try {
            // InternalHammilDSL.g:122:2: ( (this_TextualExpression_0= ruleTextualExpression | ( ( ( ruleHeaderDepth1Expression | ruleHeaderDepth2Expression | ruleHeaderDepth3Expression | ruleHeaderDepth4Expression | ruleHeaderDepth5Expression | ruleHeaderDepth6Expression ) )=> (this_HeaderDepth1Expression_1= ruleHeaderDepth1Expression | this_HeaderDepth2Expression_2= ruleHeaderDepth2Expression | this_HeaderDepth3Expression_3= ruleHeaderDepth3Expression | this_HeaderDepth4Expression_4= ruleHeaderDepth4Expression | this_HeaderDepth5Expression_5= ruleHeaderDepth5Expression | this_HeaderDepth6Expression_6= ruleHeaderDepth6Expression ) ) ) )
            // InternalHammilDSL.g:123:2: (this_TextualExpression_0= ruleTextualExpression | ( ( ( ruleHeaderDepth1Expression | ruleHeaderDepth2Expression | ruleHeaderDepth3Expression | ruleHeaderDepth4Expression | ruleHeaderDepth5Expression | ruleHeaderDepth6Expression ) )=> (this_HeaderDepth1Expression_1= ruleHeaderDepth1Expression | this_HeaderDepth2Expression_2= ruleHeaderDepth2Expression | this_HeaderDepth3Expression_3= ruleHeaderDepth3Expression | this_HeaderDepth4Expression_4= ruleHeaderDepth4Expression | this_HeaderDepth5Expression_5= ruleHeaderDepth5Expression | this_HeaderDepth6Expression_6= ruleHeaderDepth6Expression ) ) )
            {
            // InternalHammilDSL.g:123:2: (this_TextualExpression_0= ruleTextualExpression | ( ( ( ruleHeaderDepth1Expression | ruleHeaderDepth2Expression | ruleHeaderDepth3Expression | ruleHeaderDepth4Expression | ruleHeaderDepth5Expression | ruleHeaderDepth6Expression ) )=> (this_HeaderDepth1Expression_1= ruleHeaderDepth1Expression | this_HeaderDepth2Expression_2= ruleHeaderDepth2Expression | this_HeaderDepth3Expression_3= ruleHeaderDepth3Expression | this_HeaderDepth4Expression_4= ruleHeaderDepth4Expression | this_HeaderDepth5Expression_5= ruleHeaderDepth5Expression | this_HeaderDepth6Expression_6= ruleHeaderDepth6Expression ) ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalHammilDSL.g:124:3: this_TextualExpression_0= ruleTextualExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getTextualExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TextualExpression_0=ruleTextualExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TextualExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalHammilDSL.g:133:3: ( ( ( ruleHeaderDepth1Expression | ruleHeaderDepth2Expression | ruleHeaderDepth3Expression | ruleHeaderDepth4Expression | ruleHeaderDepth5Expression | ruleHeaderDepth6Expression ) )=> (this_HeaderDepth1Expression_1= ruleHeaderDepth1Expression | this_HeaderDepth2Expression_2= ruleHeaderDepth2Expression | this_HeaderDepth3Expression_3= ruleHeaderDepth3Expression | this_HeaderDepth4Expression_4= ruleHeaderDepth4Expression | this_HeaderDepth5Expression_5= ruleHeaderDepth5Expression | this_HeaderDepth6Expression_6= ruleHeaderDepth6Expression ) )
                    {
                    // InternalHammilDSL.g:133:3: ( ( ( ruleHeaderDepth1Expression | ruleHeaderDepth2Expression | ruleHeaderDepth3Expression | ruleHeaderDepth4Expression | ruleHeaderDepth5Expression | ruleHeaderDepth6Expression ) )=> (this_HeaderDepth1Expression_1= ruleHeaderDepth1Expression | this_HeaderDepth2Expression_2= ruleHeaderDepth2Expression | this_HeaderDepth3Expression_3= ruleHeaderDepth3Expression | this_HeaderDepth4Expression_4= ruleHeaderDepth4Expression | this_HeaderDepth5Expression_5= ruleHeaderDepth5Expression | this_HeaderDepth6Expression_6= ruleHeaderDepth6Expression ) )
                    // InternalHammilDSL.g:134:4: ( ( ruleHeaderDepth1Expression | ruleHeaderDepth2Expression | ruleHeaderDepth3Expression | ruleHeaderDepth4Expression | ruleHeaderDepth5Expression | ruleHeaderDepth6Expression ) )=> (this_HeaderDepth1Expression_1= ruleHeaderDepth1Expression | this_HeaderDepth2Expression_2= ruleHeaderDepth2Expression | this_HeaderDepth3Expression_3= ruleHeaderDepth3Expression | this_HeaderDepth4Expression_4= ruleHeaderDepth4Expression | this_HeaderDepth5Expression_5= ruleHeaderDepth5Expression | this_HeaderDepth6Expression_6= ruleHeaderDepth6Expression )
                    {
                    // InternalHammilDSL.g:148:4: (this_HeaderDepth1Expression_1= ruleHeaderDepth1Expression | this_HeaderDepth2Expression_2= ruleHeaderDepth2Expression | this_HeaderDepth3Expression_3= ruleHeaderDepth3Expression | this_HeaderDepth4Expression_4= ruleHeaderDepth4Expression | this_HeaderDepth5Expression_5= ruleHeaderDepth5Expression | this_HeaderDepth6Expression_6= ruleHeaderDepth6Expression )
                    int alt2=6;
                    switch ( input.LA(1) ) {
                    case 15:
                        {
                        alt2=1;
                        }
                        break;
                    case RULE_STRING:
                        {
                        int LA2_2 = input.LA(2);

                        if ( (LA2_2==RULE_BL) ) {
                            int LA2_8 = input.LA(3);

                            if ( (LA2_8==16) ) {
                                alt2=1;
                            }
                            else if ( (LA2_8==18) ) {
                                alt2=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 8, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 17:
                        {
                        alt2=2;
                        }
                        break;
                    case 19:
                        {
                        alt2=3;
                        }
                        break;
                    case 22:
                        {
                        alt2=4;
                        }
                        break;
                    case 20:
                        {
                        alt2=5;
                        }
                        break;
                    case 21:
                        {
                        alt2=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }

                    switch (alt2) {
                        case 1 :
                            // InternalHammilDSL.g:149:5: this_HeaderDepth1Expression_1= ruleHeaderDepth1Expression
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getExpressionAccess().getHeaderDepth1ExpressionParserRuleCall_1_0_0());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_HeaderDepth1Expression_1=ruleHeaderDepth1Expression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current = this_HeaderDepth1Expression_1;
                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalHammilDSL.g:158:5: this_HeaderDepth2Expression_2= ruleHeaderDepth2Expression
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getExpressionAccess().getHeaderDepth2ExpressionParserRuleCall_1_0_1());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_HeaderDepth2Expression_2=ruleHeaderDepth2Expression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current = this_HeaderDepth2Expression_2;
                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;
                        case 3 :
                            // InternalHammilDSL.g:167:5: this_HeaderDepth3Expression_3= ruleHeaderDepth3Expression
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getExpressionAccess().getHeaderDepth3ExpressionParserRuleCall_1_0_2());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_HeaderDepth3Expression_3=ruleHeaderDepth3Expression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current = this_HeaderDepth3Expression_3;
                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;
                        case 4 :
                            // InternalHammilDSL.g:176:5: this_HeaderDepth4Expression_4= ruleHeaderDepth4Expression
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getExpressionAccess().getHeaderDepth4ExpressionParserRuleCall_1_0_3());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_HeaderDepth4Expression_4=ruleHeaderDepth4Expression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current = this_HeaderDepth4Expression_4;
                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;
                        case 5 :
                            // InternalHammilDSL.g:185:5: this_HeaderDepth5Expression_5= ruleHeaderDepth5Expression
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getExpressionAccess().getHeaderDepth5ExpressionParserRuleCall_1_0_4());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_HeaderDepth5Expression_5=ruleHeaderDepth5Expression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current = this_HeaderDepth5Expression_5;
                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;
                        case 6 :
                            // InternalHammilDSL.g:194:5: this_HeaderDepth6Expression_6= ruleHeaderDepth6Expression
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getExpressionAccess().getHeaderDepth6ExpressionParserRuleCall_1_0_5());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_HeaderDepth6Expression_6=ruleHeaderDepth6Expression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current = this_HeaderDepth6Expression_6;
                              					afterParserOrEnumRuleCall();
                              				
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
    // InternalHammilDSL.g:208:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // InternalHammilDSL.g:208:55: (iv_ruleTextExpression= ruleTextExpression EOF )
            // InternalHammilDSL.g:209:2: iv_ruleTextExpression= ruleTextExpression EOF
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
    // InternalHammilDSL.g:215:1: ruleTextExpression returns [EObject current=null] : this_TextualExpression_0= ruleTextualExpression ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TextualExpression_0 = null;



        	enterRule();

        try {
            // InternalHammilDSL.g:221:2: (this_TextualExpression_0= ruleTextualExpression )
            // InternalHammilDSL.g:222:2: this_TextualExpression_0= ruleTextualExpression
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getTextExpressionAccess().getTextualExpressionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_TextualExpression_0=ruleTextualExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_TextualExpression_0;
              		afterParserOrEnumRuleCall();
              	
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


    // $ANTLR start "entryRuleEmphasisExpression"
    // InternalHammilDSL.g:233:1: entryRuleEmphasisExpression returns [EObject current=null] : iv_ruleEmphasisExpression= ruleEmphasisExpression EOF ;
    public final EObject entryRuleEmphasisExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmphasisExpression = null;


        try {
            // InternalHammilDSL.g:233:59: (iv_ruleEmphasisExpression= ruleEmphasisExpression EOF )
            // InternalHammilDSL.g:234:2: iv_ruleEmphasisExpression= ruleEmphasisExpression EOF
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
    // InternalHammilDSL.g:240:1: ruleEmphasisExpression returns [EObject current=null] : this_TextualExpression_0= ruleTextualExpression ;
    public final EObject ruleEmphasisExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TextualExpression_0 = null;



        	enterRule();

        try {
            // InternalHammilDSL.g:246:2: (this_TextualExpression_0= ruleTextualExpression )
            // InternalHammilDSL.g:247:2: this_TextualExpression_0= ruleTextualExpression
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getTextualExpressionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_TextualExpression_0=ruleTextualExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_TextualExpression_0;
              		afterParserOrEnumRuleCall();
              	
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
    // $ANTLR end "ruleEmphasisExpression"


    // $ANTLR start "entryRuleHeaderDepth1Expression"
    // InternalHammilDSL.g:258:1: entryRuleHeaderDepth1Expression returns [EObject current=null] : iv_ruleHeaderDepth1Expression= ruleHeaderDepth1Expression EOF ;
    public final EObject entryRuleHeaderDepth1Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderDepth1Expression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:260:2: (iv_ruleHeaderDepth1Expression= ruleHeaderDepth1Expression EOF )
            // InternalHammilDSL.g:261:2: iv_ruleHeaderDepth1Expression= ruleHeaderDepth1Expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHeaderDepth1ExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHeaderDepth1Expression=ruleHeaderDepth1Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHeaderDepth1Expression; 
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
    // $ANTLR end "entryRuleHeaderDepth1Expression"


    // $ANTLR start "ruleHeaderDepth1Expression"
    // InternalHammilDSL.g:270:1: ruleHeaderDepth1Expression returns [EObject current=null] : ( ( ( ( '#' )=>otherlv_0= '#' ) ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '=' )+ (this_BL_7= RULE_BL )? ) ) ;
    public final EObject ruleHeaderDepth1Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_BL_3=null;
        Token this_BL_5=null;
        Token otherlv_6=null;
        Token this_BL_7=null;
        EObject lv_title_1_0 = null;

        EObject lv_title_4_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:277:2: ( ( ( ( ( '#' )=>otherlv_0= '#' ) ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '=' )+ (this_BL_7= RULE_BL )? ) ) )
            // InternalHammilDSL.g:278:2: ( ( ( ( '#' )=>otherlv_0= '#' ) ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '=' )+ (this_BL_7= RULE_BL )? ) )
            {
            // InternalHammilDSL.g:278:2: ( ( ( ( '#' )=>otherlv_0= '#' ) ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '=' )+ (this_BL_7= RULE_BL )? ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) && (synpred2_InternalHammilDSL())) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRING) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalHammilDSL.g:279:3: ( ( ( '#' )=>otherlv_0= '#' ) ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
                    {
                    // InternalHammilDSL.g:279:3: ( ( ( '#' )=>otherlv_0= '#' ) ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
                    // InternalHammilDSL.g:280:4: ( ( '#' )=>otherlv_0= '#' ) ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )?
                    {
                    // InternalHammilDSL.g:280:4: ( ( '#' )=>otherlv_0= '#' )
                    // InternalHammilDSL.g:281:5: ( '#' )=>otherlv_0= '#'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_0, grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0_0());
                      				
                    }

                    }

                    // InternalHammilDSL.g:287:4: ( (lv_title_1_0= ruleEmphasisExpression ) )
                    // InternalHammilDSL.g:288:5: (lv_title_1_0= ruleEmphasisExpression )
                    {
                    // InternalHammilDSL.g:288:5: (lv_title_1_0= ruleEmphasisExpression )
                    // InternalHammilDSL.g:289:6: lv_title_1_0= ruleEmphasisExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_5);
                    lv_title_1_0=ruleEmphasisExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getHeaderDepth1ExpressionRule());
                      						}
                      						set(
                      							current,
                      							"title",
                      							lv_title_1_0,
                      							"org.xtext.markHammil.mh.HammilDSL.EmphasisExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalHammilDSL.g:306:4: (otherlv_2= '#' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            int LA4_2 = input.LA(2);

                            if ( (LA4_2==EOF||(LA4_2>=RULE_BL && LA4_2<=RULE_STRING)||LA4_2==15||LA4_2==17||(LA4_2>=19 && LA4_2<=22)) ) {
                                alt4=1;
                            }


                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalHammilDSL.g:307:5: otherlv_2= '#'
                    	    {
                    	    otherlv_2=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0_2());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // InternalHammilDSL.g:312:4: (this_BL_3= RULE_BL )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_BL) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalHammilDSL.g:313:5: this_BL_3= RULE_BL
                            {
                            this_BL_3=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_BL_3, grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_0_3());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHammilDSL.g:320:3: ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '=' )+ (this_BL_7= RULE_BL )? )
                    {
                    // InternalHammilDSL.g:320:3: ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '=' )+ (this_BL_7= RULE_BL )? )
                    // InternalHammilDSL.g:321:4: ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '=' )+ (this_BL_7= RULE_BL )?
                    {
                    // InternalHammilDSL.g:321:4: ( (lv_title_4_0= ruleEmphasisExpression ) )
                    // InternalHammilDSL.g:322:5: (lv_title_4_0= ruleEmphasisExpression )
                    {
                    // InternalHammilDSL.g:322:5: (lv_title_4_0= ruleEmphasisExpression )
                    // InternalHammilDSL.g:323:6: lv_title_4_0= ruleEmphasisExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_title_4_0=ruleEmphasisExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getHeaderDepth1ExpressionRule());
                      						}
                      						set(
                      							current,
                      							"title",
                      							lv_title_4_0,
                      							"org.xtext.markHammil.mh.HammilDSL.EmphasisExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    this_BL_5=(Token)match(input,RULE_BL,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BL_5, grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_1_1());
                      			
                    }
                    // InternalHammilDSL.g:344:4: (otherlv_6= '=' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==16) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalHammilDSL.g:345:5: otherlv_6= '='
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getHeaderDepth1ExpressionAccess().getEqualsSignKeyword_1_2());
                    	      				
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

                    // InternalHammilDSL.g:350:4: (this_BL_7= RULE_BL )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_BL) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalHammilDSL.g:351:5: this_BL_7= RULE_BL
                            {
                            this_BL_7=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_BL_7, grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_1_3());
                              				
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
    // $ANTLR end "ruleHeaderDepth1Expression"


    // $ANTLR start "entryRuleHeaderDepth2Expression"
    // InternalHammilDSL.g:364:1: entryRuleHeaderDepth2Expression returns [EObject current=null] : iv_ruleHeaderDepth2Expression= ruleHeaderDepth2Expression EOF ;
    public final EObject entryRuleHeaderDepth2Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderDepth2Expression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:366:2: (iv_ruleHeaderDepth2Expression= ruleHeaderDepth2Expression EOF )
            // InternalHammilDSL.g:367:2: iv_ruleHeaderDepth2Expression= ruleHeaderDepth2Expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHeaderDepth2ExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHeaderDepth2Expression=ruleHeaderDepth2Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHeaderDepth2Expression; 
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
    // $ANTLR end "entryRuleHeaderDepth2Expression"


    // $ANTLR start "ruleHeaderDepth2Expression"
    // InternalHammilDSL.g:376:1: ruleHeaderDepth2Expression returns [EObject current=null] : ( ( ( ( '##' )=>otherlv_0= '##' ) ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '-' )+ (this_BL_7= RULE_BL )? ) ) ;
    public final EObject ruleHeaderDepth2Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_BL_3=null;
        Token this_BL_5=null;
        Token otherlv_6=null;
        Token this_BL_7=null;
        EObject lv_title_1_0 = null;

        EObject lv_title_4_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:383:2: ( ( ( ( ( '##' )=>otherlv_0= '##' ) ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '-' )+ (this_BL_7= RULE_BL )? ) ) )
            // InternalHammilDSL.g:384:2: ( ( ( ( '##' )=>otherlv_0= '##' ) ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '-' )+ (this_BL_7= RULE_BL )? ) )
            {
            // InternalHammilDSL.g:384:2: ( ( ( ( '##' )=>otherlv_0= '##' ) ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '-' )+ (this_BL_7= RULE_BL )? ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) && (synpred3_InternalHammilDSL())) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_STRING) ) {
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
                    // InternalHammilDSL.g:385:3: ( ( ( '##' )=>otherlv_0= '##' ) ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
                    {
                    // InternalHammilDSL.g:385:3: ( ( ( '##' )=>otherlv_0= '##' ) ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
                    // InternalHammilDSL.g:386:4: ( ( '##' )=>otherlv_0= '##' ) ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )?
                    {
                    // InternalHammilDSL.g:386:4: ( ( '##' )=>otherlv_0= '##' )
                    // InternalHammilDSL.g:387:5: ( '##' )=>otherlv_0= '##'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_0, grammarAccess.getHeaderDepth2ExpressionAccess().getNumberSignNumberSignKeyword_0_0());
                      				
                    }

                    }

                    // InternalHammilDSL.g:393:4: ( (lv_title_1_0= ruleEmphasisExpression ) )
                    // InternalHammilDSL.g:394:5: (lv_title_1_0= ruleEmphasisExpression )
                    {
                    // InternalHammilDSL.g:394:5: (lv_title_1_0= ruleEmphasisExpression )
                    // InternalHammilDSL.g:395:6: lv_title_1_0= ruleEmphasisExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_5);
                    lv_title_1_0=ruleEmphasisExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getHeaderDepth2ExpressionRule());
                      						}
                      						set(
                      							current,
                      							"title",
                      							lv_title_1_0,
                      							"org.xtext.markHammil.mh.HammilDSL.EmphasisExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalHammilDSL.g:412:4: (otherlv_2= '#' )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==15) ) {
                            int LA9_2 = input.LA(2);

                            if ( (LA9_2==EOF||(LA9_2>=RULE_BL && LA9_2<=RULE_STRING)||LA9_2==15||LA9_2==17||(LA9_2>=19 && LA9_2<=22)) ) {
                                alt9=1;
                            }


                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalHammilDSL.g:413:5: otherlv_2= '#'
                    	    {
                    	    otherlv_2=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getHeaderDepth2ExpressionAccess().getNumberSignKeyword_0_2());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    // InternalHammilDSL.g:418:4: (this_BL_3= RULE_BL )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_BL) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalHammilDSL.g:419:5: this_BL_3= RULE_BL
                            {
                            this_BL_3=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_BL_3, grammarAccess.getHeaderDepth2ExpressionAccess().getBLTerminalRuleCall_0_3());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHammilDSL.g:426:3: ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '-' )+ (this_BL_7= RULE_BL )? )
                    {
                    // InternalHammilDSL.g:426:3: ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '-' )+ (this_BL_7= RULE_BL )? )
                    // InternalHammilDSL.g:427:4: ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '-' )+ (this_BL_7= RULE_BL )?
                    {
                    // InternalHammilDSL.g:427:4: ( (lv_title_4_0= ruleEmphasisExpression ) )
                    // InternalHammilDSL.g:428:5: (lv_title_4_0= ruleEmphasisExpression )
                    {
                    // InternalHammilDSL.g:428:5: (lv_title_4_0= ruleEmphasisExpression )
                    // InternalHammilDSL.g:429:6: lv_title_4_0= ruleEmphasisExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_title_4_0=ruleEmphasisExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getHeaderDepth2ExpressionRule());
                      						}
                      						set(
                      							current,
                      							"title",
                      							lv_title_4_0,
                      							"org.xtext.markHammil.mh.HammilDSL.EmphasisExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    this_BL_5=(Token)match(input,RULE_BL,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BL_5, grammarAccess.getHeaderDepth2ExpressionAccess().getBLTerminalRuleCall_1_1());
                      			
                    }
                    // InternalHammilDSL.g:450:4: (otherlv_6= '-' )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==18) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalHammilDSL.g:451:5: otherlv_6= '-'
                    	    {
                    	    otherlv_6=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getHeaderDepth2ExpressionAccess().getHyphenMinusKeyword_1_2());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    // InternalHammilDSL.g:456:4: (this_BL_7= RULE_BL )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_BL) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalHammilDSL.g:457:5: this_BL_7= RULE_BL
                            {
                            this_BL_7=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_BL_7, grammarAccess.getHeaderDepth2ExpressionAccess().getBLTerminalRuleCall_1_3());
                              				
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
    // $ANTLR end "ruleHeaderDepth2Expression"


    // $ANTLR start "entryRuleHeaderDepth3Expression"
    // InternalHammilDSL.g:470:1: entryRuleHeaderDepth3Expression returns [EObject current=null] : iv_ruleHeaderDepth3Expression= ruleHeaderDepth3Expression EOF ;
    public final EObject entryRuleHeaderDepth3Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderDepth3Expression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:472:2: (iv_ruleHeaderDepth3Expression= ruleHeaderDepth3Expression EOF )
            // InternalHammilDSL.g:473:2: iv_ruleHeaderDepth3Expression= ruleHeaderDepth3Expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHeaderDepth3ExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHeaderDepth3Expression=ruleHeaderDepth3Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHeaderDepth3Expression; 
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
    // $ANTLR end "entryRuleHeaderDepth3Expression"


    // $ANTLR start "ruleHeaderDepth3Expression"
    // InternalHammilDSL.g:482:1: ruleHeaderDepth3Expression returns [EObject current=null] : (otherlv_0= '###' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) ;
    public final EObject ruleHeaderDepth3Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_BL_3=null;
        EObject lv_title_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:489:2: ( (otherlv_0= '###' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) )
            // InternalHammilDSL.g:490:2: (otherlv_0= '###' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            {
            // InternalHammilDSL.g:490:2: (otherlv_0= '###' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            // InternalHammilDSL.g:491:3: otherlv_0= '###' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getHeaderDepth3ExpressionAccess().getNumberSignNumberSignNumberSignKeyword_0());
              		
            }
            // InternalHammilDSL.g:495:3: ( (lv_title_1_0= ruleEmphasisExpression ) )
            // InternalHammilDSL.g:496:4: (lv_title_1_0= ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:496:4: (lv_title_1_0= ruleEmphasisExpression )
            // InternalHammilDSL.g:497:5: lv_title_1_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeaderDepth3ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_title_1_0=ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getHeaderDepth3ExpressionRule());
              					}
              					set(
              						current,
              						"title",
              						lv_title_1_0,
              						"org.xtext.markHammil.mh.HammilDSL.EmphasisExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalHammilDSL.g:514:3: (otherlv_2= '#' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    int LA14_2 = input.LA(2);

                    if ( (LA14_2==EOF||LA14_2==RULE_BL) ) {
                        alt14=1;
                    }
                    else if ( (LA14_2==RULE_STRING||LA14_2==15||LA14_2==17||(LA14_2>=19 && LA14_2<=22)) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalHammilDSL.g:515:4: otherlv_2= '#'
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getHeaderDepth3ExpressionAccess().getNumberSignKeyword_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalHammilDSL.g:520:3: (this_BL_3= RULE_BL )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_BL) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalHammilDSL.g:521:4: this_BL_3= RULE_BL
                    {
                    this_BL_3=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BL_3, grammarAccess.getHeaderDepth3ExpressionAccess().getBLTerminalRuleCall_3());
                      			
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleHeaderDepth3Expression"


    // $ANTLR start "entryRuleHeaderDepth5Expression"
    // InternalHammilDSL.g:533:1: entryRuleHeaderDepth5Expression returns [EObject current=null] : iv_ruleHeaderDepth5Expression= ruleHeaderDepth5Expression EOF ;
    public final EObject entryRuleHeaderDepth5Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderDepth5Expression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:535:2: (iv_ruleHeaderDepth5Expression= ruleHeaderDepth5Expression EOF )
            // InternalHammilDSL.g:536:2: iv_ruleHeaderDepth5Expression= ruleHeaderDepth5Expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHeaderDepth5ExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHeaderDepth5Expression=ruleHeaderDepth5Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHeaderDepth5Expression; 
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
    // $ANTLR end "entryRuleHeaderDepth5Expression"


    // $ANTLR start "ruleHeaderDepth5Expression"
    // InternalHammilDSL.g:545:1: ruleHeaderDepth5Expression returns [EObject current=null] : (otherlv_0= '#####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) ;
    public final EObject ruleHeaderDepth5Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_BL_3=null;
        EObject lv_title_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:552:2: ( (otherlv_0= '#####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) )
            // InternalHammilDSL.g:553:2: (otherlv_0= '#####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            {
            // InternalHammilDSL.g:553:2: (otherlv_0= '#####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            // InternalHammilDSL.g:554:3: otherlv_0= '#####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getHeaderDepth5ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_0());
              		
            }
            // InternalHammilDSL.g:558:3: ( (lv_title_1_0= ruleEmphasisExpression ) )
            // InternalHammilDSL.g:559:4: (lv_title_1_0= ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:559:4: (lv_title_1_0= ruleEmphasisExpression )
            // InternalHammilDSL.g:560:5: lv_title_1_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeaderDepth5ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_title_1_0=ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getHeaderDepth5ExpressionRule());
              					}
              					set(
              						current,
              						"title",
              						lv_title_1_0,
              						"org.xtext.markHammil.mh.HammilDSL.EmphasisExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalHammilDSL.g:577:3: (otherlv_2= '#' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==15) ) {
                    int LA16_2 = input.LA(2);

                    if ( (LA16_2==EOF||(LA16_2>=RULE_BL && LA16_2<=RULE_STRING)||LA16_2==15||LA16_2==17||(LA16_2>=19 && LA16_2<=22)) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // InternalHammilDSL.g:578:4: otherlv_2= '#'
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getHeaderDepth5ExpressionAccess().getNumberSignKeyword_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalHammilDSL.g:583:3: (this_BL_3= RULE_BL )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_BL) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalHammilDSL.g:584:4: this_BL_3= RULE_BL
                    {
                    this_BL_3=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BL_3, grammarAccess.getHeaderDepth5ExpressionAccess().getBLTerminalRuleCall_3());
                      			
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleHeaderDepth5Expression"


    // $ANTLR start "entryRuleHeaderDepth6Expression"
    // InternalHammilDSL.g:596:1: entryRuleHeaderDepth6Expression returns [EObject current=null] : iv_ruleHeaderDepth6Expression= ruleHeaderDepth6Expression EOF ;
    public final EObject entryRuleHeaderDepth6Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderDepth6Expression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:598:2: (iv_ruleHeaderDepth6Expression= ruleHeaderDepth6Expression EOF )
            // InternalHammilDSL.g:599:2: iv_ruleHeaderDepth6Expression= ruleHeaderDepth6Expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHeaderDepth6ExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHeaderDepth6Expression=ruleHeaderDepth6Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHeaderDepth6Expression; 
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
    // $ANTLR end "entryRuleHeaderDepth6Expression"


    // $ANTLR start "ruleHeaderDepth6Expression"
    // InternalHammilDSL.g:608:1: ruleHeaderDepth6Expression returns [EObject current=null] : (otherlv_0= '######' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) ;
    public final EObject ruleHeaderDepth6Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_BL_3=null;
        EObject lv_title_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:615:2: ( (otherlv_0= '######' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) )
            // InternalHammilDSL.g:616:2: (otherlv_0= '######' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            {
            // InternalHammilDSL.g:616:2: (otherlv_0= '######' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            // InternalHammilDSL.g:617:3: otherlv_0= '######' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getHeaderDepth6ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_0());
              		
            }
            // InternalHammilDSL.g:621:3: ( (lv_title_1_0= ruleEmphasisExpression ) )
            // InternalHammilDSL.g:622:4: (lv_title_1_0= ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:622:4: (lv_title_1_0= ruleEmphasisExpression )
            // InternalHammilDSL.g:623:5: lv_title_1_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeaderDepth6ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_title_1_0=ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getHeaderDepth6ExpressionRule());
              					}
              					set(
              						current,
              						"title",
              						lv_title_1_0,
              						"org.xtext.markHammil.mh.HammilDSL.EmphasisExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalHammilDSL.g:640:3: (otherlv_2= '#' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==15) ) {
                    int LA18_2 = input.LA(2);

                    if ( (LA18_2==EOF||LA18_2==RULE_BL) ) {
                        alt18=1;
                    }
                    else if ( (LA18_2==RULE_STRING||LA18_2==15||LA18_2==17||(LA18_2>=19 && LA18_2<=22)) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // InternalHammilDSL.g:641:4: otherlv_2= '#'
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getHeaderDepth6ExpressionAccess().getNumberSignKeyword_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalHammilDSL.g:646:3: (this_BL_3= RULE_BL )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_BL) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalHammilDSL.g:647:4: this_BL_3= RULE_BL
                    {
                    this_BL_3=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BL_3, grammarAccess.getHeaderDepth6ExpressionAccess().getBLTerminalRuleCall_3());
                      			
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleHeaderDepth6Expression"


    // $ANTLR start "entryRuleHeaderDepth4Expression"
    // InternalHammilDSL.g:659:1: entryRuleHeaderDepth4Expression returns [EObject current=null] : iv_ruleHeaderDepth4Expression= ruleHeaderDepth4Expression EOF ;
    public final EObject entryRuleHeaderDepth4Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderDepth4Expression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:661:2: (iv_ruleHeaderDepth4Expression= ruleHeaderDepth4Expression EOF )
            // InternalHammilDSL.g:662:2: iv_ruleHeaderDepth4Expression= ruleHeaderDepth4Expression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHeaderDepth4ExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHeaderDepth4Expression=ruleHeaderDepth4Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHeaderDepth4Expression; 
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
    // $ANTLR end "entryRuleHeaderDepth4Expression"


    // $ANTLR start "ruleHeaderDepth4Expression"
    // InternalHammilDSL.g:671:1: ruleHeaderDepth4Expression returns [EObject current=null] : (otherlv_0= '####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) ;
    public final EObject ruleHeaderDepth4Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_BL_3=null;
        EObject lv_title_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:678:2: ( (otherlv_0= '####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) )
            // InternalHammilDSL.g:679:2: (otherlv_0= '####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            {
            // InternalHammilDSL.g:679:2: (otherlv_0= '####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            // InternalHammilDSL.g:680:3: otherlv_0= '####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getHeaderDepth4ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignKeyword_0());
              		
            }
            // InternalHammilDSL.g:684:3: ( (lv_title_1_0= ruleEmphasisExpression ) )
            // InternalHammilDSL.g:685:4: (lv_title_1_0= ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:685:4: (lv_title_1_0= ruleEmphasisExpression )
            // InternalHammilDSL.g:686:5: lv_title_1_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeaderDepth4ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_title_1_0=ruleEmphasisExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getHeaderDepth4ExpressionRule());
              					}
              					set(
              						current,
              						"title",
              						lv_title_1_0,
              						"org.xtext.markHammil.mh.HammilDSL.EmphasisExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalHammilDSL.g:703:3: (otherlv_2= '#' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==15) ) {
                    int LA20_2 = input.LA(2);

                    if ( (LA20_2==EOF||(LA20_2>=RULE_BL && LA20_2<=RULE_STRING)||LA20_2==15||LA20_2==17||(LA20_2>=19 && LA20_2<=22)) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // InternalHammilDSL.g:704:4: otherlv_2= '#'
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getHeaderDepth4ExpressionAccess().getNumberSignKeyword_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // InternalHammilDSL.g:709:3: (this_BL_3= RULE_BL )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_BL) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalHammilDSL.g:710:4: this_BL_3= RULE_BL
                    {
                    this_BL_3=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BL_3, grammarAccess.getHeaderDepth4ExpressionAccess().getBLTerminalRuleCall_3());
                      			
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleHeaderDepth4Expression"


    // $ANTLR start "entryRuleTextualExpression"
    // InternalHammilDSL.g:722:1: entryRuleTextualExpression returns [EObject current=null] : iv_ruleTextualExpression= ruleTextualExpression EOF ;
    public final EObject entryRuleTextualExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextualExpression = null;


        try {
            // InternalHammilDSL.g:722:58: (iv_ruleTextualExpression= ruleTextualExpression EOF )
            // InternalHammilDSL.g:723:2: iv_ruleTextualExpression= ruleTextualExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextualExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTextualExpression=ruleTextualExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextualExpression; 
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
    // $ANTLR end "entryRuleTextualExpression"


    // $ANTLR start "ruleTextualExpression"
    // InternalHammilDSL.g:729:1: ruleTextualExpression returns [EObject current=null] : ( (lv_contentString_0_0= ruleString0 ) ) ;
    public final EObject ruleTextualExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_contentString_0_0 = null;



        	enterRule();

        try {
            // InternalHammilDSL.g:735:2: ( ( (lv_contentString_0_0= ruleString0 ) ) )
            // InternalHammilDSL.g:736:2: ( (lv_contentString_0_0= ruleString0 ) )
            {
            // InternalHammilDSL.g:736:2: ( (lv_contentString_0_0= ruleString0 ) )
            // InternalHammilDSL.g:737:3: (lv_contentString_0_0= ruleString0 )
            {
            // InternalHammilDSL.g:737:3: (lv_contentString_0_0= ruleString0 )
            // InternalHammilDSL.g:738:4: lv_contentString_0_0= ruleString0
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getTextualExpressionAccess().getContentStringString0ParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_contentString_0_0=ruleString0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getTextualExpressionRule());
              				}
              				set(
              					current,
              					"contentString",
              					lv_contentString_0_0,
              					"org.xtext.markHammil.mh.HammilDSL.String0");
              				afterParserOrEnumRuleCall();
              			
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
    // $ANTLR end "ruleTextualExpression"


    // $ANTLR start "entryRuleString0"
    // InternalHammilDSL.g:758:1: entryRuleString0 returns [String current=null] : iv_ruleString0= ruleString0 EOF ;
    public final String entryRuleString0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleString0 = null;


        try {
            // InternalHammilDSL.g:758:47: (iv_ruleString0= ruleString0 EOF )
            // InternalHammilDSL.g:759:2: iv_ruleString0= ruleString0 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getString0Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleString0=ruleString0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleString0.getText(); 
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
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // InternalHammilDSL.g:765:1: ruleString0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleString0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalHammilDSL.g:771:2: (this_STRING_0= RULE_STRING )
            // InternalHammilDSL.g:772:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_STRING_0, grammarAccess.getString0Access().getSTRINGTerminalRuleCall());
              	
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
    // $ANTLR end "ruleString0"

    // $ANTLR start synpred1_InternalHammilDSL
    public final void synpred1_InternalHammilDSL_fragment() throws RecognitionException {   
        // InternalHammilDSL.g:134:4: ( ( ruleHeaderDepth1Expression | ruleHeaderDepth2Expression | ruleHeaderDepth3Expression | ruleHeaderDepth4Expression | ruleHeaderDepth5Expression | ruleHeaderDepth6Expression ) )
        // InternalHammilDSL.g:134:5: ( ruleHeaderDepth1Expression | ruleHeaderDepth2Expression | ruleHeaderDepth3Expression | ruleHeaderDepth4Expression | ruleHeaderDepth5Expression | ruleHeaderDepth6Expression )
        {
        // InternalHammilDSL.g:134:5: ( ruleHeaderDepth1Expression | ruleHeaderDepth2Expression | ruleHeaderDepth3Expression | ruleHeaderDepth4Expression | ruleHeaderDepth5Expression | ruleHeaderDepth6Expression )
        int alt22=6;
        switch ( input.LA(1) ) {
        case 15:
            {
            alt22=1;
            }
            break;
        case RULE_STRING:
            {
            int LA22_2 = input.LA(2);

            if ( (LA22_2==RULE_BL) ) {
                int LA22_8 = input.LA(3);

                if ( (LA22_8==18) ) {
                    alt22=2;
                }
                else if ( (LA22_8==16) ) {
                    alt22=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 8, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 2, input);

                throw nvae;
            }
            }
            break;
        case 17:
            {
            alt22=2;
            }
            break;
        case 19:
            {
            alt22=3;
            }
            break;
        case 22:
            {
            alt22=4;
            }
            break;
        case 20:
            {
            alt22=5;
            }
            break;
        case 21:
            {
            alt22=6;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 22, 0, input);

            throw nvae;
        }

        switch (alt22) {
            case 1 :
                // InternalHammilDSL.g:135:5: ruleHeaderDepth1Expression
                {
                pushFollow(FOLLOW_2);
                ruleHeaderDepth1Expression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalHammilDSL.g:137:5: ruleHeaderDepth2Expression
                {
                pushFollow(FOLLOW_2);
                ruleHeaderDepth2Expression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 3 :
                // InternalHammilDSL.g:139:5: ruleHeaderDepth3Expression
                {
                pushFollow(FOLLOW_2);
                ruleHeaderDepth3Expression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 4 :
                // InternalHammilDSL.g:141:5: ruleHeaderDepth4Expression
                {
                pushFollow(FOLLOW_2);
                ruleHeaderDepth4Expression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 5 :
                // InternalHammilDSL.g:143:5: ruleHeaderDepth5Expression
                {
                pushFollow(FOLLOW_2);
                ruleHeaderDepth5Expression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 6 :
                // InternalHammilDSL.g:145:5: ruleHeaderDepth6Expression
                {
                pushFollow(FOLLOW_2);
                ruleHeaderDepth6Expression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred1_InternalHammilDSL

    // $ANTLR start synpred2_InternalHammilDSL
    public final void synpred2_InternalHammilDSL_fragment() throws RecognitionException {   
        // InternalHammilDSL.g:281:5: ( '#' )
        // InternalHammilDSL.g:281:6: '#'
        {
        match(input,15,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalHammilDSL

    // $ANTLR start synpred3_InternalHammilDSL
    public final void synpred3_InternalHammilDSL_fragment() throws RecognitionException {   
        // InternalHammilDSL.g:387:5: ( '##' )
        // InternalHammilDSL.g:387:6: '##'
        {
        match(input,17,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalHammilDSL

    // Delegated rules

    public final boolean synpred1_InternalHammilDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalHammilDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalHammilDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalHammilDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalHammilDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalHammilDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\uffff\1\10\10\uffff";
    static final String dfa_3s = "\1\5\1\4\10\uffff";
    static final String dfa_4s = "\2\26\10\uffff";
    static final String dfa_5s = "\2\uffff\6\2\1\1\1\2";
    static final String dfa_6s = "\1\0\1\1\10\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\11\uffff\1\2\1\uffff\1\3\1\uffff\1\4\1\6\1\7\1\5",
            "\1\11\1\10\11\uffff\1\10\1\uffff\1\10\1\uffff\4\10",
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
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "123:2: (this_TextualExpression_0= ruleTextualExpression | ( ( ( ruleHeaderDepth1Expression | ruleHeaderDepth2Expression | ruleHeaderDepth3Expression | ruleHeaderDepth4Expression | ruleHeaderDepth5Expression | ruleHeaderDepth6Expression ) )=> (this_HeaderDepth1Expression_1= ruleHeaderDepth1Expression | this_HeaderDepth2Expression_2= ruleHeaderDepth2Expression | this_HeaderDepth3Expression_3= ruleHeaderDepth3Expression | this_HeaderDepth4Expression_4= ruleHeaderDepth4Expression | this_HeaderDepth5Expression_5= ruleHeaderDepth5Expression | this_HeaderDepth6Expression_6= ruleHeaderDepth6Expression ) ) )";
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
                        if ( (LA3_0==RULE_STRING) ) {s = 1;}

                        else if ( (LA3_0==15) && (synpred1_InternalHammilDSL())) {s = 2;}

                        else if ( (LA3_0==17) && (synpred1_InternalHammilDSL())) {s = 3;}

                        else if ( (LA3_0==19) && (synpred1_InternalHammilDSL())) {s = 4;}

                        else if ( (LA3_0==22) && (synpred1_InternalHammilDSL())) {s = 5;}

                        else if ( (LA3_0==20) && (synpred1_InternalHammilDSL())) {s = 6;}

                        else if ( (LA3_0==21) && (synpred1_InternalHammilDSL())) {s = 7;}

                         
                        input.seek(index3_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA3_1 = input.LA(1);

                         
                        int index3_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA3_1==EOF||LA3_1==RULE_STRING||LA3_1==15||LA3_1==17||(LA3_1>=19 && LA3_1<=22)) ) {s = 8;}

                        else if ( (LA3_1==RULE_BL) && (synpred1_InternalHammilDSL())) {s = 9;}

                         
                        input.seek(index3_1);
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
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000007A8022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040012L});

}