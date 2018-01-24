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

@SuppressWarnings("all")
public class InternalHammilDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_S", "RULE_DIGIT", "RULE_INT", "RULE_DOUBLE", "RULE_ID", "RULE_WS", "RULE_ANY_OTHER", "'>'", "'#'", "'='", "'##'", "'-'", "'###'", "'#####'", "'######'", "'####'"
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
    public static final int T__23=23;
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
             newCompositeNode(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFile=ruleFile();

            state._fsp--;

             current =iv_ruleFile; 
            match(input,EOF,FOLLOW_2); 

            }

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

            				current = forceCreateModelElement(
            					grammarAccess.getFileAccess().getFileAction_0(),
            					current);
            			

            }

            // InternalHammilDSL.g:86:3: ( (lv_expression_1_0= ruleExpression ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_STRING||(LA1_0>=15 && LA1_0<=16)||LA1_0==18||(LA1_0>=20 && LA1_0<=23)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalHammilDSL.g:87:4: (lv_expression_1_0= ruleExpression )
            	    {
            	    // InternalHammilDSL.g:87:4: (lv_expression_1_0= ruleExpression )
            	    // InternalHammilDSL.g:88:5: lv_expression_1_0= ruleExpression
            	    {

            	    					newCompositeNode(grammarAccess.getFileAccess().getExpressionExpressionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_expression_1_0=ruleExpression();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalHammilDSL.g:116:1: ruleExpression returns [EObject current=null] : (this_QuoteExpression_0= ruleQuoteExpression | this_HeaderDepth1Expression_1= ruleHeaderDepth1Expression | this_HeaderDepth2Expression_2= ruleHeaderDepth2Expression | this_HeaderDepth3Expression_3= ruleHeaderDepth3Expression | this_HeaderDepth4Expression_4= ruleHeaderDepth4Expression | this_HeaderDepth5Expression_5= ruleHeaderDepth5Expression | this_HeaderDepth6Expression_6= ruleHeaderDepth6Expression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_QuoteExpression_0 = null;

        EObject this_HeaderDepth1Expression_1 = null;

        EObject this_HeaderDepth2Expression_2 = null;

        EObject this_HeaderDepth3Expression_3 = null;

        EObject this_HeaderDepth4Expression_4 = null;

        EObject this_HeaderDepth5Expression_5 = null;

        EObject this_HeaderDepth6Expression_6 = null;



        	enterRule();

        try {
            // InternalHammilDSL.g:122:2: ( (this_QuoteExpression_0= ruleQuoteExpression | this_HeaderDepth1Expression_1= ruleHeaderDepth1Expression | this_HeaderDepth2Expression_2= ruleHeaderDepth2Expression | this_HeaderDepth3Expression_3= ruleHeaderDepth3Expression | this_HeaderDepth4Expression_4= ruleHeaderDepth4Expression | this_HeaderDepth5Expression_5= ruleHeaderDepth5Expression | this_HeaderDepth6Expression_6= ruleHeaderDepth6Expression ) )
            // InternalHammilDSL.g:123:2: (this_QuoteExpression_0= ruleQuoteExpression | this_HeaderDepth1Expression_1= ruleHeaderDepth1Expression | this_HeaderDepth2Expression_2= ruleHeaderDepth2Expression | this_HeaderDepth3Expression_3= ruleHeaderDepth3Expression | this_HeaderDepth4Expression_4= ruleHeaderDepth4Expression | this_HeaderDepth5Expression_5= ruleHeaderDepth5Expression | this_HeaderDepth6Expression_6= ruleHeaderDepth6Expression )
            {
            // InternalHammilDSL.g:123:2: (this_QuoteExpression_0= ruleQuoteExpression | this_HeaderDepth1Expression_1= ruleHeaderDepth1Expression | this_HeaderDepth2Expression_2= ruleHeaderDepth2Expression | this_HeaderDepth3Expression_3= ruleHeaderDepth3Expression | this_HeaderDepth4Expression_4= ruleHeaderDepth4Expression | this_HeaderDepth5Expression_5= ruleHeaderDepth5Expression | this_HeaderDepth6Expression_6= ruleHeaderDepth6Expression )
            int alt2=7;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalHammilDSL.g:124:3: this_QuoteExpression_0= ruleQuoteExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getQuoteExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_QuoteExpression_0=ruleQuoteExpression();

                    state._fsp--;


                    			current = this_QuoteExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHammilDSL.g:133:3: this_HeaderDepth1Expression_1= ruleHeaderDepth1Expression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getHeaderDepth1ExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_HeaderDepth1Expression_1=ruleHeaderDepth1Expression();

                    state._fsp--;


                    			current = this_HeaderDepth1Expression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalHammilDSL.g:142:3: this_HeaderDepth2Expression_2= ruleHeaderDepth2Expression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getHeaderDepth2ExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_HeaderDepth2Expression_2=ruleHeaderDepth2Expression();

                    state._fsp--;


                    			current = this_HeaderDepth2Expression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalHammilDSL.g:151:3: this_HeaderDepth3Expression_3= ruleHeaderDepth3Expression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getHeaderDepth3ExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_HeaderDepth3Expression_3=ruleHeaderDepth3Expression();

                    state._fsp--;


                    			current = this_HeaderDepth3Expression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalHammilDSL.g:160:3: this_HeaderDepth4Expression_4= ruleHeaderDepth4Expression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getHeaderDepth4ExpressionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_HeaderDepth4Expression_4=ruleHeaderDepth4Expression();

                    state._fsp--;


                    			current = this_HeaderDepth4Expression_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalHammilDSL.g:169:3: this_HeaderDepth5Expression_5= ruleHeaderDepth5Expression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getHeaderDepth5ExpressionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_HeaderDepth5Expression_5=ruleHeaderDepth5Expression();

                    state._fsp--;


                    			current = this_HeaderDepth5Expression_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalHammilDSL.g:178:3: this_HeaderDepth6Expression_6= ruleHeaderDepth6Expression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getHeaderDepth6ExpressionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_HeaderDepth6Expression_6=ruleHeaderDepth6Expression();

                    state._fsp--;


                    			current = this_HeaderDepth6Expression_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalHammilDSL.g:190:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // InternalHammilDSL.g:190:55: (iv_ruleTextExpression= ruleTextExpression EOF )
            // InternalHammilDSL.g:191:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
             newCompositeNode(grammarAccess.getTextExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextExpression=ruleTextExpression();

            state._fsp--;

             current =iv_ruleTextExpression; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalHammilDSL.g:197:1: ruleTextExpression returns [EObject current=null] : (this_TextualExpression_0= ruleTextualExpression | this_QuoteExpression_1= ruleQuoteExpression ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TextualExpression_0 = null;

        EObject this_QuoteExpression_1 = null;



        	enterRule();

        try {
            // InternalHammilDSL.g:203:2: ( (this_TextualExpression_0= ruleTextualExpression | this_QuoteExpression_1= ruleQuoteExpression ) )
            // InternalHammilDSL.g:204:2: (this_TextualExpression_0= ruleTextualExpression | this_QuoteExpression_1= ruleQuoteExpression )
            {
            // InternalHammilDSL.g:204:2: (this_TextualExpression_0= ruleTextualExpression | this_QuoteExpression_1= ruleQuoteExpression )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalHammilDSL.g:205:3: this_TextualExpression_0= ruleTextualExpression
                    {

                    			newCompositeNode(grammarAccess.getTextExpressionAccess().getTextualExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextualExpression_0=ruleTextualExpression();

                    state._fsp--;


                    			current = this_TextualExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHammilDSL.g:214:3: this_QuoteExpression_1= ruleQuoteExpression
                    {

                    			newCompositeNode(grammarAccess.getTextExpressionAccess().getQuoteExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_QuoteExpression_1=ruleQuoteExpression();

                    state._fsp--;


                    			current = this_QuoteExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalHammilDSL.g:226:1: entryRuleEmphasisExpression returns [EObject current=null] : iv_ruleEmphasisExpression= ruleEmphasisExpression EOF ;
    public final EObject entryRuleEmphasisExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmphasisExpression = null;


        try {
            // InternalHammilDSL.g:226:59: (iv_ruleEmphasisExpression= ruleEmphasisExpression EOF )
            // InternalHammilDSL.g:227:2: iv_ruleEmphasisExpression= ruleEmphasisExpression EOF
            {
             newCompositeNode(grammarAccess.getEmphasisExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmphasisExpression=ruleEmphasisExpression();

            state._fsp--;

             current =iv_ruleEmphasisExpression; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalHammilDSL.g:233:1: ruleEmphasisExpression returns [EObject current=null] : this_TextualExpression_0= ruleTextualExpression ;
    public final EObject ruleEmphasisExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TextualExpression_0 = null;



        	enterRule();

        try {
            // InternalHammilDSL.g:239:2: (this_TextualExpression_0= ruleTextualExpression )
            // InternalHammilDSL.g:240:2: this_TextualExpression_0= ruleTextualExpression
            {

            		newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getTextualExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_TextualExpression_0=ruleTextualExpression();

            state._fsp--;


            		current = this_TextualExpression_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

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


    // $ANTLR start "entryRuleQuoteExpression"
    // InternalHammilDSL.g:251:1: entryRuleQuoteExpression returns [EObject current=null] : iv_ruleQuoteExpression= ruleQuoteExpression EOF ;
    public final EObject entryRuleQuoteExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuoteExpression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:253:2: (iv_ruleQuoteExpression= ruleQuoteExpression EOF )
            // InternalHammilDSL.g:254:2: iv_ruleQuoteExpression= ruleQuoteExpression EOF
            {
             newCompositeNode(grammarAccess.getQuoteExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuoteExpression=ruleQuoteExpression();

            state._fsp--;

             current =iv_ruleQuoteExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuoteExpression"


    // $ANTLR start "ruleQuoteExpression"
    // InternalHammilDSL.g:263:1: ruleQuoteExpression returns [EObject current=null] : (otherlv_0= '>' ( (lv_textexpression_1_0= ruleTextExpression ) ) (this_BL_2= RULE_BL )? ) ;
    public final EObject ruleQuoteExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BL_2=null;
        EObject lv_textexpression_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:270:2: ( (otherlv_0= '>' ( (lv_textexpression_1_0= ruleTextExpression ) ) (this_BL_2= RULE_BL )? ) )
            // InternalHammilDSL.g:271:2: (otherlv_0= '>' ( (lv_textexpression_1_0= ruleTextExpression ) ) (this_BL_2= RULE_BL )? )
            {
            // InternalHammilDSL.g:271:2: (otherlv_0= '>' ( (lv_textexpression_1_0= ruleTextExpression ) ) (this_BL_2= RULE_BL )? )
            // InternalHammilDSL.g:272:3: otherlv_0= '>' ( (lv_textexpression_1_0= ruleTextExpression ) ) (this_BL_2= RULE_BL )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getQuoteExpressionAccess().getGreaterThanSignKeyword_0());
            		
            // InternalHammilDSL.g:276:3: ( (lv_textexpression_1_0= ruleTextExpression ) )
            // InternalHammilDSL.g:277:4: (lv_textexpression_1_0= ruleTextExpression )
            {
            // InternalHammilDSL.g:277:4: (lv_textexpression_1_0= ruleTextExpression )
            // InternalHammilDSL.g:278:5: lv_textexpression_1_0= ruleTextExpression
            {

            					newCompositeNode(grammarAccess.getQuoteExpressionAccess().getTextexpressionTextExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_textexpression_1_0=ruleTextExpression();

            state._fsp--;


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

            // InternalHammilDSL.g:295:3: (this_BL_2= RULE_BL )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_BL) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalHammilDSL.g:296:4: this_BL_2= RULE_BL
                    {
                    this_BL_2=(Token)match(input,RULE_BL,FOLLOW_2); 

                    				newLeafNode(this_BL_2, grammarAccess.getQuoteExpressionAccess().getBLTerminalRuleCall_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // $ANTLR end "ruleQuoteExpression"


    // $ANTLR start "entryRuleHeaderDepth1Expression"
    // InternalHammilDSL.g:308:1: entryRuleHeaderDepth1Expression returns [EObject current=null] : iv_ruleHeaderDepth1Expression= ruleHeaderDepth1Expression EOF ;
    public final EObject entryRuleHeaderDepth1Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderDepth1Expression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:310:2: (iv_ruleHeaderDepth1Expression= ruleHeaderDepth1Expression EOF )
            // InternalHammilDSL.g:311:2: iv_ruleHeaderDepth1Expression= ruleHeaderDepth1Expression EOF
            {
             newCompositeNode(grammarAccess.getHeaderDepth1ExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeaderDepth1Expression=ruleHeaderDepth1Expression();

            state._fsp--;

             current =iv_ruleHeaderDepth1Expression; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalHammilDSL.g:320:1: ruleHeaderDepth1Expression returns [EObject current=null] : ( (otherlv_0= '#' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '=' )+ (this_BL_7= RULE_BL )? ) ) ;
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
            // InternalHammilDSL.g:327:2: ( ( (otherlv_0= '#' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '=' )+ (this_BL_7= RULE_BL )? ) ) )
            // InternalHammilDSL.g:328:2: ( (otherlv_0= '#' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '=' )+ (this_BL_7= RULE_BL )? ) )
            {
            // InternalHammilDSL.g:328:2: ( (otherlv_0= '#' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '=' )+ (this_BL_7= RULE_BL )? ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_STRING) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalHammilDSL.g:329:3: (otherlv_0= '#' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
                    {
                    // InternalHammilDSL.g:329:3: (otherlv_0= '#' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
                    // InternalHammilDSL.g:330:4: otherlv_0= '#' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )?
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0_0());
                    			
                    // InternalHammilDSL.g:334:4: ( (lv_title_1_0= ruleEmphasisExpression ) )
                    // InternalHammilDSL.g:335:5: (lv_title_1_0= ruleEmphasisExpression )
                    {
                    // InternalHammilDSL.g:335:5: (lv_title_1_0= ruleEmphasisExpression )
                    // InternalHammilDSL.g:336:6: lv_title_1_0= ruleEmphasisExpression
                    {

                    						newCompositeNode(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_title_1_0=ruleEmphasisExpression();

                    state._fsp--;


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

                    // InternalHammilDSL.g:353:4: (otherlv_2= '#' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            int LA5_2 = input.LA(2);

                            if ( (LA5_2==RULE_STRING) ) {
                                int LA5_3 = input.LA(3);

                                if ( (LA5_3==RULE_BL) ) {
                                    int LA5_5 = input.LA(4);

                                    if ( (LA5_5==17||LA5_5==19) ) {
                                        alt5=1;
                                    }


                                }


                            }
                            else if ( (LA5_2==EOF||LA5_2==RULE_BL||(LA5_2>=15 && LA5_2<=16)||LA5_2==18||(LA5_2>=20 && LA5_2<=23)) ) {
                                alt5=1;
                            }


                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalHammilDSL.g:354:5: otherlv_2= '#'
                    	    {
                    	    otherlv_2=(Token)match(input,16,FOLLOW_7); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0_2());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // InternalHammilDSL.g:359:4: (this_BL_3= RULE_BL )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_BL) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalHammilDSL.g:360:5: this_BL_3= RULE_BL
                            {
                            this_BL_3=(Token)match(input,RULE_BL,FOLLOW_2); 

                            					newLeafNode(this_BL_3, grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_0_3());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHammilDSL.g:367:3: ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '=' )+ (this_BL_7= RULE_BL )? )
                    {
                    // InternalHammilDSL.g:367:3: ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '=' )+ (this_BL_7= RULE_BL )? )
                    // InternalHammilDSL.g:368:4: ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '=' )+ (this_BL_7= RULE_BL )?
                    {
                    // InternalHammilDSL.g:368:4: ( (lv_title_4_0= ruleEmphasisExpression ) )
                    // InternalHammilDSL.g:369:5: (lv_title_4_0= ruleEmphasisExpression )
                    {
                    // InternalHammilDSL.g:369:5: (lv_title_4_0= ruleEmphasisExpression )
                    // InternalHammilDSL.g:370:6: lv_title_4_0= ruleEmphasisExpression
                    {

                    						newCompositeNode(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_title_4_0=ruleEmphasisExpression();

                    state._fsp--;


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

                    this_BL_5=(Token)match(input,RULE_BL,FOLLOW_9); 

                    				newLeafNode(this_BL_5, grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_1_1());
                    			
                    // InternalHammilDSL.g:391:4: (otherlv_6= '=' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==17) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalHammilDSL.g:392:5: otherlv_6= '='
                    	    {
                    	    otherlv_6=(Token)match(input,17,FOLLOW_10); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getHeaderDepth1ExpressionAccess().getEqualsSignKeyword_1_2());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    // InternalHammilDSL.g:397:4: (this_BL_7= RULE_BL )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_BL) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalHammilDSL.g:398:5: this_BL_7= RULE_BL
                            {
                            this_BL_7=(Token)match(input,RULE_BL,FOLLOW_2); 

                            					newLeafNode(this_BL_7, grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_1_3());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalHammilDSL.g:411:1: entryRuleHeaderDepth2Expression returns [EObject current=null] : iv_ruleHeaderDepth2Expression= ruleHeaderDepth2Expression EOF ;
    public final EObject entryRuleHeaderDepth2Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderDepth2Expression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:413:2: (iv_ruleHeaderDepth2Expression= ruleHeaderDepth2Expression EOF )
            // InternalHammilDSL.g:414:2: iv_ruleHeaderDepth2Expression= ruleHeaderDepth2Expression EOF
            {
             newCompositeNode(grammarAccess.getHeaderDepth2ExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeaderDepth2Expression=ruleHeaderDepth2Expression();

            state._fsp--;

             current =iv_ruleHeaderDepth2Expression; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalHammilDSL.g:423:1: ruleHeaderDepth2Expression returns [EObject current=null] : ( (otherlv_0= '##' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '-' )+ (this_BL_7= RULE_BL )? ) ) ;
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
            // InternalHammilDSL.g:430:2: ( ( (otherlv_0= '##' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '-' )+ (this_BL_7= RULE_BL )? ) ) )
            // InternalHammilDSL.g:431:2: ( (otherlv_0= '##' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '-' )+ (this_BL_7= RULE_BL )? ) )
            {
            // InternalHammilDSL.g:431:2: ( (otherlv_0= '##' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '-' )+ (this_BL_7= RULE_BL )? ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_STRING) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalHammilDSL.g:432:3: (otherlv_0= '##' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
                    {
                    // InternalHammilDSL.g:432:3: (otherlv_0= '##' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
                    // InternalHammilDSL.g:433:4: otherlv_0= '##' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )?
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getHeaderDepth2ExpressionAccess().getNumberSignNumberSignKeyword_0_0());
                    			
                    // InternalHammilDSL.g:437:4: ( (lv_title_1_0= ruleEmphasisExpression ) )
                    // InternalHammilDSL.g:438:5: (lv_title_1_0= ruleEmphasisExpression )
                    {
                    // InternalHammilDSL.g:438:5: (lv_title_1_0= ruleEmphasisExpression )
                    // InternalHammilDSL.g:439:6: lv_title_1_0= ruleEmphasisExpression
                    {

                    						newCompositeNode(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_title_1_0=ruleEmphasisExpression();

                    state._fsp--;


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

                    // InternalHammilDSL.g:456:4: (otherlv_2= '#' )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==16) ) {
                            int LA10_2 = input.LA(2);

                            if ( (LA10_2==RULE_STRING) ) {
                                int LA10_3 = input.LA(3);

                                if ( (LA10_3==RULE_BL) ) {
                                    int LA10_5 = input.LA(4);

                                    if ( (LA10_5==17||LA10_5==19) ) {
                                        alt10=1;
                                    }


                                }


                            }
                            else if ( (LA10_2==EOF||LA10_2==RULE_BL||(LA10_2>=15 && LA10_2<=16)||LA10_2==18||(LA10_2>=20 && LA10_2<=23)) ) {
                                alt10=1;
                            }


                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalHammilDSL.g:457:5: otherlv_2= '#'
                    	    {
                    	    otherlv_2=(Token)match(input,16,FOLLOW_7); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getHeaderDepth2ExpressionAccess().getNumberSignKeyword_0_2());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    // InternalHammilDSL.g:462:4: (this_BL_3= RULE_BL )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_BL) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalHammilDSL.g:463:5: this_BL_3= RULE_BL
                            {
                            this_BL_3=(Token)match(input,RULE_BL,FOLLOW_2); 

                            					newLeafNode(this_BL_3, grammarAccess.getHeaderDepth2ExpressionAccess().getBLTerminalRuleCall_0_3());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHammilDSL.g:470:3: ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '-' )+ (this_BL_7= RULE_BL )? )
                    {
                    // InternalHammilDSL.g:470:3: ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '-' )+ (this_BL_7= RULE_BL )? )
                    // InternalHammilDSL.g:471:4: ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '-' )+ (this_BL_7= RULE_BL )?
                    {
                    // InternalHammilDSL.g:471:4: ( (lv_title_4_0= ruleEmphasisExpression ) )
                    // InternalHammilDSL.g:472:5: (lv_title_4_0= ruleEmphasisExpression )
                    {
                    // InternalHammilDSL.g:472:5: (lv_title_4_0= ruleEmphasisExpression )
                    // InternalHammilDSL.g:473:6: lv_title_4_0= ruleEmphasisExpression
                    {

                    						newCompositeNode(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_title_4_0=ruleEmphasisExpression();

                    state._fsp--;


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

                    this_BL_5=(Token)match(input,RULE_BL,FOLLOW_11); 

                    				newLeafNode(this_BL_5, grammarAccess.getHeaderDepth2ExpressionAccess().getBLTerminalRuleCall_1_1());
                    			
                    // InternalHammilDSL.g:494:4: (otherlv_6= '-' )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==19) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalHammilDSL.g:495:5: otherlv_6= '-'
                    	    {
                    	    otherlv_6=(Token)match(input,19,FOLLOW_12); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getHeaderDepth2ExpressionAccess().getHyphenMinusKeyword_1_2());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    // InternalHammilDSL.g:500:4: (this_BL_7= RULE_BL )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_BL) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalHammilDSL.g:501:5: this_BL_7= RULE_BL
                            {
                            this_BL_7=(Token)match(input,RULE_BL,FOLLOW_2); 

                            					newLeafNode(this_BL_7, grammarAccess.getHeaderDepth2ExpressionAccess().getBLTerminalRuleCall_1_3());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalHammilDSL.g:514:1: entryRuleHeaderDepth3Expression returns [EObject current=null] : iv_ruleHeaderDepth3Expression= ruleHeaderDepth3Expression EOF ;
    public final EObject entryRuleHeaderDepth3Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderDepth3Expression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:516:2: (iv_ruleHeaderDepth3Expression= ruleHeaderDepth3Expression EOF )
            // InternalHammilDSL.g:517:2: iv_ruleHeaderDepth3Expression= ruleHeaderDepth3Expression EOF
            {
             newCompositeNode(grammarAccess.getHeaderDepth3ExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeaderDepth3Expression=ruleHeaderDepth3Expression();

            state._fsp--;

             current =iv_ruleHeaderDepth3Expression; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalHammilDSL.g:526:1: ruleHeaderDepth3Expression returns [EObject current=null] : (otherlv_0= '###' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) ;
    public final EObject ruleHeaderDepth3Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_BL_3=null;
        EObject lv_title_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:533:2: ( (otherlv_0= '###' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) )
            // InternalHammilDSL.g:534:2: (otherlv_0= '###' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            {
            // InternalHammilDSL.g:534:2: (otherlv_0= '###' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            // InternalHammilDSL.g:535:3: otherlv_0= '###' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getHeaderDepth3ExpressionAccess().getNumberSignNumberSignNumberSignKeyword_0());
            		
            // InternalHammilDSL.g:539:3: ( (lv_title_1_0= ruleEmphasisExpression ) )
            // InternalHammilDSL.g:540:4: (lv_title_1_0= ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:540:4: (lv_title_1_0= ruleEmphasisExpression )
            // InternalHammilDSL.g:541:5: lv_title_1_0= ruleEmphasisExpression
            {

            					newCompositeNode(grammarAccess.getHeaderDepth3ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_title_1_0=ruleEmphasisExpression();

            state._fsp--;


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

            // InternalHammilDSL.g:558:3: (otherlv_2= '#' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==RULE_STRING) ) {
                        int LA15_3 = input.LA(3);

                        if ( (LA15_3==RULE_BL) ) {
                            int LA15_5 = input.LA(4);

                            if ( (LA15_5==17||LA15_5==19) ) {
                                alt15=1;
                            }


                        }


                    }
                    else if ( (LA15_2==EOF||LA15_2==RULE_BL||(LA15_2>=15 && LA15_2<=16)||LA15_2==18||(LA15_2>=20 && LA15_2<=23)) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalHammilDSL.g:559:4: otherlv_2= '#'
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getHeaderDepth3ExpressionAccess().getNumberSignKeyword_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalHammilDSL.g:564:3: (this_BL_3= RULE_BL )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_BL) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalHammilDSL.g:565:4: this_BL_3= RULE_BL
                    {
                    this_BL_3=(Token)match(input,RULE_BL,FOLLOW_2); 

                    				newLeafNode(this_BL_3, grammarAccess.getHeaderDepth3ExpressionAccess().getBLTerminalRuleCall_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalHammilDSL.g:577:1: entryRuleHeaderDepth5Expression returns [EObject current=null] : iv_ruleHeaderDepth5Expression= ruleHeaderDepth5Expression EOF ;
    public final EObject entryRuleHeaderDepth5Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderDepth5Expression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:579:2: (iv_ruleHeaderDepth5Expression= ruleHeaderDepth5Expression EOF )
            // InternalHammilDSL.g:580:2: iv_ruleHeaderDepth5Expression= ruleHeaderDepth5Expression EOF
            {
             newCompositeNode(grammarAccess.getHeaderDepth5ExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeaderDepth5Expression=ruleHeaderDepth5Expression();

            state._fsp--;

             current =iv_ruleHeaderDepth5Expression; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalHammilDSL.g:589:1: ruleHeaderDepth5Expression returns [EObject current=null] : (otherlv_0= '#####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) ;
    public final EObject ruleHeaderDepth5Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_BL_3=null;
        EObject lv_title_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:596:2: ( (otherlv_0= '#####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) )
            // InternalHammilDSL.g:597:2: (otherlv_0= '#####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            {
            // InternalHammilDSL.g:597:2: (otherlv_0= '#####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            // InternalHammilDSL.g:598:3: otherlv_0= '#####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getHeaderDepth5ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_0());
            		
            // InternalHammilDSL.g:602:3: ( (lv_title_1_0= ruleEmphasisExpression ) )
            // InternalHammilDSL.g:603:4: (lv_title_1_0= ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:603:4: (lv_title_1_0= ruleEmphasisExpression )
            // InternalHammilDSL.g:604:5: lv_title_1_0= ruleEmphasisExpression
            {

            					newCompositeNode(grammarAccess.getHeaderDepth5ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_title_1_0=ruleEmphasisExpression();

            state._fsp--;


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

            // InternalHammilDSL.g:621:3: (otherlv_2= '#' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    int LA17_2 = input.LA(2);

                    if ( (LA17_2==RULE_STRING) ) {
                        int LA17_3 = input.LA(3);

                        if ( (LA17_3==RULE_BL) ) {
                            int LA17_5 = input.LA(4);

                            if ( (LA17_5==17||LA17_5==19) ) {
                                alt17=1;
                            }


                        }


                    }
                    else if ( (LA17_2==EOF||LA17_2==RULE_BL||(LA17_2>=15 && LA17_2<=16)||LA17_2==18||(LA17_2>=20 && LA17_2<=23)) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // InternalHammilDSL.g:622:4: otherlv_2= '#'
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getHeaderDepth5ExpressionAccess().getNumberSignKeyword_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalHammilDSL.g:627:3: (this_BL_3= RULE_BL )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_BL) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalHammilDSL.g:628:4: this_BL_3= RULE_BL
                    {
                    this_BL_3=(Token)match(input,RULE_BL,FOLLOW_2); 

                    				newLeafNode(this_BL_3, grammarAccess.getHeaderDepth5ExpressionAccess().getBLTerminalRuleCall_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalHammilDSL.g:640:1: entryRuleHeaderDepth6Expression returns [EObject current=null] : iv_ruleHeaderDepth6Expression= ruleHeaderDepth6Expression EOF ;
    public final EObject entryRuleHeaderDepth6Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderDepth6Expression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:642:2: (iv_ruleHeaderDepth6Expression= ruleHeaderDepth6Expression EOF )
            // InternalHammilDSL.g:643:2: iv_ruleHeaderDepth6Expression= ruleHeaderDepth6Expression EOF
            {
             newCompositeNode(grammarAccess.getHeaderDepth6ExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeaderDepth6Expression=ruleHeaderDepth6Expression();

            state._fsp--;

             current =iv_ruleHeaderDepth6Expression; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalHammilDSL.g:652:1: ruleHeaderDepth6Expression returns [EObject current=null] : (otherlv_0= '######' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) ;
    public final EObject ruleHeaderDepth6Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_BL_3=null;
        EObject lv_title_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:659:2: ( (otherlv_0= '######' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) )
            // InternalHammilDSL.g:660:2: (otherlv_0= '######' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            {
            // InternalHammilDSL.g:660:2: (otherlv_0= '######' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            // InternalHammilDSL.g:661:3: otherlv_0= '######' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getHeaderDepth6ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_0());
            		
            // InternalHammilDSL.g:665:3: ( (lv_title_1_0= ruleEmphasisExpression ) )
            // InternalHammilDSL.g:666:4: (lv_title_1_0= ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:666:4: (lv_title_1_0= ruleEmphasisExpression )
            // InternalHammilDSL.g:667:5: lv_title_1_0= ruleEmphasisExpression
            {

            					newCompositeNode(grammarAccess.getHeaderDepth6ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_title_1_0=ruleEmphasisExpression();

            state._fsp--;


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

            // InternalHammilDSL.g:684:3: (otherlv_2= '#' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==16) ) {
                    int LA19_2 = input.LA(2);

                    if ( (LA19_2==RULE_STRING) ) {
                        int LA19_3 = input.LA(3);

                        if ( (LA19_3==RULE_BL) ) {
                            int LA19_5 = input.LA(4);

                            if ( (LA19_5==17||LA19_5==19) ) {
                                alt19=1;
                            }


                        }


                    }
                    else if ( (LA19_2==EOF||LA19_2==RULE_BL||(LA19_2>=15 && LA19_2<=16)||LA19_2==18||(LA19_2>=20 && LA19_2<=23)) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalHammilDSL.g:685:4: otherlv_2= '#'
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getHeaderDepth6ExpressionAccess().getNumberSignKeyword_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalHammilDSL.g:690:3: (this_BL_3= RULE_BL )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_BL) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalHammilDSL.g:691:4: this_BL_3= RULE_BL
                    {
                    this_BL_3=(Token)match(input,RULE_BL,FOLLOW_2); 

                    				newLeafNode(this_BL_3, grammarAccess.getHeaderDepth6ExpressionAccess().getBLTerminalRuleCall_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalHammilDSL.g:703:1: entryRuleHeaderDepth4Expression returns [EObject current=null] : iv_ruleHeaderDepth4Expression= ruleHeaderDepth4Expression EOF ;
    public final EObject entryRuleHeaderDepth4Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderDepth4Expression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:705:2: (iv_ruleHeaderDepth4Expression= ruleHeaderDepth4Expression EOF )
            // InternalHammilDSL.g:706:2: iv_ruleHeaderDepth4Expression= ruleHeaderDepth4Expression EOF
            {
             newCompositeNode(grammarAccess.getHeaderDepth4ExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeaderDepth4Expression=ruleHeaderDepth4Expression();

            state._fsp--;

             current =iv_ruleHeaderDepth4Expression; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalHammilDSL.g:715:1: ruleHeaderDepth4Expression returns [EObject current=null] : (otherlv_0= '####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) ;
    public final EObject ruleHeaderDepth4Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_BL_3=null;
        EObject lv_title_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:722:2: ( (otherlv_0= '####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) )
            // InternalHammilDSL.g:723:2: (otherlv_0= '####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            {
            // InternalHammilDSL.g:723:2: (otherlv_0= '####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            // InternalHammilDSL.g:724:3: otherlv_0= '####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getHeaderDepth4ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignKeyword_0());
            		
            // InternalHammilDSL.g:728:3: ( (lv_title_1_0= ruleEmphasisExpression ) )
            // InternalHammilDSL.g:729:4: (lv_title_1_0= ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:729:4: (lv_title_1_0= ruleEmphasisExpression )
            // InternalHammilDSL.g:730:5: lv_title_1_0= ruleEmphasisExpression
            {

            					newCompositeNode(grammarAccess.getHeaderDepth4ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_title_1_0=ruleEmphasisExpression();

            state._fsp--;


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

            // InternalHammilDSL.g:747:3: (otherlv_2= '#' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==16) ) {
                    int LA21_2 = input.LA(2);

                    if ( (LA21_2==RULE_STRING) ) {
                        int LA21_3 = input.LA(3);

                        if ( (LA21_3==RULE_BL) ) {
                            int LA21_5 = input.LA(4);

                            if ( (LA21_5==17||LA21_5==19) ) {
                                alt21=1;
                            }


                        }


                    }
                    else if ( (LA21_2==EOF||LA21_2==RULE_BL||(LA21_2>=15 && LA21_2<=16)||LA21_2==18||(LA21_2>=20 && LA21_2<=23)) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // InternalHammilDSL.g:748:4: otherlv_2= '#'
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getHeaderDepth4ExpressionAccess().getNumberSignKeyword_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // InternalHammilDSL.g:753:3: (this_BL_3= RULE_BL )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_BL) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalHammilDSL.g:754:4: this_BL_3= RULE_BL
                    {
                    this_BL_3=(Token)match(input,RULE_BL,FOLLOW_2); 

                    				newLeafNode(this_BL_3, grammarAccess.getHeaderDepth4ExpressionAccess().getBLTerminalRuleCall_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalHammilDSL.g:766:1: entryRuleTextualExpression returns [EObject current=null] : iv_ruleTextualExpression= ruleTextualExpression EOF ;
    public final EObject entryRuleTextualExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextualExpression = null;


        try {
            // InternalHammilDSL.g:766:58: (iv_ruleTextualExpression= ruleTextualExpression EOF )
            // InternalHammilDSL.g:767:2: iv_ruleTextualExpression= ruleTextualExpression EOF
            {
             newCompositeNode(grammarAccess.getTextualExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextualExpression=ruleTextualExpression();

            state._fsp--;

             current =iv_ruleTextualExpression; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalHammilDSL.g:773:1: ruleTextualExpression returns [EObject current=null] : ( (lv_contentString_0_0= ruleString0 ) ) ;
    public final EObject ruleTextualExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_contentString_0_0 = null;



        	enterRule();

        try {
            // InternalHammilDSL.g:779:2: ( ( (lv_contentString_0_0= ruleString0 ) ) )
            // InternalHammilDSL.g:780:2: ( (lv_contentString_0_0= ruleString0 ) )
            {
            // InternalHammilDSL.g:780:2: ( (lv_contentString_0_0= ruleString0 ) )
            // InternalHammilDSL.g:781:3: (lv_contentString_0_0= ruleString0 )
            {
            // InternalHammilDSL.g:781:3: (lv_contentString_0_0= ruleString0 )
            // InternalHammilDSL.g:782:4: lv_contentString_0_0= ruleString0
            {

            				newCompositeNode(grammarAccess.getTextualExpressionAccess().getContentStringString0ParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_contentString_0_0=ruleString0();

            state._fsp--;


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


            	leaveRule();

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
    // InternalHammilDSL.g:802:1: entryRuleString0 returns [String current=null] : iv_ruleString0= ruleString0 EOF ;
    public final String entryRuleString0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleString0 = null;


        try {
            // InternalHammilDSL.g:802:47: (iv_ruleString0= ruleString0 EOF )
            // InternalHammilDSL.g:803:2: iv_ruleString0= ruleString0 EOF
            {
             newCompositeNode(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleString0=ruleString0();

            state._fsp--;

             current =iv_ruleString0.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalHammilDSL.g:809:1: ruleString0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleString0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalHammilDSL.g:815:2: (this_STRING_0= RULE_STRING )
            // InternalHammilDSL.g:816:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getString0Access().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

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

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\5\2\uffff\1\4\5\uffff\1\21";
    static final String dfa_3s = "\1\27\2\uffff\1\4\5\uffff\1\23";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\uffff";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\11\uffff\1\1\1\2\1\uffff\1\4\1\uffff\1\5\1\7\1\10\1\6",
            "",
            "",
            "\1\11",
            "",
            "",
            "",
            "",
            "",
            "\1\2\1\uffff\1\4"
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
            return "123:2: (this_QuoteExpression_0= ruleQuoteExpression | this_HeaderDepth1Expression_1= ruleHeaderDepth1Expression | this_HeaderDepth2Expression_2= ruleHeaderDepth2Expression | this_HeaderDepth3Expression_3= ruleHeaderDepth3Expression | this_HeaderDepth4Expression_4= ruleHeaderDepth4Expression | this_HeaderDepth5Expression_5= ruleHeaderDepth5Expression | this_HeaderDepth6Expression_6= ruleHeaderDepth6Expression )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000F58022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000018020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080012L});

}