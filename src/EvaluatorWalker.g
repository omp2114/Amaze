
tree grammar EvaluatorWalker;

options {
	//k=1;
	backtrack = true;
  language = Java;
  tokenVocab = Amaze;
  ASTLabelType = CommonTree;
}

@header {
//  package compiler;
//  import compiler.*; 
  
  import java.util.HashMap;
  
  import java.util.ArrayList;
  import java.awt.Point;
//  import codeGeneration.fred.Board;
//  import codeGeneration.fred.Path;
//  import codeGeneration.fred.Structure;
  
  import java.io.FileWriter;
  import java.io.BufferedWriter;
 
}
 
@members {
  private HashMap<String, Object> variables2 = new HashMap<String, Object>();
  private HashMap<String, Identifier> variables = new HashMap<String, Identifier>();
	private ArrayList<String> function_list = new ArrayList<String>();
	private ArrayList<String> global_variables = new ArrayList<String>();
	
}


maze returns [String temp]
			:  d= declaration_list
			  m=main_declaration
       {
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

     ;

     
declaration_list returns [String r]

	: d1=declaration d2=declaration_list 
	    {if (d2==null){
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
  | /*empty*/
;

declaration returns [String r] 
						:b=board_declaration { r = b;}
            | f=function_declaration {}//{r = "";}
	          | v=var_declaration { global_variables.add("public static " +  v); }
//            | s1=struct_declaration { r = s1;}
            | s2=structure_declaration {r = s2;}
;

//struct_declaration returns [Identifier myID]
//                   : point=point_declaration {/*myID = new Identifier("point", point, "point");*/}
//                   | path=path_declaration {/*myID = new Identifier("path", path, "path");*/}
//                   ;

point_declaration returns [String myPointString] : //Point
 POINT ID e1=expression e2=expression  
                    {
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
                      
                      myPointString = "Point " + $ID.text + " = new Point(" + e1.getCode() + ", " + e2.getCode() + ");\n";
                      variables.put($ID.text, new Identifier( $ID.text, $ID.text, "point"));
                    }
                  | POINT ID
                  ;
                  	catch[Exception error]{
		System.out.println( error.getMessage());
			 System.exit(1);
		}
	
                  
path_declaration returns [PathNode myPath] //Path //String
: PATH i1=ID i2=term d=direction e=expression 
                    {
                        if (i2.getType().equals("function") && variables.containsKey(((FunctionNode)i2).Identifier) && e.getReturnType().equals("int")){
                        
                        String myPathString = "Path " + $i1.text + " = new Path(" + ((FunctionNode)i2).getCode() + ", \"" + d + "\", " + e.getCode() + ");\n";

                        myPath = new PathNode(myPathString, $i1.text, ((FunctionNode)i2).Identifier);
                      }
                      else if (i2.getType().equals("function") && ((FunctionNode)i2).getReturnType().equals("point")&& e.getReturnType().equals("int")){
                        String myPathString = "Path " + $i1.text + " = new Path(" + i2.getCode() + ", \"" + d + "\", " + e.getCode() + ");\n";
                        myPath = new PathNode(myPathString, $i1.text, i2.getCode());
                          
                      }
                      else {throw new Exception("Path Expects a point");
                       
                      }
                      }
                  | PATH ID
                  ;
	catch[Exception error]{
		System.out.println(error.getMessage());
			System.exit(1);
		}
	

direction returns [String myDirection]
          : LEFT {myDirection = $LEFT.text;}
          | RIGHT {myDirection = $RIGHT.text;}
          | UPP {myDirection = $UPP.text;}
          | DWN {myDirection = $DWN.text;}
          ;
          
var_declaration returns [String temp] 
		: i=int_declaration {temp =i;}
		| b=bool_declaration { temp = b;}
		;

function_call returns [ExpressionNode r]

              : ID  '(' e=expression_list ')' 
              {
              if ( variables.containsKey($ID.text)){
                String code = $ID.text + "(" + e + ")";
                r = new FunctionNode(code , ((ExpressionNode)variables.get($ID.text).value).getReturnType(), $ID.text);
              }
              else {throw new Exception( "Function " + $ID.text + "Not Declared");
               
              }
              }
              ;							
	catch[Exception error]{
		System.out.println(error.getMessage());
			System.exit(1);
		}
	
							
expression_list returns [String code]
								: e=expression  e2=expression_list 
								{
								if(e2.isEmpty()) code = e.getCode(); //+ e2;
								else
								code = e.getCode() 
								+ "," +  e2;
												
								}
								|/*empty*/ {code = "";}
                ;

bool_declaration	returns [String temp]
		 : BOOLEAN c=ID {variables.put($ID.text, new Identifier($c.text, 0, "boolean"));
		     temp = "boolean " + $c.text + ";";}  
		 | ^(ASSIGN BOOLEAN c=ID e=expression) {
		 if(!variables.containsKey($c.text) && e.getType().equals("boolean"))
     variables.put($c.text, new Identifier($c.text, new ValueNode(e.getCode(), "boolean"), "boolean"));
     else if (!variables.containsKey($c.text) && e.getType().equals("function") && e.getReturnType().equals("boolean"))		 variables.put($c.text , new Identifier ($c.text, new FunctionNode("(" + e.getCode() + ")", "boolean"), "function"));
		 else throw new Exception("Boolean Expected");
		 temp = "boolean " + $c.text + " = " + e.getCode() + " ;";

		 }
		 ;
	catch[Exception error]{
		System.out.println(error.getMessage());
			System.exit(1);
		}
	

int_declaration returns [String temp]
		: INT c=ID  {variables.put($ID.text, new Identifier($c.text, new ValueNode(0, "int"), "int"));
		temp = "int " + $c.text + ";";
		
		}
		| ^(ASSIGN INT c=ID e=expression ) {
		temp = "int " + $c.text + " = " + e.value()+ ";\n";
		//if(!variables.containsKey($c.text) && e.getReturnType().equals("int")){
		if ( e.getType().equals("int"))
		variables.put($c.text, new Identifier($c.text, e, "int")); 
		else if (e.getType().equals("function") && e.getReturnType().equals("int")){
    variables.put($c.text, new Identifier ($c.text, new FunctionNode(e.getCode(), "int", $c.text), "function")); 
		
		 }
		 else{throw new Exception("int expected");
		  
     }}//}
		;
			catch[Exception error]{
		System.out.println(error.getMessage());
			System.exit(1);
		}
	
		

expression returns [ExpressionNode r]
	/* All of the mathmatical expressions. Also Handles Function Calls */
	: ^(PLUS c=expression d=expression)
		 {
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
	
	| ^(MINUS c=expression d=expression){
		if ( c.getType().equals ("int") && d.getType().equals("int")){
		r = new SubNode(c.value(), d.value());}
		else  if (d.getType().equals("function")&& d.getReturnType().equals("int")){
					r = new FunctionNode( c.value() + " - " + d.getCode(), "int");  
				}
				else  if (c.getType().equals("function")&& c.getReturnType().equals("int")){
					r = new FunctionNode( c.getCode() + " - " + d.value() , "int");  
				
				}
			} 						
	| ^(TIMES c=expression d=expression){
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
	|^(DIVIDE c=expression d=expression){
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
	| ^(NEGATIONS d=expression){ 
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
	/*All of the Logical Operations. */
	| ^(NOT d=expression)  {
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
	|^(GRTR c=expression d=expression) {
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
	| ^(LESS c=expression d=expression) {
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
	| ^(GRTR_EQL c=expression d=expression){
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
	
	| ^(LESS_EQL c=expression d=expression)  {
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
	| ^(DBL_EQLS c=expression d=expression){
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
	| ^(NOT_EQLS c=expression d=expression){
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
	|^(AND c=expression d=expression)  { 
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
	| ^(OR c=expression d=expression) {
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
	| t=term { r = t;}
	
	;
	catch[Exception error]{
		System.out.println(error.getMessage());
			System.exit(1);
		}
	

term	returns [ExpressionNode r]
			: f=function_call {r = f;}
      | d=TRUE {r = new ValueNode(Boolean.valueOf(true), "boolean");}
      | d=FALSE {r = new ValueNode(Boolean.valueOf(false), "boolean");}
			| ID {
			
			
			//variables.put("x",new Identifier("x", 1, "int"));
			if (variables.containsKey($ID.text) && !variables.get($ID.text).type.equals("function")) r = new FunctionNode($ID.text, variables.get($ID.text).type);
      else if ( variables.containsKey($ID.text) && variables.get($ID.text).type.equals("function"))    r = new FunctionNode($ID.text, ((ExpressionNode) variables.get($ID.text).value).getReturnType());   //(ExpressionNode) variables.get($ID.text).value;
			else {throw new Exception("Identifier Not Found");
								}
			//throws new Exception("Identifier" + $ID.text + "Not Found"); }				
			}
			|	'(' e=expression ')' {r =e;} 
			|	d=CONST {r = new ValueNode(Integer.parseInt($d.text), "int");}

	//		|	 {r = new ValueNode(Integer.parseInt($d.text), "int");}
			
			;
	catch[Exception error]{
		System.out.println(error.getMessage());
			System.exit(1);
		}
	


//assgn_expression returns [String r]
//	: ^(ASSIGN ID c=expression){
//	if(variables.containsKey($ID.text) && ((ExpressionNode)variables.get($ID.text).value).getReturnType().equals(c.getReturnType())){ 
//		System.out.println("HOLYGUCKOB");
//		variables.remove($ID.text);
//		variables.put($ID.text, new Identifier($ID.text, c, c.getReturnType()));
//		r = $ID.text + " = " + c.getCode() + ";";
//		System.out.println("Checking assign:" + r);
//			}
//	else {
//		System.out.println("This Variable Has not been declared");
//
//}
//}
//                 ;
	
assgn_expression returns [String r]
	: ^(ASSIGN ID c=expression){
	if(variables.containsKey($ID.text) && ((ExpressionNode)variables.get($ID.text).value).getReturnType().equals(c.getReturnType())){ 
		variables.remove($ID.text);
		variables.put ($ID.text, new Identifier($ID.text, c, c.getReturnType()));
		r = $ID.text + " = " + c.getCode() + ";";
			}
	else {
//		System.out.println(c.getReturnType() + '\n' + ((ExpressionNode)variables.get($ID.text).value).getReturnType());
//		System.out.println("This Variable Has not been declared");
		throw new Exception("This Variable Has not been declared");

}
}
		;
		catch[Exception error]{
		System.out.println(error.getMessage());
			System.exit(1);
		}
	



main_declaration returns [String r]
: MAIN list=main_declaration_list 
  { 
  
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

;

main_declaration_list returns [ArrayList<String> myDrawList]
: DRAW b=ID m = main_declaration_list
              {
              if (m != null) {
                myDrawList = m;
                myDrawList.add($b.text);
                
                //System.out.println("This board was recognized " + $b.text);
              }
              else {
                myDrawList = new ArrayList<String>();
                myDrawList.add($b.text);
              }
            } 
         

| /* empty*/
;

board_declaration returns [String boardDec]
scope {String id;}
: BOARD ID {$board_declaration::id=$ID.text;} 
    bd=board_declaration_list 
    {
    
      //Creates an String array list from boardDeclaratoinList 
      //That should return three strings : size, start, and end respectively.
      ArrayList<String> list1 = bd.getSizeStartEndList();
     // System.out.println("----->" + boardDec);
      boardDec = "\npublic static Board " + $ID.text + "Draw() { \n\n";
      boardDec = boardDec + "\t\tBoard " + $ID.text + " = new Board(" + list1.get(0) + ");\n";
      
      boardDec = boardDec + "\t\t" + $ID.text + ".addStart(" + list1.get(1) + ");\n";
      
      boardDec = boardDec + "\t\t" + $ID.text + ".addEnd(" + list1.get(2) + ");\n\n";
      
      
      //
      boardDec = "" + "\t" + boardDec + bd.getPointsAndPaths() + "\n";
      
//      for (String id: bd.getPathIDs()){
//        boardDec = boardDec + "\t\t" + $ID.text + ".addPath(" + id + ");\n";
//      }
      
      boardDec = boardDec + "\t\treturn " + $ID.text + ";\n" ;
      
      boardDec = boardDec + "\t}" ;
      
//      boardDec = boardDec + "\n\t\t" + $ID.text + ".drawBoard();\n" ;
//      
//      boardDec = boardDec + '\n' + "\t}\n}";
      variables2.put($ID.text, boardDec);
    }
  ;
  
//messy starting here  
  
board_declaration_list returns [BoardDeclarationListNode myBDLNode]
scope {String id;} 
@init{ArrayList<String> sizeStartEndList = new ArrayList<String>();}
    :  p1=size_declaration p2=start_declaration p3=end_declaration p4=board_statement_list2
    { 
	    sizeStartEndList.add(p1);
	    sizeStartEndList.add(p2);
	    sizeStartEndList.add(p3);
      
      myBDLNode = new BoardDeclarationListNode(sizeStartEndList, p4);
    
     }

  ;

board_statement_list2 returns[String myBSL2] 
                      :  b2=board_statement_2 b2list=board_statement_list2 
                         {
                            if (b2list==null){
                                myBSL2 = "\t\t" + (String)b2.getValue();
                            }
                            else{ //list is not null
                                myBSL2 = "\t\t" + (String)b2.getValue() + b2list;
                            }
                           

                         }
                      | /*empty*/ {myBSL2 = "";}
                      ;

board_statement_2  returns [Identifier pathOrPoint] //Identifier //String
                 : 
                 s=set_structure{pathOrPoint = new Identifier("", s, "structure");} 
                 | point=point_declaration {pathOrPoint = new Identifier("", point, "point");/*pathOrPoint = point;*/} 
                 | path=path_declaration {pathOrPoint = new Identifier(path.getId(), path.getName() + "\t\t" + $board_declaration::id + ".addPath(" + path.getId() + ");\n\n", "path");}
                 | var=var_declaration {pathOrPoint = new Identifier("", var, "var");}
          //       | a = assgn_expression {pathOrPoint = new Identifier("", a , "var");}       
                 | bs=board_statement {pathOrPoint = new Identifier("", bs, "board_statement"); }         
           //      | f = function_call {pathOrPoint = new Identifier("",f.getCode(), "function_call");}  
                 ;

//need to fix  set structure because it needs to return a list of paths from iteration and while
set_structure returns [String myStructure]
            : SET ID {                      
                      myStructure = "ArrayList<StructureNode> " + $ID.text + "ArrayList = new ArrayList<StructureNode>();\n";
                      myStructure += $ID.text + "ArrayList = " + $ID.text + "Structure(); \n";
                      myStructure += "for (StructureNode Geforce : " + $ID.text + "ArrayList) { \n" ;
                      myStructure += "Point ati = Geforce.getPoint(); \n";
                      myStructure += $board_declaration::id + ".addPath(Geforce.getPath()); \n } \n";
                      
                      }
            ;

//need to fix body to return the correct String
structure_declaration returns[String s] 
  : STRUCTURE ID  body=structure_body 
                      {
                        if (body == null){
                          variables2.put($ID.text, null);
                          s = "";
                        }
                        else{
                          variables2.put($ID.text, body);
                          s = "\n public static ArrayList<StructureNode> " + $ID.text + "Structure() { \n\n";
                          s += "\tArrayList<StructureNode> StructList = new ArrayList<StructureNode>();\n\n";
                          s += body.toString() + "\n";
                          s += "\treturn StructList;\n";
                          s += "}\n";
                        }
                      } 
                      ;

//need to correct structure to return the right string
//Revise Based on fixed grammar
structure_body returns [String myBSL2]
                : b2=structure_statement b2list=structure_body 
                  {
                                     
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
                      | /*empty*/ {myBSL2 ="";}
                      ;
	catch[Exception error]{
		System.out.println(error.getMessage());
			System.exit(1);
		}
	
                
structure_statement returns [Identifier ident]:
            bs=structure_board_statement {ident = new Identifier("", bs, "board_statement"); }           
           | point = point_declaration {ident = new Identifier("",point,"point");}
           | path = path_declaration {ident = new Identifier(path.getId(),path.getName() + "\n\t" + 
                                        "if (!StructList.contains(new StructureNode(" +
                                        path.getPoint_ID() + ", " + path.getId() + "))) {" +
                                        "StructureNode " + path.getPoint_ID() + "Node = new StructureNode(" +
                                        path.getPoint_ID() + ", " + path.getId() + "); \n\t" + 
                                        "StructList.add(" + path.getPoint_ID() + "Node);\n } \n " ,"path");}
           | v = var_declaration {ident = new Identifier("",v,"var");}
           | a = assgn_expression {ident = new Identifier("",a,"assgn_expression");}
          ;                    

structure_path_declaration returns [PathNode myPath] //Path //String
: PATH i1=ID i2=term d=direction e=expression 
                    {
                        if (i2.getType().equals("function") && variables.containsKey(((FunctionNode)i2).Identifier) && e.getReturnType().equals("int")){
                        
                        String myPathString = "Path " + $i1.text + " = new Path(" + ((FunctionNode)i2).Identifier + ", \"" + d + "\", " + e.getCode() + ");\n";

                        myPath = new PathNode(myPathString, $i1.text, ((FunctionNode)i2).Identifier);
                      }
                      else if (i2.getType().equals("function") && ((FunctionNode)i2).getReturnType().equals("point")&& e.getReturnType().equals("int")){
                        String myPathString = "Path " + $i1.text + " = new Path(" + i2.getCode() + ", \"" + d + "\", " + e.getCode() + ");\n";
                        myPath = new PathNode(myPathString, $i1.text, i2.getCode());
                          
                      }
                      else {throw new Exception("Path Expects a point");
                      					 
                      }
                      }
                  | PATH ID
                  ;
	catch[Exception error]{
		System.out.println( error.getMessage());
			System.exit(1);
		}
	

structure_iteration_stmt returns [String str] : ^(WHILE e=expression b=structure_body)
  {
        if(e.getReturnType().equals("boolean") || e.getType().equals("boolean")) {

          str = "while(" + e.getCode() + "){" + b + "}";
//          throw new Exception("`````````````````" + b);
        }
          
        else{
          throw new Exception("Invalid type in while loop. Expected a boolean but received a(n) " + e.getReturnType());
          					 
          }
  }
         ;
         	catch[Exception error]{
		System.out.println( error.getMessage());
			 			System.exit(1);
			 
		}
	
         
structure_selection_stmt returns [String str]  
                     : ^(IF e = expression b=structure_body b2=structure_selection_else_stmt)
                      {
                       if(e.getReturnType().equals("boolean") || e.getType().equals("boolean")) {
                      
                     	str = "if(" + e.getCode() + "){\n" + b + "} " + b2;}
                     	else throw new Exception("Invalid type in if statement. Expected a boolean but received a(n) " + e.getReturnType()) ;}
                      ;
                          	catch[Exception error]{
		System.out.println( error.getMessage());
			System.exit(1);
		}
	
              
                      
structure_selection_else_stmt  returns [String str]
                          : ^(ELSE b=structure_body) { str= "else{" + b + "}";}
                          |/*empty*/ {str = "";}
                          ;
                
structure_board_statement returns [String str]:
                i = structure_iteration_stmt {str = i;}
              | b = structure_selection_stmt {str = b;}
              | p = print_stmt {str = p;}     
              | f = function_call {str = f.getCode();}                 
              ;                
                
size_declaration returns [String myPoint] //Point
: SIZE c1=CONST c2=CONST 
{/*System.out.println("Size is " + $c1.text + ", " + $c2.text); */
 myPoint = "new Point(" + $c1.text + ", " + $c2.text + ")";
 }
 ;
  
//board_statement_list : print_stmt
//;            
              
board_statement returns [String str]:
                i = board_iteration_stmt {str = i;}
              | b = board_selection_stmt {str = b;}
              | p = print_stmt {str = p;}
              | a = assgn_expression {str = a;}
               | f = function_call {str = f.getCode() + ";";}
              ;
              
//statement_list returns [Identifier ident]:
//              (s = statement)* {ident = s;}
//              ;
//something here is probably wrong check again              
statement returns [Identifier ident]:
            i = iteration_stmt {ident = new Identifier("",i,"iteration_stmt");} 
           | s = selection_stmt {ident = new Identifier("",s,"selection_stmt");}
           | point = point_declaration {ident = new Identifier("",point,"point");}
           | path = path_declaration {ident = new Identifier(path.getId(), path.getName() ,"path");}
           | v = var_declaration {ident = new Identifier("",v,"var");}
           | a = assgn_expression {ident = new Identifier("",a,"assgn_expression");}
          ;

statement_list returns[String myBSL2] //BoardStatementList2Node //String //BSL2Node
@init{/*ArrayList<Point> points = new ArrayList<Point>(); ArrayList<String> paths = new ArrayList<String>();*/}
                      :  b2=statement b2list=statement_list 
                          {
                          
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
                      | /*empty*/ {myBSL2 ="";}
                      ;
              	catch[Exception error]{
		System.out.println( error.getMessage());
			System.exit(1);
		}
	
              
board_iteration_stmt returns [String str] : ^(WHILE e=expression b=board_statement_list2)
  {
        if(e.getReturnType().equals("boolean") || e.getType().equals("boolean")) {

          str = "while(" + e.getCode() + "){" + b + "}";
//          throw new Exception("`````````````````" + b);
        }
          
        else{
          throw new Exception("Invalid type in while loop. Expected a boolean but received a(n) " + e.getReturnType());
          					 
          }
  }
         ;
                      	catch[Exception error]{
		System.out.println( error.getMessage());
			 System.exit(1);
		}
	
                        
board_selection_stmt returns [String str]  
                     : 
                     ^(IF e=expression b=board_statement_list2 b2=board_selection_else_stmt )
                      {
                      if(e.getReturnType().equals("boolean")|| e.getType().equals("boolean")) {
                      str = "if(" + e.getCode() + "){" + b + "} " + b2 ;
                      }
                      else{
          throw new Exception("Invalid type in conditional statement. Expected a boolean but received a(n) " + e.getReturnType());
          					 
          }
                      }
                      ;
                      	catch[Exception error]{
		System.out.println(error.getMessage());
			System.exit(1);
		}

	
                      
board_selection_else_stmt  returns [String str]:
                          ^(ELSE b=board_statement_list2)  
                          { 
                            str= "else{" + b + "}";
                          }
                          |/*empty*/ {str = "";}
                          ;
                          
                                
iteration_stmt returns [String str] : ^(WHILE e=expression b=statement_list)
  {
        if(e.getReturnType().equals("boolean") || e.getType().equals("boolean")) {

          str = "while(" + e.getCode() + "){" + b + "}";
//          System.out.println("`````````````````" + b);
        }
          
        else{
          throw new Exception("Invalid type in while loop. Expected a boolean but received a(n) " + e.getReturnType());
          					 
          }
  }
         ;
         	catch[Exception error]{
		System.out.println(error.getMessage());
			System.exit(1);
		}
	
         
         
selection_stmt returns [String str]  
                     : ^(IF e = expression b=statement_list b2=selection_else_stmt)
                      {
                       if(e.getReturnType().equals("boolean") || e.getType().equals("boolean")) {
                      
                      str = "if(" + e.getCode() + "){\n" + b + "} " + b2 ;}}
                      ;
              
                      
selection_else_stmt  returns [String str]
                          : ^(ELSE b=statement_list) { str= "else{" + b + "}";}
                          |/*empty*/ {str = "";}
                          ;
    


start_declaration returns [String myPoint] //Point 
    : START c3=CONST c4=CONST 
    {
      myPoint = "new Point(" + $c3.text + ", " + $c4.text + ")";
    }
      ;   
end_declaration returns [String myPoint]  
  : END c5=CONST c6=CONST 
  {
  myPoint = "new Point(" + $c5.text + ", " + $c6.text + ")";
  }
      ;      
      
 function_declaration returns [String r]
 				
 				: FUNC INT ID p=parameters bs2=board_statement_list2 j=jump_stmt {
 			

 				r =  "	public static int " + $ID.text +  p + "{" + '\n' +
 							  bs2 + '\n' +
 								 "\t\t"+ j + '\n'+

 								"}";	
 				variables.put($ID.text, new Identifier($ID.text, new FunctionNode("", "int", $ID.text), "function"));
 				function_list.add(r);
 				
 				}
         | FUNC BOOLEAN ID p=parameters bs2=board_statement_list2 j=jump_stmt {
         r =  "	public static boolean " + $ID.text  + p +"{" + '\n' +
 								" 	"+ bs2 + '\n' +
 								"		" + j + '\n' +
 								"}";	
 				 variables.put($ID.text, new Identifier($ID.text, new FunctionNode("", "boolean", $ID.text), "function"));
 				 function_list.add(r);
 				
 				}
         | FUNC POINT ID p=parameters bs2=board_statement_list2 j=jump_stmt {
         r =  "	public static Point " + $ID.text + p + "{" + '\n' +
 								" 	"+ bs2 + '\n' +
 								"		" + j + '\n'+
 								"}";	
        variables.put($ID.text, new Identifier($ID.text, new FunctionNode("", "point",$ID.text), "function")); 
 				function_list.add(r);
         }
         | FUNC ID p=parameters bs2=board_statement_list2 {
 				
         r =  "	public static void " + $ID.text + p + "{" + '\n' +

 								" 	"+ bs2 + '\n' +
 								"}";	
 				variables.put($ID.text, new Identifier($ID.text, new FunctionNode("", "void", $ID.text), "function"));
 				function_list.add(r);
 				}
 ;
 
parameters returns [String str]
@init{ ArrayList<String> vars = new ArrayList<String>();} : ( b=var_declaration_unassigned {vars.add(b);} ( c=var_declaration_unassigned {vars.add(c);})*) 
{
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
    | /*empty */ {str = "()";}
;


 var_declaration_unassigned returns [String code] : INT d=ID { code = "int " + $d.text + "";
 																																variables.put($d.text, new Identifier($d.text, new ValueNode( 0, "int"), "int"));}
                            | BOOLEAN e=ID {code = "boolean " + $e.text + "";
                            variables.put($e.text, new Identifier($e.text, new ValueNode(Boolean.valueOf(false), "boolean"), "boolean"));
                            
                            }


                            ;
    
//bs_statement_list : /*empty*/
//;

jump_stmt returns [String code] : RETURN  d=expression {
  if (d.getType().equals("function") && variables.containsKey(((FunctionNode)d).Identifier)){
      code = "return " + ((FunctionNode)d).Identifier + ";";}
  else{
  code = "return " + d.getCode() + ";";}}
    ; 
    
//IF THERE ARE NO QUOTES, ERROR IS NOT HANDLED
print_stmt returns [String str]
          : PRINT STRING {
          if($STRING.text == null){
            str = "System.out.println();";
          }
          else{
            str = "System.out.println("+$STRING.text+");";
          }
         }  //System.out.println( $STRING.text );}
    ;
