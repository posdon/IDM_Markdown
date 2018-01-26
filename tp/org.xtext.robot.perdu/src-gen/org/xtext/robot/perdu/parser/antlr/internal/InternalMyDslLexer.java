package org.xtext.robot.perdu.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=11;
    public static final int RULE_DIGIT=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=6;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( 'while' )
            // InternalMyDsl.g:11:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:12:7: ( 'do' )
            // InternalMyDsl.g:12:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13:7: ( 'end' )
            // InternalMyDsl.g:13:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:14:7: ( 'not' )
            // InternalMyDsl.g:14:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15:7: ( 'and' )
            // InternalMyDsl.g:15:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:16:7: ( 'if' )
            // InternalMyDsl.g:16:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:17:7: ( 'then' )
            // InternalMyDsl.g:17:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:18:7: ( 'else' )
            // InternalMyDsl.g:18:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:19:7: ( 'display' )
            // InternalMyDsl.g:19:9: 'display'
            {
            match("display"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20:7: ( '(' )
            // InternalMyDsl.g:20:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:21:7: ( 'msg' )
            // InternalMyDsl.g:21:9: 'msg'
            {
            match("msg"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:22:7: ( '=' )
            // InternalMyDsl.g:22:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:23:7: ( ',' )
            // InternalMyDsl.g:23:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:24:7: ( 'duration' )
            // InternalMyDsl.g:24:9: 'duration'
            {
            match("duration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:25:7: ( 'line' )
            // InternalMyDsl.g:25:9: 'line'
            {
            match("line"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26:7: ( 'col' )
            // InternalMyDsl.g:26:9: 'col'
            {
            match("col"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:27:7: ( ')' )
            // InternalMyDsl.g:27:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:28:7: ( 'stopEngine' )
            // InternalMyDsl.g:28:9: 'stopEngine'
            {
            match("stopEngine"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:29:7: ( 'stopProgram' )
            // InternalMyDsl.g:29:9: 'stopProgram'
            {
            match("stopProgram"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:30:7: ( 'turn' )
            // InternalMyDsl.g:30:9: 'turn'
            {
            match("turn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:31:7: ( 'power' )
            // InternalMyDsl.g:31:9: 'power'
            {
            match("power"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:32:7: ( 'angle' )
            // InternalMyDsl.g:32:9: 'angle'
            {
            match("angle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:33:7: ( 'hasTurned' )
            // InternalMyDsl.g:33:9: 'hasTurned'
            {
            match("hasTurned"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:34:7: ( 'obstacle' )
            // InternalMyDsl.g:34:9: 'obstacle'
            {
            match("obstacle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:35:7: ( 'distance' )
            // InternalMyDsl.g:35:9: 'distance'
            {
            match("distance"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:36:7: ( 'bip' )
            // InternalMyDsl.g:36:9: 'bip'
            {
            match("bip"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:37:7: ( 'repeat' )
            // InternalMyDsl.g:37:9: 'repeat'
            {
            match("repeat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:38:7: ( 'setTurnAngle' )
            // InternalMyDsl.g:38:9: 'setTurnAngle'
            {
            match("setTurnAngle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:39:7: ( 'move' )
            // InternalMyDsl.g:39:9: 'move'
            {
            match("move"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:40:7: ( 'true' )
            // InternalMyDsl.g:40:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:41:7: ( 'false' )
            // InternalMyDsl.g:41:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1488:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:1488:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:1488:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\"') ) {
                alt3=1;
            }
            else if ( (LA3_0=='\'') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:1488:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:1488:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop1:
                    do {
                        int alt1=3;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0=='\\') ) {
                            alt1=1;
                        }
                        else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                            alt1=2;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMyDsl.g:1488:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:1488:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1488:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:1488:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop2:
                    do {
                        int alt2=3;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0=='\\') ) {
                            alt2=1;
                        }
                        else if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                            alt2=2;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMyDsl.g:1488:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:1488:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1490:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:1490:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:1490:24: ( options {greedy=false; } : . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='*') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='/') ) {
                        alt4=2;
                    }
                    else if ( ((LA4_1>='\u0000' && LA4_1<='.')||(LA4_1>='0' && LA4_1<='\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<=')')||(LA4_0>='+' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:1490:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1492:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:1492:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:1492:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:1492:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalMyDsl.g:1492:40: ( ( '\\r' )? '\\n' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\n'||LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1492:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:1492:41: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalMyDsl.g:1492:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1494:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:1494:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:1494:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalMyDsl.g:1496:21: ( '0' .. '9' )
            // InternalMyDsl.g:1496:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1498:13: ( RULE_INT '.' ( RULE_DIGIT )* )
            // InternalMyDsl.g:1498:15: RULE_INT '.' ( RULE_DIGIT )*
            {
            mRULE_INT(); 
            match('.'); 
            // InternalMyDsl.g:1498:28: ( RULE_DIGIT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1498:28: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1500:10: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* ) )
            // InternalMyDsl.g:1500:12: ( '0' | '1' .. '9' ( RULE_DIGIT )* )
            {
            // InternalMyDsl.g:1500:12: ( '0' | '1' .. '9' ( RULE_DIGIT )* )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='0') ) {
                alt11=1;
            }
            else if ( ((LA11_0>='1' && LA11_0<='9')) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1500:13: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1500:17: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalMyDsl.g:1500:26: ( RULE_DIGIT )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMyDsl.g:1500:26: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1502:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:1502:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:1502:11: ( '^' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='^') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1502:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:1502:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1504:16: ( . )
            // InternalMyDsl.g:1504:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyDsl.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_DOUBLE | RULE_INT | RULE_ID | RULE_ANY_OTHER )
        int alt14=39;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalMyDsl.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalMyDsl.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalMyDsl.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalMyDsl.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalMyDsl.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalMyDsl.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // InternalMyDsl.g:1:196: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 33 :
                // InternalMyDsl.g:1:208: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 34 :
                // InternalMyDsl.g:1:224: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 35 :
                // InternalMyDsl.g:1:240: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 36 :
                // InternalMyDsl.g:1:248: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 37 :
                // InternalMyDsl.g:1:260: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 38 :
                // InternalMyDsl.g:1:269: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 39 :
                // InternalMyDsl.g:1:277: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\7\40\1\uffff\1\40\2\uffff\2\40\1\uffff\7\40\3\36\1\uffff\2\100\1\36\2\uffff\1\40\1\uffff\1\104\6\40\1\114\3\40\1\uffff\2\40\2\uffff\2\40\1\uffff\10\40\6\uffff\1\100\1\40\1\uffff\2\40\1\140\1\40\1\142\1\143\1\40\1\uffff\3\40\1\150\2\40\1\153\5\40\1\161\6\40\1\uffff\1\170\2\uffff\1\40\1\172\1\173\1\174\1\uffff\1\175\1\176\1\uffff\5\40\1\uffff\2\40\1\u0087\3\40\1\uffff\1\u008b\5\uffff\3\40\1\u008f\3\40\1\u0093\1\uffff\3\40\1\uffff\3\40\1\uffff\2\40\1\u009c\1\uffff\1\u009d\7\40\2\uffff\1\u00a5\1\u00a6\4\40\1\u00ab\2\uffff\3\40\1\u00af\1\uffff\1\u00b0\2\40\2\uffff\1\u00b3\1\40\1\uffff\1\u00b5\1\uffff";
    static final String DFA14_eofS =
        "\u00b6\uffff";
    static final String DFA14_minS =
        "\1\0\1\150\1\151\1\154\1\157\1\156\1\146\1\150\1\uffff\1\157\2\uffff\1\151\1\157\1\uffff\1\145\1\157\1\141\1\142\1\151\1\145\1\141\2\0\1\52\1\uffff\2\56\1\101\2\uffff\1\151\1\uffff\1\60\1\163\1\162\1\144\1\163\1\164\1\144\1\60\1\145\1\162\1\165\1\uffff\1\147\1\166\2\uffff\1\156\1\154\1\uffff\1\157\1\164\1\167\2\163\2\160\1\154\6\uffff\1\56\1\154\1\uffff\1\160\1\141\1\60\1\145\2\60\1\154\1\uffff\2\156\1\145\1\60\2\145\1\60\1\160\1\124\1\145\1\124\1\164\1\60\1\145\1\163\1\145\1\154\1\141\1\164\1\uffff\1\60\2\uffff\1\145\3\60\1\uffff\2\60\1\uffff\1\105\1\165\1\162\1\165\1\141\1\uffff\1\141\1\145\1\60\1\141\1\156\1\151\1\uffff\1\60\5\uffff\1\156\2\162\1\60\1\162\1\143\1\164\1\60\1\uffff\1\171\1\143\1\157\1\uffff\1\147\1\157\1\156\1\uffff\1\156\1\154\1\60\1\uffff\1\60\1\145\1\156\1\151\1\147\1\101\2\145\2\uffff\2\60\1\156\1\162\1\156\1\144\1\60\2\uffff\1\145\1\141\1\147\1\60\1\uffff\1\60\1\155\1\154\2\uffff\1\60\1\145\1\uffff\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\150\1\165\1\156\1\157\1\156\1\146\1\165\1\uffff\1\163\2\uffff\1\151\1\157\1\uffff\1\164\1\157\1\141\1\142\1\151\1\145\1\141\2\uffff\1\57\1\uffff\1\56\1\71\1\172\2\uffff\1\151\1\uffff\1\172\1\163\1\162\1\144\1\163\1\164\1\147\1\172\1\145\1\162\1\165\1\uffff\1\147\1\166\2\uffff\1\156\1\154\1\uffff\1\157\1\164\1\167\2\163\2\160\1\154\6\uffff\1\71\1\154\1\uffff\1\164\1\141\1\172\1\145\2\172\1\154\1\uffff\2\156\1\145\1\172\2\145\1\172\1\160\1\124\1\145\1\124\1\164\1\172\1\145\1\163\1\145\1\154\1\141\1\164\1\uffff\1\172\2\uffff\1\145\3\172\1\uffff\2\172\1\uffff\1\120\1\165\1\162\1\165\1\141\1\uffff\1\141\1\145\1\172\1\141\1\156\1\151\1\uffff\1\172\5\uffff\1\156\2\162\1\172\1\162\1\143\1\164\1\172\1\uffff\1\171\1\143\1\157\1\uffff\1\147\1\157\1\156\1\uffff\1\156\1\154\1\172\1\uffff\1\172\1\145\1\156\1\151\1\147\1\101\2\145\2\uffff\2\172\1\156\1\162\1\156\1\144\1\172\2\uffff\1\145\1\141\1\147\1\172\1\uffff\1\172\1\155\1\154\2\uffff\1\172\1\145\1\uffff\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\10\uffff\1\12\1\uffff\1\14\1\15\2\uffff\1\21\12\uffff\1\43\3\uffff\1\46\1\47\1\uffff\1\46\13\uffff\1\12\2\uffff\1\14\1\15\2\uffff\1\21\10\uffff\1\40\1\41\1\42\1\43\1\45\1\44\2\uffff\1\2\7\uffff\1\6\23\uffff\1\3\1\uffff\1\4\1\5\4\uffff\1\13\2\uffff\1\20\5\uffff\1\32\6\uffff\1\10\1\uffff\1\7\1\24\1\36\1\35\1\17\10\uffff\1\1\3\uffff\1\26\3\uffff\1\25\3\uffff\1\37\10\uffff\1\33\1\11\7\uffff\1\31\1\16\4\uffff\1\30\3\uffff\1\27\1\22\2\uffff\1\23\1\uffff\1\34";
    static final String DFA14_specialS =
        "\1\2\25\uffff\1\1\1\0\u009e\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\36\2\31\2\36\1\31\22\36\1\31\1\36\1\26\4\36\1\27\1\10\1\16\2\36\1\13\2\36\1\30\1\32\11\33\3\36\1\12\3\36\32\35\3\36\1\34\1\35\1\36\1\5\1\23\1\15\1\2\1\3\1\25\1\35\1\21\1\6\2\35\1\14\1\11\1\4\1\22\1\20\1\35\1\24\1\17\1\7\2\35\1\1\3\35\uff85\36",
            "\1\37",
            "\1\42\5\uffff\1\41\5\uffff\1\43",
            "\1\45\1\uffff\1\44",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51\11\uffff\1\53\2\uffff\1\52",
            "",
            "\1\56\3\uffff\1\55",
            "",
            "",
            "\1\61",
            "\1\62",
            "",
            "\1\65\16\uffff\1\64",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\0\74",
            "\0\74",
            "\1\75\4\uffff\1\76",
            "",
            "\1\101",
            "\1\101\1\uffff\12\102",
            "\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\1\103",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112\2\uffff\1\113",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\115",
            "\1\116",
            "\1\117",
            "",
            "\1\120",
            "\1\121",
            "",
            "",
            "\1\122",
            "\1\123",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\101\1\uffff\12\102",
            "\1\134",
            "",
            "\1\135\3\uffff\1\136",
            "\1\137",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\141",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\144",
            "",
            "\1\145",
            "\1\146",
            "\1\147",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\151",
            "\1\152",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\1\171",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\177\12\uffff\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "",
            "\1\u0085",
            "\1\u0086",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "",
            "",
            "",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "",
            "\1\u009a",
            "\1\u009b",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00b1",
            "\1\u00b2",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00b4",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_DOUBLE | RULE_INT | RULE_ID | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_23 = input.LA(1);

                        s = -1;
                        if ( ((LA14_23>='\u0000' && LA14_23<='\uFFFF')) ) {s = 60;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_22 = input.LA(1);

                        s = -1;
                        if ( ((LA14_22>='\u0000' && LA14_22<='\uFFFF')) ) {s = 60;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='w') ) {s = 1;}

                        else if ( (LA14_0=='d') ) {s = 2;}

                        else if ( (LA14_0=='e') ) {s = 3;}

                        else if ( (LA14_0=='n') ) {s = 4;}

                        else if ( (LA14_0=='a') ) {s = 5;}

                        else if ( (LA14_0=='i') ) {s = 6;}

                        else if ( (LA14_0=='t') ) {s = 7;}

                        else if ( (LA14_0=='(') ) {s = 8;}

                        else if ( (LA14_0=='m') ) {s = 9;}

                        else if ( (LA14_0=='=') ) {s = 10;}

                        else if ( (LA14_0==',') ) {s = 11;}

                        else if ( (LA14_0=='l') ) {s = 12;}

                        else if ( (LA14_0=='c') ) {s = 13;}

                        else if ( (LA14_0==')') ) {s = 14;}

                        else if ( (LA14_0=='s') ) {s = 15;}

                        else if ( (LA14_0=='p') ) {s = 16;}

                        else if ( (LA14_0=='h') ) {s = 17;}

                        else if ( (LA14_0=='o') ) {s = 18;}

                        else if ( (LA14_0=='b') ) {s = 19;}

                        else if ( (LA14_0=='r') ) {s = 20;}

                        else if ( (LA14_0=='f') ) {s = 21;}

                        else if ( (LA14_0=='\"') ) {s = 22;}

                        else if ( (LA14_0=='\'') ) {s = 23;}

                        else if ( (LA14_0=='/') ) {s = 24;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 25;}

                        else if ( (LA14_0=='0') ) {s = 26;}

                        else if ( ((LA14_0>='1' && LA14_0<='9')) ) {s = 27;}

                        else if ( (LA14_0=='^') ) {s = 28;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='g'||(LA14_0>='j' && LA14_0<='k')||LA14_0=='q'||(LA14_0>='u' && LA14_0<='v')||(LA14_0>='x' && LA14_0<='z')) ) {s = 29;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='*' && LA14_0<='+')||(LA14_0>='-' && LA14_0<='.')||(LA14_0>=':' && LA14_0<='<')||(LA14_0>='>' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}