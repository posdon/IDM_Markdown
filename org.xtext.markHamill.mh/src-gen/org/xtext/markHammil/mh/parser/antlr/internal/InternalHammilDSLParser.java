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
    // InternalHammilDSL.g:116:1: ruleExpression returns [EObject current=null] : (this_HeaderDepth1Expression_0= ruleHeaderDepth1Expression | this_HeaderDepth2Expression_1= ruleHeaderDepth2Expression | this_HeaderDepth3Expression_2= ruleHeaderDepth3Expression | this_HeaderDepth4Expression_3= ruleHeaderDepth4Expression | this_HeaderDepth5Expression_4= ruleHeaderDepth5Expression | this_HeaderDepth6Expression_5= ruleHeaderDepth6Expression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_HeaderDepth1Expression_0 = null;

        EObject this_HeaderDepth2Expression_1 = null;

        EObject this_HeaderDepth3Expression_2 = null;

        EObject this_HeaderDepth4Expression_3 = null;

        EObject this_HeaderDepth5Expression_4 = null;

        EObject this_HeaderDepth6Expression_5 = null;



        	enterRule();

        try {
            // InternalHammilDSL.g:122:2: ( (this_HeaderDepth1Expression_0= ruleHeaderDepth1Expression | this_HeaderDepth2Expression_1= ruleHeaderDepth2Expression | this_HeaderDepth3Expression_2= ruleHeaderDepth3Expression | this_HeaderDepth4Expression_3= ruleHeaderDepth4Expression | this_HeaderDepth5Expression_4= ruleHeaderDepth5Expression | this_HeaderDepth6Expression_5= ruleHeaderDepth6Expression ) )
            // InternalHammilDSL.g:123:2: (this_HeaderDepth1Expression_0= ruleHeaderDepth1Expression | this_HeaderDepth2Expression_1= ruleHeaderDepth2Expression | this_HeaderDepth3Expression_2= ruleHeaderDepth3Expression | this_HeaderDepth4Expression_3= ruleHeaderDepth4Expression | this_HeaderDepth5Expression_4= ruleHeaderDepth5Expression | this_HeaderDepth6Expression_5= ruleHeaderDepth6Expression )
            {
            // InternalHammilDSL.g:123:2: (this_HeaderDepth1Expression_0= ruleHeaderDepth1Expression | this_HeaderDepth2Expression_1= ruleHeaderDepth2Expression | this_HeaderDepth3Expression_2= ruleHeaderDepth3Expression | this_HeaderDepth4Expression_3= ruleHeaderDepth4Expression | this_HeaderDepth5Expression_4= ruleHeaderDepth5Expression | this_HeaderDepth6Expression_5= ruleHeaderDepth6Expression )
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

                    if ( (LA2_8==18) ) {
                        alt2=2;
                    }
                    else if ( (LA2_8==16) ) {
                        alt2=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 8, input);

                        throw nvae;
                    }
                }
                else {
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
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalHammilDSL.g:124:3: this_HeaderDepth1Expression_0= ruleHeaderDepth1Expression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getHeaderDepth1ExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_HeaderDepth1Expression_0=ruleHeaderDepth1Expression();

                    state._fsp--;


                    			current = this_HeaderDepth1Expression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHammilDSL.g:133:3: this_HeaderDepth2Expression_1= ruleHeaderDepth2Expression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getHeaderDepth2ExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_HeaderDepth2Expression_1=ruleHeaderDepth2Expression();

                    state._fsp--;


                    			current = this_HeaderDepth2Expression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalHammilDSL.g:142:3: this_HeaderDepth3Expression_2= ruleHeaderDepth3Expression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getHeaderDepth3ExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_HeaderDepth3Expression_2=ruleHeaderDepth3Expression();

                    state._fsp--;


                    			current = this_HeaderDepth3Expression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalHammilDSL.g:151:3: this_HeaderDepth4Expression_3= ruleHeaderDepth4Expression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getHeaderDepth4ExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_HeaderDepth4Expression_3=ruleHeaderDepth4Expression();

                    state._fsp--;


                    			current = this_HeaderDepth4Expression_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalHammilDSL.g:160:3: this_HeaderDepth5Expression_4= ruleHeaderDepth5Expression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getHeaderDepth5ExpressionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_HeaderDepth5Expression_4=ruleHeaderDepth5Expression();

                    state._fsp--;


                    			current = this_HeaderDepth5Expression_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalHammilDSL.g:169:3: this_HeaderDepth6Expression_5= ruleHeaderDepth6Expression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getHeaderDepth6ExpressionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_HeaderDepth6Expression_5=ruleHeaderDepth6Expression();

                    state._fsp--;


                    			current = this_HeaderDepth6Expression_5;
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


    // $ANTLR start "entryRuleEmphasisExpression"
    // InternalHammilDSL.g:181:1: entryRuleEmphasisExpression returns [EObject current=null] : iv_ruleEmphasisExpression= ruleEmphasisExpression EOF ;
    public final EObject entryRuleEmphasisExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmphasisExpression = null;


        try {
            // InternalHammilDSL.g:181:59: (iv_ruleEmphasisExpression= ruleEmphasisExpression EOF )
            // InternalHammilDSL.g:182:2: iv_ruleEmphasisExpression= ruleEmphasisExpression EOF
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
    // InternalHammilDSL.g:188:1: ruleEmphasisExpression returns [EObject current=null] : this_TextualExpression_0= ruleTextualExpression ;
    public final EObject ruleEmphasisExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TextualExpression_0 = null;



        	enterRule();

        try {
            // InternalHammilDSL.g:194:2: (this_TextualExpression_0= ruleTextualExpression )
            // InternalHammilDSL.g:195:2: this_TextualExpression_0= ruleTextualExpression
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


    // $ANTLR start "entryRuleHeaderDepth1Expression"
    // InternalHammilDSL.g:206:1: entryRuleHeaderDepth1Expression returns [EObject current=null] : iv_ruleHeaderDepth1Expression= ruleHeaderDepth1Expression EOF ;
    public final EObject entryRuleHeaderDepth1Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderDepth1Expression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:208:2: (iv_ruleHeaderDepth1Expression= ruleHeaderDepth1Expression EOF )
            // InternalHammilDSL.g:209:2: iv_ruleHeaderDepth1Expression= ruleHeaderDepth1Expression EOF
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
    // InternalHammilDSL.g:218:1: ruleHeaderDepth1Expression returns [EObject current=null] : ( (otherlv_0= '#' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '=' )+ (this_BL_7= RULE_BL )? ) ) ;
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
            // InternalHammilDSL.g:225:2: ( ( (otherlv_0= '#' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '=' )+ (this_BL_7= RULE_BL )? ) ) )
            // InternalHammilDSL.g:226:2: ( (otherlv_0= '#' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '=' )+ (this_BL_7= RULE_BL )? ) )
            {
            // InternalHammilDSL.g:226:2: ( (otherlv_0= '#' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '=' )+ (this_BL_7= RULE_BL )? ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalHammilDSL.g:227:3: (otherlv_0= '#' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
                    {
                    // InternalHammilDSL.g:227:3: (otherlv_0= '#' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
                    // InternalHammilDSL.g:228:4: otherlv_0= '#' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )?
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0_0());
                    			
                    // InternalHammilDSL.g:232:4: ( (lv_title_1_0= ruleEmphasisExpression ) )
                    // InternalHammilDSL.g:233:5: (lv_title_1_0= ruleEmphasisExpression )
                    {
                    // InternalHammilDSL.g:233:5: (lv_title_1_0= ruleEmphasisExpression )
                    // InternalHammilDSL.g:234:6: lv_title_1_0= ruleEmphasisExpression
                    {

                    						newCompositeNode(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_5);
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

                    // InternalHammilDSL.g:251:4: (otherlv_2= '#' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            int LA3_2 = input.LA(2);

                            if ( (LA3_2==RULE_STRING) ) {
                                int LA3_3 = input.LA(3);

                                if ( (LA3_3==RULE_BL) ) {
                                    int LA3_5 = input.LA(4);

                                    if ( (LA3_5==16||LA3_5==18) ) {
                                        alt3=1;
                                    }


                                }


                            }
                            else if ( (LA3_2==EOF||LA3_2==RULE_BL||LA3_2==15||LA3_2==17||(LA3_2>=19 && LA3_2<=22)) ) {
                                alt3=1;
                            }


                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalHammilDSL.g:252:5: otherlv_2= '#'
                    	    {
                    	    otherlv_2=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0_2());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // InternalHammilDSL.g:257:4: (this_BL_3= RULE_BL )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_BL) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalHammilDSL.g:258:5: this_BL_3= RULE_BL
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
                    // InternalHammilDSL.g:265:3: ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '=' )+ (this_BL_7= RULE_BL )? )
                    {
                    // InternalHammilDSL.g:265:3: ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '=' )+ (this_BL_7= RULE_BL )? )
                    // InternalHammilDSL.g:266:4: ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '=' )+ (this_BL_7= RULE_BL )?
                    {
                    // InternalHammilDSL.g:266:4: ( (lv_title_4_0= ruleEmphasisExpression ) )
                    // InternalHammilDSL.g:267:5: (lv_title_4_0= ruleEmphasisExpression )
                    {
                    // InternalHammilDSL.g:267:5: (lv_title_4_0= ruleEmphasisExpression )
                    // InternalHammilDSL.g:268:6: lv_title_4_0= ruleEmphasisExpression
                    {

                    						newCompositeNode(grammarAccess.getHeaderDepth1ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    this_BL_5=(Token)match(input,RULE_BL,FOLLOW_7); 

                    				newLeafNode(this_BL_5, grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_1_1());
                    			
                    // InternalHammilDSL.g:289:4: (otherlv_6= '=' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalHammilDSL.g:290:5: otherlv_6= '='
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_8); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getHeaderDepth1ExpressionAccess().getEqualsSignKeyword_1_2());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    // InternalHammilDSL.g:295:4: (this_BL_7= RULE_BL )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_BL) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalHammilDSL.g:296:5: this_BL_7= RULE_BL
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
    // InternalHammilDSL.g:309:1: entryRuleHeaderDepth2Expression returns [EObject current=null] : iv_ruleHeaderDepth2Expression= ruleHeaderDepth2Expression EOF ;
    public final EObject entryRuleHeaderDepth2Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderDepth2Expression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:311:2: (iv_ruleHeaderDepth2Expression= ruleHeaderDepth2Expression EOF )
            // InternalHammilDSL.g:312:2: iv_ruleHeaderDepth2Expression= ruleHeaderDepth2Expression EOF
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
    // InternalHammilDSL.g:321:1: ruleHeaderDepth2Expression returns [EObject current=null] : ( (otherlv_0= '##' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '-' )+ (this_BL_7= RULE_BL )? ) ) ;
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
            // InternalHammilDSL.g:328:2: ( ( (otherlv_0= '##' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '-' )+ (this_BL_7= RULE_BL )? ) ) )
            // InternalHammilDSL.g:329:2: ( (otherlv_0= '##' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '-' )+ (this_BL_7= RULE_BL )? ) )
            {
            // InternalHammilDSL.g:329:2: ( (otherlv_0= '##' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '-' )+ (this_BL_7= RULE_BL )? ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_STRING) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalHammilDSL.g:330:3: (otherlv_0= '##' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
                    {
                    // InternalHammilDSL.g:330:3: (otherlv_0= '##' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
                    // InternalHammilDSL.g:331:4: otherlv_0= '##' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )?
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getHeaderDepth2ExpressionAccess().getNumberSignNumberSignKeyword_0_0());
                    			
                    // InternalHammilDSL.g:335:4: ( (lv_title_1_0= ruleEmphasisExpression ) )
                    // InternalHammilDSL.g:336:5: (lv_title_1_0= ruleEmphasisExpression )
                    {
                    // InternalHammilDSL.g:336:5: (lv_title_1_0= ruleEmphasisExpression )
                    // InternalHammilDSL.g:337:6: lv_title_1_0= ruleEmphasisExpression
                    {

                    						newCompositeNode(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_5);
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

                    // InternalHammilDSL.g:354:4: (otherlv_2= '#' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==15) ) {
                            int LA8_2 = input.LA(2);

                            if ( (LA8_2==RULE_STRING) ) {
                                int LA8_3 = input.LA(3);

                                if ( (LA8_3==RULE_BL) ) {
                                    int LA8_5 = input.LA(4);

                                    if ( (LA8_5==16||LA8_5==18) ) {
                                        alt8=1;
                                    }


                                }


                            }
                            else if ( (LA8_2==EOF||LA8_2==RULE_BL||LA8_2==15||LA8_2==17||(LA8_2>=19 && LA8_2<=22)) ) {
                                alt8=1;
                            }


                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalHammilDSL.g:355:5: otherlv_2= '#'
                    	    {
                    	    otherlv_2=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getHeaderDepth2ExpressionAccess().getNumberSignKeyword_0_2());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    // InternalHammilDSL.g:360:4: (this_BL_3= RULE_BL )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_BL) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalHammilDSL.g:361:5: this_BL_3= RULE_BL
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
                    // InternalHammilDSL.g:368:3: ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '-' )+ (this_BL_7= RULE_BL )? )
                    {
                    // InternalHammilDSL.g:368:3: ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '-' )+ (this_BL_7= RULE_BL )? )
                    // InternalHammilDSL.g:369:4: ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '-' )+ (this_BL_7= RULE_BL )?
                    {
                    // InternalHammilDSL.g:369:4: ( (lv_title_4_0= ruleEmphasisExpression ) )
                    // InternalHammilDSL.g:370:5: (lv_title_4_0= ruleEmphasisExpression )
                    {
                    // InternalHammilDSL.g:370:5: (lv_title_4_0= ruleEmphasisExpression )
                    // InternalHammilDSL.g:371:6: lv_title_4_0= ruleEmphasisExpression
                    {

                    						newCompositeNode(grammarAccess.getHeaderDepth2ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    this_BL_5=(Token)match(input,RULE_BL,FOLLOW_9); 

                    				newLeafNode(this_BL_5, grammarAccess.getHeaderDepth2ExpressionAccess().getBLTerminalRuleCall_1_1());
                    			
                    // InternalHammilDSL.g:392:4: (otherlv_6= '-' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==18) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalHammilDSL.g:393:5: otherlv_6= '-'
                    	    {
                    	    otherlv_6=(Token)match(input,18,FOLLOW_10); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getHeaderDepth2ExpressionAccess().getHyphenMinusKeyword_1_2());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    // InternalHammilDSL.g:398:4: (this_BL_7= RULE_BL )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_BL) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalHammilDSL.g:399:5: this_BL_7= RULE_BL
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
    // InternalHammilDSL.g:412:1: entryRuleHeaderDepth3Expression returns [EObject current=null] : iv_ruleHeaderDepth3Expression= ruleHeaderDepth3Expression EOF ;
    public final EObject entryRuleHeaderDepth3Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderDepth3Expression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:414:2: (iv_ruleHeaderDepth3Expression= ruleHeaderDepth3Expression EOF )
            // InternalHammilDSL.g:415:2: iv_ruleHeaderDepth3Expression= ruleHeaderDepth3Expression EOF
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
    // InternalHammilDSL.g:424:1: ruleHeaderDepth3Expression returns [EObject current=null] : (otherlv_0= '###' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) ;
    public final EObject ruleHeaderDepth3Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_BL_3=null;
        EObject lv_title_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:431:2: ( (otherlv_0= '###' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) )
            // InternalHammilDSL.g:432:2: (otherlv_0= '###' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            {
            // InternalHammilDSL.g:432:2: (otherlv_0= '###' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            // InternalHammilDSL.g:433:3: otherlv_0= '###' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getHeaderDepth3ExpressionAccess().getNumberSignNumberSignNumberSignKeyword_0());
            		
            // InternalHammilDSL.g:437:3: ( (lv_title_1_0= ruleEmphasisExpression ) )
            // InternalHammilDSL.g:438:4: (lv_title_1_0= ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:438:4: (lv_title_1_0= ruleEmphasisExpression )
            // InternalHammilDSL.g:439:5: lv_title_1_0= ruleEmphasisExpression
            {

            					newCompositeNode(grammarAccess.getHeaderDepth3ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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

            // InternalHammilDSL.g:456:3: (otherlv_2= '#' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2==RULE_STRING) ) {
                        int LA13_3 = input.LA(3);

                        if ( (LA13_3==RULE_BL) ) {
                            int LA13_5 = input.LA(4);

                            if ( (LA13_5==16||LA13_5==18) ) {
                                alt13=1;
                            }


                        }


                    }
                    else if ( (LA13_2==EOF||LA13_2==RULE_BL||LA13_2==15||LA13_2==17||(LA13_2>=19 && LA13_2<=22)) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalHammilDSL.g:457:4: otherlv_2= '#'
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getHeaderDepth3ExpressionAccess().getNumberSignKeyword_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalHammilDSL.g:462:3: (this_BL_3= RULE_BL )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_BL) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalHammilDSL.g:463:4: this_BL_3= RULE_BL
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
    // InternalHammilDSL.g:475:1: entryRuleHeaderDepth5Expression returns [EObject current=null] : iv_ruleHeaderDepth5Expression= ruleHeaderDepth5Expression EOF ;
    public final EObject entryRuleHeaderDepth5Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderDepth5Expression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:477:2: (iv_ruleHeaderDepth5Expression= ruleHeaderDepth5Expression EOF )
            // InternalHammilDSL.g:478:2: iv_ruleHeaderDepth5Expression= ruleHeaderDepth5Expression EOF
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
    // InternalHammilDSL.g:487:1: ruleHeaderDepth5Expression returns [EObject current=null] : (otherlv_0= '#####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) ;
    public final EObject ruleHeaderDepth5Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_BL_3=null;
        EObject lv_title_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:494:2: ( (otherlv_0= '#####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) )
            // InternalHammilDSL.g:495:2: (otherlv_0= '#####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            {
            // InternalHammilDSL.g:495:2: (otherlv_0= '#####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            // InternalHammilDSL.g:496:3: otherlv_0= '#####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getHeaderDepth5ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_0());
            		
            // InternalHammilDSL.g:500:3: ( (lv_title_1_0= ruleEmphasisExpression ) )
            // InternalHammilDSL.g:501:4: (lv_title_1_0= ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:501:4: (lv_title_1_0= ruleEmphasisExpression )
            // InternalHammilDSL.g:502:5: lv_title_1_0= ruleEmphasisExpression
            {

            					newCompositeNode(grammarAccess.getHeaderDepth5ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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

            // InternalHammilDSL.g:519:3: (otherlv_2= '#' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==15) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==RULE_STRING) ) {
                        int LA15_3 = input.LA(3);

                        if ( (LA15_3==RULE_BL) ) {
                            int LA15_5 = input.LA(4);

                            if ( (LA15_5==16||LA15_5==18) ) {
                                alt15=1;
                            }


                        }


                    }
                    else if ( (LA15_2==EOF||LA15_2==RULE_BL||LA15_2==15||LA15_2==17||(LA15_2>=19 && LA15_2<=22)) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalHammilDSL.g:520:4: otherlv_2= '#'
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getHeaderDepth5ExpressionAccess().getNumberSignKeyword_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalHammilDSL.g:525:3: (this_BL_3= RULE_BL )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_BL) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalHammilDSL.g:526:4: this_BL_3= RULE_BL
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
    // InternalHammilDSL.g:538:1: entryRuleHeaderDepth6Expression returns [EObject current=null] : iv_ruleHeaderDepth6Expression= ruleHeaderDepth6Expression EOF ;
    public final EObject entryRuleHeaderDepth6Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderDepth6Expression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:540:2: (iv_ruleHeaderDepth6Expression= ruleHeaderDepth6Expression EOF )
            // InternalHammilDSL.g:541:2: iv_ruleHeaderDepth6Expression= ruleHeaderDepth6Expression EOF
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
    // InternalHammilDSL.g:550:1: ruleHeaderDepth6Expression returns [EObject current=null] : (otherlv_0= '######' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) ;
    public final EObject ruleHeaderDepth6Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_BL_3=null;
        EObject lv_title_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:557:2: ( (otherlv_0= '######' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) )
            // InternalHammilDSL.g:558:2: (otherlv_0= '######' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            {
            // InternalHammilDSL.g:558:2: (otherlv_0= '######' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            // InternalHammilDSL.g:559:3: otherlv_0= '######' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getHeaderDepth6ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignNumberSignNumberSignKeyword_0());
            		
            // InternalHammilDSL.g:563:3: ( (lv_title_1_0= ruleEmphasisExpression ) )
            // InternalHammilDSL.g:564:4: (lv_title_1_0= ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:564:4: (lv_title_1_0= ruleEmphasisExpression )
            // InternalHammilDSL.g:565:5: lv_title_1_0= ruleEmphasisExpression
            {

            					newCompositeNode(grammarAccess.getHeaderDepth6ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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

            // InternalHammilDSL.g:582:3: (otherlv_2= '#' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==15) ) {
                    int LA17_2 = input.LA(2);

                    if ( (LA17_2==RULE_STRING) ) {
                        int LA17_3 = input.LA(3);

                        if ( (LA17_3==RULE_BL) ) {
                            int LA17_5 = input.LA(4);

                            if ( (LA17_5==16||LA17_5==18) ) {
                                alt17=1;
                            }


                        }


                    }
                    else if ( (LA17_2==EOF||LA17_2==RULE_BL||LA17_2==15||LA17_2==17||(LA17_2>=19 && LA17_2<=22)) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // InternalHammilDSL.g:583:4: otherlv_2= '#'
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getHeaderDepth6ExpressionAccess().getNumberSignKeyword_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalHammilDSL.g:588:3: (this_BL_3= RULE_BL )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_BL) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalHammilDSL.g:589:4: this_BL_3= RULE_BL
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
    // InternalHammilDSL.g:601:1: entryRuleHeaderDepth4Expression returns [EObject current=null] : iv_ruleHeaderDepth4Expression= ruleHeaderDepth4Expression EOF ;
    public final EObject entryRuleHeaderDepth4Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderDepth4Expression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:603:2: (iv_ruleHeaderDepth4Expression= ruleHeaderDepth4Expression EOF )
            // InternalHammilDSL.g:604:2: iv_ruleHeaderDepth4Expression= ruleHeaderDepth4Expression EOF
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
    // InternalHammilDSL.g:613:1: ruleHeaderDepth4Expression returns [EObject current=null] : (otherlv_0= '####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) ;
    public final EObject ruleHeaderDepth4Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_BL_3=null;
        EObject lv_title_1_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_S");

        try {
            // InternalHammilDSL.g:620:2: ( (otherlv_0= '####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) )
            // InternalHammilDSL.g:621:2: (otherlv_0= '####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            {
            // InternalHammilDSL.g:621:2: (otherlv_0= '####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
            // InternalHammilDSL.g:622:3: otherlv_0= '####' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getHeaderDepth4ExpressionAccess().getNumberSignNumberSignNumberSignNumberSignKeyword_0());
            		
            // InternalHammilDSL.g:626:3: ( (lv_title_1_0= ruleEmphasisExpression ) )
            // InternalHammilDSL.g:627:4: (lv_title_1_0= ruleEmphasisExpression )
            {
            // InternalHammilDSL.g:627:4: (lv_title_1_0= ruleEmphasisExpression )
            // InternalHammilDSL.g:628:5: lv_title_1_0= ruleEmphasisExpression
            {

            					newCompositeNode(grammarAccess.getHeaderDepth4ExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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

            // InternalHammilDSL.g:645:3: (otherlv_2= '#' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==15) ) {
                    int LA19_2 = input.LA(2);

                    if ( (LA19_2==RULE_STRING) ) {
                        int LA19_3 = input.LA(3);

                        if ( (LA19_3==RULE_BL) ) {
                            int LA19_5 = input.LA(4);

                            if ( (LA19_5==16||LA19_5==18) ) {
                                alt19=1;
                            }


                        }


                    }
                    else if ( (LA19_2==EOF||LA19_2==RULE_BL||LA19_2==15||LA19_2==17||(LA19_2>=19 && LA19_2<=22)) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalHammilDSL.g:646:4: otherlv_2= '#'
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getHeaderDepth4ExpressionAccess().getNumberSignKeyword_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalHammilDSL.g:651:3: (this_BL_3= RULE_BL )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_BL) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalHammilDSL.g:652:4: this_BL_3= RULE_BL
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
    // InternalHammilDSL.g:664:1: entryRuleTextualExpression returns [EObject current=null] : iv_ruleTextualExpression= ruleTextualExpression EOF ;
    public final EObject entryRuleTextualExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextualExpression = null;


        try {
            // InternalHammilDSL.g:664:58: (iv_ruleTextualExpression= ruleTextualExpression EOF )
            // InternalHammilDSL.g:665:2: iv_ruleTextualExpression= ruleTextualExpression EOF
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
    // InternalHammilDSL.g:671:1: ruleTextualExpression returns [EObject current=null] : ( (lv_contentString_0_0= ruleString0 ) ) ;
    public final EObject ruleTextualExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_contentString_0_0 = null;



        	enterRule();

        try {
            // InternalHammilDSL.g:677:2: ( ( (lv_contentString_0_0= ruleString0 ) ) )
            // InternalHammilDSL.g:678:2: ( (lv_contentString_0_0= ruleString0 ) )
            {
            // InternalHammilDSL.g:678:2: ( (lv_contentString_0_0= ruleString0 ) )
            // InternalHammilDSL.g:679:3: (lv_contentString_0_0= ruleString0 )
            {
            // InternalHammilDSL.g:679:3: (lv_contentString_0_0= ruleString0 )
            // InternalHammilDSL.g:680:4: lv_contentString_0_0= ruleString0
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
    // InternalHammilDSL.g:700:1: entryRuleString0 returns [String current=null] : iv_ruleString0= ruleString0 EOF ;
    public final String entryRuleString0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleString0 = null;


        try {
            // InternalHammilDSL.g:700:47: (iv_ruleString0= ruleString0 EOF )
            // InternalHammilDSL.g:701:2: iv_ruleString0= ruleString0 EOF
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
    // InternalHammilDSL.g:707:1: ruleString0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleString0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalHammilDSL.g:713:2: (this_STRING_0= RULE_STRING )
            // InternalHammilDSL.g:714:2: this_STRING_0= RULE_STRING
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