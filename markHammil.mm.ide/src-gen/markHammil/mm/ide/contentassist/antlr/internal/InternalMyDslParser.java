package markHammil.mm.ide.contentassist.antlr.internal;

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
import markHammil.mm.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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
    // InternalMyDsl.g:53:1: entryRuleFile : ruleFile EOF ;
    public final void entryRuleFile() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleFile EOF )
            // InternalMyDsl.g:55:1: ruleFile EOF
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
    // InternalMyDsl.g:62:1: ruleFile : ( ( rule__File__Group__0 ) ) ;
    public final void ruleFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__File__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__File__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__File__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__File__Group__0 )
            {
             before(grammarAccess.getFileAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__File__Group__0 )
            // InternalMyDsl.g:69:4: rule__File__Group__0
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
    // InternalMyDsl.g:78:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleExpression EOF )
            // InternalMyDsl.g:80:1: ruleExpression EOF
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
    // InternalMyDsl.g:87:1: ruleExpression : ( ruleHeaderExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ruleHeaderExpression ) )
            // InternalMyDsl.g:92:2: ( ruleHeaderExpression )
            {
            // InternalMyDsl.g:92:2: ( ruleHeaderExpression )
            // InternalMyDsl.g:93:3: ruleHeaderExpression
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
    // InternalMyDsl.g:103:1: entryRuleHeaderExpression : ruleHeaderExpression EOF ;
    public final void entryRuleHeaderExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleHeaderExpression EOF )
            // InternalMyDsl.g:105:1: ruleHeaderExpression EOF
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
    // InternalMyDsl.g:112:1: ruleHeaderExpression : ( ( rule__HeaderExpression__Group__0 ) ) ;
    public final void ruleHeaderExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__HeaderExpression__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__HeaderExpression__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__HeaderExpression__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__HeaderExpression__Group__0 )
            {
             before(grammarAccess.getHeaderExpressionAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__HeaderExpression__Group__0 )
            // InternalMyDsl.g:119:4: rule__HeaderExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HeaderExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderExpressionAccess().getGroup()); 

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


    // $ANTLR start "entryRuleEmphasisExpression"
    // InternalMyDsl.g:128:1: entryRuleEmphasisExpression : ruleEmphasisExpression EOF ;
    public final void entryRuleEmphasisExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleEmphasisExpression EOF )
            // InternalMyDsl.g:130:1: ruleEmphasisExpression EOF
            {
             before(grammarAccess.getEmphasisExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleEmphasisExpression();

            state._fsp--;

             after(grammarAccess.getEmphasisExpressionRule()); 
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
    // $ANTLR end "entryRuleEmphasisExpression"


    // $ANTLR start "ruleEmphasisExpression"
    // InternalMyDsl.g:137:1: ruleEmphasisExpression : ( ruleNaturalExpression ) ;
    public final void ruleEmphasisExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ruleNaturalExpression ) )
            // InternalMyDsl.g:142:2: ( ruleNaturalExpression )
            {
            // InternalMyDsl.g:142:2: ( ruleNaturalExpression )
            // InternalMyDsl.g:143:3: ruleNaturalExpression
            {
             before(grammarAccess.getEmphasisExpressionAccess().getNaturalExpressionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleNaturalExpression();

            state._fsp--;

             after(grammarAccess.getEmphasisExpressionAccess().getNaturalExpressionParserRuleCall()); 

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
    // $ANTLR end "ruleEmphasisExpression"


    // $ANTLR start "entryRuleNaturalExpression"
    // InternalMyDsl.g:153:1: entryRuleNaturalExpression : ruleNaturalExpression EOF ;
    public final void entryRuleNaturalExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleNaturalExpression EOF )
            // InternalMyDsl.g:155:1: ruleNaturalExpression EOF
            {
             before(grammarAccess.getNaturalExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleNaturalExpression();

            state._fsp--;

             after(grammarAccess.getNaturalExpressionRule()); 
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
    // $ANTLR end "entryRuleNaturalExpression"


    // $ANTLR start "ruleNaturalExpression"
    // InternalMyDsl.g:162:1: ruleNaturalExpression : ( ( rule__NaturalExpression__Group__0 ) ) ;
    public final void ruleNaturalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__NaturalExpression__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__NaturalExpression__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__NaturalExpression__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__NaturalExpression__Group__0 )
            {
             before(grammarAccess.getNaturalExpressionAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__NaturalExpression__Group__0 )
            // InternalMyDsl.g:169:4: rule__NaturalExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NaturalExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNaturalExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleNaturalExpression"


    // $ANTLR start "rule__File__Group__0"
    // InternalMyDsl.g:177:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:181:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // InternalMyDsl.g:182:2: rule__File__Group__0__Impl rule__File__Group__1
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
    // InternalMyDsl.g:189:1: rule__File__Group__0__Impl : ( () ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:193:1: ( ( () ) )
            // InternalMyDsl.g:194:1: ( () )
            {
            // InternalMyDsl.g:194:1: ( () )
            // InternalMyDsl.g:195:2: ()
            {
             before(grammarAccess.getFileAccess().getFileAction_0()); 
            // InternalMyDsl.g:196:2: ()
            // InternalMyDsl.g:196:3: 
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
    // InternalMyDsl.g:204:1: rule__File__Group__1 : rule__File__Group__1__Impl ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:208:1: ( rule__File__Group__1__Impl )
            // InternalMyDsl.g:209:2: rule__File__Group__1__Impl
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
    // InternalMyDsl.g:215:1: rule__File__Group__1__Impl : ( ( rule__File__ExpressionAssignment_1 )* ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:219:1: ( ( ( rule__File__ExpressionAssignment_1 )* ) )
            // InternalMyDsl.g:220:1: ( ( rule__File__ExpressionAssignment_1 )* )
            {
            // InternalMyDsl.g:220:1: ( ( rule__File__ExpressionAssignment_1 )* )
            // InternalMyDsl.g:221:2: ( rule__File__ExpressionAssignment_1 )*
            {
             before(grammarAccess.getFileAccess().getExpressionAssignment_1()); 
            // InternalMyDsl.g:222:2: ( rule__File__ExpressionAssignment_1 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:222:3: rule__File__ExpressionAssignment_1
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


    // $ANTLR start "rule__HeaderExpression__Group__0"
    // InternalMyDsl.g:231:1: rule__HeaderExpression__Group__0 : rule__HeaderExpression__Group__0__Impl rule__HeaderExpression__Group__1 ;
    public final void rule__HeaderExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:235:1: ( rule__HeaderExpression__Group__0__Impl rule__HeaderExpression__Group__1 )
            // InternalMyDsl.g:236:2: rule__HeaderExpression__Group__0__Impl rule__HeaderExpression__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__HeaderExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeaderExpression__Group__1();

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
    // $ANTLR end "rule__HeaderExpression__Group__0"


    // $ANTLR start "rule__HeaderExpression__Group__0__Impl"
    // InternalMyDsl.g:243:1: rule__HeaderExpression__Group__0__Impl : ( '#' ) ;
    public final void rule__HeaderExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:247:1: ( ( '#' ) )
            // InternalMyDsl.g:248:1: ( '#' )
            {
            // InternalMyDsl.g:248:1: ( '#' )
            // InternalMyDsl.g:249:2: '#'
            {
             before(grammarAccess.getHeaderExpressionAccess().getNumberSignKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getHeaderExpressionAccess().getNumberSignKeyword_0()); 

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
    // $ANTLR end "rule__HeaderExpression__Group__0__Impl"


    // $ANTLR start "rule__HeaderExpression__Group__1"
    // InternalMyDsl.g:258:1: rule__HeaderExpression__Group__1 : rule__HeaderExpression__Group__1__Impl rule__HeaderExpression__Group__2 ;
    public final void rule__HeaderExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:262:1: ( rule__HeaderExpression__Group__1__Impl rule__HeaderExpression__Group__2 )
            // InternalMyDsl.g:263:2: rule__HeaderExpression__Group__1__Impl rule__HeaderExpression__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__HeaderExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeaderExpression__Group__2();

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
    // $ANTLR end "rule__HeaderExpression__Group__1"


    // $ANTLR start "rule__HeaderExpression__Group__1__Impl"
    // InternalMyDsl.g:270:1: rule__HeaderExpression__Group__1__Impl : ( ( rule__HeaderExpression__TitleAssignment_1 ) ) ;
    public final void rule__HeaderExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:274:1: ( ( ( rule__HeaderExpression__TitleAssignment_1 ) ) )
            // InternalMyDsl.g:275:1: ( ( rule__HeaderExpression__TitleAssignment_1 ) )
            {
            // InternalMyDsl.g:275:1: ( ( rule__HeaderExpression__TitleAssignment_1 ) )
            // InternalMyDsl.g:276:2: ( rule__HeaderExpression__TitleAssignment_1 )
            {
             before(grammarAccess.getHeaderExpressionAccess().getTitleAssignment_1()); 
            // InternalMyDsl.g:277:2: ( rule__HeaderExpression__TitleAssignment_1 )
            // InternalMyDsl.g:277:3: rule__HeaderExpression__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HeaderExpression__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHeaderExpressionAccess().getTitleAssignment_1()); 

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
    // $ANTLR end "rule__HeaderExpression__Group__1__Impl"


    // $ANTLR start "rule__HeaderExpression__Group__2"
    // InternalMyDsl.g:285:1: rule__HeaderExpression__Group__2 : rule__HeaderExpression__Group__2__Impl rule__HeaderExpression__Group__3 ;
    public final void rule__HeaderExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:289:1: ( rule__HeaderExpression__Group__2__Impl rule__HeaderExpression__Group__3 )
            // InternalMyDsl.g:290:2: rule__HeaderExpression__Group__2__Impl rule__HeaderExpression__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__HeaderExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeaderExpression__Group__3();

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
    // $ANTLR end "rule__HeaderExpression__Group__2"


    // $ANTLR start "rule__HeaderExpression__Group__2__Impl"
    // InternalMyDsl.g:297:1: rule__HeaderExpression__Group__2__Impl : ( ( '#' )* ) ;
    public final void rule__HeaderExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:301:1: ( ( ( '#' )* ) )
            // InternalMyDsl.g:302:1: ( ( '#' )* )
            {
            // InternalMyDsl.g:302:1: ( ( '#' )* )
            // InternalMyDsl.g:303:2: ( '#' )*
            {
             before(grammarAccess.getHeaderExpressionAccess().getNumberSignKeyword_2()); 
            // InternalMyDsl.g:304:2: ( '#' )*
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
            	    // InternalMyDsl.g:304:3: '#'
            	    {
            	    match(input,13,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getHeaderExpressionAccess().getNumberSignKeyword_2()); 

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
    // $ANTLR end "rule__HeaderExpression__Group__2__Impl"


    // $ANTLR start "rule__HeaderExpression__Group__3"
    // InternalMyDsl.g:312:1: rule__HeaderExpression__Group__3 : rule__HeaderExpression__Group__3__Impl ;
    public final void rule__HeaderExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:1: ( rule__HeaderExpression__Group__3__Impl )
            // InternalMyDsl.g:317:2: rule__HeaderExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HeaderExpression__Group__3__Impl();

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
    // $ANTLR end "rule__HeaderExpression__Group__3"


    // $ANTLR start "rule__HeaderExpression__Group__3__Impl"
    // InternalMyDsl.g:323:1: rule__HeaderExpression__Group__3__Impl : ( ( RULE_BL )? ) ;
    public final void rule__HeaderExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:327:1: ( ( ( RULE_BL )? ) )
            // InternalMyDsl.g:328:1: ( ( RULE_BL )? )
            {
            // InternalMyDsl.g:328:1: ( ( RULE_BL )? )
            // InternalMyDsl.g:329:2: ( RULE_BL )?
            {
             before(grammarAccess.getHeaderExpressionAccess().getBLTerminalRuleCall_3()); 
            // InternalMyDsl.g:330:2: ( RULE_BL )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_BL) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:330:3: RULE_BL
                    {
                    match(input,RULE_BL,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getHeaderExpressionAccess().getBLTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__HeaderExpression__Group__3__Impl"


    // $ANTLR start "rule__NaturalExpression__Group__0"
    // InternalMyDsl.g:339:1: rule__NaturalExpression__Group__0 : rule__NaturalExpression__Group__0__Impl rule__NaturalExpression__Group__1 ;
    public final void rule__NaturalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:343:1: ( rule__NaturalExpression__Group__0__Impl rule__NaturalExpression__Group__1 )
            // InternalMyDsl.g:344:2: rule__NaturalExpression__Group__0__Impl rule__NaturalExpression__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__NaturalExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NaturalExpression__Group__1();

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
    // $ANTLR end "rule__NaturalExpression__Group__0"


    // $ANTLR start "rule__NaturalExpression__Group__0__Impl"
    // InternalMyDsl.g:351:1: rule__NaturalExpression__Group__0__Impl : ( () ) ;
    public final void rule__NaturalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:355:1: ( ( () ) )
            // InternalMyDsl.g:356:1: ( () )
            {
            // InternalMyDsl.g:356:1: ( () )
            // InternalMyDsl.g:357:2: ()
            {
             before(grammarAccess.getNaturalExpressionAccess().getEmphasisExpressionAction_0()); 
            // InternalMyDsl.g:358:2: ()
            // InternalMyDsl.g:358:3: 
            {
            }

             after(grammarAccess.getNaturalExpressionAccess().getEmphasisExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NaturalExpression__Group__0__Impl"


    // $ANTLR start "rule__NaturalExpression__Group__1"
    // InternalMyDsl.g:366:1: rule__NaturalExpression__Group__1 : rule__NaturalExpression__Group__1__Impl ;
    public final void rule__NaturalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:370:1: ( rule__NaturalExpression__Group__1__Impl )
            // InternalMyDsl.g:371:2: rule__NaturalExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NaturalExpression__Group__1__Impl();

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
    // $ANTLR end "rule__NaturalExpression__Group__1"


    // $ANTLR start "rule__NaturalExpression__Group__1__Impl"
    // InternalMyDsl.g:377:1: rule__NaturalExpression__Group__1__Impl : ( ( rule__NaturalExpression__ValueAssignment_1 ) ) ;
    public final void rule__NaturalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:381:1: ( ( ( rule__NaturalExpression__ValueAssignment_1 ) ) )
            // InternalMyDsl.g:382:1: ( ( rule__NaturalExpression__ValueAssignment_1 ) )
            {
            // InternalMyDsl.g:382:1: ( ( rule__NaturalExpression__ValueAssignment_1 ) )
            // InternalMyDsl.g:383:2: ( rule__NaturalExpression__ValueAssignment_1 )
            {
             before(grammarAccess.getNaturalExpressionAccess().getValueAssignment_1()); 
            // InternalMyDsl.g:384:2: ( rule__NaturalExpression__ValueAssignment_1 )
            // InternalMyDsl.g:384:3: rule__NaturalExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NaturalExpression__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNaturalExpressionAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__NaturalExpression__Group__1__Impl"


    // $ANTLR start "rule__File__ExpressionAssignment_1"
    // InternalMyDsl.g:393:1: rule__File__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__File__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:397:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:398:2: ( ruleExpression )
            {
            // InternalMyDsl.g:398:2: ( ruleExpression )
            // InternalMyDsl.g:399:3: ruleExpression
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


    // $ANTLR start "rule__HeaderExpression__TitleAssignment_1"
    // InternalMyDsl.g:408:1: rule__HeaderExpression__TitleAssignment_1 : ( ruleEmphasisExpression ) ;
    public final void rule__HeaderExpression__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:412:1: ( ( ruleEmphasisExpression ) )
            // InternalMyDsl.g:413:2: ( ruleEmphasisExpression )
            {
            // InternalMyDsl.g:413:2: ( ruleEmphasisExpression )
            // InternalMyDsl.g:414:3: ruleEmphasisExpression
            {
             before(grammarAccess.getHeaderExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEmphasisExpression();

            state._fsp--;

             after(grammarAccess.getHeaderExpressionAccess().getTitleEmphasisExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__HeaderExpression__TitleAssignment_1"


    // $ANTLR start "rule__NaturalExpression__ValueAssignment_1"
    // InternalMyDsl.g:423:1: rule__NaturalExpression__ValueAssignment_1 : ( RULE_ID ) ;
    public final void rule__NaturalExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:427:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:428:2: ( RULE_ID )
            {
            // InternalMyDsl.g:428:2: ( RULE_ID )
            // InternalMyDsl.g:429:3: RULE_ID
            {
             before(grammarAccess.getNaturalExpressionAccess().getValueIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNaturalExpressionAccess().getValueIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__NaturalExpression__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002010L});

}