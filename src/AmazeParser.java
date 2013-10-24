// $ANTLR 3.4 C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g 2012-05-05 23:31:11

//  package compiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class AmazeParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASSIGN", "BOARD", "BOOLEAN", "COMMENT", "CONST", "DBL_EQLS", "DIVIDE", "DRAW", "DWN", "ELSE", "END", "FALSE", "FUNC", "GRTR", "GRTR_EQL", "ID", "IF", "INT", "LEFT", "LESS", "LESS_EQL", "MAIN", "MINUS", "NEGATIONS", "NOT", "NOT_EQLS", "OR", "PATH", "PLUS", "POINT", "PRINT", "REASSIGN", "RETURN", "RIGHT", "SET", "SIZE", "START", "STRING", "STRUCTURE", "TIMES", "TRUE", "UPP", "WHILE", "WS", "'('", "')'", "','", "':'", "';'", "'{'", "'}'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public AmazeParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public AmazeParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return AmazeParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g"; }


    public static class maze_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "maze"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:22:1: maze : declaration_list main_declaration EOF !;
    public final AmazeParser.maze_return maze() throws RecognitionException {
        AmazeParser.maze_return retval = new AmazeParser.maze_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF3=null;
        AmazeParser.declaration_list_return declaration_list1 =null;

        AmazeParser.main_declaration_return main_declaration2 =null;


        CommonTree EOF3_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:22:6: ( declaration_list main_declaration EOF !)
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:22:9: declaration_list main_declaration EOF !
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_declaration_list_in_maze70);
            declaration_list1=declaration_list();

            state._fsp--;

            adaptor.addChild(root_0, declaration_list1.getTree());

            pushFollow(FOLLOW_main_declaration_in_maze80);
            main_declaration2=main_declaration();

            state._fsp--;

            adaptor.addChild(root_0, main_declaration2.getTree());

            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_maze91); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "maze"


    public static class declaration_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration_list"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:28:1: declaration_list : ( declaration declaration_list |);
    public final AmazeParser.declaration_list_return declaration_list() throws RecognitionException {
        AmazeParser.declaration_list_return retval = new AmazeParser.declaration_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AmazeParser.declaration_return declaration4 =null;

        AmazeParser.declaration_list_return declaration_list5 =null;



        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:28:18: ( declaration declaration_list |)
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0 >= BOARD && LA1_0 <= BOOLEAN)||LA1_0==FUNC||LA1_0==INT||LA1_0==STRUCTURE) ) {
                alt1=1;
            }
            else if ( (LA1_0==MAIN) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:28:20: declaration declaration_list
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_declaration_list106);
                    declaration4=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration4.getTree());

                    pushFollow(FOLLOW_declaration_list_in_declaration_list108);
                    declaration_list5=declaration_list();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration_list5.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:30:6: 
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaration_list"


    public static class declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:32:1: declaration : ( structure_declaration | board_declaration | var_declaration | function_declaration );
    public final AmazeParser.declaration_return declaration() throws RecognitionException {
        AmazeParser.declaration_return retval = new AmazeParser.declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AmazeParser.structure_declaration_return structure_declaration6 =null;

        AmazeParser.board_declaration_return board_declaration7 =null;

        AmazeParser.var_declaration_return var_declaration8 =null;

        AmazeParser.function_declaration_return function_declaration9 =null;



        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:32:13: ( structure_declaration | board_declaration | var_declaration | function_declaration )
            int alt2=4;
            switch ( input.LA(1) ) {
            case STRUCTURE:
                {
                alt2=1;
                }
                break;
            case BOARD:
                {
                alt2=2;
                }
                break;
            case BOOLEAN:
            case INT:
                {
                alt2=3;
                }
                break;
            case FUNC:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:32:15: structure_declaration
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_structure_declaration_in_declaration134);
                    structure_declaration6=structure_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, structure_declaration6.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:33:16: board_declaration
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_board_declaration_in_declaration151);
                    board_declaration7=board_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, board_declaration7.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:34:15: var_declaration
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_var_declaration_in_declaration168);
                    var_declaration8=var_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, var_declaration8.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:35:15: function_declaration
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_declaration_in_declaration184);
                    function_declaration9=function_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, function_declaration9.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaration"


    public static class board_declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "board_declaration"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:38:1: board_declaration : BOARD ID '{' ! board_declaration_list '}' !;
    public final AmazeParser.board_declaration_return board_declaration() throws RecognitionException {
        AmazeParser.board_declaration_return retval = new AmazeParser.board_declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BOARD10=null;
        Token ID11=null;
        Token char_literal12=null;
        Token char_literal14=null;
        AmazeParser.board_declaration_list_return board_declaration_list13 =null;


        CommonTree BOARD10_tree=null;
        CommonTree ID11_tree=null;
        CommonTree char_literal12_tree=null;
        CommonTree char_literal14_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:38:18: ( BOARD ID '{' ! board_declaration_list '}' !)
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:38:20: BOARD ID '{' ! board_declaration_list '}' !
            {
            root_0 = (CommonTree)adaptor.nil();


            BOARD10=(Token)match(input,BOARD,FOLLOW_BOARD_in_board_declaration204); 
            BOARD10_tree = 
            (CommonTree)adaptor.create(BOARD10)
            ;
            adaptor.addChild(root_0, BOARD10_tree);


            ID11=(Token)match(input,ID,FOLLOW_ID_in_board_declaration206); 
            ID11_tree = 
            (CommonTree)adaptor.create(ID11)
            ;
            adaptor.addChild(root_0, ID11_tree);


            char_literal12=(Token)match(input,54,FOLLOW_54_in_board_declaration208); 

            pushFollow(FOLLOW_board_declaration_list_in_board_declaration211);
            board_declaration_list13=board_declaration_list();

            state._fsp--;

            adaptor.addChild(root_0, board_declaration_list13.getTree());

            char_literal14=(Token)match(input,55,FOLLOW_55_in_board_declaration213); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "board_declaration"


    public static class board_declaration_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "board_declaration_list"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:42:1: board_declaration_list : size_declaration start_declaration end_declaration board_statement_list2 ;
    public final AmazeParser.board_declaration_list_return board_declaration_list() throws RecognitionException {
        AmazeParser.board_declaration_list_return retval = new AmazeParser.board_declaration_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AmazeParser.size_declaration_return size_declaration15 =null;

        AmazeParser.start_declaration_return start_declaration16 =null;

        AmazeParser.end_declaration_return end_declaration17 =null;

        AmazeParser.board_statement_list2_return board_statement_list218 =null;



        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:42:23: ( size_declaration start_declaration end_declaration board_statement_list2 )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:42:26: size_declaration start_declaration end_declaration board_statement_list2
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_size_declaration_in_board_declaration_list224);
            size_declaration15=size_declaration();

            state._fsp--;

            adaptor.addChild(root_0, size_declaration15.getTree());

            pushFollow(FOLLOW_start_declaration_in_board_declaration_list226);
            start_declaration16=start_declaration();

            state._fsp--;

            adaptor.addChild(root_0, start_declaration16.getTree());

            pushFollow(FOLLOW_end_declaration_in_board_declaration_list228);
            end_declaration17=end_declaration();

            state._fsp--;

            adaptor.addChild(root_0, end_declaration17.getTree());

            pushFollow(FOLLOW_board_statement_list2_in_board_declaration_list230);
            board_statement_list218=board_statement_list2();

            state._fsp--;

            adaptor.addChild(root_0, board_statement_list218.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "board_declaration_list"


    public static class size_declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "size_declaration"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:45:1: size_declaration : SIZE ':' ! expression ',' ! expression ';' !;
    public final AmazeParser.size_declaration_return size_declaration() throws RecognitionException {
        AmazeParser.size_declaration_return retval = new AmazeParser.size_declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SIZE19=null;
        Token char_literal20=null;
        Token char_literal22=null;
        Token char_literal24=null;
        AmazeParser.expression_return expression21 =null;

        AmazeParser.expression_return expression23 =null;


        CommonTree SIZE19_tree=null;
        CommonTree char_literal20_tree=null;
        CommonTree char_literal22_tree=null;
        CommonTree char_literal24_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:45:19: ( SIZE ':' ! expression ',' ! expression ';' !)
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:45:21: SIZE ':' ! expression ',' ! expression ';' !
            {
            root_0 = (CommonTree)adaptor.nil();


            SIZE19=(Token)match(input,SIZE,FOLLOW_SIZE_in_size_declaration250); 
            SIZE19_tree = 
            (CommonTree)adaptor.create(SIZE19)
            ;
            adaptor.addChild(root_0, SIZE19_tree);


            char_literal20=(Token)match(input,52,FOLLOW_52_in_size_declaration252); 

            pushFollow(FOLLOW_expression_in_size_declaration255);
            expression21=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression21.getTree());

            char_literal22=(Token)match(input,51,FOLLOW_51_in_size_declaration257); 

            pushFollow(FOLLOW_expression_in_size_declaration260);
            expression23=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression23.getTree());

            char_literal24=(Token)match(input,53,FOLLOW_53_in_size_declaration261); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "size_declaration"


    public static class start_declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start_declaration"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:48:1: start_declaration : START ':' ! expression ',' ! expression ';' !;
    public final AmazeParser.start_declaration_return start_declaration() throws RecognitionException {
        AmazeParser.start_declaration_return retval = new AmazeParser.start_declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token START25=null;
        Token char_literal26=null;
        Token char_literal28=null;
        Token char_literal30=null;
        AmazeParser.expression_return expression27 =null;

        AmazeParser.expression_return expression29 =null;


        CommonTree START25_tree=null;
        CommonTree char_literal26_tree=null;
        CommonTree char_literal28_tree=null;
        CommonTree char_literal30_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:48:19: ( START ':' ! expression ',' ! expression ';' !)
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:48:21: START ':' ! expression ',' ! expression ';' !
            {
            root_0 = (CommonTree)adaptor.nil();


            START25=(Token)match(input,START,FOLLOW_START_in_start_declaration286); 
            START25_tree = 
            (CommonTree)adaptor.create(START25)
            ;
            adaptor.addChild(root_0, START25_tree);


            char_literal26=(Token)match(input,52,FOLLOW_52_in_start_declaration288); 

            pushFollow(FOLLOW_expression_in_start_declaration291);
            expression27=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression27.getTree());

            char_literal28=(Token)match(input,51,FOLLOW_51_in_start_declaration292); 

            pushFollow(FOLLOW_expression_in_start_declaration295);
            expression29=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression29.getTree());

            char_literal30=(Token)match(input,53,FOLLOW_53_in_start_declaration296); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "start_declaration"


    public static class end_declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "end_declaration"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:51:1: end_declaration : END ':' ! expression ',' ! expression ';' !;
    public final AmazeParser.end_declaration_return end_declaration() throws RecognitionException {
        AmazeParser.end_declaration_return retval = new AmazeParser.end_declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token END31=null;
        Token char_literal32=null;
        Token char_literal34=null;
        Token char_literal36=null;
        AmazeParser.expression_return expression33 =null;

        AmazeParser.expression_return expression35 =null;


        CommonTree END31_tree=null;
        CommonTree char_literal32_tree=null;
        CommonTree char_literal34_tree=null;
        CommonTree char_literal36_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:51:17: ( END ':' ! expression ',' ! expression ';' !)
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:51:19: END ':' ! expression ',' ! expression ';' !
            {
            root_0 = (CommonTree)adaptor.nil();


            END31=(Token)match(input,END,FOLLOW_END_in_end_declaration312); 
            END31_tree = 
            (CommonTree)adaptor.create(END31)
            ;
            adaptor.addChild(root_0, END31_tree);


            char_literal32=(Token)match(input,52,FOLLOW_52_in_end_declaration314); 

            pushFollow(FOLLOW_expression_in_end_declaration317);
            expression33=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression33.getTree());

            char_literal34=(Token)match(input,51,FOLLOW_51_in_end_declaration318); 

            pushFollow(FOLLOW_expression_in_end_declaration321);
            expression35=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression35.getTree());

            char_literal36=(Token)match(input,53,FOLLOW_53_in_end_declaration322); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "end_declaration"


    public static class var_declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var_declaration"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:54:1: var_declaration : ( int_declaration | bool_declaration );
    public final AmazeParser.var_declaration_return var_declaration() throws RecognitionException {
        AmazeParser.var_declaration_return retval = new AmazeParser.var_declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AmazeParser.int_declaration_return int_declaration37 =null;

        AmazeParser.bool_declaration_return bool_declaration38 =null;



        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:54:17: ( int_declaration | bool_declaration )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==INT) ) {
                alt3=1;
            }
            else if ( (LA3_0==BOOLEAN) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:54:19: int_declaration
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_int_declaration_in_var_declaration348);
                    int_declaration37=int_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, int_declaration37.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:55:19: bool_declaration
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_bool_declaration_in_var_declaration368);
                    bool_declaration38=bool_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, bool_declaration38.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "var_declaration"


    public static class int_declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "int_declaration"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:58:1: int_declaration : ( INT ID ';' !| INT ID ASSIGN ^ expression ';' !);
    public final AmazeParser.int_declaration_return int_declaration() throws RecognitionException {
        AmazeParser.int_declaration_return retval = new AmazeParser.int_declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INT39=null;
        Token ID40=null;
        Token char_literal41=null;
        Token INT42=null;
        Token ID43=null;
        Token ASSIGN44=null;
        Token char_literal46=null;
        AmazeParser.expression_return expression45 =null;


        CommonTree INT39_tree=null;
        CommonTree ID40_tree=null;
        CommonTree char_literal41_tree=null;
        CommonTree INT42_tree=null;
        CommonTree ID43_tree=null;
        CommonTree ASSIGN44_tree=null;
        CommonTree char_literal46_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:58:17: ( INT ID ';' !| INT ID ASSIGN ^ expression ';' !)
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==INT) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==ID) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==53) ) {
                        alt4=1;
                    }
                    else if ( (LA4_2==ASSIGN) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:58:19: INT ID ';' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INT39=(Token)match(input,INT,FOLLOW_INT_in_int_declaration393); 
                    INT39_tree = 
                    (CommonTree)adaptor.create(INT39)
                    ;
                    adaptor.addChild(root_0, INT39_tree);


                    ID40=(Token)match(input,ID,FOLLOW_ID_in_int_declaration395); 
                    ID40_tree = 
                    (CommonTree)adaptor.create(ID40)
                    ;
                    adaptor.addChild(root_0, ID40_tree);


                    char_literal41=(Token)match(input,53,FOLLOW_53_in_int_declaration397); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:59:5: INT ID ASSIGN ^ expression ';' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INT42=(Token)match(input,INT,FOLLOW_INT_in_int_declaration404); 
                    INT42_tree = 
                    (CommonTree)adaptor.create(INT42)
                    ;
                    adaptor.addChild(root_0, INT42_tree);


                    ID43=(Token)match(input,ID,FOLLOW_ID_in_int_declaration406); 
                    ID43_tree = 
                    (CommonTree)adaptor.create(ID43)
                    ;
                    adaptor.addChild(root_0, ID43_tree);


                    ASSIGN44=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_int_declaration408); 
                    ASSIGN44_tree = 
                    (CommonTree)adaptor.create(ASSIGN44)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(ASSIGN44_tree, root_0);


                    pushFollow(FOLLOW_expression_in_int_declaration411);
                    expression45=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression45.getTree());

                    char_literal46=(Token)match(input,53,FOLLOW_53_in_int_declaration413); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "int_declaration"


    public static class bool_declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bool_declaration"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:62:1: bool_declaration : ( BOOLEAN ID ';' !| BOOLEAN ID ASSIGN ^ expression ';' !);
    public final AmazeParser.bool_declaration_return bool_declaration() throws RecognitionException {
        AmazeParser.bool_declaration_return retval = new AmazeParser.bool_declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BOOLEAN47=null;
        Token ID48=null;
        Token char_literal49=null;
        Token BOOLEAN50=null;
        Token ID51=null;
        Token ASSIGN52=null;
        Token char_literal54=null;
        AmazeParser.expression_return expression53 =null;


        CommonTree BOOLEAN47_tree=null;
        CommonTree ID48_tree=null;
        CommonTree char_literal49_tree=null;
        CommonTree BOOLEAN50_tree=null;
        CommonTree ID51_tree=null;
        CommonTree ASSIGN52_tree=null;
        CommonTree char_literal54_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:62:18: ( BOOLEAN ID ';' !| BOOLEAN ID ASSIGN ^ expression ';' !)
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==BOOLEAN) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==ID) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==53) ) {
                        alt5=1;
                    }
                    else if ( (LA5_2==ASSIGN) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:62:20: BOOLEAN ID ';' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    BOOLEAN47=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_bool_declaration425); 
                    BOOLEAN47_tree = 
                    (CommonTree)adaptor.create(BOOLEAN47)
                    ;
                    adaptor.addChild(root_0, BOOLEAN47_tree);


                    ID48=(Token)match(input,ID,FOLLOW_ID_in_bool_declaration427); 
                    ID48_tree = 
                    (CommonTree)adaptor.create(ID48)
                    ;
                    adaptor.addChild(root_0, ID48_tree);


                    char_literal49=(Token)match(input,53,FOLLOW_53_in_bool_declaration429); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:63:6: BOOLEAN ID ASSIGN ^ expression ';' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    BOOLEAN50=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_bool_declaration437); 
                    BOOLEAN50_tree = 
                    (CommonTree)adaptor.create(BOOLEAN50)
                    ;
                    adaptor.addChild(root_0, BOOLEAN50_tree);


                    ID51=(Token)match(input,ID,FOLLOW_ID_in_bool_declaration439); 
                    ID51_tree = 
                    (CommonTree)adaptor.create(ID51)
                    ;
                    adaptor.addChild(root_0, ID51_tree);


                    ASSIGN52=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_bool_declaration441); 
                    ASSIGN52_tree = 
                    (CommonTree)adaptor.create(ASSIGN52)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(ASSIGN52_tree, root_0);


                    pushFollow(FOLLOW_expression_in_bool_declaration444);
                    expression53=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression53.getTree());

                    char_literal54=(Token)match(input,53,FOLLOW_53_in_bool_declaration446); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bool_declaration"


    public static class set_structure_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "set_structure"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:65:1: set_structure : SET '(' ! ID ')' ! ';' !;
    public final AmazeParser.set_structure_return set_structure() throws RecognitionException {
        AmazeParser.set_structure_return retval = new AmazeParser.set_structure_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SET55=null;
        Token char_literal56=null;
        Token ID57=null;
        Token char_literal58=null;
        Token char_literal59=null;

        CommonTree SET55_tree=null;
        CommonTree char_literal56_tree=null;
        CommonTree ID57_tree=null;
        CommonTree char_literal58_tree=null;
        CommonTree char_literal59_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:65:15: ( SET '(' ! ID ')' ! ';' !)
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:65:17: SET '(' ! ID ')' ! ';' !
            {
            root_0 = (CommonTree)adaptor.nil();


            SET55=(Token)match(input,SET,FOLLOW_SET_in_set_structure462); 
            SET55_tree = 
            (CommonTree)adaptor.create(SET55)
            ;
            adaptor.addChild(root_0, SET55_tree);


            char_literal56=(Token)match(input,49,FOLLOW_49_in_set_structure464); 

            ID57=(Token)match(input,ID,FOLLOW_ID_in_set_structure467); 
            ID57_tree = 
            (CommonTree)adaptor.create(ID57)
            ;
            adaptor.addChild(root_0, ID57_tree);


            char_literal58=(Token)match(input,50,FOLLOW_50_in_set_structure469); 

            char_literal59=(Token)match(input,53,FOLLOW_53_in_set_structure472); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "set_structure"


    public static class point_declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "point_declaration"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:69:1: point_declaration : ( POINT ID ':' ! expression ',' ! expression ';' !| POINT ID ';' !);
    public final AmazeParser.point_declaration_return point_declaration() throws RecognitionException {
        AmazeParser.point_declaration_return retval = new AmazeParser.point_declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token POINT60=null;
        Token ID61=null;
        Token char_literal62=null;
        Token char_literal64=null;
        Token char_literal66=null;
        Token POINT67=null;
        Token ID68=null;
        Token char_literal69=null;
        AmazeParser.expression_return expression63 =null;

        AmazeParser.expression_return expression65 =null;


        CommonTree POINT60_tree=null;
        CommonTree ID61_tree=null;
        CommonTree char_literal62_tree=null;
        CommonTree char_literal64_tree=null;
        CommonTree char_literal66_tree=null;
        CommonTree POINT67_tree=null;
        CommonTree ID68_tree=null;
        CommonTree char_literal69_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:69:19: ( POINT ID ':' ! expression ',' ! expression ';' !| POINT ID ';' !)
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==POINT) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==ID) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==52) ) {
                        alt6=1;
                    }
                    else if ( (LA6_2==53) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:69:21: POINT ID ':' ! expression ',' ! expression ';' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    POINT60=(Token)match(input,POINT,FOLLOW_POINT_in_point_declaration497); 
                    POINT60_tree = 
                    (CommonTree)adaptor.create(POINT60)
                    ;
                    adaptor.addChild(root_0, POINT60_tree);


                    ID61=(Token)match(input,ID,FOLLOW_ID_in_point_declaration499); 
                    ID61_tree = 
                    (CommonTree)adaptor.create(ID61)
                    ;
                    adaptor.addChild(root_0, ID61_tree);


                    char_literal62=(Token)match(input,52,FOLLOW_52_in_point_declaration501); 

                    pushFollow(FOLLOW_expression_in_point_declaration504);
                    expression63=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression63.getTree());

                    char_literal64=(Token)match(input,51,FOLLOW_51_in_point_declaration506); 

                    pushFollow(FOLLOW_expression_in_point_declaration509);
                    expression65=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression65.getTree());

                    char_literal66=(Token)match(input,53,FOLLOW_53_in_point_declaration511); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:70:21: POINT ID ';' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    POINT67=(Token)match(input,POINT,FOLLOW_POINT_in_point_declaration534); 
                    POINT67_tree = 
                    (CommonTree)adaptor.create(POINT67)
                    ;
                    adaptor.addChild(root_0, POINT67_tree);


                    ID68=(Token)match(input,ID,FOLLOW_ID_in_point_declaration536); 
                    ID68_tree = 
                    (CommonTree)adaptor.create(ID68)
                    ;
                    adaptor.addChild(root_0, ID68_tree);


                    char_literal69=(Token)match(input,53,FOLLOW_53_in_point_declaration538); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "point_declaration"


    public static class path_declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "path_declaration"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:73:1: path_declaration : ( PATH ID ':' ! ( ID | function_call ) ',' ! direction ',' ! expression ';' !| PATH ID ';' !);
    public final AmazeParser.path_declaration_return path_declaration() throws RecognitionException {
        AmazeParser.path_declaration_return retval = new AmazeParser.path_declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PATH70=null;
        Token ID71=null;
        Token char_literal72=null;
        Token ID73=null;
        Token char_literal75=null;
        Token char_literal77=null;
        Token char_literal79=null;
        Token PATH80=null;
        Token ID81=null;
        Token char_literal82=null;
        AmazeParser.function_call_return function_call74 =null;

        AmazeParser.direction_return direction76 =null;

        AmazeParser.expression_return expression78 =null;


        CommonTree PATH70_tree=null;
        CommonTree ID71_tree=null;
        CommonTree char_literal72_tree=null;
        CommonTree ID73_tree=null;
        CommonTree char_literal75_tree=null;
        CommonTree char_literal77_tree=null;
        CommonTree char_literal79_tree=null;
        CommonTree PATH80_tree=null;
        CommonTree ID81_tree=null;
        CommonTree char_literal82_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:73:18: ( PATH ID ':' ! ( ID | function_call ) ',' ! direction ',' ! expression ';' !| PATH ID ';' !)
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==PATH) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==ID) ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==52) ) {
                        alt8=1;
                    }
                    else if ( (LA8_2==53) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:73:20: PATH ID ':' ! ( ID | function_call ) ',' ! direction ',' ! expression ';' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    PATH70=(Token)match(input,PATH,FOLLOW_PATH_in_path_declaration566); 
                    PATH70_tree = 
                    (CommonTree)adaptor.create(PATH70)
                    ;
                    adaptor.addChild(root_0, PATH70_tree);


                    ID71=(Token)match(input,ID,FOLLOW_ID_in_path_declaration568); 
                    ID71_tree = 
                    (CommonTree)adaptor.create(ID71)
                    ;
                    adaptor.addChild(root_0, ID71_tree);


                    char_literal72=(Token)match(input,52,FOLLOW_52_in_path_declaration570); 

                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:73:33: ( ID | function_call )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==ID) ) {
                        int LA7_1 = input.LA(2);

                        if ( (LA7_1==49) ) {
                            alt7=2;
                        }
                        else if ( (LA7_1==51) ) {
                            alt7=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;

                    }
                    switch (alt7) {
                        case 1 :
                            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:73:34: ID
                            {
                            ID73=(Token)match(input,ID,FOLLOW_ID_in_path_declaration574); 
                            ID73_tree = 
                            (CommonTree)adaptor.create(ID73)
                            ;
                            adaptor.addChild(root_0, ID73_tree);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:73:39: function_call
                            {
                            pushFollow(FOLLOW_function_call_in_path_declaration578);
                            function_call74=function_call();

                            state._fsp--;

                            adaptor.addChild(root_0, function_call74.getTree());

                            }
                            break;

                    }


                    char_literal75=(Token)match(input,51,FOLLOW_51_in_path_declaration581); 

                    pushFollow(FOLLOW_direction_in_path_declaration584);
                    direction76=direction();

                    state._fsp--;

                    adaptor.addChild(root_0, direction76.getTree());

                    char_literal77=(Token)match(input,51,FOLLOW_51_in_path_declaration585); 

                    pushFollow(FOLLOW_expression_in_path_declaration588);
                    expression78=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression78.getTree());

                    char_literal79=(Token)match(input,53,FOLLOW_53_in_path_declaration590); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:74:20: PATH ID ';' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    PATH80=(Token)match(input,PATH,FOLLOW_PATH_in_path_declaration612); 
                    PATH80_tree = 
                    (CommonTree)adaptor.create(PATH80)
                    ;
                    adaptor.addChild(root_0, PATH80_tree);


                    ID81=(Token)match(input,ID,FOLLOW_ID_in_path_declaration615); 
                    ID81_tree = 
                    (CommonTree)adaptor.create(ID81)
                    ;
                    adaptor.addChild(root_0, ID81_tree);


                    char_literal82=(Token)match(input,53,FOLLOW_53_in_path_declaration616); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "path_declaration"


    public static class board_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "board_statement"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:77:1: board_statement : ( board_iteration_stmt | function_call | board_selection_stmt | print_stmt | assgn_expression );
    public final AmazeParser.board_statement_return board_statement() throws RecognitionException {
        AmazeParser.board_statement_return retval = new AmazeParser.board_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AmazeParser.board_iteration_stmt_return board_iteration_stmt83 =null;

        AmazeParser.function_call_return function_call84 =null;

        AmazeParser.board_selection_stmt_return board_selection_stmt85 =null;

        AmazeParser.print_stmt_return print_stmt86 =null;

        AmazeParser.assgn_expression_return assgn_expression87 =null;



        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:77:17: ( board_iteration_stmt | function_call | board_selection_stmt | print_stmt | assgn_expression )
            int alt9=5;
            switch ( input.LA(1) ) {
            case WHILE:
                {
                alt9=1;
                }
                break;
            case ID:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==49) ) {
                    alt9=2;
                }
                else if ( (LA9_2==ASSIGN) ) {
                    alt9=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;

                }
                }
                break;
            case IF:
                {
                alt9=3;
                }
                break;
            case PRINT:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:78:18: board_iteration_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_board_iteration_stmt_in_board_statement660);
                    board_iteration_stmt83=board_iteration_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, board_iteration_stmt83.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:79:19: function_call
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_call_in_board_statement680);
                    function_call84=function_call();

                    state._fsp--;

                    adaptor.addChild(root_0, function_call84.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:80:19: board_selection_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_board_selection_stmt_in_board_statement700);
                    board_selection_stmt85=board_selection_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, board_selection_stmt85.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:81:19: print_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_print_stmt_in_board_statement720);
                    print_stmt86=print_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, print_stmt86.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:82:19: assgn_expression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_assgn_expression_in_board_statement740);
                    assgn_expression87=assgn_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, assgn_expression87.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "board_statement"


    public static class board_iteration_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "board_iteration_stmt"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:85:1: board_iteration_stmt : WHILE ^ '(' ! expression ')' ! '{' ! board_statement_list2 '}' !;
    public final AmazeParser.board_iteration_stmt_return board_iteration_stmt() throws RecognitionException {
        AmazeParser.board_iteration_stmt_return retval = new AmazeParser.board_iteration_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token WHILE88=null;
        Token char_literal89=null;
        Token char_literal91=null;
        Token char_literal92=null;
        Token char_literal94=null;
        AmazeParser.expression_return expression90 =null;

        AmazeParser.board_statement_list2_return board_statement_list293 =null;


        CommonTree WHILE88_tree=null;
        CommonTree char_literal89_tree=null;
        CommonTree char_literal91_tree=null;
        CommonTree char_literal92_tree=null;
        CommonTree char_literal94_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:85:22: ( WHILE ^ '(' ! expression ')' ! '{' ! board_statement_list2 '}' !)
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:85:24: WHILE ^ '(' ! expression ')' ! '{' ! board_statement_list2 '}' !
            {
            root_0 = (CommonTree)adaptor.nil();


            WHILE88=(Token)match(input,WHILE,FOLLOW_WHILE_in_board_iteration_stmt781); 
            WHILE88_tree = 
            (CommonTree)adaptor.create(WHILE88)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(WHILE88_tree, root_0);


            char_literal89=(Token)match(input,49,FOLLOW_49_in_board_iteration_stmt784); 

            pushFollow(FOLLOW_expression_in_board_iteration_stmt787);
            expression90=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression90.getTree());

            char_literal91=(Token)match(input,50,FOLLOW_50_in_board_iteration_stmt789); 

            char_literal92=(Token)match(input,54,FOLLOW_54_in_board_iteration_stmt792); 

            pushFollow(FOLLOW_board_statement_list2_in_board_iteration_stmt795);
            board_statement_list293=board_statement_list2();

            state._fsp--;

            adaptor.addChild(root_0, board_statement_list293.getTree());

            char_literal94=(Token)match(input,55,FOLLOW_55_in_board_iteration_stmt797); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "board_iteration_stmt"


    public static class board_selection_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "board_selection_stmt"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:89:1: board_selection_stmt : IF ^ '(' ! expression ')' ! '{' ! board_statement_list2 '}' ! board_selection_else_stmt ;
    public final AmazeParser.board_selection_stmt_return board_selection_stmt() throws RecognitionException {
        AmazeParser.board_selection_stmt_return retval = new AmazeParser.board_selection_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IF95=null;
        Token char_literal96=null;
        Token char_literal98=null;
        Token char_literal99=null;
        Token char_literal101=null;
        AmazeParser.expression_return expression97 =null;

        AmazeParser.board_statement_list2_return board_statement_list2100 =null;

        AmazeParser.board_selection_else_stmt_return board_selection_else_stmt102 =null;


        CommonTree IF95_tree=null;
        CommonTree char_literal96_tree=null;
        CommonTree char_literal98_tree=null;
        CommonTree char_literal99_tree=null;
        CommonTree char_literal101_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:89:23: ( IF ^ '(' ! expression ')' ! '{' ! board_statement_list2 '}' ! board_selection_else_stmt )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:89:25: IF ^ '(' ! expression ')' ! '{' ! board_statement_list2 '}' ! board_selection_else_stmt
            {
            root_0 = (CommonTree)adaptor.nil();


            IF95=(Token)match(input,IF,FOLLOW_IF_in_board_selection_stmt856); 
            IF95_tree = 
            (CommonTree)adaptor.create(IF95)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(IF95_tree, root_0);


            char_literal96=(Token)match(input,49,FOLLOW_49_in_board_selection_stmt859); 

            pushFollow(FOLLOW_expression_in_board_selection_stmt862);
            expression97=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression97.getTree());

            char_literal98=(Token)match(input,50,FOLLOW_50_in_board_selection_stmt864); 

            char_literal99=(Token)match(input,54,FOLLOW_54_in_board_selection_stmt867); 

            pushFollow(FOLLOW_board_statement_list2_in_board_selection_stmt870);
            board_statement_list2100=board_statement_list2();

            state._fsp--;

            adaptor.addChild(root_0, board_statement_list2100.getTree());

            char_literal101=(Token)match(input,55,FOLLOW_55_in_board_selection_stmt872); 

            pushFollow(FOLLOW_board_selection_else_stmt_in_board_selection_stmt875);
            board_selection_else_stmt102=board_selection_else_stmt();

            state._fsp--;

            adaptor.addChild(root_0, board_selection_else_stmt102.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "board_selection_stmt"


    public static class board_selection_else_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "board_selection_else_stmt"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:92:1: board_selection_else_stmt : ( ELSE ^ '{' ! board_statement_list2 '}' !|);
    public final AmazeParser.board_selection_else_stmt_return board_selection_else_stmt() throws RecognitionException {
        AmazeParser.board_selection_else_stmt_return retval = new AmazeParser.board_selection_else_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ELSE103=null;
        Token char_literal104=null;
        Token char_literal106=null;
        AmazeParser.board_statement_list2_return board_statement_list2105 =null;


        CommonTree ELSE103_tree=null;
        CommonTree char_literal104_tree=null;
        CommonTree char_literal106_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:92:28: ( ELSE ^ '{' ! board_statement_list2 '}' !|)
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ELSE) ) {
                alt10=1;
            }
            else if ( (LA10_0==BOOLEAN||(LA10_0 >= ID && LA10_0 <= INT)||LA10_0==PATH||(LA10_0 >= POINT && LA10_0 <= PRINT)||LA10_0==RETURN||LA10_0==SET||LA10_0==WHILE||LA10_0==55) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:92:30: ELSE ^ '{' ! board_statement_list2 '}' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ELSE103=(Token)match(input,ELSE,FOLLOW_ELSE_in_board_selection_else_stmt911); 
                    ELSE103_tree = 
                    (CommonTree)adaptor.create(ELSE103)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(ELSE103_tree, root_0);


                    char_literal104=(Token)match(input,54,FOLLOW_54_in_board_selection_else_stmt914); 

                    pushFollow(FOLLOW_board_statement_list2_in_board_selection_else_stmt917);
                    board_statement_list2105=board_statement_list2();

                    state._fsp--;

                    adaptor.addChild(root_0, board_statement_list2105.getTree());

                    char_literal106=(Token)match(input,55,FOLLOW_55_in_board_selection_else_stmt919); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:94:28: 
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "board_selection_else_stmt"


    public static class function_call_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_call"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:96:1: function_call : ID '(' expression_list ')' ;
    public final AmazeParser.function_call_return function_call() throws RecognitionException {
        AmazeParser.function_call_return retval = new AmazeParser.function_call_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID107=null;
        Token char_literal108=null;
        Token char_literal110=null;
        AmazeParser.expression_list_return expression_list109 =null;


        CommonTree ID107_tree=null;
        CommonTree char_literal108_tree=null;
        CommonTree char_literal110_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:96:15: ( ID '(' expression_list ')' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:96:18: ID '(' expression_list ')'
            {
            root_0 = (CommonTree)adaptor.nil();


            ID107=(Token)match(input,ID,FOLLOW_ID_in_function_call991); 
            ID107_tree = 
            (CommonTree)adaptor.create(ID107)
            ;
            adaptor.addChild(root_0, ID107_tree);


            char_literal108=(Token)match(input,49,FOLLOW_49_in_function_call992); 
            char_literal108_tree = 
            (CommonTree)adaptor.create(char_literal108)
            ;
            adaptor.addChild(root_0, char_literal108_tree);


            pushFollow(FOLLOW_expression_list_in_function_call994);
            expression_list109=expression_list();

            state._fsp--;

            adaptor.addChild(root_0, expression_list109.getTree());

            char_literal110=(Token)match(input,50,FOLLOW_50_in_function_call996); 
            char_literal110_tree = 
            (CommonTree)adaptor.create(char_literal110)
            ;
            adaptor.addChild(root_0, char_literal110_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_call"


    public static class direction_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "direction"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:99:1: direction : ( LEFT | RIGHT | UPP | DWN );
    public final AmazeParser.direction_return direction() throws RecognitionException {
        AmazeParser.direction_return retval = new AmazeParser.direction_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set111=null;

        CommonTree set111_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:99:11: ( LEFT | RIGHT | UPP | DWN )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set111=(Token)input.LT(1);

            if ( input.LA(1)==DWN||input.LA(1)==LEFT||input.LA(1)==RIGHT||input.LA(1)==UPP ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set111)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "direction"


    public static class main_declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "main_declaration"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:105:1: main_declaration : MAIN '{' ! main_declaration_list '}' !;
    public final AmazeParser.main_declaration_return main_declaration() throws RecognitionException {
        AmazeParser.main_declaration_return retval = new AmazeParser.main_declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token MAIN112=null;
        Token char_literal113=null;
        Token char_literal115=null;
        AmazeParser.main_declaration_list_return main_declaration_list114 =null;


        CommonTree MAIN112_tree=null;
        CommonTree char_literal113_tree=null;
        CommonTree char_literal115_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:105:18: ( MAIN '{' ! main_declaration_list '}' !)
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:105:20: MAIN '{' ! main_declaration_list '}' !
            {
            root_0 = (CommonTree)adaptor.nil();


            MAIN112=(Token)match(input,MAIN,FOLLOW_MAIN_in_main_declaration1145); 
            MAIN112_tree = 
            (CommonTree)adaptor.create(MAIN112)
            ;
            adaptor.addChild(root_0, MAIN112_tree);


            char_literal113=(Token)match(input,54,FOLLOW_54_in_main_declaration1147); 

            pushFollow(FOLLOW_main_declaration_list_in_main_declaration1150);
            main_declaration_list114=main_declaration_list();

            state._fsp--;

            adaptor.addChild(root_0, main_declaration_list114.getTree());

            char_literal115=(Token)match(input,55,FOLLOW_55_in_main_declaration1152); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "main_declaration"


    public static class main_declaration_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "main_declaration_list"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:108:1: main_declaration_list : ( DRAW '(' ! ID ')' ! ';' ! main_declaration_list |);
    public final AmazeParser.main_declaration_list_return main_declaration_list() throws RecognitionException {
        AmazeParser.main_declaration_list_return retval = new AmazeParser.main_declaration_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DRAW116=null;
        Token char_literal117=null;
        Token ID118=null;
        Token char_literal119=null;
        Token char_literal120=null;
        AmazeParser.main_declaration_list_return main_declaration_list121 =null;


        CommonTree DRAW116_tree=null;
        CommonTree char_literal117_tree=null;
        CommonTree ID118_tree=null;
        CommonTree char_literal119_tree=null;
        CommonTree char_literal120_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:108:23: ( DRAW '(' ! ID ')' ! ';' ! main_declaration_list |)
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==DRAW) ) {
                alt11=1;
            }
            else if ( (LA11_0==55) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:108:25: DRAW '(' ! ID ')' ! ';' ! main_declaration_list
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    DRAW116=(Token)match(input,DRAW,FOLLOW_DRAW_in_main_declaration_list1177); 
                    DRAW116_tree = 
                    (CommonTree)adaptor.create(DRAW116)
                    ;
                    adaptor.addChild(root_0, DRAW116_tree);


                    char_literal117=(Token)match(input,49,FOLLOW_49_in_main_declaration_list1180); 

                    ID118=(Token)match(input,ID,FOLLOW_ID_in_main_declaration_list1183); 
                    ID118_tree = 
                    (CommonTree)adaptor.create(ID118)
                    ;
                    adaptor.addChild(root_0, ID118_tree);


                    char_literal119=(Token)match(input,50,FOLLOW_50_in_main_declaration_list1186); 

                    char_literal120=(Token)match(input,53,FOLLOW_53_in_main_declaration_list1189); 

                    pushFollow(FOLLOW_main_declaration_list_in_main_declaration_list1192);
                    main_declaration_list121=main_declaration_list();

                    state._fsp--;

                    adaptor.addChild(root_0, main_declaration_list121.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:110:21: 
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "main_declaration_list"


    public static class structure_declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "structure_declaration"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:113:1: structure_declaration : STRUCTURE ID '{' ! structure_body '}' !;
    public final AmazeParser.structure_declaration_return structure_declaration() throws RecognitionException {
        AmazeParser.structure_declaration_return retval = new AmazeParser.structure_declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token STRUCTURE122=null;
        Token ID123=null;
        Token char_literal124=null;
        Token char_literal126=null;
        AmazeParser.structure_body_return structure_body125 =null;


        CommonTree STRUCTURE122_tree=null;
        CommonTree ID123_tree=null;
        CommonTree char_literal124_tree=null;
        CommonTree char_literal126_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:113:23: ( STRUCTURE ID '{' ! structure_body '}' !)
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:113:25: STRUCTURE ID '{' ! structure_body '}' !
            {
            root_0 = (CommonTree)adaptor.nil();


            STRUCTURE122=(Token)match(input,STRUCTURE,FOLLOW_STRUCTURE_in_structure_declaration1245); 
            STRUCTURE122_tree = 
            (CommonTree)adaptor.create(STRUCTURE122)
            ;
            adaptor.addChild(root_0, STRUCTURE122_tree);


            ID123=(Token)match(input,ID,FOLLOW_ID_in_structure_declaration1247); 
            ID123_tree = 
            (CommonTree)adaptor.create(ID123)
            ;
            adaptor.addChild(root_0, ID123_tree);


            char_literal124=(Token)match(input,54,FOLLOW_54_in_structure_declaration1249); 

            pushFollow(FOLLOW_structure_body_in_structure_declaration1252);
            structure_body125=structure_body();

            state._fsp--;

            adaptor.addChild(root_0, structure_body125.getTree());

            char_literal126=(Token)match(input,55,FOLLOW_55_in_structure_declaration1254); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "structure_declaration"


    public static class structure_body_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "structure_body"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:116:1: structure_body : ( structure_statement structure_body |);
    public final AmazeParser.structure_body_return structure_body() throws RecognitionException {
        AmazeParser.structure_body_return retval = new AmazeParser.structure_body_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AmazeParser.structure_statement_return structure_statement127 =null;

        AmazeParser.structure_body_return structure_body128 =null;



        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:116:17: ( structure_statement structure_body |)
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==BOOLEAN||(LA12_0 >= ID && LA12_0 <= INT)||LA12_0==PATH||(LA12_0 >= POINT && LA12_0 <= PRINT)||LA12_0==WHILE) ) {
                alt12=1;
            }
            else if ( (LA12_0==55) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:117:18: structure_statement structure_body
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_structure_statement_in_structure_body1306);
                    structure_statement127=structure_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, structure_statement127.getTree());

                    pushFollow(FOLLOW_structure_body_in_structure_body1308);
                    structure_body128=structure_body();

                    state._fsp--;

                    adaptor.addChild(root_0, structure_body128.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:119:17: 
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "structure_body"


    public static class structure_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "structure_statement"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:121:1: structure_statement : ( assgn_expression | point_declaration | structure_path_declaration | var_declaration | structure_board_statement );
    public final AmazeParser.structure_statement_return structure_statement() throws RecognitionException {
        AmazeParser.structure_statement_return retval = new AmazeParser.structure_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AmazeParser.assgn_expression_return assgn_expression129 =null;

        AmazeParser.point_declaration_return point_declaration130 =null;

        AmazeParser.structure_path_declaration_return structure_path_declaration131 =null;

        AmazeParser.var_declaration_return var_declaration132 =null;

        AmazeParser.structure_board_statement_return structure_board_statement133 =null;



        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:121:23: ( assgn_expression | point_declaration | structure_path_declaration | var_declaration | structure_board_statement )
            int alt13=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==ASSIGN) ) {
                    alt13=1;
                }
                else if ( (LA13_1==49) ) {
                    alt13=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;

                }
                }
                break;
            case POINT:
                {
                alt13=2;
                }
                break;
            case PATH:
                {
                alt13=3;
                }
                break;
            case BOOLEAN:
            case INT:
                {
                alt13=4;
                }
                break;
            case IF:
            case PRINT:
            case WHILE:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:121:25: assgn_expression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_assgn_expression_in_structure_statement1355);
                    assgn_expression129=assgn_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, assgn_expression129.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:122:19: point_declaration
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_point_declaration_in_structure_statement1375);
                    point_declaration130=point_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, point_declaration130.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:123:19: structure_path_declaration
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_structure_path_declaration_in_structure_statement1395);
                    structure_path_declaration131=structure_path_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, structure_path_declaration131.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:124:19: var_declaration
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_var_declaration_in_structure_statement1415);
                    var_declaration132=var_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, var_declaration132.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:125:19: structure_board_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_structure_board_statement_in_structure_statement1435);
                    structure_board_statement133=structure_board_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, structure_board_statement133.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "structure_statement"


    public static class structure_board_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "structure_board_statement"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:128:1: structure_board_statement : ( structure_iteration_stmt | structure_selection_stmt | print_stmt | function_call );
    public final AmazeParser.structure_board_statement_return structure_board_statement() throws RecognitionException {
        AmazeParser.structure_board_statement_return retval = new AmazeParser.structure_board_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AmazeParser.structure_iteration_stmt_return structure_iteration_stmt134 =null;

        AmazeParser.structure_selection_stmt_return structure_selection_stmt135 =null;

        AmazeParser.print_stmt_return print_stmt136 =null;

        AmazeParser.function_call_return function_call137 =null;



        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:128:27: ( structure_iteration_stmt | structure_selection_stmt | print_stmt | function_call )
            int alt14=4;
            switch ( input.LA(1) ) {
            case WHILE:
                {
                alt14=1;
                }
                break;
            case IF:
                {
                alt14=2;
                }
                break;
            case PRINT:
                {
                alt14=3;
                }
                break;
            case ID:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:129:16: structure_iteration_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_structure_iteration_stmt_in_structure_board_statement1508);
                    structure_iteration_stmt134=structure_iteration_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, structure_iteration_stmt134.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:130:17: structure_selection_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_structure_selection_stmt_in_structure_board_statement1526);
                    structure_selection_stmt135=structure_selection_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, structure_selection_stmt135.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:131:16: print_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_print_stmt_in_structure_board_statement1543);
                    print_stmt136=print_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, print_stmt136.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:132:17: function_call
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_call_in_structure_board_statement1567);
                    function_call137=function_call();

                    state._fsp--;

                    adaptor.addChild(root_0, function_call137.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "structure_board_statement"


    public static class structure_path_declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "structure_path_declaration"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:135:1: structure_path_declaration : ( PATH ID ':' ! ( ID | function_call ) ',' ! direction ',' ! expression ';' !| PATH ID ';' !);
    public final AmazeParser.structure_path_declaration_return structure_path_declaration() throws RecognitionException {
        AmazeParser.structure_path_declaration_return retval = new AmazeParser.structure_path_declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PATH138=null;
        Token ID139=null;
        Token char_literal140=null;
        Token ID141=null;
        Token char_literal143=null;
        Token char_literal145=null;
        Token char_literal147=null;
        Token PATH148=null;
        Token ID149=null;
        Token char_literal150=null;
        AmazeParser.function_call_return function_call142 =null;

        AmazeParser.direction_return direction144 =null;

        AmazeParser.expression_return expression146 =null;


        CommonTree PATH138_tree=null;
        CommonTree ID139_tree=null;
        CommonTree char_literal140_tree=null;
        CommonTree ID141_tree=null;
        CommonTree char_literal143_tree=null;
        CommonTree char_literal145_tree=null;
        CommonTree char_literal147_tree=null;
        CommonTree PATH148_tree=null;
        CommonTree ID149_tree=null;
        CommonTree char_literal150_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:135:28: ( PATH ID ':' ! ( ID | function_call ) ',' ! direction ',' ! expression ';' !| PATH ID ';' !)
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==PATH) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==ID) ) {
                    int LA16_2 = input.LA(3);

                    if ( (LA16_2==52) ) {
                        alt16=1;
                    }
                    else if ( (LA16_2==53) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:135:30: PATH ID ':' ! ( ID | function_call ) ',' ! direction ',' ! expression ';' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    PATH138=(Token)match(input,PATH,FOLLOW_PATH_in_structure_path_declaration1622); 
                    PATH138_tree = 
                    (CommonTree)adaptor.create(PATH138)
                    ;
                    adaptor.addChild(root_0, PATH138_tree);


                    ID139=(Token)match(input,ID,FOLLOW_ID_in_structure_path_declaration1624); 
                    ID139_tree = 
                    (CommonTree)adaptor.create(ID139)
                    ;
                    adaptor.addChild(root_0, ID139_tree);


                    char_literal140=(Token)match(input,52,FOLLOW_52_in_structure_path_declaration1626); 

                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:135:43: ( ID | function_call )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==ID) ) {
                        int LA15_1 = input.LA(2);

                        if ( (LA15_1==49) ) {
                            alt15=2;
                        }
                        else if ( (LA15_1==51) ) {
                            alt15=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;

                    }
                    switch (alt15) {
                        case 1 :
                            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:135:44: ID
                            {
                            ID141=(Token)match(input,ID,FOLLOW_ID_in_structure_path_declaration1630); 
                            ID141_tree = 
                            (CommonTree)adaptor.create(ID141)
                            ;
                            adaptor.addChild(root_0, ID141_tree);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:135:49: function_call
                            {
                            pushFollow(FOLLOW_function_call_in_structure_path_declaration1634);
                            function_call142=function_call();

                            state._fsp--;

                            adaptor.addChild(root_0, function_call142.getTree());

                            }
                            break;

                    }


                    char_literal143=(Token)match(input,51,FOLLOW_51_in_structure_path_declaration1637); 

                    pushFollow(FOLLOW_direction_in_structure_path_declaration1640);
                    direction144=direction();

                    state._fsp--;

                    adaptor.addChild(root_0, direction144.getTree());

                    char_literal145=(Token)match(input,51,FOLLOW_51_in_structure_path_declaration1641); 

                    pushFollow(FOLLOW_expression_in_structure_path_declaration1644);
                    expression146=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression146.getTree());

                    char_literal147=(Token)match(input,53,FOLLOW_53_in_structure_path_declaration1646); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:136:20: PATH ID ';' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    PATH148=(Token)match(input,PATH,FOLLOW_PATH_in_structure_path_declaration1668); 
                    PATH148_tree = 
                    (CommonTree)adaptor.create(PATH148)
                    ;
                    adaptor.addChild(root_0, PATH148_tree);


                    ID149=(Token)match(input,ID,FOLLOW_ID_in_structure_path_declaration1671); 
                    ID149_tree = 
                    (CommonTree)adaptor.create(ID149)
                    ;
                    adaptor.addChild(root_0, ID149_tree);


                    char_literal150=(Token)match(input,53,FOLLOW_53_in_structure_path_declaration1672); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "structure_path_declaration"


    public static class structure_iteration_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "structure_iteration_stmt"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:139:1: structure_iteration_stmt : WHILE ^ '(' ! expression ')' ! '{' ! structure_body '}' !;
    public final AmazeParser.structure_iteration_stmt_return structure_iteration_stmt() throws RecognitionException {
        AmazeParser.structure_iteration_stmt_return retval = new AmazeParser.structure_iteration_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token WHILE151=null;
        Token char_literal152=null;
        Token char_literal154=null;
        Token char_literal155=null;
        Token char_literal157=null;
        AmazeParser.expression_return expression153 =null;

        AmazeParser.structure_body_return structure_body156 =null;


        CommonTree WHILE151_tree=null;
        CommonTree char_literal152_tree=null;
        CommonTree char_literal154_tree=null;
        CommonTree char_literal155_tree=null;
        CommonTree char_literal157_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:139:26: ( WHILE ^ '(' ! expression ')' ! '{' ! structure_body '}' !)
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:139:28: WHILE ^ '(' ! expression ')' ! '{' ! structure_body '}' !
            {
            root_0 = (CommonTree)adaptor.nil();


            WHILE151=(Token)match(input,WHILE,FOLLOW_WHILE_in_structure_iteration_stmt1732); 
            WHILE151_tree = 
            (CommonTree)adaptor.create(WHILE151)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(WHILE151_tree, root_0);


            char_literal152=(Token)match(input,49,FOLLOW_49_in_structure_iteration_stmt1735); 

            pushFollow(FOLLOW_expression_in_structure_iteration_stmt1738);
            expression153=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression153.getTree());

            char_literal154=(Token)match(input,50,FOLLOW_50_in_structure_iteration_stmt1740); 

            char_literal155=(Token)match(input,54,FOLLOW_54_in_structure_iteration_stmt1743); 

            pushFollow(FOLLOW_structure_body_in_structure_iteration_stmt1746);
            structure_body156=structure_body();

            state._fsp--;

            adaptor.addChild(root_0, structure_body156.getTree());

            char_literal157=(Token)match(input,55,FOLLOW_55_in_structure_iteration_stmt1748); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "structure_iteration_stmt"


    public static class structure_selection_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "structure_selection_stmt"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:143:1: structure_selection_stmt : IF ^ '(' ! expression ')' ! '{' ! structure_body '}' ! structure_selection_else_stmt ;
    public final AmazeParser.structure_selection_stmt_return structure_selection_stmt() throws RecognitionException {
        AmazeParser.structure_selection_stmt_return retval = new AmazeParser.structure_selection_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IF158=null;
        Token char_literal159=null;
        Token char_literal161=null;
        Token char_literal162=null;
        Token char_literal164=null;
        AmazeParser.expression_return expression160 =null;

        AmazeParser.structure_body_return structure_body163 =null;

        AmazeParser.structure_selection_else_stmt_return structure_selection_else_stmt165 =null;


        CommonTree IF158_tree=null;
        CommonTree char_literal159_tree=null;
        CommonTree char_literal161_tree=null;
        CommonTree char_literal162_tree=null;
        CommonTree char_literal164_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:143:27: ( IF ^ '(' ! expression ')' ! '{' ! structure_body '}' ! structure_selection_else_stmt )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:143:29: IF ^ '(' ! expression ')' ! '{' ! structure_body '}' ! structure_selection_else_stmt
            {
            root_0 = (CommonTree)adaptor.nil();


            IF158=(Token)match(input,IF,FOLLOW_IF_in_structure_selection_stmt1806); 
            IF158_tree = 
            (CommonTree)adaptor.create(IF158)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(IF158_tree, root_0);


            char_literal159=(Token)match(input,49,FOLLOW_49_in_structure_selection_stmt1809); 

            pushFollow(FOLLOW_expression_in_structure_selection_stmt1812);
            expression160=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression160.getTree());

            char_literal161=(Token)match(input,50,FOLLOW_50_in_structure_selection_stmt1814); 

            char_literal162=(Token)match(input,54,FOLLOW_54_in_structure_selection_stmt1817); 

            pushFollow(FOLLOW_structure_body_in_structure_selection_stmt1820);
            structure_body163=structure_body();

            state._fsp--;

            adaptor.addChild(root_0, structure_body163.getTree());

            char_literal164=(Token)match(input,55,FOLLOW_55_in_structure_selection_stmt1822); 

            pushFollow(FOLLOW_structure_selection_else_stmt_in_structure_selection_stmt1825);
            structure_selection_else_stmt165=structure_selection_else_stmt();

            state._fsp--;

            adaptor.addChild(root_0, structure_selection_else_stmt165.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "structure_selection_stmt"


    public static class structure_selection_else_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "structure_selection_else_stmt"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:146:1: structure_selection_else_stmt : ( ELSE ^ '{' ! structure_body '}' !|);
    public final AmazeParser.structure_selection_else_stmt_return structure_selection_else_stmt() throws RecognitionException {
        AmazeParser.structure_selection_else_stmt_return retval = new AmazeParser.structure_selection_else_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ELSE166=null;
        Token char_literal167=null;
        Token char_literal169=null;
        AmazeParser.structure_body_return structure_body168 =null;


        CommonTree ELSE166_tree=null;
        CommonTree char_literal167_tree=null;
        CommonTree char_literal169_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:146:31: ( ELSE ^ '{' ! structure_body '}' !|)
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ELSE) ) {
                alt17=1;
            }
            else if ( (LA17_0==BOOLEAN||(LA17_0 >= ID && LA17_0 <= INT)||LA17_0==PATH||(LA17_0 >= POINT && LA17_0 <= PRINT)||LA17_0==WHILE||LA17_0==55) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:146:33: ELSE ^ '{' ! structure_body '}' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ELSE166=(Token)match(input,ELSE,FOLLOW_ELSE_in_structure_selection_else_stmt1854); 
                    ELSE166_tree = 
                    (CommonTree)adaptor.create(ELSE166)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(ELSE166_tree, root_0);


                    char_literal167=(Token)match(input,54,FOLLOW_54_in_structure_selection_else_stmt1857); 

                    pushFollow(FOLLOW_structure_body_in_structure_selection_else_stmt1860);
                    structure_body168=structure_body();

                    state._fsp--;

                    adaptor.addChild(root_0, structure_body168.getTree());

                    char_literal169=(Token)match(input,55,FOLLOW_55_in_structure_selection_else_stmt1862); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:148:21: 
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "structure_selection_else_stmt"


    public static class function_declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_declaration"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:150:1: function_declaration : ( FUNC INT ID '(' ! parameters ')' ! '{' ! board_statement_list2 jump_stmt '}' !| FUNC BOOLEAN ID '(' ! parameters ')' ! '{' ! board_statement_list2 jump_stmt '}' !| FUNC POINT ID '(' ! parameters ')' ! '{' ! board_statement_list2 jump_stmt '}' !| FUNC ID '(' ! parameters ')' ! '{' ! board_statement_list2 '}' !);
    public final AmazeParser.function_declaration_return function_declaration() throws RecognitionException {
        AmazeParser.function_declaration_return retval = new AmazeParser.function_declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token FUNC170=null;
        Token INT171=null;
        Token ID172=null;
        Token char_literal173=null;
        Token char_literal175=null;
        Token char_literal176=null;
        Token char_literal179=null;
        Token FUNC180=null;
        Token BOOLEAN181=null;
        Token ID182=null;
        Token char_literal183=null;
        Token char_literal185=null;
        Token char_literal186=null;
        Token char_literal189=null;
        Token FUNC190=null;
        Token POINT191=null;
        Token ID192=null;
        Token char_literal193=null;
        Token char_literal195=null;
        Token char_literal196=null;
        Token char_literal199=null;
        Token FUNC200=null;
        Token ID201=null;
        Token char_literal202=null;
        Token char_literal204=null;
        Token char_literal205=null;
        Token char_literal207=null;
        AmazeParser.parameters_return parameters174 =null;

        AmazeParser.board_statement_list2_return board_statement_list2177 =null;

        AmazeParser.jump_stmt_return jump_stmt178 =null;

        AmazeParser.parameters_return parameters184 =null;

        AmazeParser.board_statement_list2_return board_statement_list2187 =null;

        AmazeParser.jump_stmt_return jump_stmt188 =null;

        AmazeParser.parameters_return parameters194 =null;

        AmazeParser.board_statement_list2_return board_statement_list2197 =null;

        AmazeParser.jump_stmt_return jump_stmt198 =null;

        AmazeParser.parameters_return parameters203 =null;

        AmazeParser.board_statement_list2_return board_statement_list2206 =null;


        CommonTree FUNC170_tree=null;
        CommonTree INT171_tree=null;
        CommonTree ID172_tree=null;
        CommonTree char_literal173_tree=null;
        CommonTree char_literal175_tree=null;
        CommonTree char_literal176_tree=null;
        CommonTree char_literal179_tree=null;
        CommonTree FUNC180_tree=null;
        CommonTree BOOLEAN181_tree=null;
        CommonTree ID182_tree=null;
        CommonTree char_literal183_tree=null;
        CommonTree char_literal185_tree=null;
        CommonTree char_literal186_tree=null;
        CommonTree char_literal189_tree=null;
        CommonTree FUNC190_tree=null;
        CommonTree POINT191_tree=null;
        CommonTree ID192_tree=null;
        CommonTree char_literal193_tree=null;
        CommonTree char_literal195_tree=null;
        CommonTree char_literal196_tree=null;
        CommonTree char_literal199_tree=null;
        CommonTree FUNC200_tree=null;
        CommonTree ID201_tree=null;
        CommonTree char_literal202_tree=null;
        CommonTree char_literal204_tree=null;
        CommonTree char_literal205_tree=null;
        CommonTree char_literal207_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:150:22: ( FUNC INT ID '(' ! parameters ')' ! '{' ! board_statement_list2 jump_stmt '}' !| FUNC BOOLEAN ID '(' ! parameters ')' ! '{' ! board_statement_list2 jump_stmt '}' !| FUNC POINT ID '(' ! parameters ')' ! '{' ! board_statement_list2 jump_stmt '}' !| FUNC ID '(' ! parameters ')' ! '{' ! board_statement_list2 '}' !)
            int alt18=4;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==FUNC) ) {
                switch ( input.LA(2) ) {
                case INT:
                    {
                    alt18=1;
                    }
                    break;
                case BOOLEAN:
                    {
                    alt18=2;
                    }
                    break;
                case POINT:
                    {
                    alt18=3;
                    }
                    break;
                case ID:
                    {
                    alt18=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:150:24: FUNC INT ID '(' ! parameters ')' ! '{' ! board_statement_list2 jump_stmt '}' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    FUNC170=(Token)match(input,FUNC,FOLLOW_FUNC_in_function_declaration1933); 
                    FUNC170_tree = 
                    (CommonTree)adaptor.create(FUNC170)
                    ;
                    adaptor.addChild(root_0, FUNC170_tree);


                    INT171=(Token)match(input,INT,FOLLOW_INT_in_function_declaration1935); 
                    INT171_tree = 
                    (CommonTree)adaptor.create(INT171)
                    ;
                    adaptor.addChild(root_0, INT171_tree);


                    ID172=(Token)match(input,ID,FOLLOW_ID_in_function_declaration1937); 
                    ID172_tree = 
                    (CommonTree)adaptor.create(ID172)
                    ;
                    adaptor.addChild(root_0, ID172_tree);


                    char_literal173=(Token)match(input,49,FOLLOW_49_in_function_declaration1938); 

                    pushFollow(FOLLOW_parameters_in_function_declaration1940);
                    parameters174=parameters();

                    state._fsp--;

                    adaptor.addChild(root_0, parameters174.getTree());

                    char_literal175=(Token)match(input,50,FOLLOW_50_in_function_declaration1941); 

                    char_literal176=(Token)match(input,54,FOLLOW_54_in_function_declaration1944); 

                    pushFollow(FOLLOW_board_statement_list2_in_function_declaration1946);
                    board_statement_list2177=board_statement_list2();

                    state._fsp--;

                    adaptor.addChild(root_0, board_statement_list2177.getTree());

                    pushFollow(FOLLOW_jump_stmt_in_function_declaration1948);
                    jump_stmt178=jump_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, jump_stmt178.getTree());

                    char_literal179=(Token)match(input,55,FOLLOW_55_in_function_declaration1949); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:151:10: FUNC BOOLEAN ID '(' ! parameters ')' ! '{' ! board_statement_list2 jump_stmt '}' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    FUNC180=(Token)match(input,FUNC,FOLLOW_FUNC_in_function_declaration1961); 
                    FUNC180_tree = 
                    (CommonTree)adaptor.create(FUNC180)
                    ;
                    adaptor.addChild(root_0, FUNC180_tree);


                    BOOLEAN181=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_function_declaration1963); 
                    BOOLEAN181_tree = 
                    (CommonTree)adaptor.create(BOOLEAN181)
                    ;
                    adaptor.addChild(root_0, BOOLEAN181_tree);


                    ID182=(Token)match(input,ID,FOLLOW_ID_in_function_declaration1965); 
                    ID182_tree = 
                    (CommonTree)adaptor.create(ID182)
                    ;
                    adaptor.addChild(root_0, ID182_tree);


                    char_literal183=(Token)match(input,49,FOLLOW_49_in_function_declaration1966); 

                    pushFollow(FOLLOW_parameters_in_function_declaration1968);
                    parameters184=parameters();

                    state._fsp--;

                    adaptor.addChild(root_0, parameters184.getTree());

                    char_literal185=(Token)match(input,50,FOLLOW_50_in_function_declaration1969); 

                    char_literal186=(Token)match(input,54,FOLLOW_54_in_function_declaration1972); 

                    pushFollow(FOLLOW_board_statement_list2_in_function_declaration1974);
                    board_statement_list2187=board_statement_list2();

                    state._fsp--;

                    adaptor.addChild(root_0, board_statement_list2187.getTree());

                    pushFollow(FOLLOW_jump_stmt_in_function_declaration1976);
                    jump_stmt188=jump_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, jump_stmt188.getTree());

                    char_literal189=(Token)match(input,55,FOLLOW_55_in_function_declaration1977); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:152:10: FUNC POINT ID '(' ! parameters ')' ! '{' ! board_statement_list2 jump_stmt '}' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    FUNC190=(Token)match(input,FUNC,FOLLOW_FUNC_in_function_declaration1989); 
                    FUNC190_tree = 
                    (CommonTree)adaptor.create(FUNC190)
                    ;
                    adaptor.addChild(root_0, FUNC190_tree);


                    POINT191=(Token)match(input,POINT,FOLLOW_POINT_in_function_declaration1991); 
                    POINT191_tree = 
                    (CommonTree)adaptor.create(POINT191)
                    ;
                    adaptor.addChild(root_0, POINT191_tree);


                    ID192=(Token)match(input,ID,FOLLOW_ID_in_function_declaration1993); 
                    ID192_tree = 
                    (CommonTree)adaptor.create(ID192)
                    ;
                    adaptor.addChild(root_0, ID192_tree);


                    char_literal193=(Token)match(input,49,FOLLOW_49_in_function_declaration1995); 

                    pushFollow(FOLLOW_parameters_in_function_declaration1997);
                    parameters194=parameters();

                    state._fsp--;

                    adaptor.addChild(root_0, parameters194.getTree());

                    char_literal195=(Token)match(input,50,FOLLOW_50_in_function_declaration1998); 

                    char_literal196=(Token)match(input,54,FOLLOW_54_in_function_declaration2001); 

                    pushFollow(FOLLOW_board_statement_list2_in_function_declaration2003);
                    board_statement_list2197=board_statement_list2();

                    state._fsp--;

                    adaptor.addChild(root_0, board_statement_list2197.getTree());

                    pushFollow(FOLLOW_jump_stmt_in_function_declaration2005);
                    jump_stmt198=jump_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, jump_stmt198.getTree());

                    char_literal199=(Token)match(input,55,FOLLOW_55_in_function_declaration2006); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:153:10: FUNC ID '(' ! parameters ')' ! '{' ! board_statement_list2 '}' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    FUNC200=(Token)match(input,FUNC,FOLLOW_FUNC_in_function_declaration2018); 
                    FUNC200_tree = 
                    (CommonTree)adaptor.create(FUNC200)
                    ;
                    adaptor.addChild(root_0, FUNC200_tree);


                    ID201=(Token)match(input,ID,FOLLOW_ID_in_function_declaration2020); 
                    ID201_tree = 
                    (CommonTree)adaptor.create(ID201)
                    ;
                    adaptor.addChild(root_0, ID201_tree);


                    char_literal202=(Token)match(input,49,FOLLOW_49_in_function_declaration2022); 

                    pushFollow(FOLLOW_parameters_in_function_declaration2024);
                    parameters203=parameters();

                    state._fsp--;

                    adaptor.addChild(root_0, parameters203.getTree());

                    char_literal204=(Token)match(input,50,FOLLOW_50_in_function_declaration2025); 

                    char_literal205=(Token)match(input,54,FOLLOW_54_in_function_declaration2028); 

                    pushFollow(FOLLOW_board_statement_list2_in_function_declaration2031);
                    board_statement_list2206=board_statement_list2();

                    state._fsp--;

                    adaptor.addChild(root_0, board_statement_list2206.getTree());

                    char_literal207=(Token)match(input,55,FOLLOW_55_in_function_declaration2033); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_declaration"


    public static class parameters_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameters"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:156:1: parameters : (| var_declaration_unassigned ) ( ',' ! var_declaration_unassigned )* ;
    public final AmazeParser.parameters_return parameters() throws RecognitionException {
        AmazeParser.parameters_return retval = new AmazeParser.parameters_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal209=null;
        AmazeParser.var_declaration_unassigned_return var_declaration_unassigned208 =null;

        AmazeParser.var_declaration_unassigned_return var_declaration_unassigned210 =null;


        CommonTree char_literal209_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:156:17: ( (| var_declaration_unassigned ) ( ',' ! var_declaration_unassigned )* )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:156:19: (| var_declaration_unassigned ) ( ',' ! var_declaration_unassigned )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:156:19: (| var_declaration_unassigned )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0 >= 50 && LA19_0 <= 51)) ) {
                alt19=1;
            }
            else if ( (LA19_0==BOOLEAN||LA19_0==INT) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:156:32: 
                    {
                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:156:34: var_declaration_unassigned
                    {
                    pushFollow(FOLLOW_var_declaration_unassigned_in_parameters2055);
                    var_declaration_unassigned208=var_declaration_unassigned();

                    state._fsp--;

                    adaptor.addChild(root_0, var_declaration_unassigned208.getTree());

                    }
                    break;

            }


            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:156:62: ( ',' ! var_declaration_unassigned )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==51) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:156:63: ',' ! var_declaration_unassigned
            	    {
            	    char_literal209=(Token)match(input,51,FOLLOW_51_in_parameters2059); 

            	    pushFollow(FOLLOW_var_declaration_unassigned_in_parameters2062);
            	    var_declaration_unassigned210=var_declaration_unassigned();

            	    state._fsp--;

            	    adaptor.addChild(root_0, var_declaration_unassigned210.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameters"


    public static class var_declaration_unassigned_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var_declaration_unassigned"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:159:1: var_declaration_unassigned : ( INT ID | BOOLEAN ID );
    public final AmazeParser.var_declaration_unassigned_return var_declaration_unassigned() throws RecognitionException {
        AmazeParser.var_declaration_unassigned_return retval = new AmazeParser.var_declaration_unassigned_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INT211=null;
        Token ID212=null;
        Token BOOLEAN213=null;
        Token ID214=null;

        CommonTree INT211_tree=null;
        CommonTree ID212_tree=null;
        CommonTree BOOLEAN213_tree=null;
        CommonTree ID214_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:159:28: ( INT ID | BOOLEAN ID )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==INT) ) {
                alt21=1;
            }
            else if ( (LA21_0==BOOLEAN) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:159:30: INT ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INT211=(Token)match(input,INT,FOLLOW_INT_in_var_declaration_unassigned2092); 
                    INT211_tree = 
                    (CommonTree)adaptor.create(INT211)
                    ;
                    adaptor.addChild(root_0, INT211_tree);


                    ID212=(Token)match(input,ID,FOLLOW_ID_in_var_declaration_unassigned2094); 
                    ID212_tree = 
                    (CommonTree)adaptor.create(ID212)
                    ;
                    adaptor.addChild(root_0, ID212_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:160:30: BOOLEAN ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    BOOLEAN213=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_var_declaration_unassigned2125); 
                    BOOLEAN213_tree = 
                    (CommonTree)adaptor.create(BOOLEAN213)
                    ;
                    adaptor.addChild(root_0, BOOLEAN213_tree);


                    ID214=(Token)match(input,ID,FOLLOW_ID_in_var_declaration_unassigned2127); 
                    ID214_tree = 
                    (CommonTree)adaptor.create(ID214)
                    ;
                    adaptor.addChild(root_0, ID214_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "var_declaration_unassigned"


    public static class statement_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement_list"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:165:1: statement_list : ( statement )* ;
    public final AmazeParser.statement_list_return statement_list() throws RecognitionException {
        AmazeParser.statement_list_return retval = new AmazeParser.statement_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AmazeParser.statement_return statement215 =null;



        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:165:17: ( ( statement )* )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:165:19: ( statement )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:165:19: ( statement )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==BOOLEAN||(LA22_0 >= ID && LA22_0 <= INT)||LA22_0==PATH||LA22_0==POINT||LA22_0==WHILE) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:165:20: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_statement_list2175);
            	    statement215=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement215.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement_list"


    public static class board_statement_list2_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "board_statement_list2"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:168:1: board_statement_list2 : ( board_statement_2 board_statement_list2 |);
    public final AmazeParser.board_statement_list2_return board_statement_list2() throws RecognitionException {
        AmazeParser.board_statement_list2_return retval = new AmazeParser.board_statement_list2_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AmazeParser.board_statement_2_return board_statement_2216 =null;

        AmazeParser.board_statement_list2_return board_statement_list2217 =null;



        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:168:22: ( board_statement_2 board_statement_list2 |)
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==BOOLEAN||(LA23_0 >= ID && LA23_0 <= INT)||LA23_0==PATH||(LA23_0 >= POINT && LA23_0 <= PRINT)||LA23_0==SET||LA23_0==WHILE) ) {
                alt23=1;
            }
            else if ( (LA23_0==RETURN||LA23_0==55) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:168:24: board_statement_2 board_statement_list2
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_board_statement_2_in_board_statement_list22201);
                    board_statement_2216=board_statement_2();

                    state._fsp--;

                    adaptor.addChild(root_0, board_statement_2216.getTree());

                    pushFollow(FOLLOW_board_statement_list2_in_board_statement_list22203);
                    board_statement_list2217=board_statement_list2();

                    state._fsp--;

                    adaptor.addChild(root_0, board_statement_list2217.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:170:23: 
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "board_statement_list2"


    public static class board_statement_2_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "board_statement_2"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:172:1: board_statement_2 : ( set_structure | var_declaration | board_statement | point_declaration | path_declaration );
    public final AmazeParser.board_statement_2_return board_statement_2() throws RecognitionException {
        AmazeParser.board_statement_2_return retval = new AmazeParser.board_statement_2_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AmazeParser.set_structure_return set_structure218 =null;

        AmazeParser.var_declaration_return var_declaration219 =null;

        AmazeParser.board_statement_return board_statement220 =null;

        AmazeParser.point_declaration_return point_declaration221 =null;

        AmazeParser.path_declaration_return path_declaration222 =null;



        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:172:18: ( set_structure | var_declaration | board_statement | point_declaration | path_declaration )
            int alt24=5;
            switch ( input.LA(1) ) {
            case SET:
                {
                alt24=1;
                }
                break;
            case BOOLEAN:
            case INT:
                {
                alt24=2;
                }
                break;
            case ID:
            case IF:
            case PRINT:
            case WHILE:
                {
                alt24=3;
                }
                break;
            case POINT:
                {
                alt24=4;
                }
                break;
            case PATH:
                {
                alt24=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:172:20: set_structure
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_set_structure_in_board_statement_22262);
                    set_structure218=set_structure();

                    state._fsp--;

                    adaptor.addChild(root_0, set_structure218.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:173:20: var_declaration
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_var_declaration_in_board_statement_22284);
                    var_declaration219=var_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, var_declaration219.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:174:20: board_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_board_statement_in_board_statement_22306);
                    board_statement220=board_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, board_statement220.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:175:20: point_declaration
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_point_declaration_in_board_statement_22328);
                    point_declaration221=point_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, point_declaration221.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:176:20: path_declaration
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_path_declaration_in_board_statement_22350);
                    path_declaration222=path_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, path_declaration222.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "board_statement_2"


    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:179:1: statement : ( assgn_expression | iteration_stmt | selection_stmt | point_declaration | path_declaration | var_declaration );
    public final AmazeParser.statement_return statement() throws RecognitionException {
        AmazeParser.statement_return retval = new AmazeParser.statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AmazeParser.assgn_expression_return assgn_expression223 =null;

        AmazeParser.iteration_stmt_return iteration_stmt224 =null;

        AmazeParser.selection_stmt_return selection_stmt225 =null;

        AmazeParser.point_declaration_return point_declaration226 =null;

        AmazeParser.path_declaration_return path_declaration227 =null;

        AmazeParser.var_declaration_return var_declaration228 =null;



        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:179:17: ( assgn_expression | iteration_stmt | selection_stmt | point_declaration | path_declaration | var_declaration )
            int alt25=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt25=1;
                }
                break;
            case WHILE:
                {
                alt25=2;
                }
                break;
            case IF:
                {
                alt25=3;
                }
                break;
            case POINT:
                {
                alt25=4;
                }
                break;
            case PATH:
                {
                alt25=5;
                }
                break;
            case BOOLEAN:
            case INT:
                {
                alt25=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:179:19: assgn_expression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_assgn_expression_in_statement2385);
                    assgn_expression223=assgn_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, assgn_expression223.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:180:19: iteration_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_iteration_stmt_in_statement2405);
                    iteration_stmt224=iteration_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, iteration_stmt224.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:181:19: selection_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_selection_stmt_in_statement2425);
                    selection_stmt225=selection_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, selection_stmt225.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:182:19: point_declaration
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_point_declaration_in_statement2445);
                    point_declaration226=point_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, point_declaration226.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:183:19: path_declaration
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_path_declaration_in_statement2465);
                    path_declaration227=path_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, path_declaration227.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:184:19: var_declaration
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_var_declaration_in_statement2485);
                    var_declaration228=var_declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, var_declaration228.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class iteration_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "iteration_stmt"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:188:1: iteration_stmt : WHILE ^ '(' ! expression ')' ! '{' ! statement_list '}' !;
    public final AmazeParser.iteration_stmt_return iteration_stmt() throws RecognitionException {
        AmazeParser.iteration_stmt_return retval = new AmazeParser.iteration_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token WHILE229=null;
        Token char_literal230=null;
        Token char_literal232=null;
        Token char_literal233=null;
        Token char_literal235=null;
        AmazeParser.expression_return expression231 =null;

        AmazeParser.statement_list_return statement_list234 =null;


        CommonTree WHILE229_tree=null;
        CommonTree char_literal230_tree=null;
        CommonTree char_literal232_tree=null;
        CommonTree char_literal233_tree=null;
        CommonTree char_literal235_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:188:16: ( WHILE ^ '(' ! expression ')' ! '{' ! statement_list '}' !)
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:188:18: WHILE ^ '(' ! expression ')' ! '{' ! statement_list '}' !
            {
            root_0 = (CommonTree)adaptor.nil();


            WHILE229=(Token)match(input,WHILE,FOLLOW_WHILE_in_iteration_stmt2511); 
            WHILE229_tree = 
            (CommonTree)adaptor.create(WHILE229)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(WHILE229_tree, root_0);


            char_literal230=(Token)match(input,49,FOLLOW_49_in_iteration_stmt2514); 

            pushFollow(FOLLOW_expression_in_iteration_stmt2517);
            expression231=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression231.getTree());

            char_literal232=(Token)match(input,50,FOLLOW_50_in_iteration_stmt2519); 

            char_literal233=(Token)match(input,54,FOLLOW_54_in_iteration_stmt2522); 

            pushFollow(FOLLOW_statement_list_in_iteration_stmt2525);
            statement_list234=statement_list();

            state._fsp--;

            adaptor.addChild(root_0, statement_list234.getTree());

            char_literal235=(Token)match(input,55,FOLLOW_55_in_iteration_stmt2527); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "iteration_stmt"


    public static class selection_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selection_stmt"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:192:1: selection_stmt : IF ^ '(' ! expression ')' ! '{' ! statement_list '}' ! selection_else_stmt ;
    public final AmazeParser.selection_stmt_return selection_stmt() throws RecognitionException {
        AmazeParser.selection_stmt_return retval = new AmazeParser.selection_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IF236=null;
        Token char_literal237=null;
        Token char_literal239=null;
        Token char_literal240=null;
        Token char_literal242=null;
        AmazeParser.expression_return expression238 =null;

        AmazeParser.statement_list_return statement_list241 =null;

        AmazeParser.selection_else_stmt_return selection_else_stmt243 =null;


        CommonTree IF236_tree=null;
        CommonTree char_literal237_tree=null;
        CommonTree char_literal239_tree=null;
        CommonTree char_literal240_tree=null;
        CommonTree char_literal242_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:192:16: ( IF ^ '(' ! expression ')' ! '{' ! statement_list '}' ! selection_else_stmt )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:192:18: IF ^ '(' ! expression ')' ! '{' ! statement_list '}' ! selection_else_stmt
            {
            root_0 = (CommonTree)adaptor.nil();


            IF236=(Token)match(input,IF,FOLLOW_IF_in_selection_stmt2584); 
            IF236_tree = 
            (CommonTree)adaptor.create(IF236)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(IF236_tree, root_0);


            char_literal237=(Token)match(input,49,FOLLOW_49_in_selection_stmt2587); 

            pushFollow(FOLLOW_expression_in_selection_stmt2590);
            expression238=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression238.getTree());

            char_literal239=(Token)match(input,50,FOLLOW_50_in_selection_stmt2592); 

            char_literal240=(Token)match(input,54,FOLLOW_54_in_selection_stmt2595); 

            pushFollow(FOLLOW_statement_list_in_selection_stmt2598);
            statement_list241=statement_list();

            state._fsp--;

            adaptor.addChild(root_0, statement_list241.getTree());

            char_literal242=(Token)match(input,55,FOLLOW_55_in_selection_stmt2600); 

            pushFollow(FOLLOW_selection_else_stmt_in_selection_stmt2603);
            selection_else_stmt243=selection_else_stmt();

            state._fsp--;

            adaptor.addChild(root_0, selection_else_stmt243.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selection_stmt"


    public static class selection_else_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selection_else_stmt"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:195:1: selection_else_stmt : ( ELSE ^ '{' ! statement_list '}' !|);
    public final AmazeParser.selection_else_stmt_return selection_else_stmt() throws RecognitionException {
        AmazeParser.selection_else_stmt_return retval = new AmazeParser.selection_else_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ELSE244=null;
        Token char_literal245=null;
        Token char_literal247=null;
        AmazeParser.statement_list_return statement_list246 =null;


        CommonTree ELSE244_tree=null;
        CommonTree char_literal245_tree=null;
        CommonTree char_literal247_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:195:21: ( ELSE ^ '{' ! statement_list '}' !|)
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ELSE) ) {
                alt26=1;
            }
            else if ( (LA26_0==BOOLEAN||(LA26_0 >= ID && LA26_0 <= INT)||LA26_0==PATH||LA26_0==POINT||LA26_0==WHILE||LA26_0==55) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:195:23: ELSE ^ '{' ! statement_list '}' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ELSE244=(Token)match(input,ELSE,FOLLOW_ELSE_in_selection_else_stmt2628); 
                    ELSE244_tree = 
                    (CommonTree)adaptor.create(ELSE244)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(ELSE244_tree, root_0);


                    char_literal245=(Token)match(input,54,FOLLOW_54_in_selection_else_stmt2631); 

                    pushFollow(FOLLOW_statement_list_in_selection_else_stmt2634);
                    statement_list246=statement_list();

                    state._fsp--;

                    adaptor.addChild(root_0, statement_list246.getTree());

                    char_literal247=(Token)match(input,55,FOLLOW_55_in_selection_else_stmt2636); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:197:19: 
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selection_else_stmt"


    public static class jump_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "jump_stmt"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:199:1: jump_stmt : RETURN expression ';' !;
    public final AmazeParser.jump_stmt_return jump_stmt() throws RecognitionException {
        AmazeParser.jump_stmt_return retval = new AmazeParser.jump_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token RETURN248=null;
        Token char_literal250=null;
        AmazeParser.expression_return expression249 =null;


        CommonTree RETURN248_tree=null;
        CommonTree char_literal250_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:199:11: ( RETURN expression ';' !)
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:199:13: RETURN expression ';' !
            {
            root_0 = (CommonTree)adaptor.nil();


            RETURN248=(Token)match(input,RETURN,FOLLOW_RETURN_in_jump_stmt2685); 
            RETURN248_tree = 
            (CommonTree)adaptor.create(RETURN248)
            ;
            adaptor.addChild(root_0, RETURN248_tree);


            pushFollow(FOLLOW_expression_in_jump_stmt2687);
            expression249=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression249.getTree());

            char_literal250=(Token)match(input,53,FOLLOW_53_in_jump_stmt2688); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "jump_stmt"


    public static class print_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "print_stmt"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:202:1: print_stmt : PRINT '(' ! STRING ')' ! ';' !;
    public final AmazeParser.print_stmt_return print_stmt() throws RecognitionException {
        AmazeParser.print_stmt_return retval = new AmazeParser.print_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PRINT251=null;
        Token char_literal252=null;
        Token STRING253=null;
        Token char_literal254=null;
        Token char_literal255=null;

        CommonTree PRINT251_tree=null;
        CommonTree char_literal252_tree=null;
        CommonTree STRING253_tree=null;
        CommonTree char_literal254_tree=null;
        CommonTree char_literal255_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:202:13: ( PRINT '(' ! STRING ')' ! ';' !)
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:202:15: PRINT '(' ! STRING ')' ! ';' !
            {
            root_0 = (CommonTree)adaptor.nil();


            PRINT251=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_stmt2709); 
            PRINT251_tree = 
            (CommonTree)adaptor.create(PRINT251)
            ;
            adaptor.addChild(root_0, PRINT251_tree);


            char_literal252=(Token)match(input,49,FOLLOW_49_in_print_stmt2711); 

            STRING253=(Token)match(input,STRING,FOLLOW_STRING_in_print_stmt2714); 
            STRING253_tree = 
            (CommonTree)adaptor.create(STRING253)
            ;
            adaptor.addChild(root_0, STRING253_tree);


            char_literal254=(Token)match(input,50,FOLLOW_50_in_print_stmt2716); 

            char_literal255=(Token)match(input,53,FOLLOW_53_in_print_stmt2719); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "print_stmt"


    public static class term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:205:1: term : ( TRUE | FALSE | ID | function_call | CONST | '(' ! expression ')' !);
    public final AmazeParser.term_return term() throws RecognitionException {
        AmazeParser.term_return retval = new AmazeParser.term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token TRUE256=null;
        Token FALSE257=null;
        Token ID258=null;
        Token CONST260=null;
        Token char_literal261=null;
        Token char_literal263=null;
        AmazeParser.function_call_return function_call259 =null;

        AmazeParser.expression_return expression262 =null;


        CommonTree TRUE256_tree=null;
        CommonTree FALSE257_tree=null;
        CommonTree ID258_tree=null;
        CommonTree CONST260_tree=null;
        CommonTree char_literal261_tree=null;
        CommonTree char_literal263_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:205:6: ( TRUE | FALSE | ID | function_call | CONST | '(' ! expression ')' !)
            int alt27=6;
            switch ( input.LA(1) ) {
            case TRUE:
                {
                alt27=1;
                }
                break;
            case FALSE:
                {
                alt27=2;
                }
                break;
            case ID:
                {
                int LA27_3 = input.LA(2);

                if ( (LA27_3==49) ) {
                    alt27=4;
                }
                else if ( (LA27_3==AND||(LA27_3 >= DBL_EQLS && LA27_3 <= DIVIDE)||(LA27_3 >= GRTR && LA27_3 <= GRTR_EQL)||(LA27_3 >= LESS && LA27_3 <= LESS_EQL)||LA27_3==MINUS||(LA27_3 >= NOT_EQLS && LA27_3 <= OR)||LA27_3==PLUS||LA27_3==TIMES||(LA27_3 >= 50 && LA27_3 <= 51)||LA27_3==53) ) {
                    alt27=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 3, input);

                    throw nvae;

                }
                }
                break;
            case CONST:
                {
                alt27=5;
                }
                break;
            case 49:
                {
                alt27=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:205:8: TRUE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    TRUE256=(Token)match(input,TRUE,FOLLOW_TRUE_in_term2741); 
                    TRUE256_tree = 
                    (CommonTree)adaptor.create(TRUE256)
                    ;
                    adaptor.addChild(root_0, TRUE256_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:206:5: FALSE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    FALSE257=(Token)match(input,FALSE,FOLLOW_FALSE_in_term2747); 
                    FALSE257_tree = 
                    (CommonTree)adaptor.create(FALSE257)
                    ;
                    adaptor.addChild(root_0, FALSE257_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:207:6: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ID258=(Token)match(input,ID,FOLLOW_ID_in_term2754); 
                    ID258_tree = 
                    (CommonTree)adaptor.create(ID258)
                    ;
                    adaptor.addChild(root_0, ID258_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:208:6: function_call
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_call_in_term2762);
                    function_call259=function_call();

                    state._fsp--;

                    adaptor.addChild(root_0, function_call259.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:209:6: CONST
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    CONST260=(Token)match(input,CONST,FOLLOW_CONST_in_term2769); 
                    CONST260_tree = 
                    (CommonTree)adaptor.create(CONST260)
                    ;
                    adaptor.addChild(root_0, CONST260_tree);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:210:6: '(' ! expression ')' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal261=(Token)match(input,49,FOLLOW_49_in_term2776); 

                    pushFollow(FOLLOW_expression_in_term2779);
                    expression262=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression262.getTree());

                    char_literal263=(Token)match(input,50,FOLLOW_50_in_term2781); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class negation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "negation"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:213:1: negation : ( NOT ^)* term ;
    public final AmazeParser.negation_return negation() throws RecognitionException {
        AmazeParser.negation_return retval = new AmazeParser.negation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NOT264=null;
        AmazeParser.term_return term265 =null;


        CommonTree NOT264_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:214:4: ( ( NOT ^)* term )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:214:6: ( NOT ^)* term
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:214:9: ( NOT ^)*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==NOT) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:214:9: NOT ^
            	    {
            	    NOT264=(Token)match(input,NOT,FOLLOW_NOT_in_negation2797); 
            	    NOT264_tree = 
            	    (CommonTree)adaptor.create(NOT264)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(NOT264_tree, root_0);


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            pushFollow(FOLLOW_term_in_negation2801);
            term265=term();

            state._fsp--;

            adaptor.addChild(root_0, term265.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "negation"


    public static class unary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:216:1: unary : ( unary_minus ^)* negation ;
    public final AmazeParser.unary_return unary() throws RecognitionException {
        AmazeParser.unary_return retval = new AmazeParser.unary_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AmazeParser.unary_minus_return unary_minus266 =null;

        AmazeParser.negation_return negation267 =null;



        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:217:4: ( ( unary_minus ^)* negation )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:217:6: ( unary_minus ^)* negation
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:217:6: ( unary_minus ^)*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==MINUS) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:217:7: unary_minus ^
            	    {
            	    pushFollow(FOLLOW_unary_minus_in_unary2816);
            	    unary_minus266=unary_minus();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(unary_minus266.getTree(), root_0);

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            pushFollow(FOLLOW_negation_in_unary2821);
            negation267=negation();

            state._fsp--;

            adaptor.addChild(root_0, negation267.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unary"


    public static class unary_minus_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary_minus"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:220:1: unary_minus : MINUS -> NEGATIONS ;
    public final AmazeParser.unary_minus_return unary_minus() throws RecognitionException {
        AmazeParser.unary_minus_return retval = new AmazeParser.unary_minus_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token MINUS268=null;

        CommonTree MINUS268_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:221:4: ( MINUS -> NEGATIONS )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:221:6: MINUS
            {
            MINUS268=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_minus2839);  
            stream_MINUS.add(MINUS268);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 221:12: -> NEGATIONS
            {
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(NEGATIONS, "NEGATIONS")
                );

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unary_minus"


    public static class mult_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mult"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:223:1: mult : unary ( ( TIMES ^| DIVIDE ^) unary )* ;
    public final AmazeParser.mult_return mult() throws RecognitionException {
        AmazeParser.mult_return retval = new AmazeParser.mult_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token TIMES270=null;
        Token DIVIDE271=null;
        AmazeParser.unary_return unary269 =null;

        AmazeParser.unary_return unary272 =null;


        CommonTree TIMES270_tree=null;
        CommonTree DIVIDE271_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:224:4: ( unary ( ( TIMES ^| DIVIDE ^) unary )* )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:224:6: unary ( ( TIMES ^| DIVIDE ^) unary )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_unary_in_mult2857);
            unary269=unary();

            state._fsp--;

            adaptor.addChild(root_0, unary269.getTree());

            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:224:12: ( ( TIMES ^| DIVIDE ^) unary )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==DIVIDE||LA31_0==TIMES) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:224:13: ( TIMES ^| DIVIDE ^) unary
            	    {
            	    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:224:13: ( TIMES ^| DIVIDE ^)
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==TIMES) ) {
            	        alt30=1;
            	    }
            	    else if ( (LA30_0==DIVIDE) ) {
            	        alt30=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:224:14: TIMES ^
            	            {
            	            TIMES270=(Token)match(input,TIMES,FOLLOW_TIMES_in_mult2861); 
            	            TIMES270_tree = 
            	            (CommonTree)adaptor.create(TIMES270)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(TIMES270_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:224:23: DIVIDE ^
            	            {
            	            DIVIDE271=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_mult2866); 
            	            DIVIDE271_tree = 
            	            (CommonTree)adaptor.create(DIVIDE271)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DIVIDE271_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_unary_in_mult2870);
            	    unary272=unary();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary272.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mult"


    public static class add_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "add"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:227:1: add : mult ( ( PLUS ^| MINUS ^) mult )* ;
    public final AmazeParser.add_return add() throws RecognitionException {
        AmazeParser.add_return retval = new AmazeParser.add_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PLUS274=null;
        Token MINUS275=null;
        AmazeParser.mult_return mult273 =null;

        AmazeParser.mult_return mult276 =null;


        CommonTree PLUS274_tree=null;
        CommonTree MINUS275_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:228:2: ( mult ( ( PLUS ^| MINUS ^) mult )* )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:228:4: mult ( ( PLUS ^| MINUS ^) mult )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_mult_in_add2888);
            mult273=mult();

            state._fsp--;

            adaptor.addChild(root_0, mult273.getTree());

            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:228:9: ( ( PLUS ^| MINUS ^) mult )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==MINUS||LA33_0==PLUS) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:228:10: ( PLUS ^| MINUS ^) mult
            	    {
            	    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:228:10: ( PLUS ^| MINUS ^)
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==PLUS) ) {
            	        alt32=1;
            	    }
            	    else if ( (LA32_0==MINUS) ) {
            	        alt32=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 32, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:228:11: PLUS ^
            	            {
            	            PLUS274=(Token)match(input,PLUS,FOLLOW_PLUS_in_add2892); 
            	            PLUS274_tree = 
            	            (CommonTree)adaptor.create(PLUS274)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS274_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:228:19: MINUS ^
            	            {
            	            MINUS275=(Token)match(input,MINUS,FOLLOW_MINUS_in_add2897); 
            	            MINUS275_tree = 
            	            (CommonTree)adaptor.create(MINUS275)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS275_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_mult_in_add2901);
            	    mult276=mult();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mult276.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "add"


    public static class relation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relation"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:230:1: relation : add ( ( GRTR ^| LESS ^| GRTR_EQL ^| LESS_EQL ^| DBL_EQLS ^| NOT_EQLS ^) add )* ;
    public final AmazeParser.relation_return relation() throws RecognitionException {
        AmazeParser.relation_return retval = new AmazeParser.relation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token GRTR278=null;
        Token LESS279=null;
        Token GRTR_EQL280=null;
        Token LESS_EQL281=null;
        Token DBL_EQLS282=null;
        Token NOT_EQLS283=null;
        AmazeParser.add_return add277 =null;

        AmazeParser.add_return add284 =null;


        CommonTree GRTR278_tree=null;
        CommonTree LESS279_tree=null;
        CommonTree GRTR_EQL280_tree=null;
        CommonTree LESS_EQL281_tree=null;
        CommonTree DBL_EQLS282_tree=null;
        CommonTree NOT_EQLS283_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:231:2: ( add ( ( GRTR ^| LESS ^| GRTR_EQL ^| LESS_EQL ^| DBL_EQLS ^| NOT_EQLS ^) add )* )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:231:4: add ( ( GRTR ^| LESS ^| GRTR_EQL ^| LESS_EQL ^| DBL_EQLS ^| NOT_EQLS ^) add )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_add_in_relation2913);
            add277=add();

            state._fsp--;

            adaptor.addChild(root_0, add277.getTree());

            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:231:8: ( ( GRTR ^| LESS ^| GRTR_EQL ^| LESS_EQL ^| DBL_EQLS ^| NOT_EQLS ^) add )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==DBL_EQLS||(LA35_0 >= GRTR && LA35_0 <= GRTR_EQL)||(LA35_0 >= LESS && LA35_0 <= LESS_EQL)||LA35_0==NOT_EQLS) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:231:9: ( GRTR ^| LESS ^| GRTR_EQL ^| LESS_EQL ^| DBL_EQLS ^| NOT_EQLS ^) add
            	    {
            	    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:231:9: ( GRTR ^| LESS ^| GRTR_EQL ^| LESS_EQL ^| DBL_EQLS ^| NOT_EQLS ^)
            	    int alt34=6;
            	    switch ( input.LA(1) ) {
            	    case GRTR:
            	        {
            	        alt34=1;
            	        }
            	        break;
            	    case LESS:
            	        {
            	        alt34=2;
            	        }
            	        break;
            	    case GRTR_EQL:
            	        {
            	        alt34=3;
            	        }
            	        break;
            	    case LESS_EQL:
            	        {
            	        alt34=4;
            	        }
            	        break;
            	    case DBL_EQLS:
            	        {
            	        alt34=5;
            	        }
            	        break;
            	    case NOT_EQLS:
            	        {
            	        alt34=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 34, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt34) {
            	        case 1 :
            	            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:231:10: GRTR ^
            	            {
            	            GRTR278=(Token)match(input,GRTR,FOLLOW_GRTR_in_relation2917); 
            	            GRTR278_tree = 
            	            (CommonTree)adaptor.create(GRTR278)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(GRTR278_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:231:18: LESS ^
            	            {
            	            LESS279=(Token)match(input,LESS,FOLLOW_LESS_in_relation2922); 
            	            LESS279_tree = 
            	            (CommonTree)adaptor.create(LESS279)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(LESS279_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:231:26: GRTR_EQL ^
            	            {
            	            GRTR_EQL280=(Token)match(input,GRTR_EQL,FOLLOW_GRTR_EQL_in_relation2927); 
            	            GRTR_EQL280_tree = 
            	            (CommonTree)adaptor.create(GRTR_EQL280)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(GRTR_EQL280_tree, root_0);


            	            }
            	            break;
            	        case 4 :
            	            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:231:38: LESS_EQL ^
            	            {
            	            LESS_EQL281=(Token)match(input,LESS_EQL,FOLLOW_LESS_EQL_in_relation2932); 
            	            LESS_EQL281_tree = 
            	            (CommonTree)adaptor.create(LESS_EQL281)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(LESS_EQL281_tree, root_0);


            	            }
            	            break;
            	        case 5 :
            	            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:231:50: DBL_EQLS ^
            	            {
            	            DBL_EQLS282=(Token)match(input,DBL_EQLS,FOLLOW_DBL_EQLS_in_relation2937); 
            	            DBL_EQLS282_tree = 
            	            (CommonTree)adaptor.create(DBL_EQLS282)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DBL_EQLS282_tree, root_0);


            	            }
            	            break;
            	        case 6 :
            	            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:231:62: NOT_EQLS ^
            	            {
            	            NOT_EQLS283=(Token)match(input,NOT_EQLS,FOLLOW_NOT_EQLS_in_relation2942); 
            	            NOT_EQLS283_tree = 
            	            (CommonTree)adaptor.create(NOT_EQLS283)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(NOT_EQLS283_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_add_in_relation2946);
            	    add284=add();

            	    state._fsp--;

            	    adaptor.addChild(root_0, add284.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relation"


    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:233:1: expression : relation ( ( AND ^| OR ^) relation )* ;
    public final AmazeParser.expression_return expression() throws RecognitionException {
        AmazeParser.expression_return retval = new AmazeParser.expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AND286=null;
        Token OR287=null;
        AmazeParser.relation_return relation285 =null;

        AmazeParser.relation_return relation288 =null;


        CommonTree AND286_tree=null;
        CommonTree OR287_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:234:2: ( relation ( ( AND ^| OR ^) relation )* )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:234:4: relation ( ( AND ^| OR ^) relation )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_relation_in_expression2958);
            relation285=relation();

            state._fsp--;

            adaptor.addChild(root_0, relation285.getTree());

            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:234:13: ( ( AND ^| OR ^) relation )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==AND||LA37_0==OR) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:234:14: ( AND ^| OR ^) relation
            	    {
            	    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:234:14: ( AND ^| OR ^)
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==AND) ) {
            	        alt36=1;
            	    }
            	    else if ( (LA36_0==OR) ) {
            	        alt36=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:234:15: AND ^
            	            {
            	            AND286=(Token)match(input,AND,FOLLOW_AND_in_expression2962); 
            	            AND286_tree = 
            	            (CommonTree)adaptor.create(AND286)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(AND286_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:234:21: OR ^
            	            {
            	            OR287=(Token)match(input,OR,FOLLOW_OR_in_expression2966); 
            	            OR287_tree = 
            	            (CommonTree)adaptor.create(OR287)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(OR287_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_relation_in_expression2970);
            	    relation288=relation();

            	    state._fsp--;

            	    adaptor.addChild(root_0, relation288.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class assgn_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assgn_expression"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:237:1: assgn_expression : ID ASSIGN ^ expression ';' !;
    public final AmazeParser.assgn_expression_return assgn_expression() throws RecognitionException {
        AmazeParser.assgn_expression_return retval = new AmazeParser.assgn_expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID289=null;
        Token ASSIGN290=null;
        Token char_literal292=null;
        AmazeParser.expression_return expression291 =null;


        CommonTree ID289_tree=null;
        CommonTree ASSIGN290_tree=null;
        CommonTree char_literal292_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:237:18: ( ID ASSIGN ^ expression ';' !)
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:237:20: ID ASSIGN ^ expression ';' !
            {
            root_0 = (CommonTree)adaptor.nil();


            ID289=(Token)match(input,ID,FOLLOW_ID_in_assgn_expression2982); 
            ID289_tree = 
            (CommonTree)adaptor.create(ID289)
            ;
            adaptor.addChild(root_0, ID289_tree);


            ASSIGN290=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assgn_expression2984); 
            ASSIGN290_tree = 
            (CommonTree)adaptor.create(ASSIGN290)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(ASSIGN290_tree, root_0);


            pushFollow(FOLLOW_expression_in_assgn_expression2987);
            expression291=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression291.getTree());

            char_literal292=(Token)match(input,53,FOLLOW_53_in_assgn_expression2989); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assgn_expression"


    public static class expression_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression_list"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:240:1: expression_list : ( expression ( ',' ! expression )* |);
    public final AmazeParser.expression_list_return expression_list() throws RecognitionException {
        AmazeParser.expression_list_return retval = new AmazeParser.expression_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal294=null;
        AmazeParser.expression_return expression293 =null;

        AmazeParser.expression_return expression295 =null;


        CommonTree char_literal294_tree=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:240:17: ( expression ( ',' ! expression )* |)
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==CONST||LA39_0==FALSE||LA39_0==ID||LA39_0==MINUS||LA39_0==NOT||LA39_0==TRUE||LA39_0==49) ) {
                alt39=1;
            }
            else if ( (LA39_0==50) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }
            switch (alt39) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:240:19: expression ( ',' ! expression )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_expression_in_expression_list3016);
                    expression293=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression293.getTree());

                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:240:31: ( ',' ! expression )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==51) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:240:33: ',' ! expression
                    	    {
                    	    char_literal294=(Token)match(input,51,FOLLOW_51_in_expression_list3021); 

                    	    pushFollow(FOLLOW_expression_in_expression_list3024);
                    	    expression295=expression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expression295.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\Amaze.g:242:17: 
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression_list"

    // Delegated rules


 

    public static final BitSet FOLLOW_declaration_list_in_maze70 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_main_declaration_in_maze80 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_maze91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_declaration_list106 = new BitSet(new long[]{0x00000800004200C0L});
    public static final BitSet FOLLOW_declaration_list_in_declaration_list108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_structure_declaration_in_declaration134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_board_declaration_in_declaration151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_declaration_in_declaration168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_declaration_in_declaration184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOARD_in_board_declaration204 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_board_declaration206 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_board_declaration208 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_board_declaration_list_in_board_declaration211 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_board_declaration213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_size_declaration_in_board_declaration_list224 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_start_declaration_in_board_declaration_list226 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_end_declaration_in_board_declaration_list228 = new BitSet(new long[]{0x0000808D00700080L});
    public static final BitSet FOLLOW_board_statement_list2_in_board_declaration_list230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZE_in_size_declaration250 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_size_declaration252 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_expression_in_size_declaration255 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_size_declaration257 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_expression_in_size_declaration260 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_size_declaration261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_in_start_declaration286 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_start_declaration288 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_expression_in_start_declaration291 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_start_declaration292 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_expression_in_start_declaration295 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_start_declaration296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_end_declaration312 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_end_declaration314 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_expression_in_end_declaration317 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_end_declaration318 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_expression_in_end_declaration321 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_end_declaration322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_declaration_in_var_declaration348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_declaration_in_var_declaration368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_int_declaration393 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_int_declaration395 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_int_declaration397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_int_declaration404 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_int_declaration406 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_int_declaration408 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_expression_in_int_declaration411 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_int_declaration413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_bool_declaration425 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_bool_declaration427 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_bool_declaration429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_bool_declaration437 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_bool_declaration439 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_bool_declaration441 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_expression_in_bool_declaration444 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_bool_declaration446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_set_structure462 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_set_structure464 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_set_structure467 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_set_structure469 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_set_structure472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POINT_in_point_declaration497 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_point_declaration499 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_point_declaration501 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_expression_in_point_declaration504 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_point_declaration506 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_expression_in_point_declaration509 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_point_declaration511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POINT_in_point_declaration534 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_point_declaration536 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_point_declaration538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PATH_in_path_declaration566 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_path_declaration568 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_path_declaration570 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_path_declaration574 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_function_call_in_path_declaration578 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_path_declaration581 = new BitSet(new long[]{0x0000404000802000L});
    public static final BitSet FOLLOW_direction_in_path_declaration584 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_path_declaration585 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_expression_in_path_declaration588 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_path_declaration590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PATH_in_path_declaration612 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_path_declaration615 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_path_declaration616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_board_iteration_stmt_in_board_statement660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_board_statement680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_board_selection_stmt_in_board_statement700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_stmt_in_board_statement720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assgn_expression_in_board_statement740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_board_iteration_stmt781 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_board_iteration_stmt784 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_expression_in_board_iteration_stmt787 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_board_iteration_stmt789 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_board_iteration_stmt792 = new BitSet(new long[]{0x0080808D00700080L});
    public static final BitSet FOLLOW_board_statement_list2_in_board_iteration_stmt795 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_board_iteration_stmt797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_board_selection_stmt856 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_board_selection_stmt859 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_expression_in_board_selection_stmt862 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_board_selection_stmt864 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_board_selection_stmt867 = new BitSet(new long[]{0x0080808D00700080L});
    public static final BitSet FOLLOW_board_statement_list2_in_board_selection_stmt870 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_board_selection_stmt872 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_board_selection_else_stmt_in_board_selection_stmt875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_board_selection_else_stmt911 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_board_selection_else_stmt914 = new BitSet(new long[]{0x0080808D00700080L});
    public static final BitSet FOLLOW_board_statement_list2_in_board_selection_else_stmt917 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_board_selection_else_stmt919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function_call991 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_function_call992 = new BitSet(new long[]{0x0006200028110200L});
    public static final BitSet FOLLOW_expression_list_in_function_call994 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_function_call996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAIN_in_main_declaration1145 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_main_declaration1147 = new BitSet(new long[]{0x0080000000001000L});
    public static final BitSet FOLLOW_main_declaration_list_in_main_declaration1150 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_main_declaration1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRAW_in_main_declaration_list1177 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_main_declaration_list1180 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_main_declaration_list1183 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_main_declaration_list1186 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_main_declaration_list1189 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_main_declaration_list_in_main_declaration_list1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRUCTURE_in_structure_declaration1245 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_structure_declaration1247 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_structure_declaration1249 = new BitSet(new long[]{0x0080800D00700080L});
    public static final BitSet FOLLOW_structure_body_in_structure_declaration1252 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_structure_declaration1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_structure_statement_in_structure_body1306 = new BitSet(new long[]{0x0000800D00700080L});
    public static final BitSet FOLLOW_structure_body_in_structure_body1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assgn_expression_in_structure_statement1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_point_declaration_in_structure_statement1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_structure_path_declaration_in_structure_statement1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_declaration_in_structure_statement1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_structure_board_statement_in_structure_statement1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_structure_iteration_stmt_in_structure_board_statement1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_structure_selection_stmt_in_structure_board_statement1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_stmt_in_structure_board_statement1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_structure_board_statement1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PATH_in_structure_path_declaration1622 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_structure_path_declaration1624 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_structure_path_declaration1626 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_structure_path_declaration1630 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_function_call_in_structure_path_declaration1634 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_structure_path_declaration1637 = new BitSet(new long[]{0x0000404000802000L});
    public static final BitSet FOLLOW_direction_in_structure_path_declaration1640 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_structure_path_declaration1641 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_expression_in_structure_path_declaration1644 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_structure_path_declaration1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PATH_in_structure_path_declaration1668 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_structure_path_declaration1671 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_structure_path_declaration1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_structure_iteration_stmt1732 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_structure_iteration_stmt1735 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_expression_in_structure_iteration_stmt1738 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_structure_iteration_stmt1740 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_structure_iteration_stmt1743 = new BitSet(new long[]{0x0080800D00700080L});
    public static final BitSet FOLLOW_structure_body_in_structure_iteration_stmt1746 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_structure_iteration_stmt1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_structure_selection_stmt1806 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_structure_selection_stmt1809 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_expression_in_structure_selection_stmt1812 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_structure_selection_stmt1814 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_structure_selection_stmt1817 = new BitSet(new long[]{0x0080800D00700080L});
    public static final BitSet FOLLOW_structure_body_in_structure_selection_stmt1820 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_structure_selection_stmt1822 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_structure_selection_else_stmt_in_structure_selection_stmt1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_structure_selection_else_stmt1854 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_structure_selection_else_stmt1857 = new BitSet(new long[]{0x0080800D00700080L});
    public static final BitSet FOLLOW_structure_body_in_structure_selection_else_stmt1860 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_structure_selection_else_stmt1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_function_declaration1933 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_INT_in_function_declaration1935 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_function_declaration1937 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_function_declaration1938 = new BitSet(new long[]{0x000C000000400080L});
    public static final BitSet FOLLOW_parameters_in_function_declaration1940 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_function_declaration1941 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_function_declaration1944 = new BitSet(new long[]{0x000080AD00700080L});
    public static final BitSet FOLLOW_board_statement_list2_in_function_declaration1946 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_jump_stmt_in_function_declaration1948 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_function_declaration1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_function_declaration1961 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BOOLEAN_in_function_declaration1963 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_function_declaration1965 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_function_declaration1966 = new BitSet(new long[]{0x000C000000400080L});
    public static final BitSet FOLLOW_parameters_in_function_declaration1968 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_function_declaration1969 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_function_declaration1972 = new BitSet(new long[]{0x000080AD00700080L});
    public static final BitSet FOLLOW_board_statement_list2_in_function_declaration1974 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_jump_stmt_in_function_declaration1976 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_function_declaration1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_function_declaration1989 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_POINT_in_function_declaration1991 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_function_declaration1993 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_function_declaration1995 = new BitSet(new long[]{0x000C000000400080L});
    public static final BitSet FOLLOW_parameters_in_function_declaration1997 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_function_declaration1998 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_function_declaration2001 = new BitSet(new long[]{0x000080AD00700080L});
    public static final BitSet FOLLOW_board_statement_list2_in_function_declaration2003 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_jump_stmt_in_function_declaration2005 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_function_declaration2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_function_declaration2018 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_function_declaration2020 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_function_declaration2022 = new BitSet(new long[]{0x000C000000400080L});
    public static final BitSet FOLLOW_parameters_in_function_declaration2024 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_function_declaration2025 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_function_declaration2028 = new BitSet(new long[]{0x0080808D00700080L});
    public static final BitSet FOLLOW_board_statement_list2_in_function_declaration2031 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_function_declaration2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_declaration_unassigned_in_parameters2055 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_parameters2059 = new BitSet(new long[]{0x0000000000400080L});
    public static final BitSet FOLLOW_var_declaration_unassigned_in_parameters2062 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_INT_in_var_declaration_unassigned2092 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_var_declaration_unassigned2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_var_declaration_unassigned2125 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_var_declaration_unassigned2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statement_list2175 = new BitSet(new long[]{0x0000800500700082L});
    public static final BitSet FOLLOW_board_statement_2_in_board_statement_list22201 = new BitSet(new long[]{0x0000808D00700080L});
    public static final BitSet FOLLOW_board_statement_list2_in_board_statement_list22203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_structure_in_board_statement_22262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_declaration_in_board_statement_22284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_board_statement_in_board_statement_22306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_point_declaration_in_board_statement_22328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_path_declaration_in_board_statement_22350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assgn_expression_in_statement2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_stmt_in_statement2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_stmt_in_statement2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_point_declaration_in_statement2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_path_declaration_in_statement2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_declaration_in_statement2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_iteration_stmt2511 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_iteration_stmt2514 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_expression_in_iteration_stmt2517 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_iteration_stmt2519 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_iteration_stmt2522 = new BitSet(new long[]{0x0080800500700080L});
    public static final BitSet FOLLOW_statement_list_in_iteration_stmt2525 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_iteration_stmt2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_selection_stmt2584 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_selection_stmt2587 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_expression_in_selection_stmt2590 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_selection_stmt2592 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_selection_stmt2595 = new BitSet(new long[]{0x0080800500700080L});
    public static final BitSet FOLLOW_statement_list_in_selection_stmt2598 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_selection_stmt2600 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_selection_else_stmt_in_selection_stmt2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_selection_else_stmt2628 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_selection_else_stmt2631 = new BitSet(new long[]{0x0080800500700080L});
    public static final BitSet FOLLOW_statement_list_in_selection_else_stmt2634 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_selection_else_stmt2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_jump_stmt2685 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_expression_in_jump_stmt2687 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_jump_stmt2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print_stmt2709 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_print_stmt2711 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_STRING_in_print_stmt2714 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_print_stmt2716 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_print_stmt2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_term2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_term2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_term2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_term2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_term2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_term2776 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_expression_in_term2779 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_term2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_negation2797 = new BitSet(new long[]{0x0002200020110200L});
    public static final BitSet FOLLOW_term_in_negation2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_minus_in_unary2816 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_negation_in_unary2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary_minus2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult2857 = new BitSet(new long[]{0x0000100000000802L});
    public static final BitSet FOLLOW_TIMES_in_mult2861 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_DIVIDE_in_mult2866 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_unary_in_mult2870 = new BitSet(new long[]{0x0000100000000802L});
    public static final BitSet FOLLOW_mult_in_add2888 = new BitSet(new long[]{0x0000000208000002L});
    public static final BitSet FOLLOW_PLUS_in_add2892 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_MINUS_in_add2897 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_mult_in_add2901 = new BitSet(new long[]{0x0000000208000002L});
    public static final BitSet FOLLOW_add_in_relation2913 = new BitSet(new long[]{0x00000000430C0402L});
    public static final BitSet FOLLOW_GRTR_in_relation2917 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_LESS_in_relation2922 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_GRTR_EQL_in_relation2927 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_LESS_EQL_in_relation2932 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_DBL_EQLS_in_relation2937 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_NOT_EQLS_in_relation2942 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_add_in_relation2946 = new BitSet(new long[]{0x00000000430C0402L});
    public static final BitSet FOLLOW_relation_in_expression2958 = new BitSet(new long[]{0x0000000080000012L});
    public static final BitSet FOLLOW_AND_in_expression2962 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_OR_in_expression2966 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_relation_in_expression2970 = new BitSet(new long[]{0x0000000080000012L});
    public static final BitSet FOLLOW_ID_in_assgn_expression2982 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGN_in_assgn_expression2984 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_expression_in_assgn_expression2987 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_assgn_expression2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_list3016 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_expression_list3021 = new BitSet(new long[]{0x0002200028110200L});
    public static final BitSet FOLLOW_expression_in_expression_list3024 = new BitSet(new long[]{0x0008000000000002L});

}