package org.xtext.markhamill.mh.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.markhamill.mh.services.HamillDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHamillDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_DIGIT", "RULE_INT", "RULE_DOUBLE", "RULE_ANY_OTHER", "'#'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=8;
    public static final int RULE_DIGIT=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_SL_COMMENT=7;
    public static final int RULE_DOUBLE=11;
    public static final int RULE_INT=10;
    public static final int RULE_ML_COMMENT=6;
    public static final int T__13=13;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalHamillDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHamillDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHamillDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalHamillDsl.g"; }



     	private HamillDslGrammarAccess grammarAccess;

        public InternalHamillDslParser(TokenStream input, HamillDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "File";
       	}

       	@Override
       	protected HamillDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFile"
    // InternalHamillDsl.g:64:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // InternalHamillDsl.g:64:45: (iv_ruleFile= ruleFile EOF )
            // InternalHamillDsl.g:65:2: iv_ruleFile= ruleFile EOF
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
    // InternalHamillDsl.g:71:1: ruleFile returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleExpression ) )* ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalHamillDsl.g:77:2: ( ( () ( (lv_expression_1_0= ruleExpression ) )* ) )
            // InternalHamillDsl.g:78:2: ( () ( (lv_expression_1_0= ruleExpression ) )* )
            {
            // InternalHamillDsl.g:78:2: ( () ( (lv_expression_1_0= ruleExpression ) )* )
            // InternalHamillDsl.g:79:3: () ( (lv_expression_1_0= ruleExpression ) )*
            {
            // InternalHamillDsl.g:79:3: ()
            // InternalHamillDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFileAccess().getFileAction_0(),
            					current);
            			

            }

            // InternalHamillDsl.g:86:3: ( (lv_expression_1_0= ruleExpression ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalHamillDsl.g:87:4: (lv_expression_1_0= ruleExpression )
            	    {
            	    // InternalHamillDsl.g:87:4: (lv_expression_1_0= ruleExpression )
            	    // InternalHamillDsl.g:88:5: lv_expression_1_0= ruleExpression
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
            	    						"org.xtext.markhamill.mh.HamillDsl.Expression");
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
    // InternalHamillDsl.g:109:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalHamillDsl.g:109:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalHamillDsl.g:110:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalHamillDsl.g:116:1: ruleExpression returns [EObject current=null] : this_HeaderExpression_0= ruleHeaderExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_HeaderExpression_0 = null;



        	enterRule();

        try {
            // InternalHamillDsl.g:122:2: (this_HeaderExpression_0= ruleHeaderExpression )
            // InternalHamillDsl.g:123:2: this_HeaderExpression_0= ruleHeaderExpression
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getHeaderExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_HeaderExpression_0=ruleHeaderExpression();

            state._fsp--;


            		current = this_HeaderExpression_0;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleHeaderExpression"
    // InternalHamillDsl.g:134:1: entryRuleHeaderExpression returns [EObject current=null] : iv_ruleHeaderExpression= ruleHeaderExpression EOF ;
    public final EObject entryRuleHeaderExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderExpression = null;


        try {
            // InternalHamillDsl.g:134:57: (iv_ruleHeaderExpression= ruleHeaderExpression EOF )
            // InternalHamillDsl.g:135:2: iv_ruleHeaderExpression= ruleHeaderExpression EOF
            {
             newCompositeNode(grammarAccess.getHeaderExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeaderExpression=ruleHeaderExpression();

            state._fsp--;

             current =iv_ruleHeaderExpression; 
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
    // $ANTLR end "entryRuleHeaderExpression"


    // $ANTLR start "ruleHeaderExpression"
    // InternalHamillDsl.g:141:1: ruleHeaderExpression returns [EObject current=null] : this_HeaderDepth1Expression_0= ruleHeaderDepth1Expression ;
    public final EObject ruleHeaderExpression() throws RecognitionException {
        EObject current = null;

        EObject this_HeaderDepth1Expression_0 = null;



        	enterRule();

        try {
            // InternalHamillDsl.g:147:2: (this_HeaderDepth1Expression_0= ruleHeaderDepth1Expression )
            // InternalHamillDsl.g:148:2: this_HeaderDepth1Expression_0= ruleHeaderDepth1Expression
            {

            		newCompositeNode(grammarAccess.getHeaderExpressionAccess().getHeaderDepth1ExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_HeaderDepth1Expression_0=ruleHeaderDepth1Expression();

            state._fsp--;


            		current = this_HeaderDepth1Expression_0;
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
    // $ANTLR end "ruleHeaderExpression"


    // $ANTLR start "entryRuleHeaderDepth1Expression"
    // InternalHamillDsl.g:159:1: entryRuleHeaderDepth1Expression returns [EObject current=null] : iv_ruleHeaderDepth1Expression= ruleHeaderDepth1Expression EOF ;
    public final EObject entryRuleHeaderDepth1Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderDepth1Expression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalHamillDsl.g:161:2: (iv_ruleHeaderDepth1Expression= ruleHeaderDepth1Expression EOF )
            // InternalHamillDsl.g:162:2: iv_ruleHeaderDepth1Expression= ruleHeaderDepth1Expression EOF
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
    // InternalHamillDsl.g:171:1: ruleHeaderDepth1Expression returns [EObject current=null] : (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleHeaderDepth1Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalHamillDsl.g:178:2: ( (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalHamillDsl.g:179:2: (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalHamillDsl.g:179:2: (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) )
            // InternalHamillDsl.g:180:3: otherlv_0= '#' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0());
            		
            // InternalHamillDsl.g:184:3: ( (otherlv_1= RULE_ID ) )
            // InternalHamillDsl.g:185:4: (otherlv_1= RULE_ID )
            {
            // InternalHamillDsl.g:185:4: (otherlv_1= RULE_ID )
            // InternalHamillDsl.g:186:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHeaderDepth1ExpressionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getHeaderDepth1ExpressionAccess().getContentTextualExpressionCrossReference_1_0());
            				

            }


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
    // $ANTLR end "ruleHeaderDepth1Expression"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});

}