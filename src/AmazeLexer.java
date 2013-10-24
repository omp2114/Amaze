// $ANTLR 3.4 C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g 2012-05-05 23:31:11
 
//  package compiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AmazeLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int AND=4;
    public static final int ASSIGN=5;
    public static final int BOARD=6;
    public static final int BOOLEAN=7;
    public static final int COMMENT=8;
    public static final int CONST=9;
    public static final int DBL_EQLS=10;
    public static final int DIVIDE=11;
    public static final int DRAW=12;
    public static final int DWN=13;
    public static final int ELSE=14;
    public static final int END=15;
    public static final int FALSE=16;
    public static final int FUNC=17;
    public static final int GRTR=18;
    public static final int GRTR_EQL=19;
    public static final int ID=20;
    public static final int IF=21;
    public static final int INT=22;
    public static final int LEFT=23;
    public static final int LESS=24;
    public static final int LESS_EQL=25;
    public static final int MAIN=26;
    public static final int MINUS=27;
    public static final int NEGATIONS=28;
    public static final int NOT=29;
    public static final int NOT_EQLS=30;
    public static final int OR=31;
    public static final int PATH=32;
    public static final int PLUS=33;
    public static final int POINT=34;
    public static final int PRINT=35;
    public static final int REASSIGN=36;
    public static final int RETURN=37;
    public static final int RIGHT=38;
    public static final int SET=39;
    public static final int SIZE=40;
    public static final int START=41;
    public static final int STRING=42;
    public static final int STRUCTURE=43;
    public static final int TIMES=44;
    public static final int TRUE=45;
    public static final int UPP=46;
    public static final int WHILE=47;
    public static final int WS=48;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public AmazeLexer() {} 
    public AmazeLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public AmazeLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g"; }

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:11:7: ( '(' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:11:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:12:7: ( ')' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:12:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:13:7: ( ',' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:13:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:14:7: ( ':' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:14:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:15:7: ( ';' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:15:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:16:7: ( '{' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:16:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:17:7: ( '}' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:17:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:244:3: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:244:5: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:244:5: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||(LA1_0 >= '\f' && LA1_0 <= '\r')||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:246:9: ( '/*' ( . )* '*/' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:246:11: '/*' ( . )* '*/'
            {
            match("/*"); 



            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:246:16: ( . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='/') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1 >= '\u0000' && LA2_1 <= '.')||(LA2_1 >= '0' && LA2_1 <= '\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0 >= '\u0000' && LA2_0 <= ')')||(LA2_0 >= '+' && LA2_0 <= '\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:246:16: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match("*/"); 



            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "MAIN"
    public final void mMAIN() throws RecognitionException {
        try {
            int _type = MAIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:248:6: ( 'main' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:248:7: 'main'
            {
            match("main"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MAIN"

    // $ANTLR start "DRAW"
    public final void mDRAW() throws RecognitionException {
        try {
            int _type = DRAW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:250:6: ( 'draw' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:250:8: 'draw'
            {
            match("draw"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DRAW"

    // $ANTLR start "STRUCTURE"
    public final void mSTRUCTURE() throws RecognitionException {
        try {
            int _type = STRUCTURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:253:2: ( 'structure' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:253:4: 'structure'
            {
            match("structure"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRUCTURE"

    // $ANTLR start "FUNC"
    public final void mFUNC() throws RecognitionException {
        try {
            int _type = FUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:255:6: ( 'func' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:255:7: 'func'
            {
            match("func"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNC"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:257:5: ( 'int' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:257:6: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:259:5: ( '&&' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:259:6: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:261:4: ( '||' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:261:5: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "NOT_EQLS"
    public final void mNOT_EQLS() throws RecognitionException {
        try {
            int _type = NOT_EQLS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:263:9: ( '!=' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:263:11: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQLS"

    // $ANTLR start "DBL_EQLS"
    public final void mDBL_EQLS() throws RecognitionException {
        try {
            int _type = DBL_EQLS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:265:9: ( '==' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:265:11: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DBL_EQLS"

    // $ANTLR start "LESS_EQL"
    public final void mLESS_EQL() throws RecognitionException {
        try {
            int _type = LESS_EQL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:267:9: ( '<=' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:267:11: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESS_EQL"

    // $ANTLR start "GRTR_EQL"
    public final void mGRTR_EQL() throws RecognitionException {
        try {
            int _type = GRTR_EQL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:269:9: ( '>=' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:269:11: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GRTR_EQL"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:271:6: ( '<' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:271:7: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:273:5: ( '!' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:273:7: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "GRTR"
    public final void mGRTR() throws RecognitionException {
        try {
            int _type = GRTR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:275:6: ( '>' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:275:7: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GRTR"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:277:7: ( 'while' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:277:8: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:279:8: ( '=' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:279:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:281:7: ( '-' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:281:8: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:283:6: ( '+' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:283:7: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "TIMES"
    public final void mTIMES() throws RecognitionException {
        try {
            int _type = TIMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:285:7: ( '*' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:285:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TIMES"

    // $ANTLR start "DIVIDE"
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:287:8: ( '/' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:287:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIVIDE"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:289:8: ( 'return' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:289:9: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:291:9: ( 'boolean' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:291:10: 'boolean'
            {
            match("boolean"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:293:4: ( 'if' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:293:5: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:295:6: ( 'else' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:295:7: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:297:5: ( 'set' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:297:6: 'set'
            {
            match("set"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SET"

    // $ANTLR start "SIZE"
    public final void mSIZE() throws RecognitionException {
        try {
            int _type = SIZE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:299:6: ( 'size' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:299:7: 'size'
            {
            match("size"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SIZE"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:301:5: ( 'end' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:301:6: 'end'
            {
            match("end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "START"
    public final void mSTART() throws RecognitionException {
        try {
            int _type = START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:303:7: ( 'start' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:303:8: 'start'
            {
            match("start"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "START"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:305:7: ( 'false' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:305:8: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:307:6: ( 'true' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:307:7: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "BOARD"
    public final void mBOARD() throws RecognitionException {
        try {
            int _type = BOARD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:309:7: ( 'board' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:309:8: 'board'
            {
            match("board"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOARD"

    // $ANTLR start "LEFT"
    public final void mLEFT() throws RecognitionException {
        try {
            int _type = LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:311:6: ( 'left' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:311:8: 'left'
            {
            match("left"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEFT"

    // $ANTLR start "UPP"
    public final void mUPP() throws RecognitionException {
        try {
            int _type = UPP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:313:5: ( 'up' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:313:7: 'up'
            {
            match("up"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UPP"

    // $ANTLR start "DWN"
    public final void mDWN() throws RecognitionException {
        try {
            int _type = DWN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:315:5: ( 'down' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:315:7: 'down'
            {
            match("down"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DWN"

    // $ANTLR start "RIGHT"
    public final void mRIGHT() throws RecognitionException {
        try {
            int _type = RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:317:7: ( 'right' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:317:8: 'right'
            {
            match("right"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RIGHT"

    // $ANTLR start "PATH"
    public final void mPATH() throws RecognitionException {
        try {
            int _type = PATH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:319:6: ( 'path' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:319:7: 'path'
            {
            match("path"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PATH"

    // $ANTLR start "POINT"
    public final void mPOINT() throws RecognitionException {
        try {
            int _type = POINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:321:7: ( 'point' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:321:8: 'point'
            {
            match("point"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POINT"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:323:7: ( 'print' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:323:9: 'print'
            {
            match("print"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRINT"

    // $ANTLR start "CONST"
    public final void mCONST() throws RecognitionException {
        try {
            int _type = CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:325:7: ( ( '0' .. '9' )+ )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:325:9: ( '0' .. '9' )+
            {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:325:9: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONST"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:328:4: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:328:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:328:28: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:331:8: ( '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ' ' | '\\t' | '\\n' | '\\r' | '\\f' )* '\"' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:331:10: '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ' ' | '\\t' | '\\n' | '\\r' | '\\f' )* '\"'
            {
            match('\"'); 

            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:331:13: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ' ' | '\\t' | '\\n' | '\\r' | '\\f' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||(LA5_0 >= '\f' && LA5_0 <= '\r')||LA5_0==' '||(LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' '||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:8: ( T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | WS | COMMENT | MAIN | DRAW | STRUCTURE | FUNC | INT | AND | OR | NOT_EQLS | DBL_EQLS | LESS_EQL | GRTR_EQL | LESS | NOT | GRTR | WHILE | ASSIGN | MINUS | PLUS | TIMES | DIVIDE | RETURN | BOOLEAN | IF | ELSE | SET | SIZE | END | START | FALSE | TRUE | BOARD | LEFT | UPP | DWN | RIGHT | PATH | POINT | PRINT | CONST | ID | STRING )
        int alt6=50;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:10: T__49
                {
                mT__49(); 


                }
                break;
            case 2 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:16: T__50
                {
                mT__50(); 


                }
                break;
            case 3 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:22: T__51
                {
                mT__51(); 


                }
                break;
            case 4 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:28: T__52
                {
                mT__52(); 


                }
                break;
            case 5 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:34: T__53
                {
                mT__53(); 


                }
                break;
            case 6 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:40: T__54
                {
                mT__54(); 


                }
                break;
            case 7 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:46: T__55
                {
                mT__55(); 


                }
                break;
            case 8 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:52: WS
                {
                mWS(); 


                }
                break;
            case 9 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:55: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 10 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:63: MAIN
                {
                mMAIN(); 


                }
                break;
            case 11 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:68: DRAW
                {
                mDRAW(); 


                }
                break;
            case 12 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:73: STRUCTURE
                {
                mSTRUCTURE(); 


                }
                break;
            case 13 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:83: FUNC
                {
                mFUNC(); 


                }
                break;
            case 14 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:88: INT
                {
                mINT(); 


                }
                break;
            case 15 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:92: AND
                {
                mAND(); 


                }
                break;
            case 16 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:96: OR
                {
                mOR(); 


                }
                break;
            case 17 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:99: NOT_EQLS
                {
                mNOT_EQLS(); 


                }
                break;
            case 18 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:108: DBL_EQLS
                {
                mDBL_EQLS(); 


                }
                break;
            case 19 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:117: LESS_EQL
                {
                mLESS_EQL(); 


                }
                break;
            case 20 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:126: GRTR_EQL
                {
                mGRTR_EQL(); 


                }
                break;
            case 21 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:135: LESS
                {
                mLESS(); 


                }
                break;
            case 22 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:140: NOT
                {
                mNOT(); 


                }
                break;
            case 23 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:144: GRTR
                {
                mGRTR(); 


                }
                break;
            case 24 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:149: WHILE
                {
                mWHILE(); 


                }
                break;
            case 25 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:155: ASSIGN
                {
                mASSIGN(); 


                }
                break;
            case 26 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:162: MINUS
                {
                mMINUS(); 


                }
                break;
            case 27 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:168: PLUS
                {
                mPLUS(); 


                }
                break;
            case 28 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:173: TIMES
                {
                mTIMES(); 


                }
                break;
            case 29 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:179: DIVIDE
                {
                mDIVIDE(); 


                }
                break;
            case 30 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:186: RETURN
                {
                mRETURN(); 


                }
                break;
            case 31 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:193: BOOLEAN
                {
                mBOOLEAN(); 


                }
                break;
            case 32 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:201: IF
                {
                mIF(); 


                }
                break;
            case 33 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:204: ELSE
                {
                mELSE(); 


                }
                break;
            case 34 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:209: SET
                {
                mSET(); 


                }
                break;
            case 35 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:213: SIZE
                {
                mSIZE(); 


                }
                break;
            case 36 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:218: END
                {
                mEND(); 


                }
                break;
            case 37 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:222: START
                {
                mSTART(); 


                }
                break;
            case 38 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:228: FALSE
                {
                mFALSE(); 


                }
                break;
            case 39 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:234: TRUE
                {
                mTRUE(); 


                }
                break;
            case 40 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:239: BOARD
                {
                mBOARD(); 


                }
                break;
            case 41 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:245: LEFT
                {
                mLEFT(); 


                }
                break;
            case 42 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:250: UPP
                {
                mUPP(); 


                }
                break;
            case 43 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:254: DWN
                {
                mDWN(); 


                }
                break;
            case 44 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:258: RIGHT
                {
                mRIGHT(); 


                }
                break;
            case 45 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:264: PATH
                {
                mPATH(); 


                }
                break;
            case 46 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:269: POINT
                {
                mPOINT(); 


                }
                break;
            case 47 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:275: PRINT
                {
                mPRINT(); 


                }
                break;
            case 48 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:281: CONST
                {
                mCONST(); 


                }
                break;
            case 49 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:287: ID
                {
                mID(); 


                }
                break;
            case 50 :
                // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:1:290: STRING
                {
                mSTRING(); 


                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\11\uffff\1\44\5\41\2\uffff\1\60\1\62\1\64\1\66\1\41\3\uffff\7\41"+
        "\5\uffff\11\41\1\115\10\uffff\10\41\1\127\10\41\1\140\3\41\1\144"+
        "\1\uffff\6\41\1\153\2\41\1\uffff\3\41\1\161\1\162\1\163\2\41\1\uffff"+
        "\1\166\1\167\1\41\1\uffff\5\41\1\176\1\uffff\1\177\1\u0080\1\u0081"+
        "\2\41\3\uffff\1\41\1\u0085\2\uffff\1\u0086\1\u0087\1\41\1\u0089"+
        "\1\41\1\u008b\4\uffff\1\u008c\1\u008d\1\41\3\uffff\1\u008f\1\uffff"+
        "\1\41\3\uffff\1\41\1\uffff\1\u0092\1\41\1\uffff\1\u0094\1\uffff";
    static final String DFA6_eofS =
        "\u0095\uffff";
    static final String DFA6_minS =
        "\1\11\10\uffff\1\52\1\141\1\157\1\145\1\141\1\146\2\uffff\4\75\1"+
        "\150\3\uffff\1\145\1\157\1\154\1\162\1\145\1\160\1\141\5\uffff\1"+
        "\151\1\141\1\167\1\141\1\164\1\172\1\156\1\154\1\164\1\60\10\uffff"+
        "\1\151\1\164\1\147\1\141\1\163\1\144\1\165\1\146\1\60\1\164\2\151"+
        "\1\156\1\167\1\156\1\165\1\162\1\60\1\145\1\143\1\163\1\60\1\uffff"+
        "\1\154\1\165\1\150\1\154\1\162\1\145\1\60\1\145\1\164\1\uffff\1"+
        "\150\2\156\3\60\1\143\1\164\1\uffff\2\60\1\145\1\uffff\1\145\1\162"+
        "\1\164\1\145\1\144\1\60\1\uffff\3\60\2\164\3\uffff\1\164\1\60\2"+
        "\uffff\2\60\1\156\1\60\1\141\1\60\4\uffff\2\60\1\165\3\uffff\1\60"+
        "\1\uffff\1\156\3\uffff\1\162\1\uffff\1\60\1\145\1\uffff\1\60\1\uffff";
    static final String DFA6_maxS =
        "\1\175\10\uffff\1\52\1\141\1\162\1\164\1\165\1\156\2\uffff\4\75"+
        "\1\150\3\uffff\1\151\1\157\1\156\1\162\1\145\1\160\1\162\5\uffff"+
        "\1\151\1\141\1\167\1\162\1\164\1\172\1\156\1\154\1\164\1\172\10"+
        "\uffff\1\151\1\164\1\147\1\157\1\163\1\144\1\165\1\146\1\172\1\164"+
        "\2\151\1\156\1\167\1\156\1\165\1\162\1\172\1\145\1\143\1\163\1\172"+
        "\1\uffff\1\154\1\165\1\150\1\154\1\162\1\145\1\172\1\145\1\164\1"+
        "\uffff\1\150\2\156\3\172\1\143\1\164\1\uffff\2\172\1\145\1\uffff"+
        "\1\145\1\162\1\164\1\145\1\144\1\172\1\uffff\3\172\2\164\3\uffff"+
        "\1\164\1\172\2\uffff\2\172\1\156\1\172\1\141\1\172\4\uffff\2\172"+
        "\1\165\3\uffff\1\172\1\uffff\1\156\3\uffff\1\162\1\uffff\1\172\1"+
        "\145\1\uffff\1\172\1\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\6\uffff\1\17\1\20\5\uffff"+
        "\1\32\1\33\1\34\7\uffff\1\60\1\61\1\62\1\11\1\35\12\uffff\1\21\1"+
        "\26\1\22\1\31\1\23\1\25\1\24\1\27\26\uffff\1\40\11\uffff\1\52\10"+
        "\uffff\1\42\3\uffff\1\16\6\uffff\1\44\5\uffff\1\12\1\13\1\53\2\uffff"+
        "\1\43\1\15\6\uffff\1\41\1\47\1\51\1\55\3\uffff\1\45\1\46\1\30\1"+
        "\uffff\1\54\1\uffff\1\50\1\56\1\57\1\uffff\1\36\2\uffff\1\37\1\uffff"+
        "\1\14";
    static final String DFA6_specialS =
        "\u0095\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\10\1\uffff\2\10\22\uffff\1\10\1\21\1\42\3\uffff\1\17\1\uffff"+
            "\1\1\1\2\1\30\1\27\1\3\1\26\1\uffff\1\11\12\40\1\4\1\5\1\23"+
            "\1\22\1\24\2\uffff\32\41\6\uffff\1\41\1\32\1\41\1\13\1\33\1"+
            "\15\2\41\1\16\2\41\1\35\1\12\2\41\1\37\1\41\1\31\1\14\1\34\1"+
            "\36\1\41\1\25\3\41\1\6\1\20\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\43",
            "\1\45",
            "\1\47\2\uffff\1\46",
            "\1\51\3\uffff\1\52\12\uffff\1\50",
            "\1\54\23\uffff\1\53",
            "\1\56\7\uffff\1\55",
            "",
            "",
            "\1\57",
            "\1\61",
            "\1\63",
            "\1\65",
            "\1\67",
            "",
            "",
            "",
            "\1\70\3\uffff\1\71",
            "\1\72",
            "\1\73\1\uffff\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100\15\uffff\1\101\2\uffff\1\102",
            "",
            "",
            "",
            "",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\107\20\uffff\1\106",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\122\15\uffff\1\121",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\141",
            "\1\142",
            "\1\143",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\154",
            "\1\155",
            "",
            "\1\156",
            "\1\157",
            "\1\160",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\164",
            "\1\165",
            "",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\170",
            "",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\u0082",
            "\1\u0083",
            "",
            "",
            "",
            "\1\u0084",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "",
            "",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\u0088",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\u008a",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\u008e",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "",
            "\1\u0090",
            "",
            "",
            "",
            "\1\u0091",
            "",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\u0093",
            "",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | WS | COMMENT | MAIN | DRAW | STRUCTURE | FUNC | INT | AND | OR | NOT_EQLS | DBL_EQLS | LESS_EQL | GRTR_EQL | LESS | NOT | GRTR | WHILE | ASSIGN | MINUS | PLUS | TIMES | DIVIDE | RETURN | BOOLEAN | IF | ELSE | SET | SIZE | END | START | FALSE | TRUE | BOARD | LEFT | UPP | DWN | RIGHT | PATH | POINT | PRINT | CONST | ID | STRING );";
        }
    }
 

}