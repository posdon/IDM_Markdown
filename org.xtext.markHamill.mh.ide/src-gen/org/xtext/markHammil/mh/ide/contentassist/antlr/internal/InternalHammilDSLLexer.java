package org.xtext.markHammil.mh.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHammilDSLLexer extends Lexer {
    public static final int RULE_STRING=4;
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
    public static final int RULE_BL=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=6;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalHammilDSLLexer() {;} 
    public InternalHammilDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalHammilDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalHammilDSL.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHammilDSL.g:11:7: ( '>' )
            // InternalHammilDSL.g:11:9: '>'
            {
            match('>'); 

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
            // InternalHammilDSL.g:12:7: ( '#' )
            // InternalHammilDSL.g:12:9: '#'
            {
            match('#'); 

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
            // InternalHammilDSL.g:13:7: ( '=' )
            // InternalHammilDSL.g:13:9: '='
            {
            match('='); 

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
            // InternalHammilDSL.g:14:7: ( '##' )
            // InternalHammilDSL.g:14:9: '##'
            {
            match("##"); 


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
            // InternalHammilDSL.g:15:7: ( '-' )
            // InternalHammilDSL.g:15:9: '-'
            {
            match('-'); 

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
            // InternalHammilDSL.g:16:7: ( '###' )
            // InternalHammilDSL.g:16:9: '###'
            {
            match("###"); 


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
            // InternalHammilDSL.g:17:7: ( '#####' )
            // InternalHammilDSL.g:17:9: '#####'
            {
            match("#####"); 


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
            // InternalHammilDSL.g:18:7: ( '######' )
            // InternalHammilDSL.g:18:9: '######'
            {
            match("######"); 


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
            // InternalHammilDSL.g:19:7: ( '####' )
            // InternalHammilDSL.g:19:9: '####'
            {
            match("####"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHammilDSL.g:1725:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalHammilDSL.g:1725:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalHammilDSL.g:1725:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalHammilDSL.g:1725:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalHammilDSL.g:1725:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalHammilDSL.g:1725:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // InternalHammilDSL.g:1725:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalHammilDSL.g:1725:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalHammilDSL.g:1725:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalHammilDSL.g:1725:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // InternalHammilDSL.g:1725:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalHammilDSL.g:1727:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalHammilDSL.g:1727:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalHammilDSL.g:1727:24: ( options {greedy=false; } : . )*
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
            	    // InternalHammilDSL.g:1727:52: .
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
            // InternalHammilDSL.g:1729:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalHammilDSL.g:1729:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalHammilDSL.g:1729:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalHammilDSL.g:1729:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalHammilDSL.g:1729:40: ( ( '\\r' )? '\\n' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\n'||LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalHammilDSL.g:1729:41: ( '\\r' )? '\\n'
                    {
                    // InternalHammilDSL.g:1729:41: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalHammilDSL.g:1729:41: '\\r'
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

    // $ANTLR start "RULE_BL"
    public final void mRULE_BL() throws RecognitionException {
        try {
            int _type = RULE_BL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHammilDSL.g:1731:9: ( ( '\\r' )? '\\n' )
            // InternalHammilDSL.g:1731:11: ( '\\r' )? '\\n'
            {
            // InternalHammilDSL.g:1731:11: ( '\\r' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalHammilDSL.g:1731:11: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BL"

    // $ANTLR start "RULE_S"
    public final void mRULE_S() throws RecognitionException {
        try {
            int _type = RULE_S;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHammilDSL.g:1733:8: ( ( ' ' | '\\t' ) )
            // InternalHammilDSL.g:1733:10: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_S"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalHammilDSL.g:1735:21: ( '0' .. '9' )
            // InternalHammilDSL.g:1735:23: '0' .. '9'
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
            // InternalHammilDSL.g:1737:13: ( RULE_INT '.' ( RULE_DIGIT )* )
            // InternalHammilDSL.g:1737:15: RULE_INT '.' ( RULE_DIGIT )*
            {
            mRULE_INT(); 
            match('.'); 
            // InternalHammilDSL.g:1737:28: ( RULE_DIGIT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalHammilDSL.g:1737:28: RULE_DIGIT
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
            // InternalHammilDSL.g:1739:19: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* ) )
            // InternalHammilDSL.g:1739:21: ( '0' | '1' .. '9' ( RULE_DIGIT )* )
            {
            // InternalHammilDSL.g:1739:21: ( '0' | '1' .. '9' ( RULE_DIGIT )* )
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
                    // InternalHammilDSL.g:1739:22: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalHammilDSL.g:1739:26: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalHammilDSL.g:1739:35: ( RULE_DIGIT )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalHammilDSL.g:1739:35: RULE_DIGIT
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
            // InternalHammilDSL.g:1741:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalHammilDSL.g:1741:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalHammilDSL.g:1741:11: ( '^' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='^') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalHammilDSL.g:1741:11: '^'
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

            // InternalHammilDSL.g:1741:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalHammilDSL.g:
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHammilDSL.g:1743:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalHammilDSL.g:1743:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalHammilDSL.g:1743:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalHammilDSL.g:
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHammilDSL.g:1745:16: ( . )
            // InternalHammilDSL.g:1745:18: .
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
        // InternalHammilDSL.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_BL | RULE_S | RULE_DOUBLE | RULE_ID | RULE_WS | RULE_ANY_OTHER )
        int alt15=18;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalHammilDSL.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalHammilDSL.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalHammilDSL.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalHammilDSL.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalHammilDSL.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalHammilDSL.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalHammilDSL.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalHammilDSL.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalHammilDSL.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalHammilDSL.g:1:64: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 11 :
                // InternalHammilDSL.g:1:76: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 12 :
                // InternalHammilDSL.g:1:92: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 13 :
                // InternalHammilDSL.g:1:108: RULE_BL
                {
                mRULE_BL(); 

                }
                break;
            case 14 :
                // InternalHammilDSL.g:1:116: RULE_S
                {
                mRULE_S(); 

                }
                break;
            case 15 :
                // InternalHammilDSL.g:1:123: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 16 :
                // InternalHammilDSL.g:1:135: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 17 :
                // InternalHammilDSL.g:1:143: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 18 :
                // InternalHammilDSL.g:1:151: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\2\uffff\1\22\2\uffff\3\17\1\30\1\32\1\33\3\17\3\uffff\1\37\7\uffff\1\32\4\uffff\1\41\1\uffff\1\43\1\uffff\1\45\3\uffff";
    static final String DFA15_eofS =
        "\46\uffff";
    static final String DFA15_minS =
        "\1\0\1\uffff\1\43\2\uffff\2\0\1\52\1\12\2\11\2\56\1\101\3\uffff\1\43\7\uffff\1\11\4\uffff\1\43\1\uffff\1\43\1\uffff\1\43\3\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\uffff\1\43\2\uffff\2\uffff\1\57\1\12\2\40\1\56\1\71\1\172\3\uffff\1\43\7\uffff\1\40\4\uffff\1\43\1\uffff\1\43\1\uffff\1\43\3\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\5\11\uffff\1\20\1\22\1\1\1\uffff\1\2\1\3\1\5\1\12\1\13\1\14\1\21\1\uffff\1\15\1\16\1\17\1\20\1\uffff\1\4\1\uffff\1\6\1\uffff\1\11\1\10\1\7";
    static final String DFA15_specialS =
        "\1\2\4\uffff\1\1\1\0\37\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\17\1\12\1\11\2\17\1\10\22\17\1\12\1\17\1\5\1\2\3\17\1\6\5\17\1\4\1\17\1\7\1\13\11\14\3\17\1\3\1\1\2\17\32\16\3\17\1\15\1\16\1\17\32\16\uff85\17",
            "",
            "\1\21",
            "",
            "",
            "\0\25",
            "\0\25",
            "\1\26\4\uffff\1\27",
            "\1\31",
            "\2\30\2\uffff\1\30\22\uffff\1\30",
            "\2\30\2\uffff\1\30\22\uffff\1\30",
            "\1\34",
            "\1\34\1\uffff\12\34",
            "\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "",
            "\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\30\2\uffff\1\30\22\uffff\1\30",
            "",
            "",
            "",
            "",
            "\1\40",
            "",
            "\1\42",
            "",
            "\1\44",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_BL | RULE_S | RULE_DOUBLE | RULE_ID | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_6 = input.LA(1);

                        s = -1;
                        if ( ((LA15_6>='\u0000' && LA15_6<='\uFFFF')) ) {s = 21;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_5 = input.LA(1);

                        s = -1;
                        if ( ((LA15_5>='\u0000' && LA15_5<='\uFFFF')) ) {s = 21;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='>') ) {s = 1;}

                        else if ( (LA15_0=='#') ) {s = 2;}

                        else if ( (LA15_0=='=') ) {s = 3;}

                        else if ( (LA15_0=='-') ) {s = 4;}

                        else if ( (LA15_0=='\"') ) {s = 5;}

                        else if ( (LA15_0=='\'') ) {s = 6;}

                        else if ( (LA15_0=='/') ) {s = 7;}

                        else if ( (LA15_0=='\r') ) {s = 8;}

                        else if ( (LA15_0=='\n') ) {s = 9;}

                        else if ( (LA15_0=='\t'||LA15_0==' ') ) {s = 10;}

                        else if ( (LA15_0=='0') ) {s = 11;}

                        else if ( ((LA15_0>='1' && LA15_0<='9')) ) {s = 12;}

                        else if ( (LA15_0=='^') ) {s = 13;}

                        else if ( ((LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {s = 14;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='$' && LA15_0<='&')||(LA15_0>='(' && LA15_0<=',')||LA15_0=='.'||(LA15_0>=':' && LA15_0<='<')||(LA15_0>='?' && LA15_0<='@')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||(LA15_0>='{' && LA15_0<='\uFFFF')) ) {s = 15;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}