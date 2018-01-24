package org.xtext.markhamill.mh.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.markhamill.mh.services.HamillDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHamillDslParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(HamillDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleFile"
    // InternalHamillDsl.g:53:1: entryRuleFile : ruleFile EOF ;
    public final void entryRuleFile() throws RecognitionException {
        try {
            // InternalHamillDsl.g:54:1: ( ruleFile EOF )
            // InternalHamillDsl.g:55:1: ruleFile EOF
            {
             before(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            ruleFile();

            state._fsp--;

             after(grammarAccess.getFileRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalHamillDsl.g:62:1: ruleFile : ( ( rule__File__Group__0 ) ) ;
    public final void ruleFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHamillDsl.g:66:2: ( ( ( rule__File__Group__0 ) ) )
            // InternalHamillDsl.g:67:2: ( ( rule__File__Group__0 ) )
            {
            // InternalHamillDsl.g:67:2: ( ( rule__File__Group__0 ) )
            // InternalHamillDsl.g:68:3: ( rule__File__Group__0 )
            {
             before(grammarAccess.getFileAccess().getGroup()); 
            // InternalHamillDsl.g:69:3: ( rule__File__Group__0 )
            // InternalHamillDsl.g:69:4: rule__File__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__File__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleExpression"
    // InternalHamillDsl.g:78:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalHamillDsl.g:79:1: ( ruleExpression EOF )
            // InternalHamillDsl.g:80:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalHamillDsl.g:87:1: ruleExpression : ( ruleHeaderExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHamillDsl.g:91:2: ( ( ruleHeaderExpression ) )
            // InternalHamillDsl.g:92:2: ( ruleHeaderExpression )
            {
            // InternalHamillDsl.g:92:2: ( ruleHeaderExpression )
            // InternalHamillDsl.g:93:3: ruleHeaderExpression
            {
             before(grammarAccess.getExpressionAccess().getHeaderExpressionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleHeaderExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getHeaderExpressionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleHeaderExpression"
    // InternalHamillDsl.g:103:1: entryRuleHeaderExpression : ruleHeaderExpression EOF ;
    public final void entryRuleHeaderExpression() throws RecognitionException {
        try {
            // InternalHamillDsl.g:104:1: ( ruleHeaderExpression EOF )
            // InternalHamillDsl.g:105:1: ruleHeaderExpression EOF
            {
             before(grammarAccess.getHeaderExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleHeaderExpression();

            state._fsp--;

             after(grammarAccess.getHeaderExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHeaderExpression"


    // $ANTLR start "ruleHeaderExpression"
    // InternalHamillDsl.g:112:1: ruleHeaderExpression : ( ruleHeaderDepth1Expression ) ;
    public final void ruleHeaderExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHamillDsl.g:116:2: ( ( ruleHeaderDepth1Expression ) )
            // InternalHamillDsl.g:117:2: ( ruleHeaderDepth1Expression )
            {
            // InternalHamillDsl.g:117:2: ( ruleHeaderDepth1Expression )
            // InternalHamillDsl.g:118:3: ruleHeaderDepth1Expression
            {
             before(grammarAccess.getHeaderExpressionAccess().getHeaderDepth1ExpressionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleHeaderDepth1Expression();

            state._fsp--;

             after(grammarAccess.getHeaderExpressionAccess().getHeaderDepth1ExpressionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHeaderExpression"


    // $ANTLR start "entryRuleHeaderDepth1Expression"
    // InternalHamillDsl.g:128:1: entryRuleHeaderDepth1Expression : ruleHeaderDepth1Expression EOF ;
    public final void entryRuleHeaderDepth1Expression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalHamillDsl.g:132:1: ( ruleHeaderDepth1Expression EOF )
            // InternalHamillDsl.g:133:1: ruleHeaderDepth1Expression EOF
            {
             before(grammarAccess.getHeaderDepth1ExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleHeaderDepth1Expression();

            state._fsp--;

             after(grammarAccess.getHeaderDepth1ExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleHeaderDepth1Expression"


    // $ANTLR start "ruleHeaderDepth1Expression"
    // InternalHamillDsl.g:143:1: ruleHeaderDepth1Expression : ( ( rule__HeaderDepth1Expression__Group__0 ) ) ;
    public final void ruleHeaderDepth1Expression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalHamillDsl.g:148:2: ( ( ( rule__HeaderDepth1Expression__Group__0 ) ) )
            // InternalHamillDsl.g:149:2: ( ( rule__HeaderDepth1Expression__Group__0 ) )
            {
            // InternalHamillDsl.g:149:2: ( ( rule__HeaderDepth1Expression__Group__0 ) )
            // InternalHamillDsl.g:150:3: ( rule__HeaderDepth1Expression__Group__0 )
            {
             before(grammarAccess.getHeaderDepth1ExpressionAccess().getGroup()); 
            // InternalHamillDsl.g:151:3: ( rule__HeaderDepth1Expression__Group__0 )
            // InternalHamillDsl.g:151:4: rule__HeaderDepth1Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth1Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderDepth1ExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleHeaderDepth1Expression"


    // $ANTLR start "rule__File__Group__0"
    // InternalHamillDsl.g:160:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHamillDsl.g:164:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // InternalHamillDsl.g:165:2: rule__File__Group__0__Impl rule__File__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__File__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__0"


    // $ANTLR start "rule__File__Group__0__Impl"
    // InternalHamillDsl.g:172:1: rule__File__Group__0__Impl : ( () ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHamillDsl.g:176:1: ( ( () ) )
            // InternalHamillDsl.g:177:1: ( () )
            {
            // InternalHamillDsl.g:177:1: ( () )
            // InternalHamillDsl.g:178:2: ()
            {
             before(grammarAccess.getFileAccess().getFileAction_0()); 
            // InternalHamillDsl.g:179:2: ()
            // InternalHamillDsl.g:179:3: 
            {
            }

             after(grammarAccess.getFileAccess().getFileAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__0__Impl"


    // $ANTLR start "rule__File__Group__1"
    // InternalHamillDsl.g:187:1: rule__File__Group__1 : rule__File__Group__1__Impl ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHamillDsl.g:191:1: ( rule__File__Group__1__Impl )
            // InternalHamillDsl.g:192:2: rule__File__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__File__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__1"


    // $ANTLR start "rule__File__Group__1__Impl"
    // InternalHamillDsl.g:198:1: rule__File__Group__1__Impl : ( ( rule__File__ExpressionAssignment_1 )* ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHamillDsl.g:202:1: ( ( ( rule__File__ExpressionAssignment_1 )* ) )
            // InternalHamillDsl.g:203:1: ( ( rule__File__ExpressionAssignment_1 )* )
            {
            // InternalHamillDsl.g:203:1: ( ( rule__File__ExpressionAssignment_1 )* )
            // InternalHamillDsl.g:204:2: ( rule__File__ExpressionAssignment_1 )*
            {
             before(grammarAccess.getFileAccess().getExpressionAssignment_1()); 
            // InternalHamillDsl.g:205:2: ( rule__File__ExpressionAssignment_1 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalHamillDsl.g:205:3: rule__File__ExpressionAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__File__ExpressionAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getFileAccess().getExpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__1__Impl"


    // $ANTLR start "rule__HeaderDepth1Expression__Group__0"
    // InternalHamillDsl.g:214:1: rule__HeaderDepth1Expression__Group__0 : rule__HeaderDepth1Expression__Group__0__Impl rule__HeaderDepth1Expression__Group__1 ;
    public final void rule__HeaderDepth1Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHamillDsl.g:218:1: ( rule__HeaderDepth1Expression__Group__0__Impl rule__HeaderDepth1Expression__Group__1 )
            // InternalHamillDsl.g:219:2: rule__HeaderDepth1Expression__Group__0__Impl rule__HeaderDepth1Expression__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__HeaderDepth1Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeaderDepth1Expression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderDepth1Expression__Group__0"


    // $ANTLR start "rule__HeaderDepth1Expression__Group__0__Impl"
    // InternalHamillDsl.g:226:1: rule__HeaderDepth1Expression__Group__0__Impl : ( '#' ) ;
    public final void rule__HeaderDepth1Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHamillDsl.g:230:1: ( ( '#' ) )
            // InternalHamillDsl.g:231:1: ( '#' )
            {
            // InternalHamillDsl.g:231:1: ( '#' )
            // InternalHamillDsl.g:232:2: '#'
            {
             before(grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getHeaderDepth1ExpressionAccess().getNumberSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderDepth1Expression__Group__0__Impl"


    // $ANTLR start "rule__HeaderDepth1Expression__Group__1"
    // InternalHamillDsl.g:241:1: rule__HeaderDepth1Expression__Group__1 : rule__HeaderDepth1Expression__Group__1__Impl ;
    public final void rule__HeaderDepth1Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHamillDsl.g:245:1: ( rule__HeaderDepth1Expression__Group__1__Impl )
            // InternalHamillDsl.g:246:2: rule__HeaderDepth1Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth1Expression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderDepth1Expression__Group__1"


    // $ANTLR start "rule__HeaderDepth1Expression__Group__1__Impl"
    // InternalHamillDsl.g:252:1: rule__HeaderDepth1Expression__Group__1__Impl : ( ( rule__HeaderDepth1Expression__ContentAssignment_1 ) ) ;
    public final void rule__HeaderDepth1Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHamillDsl.g:256:1: ( ( ( rule__HeaderDepth1Expression__ContentAssignment_1 ) ) )
            // InternalHamillDsl.g:257:1: ( ( rule__HeaderDepth1Expression__ContentAssignment_1 ) )
            {
            // InternalHamillDsl.g:257:1: ( ( rule__HeaderDepth1Expression__ContentAssignment_1 ) )
            // InternalHamillDsl.g:258:2: ( rule__HeaderDepth1Expression__ContentAssignment_1 )
            {
             before(grammarAccess.getHeaderDepth1ExpressionAccess().getContentAssignment_1()); 
            // InternalHamillDsl.g:259:2: ( rule__HeaderDepth1Expression__ContentAssignment_1 )
            // InternalHamillDsl.g:259:3: rule__HeaderDepth1Expression__ContentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HeaderDepth1Expression__ContentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHeaderDepth1ExpressionAccess().getContentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderDepth1Expression__Group__1__Impl"


    // $ANTLR start "rule__File__ExpressionAssignment_1"
    // InternalHamillDsl.g:268:1: rule__File__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__File__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHamillDsl.g:272:1: ( ( ruleExpression ) )
            // InternalHamillDsl.g:273:2: ( ruleExpression )
            {
            // InternalHamillDsl.g:273:2: ( ruleExpression )
            // InternalHamillDsl.g:274:3: ruleExpression
            {
             before(grammarAccess.getFileAccess().getExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFileAccess().getExpressionExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__ExpressionAssignment_1"


    // $ANTLR start "rule__HeaderDepth1Expression__ContentAssignment_1"
    // InternalHamillDsl.g:283:1: rule__HeaderDepth1Expression__ContentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__HeaderDepth1Expression__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHamillDsl.g:287:1: ( ( ( RULE_ID ) ) )
            // InternalHamillDsl.g:288:2: ( ( RULE_ID ) )
            {
            // InternalHamillDsl.g:288:2: ( ( RULE_ID ) )
            // InternalHamillDsl.g:289:3: ( RULE_ID )
            {
             before(grammarAccess.getHeaderDepth1ExpressionAccess().getContentTextualExpressionCrossReference_1_0()); 
            // InternalHamillDsl.g:290:3: ( RULE_ID )
            // InternalHamillDsl.g:291:4: RULE_ID
            {
             before(grammarAccess.getHeaderDepth1ExpressionAccess().getContentTextualExpressionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getHeaderDepth1ExpressionAccess().getContentTextualExpressionIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getHeaderDepth1ExpressionAccess().getContentTextualExpressionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeaderDepth1Expression__ContentAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});

}