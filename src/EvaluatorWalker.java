// $ANTLR 3.4 C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g 2012-05-06 07:59:00
  
import java.util.HashMap;
  
import java.util.ArrayList;
import java.awt.Point;
import java.io.FileWriter;
import java.io.BufferedWriter;
 


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class EvaluatorWalker extends TreeParser {
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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public EvaluatorWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public EvaluatorWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return EvaluatorWalker.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g"; }


      private HashMap<String, Object> variables2 = new HashMap<String, Object>();
      private HashMap<String, Identifier> variables = new HashMap<String, Identifier>();
    	private ArrayList<String> function_list = new ArrayList<String>();
    	private ArrayList<String> global_variables = new ArrayList<String>();
    	



    // $ANTLR start "maze"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:38:1: maze returns [String temp] : d= declaration_list m= main_declaration ;
    public final String maze() throws RecognitionException {
        String temp = null;


        String d =null;

        String m =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:39:4: (d= declaration_list m= main_declaration )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:39:7: d= declaration_list m= main_declaration
            {
            pushFollow(FOLLOW_declaration_list_in_maze80);
            d=declaration_list();

            state._fsp--;
            if (state.failed) return temp;

            pushFollow(FOLLOW_main_declaration_in_maze89);
            m=main_declaration();

            state._fsp--;
            if (state.failed) return temp;

            if ( state.backtracking==0 ) {
            	      	temp = 
            	      	       "import java.awt.Dimension;" + '\n' +
            								 "import java.awt.GridLayout;" + '\n'+
            								 "import java.awt.Point;" + '\n' +
            								 "import javax.swing.ImageIcon;" + '\n' +
            								 "import javax.swing.JFrame;" + '\n' +
            								 "import javax.swing.JLabel;" + '\n' +
            								 "import javax.swing.JPanel;" + '\n' +
            								 "import java.util.ArrayList;" + "\n" +
            //								 "import codeGeneration.fred.Board;\n" +
            //								 "import codeGeneration.fred.Path;\n\n" + 
            								 "public class Out {" + '\n' ; 
            								 for(int i = 0; i < global_variables.size(); i++){
            											temp += "			" + global_variables.get(i) + '\n';
            									}
            								 temp += "\t" + '\n' + m + "\t" + '\n' + d + '\n';    ///* + "public static void main(String[] args) {"*/
            //				  for (String aBoard: m)
            //				        temp = temp + aBoard + ".draw();\n";
            	        

            	               for( int i = 0; i < function_list.size(); i ++){
            	                  temp += '\n' + function_list.get(i);
                             }
                     
                             temp +=  '\n' + "}";    
            	        
                    }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return temp;
    }
    // $ANTLR end "maze"



    // $ANTLR start "declaration_list"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:73:1: declaration_list returns [String r] : (d1= declaration d2= declaration_list |);
    public final String declaration_list() throws RecognitionException {
        String r = null;


        String d1 =null;

        String d2 =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:75:2: (d1= declaration d2= declaration_list |)
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0 >= ASSIGN && LA1_0 <= BOOLEAN)||LA1_0==FUNC||LA1_0==INT||LA1_0==STRUCTURE) ) {
                alt1=1;
            }
            else if ( (LA1_0==EOF||LA1_0==MAIN) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:75:4: d1= declaration d2= declaration_list
                    {
                    pushFollow(FOLLOW_declaration_in_declaration_list127);
                    d1=declaration();

                    state._fsp--;
                    if (state.failed) return r;

                    pushFollow(FOLLOW_declaration_list_in_declaration_list131);
                    d2=declaration_list();

                    state._fsp--;
                    if (state.failed) return r;

                    if ( state.backtracking==0 ) {if (d2==null){
                    	        if (d1==null){
                    	          r = "";
                              }
                    	        else{
                    	          r = d1;
                    	        }
                    	     }
                    	     else{
                    	        if (d1==null){
                    	          r = d2;
                    	        }
                    	        else{
                    	          r = d1 + d2;
                    	        }
                    	     }
                    	    
                    	    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:95:3: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return r;
    }
    // $ANTLR end "declaration_list"



    // $ANTLR start "declaration"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:97:1: declaration returns [String r] : (b= board_declaration |f= function_declaration |v= var_declaration |s2= structure_declaration );
    public final String declaration() throws RecognitionException {
        String r = null;


        String b =null;

        String f =null;

        String v =null;

        String s2 =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:98:7: (b= board_declaration |f= function_declaration |v= var_declaration |s2= structure_declaration )
            int alt2=4;
            switch ( input.LA(1) ) {
            case BOARD:
                {
                alt2=1;
                }
                break;
            case FUNC:
                {
                alt2=2;
                }
                break;
            case ASSIGN:
            case BOOLEAN:
            case INT:
                {
                alt2=3;
                }
                break;
            case STRUCTURE:
                {
                alt2=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:98:8: b= board_declaration
                    {
                    pushFollow(FOLLOW_board_declaration_in_declaration166);
                    b=board_declaration();

                    state._fsp--;
                    if (state.failed) return r;

                    if ( state.backtracking==0 ) { r = b;}

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:99:15: f= function_declaration
                    {
                    pushFollow(FOLLOW_function_declaration_in_declaration186);
                    f=function_declaration();

                    state._fsp--;
                    if (state.failed) return r;

                    if ( state.backtracking==0 ) {}

                    }
                    break;
                case 3 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:100:14: v= var_declaration
                    {
                    pushFollow(FOLLOW_var_declaration_in_declaration205);
                    v=var_declaration();

                    state._fsp--;
                    if (state.failed) return r;

                    if ( state.backtracking==0 ) { global_variables.add("public static " +  v); }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:102:15: s2= structure_declaration
                    {
                    pushFollow(FOLLOW_structure_declaration_in_declaration226);
                    s2=structure_declaration();

                    state._fsp--;
                    if (state.failed) return r;

                    if ( state.backtracking==0 ) {r = s2;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return r;
    }
    // $ANTLR end "declaration"



    // $ANTLR start "point_declaration"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:110:1: point_declaration returns [String myPointString] : ( POINT ID e1= expression e2= expression | POINT ID );
    public final String point_declaration() throws RecognitionException {
        String myPointString = null;


        CommonTree ID1=null;
        ExpressionNode e1 =null;

        ExpressionNode e2 =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:110:50: ( POINT ID e1= expression e2= expression | POINT ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==POINT) ) {
                int LA3_1 = input.LA(2);

                if ( (synpred5_EvaluatorWalker()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return myPointString;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return myPointString;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:111:2: POINT ID e1= expression e2= expression
                    {
                    match(input,POINT,FOLLOW_POINT_in_point_declaration248); if (state.failed) return myPointString;

                    ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_point_declaration250); if (state.failed) return myPointString;

                    pushFollow(FOLLOW_expression_in_point_declaration254);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return myPointString;

                    pushFollow(FOLLOW_expression_in_point_declaration258);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return myPointString;

                    if ( state.backtracking==0 ) {
                                          //first make sure e1 is an integer
                                          if (!e1.getReturnType().equals("int")){
                                            throw new Exception("Point expects an int but has received a " + e1.getType() 
                                              + " as its 1st parameter");
                                              
                                            //Throw some sort of exception.
                                             
                                          }
                                          if (!e2.getReturnType().equals("int")){
                                            throw new Exception("Point expects an int but has received a " + e2.getType()
                                              + " as its 2nd parameter");
                                               
                                              
                                          }
                                          
                                          myPointString = "Point " + (ID1!=null?ID1.getText():null) + " = new Point(" + e1.getCode() + ", " + e2.getCode() + ");\n";
                                          variables.put((ID1!=null?ID1.getText():null), new Identifier( (ID1!=null?ID1.getText():null), (ID1!=null?ID1.getText():null), "point"));
                                        }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:131:21: POINT ID
                    {
                    match(input,POINT,FOLLOW_POINT_in_point_declaration304); if (state.failed) return myPointString;

                    match(input,ID,FOLLOW_ID_in_point_declaration306); if (state.failed) return myPointString;

                    }
                    break;

            }
        }
        catch (Exception error) {

            		System.out.println( error.getMessage());
            			 System.exit(1);
            		
        }

        finally {
        	// do for sure before leaving
        }
        return myPointString;
    }
    // $ANTLR end "point_declaration"



    // $ANTLR start "path_declaration"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:139:1: path_declaration returns [PathNode myPath] : ( PATH i1= ID i2= term d= direction e= expression | PATH ID );
    public final PathNode path_declaration() throws RecognitionException {
        PathNode myPath = null;


        CommonTree i1=null;
        ExpressionNode i2 =null;

        String d =null;

        ExpressionNode e =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:140:3: ( PATH i1= ID i2= term d= direction e= expression | PATH ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==PATH) ) {
                int LA4_1 = input.LA(2);

                if ( (synpred6_EvaluatorWalker()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return myPath;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return myPath;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:140:3: PATH i1= ID i2= term d= direction e= expression
                    {
                    match(input,PATH,FOLLOW_PATH_in_path_declaration381); if (state.failed) return myPath;

                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_path_declaration385); if (state.failed) return myPath;

                    pushFollow(FOLLOW_term_in_path_declaration389);
                    i2=term();

                    state._fsp--;
                    if (state.failed) return myPath;

                    pushFollow(FOLLOW_direction_in_path_declaration393);
                    d=direction();

                    state._fsp--;
                    if (state.failed) return myPath;

                    pushFollow(FOLLOW_expression_in_path_declaration397);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return myPath;

                    if ( state.backtracking==0 ) {
                                            if (i2.getType().equals("function") && variables.containsKey(((FunctionNode)i2).Identifier) && e.getReturnType().equals("int")){
                                            
                                            String myPathString = "Path " + (i1!=null?i1.getText():null) + " = new Path(" + ((FunctionNode)i2).getCode() + ", \"" + d + "\", " + e.getCode() + ");\n";

                                            myPath = new PathNode(myPathString, (i1!=null?i1.getText():null), ((FunctionNode)i2).Identifier);
                                          }
                                          else if (i2.getType().equals("function") && ((FunctionNode)i2).getReturnType().equals("point")&& e.getReturnType().equals("int")){
                                            String myPathString = "Path " + (i1!=null?i1.getText():null) + " = new Path(" + i2.getCode() + ", \"" + d + "\", " + e.getCode() + ");\n";
                                            myPath = new PathNode(myPathString, (i1!=null?i1.getText():null), i2.getCode());
                                              
                                          }
                                          else {throw new Exception("Path Expects a point");
                                           
                                          }
                                          }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:157:21: PATH ID
                    {
                    match(input,PATH,FOLLOW_PATH_in_path_declaration442); if (state.failed) return myPath;

                    match(input,ID,FOLLOW_ID_in_path_declaration444); if (state.failed) return myPath;

                    }
                    break;

            }
        }
        catch (Exception error) {

            		System.out.println(error.getMessage());
            			System.exit(1);
            		
        }

        finally {
        	// do for sure before leaving
        }
        return myPath;
    }
    // $ANTLR end "path_declaration"



    // $ANTLR start "direction"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:165:1: direction returns [String myDirection] : ( LEFT | RIGHT | UPP | DWN );
    public final String direction() throws RecognitionException {
        String myDirection = null;


        CommonTree LEFT2=null;
        CommonTree RIGHT3=null;
        CommonTree UPP4=null;
        CommonTree DWN5=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:166:11: ( LEFT | RIGHT | UPP | DWN )
            int alt5=4;
            switch ( input.LA(1) ) {
            case LEFT:
                {
                alt5=1;
                }
                break;
            case RIGHT:
                {
                alt5=2;
                }
                break;
            case UPP:
                {
                alt5=3;
                }
                break;
            case DWN:
                {
                alt5=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return myDirection;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:166:13: LEFT
                    {
                    LEFT2=(CommonTree)match(input,LEFT,FOLLOW_LEFT_in_direction492); if (state.failed) return myDirection;

                    if ( state.backtracking==0 ) {myDirection = (LEFT2!=null?LEFT2.getText():null);}

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:167:13: RIGHT
                    {
                    RIGHT3=(CommonTree)match(input,RIGHT,FOLLOW_RIGHT_in_direction508); if (state.failed) return myDirection;

                    if ( state.backtracking==0 ) {myDirection = (RIGHT3!=null?RIGHT3.getText():null);}

                    }
                    break;
                case 3 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:168:13: UPP
                    {
                    UPP4=(CommonTree)match(input,UPP,FOLLOW_UPP_in_direction524); if (state.failed) return myDirection;

                    if ( state.backtracking==0 ) {myDirection = (UPP4!=null?UPP4.getText():null);}

                    }
                    break;
                case 4 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:169:13: DWN
                    {
                    DWN5=(CommonTree)match(input,DWN,FOLLOW_DWN_in_direction540); if (state.failed) return myDirection;

                    if ( state.backtracking==0 ) {myDirection = (DWN5!=null?DWN5.getText():null);}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return myDirection;
    }
    // $ANTLR end "direction"



    // $ANTLR start "var_declaration"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:172:1: var_declaration returns [String temp] : (i= int_declaration |b= bool_declaration );
    public final String var_declaration() throws RecognitionException {
        String temp = null;


        String i =null;

        String b =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:173:3: (i= int_declaration |b= bool_declaration )
            int alt6=2;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt6=1;
                }
                break;
            case ASSIGN:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==DOWN) ) {
                    int LA6_4 = input.LA(3);

                    if ( (LA6_4==INT) ) {
                        alt6=1;
                    }
                    else if ( (LA6_4==BOOLEAN) ) {
                        alt6=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return temp;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return temp;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;

                }
                }
                break;
            case BOOLEAN:
                {
                alt6=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return temp;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:173:5: i= int_declaration
                    {
                    pushFollow(FOLLOW_int_declaration_in_var_declaration580);
                    i=int_declaration();

                    state._fsp--;
                    if (state.failed) return temp;

                    if ( state.backtracking==0 ) {temp =i;}

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:174:5: b= bool_declaration
                    {
                    pushFollow(FOLLOW_bool_declaration_in_var_declaration590);
                    b=bool_declaration();

                    state._fsp--;
                    if (state.failed) return temp;

                    if ( state.backtracking==0 ) { temp = b;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return temp;
    }
    // $ANTLR end "var_declaration"



    // $ANTLR start "function_call"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:177:1: function_call returns [ExpressionNode r] : ID '(' e= expression_list ')' ;
    public final ExpressionNode function_call() throws RecognitionException {
        ExpressionNode r = null;


        CommonTree ID6=null;
        String e =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:179:15: ( ID '(' e= expression_list ')' )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:179:17: ID '(' e= expression_list ')'
            {
            ID6=(CommonTree)match(input,ID,FOLLOW_ID_in_function_call622); if (state.failed) return r;

            match(input,49,FOLLOW_49_in_function_call625); if (state.failed) return r;

            pushFollow(FOLLOW_expression_list_in_function_call629);
            e=expression_list();

            state._fsp--;
            if (state.failed) return r;

            match(input,50,FOLLOW_50_in_function_call631); if (state.failed) return r;

            if ( state.backtracking==0 ) {
                          if ( variables.containsKey((ID6!=null?ID6.getText():null))){
                            String code = (ID6!=null?ID6.getText():null) + "(" + e + ")";
                            r = new FunctionNode(code , ((ExpressionNode)variables.get((ID6!=null?ID6.getText():null)).value).getReturnType(), (ID6!=null?ID6.getText():null));
                          }
                          else {throw new Exception( "Function " + (ID6!=null?ID6.getText():null) + "Not Declared");
                           
                          }
                          }

            }

        }
        catch (Exception error) {

            		System.out.println(error.getMessage());
            			System.exit(1);
            		
        }

        finally {
        	// do for sure before leaving
        }
        return r;
    }
    // $ANTLR end "function_call"



    // $ANTLR start "expression_list"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:196:1: expression_list returns [String code] : (e= expression e2= expression_list |);
    public final String expression_list() throws RecognitionException {
        String code = null;


        ExpressionNode e =null;

        String e2 =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:197:9: (e= expression e2= expression_list |)
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==AND||(LA7_0 >= CONST && LA7_0 <= DIVIDE)||LA7_0==FALSE||(LA7_0 >= GRTR && LA7_0 <= ID)||(LA7_0 >= LESS && LA7_0 <= LESS_EQL)||(LA7_0 >= MINUS && LA7_0 <= OR)||LA7_0==PLUS||(LA7_0 >= TIMES && LA7_0 <= TRUE)||LA7_0==49) ) {
                alt7=1;
            }
            else if ( (LA7_0==EOF||LA7_0==50) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return code;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:197:11: e= expression e2= expression_list
                    {
                    pushFollow(FOLLOW_expression_in_expression_list706);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return code;

                    pushFollow(FOLLOW_expression_list_in_expression_list711);
                    e2=expression_list();

                    state._fsp--;
                    if (state.failed) return code;

                    if ( state.backtracking==0 ) {
                    								if(e2.isEmpty()) code = e.getCode(); //+ e2;
                    								else
                    								code = e.getCode() 
                    								+ "," +  e2;
                    												
                    								}

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:205:20: 
                    {
                    if ( state.backtracking==0 ) {code = "";}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return code;
    }
    // $ANTLR end "expression_list"



    // $ANTLR start "bool_declaration"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:208:1: bool_declaration returns [String temp] : ( BOOLEAN c= ID | ^( ASSIGN BOOLEAN c= ID e= expression ) );
    public final String bool_declaration() throws RecognitionException {
        String temp = null;


        CommonTree c=null;
        ExpressionNode e =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:209:4: ( BOOLEAN c= ID | ^( ASSIGN BOOLEAN c= ID e= expression ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==BOOLEAN) ) {
                alt8=1;
            }
            else if ( (LA8_0==ASSIGN) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return temp;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:209:6: BOOLEAN c= ID
                    {
                    match(input,BOOLEAN,FOLLOW_BOOLEAN_in_bool_declaration767); if (state.failed) return temp;

                    c=(CommonTree)match(input,ID,FOLLOW_ID_in_bool_declaration771); if (state.failed) return temp;

                    if ( state.backtracking==0 ) {variables.put((c!=null?c.getText():null), new Identifier((c!=null?c.getText():null), 0, "boolean"));
                    		     temp = "boolean " + (c!=null?c.getText():null) + ";";}

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:211:6: ^( ASSIGN BOOLEAN c= ID e= expression )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_bool_declaration783); if (state.failed) return temp;

                    match(input, Token.DOWN, null); if (state.failed) return temp;
                    match(input,BOOLEAN,FOLLOW_BOOLEAN_in_bool_declaration785); if (state.failed) return temp;

                    c=(CommonTree)match(input,ID,FOLLOW_ID_in_bool_declaration789); if (state.failed) return temp;

                    pushFollow(FOLLOW_expression_in_bool_declaration793);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return temp;

                    match(input, Token.UP, null); if (state.failed) return temp;


                    if ( state.backtracking==0 ) {
                    		 if(!variables.containsKey((c!=null?c.getText():null)) && e.getType().equals("boolean"))
                         variables.put((c!=null?c.getText():null), new Identifier((c!=null?c.getText():null), new ValueNode(e.getCode(), "boolean"), "boolean"));
                         else if (!variables.containsKey((c!=null?c.getText():null)) && e.getType().equals("function") && e.getReturnType().equals("boolean"))		 variables.put((c!=null?c.getText():null) , new Identifier ((c!=null?c.getText():null), new FunctionNode("(" + e.getCode() + ")", "boolean"), "function"));
                    		 else throw new Exception("Boolean Expected");
                    		 temp = "boolean " + (c!=null?c.getText():null) + " = " + e.getCode() + " ;";

                    		 }

                    }
                    break;

            }
        }
        catch (Exception error) {

            		System.out.println(error.getMessage());
            			System.exit(1);
            		
        }

        finally {
        	// do for sure before leaving
        }
        return temp;
    }
    // $ANTLR end "bool_declaration"



    // $ANTLR start "int_declaration"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:226:1: int_declaration returns [String temp] : ( INT c= ID | ^( ASSIGN INT c= ID e= expression ) );
    public final String int_declaration() throws RecognitionException {
        String temp = null;


        CommonTree c=null;
        ExpressionNode e =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:227:3: ( INT c= ID | ^( ASSIGN INT c= ID e= expression ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==INT) ) {
                alt9=1;
            }
            else if ( (LA9_0==ASSIGN) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return temp;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:227:5: INT c= ID
                    {
                    match(input,INT,FOLLOW_INT_in_int_declaration821); if (state.failed) return temp;

                    c=(CommonTree)match(input,ID,FOLLOW_ID_in_int_declaration825); if (state.failed) return temp;

                    if ( state.backtracking==0 ) {variables.put((c!=null?c.getText():null), new Identifier((c!=null?c.getText():null), new ValueNode(0, "int"), "int"));
                    		temp = "int " + (c!=null?c.getText():null) + ";";
                    		
                    		}

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:231:5: ^( ASSIGN INT c= ID e= expression )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_int_declaration835); if (state.failed) return temp;

                    match(input, Token.DOWN, null); if (state.failed) return temp;
                    match(input,INT,FOLLOW_INT_in_int_declaration837); if (state.failed) return temp;

                    c=(CommonTree)match(input,ID,FOLLOW_ID_in_int_declaration841); if (state.failed) return temp;

                    pushFollow(FOLLOW_expression_in_int_declaration845);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return temp;

                    match(input, Token.UP, null); if (state.failed) return temp;


                    if ( state.backtracking==0 ) {
                    		temp = "int " + (c!=null?c.getText():null) + " = " + e.value()+ ";\n";
                    		//if(!variables.containsKey((c!=null?c.getText():null)) && e.getReturnType().equals("int")){
                    		if ( e.getType().equals("int"))
                    		variables.put((c!=null?c.getText():null), new Identifier((c!=null?c.getText():null), e, "int")); 
                    		else if (e.getType().equals("function") && e.getReturnType().equals("int")){
                        variables.put((c!=null?c.getText():null), new Identifier ((c!=null?c.getText():null), new FunctionNode(e.getCode(), "int", (c!=null?c.getText():null)), "function")); 
                    		
                    		 }
                    		 else{throw new Exception("int expected");
                    		  
                         }}

                    }
                    break;

            }
        }
        catch (Exception error) {

            		System.out.println(error.getMessage());
            			System.exit(1);
            		
        }

        finally {
        	// do for sure before leaving
        }
        return temp;
    }
    // $ANTLR end "int_declaration"



    // $ANTLR start "expression"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:251:1: expression returns [ExpressionNode r] : ( ^( PLUS c= expression d= expression ) | ^( MINUS c= expression d= expression ) | ^( TIMES c= expression d= expression ) | ^( DIVIDE c= expression d= expression ) | ^( NEGATIONS d= expression ) | ^( NOT d= expression ) | ^( GRTR c= expression d= expression ) | ^( LESS c= expression d= expression ) | ^( GRTR_EQL c= expression d= expression ) | ^( LESS_EQL c= expression d= expression ) | ^( DBL_EQLS c= expression d= expression ) | ^( NOT_EQLS c= expression d= expression ) | ^( AND c= expression d= expression ) | ^( OR c= expression d= expression ) |t= term );
    public final ExpressionNode expression() throws RecognitionException {
        ExpressionNode r = null;


        ExpressionNode c =null;

        ExpressionNode d =null;

        ExpressionNode t =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:253:2: ( ^( PLUS c= expression d= expression ) | ^( MINUS c= expression d= expression ) | ^( TIMES c= expression d= expression ) | ^( DIVIDE c= expression d= expression ) | ^( NEGATIONS d= expression ) | ^( NOT d= expression ) | ^( GRTR c= expression d= expression ) | ^( LESS c= expression d= expression ) | ^( GRTR_EQL c= expression d= expression ) | ^( LESS_EQL c= expression d= expression ) | ^( DBL_EQLS c= expression d= expression ) | ^( NOT_EQLS c= expression d= expression ) | ^( AND c= expression d= expression ) | ^( OR c= expression d= expression ) |t= term )
            int alt10=15;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt10=1;
                }
                break;
            case MINUS:
                {
                alt10=2;
                }
                break;
            case TIMES:
                {
                alt10=3;
                }
                break;
            case DIVIDE:
                {
                alt10=4;
                }
                break;
            case NEGATIONS:
                {
                alt10=5;
                }
                break;
            case NOT:
                {
                alt10=6;
                }
                break;
            case GRTR:
                {
                alt10=7;
                }
                break;
            case LESS:
                {
                alt10=8;
                }
                break;
            case GRTR_EQL:
                {
                alt10=9;
                }
                break;
            case LESS_EQL:
                {
                alt10=10;
                }
                break;
            case DBL_EQLS:
                {
                alt10=11;
                }
                break;
            case NOT_EQLS:
                {
                alt10=12;
                }
                break;
            case AND:
                {
                alt10=13;
                }
                break;
            case OR:
                {
                alt10=14;
                }
                break;
            case CONST:
            case FALSE:
            case ID:
            case TRUE:
            case 49:
                {
                alt10=15;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:253:4: ^( PLUS c= expression d= expression )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expression881); if (state.failed) return r;

                    match(input, Token.DOWN, null); if (state.failed) return r;
                    pushFollow(FOLLOW_expression_in_expression885);
                    c=expression();

                    state._fsp--;
                    if (state.failed) return r;

                    pushFollow(FOLLOW_expression_in_expression889);
                    d=expression();

                    state._fsp--;
                    if (state.failed) return r;

                    match(input, Token.UP, null); if (state.failed) return r;


                    if ( state.backtracking==0 ) {
                    		if ( c.getType().equals("int") && d.getType().equals("int")){
                    		r = new AdditionNode(c.value(), d.value()); 
                    		}
                    		else  if (d.getType().equals("function") && d.getReturnType().equals("int")){
                    					r = new FunctionNode( c.value() + " + " + d.getCode(), "int");  
                    				
                    				}
                    				else  if (c.getType().equals("function") && c.getReturnType().equals("int")){
                    					r = new FunctionNode( c.getCode() + " + " + d.value() , "int");  
                    				
                    				}
                    			else{throw new Exception("InputMismatch error");
                    			 }
                    			}

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:270:4: ^( MINUS c= expression d= expression )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expression903); if (state.failed) return r;

                    match(input, Token.DOWN, null); if (state.failed) return r;
                    pushFollow(FOLLOW_expression_in_expression907);
                    c=expression();

                    state._fsp--;
                    if (state.failed) return r;

                    pushFollow(FOLLOW_expression_in_expression911);
                    d=expression();

                    state._fsp--;
                    if (state.failed) return r;

                    match(input, Token.UP, null); if (state.failed) return r;


                    if ( state.backtracking==0 ) {
                    		if ( c.getType().equals ("int") && d.getType().equals("int")){
                    		r = new SubNode(c.value(), d.value());}
                    		else  if (d.getType().equals("function")&& d.getReturnType().equals("int")){
                    					r = new FunctionNode( c.value() + " - " + d.getCode(), "int");  
                    				}
                    				else  if (c.getType().equals("function")&& c.getReturnType().equals("int")){
                    					r = new FunctionNode( c.getCode() + " - " + d.value() , "int");  
                    				
                    				}
                    			}

                    }
                    break;
                case 3 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:281:4: ^( TIMES c= expression d= expression )
                    {
                    match(input,TIMES,FOLLOW_TIMES_in_expression926); if (state.failed) return r;

                    match(input, Token.DOWN, null); if (state.failed) return r;
                    pushFollow(FOLLOW_expression_in_expression930);
                    c=expression();

                    state._fsp--;
                    if (state.failed) return r;

                    pushFollow(FOLLOW_expression_in_expression934);
                    d=expression();

                    state._fsp--;
                    if (state.failed) return r;

                    match(input, Token.UP, null); if (state.failed) return r;


                    if ( state.backtracking==0 ) {
                    			//throw new Exception("mult and mult2" + c.value() + d.value());
                    				if ( c.getType().equals("int") && d.getType().equals( "int")){
                    				r = new MultNode(c.value(), d.value()); 
                    				}
                    				else  if (d.getType().equals("function")&& d.getReturnType().equals("int")){
                    					r = new FunctionNode( c.value() + " * " + d.getCode(), "int");  
                    				
                    				}
                    				else  if (c.getType().equals("function")&& c.getReturnType().equals("int")){
                    					r = new FunctionNode( c.getCode() + " * " + d.value(), "int");  
                    				}
                    				else {
                    					throw new Exception("Incorrect Type. Int expected");
                    					 
                    				}
                    			}

                    }
                    break;
                case 4 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:298:3: ^( DIVIDE c= expression d= expression )
                    {
                    match(input,DIVIDE,FOLLOW_DIVIDE_in_expression941); if (state.failed) return r;

                    match(input, Token.DOWN, null); if (state.failed) return r;
                    pushFollow(FOLLOW_expression_in_expression945);
                    c=expression();

                    state._fsp--;
                    if (state.failed) return r;

                    pushFollow(FOLLOW_expression_in_expression949);
                    d=expression();

                    state._fsp--;
                    if (state.failed) return r;

                    match(input, Token.UP, null); if (state.failed) return r;


                    if ( state.backtracking==0 ) {
                    			if ( c.getType().equals("int") && d.getType().equals("int")){
                    				r = new DivNode(c.value(), d.value()); 
                    				}
                    					else  if (d.getType().equals("function")&& d.getReturnType().equals("int")){
                    					r = new FunctionNode( c.value() + " / " + d.getCode(), "int");  
                    				
                    				}
                    				else  if (c.getType().equals("function")&& c.getReturnType().equals("int")){
                    					r = new FunctionNode( c.getCode() + " / " +  d.value(), "int");  
                    				
                    				}
                    				else {
                    					throw new Exception("Incorrect Type. Int expected");
                    					 
                    				}
                    			
                    			}

                    }
                    break;
                case 5 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:316:4: ^( NEGATIONS d= expression )
                    {
                    match(input,NEGATIONS,FOLLOW_NEGATIONS_in_expression957); if (state.failed) return r;

                    match(input, Token.DOWN, null); if (state.failed) return r;
                    pushFollow(FOLLOW_expression_in_expression961);
                    d=expression();

                    state._fsp--;
                    if (state.failed) return r;

                    match(input, Token.UP, null); if (state.failed) return r;


                    if ( state.backtracking==0 ) { 
                    				if ( d.getType().equals("int")){
                    				r = new NegationNode(d.value()); 
                    				}	
                    				else  if (d.getType().equals("function")&& d.getReturnType().equals("int")){
                    					r = new FunctionNode( "-" + d.getCode(), "int");  
                    				
                    				}
                    				else {
                    					throw new Exception("Incorrect Type. Int expected");
                    					 
                    				}
                    			}

                    }
                    break;
                case 6 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:330:4: ^( NOT d= expression )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expression972); if (state.failed) return r;

                    match(input, Token.DOWN, null); if (state.failed) return r;
                    pushFollow(FOLLOW_expression_in_expression976);
                    d=expression();

                    state._fsp--;
                    if (state.failed) return r;

                    match(input, Token.UP, null); if (state.failed) return r;


                    if ( state.backtracking==0 ) {
                    				if ( d.getType().equals("boolean")){
                    				r = new NotNode(d.value()); 
                    				}
                    				else  if (d.getType().equals("function")&& d.getReturnType().equals("boolean")){
                    					r = new FunctionNode( "!" + d.getCode(), "boolean");  
                    				
                    				}
                    				else {
                    					throw new Exception("Incorrect Type. Boolean expected");
                    					 
                    				}
                    						
                    			  }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:344:3: ^( GRTR c= expression d= expression )
                    {
                    match(input,GRTR,FOLLOW_GRTR_in_expression985); if (state.failed) return r;

                    match(input, Token.DOWN, null); if (state.failed) return r;
                    pushFollow(FOLLOW_expression_in_expression989);
                    c=expression();

                    state._fsp--;
                    if (state.failed) return r;

                    pushFollow(FOLLOW_expression_in_expression993);
                    d=expression();

                    state._fsp--;
                    if (state.failed) return r;

                    match(input, Token.UP, null); if (state.failed) return r;


                    if ( state.backtracking==0 ) {
                    	if ( c.getType().equals("int") && d.getType().equals("int")){
                    				r = new GreaterNode(c.value(), d.value()); 
                    				}
                    				else  if (d.getType().equals("function")&& d.getReturnType().equals("int")){
                    					r = new FunctionNode( c.value() + " > " + d.getCode(), "boolean");  
                    				
                    				}
                    				else  if (c.getType().equals("function")&& c.getReturnType().equals("int")){
                    					r = new FunctionNode(c.getCode()  + " > " +  d.value(), "boolean");  
                    				
                    				}
                    				else {
                    					throw new Exception("Incorrect Type. Int expected");
                    					 
                    				}
                    					
                    	
                    	}

                    }
                    break;
                case 8 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:363:4: ^( LESS c= expression d= expression )
                    {
                    match(input,LESS,FOLLOW_LESS_in_expression1002); if (state.failed) return r;

                    match(input, Token.DOWN, null); if (state.failed) return r;
                    pushFollow(FOLLOW_expression_in_expression1006);
                    c=expression();

                    state._fsp--;
                    if (state.failed) return r;

                    pushFollow(FOLLOW_expression_in_expression1010);
                    d=expression();

                    state._fsp--;
                    if (state.failed) return r;

                    match(input, Token.UP, null); if (state.failed) return r;


                    if ( state.backtracking==0 ) {
                    		if ( c.getType().equals("int") && d.getType().equals("int")){
                    					r = new LessNode(c.value(), d.value()); 
                    					}
                    					else  if (d.getType().equals("function")&& d.getReturnType().equals("int")){
                    					r = new FunctionNode( c.value() + " < " + d.getCode(), "boolean");  
                    				
                    				}
                    				else  if (c.getType().equals("function")&& c.getReturnType().equals("int")){
                    					r = new FunctionNode( c.getCode() + " < " +  d.value() , "boolean");  
                    				
                    				}
                    					else {
                    						throw new Exception("Incorrect Type. Int expected");
                    						 
                    					}
                    	
                    	}

                    }
                    break;
                case 9 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:381:4: ^( GRTR_EQL c= expression d= expression )
                    {
                    match(input,GRTR_EQL,FOLLOW_GRTR_EQL_in_expression1019); if (state.failed) return r;

                    match(input, Token.DOWN, null); if (state.failed) return r;
                    pushFollow(FOLLOW_expression_in_expression1023);
                    c=expression();

                    state._fsp--;
                    if (state.failed) return r;

                    pushFollow(FOLLOW_expression_in_expression1027);
                    d=expression();

                    state._fsp--;
                    if (state.failed) return r;

                    match(input, Token.UP, null); if (state.failed) return r;


                    if ( state.backtracking==0 ) {
                    	if ( c.getType().equals("int") && d.getType().equals("int")){
                    				r = new GreaterEqlNode(c.value(), d.value()); 
                    				}
                    				else  if (d.getType().equals("function")&& d.getReturnType().equals("int")){
                    					r = new FunctionNode( c.value() + " >= " + d.getCode(), "boolean");  
                    				
                    				}
                    				else  if (c.getType().equals("function")&& c.getReturnType().equals("int")){
                    					r = new FunctionNode( c.getCode() + " >= " + d.value(), "boolean");  
                    				
                    				}
                    				else {
                    					throw new Exception("Incorrect Type. Int expected");
                    					 
                    				}	
                    	}

                    }
                    break;
                case 10 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:399:4: ^( LESS_EQL c= expression d= expression )
                    {
                    match(input,LESS_EQL,FOLLOW_LESS_EQL_in_expression1037); if (state.failed) return r;

                    match(input, Token.DOWN, null); if (state.failed) return r;
                    pushFollow(FOLLOW_expression_in_expression1041);
                    c=expression();

                    state._fsp--;
                    if (state.failed) return r;

                    pushFollow(FOLLOW_expression_in_expression1045);
                    d=expression();

                    state._fsp--;
                    if (state.failed) return r;

                    match(input, Token.UP, null); if (state.failed) return r;


                    if ( state.backtracking==0 ) {
                    		if ( c.getType().equals("int") && d.getType().equals("int")){
                    				r = new LessEqlNode(c.value(), d.value()); 
                    				}
                    				else  if (d.getType().equals("function")&& d.getReturnType().equals("int")){
                    					r = new FunctionNode( c.value() + " <= " + d.getCode(), "boolean");  
                    				
                    				}
                    				else  if (c.getType().equals("function")&& c.getReturnType().equals("int")){
                    					r = new FunctionNode( c.getCode() + " <= " +  d.value(), "boolean");  
                    				
                    				}
                    				else {
                    					throw new Exception("Incorrect Type. Int expected");
                    					 
                    				}
                    	}

                    }
                    break;
                case 11 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:416:4: ^( DBL_EQLS c= expression d= expression )
                    {
                    match(input,DBL_EQLS,FOLLOW_DBL_EQLS_in_expression1055); if (state.failed) return r;

                    match(input, Token.DOWN, null); if (state.failed) return r;
                    pushFollow(FOLLOW_expression_in_expression1059);
                    c=expression();

                    state._fsp--;
                    if (state.failed) return r;

                    pushFollow(FOLLOW_expression_in_expression1063);
                    d=expression();

                    state._fsp--;
                    if (state.failed) return r;

                    match(input, Token.UP, null); if (state.failed) return r;


                    if ( state.backtracking==0 ) {
                    		if ( c.getType().equals("int") && d.getType().equals("int")){
                    				r = new EqualNode(c.value(), d.value()); 
                    				}
                    				else  if (d.getType().equals("function")&& d.getReturnType().equals("int")){
                    					r = new FunctionNode( c.value() + " == " + d.getCode(), "boolean");  
                    				
                    				}
                    				else  if (c.getType().equals("function")&& c.getReturnType().equals("int")){
                    					r = new FunctionNode(  c.getCode()  + " == " + d.value(), "boolean");  
                    				
                    				}
                    				else {
                    					throw new Exception("Incorrect Type. Int expected");
                    					 
                    				}
                    	}

                    }
                    break;
                case 12 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:433:4: ^( NOT_EQLS c= expression d= expression )
                    {
                    match(input,NOT_EQLS,FOLLOW_NOT_EQLS_in_expression1072); if (state.failed) return r;

                    match(input, Token.DOWN, null); if (state.failed) return r;
                    pushFollow(FOLLOW_expression_in_expression1076);
                    c=expression();

                    state._fsp--;
                    if (state.failed) return r;

                    pushFollow(FOLLOW_expression_in_expression1080);
                    d=expression();

                    state._fsp--;
                    if (state.failed) return r;

                    match(input, Token.UP, null); if (state.failed) return r;


                    if ( state.backtracking==0 ) {
                    		if ( c.getType().equals("int") && d.getType().equals("int")){
                    				r = new NotEqualNode(c.value(), d.value()); 
                    				}
                    				else  if (d.getType().equals("function")&& d.getReturnType().equals("int")){
                    					r = new FunctionNode( c.value() + " != " + d.getCode(), "boolean");  
                    				
                    				}
                    				else  if (c.getType().equals("function")&& c.getReturnType().equals("int")){
                    					r = new FunctionNode( c.getCode()  + " != " + d.value() , "boolean");  
                    				
                    				}
                    				else {
                    					throw new Exception("Incorrect Type. Boolean expected");
                    										 
                    					
                    				}
                    	
                    	}

                    }
                    break;
                case 13 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:452:3: ^( AND c= expression d= expression )
                    {
                    match(input,AND,FOLLOW_AND_in_expression1087); if (state.failed) return r;

                    match(input, Token.DOWN, null); if (state.failed) return r;
                    pushFollow(FOLLOW_expression_in_expression1091);
                    c=expression();

                    state._fsp--;
                    if (state.failed) return r;

                    pushFollow(FOLLOW_expression_in_expression1095);
                    d=expression();

                    state._fsp--;
                    if (state.failed) return r;

                    match(input, Token.UP, null); if (state.failed) return r;


                    if ( state.backtracking==0 ) { 
                    		if ( c.getType().equals("boolean") && d.getType().equals("boolean")){
                    				r = new AndNode(c.value(), d.value()); 
                    				}
                    				else  if (d.getType().equals("function")&& d.getReturnType().equals("boolean")){
                    					r = new FunctionNode( c.value() + " && " + d.getCode(), "boolean");  
                    				
                    				}
                    				else  if (c.getType().equals("function")&& c.getReturnType().equals("boolean")){
                    					r = new FunctionNode( c.getCode() + " && " +  d.value(), "boolean");  
                    				
                    				}
                    				else {
                    					throw new Exception("Incorrect Type. Bool expected");
                    										 
                    					
                    				}
                    		
                    	}

                    }
                    break;
                case 14 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:471:4: ^( OR c= expression d= expression )
                    {
                    match(input,OR,FOLLOW_OR_in_expression1105); if (state.failed) return r;

                    match(input, Token.DOWN, null); if (state.failed) return r;
                    pushFollow(FOLLOW_expression_in_expression1109);
                    c=expression();

                    state._fsp--;
                    if (state.failed) return r;

                    pushFollow(FOLLOW_expression_in_expression1113);
                    d=expression();

                    state._fsp--;
                    if (state.failed) return r;

                    match(input, Token.UP, null); if (state.failed) return r;


                    if ( state.backtracking==0 ) {
                    		if ( c.getType().equals( "boolean") && d.getType().equals("boolean")){
                    				r = new OrNode(c.value(), d.value()); 
                    				}
                    					else  if (d.getType().equals("function")&& d.getReturnType().equals("boolean")){
                    					r = new FunctionNode( c.value() + " || " + d.getCode(), "boolean");  
                    				
                    				}
                    				else  if (c.getType().equals("function")&& c.getReturnType().equals("boolean")){
                    					r = new FunctionNode( c.getCode() + " || " +  d.value(), "boolean");  
                    				
                    				}
                    				else {
                    					throw new Exception("Incorrect Type. Bool expected");
                    										 
                    					
                    				}
                    	
                    	
                    	}

                    }
                    break;
                case 15 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:491:4: t= term
                    {
                    pushFollow(FOLLOW_term_in_expression1123);
                    t=term();

                    state._fsp--;
                    if (state.failed) return r;

                    if ( state.backtracking==0 ) { r = t;}

                    }
                    break;

            }
        }
        catch (Exception error) {

            		System.out.println(error.getMessage());
            			System.exit(1);
            		
        }

        finally {
        	// do for sure before leaving
        }
        return r;
    }
    // $ANTLR end "expression"



    // $ANTLR start "term"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:500:1: term returns [ExpressionNode r] : (f= function_call |d= TRUE |d= FALSE | ID | '(' e= expression ')' |d= CONST );
    public final ExpressionNode term() throws RecognitionException {
        ExpressionNode r = null;


        CommonTree d=null;
        CommonTree ID7=null;
        ExpressionNode f =null;

        ExpressionNode e =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:501:4: (f= function_call |d= TRUE |d= FALSE | ID | '(' e= expression ')' |d= CONST )
            int alt11=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA11_1 = input.LA(2);

                if ( (synpred28_EvaluatorWalker()) ) {
                    alt11=1;
                }
                else if ( (synpred31_EvaluatorWalker()) ) {
                    alt11=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return r;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;

                }
                }
                break;
            case TRUE:
                {
                alt11=2;
                }
                break;
            case FALSE:
                {
                alt11=3;
                }
                break;
            case 49:
                {
                alt11=5;
                }
                break;
            case CONST:
                {
                alt11=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:501:6: f= function_call
                    {
                    pushFollow(FOLLOW_function_call_in_term1153);
                    f=function_call();

                    state._fsp--;
                    if (state.failed) return r;

                    if ( state.backtracking==0 ) {r = f;}

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:502:9: d= TRUE
                    {
                    d=(CommonTree)match(input,TRUE,FOLLOW_TRUE_in_term1167); if (state.failed) return r;

                    if ( state.backtracking==0 ) {r = new ValueNode(Boolean.valueOf(true), "boolean");}

                    }
                    break;
                case 3 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:503:9: d= FALSE
                    {
                    d=(CommonTree)match(input,FALSE,FOLLOW_FALSE_in_term1181); if (state.failed) return r;

                    if ( state.backtracking==0 ) {r = new ValueNode(Boolean.valueOf(false), "boolean");}

                    }
                    break;
                case 4 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:504:6: ID
                    {
                    ID7=(CommonTree)match(input,ID,FOLLOW_ID_in_term1190); if (state.failed) return r;

                    if ( state.backtracking==0 ) {
                    			
                    			
                    			//variables.put("x",new Identifier("x", 1, "int"));
                    			if (variables.containsKey((ID7!=null?ID7.getText():null)) && !variables.get((ID7!=null?ID7.getText():null)).type.equals("function")) r = new FunctionNode((ID7!=null?ID7.getText():null), variables.get((ID7!=null?ID7.getText():null)).type);
                          else if ( variables.containsKey((ID7!=null?ID7.getText():null)) && variables.get((ID7!=null?ID7.getText():null)).type.equals("function"))    r = new FunctionNode((ID7!=null?ID7.getText():null), ((ExpressionNode) variables.get((ID7!=null?ID7.getText():null)).value).getReturnType());   //(ExpressionNode) variables.get((ID7!=null?ID7.getText():null)).value;
                    			else {throw new Exception("Identifier Not Found");
                    								}
                    			//throws new Exception("Identifier" + (ID7!=null?ID7.getText():null) + "Not Found"); }				
                    			}

                    }
                    break;
                case 5 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:514:6: '(' e= expression ')'
                    {
                    match(input,49,FOLLOW_49_in_term1199); if (state.failed) return r;

                    pushFollow(FOLLOW_expression_in_term1203);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return r;

                    match(input,50,FOLLOW_50_in_term1205); if (state.failed) return r;

                    if ( state.backtracking==0 ) {r =e;}

                    }
                    break;
                case 6 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:515:6: d= CONST
                    {
                    d=(CommonTree)match(input,CONST,FOLLOW_CONST_in_term1217); if (state.failed) return r;

                    if ( state.backtracking==0 ) {r = new ValueNode(Integer.parseInt((d!=null?d.getText():null)), "int");}

                    }
                    break;

            }
        }
        catch (Exception error) {

            		System.out.println(error.getMessage());
            			System.exit(1);
            		
        }

        finally {
        	// do for sure before leaving
        }
        return r;
    }
    // $ANTLR end "term"



    // $ANTLR start "assgn_expression"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:543:1: assgn_expression returns [String r] : ^( ASSIGN ID c= expression ) ;
    public final String assgn_expression() throws RecognitionException {
        String r = null;


        CommonTree ID8=null;
        ExpressionNode c =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:544:2: ( ^( ASSIGN ID c= expression ) )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:544:4: ^( ASSIGN ID c= expression )
            {
            match(input,ASSIGN,FOLLOW_ASSIGN_in_assgn_expression1269); if (state.failed) return r;

            match(input, Token.DOWN, null); if (state.failed) return r;
            ID8=(CommonTree)match(input,ID,FOLLOW_ID_in_assgn_expression1271); if (state.failed) return r;

            pushFollow(FOLLOW_expression_in_assgn_expression1275);
            c=expression();

            state._fsp--;
            if (state.failed) return r;

            match(input, Token.UP, null); if (state.failed) return r;


            if ( state.backtracking==0 ) {
            	if(variables.containsKey((ID8!=null?ID8.getText():null)) && ((ExpressionNode)variables.get((ID8!=null?ID8.getText():null)).value).getReturnType().equals(c.getReturnType())){ 
            		variables.remove((ID8!=null?ID8.getText():null));
            		variables.put ((ID8!=null?ID8.getText():null), new Identifier((ID8!=null?ID8.getText():null), c, c.getReturnType()));
            		r = (ID8!=null?ID8.getText():null) + " = " + c.getCode() + ";";
            			}
            	else {
            //		System.out.println(c.getReturnType() + '\n' + ((ExpressionNode)variables.get((ID8!=null?ID8.getText():null)).value).getReturnType());
            //		System.out.println("This Variable Has not been declared");
            		throw new Exception("This Variable Has not been declared");

            }
            }

            }

        }
        catch (Exception error) {

            		System.out.println(error.getMessage());
            			System.exit(1);
            		
        }

        finally {
        	// do for sure before leaving
        }
        return r;
    }
    // $ANTLR end "assgn_expression"



    // $ANTLR start "main_declaration"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:566:1: main_declaration returns [String r] : MAIN list= main_declaration_list ;
    public final String main_declaration() throws RecognitionException {
        String r = null;


        ArrayList<String> list =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:567:3: ( MAIN list= main_declaration_list )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:567:3: MAIN list= main_declaration_list
            {
            match(input,MAIN,FOLLOW_MAIN_in_main_declaration1302); if (state.failed) return r;

            pushFollow(FOLLOW_main_declaration_list_in_main_declaration1306);
            list=main_declaration_list();

            state._fsp--;
            if (state.failed) return r;

            if ( state.backtracking==0 ) { 
              
                r = "\tpublic static void main(String args[]) { \n";
                r += "\n";
                for (String str : list) {
                  //if  (variables.containsKey(str))
                  //{
                     r += "\t" + "\t" + "\t" + str + "Draw().drawBoard();";
                  //}
                }
                r += "\n";
                r += "\t}\n";
                
                //myBoard = (ArrayList<String>) list.clone(); 
              }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return r;
    }
    // $ANTLR end "main_declaration"



    // $ANTLR start "main_declaration_list"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:586:1: main_declaration_list returns [ArrayList<String> myDrawList] : ( DRAW b= ID m= main_declaration_list |);
    public final ArrayList<String> main_declaration_list() throws RecognitionException {
        ArrayList<String> myDrawList = null;


        CommonTree b=null;
        ArrayList<String> m =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:587:3: ( DRAW b= ID m= main_declaration_list |)
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==DRAW) ) {
                alt12=1;
            }
            else if ( (LA12_0==EOF) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return myDrawList;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:587:3: DRAW b= ID m= main_declaration_list
                    {
                    match(input,DRAW,FOLLOW_DRAW_in_main_declaration_list1325); if (state.failed) return myDrawList;

                    b=(CommonTree)match(input,ID,FOLLOW_ID_in_main_declaration_list1329); if (state.failed) return myDrawList;

                    pushFollow(FOLLOW_main_declaration_list_in_main_declaration_list1335);
                    m=main_declaration_list();

                    state._fsp--;
                    if (state.failed) return myDrawList;

                    if ( state.backtracking==0 ) {
                                  if (m != null) {
                                    myDrawList = m;
                                    myDrawList.add((b!=null?b.getText():null));
                                    
                                    //System.out.println("This board was recognized " + (b!=null?b.getText():null));
                                  }
                                  else {
                                    myDrawList = new ArrayList<String>();
                                    myDrawList.add((b!=null?b.getText():null));
                                  }
                                }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:603:1: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return myDrawList;
    }
    // $ANTLR end "main_declaration_list"


    protected static class board_declaration_scope {
        String id;
    }
    protected Stack board_declaration_stack = new Stack();



    // $ANTLR start "board_declaration"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:605:1: board_declaration returns [String boardDec] : BOARD ID bd= board_declaration_list ;
    public final String board_declaration() throws RecognitionException {
        board_declaration_stack.push(new board_declaration_scope());
        String boardDec = null;


        CommonTree ID9=null;
        BoardDeclarationListNode bd =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:607:3: ( BOARD ID bd= board_declaration_list )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:607:3: BOARD ID bd= board_declaration_list
            {
            match(input,BOARD,FOLLOW_BOARD_in_board_declaration1384); if (state.failed) return boardDec;

            ID9=(CommonTree)match(input,ID,FOLLOW_ID_in_board_declaration1386); if (state.failed) return boardDec;

            if ( state.backtracking==0 ) {((board_declaration_scope)board_declaration_stack.peek()).id =(ID9!=null?ID9.getText():null);}

            pushFollow(FOLLOW_board_declaration_list_in_board_declaration1397);
            bd=board_declaration_list();

            state._fsp--;
            if (state.failed) return boardDec;

            if ( state.backtracking==0 ) {
                
                  //Creates an String array list from boardDeclaratoinList 
                  //That should return three strings : size, start, and end respectively.
                  ArrayList<String> list1 = bd.getSizeStartEndList();
                 // System.out.println("----->" + boardDec);
                  boardDec = "\npublic static Board " + (ID9!=null?ID9.getText():null) + "Draw() { \n\n";
                  boardDec = boardDec + "\t\tBoard " + (ID9!=null?ID9.getText():null) + " = new Board(" + list1.get(0) + ");\n";
                  
                  boardDec = boardDec + "\t\t" + (ID9!=null?ID9.getText():null) + ".addStart(" + list1.get(1) + ");\n";
                  
                  boardDec = boardDec + "\t\t" + (ID9!=null?ID9.getText():null) + ".addEnd(" + list1.get(2) + ");\n\n";
                  
                  
                  //
                  boardDec = "" + "\t" + boardDec + bd.getPointsAndPaths() + "\n";
                  
            //      for (String id: bd.getPathIDs()){
            //        boardDec = boardDec + "\t\t" + (ID9!=null?ID9.getText():null) + ".addPath(" + id + ");\n";
            //      }
                  
                  boardDec = boardDec + "\t\treturn " + (ID9!=null?ID9.getText():null) + ";\n" ;
                  
                  boardDec = boardDec + "\t}" ;
                  
            //      boardDec = boardDec + "\n\t\t" + (ID9!=null?ID9.getText():null) + ".drawBoard();\n" ;
            //      
            //      boardDec = boardDec + '\n' + "\t}\n}";
                  variables2.put((ID9!=null?ID9.getText():null), boardDec);
                }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            board_declaration_stack.pop();
        }
        return boardDec;
    }
    // $ANTLR end "board_declaration"


    protected static class board_declaration_list_scope {
        String id;
    }
    protected Stack board_declaration_list_stack = new Stack();



    // $ANTLR start "board_declaration_list"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:643:1: board_declaration_list returns [BoardDeclarationListNode myBDLNode] : p1= size_declaration p2= start_declaration p3= end_declaration p4= board_statement_list2 ;
    public final BoardDeclarationListNode board_declaration_list() throws RecognitionException {
        board_declaration_list_stack.push(new board_declaration_list_scope());
        BoardDeclarationListNode myBDLNode = null;


        String p1 =null;

        String p2 =null;

        String p3 =null;

        String p4 =null;


        ArrayList<String> sizeStartEndList = new ArrayList<String>();
        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:646:5: (p1= size_declaration p2= start_declaration p3= end_declaration p4= board_statement_list2 )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:646:8: p1= size_declaration p2= start_declaration p3= end_declaration p4= board_statement_list2
            {
            pushFollow(FOLLOW_size_declaration_in_board_declaration_list1441);
            p1=size_declaration();

            state._fsp--;
            if (state.failed) return myBDLNode;

            pushFollow(FOLLOW_start_declaration_in_board_declaration_list1445);
            p2=start_declaration();

            state._fsp--;
            if (state.failed) return myBDLNode;

            pushFollow(FOLLOW_end_declaration_in_board_declaration_list1449);
            p3=end_declaration();

            state._fsp--;
            if (state.failed) return myBDLNode;

            pushFollow(FOLLOW_board_statement_list2_in_board_declaration_list1453);
            p4=board_statement_list2();

            state._fsp--;
            if (state.failed) return myBDLNode;

            if ( state.backtracking==0 ) { 
            	    sizeStartEndList.add(p1);
            	    sizeStartEndList.add(p2);
            	    sizeStartEndList.add(p3);
                  
                  myBDLNode = new BoardDeclarationListNode(sizeStartEndList, p4);
                
                 }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            board_declaration_list_stack.pop();
        }
        return myBDLNode;
    }
    // $ANTLR end "board_declaration_list"



    // $ANTLR start "board_statement_list2"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:658:1: board_statement_list2 returns [String myBSL2] : (b2= board_statement_2 b2list= board_statement_list2 |);
    public final String board_statement_list2() throws RecognitionException {
        String myBSL2 = null;


        Identifier b2 =null;

        String b2list =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:659:23: (b2= board_statement_2 b2list= board_statement_list2 |)
            int alt13=2;
            switch ( input.LA(1) ) {
            case ID:
            case IF:
            case PATH:
            case POINT:
            case PRINT:
            case SET:
            case WHILE:
                {
                alt13=1;
                }
                break;
            case INT:
                {
                int LA13_4 = input.LA(2);

                if ( (synpred34_EvaluatorWalker()) ) {
                    alt13=1;
                }
                else if ( (true) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return myBSL2;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 4, input);

                    throw nvae;

                }
                }
                break;
            case ASSIGN:
                {
                int LA13_5 = input.LA(2);

                if ( (synpred34_EvaluatorWalker()) ) {
                    alt13=1;
                }
                else if ( (true) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return myBSL2;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 5, input);

                    throw nvae;

                }
                }
                break;
            case BOOLEAN:
                {
                int LA13_6 = input.LA(2);

                if ( (synpred34_EvaluatorWalker()) ) {
                    alt13=1;
                }
                else if ( (true) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return myBSL2;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 6, input);

                    throw nvae;

                }
                }
                break;
            case EOF:
            case UP:
            case BOARD:
            case ELSE:
            case FUNC:
            case MAIN:
            case RETURN:
            case STRUCTURE:
                {
                alt13=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return myBSL2;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:659:26: b2= board_statement_2 b2list= board_statement_list2
                    {
                    pushFollow(FOLLOW_board_statement_2_in_board_statement_list21500);
                    b2=board_statement_2();

                    state._fsp--;
                    if (state.failed) return myBSL2;

                    pushFollow(FOLLOW_board_statement_list2_in_board_statement_list21504);
                    b2list=board_statement_list2();

                    state._fsp--;
                    if (state.failed) return myBSL2;

                    if ( state.backtracking==0 ) {
                                                if (b2list==null){
                                                    myBSL2 = "\t\t" + (String)b2.getValue();
                                                }
                                                else{ //list is not null
                                                    myBSL2 = "\t\t" + (String)b2.getValue() + b2list;
                                                }
                                               

                                             }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:670:35: 
                    {
                    if ( state.backtracking==0 ) {myBSL2 = "";}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return myBSL2;
    }
    // $ANTLR end "board_statement_list2"



    // $ANTLR start "board_statement_2"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:673:1: board_statement_2 returns [Identifier pathOrPoint] : (s= set_structure |point= point_declaration |path= path_declaration |var= var_declaration |bs= board_statement );
    public final Identifier board_statement_2() throws RecognitionException {
        Identifier pathOrPoint = null;


        String s =null;

        String point =null;

        PathNode path =null;

        String var =null;

        String bs =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:674:18: (s= set_structure |point= point_declaration |path= path_declaration |var= var_declaration |bs= board_statement )
            int alt14=5;
            switch ( input.LA(1) ) {
            case SET:
                {
                alt14=1;
                }
                break;
            case POINT:
                {
                alt14=2;
                }
                break;
            case PATH:
                {
                alt14=3;
                }
                break;
            case BOOLEAN:
            case INT:
                {
                alt14=4;
                }
                break;
            case ASSIGN:
                {
                int LA14_5 = input.LA(2);

                if ( (LA14_5==DOWN) ) {
                    int LA14_7 = input.LA(3);

                    if ( (LA14_7==BOOLEAN||LA14_7==INT) ) {
                        alt14=4;
                    }
                    else if ( (LA14_7==ID) ) {
                        alt14=5;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return pathOrPoint;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 7, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return pathOrPoint;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 5, input);

                    throw nvae;

                }
                }
                break;
            case ID:
            case IF:
            case PRINT:
            case WHILE:
                {
                alt14=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return pathOrPoint;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:675:18: s= set_structure
                    {
                    pushFollow(FOLLOW_set_structure_in_board_statement_21634);
                    s=set_structure();

                    state._fsp--;
                    if (state.failed) return pathOrPoint;

                    if ( state.backtracking==0 ) {pathOrPoint = new Identifier("", s, "structure");}

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:676:20: point= point_declaration
                    {
                    pushFollow(FOLLOW_point_declaration_in_board_statement_21659);
                    point=point_declaration();

                    state._fsp--;
                    if (state.failed) return pathOrPoint;

                    if ( state.backtracking==0 ) {pathOrPoint = new Identifier("", point, "point");/*pathOrPoint = point;*/}

                    }
                    break;
                case 3 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:677:20: path= path_declaration
                    {
                    pushFollow(FOLLOW_path_declaration_in_board_statement_21685);
                    path=path_declaration();

                    state._fsp--;
                    if (state.failed) return pathOrPoint;

                    if ( state.backtracking==0 ) {pathOrPoint = new Identifier(path.getId(), path.getName() + "\t\t" + ((board_declaration_scope)board_declaration_stack.peek()).id + ".addPath(" + path.getId() + ");\n\n", "path");}

                    }
                    break;
                case 4 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:678:20: var= var_declaration
                    {
                    pushFollow(FOLLOW_var_declaration_in_board_statement_21710);
                    var=var_declaration();

                    state._fsp--;
                    if (state.failed) return pathOrPoint;

                    if ( state.backtracking==0 ) {pathOrPoint = new Identifier("", var, "var");}

                    }
                    break;
                case 5 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:680:20: bs= board_statement
                    {
                    pushFollow(FOLLOW_board_statement_in_board_statement_21746);
                    bs=board_statement();

                    state._fsp--;
                    if (state.failed) return pathOrPoint;

                    if ( state.backtracking==0 ) {pathOrPoint = new Identifier("", bs, "board_statement"); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return pathOrPoint;
    }
    // $ANTLR end "board_statement_2"



    // $ANTLR start "set_structure"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:685:1: set_structure returns [String myStructure] : SET ID ;
    public final String set_structure() throws RecognitionException {
        String myStructure = null;


        CommonTree ID10=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:686:13: ( SET ID )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:686:15: SET ID
            {
            match(input,SET,FOLLOW_SET_in_set_structure1812); if (state.failed) return myStructure;

            ID10=(CommonTree)match(input,ID,FOLLOW_ID_in_set_structure1814); if (state.failed) return myStructure;

            if ( state.backtracking==0 ) {                      
                                  myStructure = "ArrayList<StructureNode> " + (ID10!=null?ID10.getText():null) + "ArrayList = new ArrayList<StructureNode>();\n";
                                  myStructure += (ID10!=null?ID10.getText():null) + "ArrayList = " + (ID10!=null?ID10.getText():null) + "Structure(); \n";
                                  myStructure += "for (StructureNode Geforce : " + (ID10!=null?ID10.getText():null) + "ArrayList) { \n" ;
                                  myStructure += "Point ati = Geforce.getPoint(); \n";
                                  myStructure += ((board_declaration_scope)board_declaration_stack.peek()).id + ".addPath(Geforce.getPath()); \n } \n";
                                  
                                  }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return myStructure;
    }
    // $ANTLR end "set_structure"



    // $ANTLR start "structure_declaration"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:697:1: structure_declaration returns [String s] : STRUCTURE ID body= structure_body ;
    public final String structure_declaration() throws RecognitionException {
        String s = null;


        CommonTree ID11=null;
        String body =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:698:3: ( STRUCTURE ID body= structure_body )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:698:5: STRUCTURE ID body= structure_body
            {
            match(input,STRUCTURE,FOLLOW_STRUCTURE_in_structure_declaration1844); if (state.failed) return s;

            ID11=(CommonTree)match(input,ID,FOLLOW_ID_in_structure_declaration1846); if (state.failed) return s;

            pushFollow(FOLLOW_structure_body_in_structure_declaration1851);
            body=structure_body();

            state._fsp--;
            if (state.failed) return s;

            if ( state.backtracking==0 ) {
                                    if (body == null){
                                      variables2.put((ID11!=null?ID11.getText():null), null);
                                      s = "";
                                    }
                                    else{
                                      variables2.put((ID11!=null?ID11.getText():null), body);
                                      s = "\n public static ArrayList<StructureNode> " + (ID11!=null?ID11.getText():null) + "Structure() { \n\n";
                                      s += "\tArrayList<StructureNode> StructList = new ArrayList<StructureNode>();\n\n";
                                      s += body.toString() + "\n";
                                      s += "\treturn StructList;\n";
                                      s += "}\n";
                                    }
                                  }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return s;
    }
    // $ANTLR end "structure_declaration"



    // $ANTLR start "structure_body"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:717:1: structure_body returns [String myBSL2] : (b2= structure_statement b2list= structure_body |);
    public final String structure_body() throws RecognitionException {
        String myBSL2 = null;


        Identifier b2 =null;

        String b2list =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:718:17: (b2= structure_statement b2list= structure_body |)
            int alt15=2;
            switch ( input.LA(1) ) {
            case ID:
            case IF:
            case PATH:
            case POINT:
            case PRINT:
            case WHILE:
                {
                alt15=1;
                }
                break;
            case INT:
                {
                int LA15_7 = input.LA(2);

                if ( (synpred39_EvaluatorWalker()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return myBSL2;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 7, input);

                    throw nvae;

                }
                }
                break;
            case ASSIGN:
                {
                int LA15_8 = input.LA(2);

                if ( (synpred39_EvaluatorWalker()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return myBSL2;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 8, input);

                    throw nvae;

                }
                }
                break;
            case BOOLEAN:
                {
                int LA15_9 = input.LA(2);

                if ( (synpred39_EvaluatorWalker()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return myBSL2;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 9, input);

                    throw nvae;

                }
                }
                break;
            case EOF:
            case UP:
            case BOARD:
            case ELSE:
            case FUNC:
            case MAIN:
            case STRUCTURE:
                {
                alt15=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return myBSL2;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:718:19: b2= structure_statement b2list= structure_body
                    {
                    pushFollow(FOLLOW_structure_statement_in_structure_body1932);
                    b2=structure_statement();

                    state._fsp--;
                    if (state.failed) return myBSL2;

                    pushFollow(FOLLOW_structure_body_in_structure_body1936);
                    b2list=structure_body();

                    state._fsp--;
                    if (state.failed) return myBSL2;

                    if ( state.backtracking==0 ) {
                                                         
                                        if (b2list==null){
                                                    ArrayList<String> paths = new ArrayList<String>();
                                                    if (b2.getType().equals("path")){
                                                      paths.add(b2.getName());
                    //                                  myBSL2 = new BSL2Node("\t\t" + (String)b2.getValue(), paths);
                                                      myBSL2 = "\t\t" + (String)b2.getValue();
                                                    }
                                                    else if(b2.getType().equals("point")){
                    //                                  myBSL2 = new BSL2Node("\t\t" + (String)b2.getValue(), paths);
                                                      myBSL2 = "\t\t" + (String)b2.getValue();
                                                    }
                                                    else if(b2.getType().equals("var")){
                    //                                  myBSL2 = new BSL2Node("\t\t" + (String)b2.getValue(), paths);
                                                      myBSL2 = "\t\t" + (String)b2.getValue();
                                                    }
                                                    else if(b2.getType().equals("board_statement")){
                    //                                  myBSL2 = new BSL2Node("\t\t" + (String)b2.getValue(), paths);
                                                      myBSL2 = "\t\t" + (String)b2.getValue();
                                                    }
                                                    else if(b2.getType().equals("assgn_expression")){
                                                        myBSL2 = "\t\t" + (String)b2.getValue();
                                                    }
                                                    else{
                                                      throw new Exception("Type is not path or point. Error.");
                                                      					 
                                                      
                                                    }
                                               }
                                               else{ //list is not null
                                                    if (b2.getType().equals("path")){
                    //                                    ArrayList<String> paths = b2list.getPathIDs();
                    //                                    paths.add(b2.getName());
                    //                                    myBSL2 = new BSL2Node("\t\t" + (String)b2.getValue() + b2list.getString(), paths);
                                                        myBSL2 = "\t\t" + (String)b2.getValue() + b2list;
                                                    }
                                                    else if(b2.getType().equals("point")){
                    //                                    myBSL2 = new BSL2Node("\t\t" + (String)b2.getValue() + b2list.getString(), b2list.getPathIDs());
                                                        myBSL2 = "\t\t" + (String)b2.getValue() + b2list;

                                                    }
                                                    else if(b2.getType().equals("var")){
                    //                                    myBSL2 = new BSL2Node("\t\t" + (String)b2.getValue() + b2list.getString(), b2list.getPathIDs());
                                                        myBSL2 = "\t\t" + (String)b2.getValue() + b2list;
                                                    }
                                                    else if(b2.getType().equals("board_statement")){
                    //                                    myBSL2 = new BSL2Node("\t\t" + (String)b2.getValue() + b2list.getString(), b2list.getPathIDs());
                                                        myBSL2 = "\t\t" + (String)b2.getValue() + b2list;
                                                    }
                                                    else if(b2.getType().equals("assgn_expression")){
                                                        myBSL2 = "\t\t" + (String)b2.getValue() + b2list;
                                                    }
                                                    else{
                                                       throw new Exception("Type is not path or point. Error."); 
                                                       					 
                                                       
                                                    }
                                                    
                                               }
                                               
                                              }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:781:35: 
                    {
                    if ( state.backtracking==0 ) {myBSL2 ="";}

                    }
                    break;

            }
        }
        catch (Exception error) {

            		System.out.println(error.getMessage());
            			System.exit(1);
            		
        }

        finally {
        	// do for sure before leaving
        }
        return myBSL2;
    }
    // $ANTLR end "structure_body"



    // $ANTLR start "structure_statement"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:789:1: structure_statement returns [Identifier ident] : (bs= structure_board_statement |point= point_declaration |path= path_declaration |v= var_declaration |a= assgn_expression );
    public final Identifier structure_statement() throws RecognitionException {
        Identifier ident = null;


        String bs =null;

        String point =null;

        PathNode path =null;

        String v =null;

        String a =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:789:47: (bs= structure_board_statement |point= point_declaration |path= path_declaration |v= var_declaration |a= assgn_expression )
            int alt16=5;
            switch ( input.LA(1) ) {
            case ID:
            case IF:
            case PRINT:
            case WHILE:
                {
                alt16=1;
                }
                break;
            case POINT:
                {
                alt16=2;
                }
                break;
            case PATH:
                {
                alt16=3;
                }
                break;
            case BOOLEAN:
            case INT:
                {
                alt16=4;
                }
                break;
            case ASSIGN:
                {
                int LA16_5 = input.LA(2);

                if ( (LA16_5==DOWN) ) {
                    int LA16_6 = input.LA(3);

                    if ( (LA16_6==BOOLEAN||LA16_6==INT) ) {
                        alt16=4;
                    }
                    else if ( (LA16_6==ID) ) {
                        alt16=5;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ident;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 6, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ident;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 5, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ident;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:790:13: bs= structure_board_statement
                    {
                    pushFollow(FOLLOW_structure_board_statement_in_structure_statement2056);
                    bs=structure_board_statement();

                    state._fsp--;
                    if (state.failed) return ident;

                    if ( state.backtracking==0 ) {ident = new Identifier("", bs, "board_statement"); }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:791:14: point= point_declaration
                    {
                    pushFollow(FOLLOW_point_declaration_in_structure_statement2088);
                    point=point_declaration();

                    state._fsp--;
                    if (state.failed) return ident;

                    if ( state.backtracking==0 ) {ident = new Identifier("",point,"point");}

                    }
                    break;
                case 3 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:792:14: path= path_declaration
                    {
                    pushFollow(FOLLOW_path_declaration_in_structure_statement2109);
                    path=path_declaration();

                    state._fsp--;
                    if (state.failed) return ident;

                    if ( state.backtracking==0 ) {ident = new Identifier(path.getId(),path.getName() + "\n\t" + 
                                                            "if (!StructList.contains(new StructureNode(" +
                                                            path.getPoint_ID() + ", " + path.getId() + "))) {" +
                                                            "StructureNode " + path.getPoint_ID() + "Node = new StructureNode(" +
                                                            path.getPoint_ID() + ", " + path.getId() + "); \n\t" + 
                                                            "StructList.add(" + path.getPoint_ID() + "Node);\n } \n " ,"path");}

                    }
                    break;
                case 4 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:798:14: v= var_declaration
                    {
                    pushFollow(FOLLOW_var_declaration_in_structure_statement2130);
                    v=var_declaration();

                    state._fsp--;
                    if (state.failed) return ident;

                    if ( state.backtracking==0 ) {ident = new Identifier("",v,"var");}

                    }
                    break;
                case 5 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:799:14: a= assgn_expression
                    {
                    pushFollow(FOLLOW_assgn_expression_in_structure_statement2151);
                    a=assgn_expression();

                    state._fsp--;
                    if (state.failed) return ident;

                    if ( state.backtracking==0 ) {ident = new Identifier("",a,"assgn_expression");}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ident;
    }
    // $ANTLR end "structure_statement"



    // $ANTLR start "structure_path_declaration"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:802:1: structure_path_declaration returns [PathNode myPath] : ( PATH i1= ID i2= term d= direction e= expression | PATH ID );
    public final PathNode structure_path_declaration() throws RecognitionException {
        PathNode myPath = null;


        CommonTree i1=null;
        ExpressionNode i2 =null;

        String d =null;

        ExpressionNode e =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:803:3: ( PATH i1= ID i2= term d= direction e= expression | PATH ID )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==PATH) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==ID) ) {
                    int LA17_2 = input.LA(3);

                    if ( (LA17_2==CONST||LA17_2==FALSE||LA17_2==ID||LA17_2==TRUE||LA17_2==49) ) {
                        alt17=1;
                    }
                    else if ( (LA17_2==EOF) ) {
                        alt17=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return myPath;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return myPath;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return myPath;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:803:3: PATH i1= ID i2= term d= direction e= expression
                    {
                    match(input,PATH,FOLLOW_PATH_in_structure_path_declaration2197); if (state.failed) return myPath;

                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_structure_path_declaration2201); if (state.failed) return myPath;

                    pushFollow(FOLLOW_term_in_structure_path_declaration2205);
                    i2=term();

                    state._fsp--;
                    if (state.failed) return myPath;

                    pushFollow(FOLLOW_direction_in_structure_path_declaration2209);
                    d=direction();

                    state._fsp--;
                    if (state.failed) return myPath;

                    pushFollow(FOLLOW_expression_in_structure_path_declaration2213);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return myPath;

                    if ( state.backtracking==0 ) {
                                            if (i2.getType().equals("function") && variables.containsKey(((FunctionNode)i2).Identifier) && e.getReturnType().equals("int")){
                                            
                                            String myPathString = "Path " + (i1!=null?i1.getText():null) + " = new Path(" + ((FunctionNode)i2).Identifier + ", \"" + d + "\", " + e.getCode() + ");\n";

                                            myPath = new PathNode(myPathString, (i1!=null?i1.getText():null), ((FunctionNode)i2).Identifier);
                                          }
                                          else if (i2.getType().equals("function") && ((FunctionNode)i2).getReturnType().equals("point")&& e.getReturnType().equals("int")){
                                            String myPathString = "Path " + (i1!=null?i1.getText():null) + " = new Path(" + i2.getCode() + ", \"" + d + "\", " + e.getCode() + ");\n";
                                            myPath = new PathNode(myPathString, (i1!=null?i1.getText():null), i2.getCode());
                                              
                                          }
                                          else {throw new Exception("Path Expects a point");
                                          					 
                                          }
                                          }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:820:21: PATH ID
                    {
                    match(input,PATH,FOLLOW_PATH_in_structure_path_declaration2258); if (state.failed) return myPath;

                    match(input,ID,FOLLOW_ID_in_structure_path_declaration2260); if (state.failed) return myPath;

                    }
                    break;

            }
        }
        catch (Exception error) {

            		System.out.println( error.getMessage());
            			System.exit(1);
            		
        }

        finally {
        	// do for sure before leaving
        }
        return myPath;
    }
    // $ANTLR end "structure_path_declaration"



    // $ANTLR start "structure_iteration_stmt"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:828:1: structure_iteration_stmt returns [String str] : ^( WHILE e= expression b= structure_body ) ;
    public final String structure_iteration_stmt() throws RecognitionException {
        String str = null;


        ExpressionNode e =null;

        String b =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:828:47: ( ^( WHILE e= expression b= structure_body ) )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:828:49: ^( WHILE e= expression b= structure_body )
            {
            match(input,WHILE,FOLLOW_WHILE_in_structure_iteration_stmt2299); if (state.failed) return str;

            match(input, Token.DOWN, null); if (state.failed) return str;
            pushFollow(FOLLOW_expression_in_structure_iteration_stmt2303);
            e=expression();

            state._fsp--;
            if (state.failed) return str;

            pushFollow(FOLLOW_structure_body_in_structure_iteration_stmt2307);
            b=structure_body();

            state._fsp--;
            if (state.failed) return str;

            match(input, Token.UP, null); if (state.failed) return str;


            if ( state.backtracking==0 ) {
                    if(e.getReturnType().equals("boolean") || e.getType().equals("boolean")) {

                      str = "while(" + e.getCode() + "){" + b + "}";
            //          throw new Exception("`````````````````" + b);
                    }
                      
                    else{
                      throw new Exception("Invalid type in while loop. Expected a boolean but received a(n) " + e.getReturnType());
                      					 
                      }
              }

            }

        }
        catch (Exception error) {

            		System.out.println( error.getMessage());
            			 			System.exit(1);
            			 
            		
        }

        finally {
        	// do for sure before leaving
        }
        return str;
    }
    // $ANTLR end "structure_iteration_stmt"



    // $ANTLR start "structure_selection_stmt"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:849:1: structure_selection_stmt returns [String str] : ^( IF e= expression b= structure_body b2= structure_selection_else_stmt ) ;
    public final String structure_selection_stmt() throws RecognitionException {
        String str = null;


        ExpressionNode e =null;

        String b =null;

        String b2 =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:850:22: ( ^( IF e= expression b= structure_body b2= structure_selection_else_stmt ) )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:850:24: ^( IF e= expression b= structure_body b2= structure_selection_else_stmt )
            {
            match(input,IF,FOLLOW_IF_in_structure_selection_stmt2383); if (state.failed) return str;

            match(input, Token.DOWN, null); if (state.failed) return str;
            pushFollow(FOLLOW_expression_in_structure_selection_stmt2389);
            e=expression();

            state._fsp--;
            if (state.failed) return str;

            pushFollow(FOLLOW_structure_body_in_structure_selection_stmt2393);
            b=structure_body();

            state._fsp--;
            if (state.failed) return str;

            pushFollow(FOLLOW_structure_selection_else_stmt_in_structure_selection_stmt2397);
            b2=structure_selection_else_stmt();

            state._fsp--;
            if (state.failed) return str;

            match(input, Token.UP, null); if (state.failed) return str;


            if ( state.backtracking==0 ) {
                                   if(e.getReturnType().equals("boolean") || e.getType().equals("boolean")) {
                                  
                                 	str = "if(" + e.getCode() + "){\n" + b + "} " + b2;}
                                 	else throw new Exception("Invalid type in if statement. Expected a boolean but received a(n) " + e.getReturnType()) ;}

            }

        }
        catch (Exception error) {

            		System.out.println( error.getMessage());
            			System.exit(1);
            		
        }

        finally {
        	// do for sure before leaving
        }
        return str;
    }
    // $ANTLR end "structure_selection_stmt"



    // $ANTLR start "structure_selection_else_stmt"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:864:1: structure_selection_else_stmt returns [String str] : ( ^( ELSE b= structure_body ) |);
    public final String structure_selection_else_stmt() throws RecognitionException {
        String str = null;


        String b =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:865:27: ( ^( ELSE b= structure_body ) |)
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ELSE) ) {
                alt18=1;
            }
            else if ( (LA18_0==UP) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return str;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:865:29: ^( ELSE b= structure_body )
                    {
                    match(input,ELSE,FOLLOW_ELSE_in_structure_selection_else_stmt2555); if (state.failed) return str;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return str;
                        pushFollow(FOLLOW_structure_body_in_structure_selection_else_stmt2559);
                        b=structure_body();

                        state._fsp--;
                        if (state.failed) return str;

                        match(input, Token.UP, null); if (state.failed) return str;
                    }


                    if ( state.backtracking==0 ) { str= "else{" + b + "}";}

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:866:38: 
                    {
                    if ( state.backtracking==0 ) {str = "";}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return str;
    }
    // $ANTLR end "structure_selection_else_stmt"



    // $ANTLR start "structure_board_statement"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:869:1: structure_board_statement returns [String str] : (i= structure_iteration_stmt |b= structure_selection_stmt |p= print_stmt |f= function_call );
    public final String structure_board_statement() throws RecognitionException {
        String str = null;


        String i =null;

        String b =null;

        String p =null;

        ExpressionNode f =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:869:47: (i= structure_iteration_stmt |b= structure_selection_stmt |p= print_stmt |f= function_call )
            int alt19=4;
            switch ( input.LA(1) ) {
            case WHILE:
                {
                alt19=1;
                }
                break;
            case IF:
                {
                alt19=2;
                }
                break;
            case PRINT:
                {
                alt19=3;
                }
                break;
            case ID:
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return str;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:870:17: i= structure_iteration_stmt
                    {
                    pushFollow(FOLLOW_structure_iteration_stmt_in_structure_board_statement2667);
                    i=structure_iteration_stmt();

                    state._fsp--;
                    if (state.failed) return str;

                    if ( state.backtracking==0 ) {str = i;}

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:871:17: b= structure_selection_stmt
                    {
                    pushFollow(FOLLOW_structure_selection_stmt_in_structure_board_statement2691);
                    b=structure_selection_stmt();

                    state._fsp--;
                    if (state.failed) return str;

                    if ( state.backtracking==0 ) {str = b;}

                    }
                    break;
                case 3 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:872:17: p= print_stmt
                    {
                    pushFollow(FOLLOW_print_stmt_in_structure_board_statement2715);
                    p=print_stmt();

                    state._fsp--;
                    if (state.failed) return str;

                    if ( state.backtracking==0 ) {str = p;}

                    }
                    break;
                case 4 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:873:17: f= function_call
                    {
                    pushFollow(FOLLOW_function_call_in_structure_board_statement2744);
                    f=function_call();

                    state._fsp--;
                    if (state.failed) return str;

                    if ( state.backtracking==0 ) {str = f.getCode();}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return str;
    }
    // $ANTLR end "structure_board_statement"



    // $ANTLR start "size_declaration"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:876:1: size_declaration returns [String myPoint] : SIZE c1= CONST c2= CONST ;
    public final String size_declaration() throws RecognitionException {
        String myPoint = null;


        CommonTree c1=null;
        CommonTree c2=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:877:3: ( SIZE c1= CONST c2= CONST )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:877:3: SIZE c1= CONST c2= CONST
            {
            match(input,SIZE,FOLLOW_SIZE_in_size_declaration2823); if (state.failed) return myPoint;

            c1=(CommonTree)match(input,CONST,FOLLOW_CONST_in_size_declaration2827); if (state.failed) return myPoint;

            c2=(CommonTree)match(input,CONST,FOLLOW_CONST_in_size_declaration2831); if (state.failed) return myPoint;

            if ( state.backtracking==0 ) {/*System.out.println("Size is " + (c1!=null?c1.getText():null) + ", " + (c2!=null?c2.getText():null)); */
             myPoint = "new Point(" + (c1!=null?c1.getText():null) + ", " + (c2!=null?c2.getText():null) + ")";
             }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return myPoint;
    }
    // $ANTLR end "size_declaration"



    // $ANTLR start "board_statement"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:886:1: board_statement returns [String str] : (i= board_iteration_stmt |b= board_selection_stmt |p= print_stmt |a= assgn_expression |f= function_call );
    public final String board_statement() throws RecognitionException {
        String str = null;


        String i =null;

        String b =null;

        String p =null;

        String a =null;

        ExpressionNode f =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:886:37: (i= board_iteration_stmt |b= board_selection_stmt |p= print_stmt |a= assgn_expression |f= function_call )
            int alt20=5;
            switch ( input.LA(1) ) {
            case WHILE:
                {
                alt20=1;
                }
                break;
            case IF:
                {
                alt20=2;
                }
                break;
            case PRINT:
                {
                alt20=3;
                }
                break;
            case ASSIGN:
                {
                alt20=4;
                }
                break;
            case ID:
                {
                alt20=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return str;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:887:17: i= board_iteration_stmt
                    {
                    pushFollow(FOLLOW_board_iteration_stmt_in_board_statement2886);
                    i=board_iteration_stmt();

                    state._fsp--;
                    if (state.failed) return str;

                    if ( state.backtracking==0 ) {str = i;}

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:888:17: b= board_selection_stmt
                    {
                    pushFollow(FOLLOW_board_selection_stmt_in_board_statement2910);
                    b=board_selection_stmt();

                    state._fsp--;
                    if (state.failed) return str;

                    if ( state.backtracking==0 ) {str = b;}

                    }
                    break;
                case 3 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:889:17: p= print_stmt
                    {
                    pushFollow(FOLLOW_print_stmt_in_board_statement2934);
                    p=print_stmt();

                    state._fsp--;
                    if (state.failed) return str;

                    if ( state.backtracking==0 ) {str = p;}

                    }
                    break;
                case 4 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:890:17: a= assgn_expression
                    {
                    pushFollow(FOLLOW_assgn_expression_in_board_statement2958);
                    a=assgn_expression();

                    state._fsp--;
                    if (state.failed) return str;

                    if ( state.backtracking==0 ) {str = a;}

                    }
                    break;
                case 5 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:891:18: f= function_call
                    {
                    pushFollow(FOLLOW_function_call_in_board_statement2983);
                    f=function_call();

                    state._fsp--;
                    if (state.failed) return str;

                    if ( state.backtracking==0 ) {str = f.getCode() + ";";}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return str;
    }
    // $ANTLR end "board_statement"



    // $ANTLR start "statement"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:898:1: statement returns [Identifier ident] : (i= iteration_stmt |s= selection_stmt |point= point_declaration |path= path_declaration |v= var_declaration |a= assgn_expression );
    public final Identifier statement() throws RecognitionException {
        Identifier ident = null;


        String i =null;

        String s =null;

        String point =null;

        PathNode path =null;

        String v =null;

        String a =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:898:37: (i= iteration_stmt |s= selection_stmt |point= point_declaration |path= path_declaration |v= var_declaration |a= assgn_expression )
            int alt21=6;
            switch ( input.LA(1) ) {
            case WHILE:
                {
                alt21=1;
                }
                break;
            case IF:
                {
                alt21=2;
                }
                break;
            case POINT:
                {
                alt21=3;
                }
                break;
            case PATH:
                {
                alt21=4;
                }
                break;
            case BOOLEAN:
            case INT:
                {
                alt21=5;
                }
                break;
            case ASSIGN:
                {
                int LA21_6 = input.LA(2);

                if ( (LA21_6==DOWN) ) {
                    int LA21_7 = input.LA(3);

                    if ( (LA21_7==BOOLEAN||LA21_7==INT) ) {
                        alt21=5;
                    }
                    else if ( (LA21_7==ID) ) {
                        alt21=6;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ident;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 7, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ident;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 6, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ident;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:899:13: i= iteration_stmt
                    {
                    pushFollow(FOLLOW_iteration_stmt_in_statement3045);
                    i=iteration_stmt();

                    state._fsp--;
                    if (state.failed) return ident;

                    if ( state.backtracking==0 ) {ident = new Identifier("",i,"iteration_stmt");}

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:900:14: s= selection_stmt
                    {
                    pushFollow(FOLLOW_selection_stmt_in_statement3067);
                    s=selection_stmt();

                    state._fsp--;
                    if (state.failed) return ident;

                    if ( state.backtracking==0 ) {ident = new Identifier("",s,"selection_stmt");}

                    }
                    break;
                case 3 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:901:14: point= point_declaration
                    {
                    pushFollow(FOLLOW_point_declaration_in_statement3088);
                    point=point_declaration();

                    state._fsp--;
                    if (state.failed) return ident;

                    if ( state.backtracking==0 ) {ident = new Identifier("",point,"point");}

                    }
                    break;
                case 4 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:902:14: path= path_declaration
                    {
                    pushFollow(FOLLOW_path_declaration_in_statement3109);
                    path=path_declaration();

                    state._fsp--;
                    if (state.failed) return ident;

                    if ( state.backtracking==0 ) {ident = new Identifier(path.getId(), path.getName() ,"path");}

                    }
                    break;
                case 5 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:903:14: v= var_declaration
                    {
                    pushFollow(FOLLOW_var_declaration_in_statement3130);
                    v=var_declaration();

                    state._fsp--;
                    if (state.failed) return ident;

                    if ( state.backtracking==0 ) {ident = new Identifier("",v,"var");}

                    }
                    break;
                case 6 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:904:14: a= assgn_expression
                    {
                    pushFollow(FOLLOW_assgn_expression_in_statement3151);
                    a=assgn_expression();

                    state._fsp--;
                    if (state.failed) return ident;

                    if ( state.backtracking==0 ) {ident = new Identifier("",a,"assgn_expression");}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ident;
    }
    // $ANTLR end "statement"



    // $ANTLR start "statement_list"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:907:1: statement_list returns [String myBSL2] : (b2= statement b2list= statement_list |);
    public final String statement_list() throws RecognitionException {
        String myBSL2 = null;


        Identifier b2 =null;

        String b2list =null;


        /*ArrayList<Point> points = new ArrayList<Point>(); ArrayList<String> paths = new ArrayList<String>();*/
        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:909:23: (b2= statement b2list= statement_list |)
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ASSIGN||LA22_0==BOOLEAN||(LA22_0 >= IF && LA22_0 <= INT)||LA22_0==PATH||LA22_0==POINT||LA22_0==WHILE) ) {
                alt22=1;
            }
            else if ( (LA22_0==EOF||LA22_0==UP||LA22_0==ELSE) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return myBSL2;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:909:26: b2= statement b2list= statement_list
                    {
                    pushFollow(FOLLOW_statement_in_statement_list3205);
                    b2=statement();

                    state._fsp--;
                    if (state.failed) return myBSL2;

                    pushFollow(FOLLOW_statement_list_in_statement_list3209);
                    b2list=statement_list();

                    state._fsp--;
                    if (state.failed) return myBSL2;

                    if ( state.backtracking==0 ) {
                                              
                                              if (b2list==null){
                                                    ArrayList<String> paths = new ArrayList<String>();
                                                    if (b2.getType().equals("path")){
                                                      paths.add(b2.getName());
                    //                                  myBSL2 = new BSL2Node("\t\t" + (String)b2.getValue(), paths);
                                                      myBSL2 = "\t\t" + (String)b2.getValue();
                                                    }
                                                    else if(b2.getType().equals("point")){
                    //                                  myBSL2 = new BSL2Node("\t\t" + (String)b2.getValue(), paths);
                                                      myBSL2 = "\t\t" + (String)b2.getValue();
                                                    }
                                                    else if(b2.getType().equals("var")){
                    //                                  myBSL2 = new BSL2Node("\t\t" + (String)b2.getValue(), paths);
                                                      myBSL2 = "\t\t" + (String)b2.getValue();
                                                    }
                                                    else if(b2.getType().equals("board_statement")){
                    //                                  myBSL2 = new BSL2Node("\t\t" + (String)b2.getValue(), paths);
                                                      myBSL2 = "\t\t" + (String)b2.getValue();
                                                    }
                                                    else if(b2.getType().equals("assgn_expression")){
                                                        myBSL2 = "\t\t" + (String)b2.getValue();
                                                    }
                                                    else{
                                                      throw new Exception("Type is not path or point. Error.");
                                                      					 
                                                      
                                                    }
                                               }
                                               else{ //list is not null
                                                    if (b2.getType().equals("path")){
                    //                                    ArrayList<String> paths = b2list.getPathIDs();
                    //                                    paths.add(b2.getName());
                    //                                    myBSL2 = new BSL2Node("\t\t" + (String)b2.getValue() + b2list.getString(), paths);
                                                        myBSL2 = "\t\t" + (String)b2.getValue() + b2list;
                                                    }
                                                    else if(b2.getType().equals("point")){
                    //                                    myBSL2 = new BSL2Node("\t\t" + (String)b2.getValue() + b2list.getString(), b2list.getPathIDs());
                                                        myBSL2 = "\t\t" + (String)b2.getValue() + b2list;

                                                    }
                                                    else if(b2.getType().equals("var")){
                    //                                    myBSL2 = new BSL2Node("\t\t" + (String)b2.getValue() + b2list.getString(), b2list.getPathIDs());
                                                        myBSL2 = "\t\t" + (String)b2.getValue() + b2list;
                                                    }
                                                    else if(b2.getType().equals("board_statement")){
                    //                                    myBSL2 = new BSL2Node("\t\t" + (String)b2.getValue() + b2list.getString(), b2list.getPathIDs());
                                                        myBSL2 = "\t\t" + (String)b2.getValue() + b2list;
                                                    }
                                                    else if(b2.getType().equals("assgn_expression")){
                                                        myBSL2 = "\t\t" + (String)b2.getValue() + b2list;
                                                    }
                                                    else{
                                                       throw new Exception("Type is not path or point. Error."); 
                                                       					 
                                                       
                                                    }
                                                    
                                               }
                                               
                                              }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:972:35: 
                    {
                    if ( state.backtracking==0 ) {myBSL2 ="";}

                    }
                    break;

            }
        }
        catch (Exception error) {

            		System.out.println( error.getMessage());
            			System.exit(1);
            		
        }

        finally {
        	// do for sure before leaving
        }
        return myBSL2;
    }
    // $ANTLR end "statement_list"



    // $ANTLR start "board_iteration_stmt"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:980:1: board_iteration_stmt returns [String str] : ^( WHILE e= expression b= board_statement_list2 ) ;
    public final String board_iteration_stmt() throws RecognitionException {
        String str = null;


        ExpressionNode e =null;

        String b =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:980:43: ( ^( WHILE e= expression b= board_statement_list2 ) )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:980:45: ^( WHILE e= expression b= board_statement_list2 )
            {
            match(input,WHILE,FOLLOW_WHILE_in_board_iteration_stmt3337); if (state.failed) return str;

            match(input, Token.DOWN, null); if (state.failed) return str;
            pushFollow(FOLLOW_expression_in_board_iteration_stmt3341);
            e=expression();

            state._fsp--;
            if (state.failed) return str;

            pushFollow(FOLLOW_board_statement_list2_in_board_iteration_stmt3345);
            b=board_statement_list2();

            state._fsp--;
            if (state.failed) return str;

            match(input, Token.UP, null); if (state.failed) return str;


            if ( state.backtracking==0 ) {
                    if(e.getReturnType().equals("boolean") || e.getType().equals("boolean")) {

                      str = "while(" + e.getCode() + "){" + b + "}";
            //          throw new Exception("`````````````````" + b);
                    }
                      
                    else{
                      throw new Exception("Invalid type in while loop. Expected a boolean but received a(n) " + e.getReturnType());
                      					 
                      }
              }

            }

        }
        catch (Exception error) {

            		System.out.println( error.getMessage());
            			 System.exit(1);
            		
        }

        finally {
        	// do for sure before leaving
        }
        return str;
    }
    // $ANTLR end "board_iteration_stmt"



    // $ANTLR start "board_selection_stmt"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1000:1: board_selection_stmt returns [String str] : ^( IF e= expression b= board_statement_list2 b2= board_selection_else_stmt ) ;
    public final String board_selection_stmt() throws RecognitionException {
        String str = null;


        ExpressionNode e =null;

        String b =null;

        String b2 =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1001:22: ( ^( IF e= expression b= board_statement_list2 b2= board_selection_else_stmt ) )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1002:22: ^( IF e= expression b= board_statement_list2 b2= board_selection_else_stmt )
            {
            match(input,IF,FOLLOW_IF_in_board_selection_stmt3471); if (state.failed) return str;

            match(input, Token.DOWN, null); if (state.failed) return str;
            pushFollow(FOLLOW_expression_in_board_selection_stmt3475);
            e=expression();

            state._fsp--;
            if (state.failed) return str;

            pushFollow(FOLLOW_board_statement_list2_in_board_selection_stmt3479);
            b=board_statement_list2();

            state._fsp--;
            if (state.failed) return str;

            pushFollow(FOLLOW_board_selection_else_stmt_in_board_selection_stmt3483);
            b2=board_selection_else_stmt();

            state._fsp--;
            if (state.failed) return str;

            match(input, Token.UP, null); if (state.failed) return str;


            if ( state.backtracking==0 ) {
                                  if(e.getReturnType().equals("boolean")|| e.getType().equals("boolean")) {
                                  str = "if(" + e.getCode() + "){" + b + "} " + b2 ;
                                  }
                                  else{
                      throw new Exception("Invalid type in conditional statement. Expected a boolean but received a(n) " + e.getReturnType());
                      					 
                      }
                                  }

            }

        }
        catch (Exception error) {

            		System.out.println(error.getMessage());
            			System.exit(1);
            		
        }

        finally {
        	// do for sure before leaving
        }
        return str;
    }
    // $ANTLR end "board_selection_stmt"



    // $ANTLR start "board_selection_else_stmt"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1020:1: board_selection_else_stmt returns [String str] : ( ^( ELSE b= board_statement_list2 ) |);
    public final String board_selection_else_stmt() throws RecognitionException {
        String str = null;


        String b =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1020:48: ( ^( ELSE b= board_statement_list2 ) |)
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ELSE) ) {
                alt23=1;
            }
            else if ( (LA23_0==UP) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return str;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1021:27: ^( ELSE b= board_statement_list2 )
                    {
                    match(input,ELSE,FOLLOW_ELSE_in_board_selection_else_stmt3623); if (state.failed) return str;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return str;
                        pushFollow(FOLLOW_board_statement_list2_in_board_selection_else_stmt3627);
                        b=board_statement_list2();

                        state._fsp--;
                        if (state.failed) return str;

                        match(input, Token.UP, null); if (state.failed) return str;
                    }


                    if ( state.backtracking==0 ) { 
                                                str= "else{" + b + "}";
                                              }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1025:38: 
                    {
                    if ( state.backtracking==0 ) {str = "";}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return str;
    }
    // $ANTLR end "board_selection_else_stmt"



    // $ANTLR start "iteration_stmt"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1029:1: iteration_stmt returns [String str] : ^( WHILE e= expression b= statement_list ) ;
    public final String iteration_stmt() throws RecognitionException {
        String str = null;


        ExpressionNode e =null;

        String b =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1029:37: ( ^( WHILE e= expression b= statement_list ) )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1029:39: ^( WHILE e= expression b= statement_list )
            {
            match(input,WHILE,FOLLOW_WHILE_in_iteration_stmt3788); if (state.failed) return str;

            match(input, Token.DOWN, null); if (state.failed) return str;
            pushFollow(FOLLOW_expression_in_iteration_stmt3792);
            e=expression();

            state._fsp--;
            if (state.failed) return str;

            pushFollow(FOLLOW_statement_list_in_iteration_stmt3796);
            b=statement_list();

            state._fsp--;
            if (state.failed) return str;

            match(input, Token.UP, null); if (state.failed) return str;


            if ( state.backtracking==0 ) {
                    if(e.getReturnType().equals("boolean") || e.getType().equals("boolean")) {

                      str = "while(" + e.getCode() + "){" + b + "}";
            //          System.out.println("`````````````````" + b);
                    }
                      
                    else{
                      throw new Exception("Invalid type in while loop. Expected a boolean but received a(n) " + e.getReturnType());
                      					 
                      }
              }

            }

        }
        catch (Exception error) {

            		System.out.println(error.getMessage());
            			System.exit(1);
            		
        }

        finally {
        	// do for sure before leaving
        }
        return str;
    }
    // $ANTLR end "iteration_stmt"



    // $ANTLR start "selection_stmt"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1050:1: selection_stmt returns [String str] : ^( IF e= expression b= statement_list b2= selection_else_stmt ) ;
    public final String selection_stmt() throws RecognitionException {
        String str = null;


        ExpressionNode e =null;

        String b =null;

        String b2 =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1051:22: ( ^( IF e= expression b= statement_list b2= selection_else_stmt ) )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1051:24: ^( IF e= expression b= statement_list b2= selection_else_stmt )
            {
            match(input,IF,FOLLOW_IF_in_selection_stmt3882); if (state.failed) return str;

            match(input, Token.DOWN, null); if (state.failed) return str;
            pushFollow(FOLLOW_expression_in_selection_stmt3888);
            e=expression();

            state._fsp--;
            if (state.failed) return str;

            pushFollow(FOLLOW_statement_list_in_selection_stmt3892);
            b=statement_list();

            state._fsp--;
            if (state.failed) return str;

            pushFollow(FOLLOW_selection_else_stmt_in_selection_stmt3896);
            b2=selection_else_stmt();

            state._fsp--;
            if (state.failed) return str;

            match(input, Token.UP, null); if (state.failed) return str;


            if ( state.backtracking==0 ) {
                                   if(e.getReturnType().equals("boolean") || e.getType().equals("boolean")) {
                                  
                                  str = "if(" + e.getCode() + "){\n" + b + "} " + b2 ;}}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return str;
    }
    // $ANTLR end "selection_stmt"



    // $ANTLR start "selection_else_stmt"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1059:1: selection_else_stmt returns [String str] : ( ^( ELSE b= statement_list ) |);
    public final String selection_else_stmt() throws RecognitionException {
        String str = null;


        String b =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1060:27: ( ^( ELSE b= statement_list ) |)
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ELSE) ) {
                alt24=1;
            }
            else if ( (LA24_0==UP) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return str;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1060:29: ^( ELSE b= statement_list )
                    {
                    match(input,ELSE,FOLLOW_ELSE_in_selection_else_stmt4021); if (state.failed) return str;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return str;
                        pushFollow(FOLLOW_statement_list_in_selection_else_stmt4025);
                        b=statement_list();

                        state._fsp--;
                        if (state.failed) return str;

                        match(input, Token.UP, null); if (state.failed) return str;
                    }


                    if ( state.backtracking==0 ) { str= "else{" + b + "}";}

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1061:38: 
                    {
                    if ( state.backtracking==0 ) {str = "";}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return str;
    }
    // $ANTLR end "selection_else_stmt"



    // $ANTLR start "start_declaration"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1066:1: start_declaration returns [String myPoint] : START c3= CONST c4= CONST ;
    public final String start_declaration() throws RecognitionException {
        String myPoint = null;


        CommonTree c3=null;
        CommonTree c4=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1067:5: ( START c3= CONST c4= CONST )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1067:7: START c3= CONST c4= CONST
            {
            match(input,START,FOLLOW_START_in_start_declaration4109); if (state.failed) return myPoint;

            c3=(CommonTree)match(input,CONST,FOLLOW_CONST_in_start_declaration4113); if (state.failed) return myPoint;

            c4=(CommonTree)match(input,CONST,FOLLOW_CONST_in_start_declaration4117); if (state.failed) return myPoint;

            if ( state.backtracking==0 ) {
                  myPoint = "new Point(" + (c3!=null?c3.getText():null) + ", " + (c4!=null?c4.getText():null) + ")";
                }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return myPoint;
    }
    // $ANTLR end "start_declaration"



    // $ANTLR start "end_declaration"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1072:1: end_declaration returns [String myPoint] : END c5= CONST c6= CONST ;
    public final String end_declaration() throws RecognitionException {
        String myPoint = null;


        CommonTree c5=null;
        CommonTree c6=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1073:3: ( END c5= CONST c6= CONST )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1073:5: END c5= CONST c6= CONST
            {
            match(input,END,FOLLOW_END_in_end_declaration4149); if (state.failed) return myPoint;

            c5=(CommonTree)match(input,CONST,FOLLOW_CONST_in_end_declaration4153); if (state.failed) return myPoint;

            c6=(CommonTree)match(input,CONST,FOLLOW_CONST_in_end_declaration4157); if (state.failed) return myPoint;

            if ( state.backtracking==0 ) {
              myPoint = "new Point(" + (c5!=null?c5.getText():null) + ", " + (c6!=null?c6.getText():null) + ")";
              }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return myPoint;
    }
    // $ANTLR end "end_declaration"



    // $ANTLR start "function_declaration"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1079:2: function_declaration returns [String r] : ( FUNC INT ID p= parameters bs2= board_statement_list2 j= jump_stmt | FUNC BOOLEAN ID p= parameters bs2= board_statement_list2 j= jump_stmt | FUNC POINT ID p= parameters bs2= board_statement_list2 j= jump_stmt | FUNC ID p= parameters bs2= board_statement_list2 );
    public final String function_declaration() throws RecognitionException {
        String r = null;


        CommonTree ID12=null;
        CommonTree ID13=null;
        CommonTree ID14=null;
        CommonTree ID15=null;
        String p =null;

        String bs2 =null;

        String j =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1081:6: ( FUNC INT ID p= parameters bs2= board_statement_list2 j= jump_stmt | FUNC BOOLEAN ID p= parameters bs2= board_statement_list2 j= jump_stmt | FUNC POINT ID p= parameters bs2= board_statement_list2 j= jump_stmt | FUNC ID p= parameters bs2= board_statement_list2 )
            int alt25=4;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==FUNC) ) {
                switch ( input.LA(2) ) {
                case INT:
                    {
                    alt25=1;
                    }
                    break;
                case BOOLEAN:
                    {
                    alt25=2;
                    }
                    break;
                case POINT:
                    {
                    alt25=3;
                    }
                    break;
                case ID:
                    {
                    alt25=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return r;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;

                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1081:8: FUNC INT ID p= parameters bs2= board_statement_list2 j= jump_stmt
                    {
                    match(input,FUNC,FOLLOW_FUNC_in_function_declaration4205); if (state.failed) return r;

                    match(input,INT,FOLLOW_INT_in_function_declaration4207); if (state.failed) return r;

                    ID12=(CommonTree)match(input,ID,FOLLOW_ID_in_function_declaration4209); if (state.failed) return r;

                    pushFollow(FOLLOW_parameters_in_function_declaration4213);
                    p=parameters();

                    state._fsp--;
                    if (state.failed) return r;

                    pushFollow(FOLLOW_board_statement_list2_in_function_declaration4217);
                    bs2=board_statement_list2();

                    state._fsp--;
                    if (state.failed) return r;

                    pushFollow(FOLLOW_jump_stmt_in_function_declaration4221);
                    j=jump_stmt();

                    state._fsp--;
                    if (state.failed) return r;

                    if ( state.backtracking==0 ) {
                     			

                     				r =  "	public static int " + (ID12!=null?ID12.getText():null) +  p + "{" + '\n' +
                     							  bs2 + '\n' +
                     								 "\t\t"+ j + '\n'+

                     								"}";	
                     				variables.put((ID12!=null?ID12.getText():null), new Identifier((ID12!=null?ID12.getText():null), new FunctionNode("", "int", (ID12!=null?ID12.getText():null)), "function"));
                     				function_list.add(r);
                     				
                     				}

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1093:12: FUNC BOOLEAN ID p= parameters bs2= board_statement_list2 j= jump_stmt
                    {
                    match(input,FUNC,FOLLOW_FUNC_in_function_declaration4236); if (state.failed) return r;

                    match(input,BOOLEAN,FOLLOW_BOOLEAN_in_function_declaration4238); if (state.failed) return r;

                    ID13=(CommonTree)match(input,ID,FOLLOW_ID_in_function_declaration4240); if (state.failed) return r;

                    pushFollow(FOLLOW_parameters_in_function_declaration4244);
                    p=parameters();

                    state._fsp--;
                    if (state.failed) return r;

                    pushFollow(FOLLOW_board_statement_list2_in_function_declaration4248);
                    bs2=board_statement_list2();

                    state._fsp--;
                    if (state.failed) return r;

                    pushFollow(FOLLOW_jump_stmt_in_function_declaration4252);
                    j=jump_stmt();

                    state._fsp--;
                    if (state.failed) return r;

                    if ( state.backtracking==0 ) {
                             r =  "	public static boolean " + (ID13!=null?ID13.getText():null)  + p +"{" + '\n' +
                     								" 	"+ bs2 + '\n' +
                     								"		" + j + '\n' +
                     								"}";	
                     				 variables.put((ID13!=null?ID13.getText():null), new Identifier((ID13!=null?ID13.getText():null), new FunctionNode("", "boolean", (ID13!=null?ID13.getText():null)), "function"));
                     				 function_list.add(r);
                     				
                     				}

                    }
                    break;
                case 3 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1102:12: FUNC POINT ID p= parameters bs2= board_statement_list2 j= jump_stmt
                    {
                    match(input,FUNC,FOLLOW_FUNC_in_function_declaration4267); if (state.failed) return r;

                    match(input,POINT,FOLLOW_POINT_in_function_declaration4269); if (state.failed) return r;

                    ID14=(CommonTree)match(input,ID,FOLLOW_ID_in_function_declaration4271); if (state.failed) return r;

                    pushFollow(FOLLOW_parameters_in_function_declaration4275);
                    p=parameters();

                    state._fsp--;
                    if (state.failed) return r;

                    pushFollow(FOLLOW_board_statement_list2_in_function_declaration4279);
                    bs2=board_statement_list2();

                    state._fsp--;
                    if (state.failed) return r;

                    pushFollow(FOLLOW_jump_stmt_in_function_declaration4283);
                    j=jump_stmt();

                    state._fsp--;
                    if (state.failed) return r;

                    if ( state.backtracking==0 ) {
                             r =  "	public static Point " + (ID14!=null?ID14.getText():null) + p + "{" + '\n' +
                     								" 	"+ bs2 + '\n' +
                     								"		" + j + '\n'+
                     								"}";	
                            variables.put((ID14!=null?ID14.getText():null), new Identifier((ID14!=null?ID14.getText():null), new FunctionNode("", "point",(ID14!=null?ID14.getText():null)), "function")); 
                     				function_list.add(r);
                             }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1110:12: FUNC ID p= parameters bs2= board_statement_list2
                    {
                    match(input,FUNC,FOLLOW_FUNC_in_function_declaration4298); if (state.failed) return r;

                    ID15=(CommonTree)match(input,ID,FOLLOW_ID_in_function_declaration4300); if (state.failed) return r;

                    pushFollow(FOLLOW_parameters_in_function_declaration4304);
                    p=parameters();

                    state._fsp--;
                    if (state.failed) return r;

                    pushFollow(FOLLOW_board_statement_list2_in_function_declaration4308);
                    bs2=board_statement_list2();

                    state._fsp--;
                    if (state.failed) return r;

                    if ( state.backtracking==0 ) {
                     				
                             r =  "	public static void " + (ID15!=null?ID15.getText():null) + p + "{" + '\n' +

                     								" 	"+ bs2 + '\n' +
                     								"}";	
                     				variables.put((ID15!=null?ID15.getText():null), new Identifier((ID15!=null?ID15.getText():null), new FunctionNode("", "void", (ID15!=null?ID15.getText():null)), "function"));
                     				function_list.add(r);
                     				}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return r;
    }
    // $ANTLR end "function_declaration"



    // $ANTLR start "parameters"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1121:1: parameters returns [String str] : ( (b= var_declaration_unassigned (c= var_declaration_unassigned )* ) |);
    public final String parameters() throws RecognitionException {
        String str = null;


        String b =null;

        String c =null;


         ArrayList<String> vars = new ArrayList<String>();
        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1122:59: ( (b= var_declaration_unassigned (c= var_declaration_unassigned )* ) |)
            int alt27=2;
            switch ( input.LA(1) ) {
            case INT:
                {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==ID) ) {
                    int LA27_4 = input.LA(3);

                    if ( (synpred65_EvaluatorWalker()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return str;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 4, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return str;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;

                }
                }
                break;
            case BOOLEAN:
                {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==ID) ) {
                    int LA27_5 = input.LA(3);

                    if ( (synpred65_EvaluatorWalker()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return str;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 5, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return str;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;

                }
                }
                break;
            case EOF:
            case ASSIGN:
            case BOARD:
            case FUNC:
            case ID:
            case IF:
            case MAIN:
            case PATH:
            case POINT:
            case PRINT:
            case RETURN:
            case SET:
            case STRUCTURE:
            case WHILE:
                {
                alt27=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return str;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1122:61: (b= var_declaration_unassigned (c= var_declaration_unassigned )* )
                    {
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1122:61: (b= var_declaration_unassigned (c= var_declaration_unassigned )* )
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1122:63: b= var_declaration_unassigned (c= var_declaration_unassigned )*
                    {
                    pushFollow(FOLLOW_var_declaration_unassigned_in_parameters4333);
                    b=var_declaration_unassigned();

                    state._fsp--;
                    if (state.failed) return str;

                    if ( state.backtracking==0 ) {vars.add(b);}

                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1122:107: (c= var_declaration_unassigned )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==INT) ) {
                            int LA26_2 = input.LA(2);

                            if ( (LA26_2==ID) ) {
                                int LA26_4 = input.LA(3);

                                if ( (synpred64_EvaluatorWalker()) ) {
                                    alt26=1;
                                }


                            }


                        }
                        else if ( (LA26_0==BOOLEAN) ) {
                            int LA26_3 = input.LA(2);

                            if ( (LA26_3==ID) ) {
                                int LA26_5 = input.LA(3);

                                if ( (synpred64_EvaluatorWalker()) ) {
                                    alt26=1;
                                }


                            }


                        }


                        switch (alt26) {
                    	case 1 :
                    	    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1122:109: c= var_declaration_unassigned
                    	    {
                    	    pushFollow(FOLLOW_var_declaration_unassigned_in_parameters4341);
                    	    c=var_declaration_unassigned();

                    	    state._fsp--;
                    	    if (state.failed) return str;

                    	    if ( state.backtracking==0 ) {vars.add(c);}

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }


                    if ( state.backtracking==0 ) {
                        str = "(";
                        if(vars.size()!=0)
                        {
                          for(int x = 0; x < vars.size(); x++)
                          {
                             if(x==0)
                             {
                                  str+=vars.get(x);
                             }
                             else
                             {
                                  str+= "," + vars.get(x);
                             }
                          }
                        }
                        str += ")"; 
                        vars = new ArrayList<String>(); }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1141:18: 
                    {
                    if ( state.backtracking==0 ) {str = "()";}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return str;
    }
    // $ANTLR end "parameters"



    // $ANTLR start "var_declaration_unassigned"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1145:2: var_declaration_unassigned returns [String code] : ( INT d= ID | BOOLEAN e= ID );
    public final String var_declaration_unassigned() throws RecognitionException {
        String code = null;


        CommonTree d=null;
        CommonTree e=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1145:51: ( INT d= ID | BOOLEAN e= ID )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==INT) ) {
                alt28=1;
            }
            else if ( (LA28_0==BOOLEAN) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return code;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1145:53: INT d= ID
                    {
                    match(input,INT,FOLLOW_INT_in_var_declaration_unassigned4374); if (state.failed) return code;

                    d=(CommonTree)match(input,ID,FOLLOW_ID_in_var_declaration_unassigned4378); if (state.failed) return code;

                    if ( state.backtracking==0 ) { code = "int " + (d!=null?d.getText():null) + "";
                     																																variables.put((d!=null?d.getText():null), new Identifier((d!=null?d.getText():null), new ValueNode( 0, "int"), "int"));}

                    }
                    break;
                case 2 :
                    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1147:31: BOOLEAN e= ID
                    {
                    match(input,BOOLEAN,FOLLOW_BOOLEAN_in_var_declaration_unassigned4412); if (state.failed) return code;

                    e=(CommonTree)match(input,ID,FOLLOW_ID_in_var_declaration_unassigned4416); if (state.failed) return code;

                    if ( state.backtracking==0 ) {code = "boolean " + (e!=null?e.getText():null) + "";
                                                variables.put((e!=null?e.getText():null), new Identifier((e!=null?e.getText():null), new ValueNode(Boolean.valueOf(false), "boolean"), "boolean"));
                                                
                                                }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return code;
    }
    // $ANTLR end "var_declaration_unassigned"



    // $ANTLR start "jump_stmt"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1158:1: jump_stmt returns [String code] : RETURN d= expression ;
    public final String jump_stmt() throws RecognitionException {
        String code = null;


        ExpressionNode d =null;


        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1158:33: ( RETURN d= expression )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1158:35: RETURN d= expression
            {
            match(input,RETURN,FOLLOW_RETURN_in_jump_stmt4468); if (state.failed) return code;

            pushFollow(FOLLOW_expression_in_jump_stmt4473);
            d=expression();

            state._fsp--;
            if (state.failed) return code;

            if ( state.backtracking==0 ) {
              if (d.getType().equals("function") && variables.containsKey(((FunctionNode)d).Identifier)){
                  code = "return " + ((FunctionNode)d).Identifier + ";";}
              else{
              code = "return " + d.getCode() + ";";}}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return code;
    }
    // $ANTLR end "jump_stmt"



    // $ANTLR start "print_stmt"
    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1166:1: print_stmt returns [String str] : PRINT STRING ;
    public final String print_stmt() throws RecognitionException {
        String str = null;


        CommonTree STRING16=null;

        try {
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1167:11: ( PRINT STRING )
            // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1167:13: PRINT STRING
            {
            match(input,PRINT,FOLLOW_PRINT_in_print_stmt4508); if (state.failed) return str;

            STRING16=(CommonTree)match(input,STRING,FOLLOW_STRING_in_print_stmt4510); if (state.failed) return str;

            if ( state.backtracking==0 ) {
                      if((STRING16!=null?STRING16.getText():null) == null){
                        str = "System.out.println();";
                      }
                      else{
                        str = "System.out.println("+(STRING16!=null?STRING16.getText():null)+");";
                      }
                     }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return str;
    }
    // $ANTLR end "print_stmt"

    // $ANTLR start synpred5_EvaluatorWalker
    public final void synpred5_EvaluatorWalker_fragment() throws RecognitionException {
        ExpressionNode e1 =null;

        ExpressionNode e2 =null;


        // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:111:2: ( POINT ID e1= expression e2= expression )
        // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:111:2: POINT ID e1= expression e2= expression
        {
        match(input,POINT,FOLLOW_POINT_in_synpred5_EvaluatorWalker248); if (state.failed) return ;

        match(input,ID,FOLLOW_ID_in_synpred5_EvaluatorWalker250); if (state.failed) return ;

        pushFollow(FOLLOW_expression_in_synpred5_EvaluatorWalker254);
        e1=expression();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_expression_in_synpred5_EvaluatorWalker258);
        e2=expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_EvaluatorWalker

    // $ANTLR start synpred6_EvaluatorWalker
    public final void synpred6_EvaluatorWalker_fragment() throws RecognitionException {
        CommonTree i1=null;
        ExpressionNode i2 =null;

        String d =null;

        ExpressionNode e =null;


        // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:140:3: ( PATH i1= ID i2= term d= direction e= expression )
        // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:140:3: PATH i1= ID i2= term d= direction e= expression
        {
        match(input,PATH,FOLLOW_PATH_in_synpred6_EvaluatorWalker381); if (state.failed) return ;

        i1=(CommonTree)match(input,ID,FOLLOW_ID_in_synpred6_EvaluatorWalker385); if (state.failed) return ;

        pushFollow(FOLLOW_term_in_synpred6_EvaluatorWalker389);
        i2=term();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_direction_in_synpred6_EvaluatorWalker393);
        d=direction();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_expression_in_synpred6_EvaluatorWalker397);
        e=expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_EvaluatorWalker

    // $ANTLR start synpred28_EvaluatorWalker
    public final void synpred28_EvaluatorWalker_fragment() throws RecognitionException {
        ExpressionNode f =null;


        // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:501:6: (f= function_call )
        // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:501:6: f= function_call
        {
        pushFollow(FOLLOW_function_call_in_synpred28_EvaluatorWalker1153);
        f=function_call();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred28_EvaluatorWalker

    // $ANTLR start synpred31_EvaluatorWalker
    public final void synpred31_EvaluatorWalker_fragment() throws RecognitionException {
        // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:504:6: ( ID )
        // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:504:6: ID
        {
        match(input,ID,FOLLOW_ID_in_synpred31_EvaluatorWalker1190); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred31_EvaluatorWalker

    // $ANTLR start synpred34_EvaluatorWalker
    public final void synpred34_EvaluatorWalker_fragment() throws RecognitionException {
        Identifier b2 =null;

        String b2list =null;


        // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:659:26: (b2= board_statement_2 b2list= board_statement_list2 )
        // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:659:26: b2= board_statement_2 b2list= board_statement_list2
        {
        pushFollow(FOLLOW_board_statement_2_in_synpred34_EvaluatorWalker1500);
        b2=board_statement_2();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_board_statement_list2_in_synpred34_EvaluatorWalker1504);
        b2list=board_statement_list2();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred34_EvaluatorWalker

    // $ANTLR start synpred39_EvaluatorWalker
    public final void synpred39_EvaluatorWalker_fragment() throws RecognitionException {
        Identifier b2 =null;

        String b2list =null;


        // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:718:19: (b2= structure_statement b2list= structure_body )
        // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:718:19: b2= structure_statement b2list= structure_body
        {
        pushFollow(FOLLOW_structure_statement_in_synpred39_EvaluatorWalker1932);
        b2=structure_statement();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_structure_body_in_synpred39_EvaluatorWalker1936);
        b2list=structure_body();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred39_EvaluatorWalker

    // $ANTLR start synpred64_EvaluatorWalker
    public final void synpred64_EvaluatorWalker_fragment() throws RecognitionException {
        String c =null;


        // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1122:109: (c= var_declaration_unassigned )
        // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1122:109: c= var_declaration_unassigned
        {
        pushFollow(FOLLOW_var_declaration_unassigned_in_synpred64_EvaluatorWalker4341);
        c=var_declaration_unassigned();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred64_EvaluatorWalker

    // $ANTLR start synpred65_EvaluatorWalker
    public final void synpred65_EvaluatorWalker_fragment() throws RecognitionException {
        String b =null;

        String c =null;


        // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1122:61: ( (b= var_declaration_unassigned (c= var_declaration_unassigned )* ) )
        // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1122:61: (b= var_declaration_unassigned (c= var_declaration_unassigned )* )
        {
        // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1122:61: (b= var_declaration_unassigned (c= var_declaration_unassigned )* )
        // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1122:63: b= var_declaration_unassigned (c= var_declaration_unassigned )*
        {
        pushFollow(FOLLOW_var_declaration_unassigned_in_synpred65_EvaluatorWalker4333);
        b=var_declaration_unassigned();

        state._fsp--;
        if (state.failed) return ;

        // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1122:107: (c= var_declaration_unassigned )*
        loop29:
        do {
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==BOOLEAN||LA29_0==INT) ) {
                alt29=1;
            }


            switch (alt29) {
        	case 1 :
        	    // C:\\Users\\Frederic\\Documents\\amaze\\amaze_final\\src\\EvaluatorWalker.g:1122:109: c= var_declaration_unassigned
        	    {
        	    pushFollow(FOLLOW_var_declaration_unassigned_in_synpred65_EvaluatorWalker4341);
        	    c=var_declaration_unassigned();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop29;
            }
        } while (true);


        }


        }

    }
    // $ANTLR end synpred65_EvaluatorWalker

    // Delegated rules

    public final boolean synpred5_EvaluatorWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_EvaluatorWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred64_EvaluatorWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_EvaluatorWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_EvaluatorWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_EvaluatorWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_EvaluatorWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_EvaluatorWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_EvaluatorWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_EvaluatorWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_EvaluatorWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_EvaluatorWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_EvaluatorWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_EvaluatorWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_EvaluatorWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_EvaluatorWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_declaration_list_in_maze80 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_main_declaration_in_maze89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_declaration_list127 = new BitSet(new long[]{0x00000800004200E0L});
    public static final BitSet FOLLOW_declaration_list_in_declaration_list131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_board_declaration_in_declaration166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_declaration_in_declaration186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_declaration_in_declaration205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_structure_declaration_in_declaration226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POINT_in_point_declaration248 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_point_declaration250 = new BitSet(new long[]{0x00023002FB1D0E10L});
    public static final BitSet FOLLOW_expression_in_point_declaration254 = new BitSet(new long[]{0x00023002FB1D0E10L});
    public static final BitSet FOLLOW_expression_in_point_declaration258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POINT_in_point_declaration304 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_point_declaration306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PATH_in_path_declaration381 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_path_declaration385 = new BitSet(new long[]{0x0002200000110200L});
    public static final BitSet FOLLOW_term_in_path_declaration389 = new BitSet(new long[]{0x0000404000802000L});
    public static final BitSet FOLLOW_direction_in_path_declaration393 = new BitSet(new long[]{0x00023002FB1D0E10L});
    public static final BitSet FOLLOW_expression_in_path_declaration397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PATH_in_path_declaration442 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_path_declaration444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_in_direction492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RIGHT_in_direction508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPP_in_direction524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DWN_in_direction540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_declaration_in_var_declaration580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_declaration_in_var_declaration590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function_call622 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_function_call625 = new BitSet(new long[]{0x00063002FB1D0E10L});
    public static final BitSet FOLLOW_expression_list_in_function_call629 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_function_call631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_list706 = new BitSet(new long[]{0x00023002FB1D0E10L});
    public static final BitSet FOLLOW_expression_list_in_expression_list711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_bool_declaration767 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_bool_declaration771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_bool_declaration783 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BOOLEAN_in_bool_declaration785 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_bool_declaration789 = new BitSet(new long[]{0x00023002FB1D0E10L});
    public static final BitSet FOLLOW_expression_in_bool_declaration793 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INT_in_int_declaration821 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_int_declaration825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_int_declaration835 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_int_declaration837 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_int_declaration841 = new BitSet(new long[]{0x00023002FB1D0E10L});
    public static final BitSet FOLLOW_expression_in_int_declaration845 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expression881 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression885 = new BitSet(new long[]{0x00023002FB1D0E10L});
    public static final BitSet FOLLOW_expression_in_expression889 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expression903 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression907 = new BitSet(new long[]{0x00023002FB1D0E10L});
    public static final BitSet FOLLOW_expression_in_expression911 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMES_in_expression926 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression930 = new BitSet(new long[]{0x00023002FB1D0E10L});
    public static final BitSet FOLLOW_expression_in_expression934 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIVIDE_in_expression941 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression945 = new BitSet(new long[]{0x00023002FB1D0E10L});
    public static final BitSet FOLLOW_expression_in_expression949 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEGATIONS_in_expression957 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression961 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expression972 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression976 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GRTR_in_expression985 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression989 = new BitSet(new long[]{0x00023002FB1D0E10L});
    public static final BitSet FOLLOW_expression_in_expression993 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_in_expression1002 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1006 = new BitSet(new long[]{0x00023002FB1D0E10L});
    public static final BitSet FOLLOW_expression_in_expression1010 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GRTR_EQL_in_expression1019 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1023 = new BitSet(new long[]{0x00023002FB1D0E10L});
    public static final BitSet FOLLOW_expression_in_expression1027 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_EQL_in_expression1037 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1041 = new BitSet(new long[]{0x00023002FB1D0E10L});
    public static final BitSet FOLLOW_expression_in_expression1045 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DBL_EQLS_in_expression1055 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1059 = new BitSet(new long[]{0x00023002FB1D0E10L});
    public static final BitSet FOLLOW_expression_in_expression1063 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQLS_in_expression1072 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1076 = new BitSet(new long[]{0x00023002FB1D0E10L});
    public static final BitSet FOLLOW_expression_in_expression1080 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_expression1087 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1091 = new BitSet(new long[]{0x00023002FB1D0E10L});
    public static final BitSet FOLLOW_expression_in_expression1095 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_expression1105 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1109 = new BitSet(new long[]{0x00023002FB1D0E10L});
    public static final BitSet FOLLOW_expression_in_expression1113 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_term_in_expression1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_term1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_term1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_term1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_term1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_term1199 = new BitSet(new long[]{0x00023002FB1D0E10L});
    public static final BitSet FOLLOW_expression_in_term1203 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_term1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_term1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_assgn_expression1269 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_assgn_expression1271 = new BitSet(new long[]{0x00023002FB1D0E10L});
    public static final BitSet FOLLOW_expression_in_assgn_expression1275 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MAIN_in_main_declaration1302 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_main_declaration_list_in_main_declaration1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRAW_in_main_declaration_list1325 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_main_declaration_list1329 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_main_declaration_list_in_main_declaration_list1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOARD_in_board_declaration1384 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_board_declaration1386 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_board_declaration_list_in_board_declaration1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_size_declaration_in_board_declaration_list1441 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_start_declaration_in_board_declaration_list1445 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_end_declaration_in_board_declaration_list1449 = new BitSet(new long[]{0x0000808D007000A0L});
    public static final BitSet FOLLOW_board_statement_list2_in_board_declaration_list1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_board_statement_2_in_board_statement_list21500 = new BitSet(new long[]{0x0000808D007000A0L});
    public static final BitSet FOLLOW_board_statement_list2_in_board_statement_list21504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_structure_in_board_statement_21634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_point_declaration_in_board_statement_21659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_path_declaration_in_board_statement_21685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_declaration_in_board_statement_21710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_board_statement_in_board_statement_21746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_set_structure1812 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_set_structure1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRUCTURE_in_structure_declaration1844 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_structure_declaration1846 = new BitSet(new long[]{0x0000800D007000A0L});
    public static final BitSet FOLLOW_structure_body_in_structure_declaration1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_structure_statement_in_structure_body1932 = new BitSet(new long[]{0x0000800D007000A0L});
    public static final BitSet FOLLOW_structure_body_in_structure_body1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_structure_board_statement_in_structure_statement2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_point_declaration_in_structure_statement2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_path_declaration_in_structure_statement2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_declaration_in_structure_statement2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assgn_expression_in_structure_statement2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PATH_in_structure_path_declaration2197 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_structure_path_declaration2201 = new BitSet(new long[]{0x0002200000110200L});
    public static final BitSet FOLLOW_term_in_structure_path_declaration2205 = new BitSet(new long[]{0x0000404000802000L});
    public static final BitSet FOLLOW_direction_in_structure_path_declaration2209 = new BitSet(new long[]{0x00023002FB1D0E10L});
    public static final BitSet FOLLOW_expression_in_structure_path_declaration2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PATH_in_structure_path_declaration2258 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_structure_path_declaration2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_structure_iteration_stmt2299 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_structure_iteration_stmt2303 = new BitSet(new long[]{0x0000800D007000A8L});
    public static final BitSet FOLLOW_structure_body_in_structure_iteration_stmt2307 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_structure_selection_stmt2383 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_structure_selection_stmt2389 = new BitSet(new long[]{0x0000800D007040A8L});
    public static final BitSet FOLLOW_structure_body_in_structure_selection_stmt2393 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_structure_selection_else_stmt_in_structure_selection_stmt2397 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELSE_in_structure_selection_else_stmt2555 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_structure_body_in_structure_selection_else_stmt2559 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_structure_iteration_stmt_in_structure_board_statement2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_structure_selection_stmt_in_structure_board_statement2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_stmt_in_structure_board_statement2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_structure_board_statement2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZE_in_size_declaration2823 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_CONST_in_size_declaration2827 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_CONST_in_size_declaration2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_board_iteration_stmt_in_board_statement2886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_board_selection_stmt_in_board_statement2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_stmt_in_board_statement2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assgn_expression_in_board_statement2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_board_statement2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_stmt_in_statement3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_stmt_in_statement3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_point_declaration_in_statement3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_path_declaration_in_statement3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_declaration_in_statement3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assgn_expression_in_statement3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statement_list3205 = new BitSet(new long[]{0x00008005006000A0L});
    public static final BitSet FOLLOW_statement_list_in_statement_list3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_board_iteration_stmt3337 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_board_iteration_stmt3341 = new BitSet(new long[]{0x0000808D007000A8L});
    public static final BitSet FOLLOW_board_statement_list2_in_board_iteration_stmt3345 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_board_selection_stmt3471 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_board_selection_stmt3475 = new BitSet(new long[]{0x0000808D007040A8L});
    public static final BitSet FOLLOW_board_statement_list2_in_board_selection_stmt3479 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_board_selection_else_stmt_in_board_selection_stmt3483 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELSE_in_board_selection_else_stmt3623 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_board_statement_list2_in_board_selection_else_stmt3627 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_iteration_stmt3788 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_iteration_stmt3792 = new BitSet(new long[]{0x00008005006000A8L});
    public static final BitSet FOLLOW_statement_list_in_iteration_stmt3796 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_selection_stmt3882 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_selection_stmt3888 = new BitSet(new long[]{0x00008005006040A8L});
    public static final BitSet FOLLOW_statement_list_in_selection_stmt3892 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_selection_else_stmt_in_selection_stmt3896 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELSE_in_selection_else_stmt4021 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_list_in_selection_else_stmt4025 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_START_in_start_declaration4109 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_CONST_in_start_declaration4113 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_CONST_in_start_declaration4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_end_declaration4149 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_CONST_in_end_declaration4153 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_CONST_in_end_declaration4157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_function_declaration4205 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_INT_in_function_declaration4207 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_function_declaration4209 = new BitSet(new long[]{0x000080AD007000A0L});
    public static final BitSet FOLLOW_parameters_in_function_declaration4213 = new BitSet(new long[]{0x000080AD007000A0L});
    public static final BitSet FOLLOW_board_statement_list2_in_function_declaration4217 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_jump_stmt_in_function_declaration4221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_function_declaration4236 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BOOLEAN_in_function_declaration4238 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_function_declaration4240 = new BitSet(new long[]{0x000080AD007000A0L});
    public static final BitSet FOLLOW_parameters_in_function_declaration4244 = new BitSet(new long[]{0x000080AD007000A0L});
    public static final BitSet FOLLOW_board_statement_list2_in_function_declaration4248 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_jump_stmt_in_function_declaration4252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_function_declaration4267 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_POINT_in_function_declaration4269 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_function_declaration4271 = new BitSet(new long[]{0x000080AD007000A0L});
    public static final BitSet FOLLOW_parameters_in_function_declaration4275 = new BitSet(new long[]{0x000080AD007000A0L});
    public static final BitSet FOLLOW_board_statement_list2_in_function_declaration4279 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_jump_stmt_in_function_declaration4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_function_declaration4298 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_function_declaration4300 = new BitSet(new long[]{0x0000808D007000A0L});
    public static final BitSet FOLLOW_parameters_in_function_declaration4304 = new BitSet(new long[]{0x0000808D007000A0L});
    public static final BitSet FOLLOW_board_statement_list2_in_function_declaration4308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_declaration_unassigned_in_parameters4333 = new BitSet(new long[]{0x0000000000400082L});
    public static final BitSet FOLLOW_var_declaration_unassigned_in_parameters4341 = new BitSet(new long[]{0x0000000000400082L});
    public static final BitSet FOLLOW_INT_in_var_declaration_unassigned4374 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_var_declaration_unassigned4378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_var_declaration_unassigned4412 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_var_declaration_unassigned4416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_jump_stmt4468 = new BitSet(new long[]{0x00023002FB1D0E10L});
    public static final BitSet FOLLOW_expression_in_jump_stmt4473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print_stmt4508 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_STRING_in_print_stmt4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POINT_in_synpred5_EvaluatorWalker248 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_synpred5_EvaluatorWalker250 = new BitSet(new long[]{0x00023002FB1D0E10L});
    public static final BitSet FOLLOW_expression_in_synpred5_EvaluatorWalker254 = new BitSet(new long[]{0x00023002FB1D0E10L});
    public static final BitSet FOLLOW_expression_in_synpred5_EvaluatorWalker258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PATH_in_synpred6_EvaluatorWalker381 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_synpred6_EvaluatorWalker385 = new BitSet(new long[]{0x0002200000110200L});
    public static final BitSet FOLLOW_term_in_synpred6_EvaluatorWalker389 = new BitSet(new long[]{0x0000404000802000L});
    public static final BitSet FOLLOW_direction_in_synpred6_EvaluatorWalker393 = new BitSet(new long[]{0x00023002FB1D0E10L});
    public static final BitSet FOLLOW_expression_in_synpred6_EvaluatorWalker397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_synpred28_EvaluatorWalker1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred31_EvaluatorWalker1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_board_statement_2_in_synpred34_EvaluatorWalker1500 = new BitSet(new long[]{0x0000808D007000A0L});
    public static final BitSet FOLLOW_board_statement_list2_in_synpred34_EvaluatorWalker1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_structure_statement_in_synpred39_EvaluatorWalker1932 = new BitSet(new long[]{0x0000800D007000A0L});
    public static final BitSet FOLLOW_structure_body_in_synpred39_EvaluatorWalker1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_declaration_unassigned_in_synpred64_EvaluatorWalker4341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_declaration_unassigned_in_synpred65_EvaluatorWalker4333 = new BitSet(new long[]{0x0000000000400082L});
    public static final BitSet FOLLOW_var_declaration_unassigned_in_synpred65_EvaluatorWalker4341 = new BitSet(new long[]{0x0000000000400082L});

}