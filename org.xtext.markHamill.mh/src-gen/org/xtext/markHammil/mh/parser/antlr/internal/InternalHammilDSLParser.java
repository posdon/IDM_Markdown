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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BL", "RULE_S", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'-'", "'*'", "'_'", "'>'", "'`'", "'```'", "'#'", "'='", "'##'", "'###'", "'#####'", "'######'", "'####'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__9=9;
    public static final int RULE_S=5;
    public static final int RULE_BL=4;
    public static final int RULE_ML_COMMENT=7;
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

                if ( (LA1_0==RULE_STRING||(LA1_0>=9 && LA1_0<=15)||(LA1_0>=17 && LA1_0<=21)) ) {
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



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalHammilDSL.g:111:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalHammilDSL.g:112:2: iv_ruleExpression= ruleExpression EOF
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalHammilDSL.g:121:1: ruleExpression returns [EObject current=null] : ( ( ( ( ruleHeaderDepth1Expression )=>this_HeaderDepth1Expression_0= ruleHeaderDepth1Expression ) | this_HeaderDepth2Expression_1= ruleHeaderDepth2Expression | this_HeaderDepth3Expression_2= ruleHeaderDepth3Expression | this_HeaderDepth4Expression_3= ruleHeaderDepth4Expression | this_HeaderDepth5Expression_4= ruleHeaderDepth5Expression | this_HeaderDepth6Expression_5= ruleHeaderDepth6Expression ) | this_TextExpression_6= ruleTextExpression | this_CodeExpression_7= ruleCodeExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_HeaderDepth1Expression_0 = null;

        EObject this_HeaderDepth2Expression_1 = null;

        EObject this_HeaderDepth3Expression_2 = null;

        EObject this_HeaderDepth4Expression_3 = null;

        EObject this_HeaderDepth5Expression_4 = null;

        EObject this_HeaderDepth6Expression_5 = null;

        EObject this_TextExpression_6 = null;

        EObject this_CodeExpression_7 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalHammilDSL.g:128:2: ( ( ( ( ( ruleHeaderDepth1Expression )=>this_HeaderDepth1Expression_0= ruleHeaderDepth1Expression ) | this_HeaderDepth2Expression_1= ruleHeaderDepth2Expression | this_HeaderDepth3Expression_2= ruleHeaderDepth3Expression | this_HeaderDepth4Expression_3= ruleHeaderDepth4Expression | this_HeaderDepth5Expression_4= ruleHeaderDepth5Expression | this_HeaderDepth6Expression_5= ruleHeaderDepth6Expression ) | this_TextExpression_6= ruleTextExpression | this_CodeExpression_7= ruleCodeExpression ) )
            // InternalHammilDSL.g:129:2: ( ( ( ( ruleHeaderDepth1Expression )=>this_HeaderDepth1Expression_0= ruleHeaderDepth1Expression ) | this_HeaderDepth2Expression_1= ruleHeaderDepth2Expression | this_HeaderDepth3Expression_2= ruleHeaderDepth3Expression | this_HeaderDepth4Expression_3= ruleHeaderDepth4Expression | this_HeaderDepth5Expression_4= ruleHeaderDepth5Expression | this_HeaderDepth6Expression_5= ruleHeaderDepth6Expression ) | this_TextExpression_6= ruleTextExpression | this_CodeExpression_7= ruleCodeExpression )
            {
            // InternalHammilDSL.g:129:2: ( ( ( ( ruleHeaderDepth1Expression )=>this_HeaderDepth1Expression_0= ruleHeaderDepth1Expression ) | this_HeaderDepth2Expression_1= ruleHeaderDepth2Expression | this_HeaderDepth3Expression_2= ruleHeaderDepth3Expression | this_HeaderDepth4Expression_3= ruleHeaderDepth4Expression | this_HeaderDepth5Expression_4= ruleHeaderDepth5Expression | this_HeaderDepth6Expression_5= ruleHeaderDepth6Expression ) | this_TextExpression_6= ruleTextExpression | this_CodeExpression_7= ruleCodeExpression )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 15:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                {
                alt3=1;
                }
                break;
            case RULE_STRING:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==RULE_BL) ) {
                    alt3=1;
                }
                else if ( (LA3_2==EOF||LA3_2==RULE_STRING||(LA3_2>=9 && LA3_2<=15)||(LA3_2>=17 && LA3_2<=21)) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
            case 14:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalHammilDSL.g:130:3: ( ( ( ruleHeaderDepth1Expression )=>this_HeaderDepth1Expression_0= ruleHeaderDepth1Expression ) | this_HeaderDepth2Expression_1= ruleHeaderDepth2Expression | this_HeaderDepth3Expression_2= ruleHeaderDepth3Expression | this_HeaderDepth4Expression_3= ruleHeaderDepth4Expression | this_HeaderDepth5Expression_4= ruleHeaderDepth5Expression | this_HeaderDepth6Expression_5= ruleHeaderDepth6Expression )
                    {
                    // InternalHammilDSL.g:130:3: ( ( ( ruleHeaderDepth1Expression )=>this_HeaderDepth1Expression_0= ruleHeaderDepth1Expression ) | this_HeaderDepth2Expression_1= ruleHeaderDepth2Expression | this_HeaderDepth3Expression_2= ruleHeaderDepth3Expression | this_HeaderDepth4Expression_3= ruleHeaderDepth4Expression | this_HeaderDepth5Expression_4= ruleHeaderDepth5Expression | this_HeaderDepth6Expression_5= ruleHeaderDepth6Expression )
                    int alt2=6;
                    alt2 = dfa2.predict(input);
                    switch (alt2) {
                        case 1 :
                            // InternalHammilDSL.g:131:4: ( ( ruleHeaderDepth1Expression )=>this_HeaderDepth1Expression_0= ruleHeaderDepth1Expression )
                            {
                            // InternalHammilDSL.g:131:4: ( ( ruleHeaderDepth1Expression )=>this_HeaderDepth1Expression_0= ruleHeaderDepth1Expression )
                            // InternalHammilDSL.g:132:5: ( ruleHeaderDepth1Expression )=>this_HeaderDepth1Expression_0= ruleHeaderDepth1Expression
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getExpressionAccess().getHeaderDepth1ExpressionParserRuleCall_0_0());
                              				
                            }
                            pushFollow(FOLLOW_2);
                            this_HeaderDepth1Expression_0=ruleHeaderDepth1Expression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current = this_HeaderDepth1Expression_0;
                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalHammilDSL.g:143:4: this_HeaderDepth2Expression_1= ruleHeaderDepth2Expression
                            {
                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getExpressionAccess().getHeaderDepth2ExpressionParserRuleCall_0_1());
                              			
                            }
                            pushFollow(FOLLOW_2);
                            this_HeaderDepth2Expression_1=ruleHeaderDepth2Expression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current = this_HeaderDepth2Expression_1;
                              				afterParserOrEnumRuleCall();
                              			
                            }

                            }
                            break;
                        case 3 :
                            // InternalHammilDSL.g:152:4: this_HeaderDepth3Expression_2= ruleHeaderDepth3Expression
                            {
                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getExpressionAccess().getHeaderDepth3ExpressionParserRuleCall_0_2());
                              			
                            }
                            pushFollow(FOLLOW_2);
                            this_HeaderDepth3Expression_2=ruleHeaderDepth3Expression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current = this_HeaderDepth3Expression_2;
                              				afterParserOrEnumRuleCall();
                              			
                            }

                            }
                            break;
                        case 4 :
                            // InternalHammilDSL.g:161:4: this_HeaderDepth4Expression_3= ruleHeaderDepth4Expression
                            {
                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getExpressionAccess().getHeaderDepth4ExpressionParserRuleCall_0_3());
                              			
                            }
                            pushFollow(FOLLOW_2);
                            this_HeaderDepth4Expression_3=ruleHeaderDepth4Expression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current = this_HeaderDepth4Expression_3;
                              				afterParserOrEnumRuleCall();
                              			
                            }

                            }
                            break;
                        case 5 :
                            // InternalHammilDSL.g:170:4: this_HeaderDepth5Expression_4= ruleHeaderDepth5Expression
                            {
                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getExpressionAccess().getHeaderDepth5ExpressionParserRuleCall_0_4());
                              			
                            }
                            pushFollow(FOLLOW_2);
                            this_HeaderDepth5Expression_4=ruleHeaderDepth5Expression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current = this_HeaderDepth5Expression_4;
                              				afterParserOrEnumRuleCall();
                              			
                            }

                            }
                            break;
                        case 6 :
                            // InternalHammilDSL.g:179:4: this_HeaderDepth6Expression_5= ruleHeaderDepth6Expression
                            {
                            if ( state.backtracking==0 ) {

                              				newCompositeNode(grammarAccess.getExpressionAccess().getHeaderDepth6ExpressionParserRuleCall_0_5());
                              			
                            }
                            pushFollow(FOLLOW_2);
                            this_HeaderDepth6Expression_5=ruleHeaderDepth6Expression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current = this_HeaderDepth6Expression_5;
                              				afterParserOrEnumRuleCall();
                              			
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalHammilDSL.g:189:3: this_TextExpression_6= ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getTextExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TextExpression_6=ruleTextExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TextExpression_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalHammilDSL.g:198:3: this_CodeExpression_7= ruleCodeExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getCodeExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CodeExpression_7=ruleCodeExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CodeExpression_7;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleTextExpression"
    // InternalHammilDSL.g:213:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:215:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // InternalHammilDSL.g:216:2: iv_ruleTextExpression= ruleTextExpression EOF
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
    // InternalHammilDSL.g:225:1: ruleTextExpression returns [EObject current=null] : (this_HorizontalExpression_0= ruleHorizontalExpression | this_QuoteExpression_1= ruleQuoteExpression | this_TextualExpression_2= ruleTextualExpression ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject this_HorizontalExpression_0 = null;

        EObject this_QuoteExpression_1 = null;

        EObject this_TextualExpression_2 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:232:2: ( (this_HorizontalExpression_0= ruleHorizontalExpression | this_QuoteExpression_1= ruleQuoteExpression | this_TextualExpression_2= ruleTextualExpression ) )
            // InternalHammilDSL.g:233:2: (this_HorizontalExpression_0= ruleHorizontalExpression | this_QuoteExpression_1= ruleQuoteExpression | this_TextualExpression_2= ruleTextualExpression )
            {
            // InternalHammilDSL.g:233:2: (this_HorizontalExpression_0= ruleHorizontalExpression | this_QuoteExpression_1= ruleQuoteExpression | this_TextualExpression_2= ruleTextualExpression )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 9:
            case 10:
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case RULE_STRING:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalHammilDSL.g:234:3: this_HorizontalExpression_0= ruleHorizontalExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTextExpressionAccess().getHorizontalExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_HorizontalExpression_0=ruleHorizontalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_HorizontalExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalHammilDSL.g:243:3: this_QuoteExpression_1= ruleQuoteExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTextExpressionAccess().getQuoteExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_QuoteExpression_1=ruleQuoteExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_QuoteExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalHammilDSL.g:252:3: this_TextualExpression_2= ruleTextualExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTextExpressionAccess().getTextualExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TextualExpression_2=ruleTextualExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TextualExpression_2;
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


    // $ANTLR start "entryRuleEmphasisExpression"
    // InternalHammilDSL.g:267:1: entryRuleEmphasisExpression returns [EObject current=null] : iv_ruleEmphasisExpression= ruleEmphasisExpression EOF ;
    public final EObject entryRuleEmphasisExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmphasisExpression = null;


        try {
            // InternalHammilDSL.g:267:59: (iv_ruleEmphasisExpression= ruleEmphasisExpression EOF )
            // InternalHammilDSL.g:268:2: iv_ruleEmphasisExpression= ruleEmphasisExpression EOF
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
    // InternalHammilDSL.g:274:1: ruleEmphasisExpression returns [EObject current=null] : this_TextualExpression_0= ruleTextualExpression ;
    public final EObject ruleEmphasisExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TextualExpression_0 = null;



        	enterRule();

        try {
            // InternalHammilDSL.g:280:2: (this_TextualExpression_0= ruleTextualExpression )
            // InternalHammilDSL.g:281:2: this_TextualExpression_0= ruleTextualExpression
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


    // $ANTLR start "entryRuleHorizontalExpression"
    // InternalHammilDSL.g:292:1: entryRuleHorizontalExpression returns [EObject current=null] : iv_ruleHorizontalExpression= ruleHorizontalExpression EOF ;
    public final EObject entryRuleHorizontalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHorizontalExpression = null;


        try {
            // InternalHammilDSL.g:292:61: (iv_ruleHorizontalExpression= ruleHorizontalExpression EOF )
            // InternalHammilDSL.g:293:2: iv_ruleHorizontalExpression= ruleHorizontalExpression EOF
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
    // InternalHammilDSL.g:299:1: ruleHorizontalExpression returns [EObject current=null] : ( ( () otherlv_1= '-' otherlv_2= '-' (otherlv_3= '-' )+ this_BL_4= RULE_BL ) | (otherlv_5= '*' otherlv_6= '*' (otherlv_7= '*' )+ this_BL_8= RULE_BL ) | (otherlv_9= '_' otherlv_10= '_' (otherlv_11= '_' )+ this_BL_12= RULE_BL ) ) ;
    public final EObject ruleHorizontalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_BL_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token this_BL_12=null;


        	enterRule();

        try {
            // InternalHammilDSL.g:305:2: ( ( ( () otherlv_1= '-' otherlv_2= '-' (otherlv_3= '-' )+ this_BL_4= RULE_BL ) | (otherlv_5= '*' otherlv_6= '*' (otherlv_7= '*' )+ this_BL_8= RULE_BL ) | (otherlv_9= '_' otherlv_10= '_' (otherlv_11= '_' )+ this_BL_12= RULE_BL ) ) )
            // InternalHammilDSL.g:306:2: ( ( () otherlv_1= '-' otherlv_2= '-' (otherlv_3= '-' )+ this_BL_4= RULE_BL ) | (otherlv_5= '*' otherlv_6= '*' (otherlv_7= '*' )+ this_BL_8= RULE_BL ) | (otherlv_9= '_' otherlv_10= '_' (otherlv_11= '_' )+ this_BL_12= RULE_BL ) )
            {
            // InternalHammilDSL.g:306:2: ( ( () otherlv_1= '-' otherlv_2= '-' (otherlv_3= '-' )+ this_BL_4= RULE_BL ) | (otherlv_5= '*' otherlv_6= '*' (otherlv_7= '*' )+ this_BL_8= RULE_BL ) | (otherlv_9= '_' otherlv_10= '_' (otherlv_11= '_' )+ this_BL_12= RULE_BL ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 9:
                {
                alt8=1;
                }
                break;
            case 10:
                {
                alt8=2;
                }
                break;
            case 11:
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
                    // InternalHammilDSL.g:307:3: ( () otherlv_1= '-' otherlv_2= '-' (otherlv_3= '-' )+ this_BL_4= RULE_BL )
                    {
                    // InternalHammilDSL.g:307:3: ( () otherlv_1= '-' otherlv_2= '-' (otherlv_3= '-' )+ this_BL_4= RULE_BL )
                    // InternalHammilDSL.g:308:4: () otherlv_1= '-' otherlv_2= '-' (otherlv_3= '-' )+ this_BL_4= RULE_BL
                    {
                    // InternalHammilDSL.g:308:4: ()
                    // InternalHammilDSL.g:309:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getHorizontalExpressionAccess().getHorizontalExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,9,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_0_1());
                      			
                    }
                    otherlv_2=(Token)match(input,9,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_0_2());
                      			
                    }
                    // InternalHammilDSL.g:323:4: (otherlv_3= '-' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==9) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalHammilDSL.g:324:5: otherlv_3= '-'
                    	    {
                    	    otherlv_3=(Token)match(input,9,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getHorizontalExpressionAccess().getHyphenMinusKeyword_0_3());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    this_BL_4=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BL_4, grammarAccess.getHorizontalExpressionAccess().getBLTerminalRuleCall_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalHammilDSL.g:335:3: (otherlv_5= '*' otherlv_6= '*' (otherlv_7= '*' )+ this_BL_8= RULE_BL )
                    {
                    // InternalHammilDSL.g:335:3: (otherlv_5= '*' otherlv_6= '*' (otherlv_7= '*' )+ this_BL_8= RULE_BL )
                    // InternalHammilDSL.g:336:4: otherlv_5= '*' otherlv_6= '*' (otherlv_7= '*' )+ this_BL_8= RULE_BL
                    {
                    otherlv_5=(Token)match(input,10,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getHorizontalExpressionAccess().getAsteriskKeyword_1_0());
                      			
                    }
                    otherlv_6=(Token)match(input,10,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getHorizontalExpressionAccess().getAsteriskKeyword_1_1());
                      			
                    }
                    // InternalHammilDSL.g:344:4: (otherlv_7= '*' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==10) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalHammilDSL.g:345:5: otherlv_7= '*'
                    	    {
                    	    otherlv_7=(Token)match(input,10,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_7, grammarAccess.getHorizontalExpressionAccess().getAsteriskKeyword_1_2());
                    	      				
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

                    this_BL_8=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BL_8, grammarAccess.getHorizontalExpressionAccess().getBLTerminalRuleCall_1_3());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalHammilDSL.g:356:3: (otherlv_9= '_' otherlv_10= '_' (otherlv_11= '_' )+ this_BL_12= RULE_BL )
                    {
                    // InternalHammilDSL.g:356:3: (otherlv_9= '_' otherlv_10= '_' (otherlv_11= '_' )+ this_BL_12= RULE_BL )
                    // InternalHammilDSL.g:357:4: otherlv_9= '_' otherlv_10= '_' (otherlv_11= '_' )+ this_BL_12= RULE_BL
                    {
                    otherlv_9=(Token)match(input,11,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getHorizontalExpressionAccess().get_Keyword_2_0());
                      			
                    }
                    otherlv_10=(Token)match(input,11,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getHorizontalExpressionAccess().get_Keyword_2_1());
                      			
                    }
                    // InternalHammilDSL.g:365:4: (otherlv_11= '_' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==11) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalHammilDSL.g:366:5: otherlv_11= '_'
                    	    {
                    	    otherlv_11=(Token)match(input,11,FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_11, grammarAccess.getHorizontalExpressionAccess().get_Keyword_2_2());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    this_BL_12=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BL_12, grammarAccess.getHorizontalExpressionAccess().getBLTerminalRuleCall_2_3());
                      			
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
    // $ANTLR end "ruleHorizontalExpression"


    // $ANTLR start "entryRuleQuoteExpression"
    // InternalHammilDSL.g:380:1: entryRuleQuoteExpression returns [EObject current=null] : iv_ruleQuoteExpression= ruleQuoteExpression EOF ;
    public final EObject entryRuleQuoteExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuoteExpression = null;


        try {
            // InternalHammilDSL.g:380:56: (iv_ruleQuoteExpression= ruleQuoteExpression EOF )
            // InternalHammilDSL.g:381:2: iv_ruleQuoteExpression= ruleQuoteExpression EOF
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
    // InternalHammilDSL.g:387:1: ruleQuoteExpression returns [EObject current=null] : (otherlv_0= '>' ( (lv_textexpression_1_0= ruleTextExpression ) ) this_BL_2= RULE_BL ) ;
    public final EObject ruleQuoteExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BL_2=null;
        EObject lv_textexpression_1_0 = null;



        	enterRule();

        try {
            // InternalHammilDSL.g:393:2: ( (otherlv_0= '>' ( (lv_textexpression_1_0= ruleTextExpression ) ) this_BL_2= RULE_BL ) )
            // InternalHammilDSL.g:394:2: (otherlv_0= '>' ( (lv_textexpression_1_0= ruleTextExpression ) ) this_BL_2= RULE_BL )
            {
            // InternalHammilDSL.g:394:2: (otherlv_0= '>' ( (lv_textexpression_1_0= ruleTextExpression ) ) this_BL_2= RULE_BL )
            // InternalHammilDSL.g:395:3: otherlv_0= '>' ( (lv_textexpression_1_0= ruleTextExpression ) ) this_BL_2= RULE_BL
            {
            otherlv_0=(Token)match(input,12,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getQuoteExpressionAccess().getGreaterThanSignKeyword_0());
              		
            }
            // InternalHammilDSL.g:399:3: ( (lv_textexpression_1_0= ruleTextExpression ) )
            // InternalHammilDSL.g:400:4: (lv_textexpression_1_0= ruleTextExpression )
            {
            // InternalHammilDSL.g:400:4: (lv_textexpression_1_0= ruleTextExpression )
            // InternalHammilDSL.g:401:5: lv_textexpression_1_0= ruleTextExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQuoteExpressionAccess().getTextexpressionTextExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_textexpression_1_0=ruleTextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getQuoteExpressionRule());
              					}
              					set(
              						current,
              						"textexpression",
              						lv_textexpression_1_0,
              						"org.xtext.markHammil.mh.HammilDSL.TextExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_BL_2=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BL_2, grammarAccess.getQuoteExpressionAccess().getBLTerminalRuleCall_2());
              		
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


    // $ANTLR start "entryRuleCodeExpression"
    // InternalHammilDSL.g:426:1: entryRuleCodeExpression returns [EObject current=null] : iv_ruleCodeExpression= ruleCodeExpression EOF ;
    public final EObject entryRuleCodeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeExpression = null;


        try {
            // InternalHammilDSL.g:426:55: (iv_ruleCodeExpression= ruleCodeExpression EOF )
            // InternalHammilDSL.g:427:2: iv_ruleCodeExpression= ruleCodeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCodeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCodeExpression=ruleCodeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCodeExpression; 
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
    // $ANTLR end "entryRuleCodeExpression"


    // $ANTLR start "ruleCodeExpression"
    // InternalHammilDSL.g:433:1: ruleCodeExpression returns [EObject current=null] : ( (otherlv_0= '`' ( (lv_text_1_0= ruleString0 ) ) otherlv_2= '`' ) | (otherlv_3= '```' this_BL_4= RULE_BL ( (lv_text_5_0= ruleString0 ) ) otherlv_6= '```' (this_BL_7= RULE_BL )? ) ) ;
    public final EObject ruleCodeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_BL_4=null;
        Token otherlv_6=null;
        Token this_BL_7=null;
        AntlrDatatypeRuleToken lv_text_1_0 = null;

        AntlrDatatypeRuleToken lv_text_5_0 = null;



        	enterRule();

        try {
            // InternalHammilDSL.g:439:2: ( ( (otherlv_0= '`' ( (lv_text_1_0= ruleString0 ) ) otherlv_2= '`' ) | (otherlv_3= '```' this_BL_4= RULE_BL ( (lv_text_5_0= ruleString0 ) ) otherlv_6= '```' (this_BL_7= RULE_BL )? ) ) )
            // InternalHammilDSL.g:440:2: ( (otherlv_0= '`' ( (lv_text_1_0= ruleString0 ) ) otherlv_2= '`' ) | (otherlv_3= '```' this_BL_4= RULE_BL ( (lv_text_5_0= ruleString0 ) ) otherlv_6= '```' (this_BL_7= RULE_BL )? ) )
            {
            // InternalHammilDSL.g:440:2: ( (otherlv_0= '`' ( (lv_text_1_0= ruleString0 ) ) otherlv_2= '`' ) | (otherlv_3= '```' this_BL_4= RULE_BL ( (lv_text_5_0= ruleString0 ) ) otherlv_6= '```' (this_BL_7= RULE_BL )? ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            else if ( (LA10_0==14) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalHammilDSL.g:441:3: (otherlv_0= '`' ( (lv_text_1_0= ruleString0 ) ) otherlv_2= '`' )
                    {
                    // InternalHammilDSL.g:441:3: (otherlv_0= '`' ( (lv_text_1_0= ruleString0 ) ) otherlv_2= '`' )
                    // InternalHammilDSL.g:442:4: otherlv_0= '`' ( (lv_text_1_0= ruleString0 ) ) otherlv_2= '`'
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getCodeExpressionAccess().getGraveAccentKeyword_0_0());
                      			
                    }
                    // InternalHammilDSL.g:446:4: ( (lv_text_1_0= ruleString0 ) )
                    // InternalHammilDSL.g:447:5: (lv_text_1_0= ruleString0 )
                    {
                    // InternalHammilDSL.g:447:5: (lv_text_1_0= ruleString0 )
                    // InternalHammilDSL.g:448:6: lv_text_1_0= ruleString0
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCodeExpressionAccess().getTextString0ParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    lv_text_1_0=ruleString0();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCodeExpressionRule());
                      						}
                      						set(
                      							current,
                      							"text",
                      							lv_text_1_0,
                      							"org.xtext.markHammil.mh.HammilDSL.String0");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getCodeExpressionAccess().getGraveAccentKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalHammilDSL.g:471:3: (otherlv_3= '```' this_BL_4= RULE_BL ( (lv_text_5_0= ruleString0 ) ) otherlv_6= '```' (this_BL_7= RULE_BL )? )
                    {
                    // InternalHammilDSL.g:471:3: (otherlv_3= '```' this_BL_4= RULE_BL ( (lv_text_5_0= ruleString0 ) ) otherlv_6= '```' (this_BL_7= RULE_BL )? )
                    // InternalHammilDSL.g:472:4: otherlv_3= '```' this_BL_4= RULE_BL ( (lv_text_5_0= ruleString0 ) ) otherlv_6= '```' (this_BL_7= RULE_BL )?
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getCodeExpressionAccess().getGraveAccentGraveAccentGraveAccentKeyword_1_0());
                      			
                    }
                    this_BL_4=(Token)match(input,RULE_BL,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BL_4, grammarAccess.getCodeExpressionAccess().getBLTerminalRuleCall_1_1());
                      			
                    }
                    // InternalHammilDSL.g:480:4: ( (lv_text_5_0= ruleString0 ) )
                    // InternalHammilDSL.g:481:5: (lv_text_5_0= ruleString0 )
                    {
                    // InternalHammilDSL.g:481:5: (lv_text_5_0= ruleString0 )
                    // InternalHammilDSL.g:482:6: lv_text_5_0= ruleString0
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCodeExpressionAccess().getTextString0ParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_text_5_0=ruleString0();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCodeExpressionRule());
                      						}
                      						set(
                      							current,
                      							"text",
                      							lv_text_5_0,
                      							"org.xtext.markHammil.mh.HammilDSL.String0");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,14,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getCodeExpressionAccess().getGraveAccentGraveAccentGraveAccentKeyword_1_3());
                      			
                    }
                    // InternalHammilDSL.g:503:4: (this_BL_7= RULE_BL )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_BL) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalHammilDSL.g:504:5: this_BL_7= RULE_BL
                            {
                            this_BL_7=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_BL_7, grammarAccess.getCodeExpressionAccess().getBLTerminalRuleCall_1_4());
                              				
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
    // $ANTLR end "ruleCodeExpression"


    // $ANTLR start "entryRuleHeaderDepth1Expression"
    // InternalHammilDSL.g:514:1: entryRuleHeaderDepth1Expression returns [EObject current=null] : iv_ruleHeaderDepth1Expression= ruleHeaderDepth1Expression EOF ;
    public final EObject entryRuleHeaderDepth1Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderDepth1Expression = null;


        try {
            // InternalHammilDSL.g:514:63: (iv_ruleHeaderDepth1Expression= ruleHeaderDepth1Expression EOF )
            // InternalHammilDSL.g:515:2: iv_ruleHeaderDepth1Expression= ruleHeaderDepth1Expression EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleHeaderDepth1Expression"


    // $ANTLR start "ruleHeaderDepth1Expression"
    // InternalHammilDSL.g:521:1: ruleHeaderDepth1Expression returns [EObject current=null] : ( ( ( ( '#' )=>otherlv_0= '#' ) (this_S_1= RULE_S )+ ( (lv_title_2_0= ruleEmphasisExpression ) ) (otherlv_3= '#' )* (this_S_4= RULE_S )* (this_BL_5= RULE_BL )? ) | ( ( (lv_title_6_0= ruleEmphasisExpression ) ) this_BL_7= RULE_BL (otherlv_8= '=' )+ (this_BL_9= RULE_BL )? ) ) ;
    public final EObject ruleHeaderDepth1Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_S_1=null;
        Token otherlv_3=null;
        Token this_S_4=null;
        Token this_BL_5=null;
        Token this_BL_7=null;
        Token otherlv_8=null;
        Token this_BL_9=null;
        EObject lv_title_2_0 = null;

        EObject lv_title_6_0 = null;



        	enterRule();

        try {
            // InternalHammilDSL.g:527:2: ( ( ( ( ( '#' )=>otherlv_0= '#' ) (this_S_1= RULE_S )+ ( (lv_title_2_0= ruleEmphasisExpression ) ) (otherlv_3= '#' )* (this_S_4= RULE_S )* (this_BL_5= RULE_BL )? ) | ( ( (lv_title_6_0= ruleEmphasisExpression ) ) this_BL_7= RULE_BL (otherlv_8= '=' )+ (this_BL_9= RULE_BL )? ) ) )
            // InternalHammilDSL.g:528:2: ( ( ( ( '#' )=>otherlv_0= '#' ) (this_S_1= RULE_S )+ ( (lv_title_2_0= ruleEmphasisExpression ) ) (otherlv_3= '#' )* (this_S_4= RULE_S )* (this_BL_5= RULE_BL )? ) | ( ( (lv_title_6_0= ruleEmphasisExpression ) ) this_BL_7= RULE_BL (otherlv_8= '=' )+ (this_BL_9= RULE_BL )? ) )
            {
            // InternalHammilDSL.g:528:2: ( ( ( ( '#' )=>otherlv_0= '#' ) (this_S_1= RULE_S )+ ( (lv_title_2_0= ruleEmphasisExpression ) ) (otherlv_3= '#' )* (this_S_4= RULE_S )* (this_BL_5= RULE_BL )? ) | ( ( (lv_title_6_0= ruleEmphasisExpression ) ) this_BL_7= RULE_BL (otherlv_8= '=' )+ (this_BL_9= RULE_BL )? ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==15) && (synpred2_InternalHammilDSL())) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_STRING) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalHammilDSL.g:529:3: ( ( ( '#' )=>otherlv_0= '#' ) (this_S_1= RULE_S )+ ( (lv_title_2_0= ruleEmphasisExpression ) ) (otherlv_3= '#' )* (this_S_4= RULE_S )* (this_BL_5= RULE_BL )? )
                    {
                    // InternalHammilDSL.g:529:3: ( ( ( '#' )=>otherlv_0= '#' ) (this_S_1= RULE_S )+ ( (lv_title_2_0= ruleEmphasisExpression ) ) (otherlv_3= '#' )* (this_S_4= RULE_S )* (this_BL_5= RULE_BL )? )
                    // InternalHammilDSL.g:530:4: ( ( '#' )=>otherlv_0= '#' ) (this_S_1= RULE_S )+ ( (lv_title_2_0= ruleEmphasisExpression ) ) (otherlv_3= '#' )* (this_S_4= RULE_S )* (this_BL_5= RULE_BL )?
                    {
                    // InternalHammilDSL.g:530:4: ( ( '#' )=>otherlv_0= '#' )
                    // InternalHammilDSL.g:531:5: ( '#' )=>otherlv_0= '#'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_0, grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0_0());
                      				
                    }

                    }

                    // InternalHammilDSL.g:537:4: (this_S_1= RULE_S )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_S) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalHammilDSL.g:538:5: this_S_1= RULE_S
                    	    {
                    	    this_S_1=(Token)match(input,RULE_S,FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_S_1, grammarAccess.getHeaderDepth1ExpressionAccess().getSTerminalRuleCall_0_1());
                    	      				
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

                    // InternalHammilDSL.g:543:4: ( (lv_title_2_0= ruleEmphasisExpression ) )
                    // InternalHammilDSL.g:544:5: (lv_title_2_0= ruleEmphasisExpression )
                    {
                    // InternalHammilDSL.g:544:5: (lv_title_2_0= ruleEmphasisExpression )
                    // InternalHammilDSL.g:545:6: lv_title_2_0= ruleEmphasisExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_title_2_0=ruleEmphasisExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getHeaderDepth1ExpressionRule());
                      						}
                      						set(
                      							current,
                      							"title",
                      							lv_title_2_0,
                      							"org.xtext.markHammil.mh.HammilDSL.EmphasisExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalHammilDSL.g:562:4: (otherlv_3= '#' )*
                    loop12:
                    do {
                        int alt12=2;
                        alt12 = dfa12.predict(input);
                        switch (alt12) {
                    	case 1 :
                    	    // InternalHammilDSL.g:563:5: otherlv_3= '#'
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_18); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0_3());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // InternalHammilDSL.g:568:4: (this_S_4= RULE_S )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_S) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalHammilDSL.g:569:5: this_S_4= RULE_S
                    	    {
                    	    this_S_4=(Token)match(input,RULE_S,FOLLOW_19); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_S_4, grammarAccess.getHeaderDepth1ExpressionAccess().getSTerminalRuleCall_0_4());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // InternalHammilDSL.g:574:4: (this_BL_5= RULE_BL )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_BL) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalHammilDSL.g:575:5: this_BL_5= RULE_BL
                            {
                            this_BL_5=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_BL_5, grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_0_5());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHammilDSL.g:582:3: ( ( (lv_title_6_0= ruleEmphasisExpression ) ) this_BL_7= RULE_BL (otherlv_8= '=' )+ (this_BL_9= RULE_BL )? )
                    {
                    // InternalHammilDSL.g:582:3: ( ( (lv_title_6_0= ruleEmphasisExpression ) ) this_BL_7= RULE_BL (otherlv_8= '=' )+ (this_BL_9= RULE_BL )? )
                    // InternalHammilDSL.g:583:4: ( (lv_title_6_0= ruleEmphasisExpression ) ) this_BL_7= RULE_BL (otherlv_8= '=' )+ (this_BL_9= RULE_BL )?
                    {
                    // InternalHammilDSL.g:583:4: ( (lv_title_6_0= ruleEmphasisExpression ) )
                    // InternalHammilDSL.g:584:5: (lv_title_6_0= ruleEmphasisExpression )
                    {
                    // InternalHammilDSL.g:584:5: (lv_title_6_0= ruleEmphasisExpression )
                    // InternalHammilDSL.g:585:6: lv_title_6_0= ruleEmphasisExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_title_6_0=ruleEmphasisExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getHeaderDepth1ExpressionRule());
                      						}
                      						set(
                      							current,
                      							"title",
                      							lv_title_6_0,
                      							"org.xtext.markHammil.mh.HammilDSL.EmphasisExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    this_BL_7=(Token)match(input,RULE_BL,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BL_7, grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_1_1());
                      			
                    }
                    // InternalHammilDSL.g:606:4: (otherlv_8= '=' )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==16) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalHammilDSL.g:607:5: otherlv_8= '='
                    	    {
                    	    otherlv_8=(Token)match(input,16,FOLLOW_21); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_8, grammarAccess.getHeaderDepth1ExpressionAccess().getEqualsSignKeyword_1_2());
                    	      				
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

                    // InternalHammilDSL.g:612:4: (this_BL_9= RULE_BL )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_BL) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalHammilDSL.g:613:5: this_BL_9= RULE_BL
                            {
                            this_BL_9=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_BL_9, grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_1_3());
                              				
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
    // $ANTLR end "ruleHeaderDepth1Expression"


    // $ANTLR start "entryRuleHeaderDepth2Expression"
    // InternalHammilDSL.g:623:1: entryRuleHeaderDepth2Expression returns [EObject current=null] : iv_ruleHeaderDepth2Expression= ruleHeaderDepth2Expression EOF ;
    public final EObject entryRuleHeaderDepth2Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderDepth2Expression = null;


        try {
            // InternalHammilDSL.g:623:63: (iv_ruleHeaderDepth2Expression= ruleHeaderDepth2Expression EOF )
            // InternalHammilDSL.g:624:2: iv_ruleHeaderDepth2Expression= ruleHeaderDepth2Expression EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleHeaderDepth2Expression"


    // $ANTLR start "ruleHeaderDepth2Expression"
    // InternalHammilDSL.g:630:1: ruleHeaderDepth2Expression returns [EObject current=null] : ( ( ( ( '##' )=>otherlv_0= '##' ) ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '-' )+ (this_BL_7= RULE_BL )? ) ) ;
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

        try {
            // InternalHammilDSL.g:636:2: ( ( ( ( ( '##' )=>otherlv_0= '##' ) ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '-' )+ (this_BL_7= RULE_BL )? ) ) )
            // InternalHammilDSL.g:637:2: ( ( ( ( '##' )=>otherlv_0= '##' ) ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '-' )+ (this_BL_7= RULE_BL )? ) )
            {
            // InternalHammilDSL.g:637:2: ( ( ( ( '##' )=>otherlv_0= '##' ) ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '-' )+ (this_BL_7= RULE_BL )? ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==17) && (synpred3_InternalHammilDSL())) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_STRING) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalHammilDSL.g:638:3: ( ( ( '##' )=>otherlv_0= '##' ) ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
                    {
                    // InternalHammilDSL.g:638:3: ( ( ( '##' )=>otherlv_0= '##' ) ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
                    // InternalHammilDSL.g:639:4: ( ( '##' )=>otherlv_0= '##' ) ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )?
                    {
                    // InternalHammilDSL.g:639:4: ( ( '##' )=>otherlv_0= '##' )
                    // InternalHammilDSL.g:640:5: ( '##' )=>otherlv_0= '##'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_0, grammarAccess.getHeaderDepth2ExpressionAccess().getNumberSignNumberSignKeyword_0_0());
                      				
                    }

                    }

                    // InternalHammilDSL.g:646:4: ( (lv_title_1_0= ruleEmphasisExpression ) )
                    // InternalHammilDSL.g:647:5: (lv_title_1_0= ruleEmphasisExpression )
                    {
                    // InternalHammilDSL.g:647:5: (lv_title_1_0= ruleEmphasisExpression )
                    // InternalHammilDSL.g:648:6: lv_title_1_0= ruleEmphasisExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
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

                    // InternalHammilDSL.g:665:4: (otherlv_2= '#' )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==15) ) {
                            int LA18_2 = input.LA(2);

                            if ( (LA18_2==EOF||LA18_2==RULE_BL||LA18_2==RULE_STRING||(LA18_2>=9 && LA18_2<=15)||(LA18_2>=17 && LA18_2<=21)) ) {
                                alt18=1;
                            }


                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalHammilDSL.g:666:5: otherlv_2= '#'
                    	    {
                    	    otherlv_2=(Token)match(input,15,FOLLOW_22); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getHeaderDepth2ExpressionAccess().getNumberSignKeyword_0_2());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    // InternalHammilDSL.g:671:4: (this_BL_3= RULE_BL )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_BL) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalHammilDSL.g:672:5: this_BL_3= RULE_BL
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
                    // InternalHammilDSL.g:679:3: ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '-' )+ (this_BL_7= RULE_BL )? )
                    {
                    // InternalHammilDSL.g:679:3: ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '-' )+ (this_BL_7= RULE_BL )? )
                    // InternalHammilDSL.g:680:4: ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '-' )+ (this_BL_7= RULE_BL )?
                    {
                    // InternalHammilDSL.g:680:4: ( (lv_title_4_0= ruleEmphasisExpression ) )
                    // InternalHammilDSL.g:681:5: (lv_title_4_0= ruleEmphasisExpression )
                    {
                    // InternalHammilDSL.g:681:5: (lv_title_4_0= ruleEmphasisExpression )
                    // InternalHammilDSL.g:682:6: lv_title_4_0= ruleEmphasisExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
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

                    this_BL_5=(Token)match(input,RULE_BL,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BL_5, grammarAccess.getHeaderDepth2ExpressionAccess().getBLTerminalRuleCall_1_1());
                      			
                    }
                    // InternalHammilDSL.g:703:4: (otherlv_6= '-' )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==9) ) {
                            int LA20_2 = input.LA(2);

                            if ( (LA20_2==9) ) {
                                int LA20_3 = input.LA(3);

                                if ( (LA20_3==EOF||LA20_3==RULE_STRING||(LA20_3>=9 && LA20_3<=15)||(LA20_3>=17 && LA20_3<=21)) ) {
                                    alt20=1;
                                }
                                else if ( (LA20_3==RULE_BL) ) {
                                    alt20=1;
                                }


                            }
                            else if ( (LA20_2==EOF||LA20_2==RULE_BL||LA20_2==RULE_STRING||(LA20_2>=10 && LA20_2<=15)||(LA20_2>=17 && LA20_2<=21)) ) {
                                alt20=1;
                            }


                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalHammilDSL.g:704:5: otherlv_6= '-'
                    	    {
                    	    otherlv_6=(Token)match(input,9,FOLLOW_23); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getHeaderDepth2ExpressionAccess().getHyphenMinusKeyword_1_2());
                    	      				
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

                    // InternalHammilDSL.g:709:4: (this_BL_7= RULE_BL )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_BL) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalHammilDSL.g:710:5: this_BL_7= RULE_BL
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
        }
        return current;
    }
    // $ANTLR end "ruleHeaderDepth2Expression"


    // $ANTLR start "entryRuleHeaderDepth3Expression"
    // InternalHammilDSL.g:720:1: entryRuleHeaderDepth3Expression returns [EObject current=null] : iv_ruleHeaderDepth3Expression= ruleHeaderDepth3Expression EOF ;
    public final EObject entryRuleHeaderDepth3Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderDepth3Expression = null;


        try {
            // InternalHammilDSL.g:720:63: (iv_ruleHeaderDepth3Expression= ruleHeaderDepth3Expression EOF )
            // InternalHammilDSL.g:721:2: iv_ruleHeaderDepth3Expression= ruleHeaderDepth3Expression EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleHeaderDepth3Expression"


    // $ANTLR start "ruleHeaderDepth3Expression"
    // InternalHammilDSL.g:727:1: ruleHeaderDepth3Expression returns [EObject current=null] : (otherlv_0= '###' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) ;
    public final EObject ruleHeaderDepth3Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_BL_3=null;
        EObject lv_title_1_0 = null;



        	enterRule();

        try {
            // InternalHammilDSL.g:733:2: ( (otherlv_0= '###' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) )
            // InternalHammilDSL.g:734:2: (otherlv_0= '###' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            {
            // InternalHammilDSL.g:734:2: (otherlv_0= '###' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            // InternalHammilDSL.g:735:3: otherlv_0= '###' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getHeaderDepth3ExpressionAccess().getNumberSignNumberSignNumberSignKeyword_0());
              		
            }
            // InternalHammilDSL.g:739:3: ( (lv_title_1_0= ruleEmphasisExpression ) )
            // InternalHammilDSL.g:740:4: (lv_title_1_0= ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:740:4: (lv_title_1_0= ruleEmphasisExpression )
            // InternalHammilDSL.g:741:5: lv_title_1_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeaderDepth3ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_22);
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

            // InternalHammilDSL.g:758:3: (otherlv_2= '#' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==15) ) {
                    int LA23_2 = input.LA(2);

                    if ( (LA23_2==EOF||LA23_2==RULE_BL||LA23_2==RULE_STRING||(LA23_2>=9 && LA23_2<=15)||(LA23_2>=17 && LA23_2<=21)) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // InternalHammilDSL.g:759:4: otherlv_2= '#'
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getHeaderDepth3ExpressionAccess().getNumberSignKeyword_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // InternalHammilDSL.g:764:3: (this_BL_3= RULE_BL )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_BL) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalHammilDSL.g:765:4: this_BL_3= RULE_BL
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
        }
        return current;
    }
    // $ANTLR end "ruleHeaderDepth3Expression"


    // $ANTLR start "entryRuleHeaderDepth5Expression"
    // InternalHammilDSL.g:774:1: entryRuleHeaderDepth5Expression returns [EObject current=null] : iv_ruleHeaderDepth5Expression= ruleHeaderDepth5Expression EOF ;
    public final EObject entryRuleHeaderDepth5Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderDepth5Expression = null;


        try {
            // InternalHammilDSL.g:774:63: (iv_ruleHeaderDepth5Expression= ruleHeaderDepth5Expression EOF )
            // InternalHammilDSL.g:775:2: iv_ruleHeaderDepth5Expression= ruleHeaderDepth5Expression EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleHeaderDepth5Expression"


    // $ANTLR start "ruleHeaderDepth5Expression"
    // InternalHammilDSL.g:781:1: ruleHeaderDepth5Expression returns [EObject current=null] : (otherlv_0= '#####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) ;
    public final EObject ruleHeaderDepth5Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_BL_3=null;
        EObject lv_title_1_0 = null;



        	enterRule();

        try {
            // InternalHammilDSL.g:787:2: ( (otherlv_0= '#####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) )
            // InternalHammilDSL.g:788:2: (otherlv_0= '#####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            {
            // InternalHammilDSL.g:788:2: (otherlv_0= '#####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            // InternalHammilDSL.g:789:3: otherlv_0= '#####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getHeaderDepth5ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_0());
              		
            }
            // InternalHammilDSL.g:793:3: ( (lv_title_1_0= ruleEmphasisExpression ) )
            // InternalHammilDSL.g:794:4: (lv_title_1_0= ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:794:4: (lv_title_1_0= ruleEmphasisExpression )
            // InternalHammilDSL.g:795:5: lv_title_1_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeaderDepth5ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_22);
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

            // InternalHammilDSL.g:812:3: (otherlv_2= '#' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==15) ) {
                    int LA25_2 = input.LA(2);

                    if ( (LA25_2==EOF||LA25_2==RULE_BL||LA25_2==RULE_STRING||(LA25_2>=9 && LA25_2<=15)||(LA25_2>=17 && LA25_2<=21)) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // InternalHammilDSL.g:813:4: otherlv_2= '#'
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getHeaderDepth5ExpressionAccess().getNumberSignKeyword_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // InternalHammilDSL.g:818:3: (this_BL_3= RULE_BL )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_BL) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalHammilDSL.g:819:4: this_BL_3= RULE_BL
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
        }
        return current;
    }
    // $ANTLR end "ruleHeaderDepth5Expression"


    // $ANTLR start "entryRuleHeaderDepth6Expression"
    // InternalHammilDSL.g:828:1: entryRuleHeaderDepth6Expression returns [EObject current=null] : iv_ruleHeaderDepth6Expression= ruleHeaderDepth6Expression EOF ;
    public final EObject entryRuleHeaderDepth6Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderDepth6Expression = null;


        try {
            // InternalHammilDSL.g:828:63: (iv_ruleHeaderDepth6Expression= ruleHeaderDepth6Expression EOF )
            // InternalHammilDSL.g:829:2: iv_ruleHeaderDepth6Expression= ruleHeaderDepth6Expression EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleHeaderDepth6Expression"


    // $ANTLR start "ruleHeaderDepth6Expression"
    // InternalHammilDSL.g:835:1: ruleHeaderDepth6Expression returns [EObject current=null] : (otherlv_0= '######' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) ;
    public final EObject ruleHeaderDepth6Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_BL_3=null;
        EObject lv_title_1_0 = null;



        	enterRule();

        try {
            // InternalHammilDSL.g:841:2: ( (otherlv_0= '######' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) )
            // InternalHammilDSL.g:842:2: (otherlv_0= '######' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            {
            // InternalHammilDSL.g:842:2: (otherlv_0= '######' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            // InternalHammilDSL.g:843:3: otherlv_0= '######' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getHeaderDepth6ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_0());
              		
            }
            // InternalHammilDSL.g:847:3: ( (lv_title_1_0= ruleEmphasisExpression ) )
            // InternalHammilDSL.g:848:4: (lv_title_1_0= ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:848:4: (lv_title_1_0= ruleEmphasisExpression )
            // InternalHammilDSL.g:849:5: lv_title_1_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeaderDepth6ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_22);
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

            // InternalHammilDSL.g:866:3: (otherlv_2= '#' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==15) ) {
                    int LA27_2 = input.LA(2);

                    if ( (LA27_2==EOF||LA27_2==RULE_BL||LA27_2==RULE_STRING||(LA27_2>=9 && LA27_2<=15)||(LA27_2>=17 && LA27_2<=21)) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // InternalHammilDSL.g:867:4: otherlv_2= '#'
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getHeaderDepth6ExpressionAccess().getNumberSignKeyword_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // InternalHammilDSL.g:872:3: (this_BL_3= RULE_BL )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_BL) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalHammilDSL.g:873:4: this_BL_3= RULE_BL
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
        }
        return current;
    }
    // $ANTLR end "ruleHeaderDepth6Expression"


    // $ANTLR start "entryRuleHeaderDepth4Expression"
    // InternalHammilDSL.g:882:1: entryRuleHeaderDepth4Expression returns [EObject current=null] : iv_ruleHeaderDepth4Expression= ruleHeaderDepth4Expression EOF ;
    public final EObject entryRuleHeaderDepth4Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderDepth4Expression = null;


        try {
            // InternalHammilDSL.g:882:63: (iv_ruleHeaderDepth4Expression= ruleHeaderDepth4Expression EOF )
            // InternalHammilDSL.g:883:2: iv_ruleHeaderDepth4Expression= ruleHeaderDepth4Expression EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleHeaderDepth4Expression"


    // $ANTLR start "ruleHeaderDepth4Expression"
    // InternalHammilDSL.g:889:1: ruleHeaderDepth4Expression returns [EObject current=null] : (otherlv_0= '####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) ;
    public final EObject ruleHeaderDepth4Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_BL_3=null;
        EObject lv_title_1_0 = null;



        	enterRule();

        try {
            // InternalHammilDSL.g:895:2: ( (otherlv_0= '####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) )
            // InternalHammilDSL.g:896:2: (otherlv_0= '####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            {
            // InternalHammilDSL.g:896:2: (otherlv_0= '####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            // InternalHammilDSL.g:897:3: otherlv_0= '####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getHeaderDepth4ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignKeyword_0());
              		
            }
            // InternalHammilDSL.g:901:3: ( (lv_title_1_0= ruleEmphasisExpression ) )
            // InternalHammilDSL.g:902:4: (lv_title_1_0= ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:902:4: (lv_title_1_0= ruleEmphasisExpression )
            // InternalHammilDSL.g:903:5: lv_title_1_0= ruleEmphasisExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHeaderDepth4ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_22);
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

            // InternalHammilDSL.g:920:3: (otherlv_2= '#' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==15) ) {
                    int LA29_2 = input.LA(2);

                    if ( (LA29_2==EOF||LA29_2==RULE_BL||LA29_2==RULE_STRING||(LA29_2>=9 && LA29_2<=15)||(LA29_2>=17 && LA29_2<=21)) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // InternalHammilDSL.g:921:4: otherlv_2= '#'
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getHeaderDepth4ExpressionAccess().getNumberSignKeyword_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // InternalHammilDSL.g:926:3: (this_BL_3= RULE_BL )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_BL) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalHammilDSL.g:927:4: this_BL_3= RULE_BL
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
        }
        return current;
    }
    // $ANTLR end "ruleHeaderDepth4Expression"


    // $ANTLR start "entryRuleTextualExpression"
    // InternalHammilDSL.g:936:1: entryRuleTextualExpression returns [EObject current=null] : iv_ruleTextualExpression= ruleTextualExpression EOF ;
    public final EObject entryRuleTextualExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextualExpression = null;


        try {
            // InternalHammilDSL.g:936:58: (iv_ruleTextualExpression= ruleTextualExpression EOF )
            // InternalHammilDSL.g:937:2: iv_ruleTextualExpression= ruleTextualExpression EOF
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
    // InternalHammilDSL.g:943:1: ruleTextualExpression returns [EObject current=null] : ( (lv_contentString_0_0= ruleString0 ) ) ;
    public final EObject ruleTextualExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_contentString_0_0 = null;



        	enterRule();

        try {
            // InternalHammilDSL.g:949:2: ( ( (lv_contentString_0_0= ruleString0 ) ) )
            // InternalHammilDSL.g:950:2: ( (lv_contentString_0_0= ruleString0 ) )
            {
            // InternalHammilDSL.g:950:2: ( (lv_contentString_0_0= ruleString0 ) )
            // InternalHammilDSL.g:951:3: (lv_contentString_0_0= ruleString0 )
            {
            // InternalHammilDSL.g:951:3: (lv_contentString_0_0= ruleString0 )
            // InternalHammilDSL.g:952:4: lv_contentString_0_0= ruleString0
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
    // InternalHammilDSL.g:972:1: entryRuleString0 returns [String current=null] : iv_ruleString0= ruleString0 EOF ;
    public final String entryRuleString0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleString0 = null;


        try {
            // InternalHammilDSL.g:972:47: (iv_ruleString0= ruleString0 EOF )
            // InternalHammilDSL.g:973:2: iv_ruleString0= ruleString0 EOF
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
    // InternalHammilDSL.g:979:1: ruleString0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleString0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalHammilDSL.g:985:2: (this_STRING_0= RULE_STRING )
            // InternalHammilDSL.g:986:2: this_STRING_0= RULE_STRING
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
        // InternalHammilDSL.g:132:5: ( ruleHeaderDepth1Expression )
        // InternalHammilDSL.g:132:6: ruleHeaderDepth1Expression
        {
        pushFollow(FOLLOW_2);
        ruleHeaderDepth1Expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalHammilDSL

    // $ANTLR start synpred2_InternalHammilDSL
    public final void synpred2_InternalHammilDSL_fragment() throws RecognitionException {   
        // InternalHammilDSL.g:531:5: ( '#' )
        // InternalHammilDSL.g:531:6: '#'
        {
        match(input,15,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalHammilDSL

    // $ANTLR start synpred3_InternalHammilDSL
    public final void synpred3_InternalHammilDSL_fragment() throws RecognitionException {   
        // InternalHammilDSL.g:640:5: ( '##' )
        // InternalHammilDSL.g:640:6: '##'
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


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\6\1\uffff\1\4\5\uffff\1\11\1\uffff";
    static final String dfa_3s = "\1\25\1\uffff\1\4\5\uffff\1\20\1\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\uffff\1\1";
    static final String dfa_5s = "\1\1\7\uffff\1\0\1\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\10\uffff\1\1\1\uffff\1\3\1\4\1\6\1\7\1\5",
            "",
            "\1\10",
            "",
            "",
            "",
            "",
            "",
            "\1\3\6\uffff\1\11",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "130:3: ( ( ( ruleHeaderDepth1Expression )=>this_HeaderDepth1Expression_0= ruleHeaderDepth1Expression ) | this_HeaderDepth2Expression_1= ruleHeaderDepth2Expression | this_HeaderDepth3Expression_2= ruleHeaderDepth3Expression | this_HeaderDepth4Expression_3= ruleHeaderDepth4Expression | this_HeaderDepth5Expression_4= ruleHeaderDepth5Expression | this_HeaderDepth6Expression_5= ruleHeaderDepth6Expression )";
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
                        if ( (LA2_8==16) && (synpred1_InternalHammilDSL())) {s = 9;}

                        else if ( (LA2_8==9) ) {s = 3;}

                         
                        input.seek(index2_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_0 = input.LA(1);

                         
                        int index2_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_0==15) && (synpred1_InternalHammilDSL())) {s = 1;}

                        else if ( (LA2_0==RULE_STRING) ) {s = 2;}

                        else if ( (LA2_0==17) ) {s = 3;}

                        else if ( (LA2_0==18) ) {s = 4;}

                        else if ( (LA2_0==21) ) {s = 5;}

                        else if ( (LA2_0==19) ) {s = 6;}

                        else if ( (LA2_0==20) ) {s = 7;}

                         
                        input.seek(index2_0);
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
    static final String dfa_7s = "\6\uffff";
    static final String dfa_8s = "\1\1\1\uffff\2\4\2\uffff";
    static final String dfa_9s = "\1\4\1\uffff\2\4\2\uffff";
    static final String dfa_10s = "\1\25\1\uffff\2\25\2\uffff";
    static final String dfa_11s = "\1\uffff\1\2\2\uffff\2\1";
    static final String dfa_12s = "\6\uffff}>";
    static final String[] dfa_13s = {
            "\3\1\2\uffff\6\1\1\2\1\uffff\5\1",
            "",
            "\1\4\1\3\1\4\2\uffff\7\4\1\uffff\5\4",
            "\1\4\1\3\1\5\2\uffff\6\5\1\4\1\uffff\5\5",
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

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 562:4: (otherlv_3= '#' )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000003EFE42L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000009E40L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000008060L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000008032L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000212L});

}