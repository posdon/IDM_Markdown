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

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BL", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_DIGIT", "RULE_INT", "RULE_ANY_OTHER", "'#'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_DIGIT=10;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=11;
    public static final int RULE_BL=4;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__13=13;
    public static final int EOF=-1;

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

            				current = forceCreateModelElement(
            					grammarAccess.getFileAccess().getFileAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:86:3: ( (lv_expression_1_0= ruleExpression ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:87:4: (lv_expression_1_0= ruleExpression )
            	    {
            	    // InternalMyDsl.g:87:4: (lv_expression_1_0= ruleExpression )
            	    // InternalMyDsl.g:88:5: lv_expression_1_0= ruleExpression
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
            	    						"markHammil.mm.MyDsl.Expression");
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
    // InternalMyDsl.g:109:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:109:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:110:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalMyDsl.g:116:1: ruleExpression returns [EObject current=null] : this_HeaderExpression_0= ruleHeaderExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_HeaderExpression_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:122:2: (this_HeaderExpression_0= ruleHeaderExpression )
            // InternalMyDsl.g:123:2: this_HeaderExpression_0= ruleHeaderExpression
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
    // InternalMyDsl.g:134:1: entryRuleHeaderExpression returns [EObject current=null] : iv_ruleHeaderExpression= ruleHeaderExpression EOF ;
    public final EObject entryRuleHeaderExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderExpression = null;


        try {
            // InternalMyDsl.g:134:57: (iv_ruleHeaderExpression= ruleHeaderExpression EOF )
            // InternalMyDsl.g:135:2: iv_ruleHeaderExpression= ruleHeaderExpression EOF
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
    // InternalMyDsl.g:141:1: ruleHeaderExpression returns [EObject current=null] : (otherlv_0= '#' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) ;
    public final EObject ruleHeaderExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_BL_3=null;
        EObject lv_title_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:147:2: ( (otherlv_0= '#' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) )
            // InternalMyDsl.g:148:2: (otherlv_0= '#' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            {
            // InternalMyDsl.g:148:2: (otherlv_0= '#' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            // InternalMyDsl.g:149:3: otherlv_0= '#' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getHeaderExpressionAccess().getNumberSignKeyword_0());
            		
            // InternalMyDsl.g:153:3: ( (lv_title_1_0= ruleEmphasisExpression ) )
            // InternalMyDsl.g:154:4: (lv_title_1_0= ruleEmphasisExpression )
            {
            // InternalMyDsl.g:154:4: (lv_title_1_0= ruleEmphasisExpression )
            // InternalMyDsl.g:155:5: lv_title_1_0= ruleEmphasisExpression
            {

            					newCompositeNode(grammarAccess.getHeaderExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_title_1_0=ruleEmphasisExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeaderExpressionRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_1_0,
            						"markHammil.mm.MyDsl.EmphasisExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:172:3: (otherlv_2= '#' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==EOF||LA2_2==RULE_BL||LA2_2==13) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:173:4: otherlv_2= '#'
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getHeaderExpressionAccess().getNumberSignKeyword_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalMyDsl.g:178:3: (this_BL_3= RULE_BL )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_BL) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:179:4: this_BL_3= RULE_BL
                    {
                    this_BL_3=(Token)match(input,RULE_BL,FOLLOW_2); 

                    				newLeafNode(this_BL_3, grammarAccess.getHeaderExpressionAccess().getBLTerminalRuleCall_3());
                    			

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
        }
        return current;
    }
    // $ANTLR end "ruleHeaderExpression"


    // $ANTLR start "entryRuleEmphasisExpression"
    // InternalMyDsl.g:188:1: entryRuleEmphasisExpression returns [EObject current=null] : iv_ruleEmphasisExpression= ruleEmphasisExpression EOF ;
    public final EObject entryRuleEmphasisExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmphasisExpression = null;


        try {
            // InternalMyDsl.g:188:59: (iv_ruleEmphasisExpression= ruleEmphasisExpression EOF )
            // InternalMyDsl.g:189:2: iv_ruleEmphasisExpression= ruleEmphasisExpression EOF
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
    // InternalMyDsl.g:195:1: ruleEmphasisExpression returns [EObject current=null] : this_NaturalExpression_0= ruleNaturalExpression ;
    public final EObject ruleEmphasisExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NaturalExpression_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:201:2: (this_NaturalExpression_0= ruleNaturalExpression )
            // InternalMyDsl.g:202:2: this_NaturalExpression_0= ruleNaturalExpression
            {

            		newCompositeNode(grammarAccess.getEmphasisExpressionAccess().getNaturalExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_NaturalExpression_0=ruleNaturalExpression();

            state._fsp--;


            		current = this_NaturalExpression_0;
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


    // $ANTLR start "entryRuleNaturalExpression"
    // InternalMyDsl.g:213:1: entryRuleNaturalExpression returns [EObject current=null] : iv_ruleNaturalExpression= ruleNaturalExpression EOF ;
    public final EObject entryRuleNaturalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalExpression = null;


        try {
            // InternalMyDsl.g:213:58: (iv_ruleNaturalExpression= ruleNaturalExpression EOF )
            // InternalMyDsl.g:214:2: iv_ruleNaturalExpression= ruleNaturalExpression EOF
            {
             newCompositeNode(grammarAccess.getNaturalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNaturalExpression=ruleNaturalExpression();

            state._fsp--;

             current =iv_ruleNaturalExpression; 
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
    // $ANTLR end "entryRuleNaturalExpression"


    // $ANTLR start "ruleNaturalExpression"
    // InternalMyDsl.g:220:1: ruleNaturalExpression returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_ID ) ) ) ;
    public final EObject ruleNaturalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:226:2: ( ( () ( (lv_value_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:227:2: ( () ( (lv_value_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:227:2: ( () ( (lv_value_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:228:3: () ( (lv_value_1_0= RULE_ID ) )
            {
            // InternalMyDsl.g:228:3: ()
            // InternalMyDsl.g:229:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNaturalExpressionAccess().getEmphasisExpressionAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:235:3: ( (lv_value_1_0= RULE_ID ) )
            // InternalMyDsl.g:236:4: (lv_value_1_0= RULE_ID )
            {
            // InternalMyDsl.g:236:4: (lv_value_1_0= RULE_ID )
            // InternalMyDsl.g:237:5: lv_value_1_0= RULE_ID
            {
            lv_value_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getNaturalExpressionAccess().getValueIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNaturalExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
        }
        return current;
    }
    // $ANTLR end "ruleNaturalExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002012L});

}