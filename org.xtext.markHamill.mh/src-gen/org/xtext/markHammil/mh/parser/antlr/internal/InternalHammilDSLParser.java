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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_DIGIT", "RULE_INT", "RULE_DOUBLE", "RULE_ID", "RULE_ANY_OTHER", "'# '", "'#'", "'='"
    };
    public static final int RULE_ID=12;
    public static final int RULE_WS=8;
    public static final int RULE_DIGIT=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=11;
    public static final int T__16=16;
    public static final int RULE_INT=10;
    public static final int RULE_BL=4;
    public static final int RULE_ML_COMMENT=6;
    public static final int T__14=14;
    public static final int EOF=-1;

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

                if ( ((LA1_0>=RULE_BL && LA1_0<=RULE_STRING)||LA1_0==14) ) {
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
    // InternalHammilDSL.g:116:1: ruleExpression returns [EObject current=null] : ( ( ( ruleHeaderDepth1Expression )=>this_HeaderDepth1Expression_0= ruleHeaderDepth1Expression ) | this_BL_1= RULE_BL ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token this_BL_1=null;
        EObject this_HeaderDepth1Expression_0 = null;



        	enterRule();

        try {
            // InternalHammilDSL.g:122:2: ( ( ( ( ruleHeaderDepth1Expression )=>this_HeaderDepth1Expression_0= ruleHeaderDepth1Expression ) | this_BL_1= RULE_BL ) )
            // InternalHammilDSL.g:123:2: ( ( ( ruleHeaderDepth1Expression )=>this_HeaderDepth1Expression_0= ruleHeaderDepth1Expression ) | this_BL_1= RULE_BL )
            {
            // InternalHammilDSL.g:123:2: ( ( ( ruleHeaderDepth1Expression )=>this_HeaderDepth1Expression_0= ruleHeaderDepth1Expression ) | this_BL_1= RULE_BL )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) && (synpred1_InternalHammilDSL())) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING) && (synpred1_InternalHammilDSL())) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_BL) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalHammilDSL.g:124:3: ( ( ruleHeaderDepth1Expression )=>this_HeaderDepth1Expression_0= ruleHeaderDepth1Expression )
                    {
                    // InternalHammilDSL.g:124:3: ( ( ruleHeaderDepth1Expression )=>this_HeaderDepth1Expression_0= ruleHeaderDepth1Expression )
                    // InternalHammilDSL.g:125:4: ( ruleHeaderDepth1Expression )=>this_HeaderDepth1Expression_0= ruleHeaderDepth1Expression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpressionAccess().getHeaderDepth1ExpressionParserRuleCall_0());
                      			
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
                    // InternalHammilDSL.g:136:3: this_BL_1= RULE_BL
                    {
                    this_BL_1=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_BL_1, grammarAccess.getExpressionAccess().getBLTerminalRuleCall_1());
                      		
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


    // $ANTLR start "entryRuleEmphasisExpression"
    // InternalHammilDSL.g:144:1: entryRuleEmphasisExpression returns [EObject current=null] : iv_ruleEmphasisExpression= ruleEmphasisExpression EOF ;
    public final EObject entryRuleEmphasisExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmphasisExpression = null;


        try {
            // InternalHammilDSL.g:144:59: (iv_ruleEmphasisExpression= ruleEmphasisExpression EOF )
            // InternalHammilDSL.g:145:2: iv_ruleEmphasisExpression= ruleEmphasisExpression EOF
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
    // InternalHammilDSL.g:151:1: ruleEmphasisExpression returns [EObject current=null] : this_TextualExpression_0= ruleTextualExpression ;
    public final EObject ruleEmphasisExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TextualExpression_0 = null;



        	enterRule();

        try {
            // InternalHammilDSL.g:157:2: (this_TextualExpression_0= ruleTextualExpression )
            // InternalHammilDSL.g:158:2: this_TextualExpression_0= ruleTextualExpression
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
    // InternalHammilDSL.g:169:1: entryRuleHeaderDepth1Expression returns [EObject current=null] : iv_ruleHeaderDepth1Expression= ruleHeaderDepth1Expression EOF ;
    public final EObject entryRuleHeaderDepth1Expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderDepth1Expression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalHammilDSL.g:171:2: (iv_ruleHeaderDepth1Expression= ruleHeaderDepth1Expression EOF )
            // InternalHammilDSL.g:172:2: iv_ruleHeaderDepth1Expression= ruleHeaderDepth1Expression EOF
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
    // InternalHammilDSL.g:181:1: ruleHeaderDepth1Expression returns [EObject current=null] : ( (otherlv_0= '# ' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '=' )+ this_BL_7= RULE_BL ) ) ;
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
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalHammilDSL.g:188:2: ( ( (otherlv_0= '# ' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '=' )+ this_BL_7= RULE_BL ) ) )
            // InternalHammilDSL.g:189:2: ( (otherlv_0= '# ' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '=' )+ this_BL_7= RULE_BL ) )
            {
            // InternalHammilDSL.g:189:2: ( (otherlv_0= '# ' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? ) | ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '=' )+ this_BL_7= RULE_BL ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
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
                    // InternalHammilDSL.g:190:3: (otherlv_0= '# ' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
                    {
                    // InternalHammilDSL.g:190:3: (otherlv_0= '# ' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )? )
                    // InternalHammilDSL.g:191:4: otherlv_0= '# ' ( (lv_title_1_0= ruleEmphasisExpression ) ) (otherlv_2= '#' )* (this_BL_3= RULE_BL )?
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignSpaceKeyword_0_0());
                      			
                    }
                    // InternalHammilDSL.g:195:4: ( (lv_title_1_0= ruleEmphasisExpression ) )
                    // InternalHammilDSL.g:196:5: (lv_title_1_0= ruleEmphasisExpression )
                    {
                    // InternalHammilDSL.g:196:5: (lv_title_1_0= ruleEmphasisExpression )
                    // InternalHammilDSL.g:197:6: lv_title_1_0= ruleEmphasisExpression
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

                    // InternalHammilDSL.g:214:4: (otherlv_2= '#' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalHammilDSL.g:215:5: otherlv_2= '#'
                    	    {
                    	    otherlv_2=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0_2());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // InternalHammilDSL.g:220:4: (this_BL_3= RULE_BL )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_BL) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalHammilDSL.g:221:5: this_BL_3= RULE_BL
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
                    // InternalHammilDSL.g:228:3: ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '=' )+ this_BL_7= RULE_BL )
                    {
                    // InternalHammilDSL.g:228:3: ( ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '=' )+ this_BL_7= RULE_BL )
                    // InternalHammilDSL.g:229:4: ( (lv_title_4_0= ruleEmphasisExpression ) ) this_BL_5= RULE_BL (otherlv_6= '=' )+ this_BL_7= RULE_BL
                    {
                    // InternalHammilDSL.g:229:4: ( (lv_title_4_0= ruleEmphasisExpression ) )
                    // InternalHammilDSL.g:230:5: (lv_title_4_0= ruleEmphasisExpression )
                    {
                    // InternalHammilDSL.g:230:5: (lv_title_4_0= ruleEmphasisExpression )
                    // InternalHammilDSL.g:231:6: lv_title_4_0= ruleEmphasisExpression
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
                    // InternalHammilDSL.g:252:4: (otherlv_6= '=' )+
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
                    	    // InternalHammilDSL.g:253:5: otherlv_6= '='
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getHeaderDepth1ExpressionAccess().getEqualsSignKeyword_1_2());
                    	      				
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

                    this_BL_7=(Token)match(input,RULE_BL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BL_7, grammarAccess.getHeaderDepth1ExpressionAccess().getBLTerminalRuleCall_1_3());
                      			
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


    // $ANTLR start "entryRuleTextualExpression"
    // InternalHammilDSL.g:270:1: entryRuleTextualExpression returns [EObject current=null] : iv_ruleTextualExpression= ruleTextualExpression EOF ;
    public final EObject entryRuleTextualExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextualExpression = null;


        try {
            // InternalHammilDSL.g:270:58: (iv_ruleTextualExpression= ruleTextualExpression EOF )
            // InternalHammilDSL.g:271:2: iv_ruleTextualExpression= ruleTextualExpression EOF
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
    // InternalHammilDSL.g:277:1: ruleTextualExpression returns [EObject current=null] : ( (lv_contentString_0_0= ruleString0 ) ) ;
    public final EObject ruleTextualExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_contentString_0_0 = null;



        	enterRule();

        try {
            // InternalHammilDSL.g:283:2: ( ( (lv_contentString_0_0= ruleString0 ) ) )
            // InternalHammilDSL.g:284:2: ( (lv_contentString_0_0= ruleString0 ) )
            {
            // InternalHammilDSL.g:284:2: ( (lv_contentString_0_0= ruleString0 ) )
            // InternalHammilDSL.g:285:3: (lv_contentString_0_0= ruleString0 )
            {
            // InternalHammilDSL.g:285:3: (lv_contentString_0_0= ruleString0 )
            // InternalHammilDSL.g:286:4: lv_contentString_0_0= ruleString0
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
    // InternalHammilDSL.g:306:1: entryRuleString0 returns [String current=null] : iv_ruleString0= ruleString0 EOF ;
    public final String entryRuleString0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleString0 = null;


        try {
            // InternalHammilDSL.g:306:47: (iv_ruleString0= ruleString0 EOF )
            // InternalHammilDSL.g:307:2: iv_ruleString0= ruleString0 EOF
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
    // InternalHammilDSL.g:313:1: ruleString0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleString0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalHammilDSL.g:319:2: (this_STRING_0= RULE_STRING )
            // InternalHammilDSL.g:320:2: this_STRING_0= RULE_STRING
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
        // InternalHammilDSL.g:125:4: ( ruleHeaderDepth1Expression )
        // InternalHammilDSL.g:125:5: ruleHeaderDepth1Expression
        {
        pushFollow(FOLLOW_2);
        ruleHeaderDepth1Expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalHammilDSL

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010010L});

}