grammar Amaze;

options {

  language = Java;
  output = AST;
  ASTLabelType = CommonTree;
}
tokens{
	NEGATIONS ;
	REASSIGN;

}
@header{
//  package compiler;
}

@lexer::header{ 
//  package compiler;
}

maze :  declaration_list
        main_declaration
//        declaration_list
        EOF!
     ;

declaration_list : declaration declaration_list   
     |/*empty*/
     ; 

declaration : structure_declaration
            |  board_declaration 
            | var_declaration
            | function_declaration
            ;

board_declaration: BOARD ID '{'! board_declaration_list '}'!
;


board_declaration_list:  size_declaration start_declaration end_declaration board_statement_list2 /*board_statement_list*/
  ;
      
size_declaration  : SIZE ':'! expression ','! expression';'!
      ;   
      
start_declaration : START ':'! expression','! expression';'!
      ;

end_declaration : END ':'! expression','! expression';'!
                ;

var_declaration : int_declaration
                | bool_declaration
                ;

int_declaration : INT ID ';'!
		| INT ID ASSIGN^ expression ';'!
		;

bool_declaration : BOOLEAN ID ';'!
		 | BOOLEAN ID ASSIGN^ expression ';'!
		 ;    
set_structure : SET '('! ID ')'! ';'!
              ;


point_declaration : POINT ID ':'! expression ','! expression ';'!
                  | POINT ID ';'!
                  ;

path_declaration : PATH ID ':'! (ID | function_call) ','! direction','! expression ';'!
                 | PATH  ID';'!
                 ;

board_statement :
                 board_iteration_stmt
                | function_call
                | board_selection_stmt
                | print_stmt
                | assgn_expression
                ;
                
board_iteration_stmt : WHILE^ '('! expression ')'! '{'! board_statement_list2 '}'! 
               
               ;                

board_selection_stmt  : IF^ '('! expression ')'! '{'! board_statement_list2 '}'! board_selection_else_stmt
                      ;
    
board_selection_else_stmt  : ELSE^ '{'! board_statement_list2 '}'!
                           |/*empty*/
                           ;   
 
function_call	:  ID'(' expression_list ')' 
							;                                     
                 
direction : LEFT
          | RIGHT
          | UPP
          | DWN
          ;                 

main_declaration : MAIN '{'! main_declaration_list '}'!
		             ;

main_declaration_list : DRAW  '('! ID  ')'! ';'! main_declaration_list
		                  |/*empty*/
		                  ;


structure_declaration : STRUCTURE ID '{'! structure_body '}'! 
                      ;

structure_body  : 
                 structure_statement structure_body
                | /*empty*/
                ;

structure_statement   : assgn_expression
                | point_declaration
                | structure_path_declaration
                | var_declaration
                | structure_board_statement                 
                ;
                
structure_board_statement :
               structure_iteration_stmt
              | structure_selection_stmt
              |print_stmt      
              | function_call              
              ;  
                
structure_path_declaration : PATH ID ':'! (ID | function_call) ','! direction','! expression ';'!
                 | PATH  ID';'!
                 ;                
                 
structure_iteration_stmt : WHILE^ '('! expression ')'! '{'! structure_body '}'! 
               
               ;               

structure_selection_stmt  : IF^ '('! expression ')'! '{'! structure_body '}'! structure_selection_else_stmt
                ;
    
structure_selection_else_stmt : ELSE^ '{'! structure_body '}'!
                    |/*empty*/
                    ;                  

function_declaration : FUNC INT ID'('!parameters')'! '{'!board_statement_list2 jump_stmt'}'!
		     | FUNC BOOLEAN ID'('!parameters')'! '{'!board_statement_list2 jump_stmt'}'!
		     | FUNC POINT ID '('!parameters')'! '{'!board_statement_list2 jump_stmt'}'!
		     | FUNC ID '('!parameters')'! '{'! board_statement_list2 '}'!
 ;
 
parameters      : (/* empty */ | var_declaration_unassigned) (','! var_declaration_unassigned)*
                ;
   
var_declaration_unassigned : INT ID
                           | BOOLEAN ID
                           ;    
    


statement_list  : (statement)*
                ;

board_statement_list2: board_statement_2 board_statement_list2
                      | /*empty*/
                      ;
			
board_statement_2: set_structure 
                 | var_declaration 
                 | board_statement 
                 | point_declaration 
                 | path_declaration	                
;
			
statement       : assgn_expression
                | iteration_stmt
                | selection_stmt
                | point_declaration
                | path_declaration
                | var_declaration
                ;


iteration_stmt : WHILE^ '('! expression ')'! '{'! statement_list '}'! 
               
               ;               

selection_stmt	: IF^ '('! expression ')'! '{'! statement_list '}'! selection_else_stmt
		            ;
		
selection_else_stmt	: ELSE^ '{'! statement_list '}'!
		                |/*empty*/
		                ;

jump_stmt : RETURN expression';'!
          ;

print_stmt  : PRINT '('! STRING ')'! ';'!
            ;

term	:	TRUE
			|FALSE
			| ID 
			| function_call
			| CONST
			| '('! expression ')'!
			;

negation
			: NOT^* term
			;
unary
			:	(unary_minus^)* negation
			;
			
unary_minus
			: MINUS -> NEGATIONS
			;
mult
			: unary ((TIMES^ | DIVIDE^) unary)*
			;
			
add
	: mult ((PLUS^ | MINUS^) mult)*
	;
relation
	:	add ((GRTR^ | LESS^ | GRTR_EQL^ | LESS_EQL^ | DBL_EQLS^ | NOT_EQLS^) add)*
	;
expression
	: relation ((AND^ |OR^) relation)*
	;

assgn_expression : ID ASSIGN^ expression ';'!
                 ;

expression_list : expression  ( ','! expression)* 
								|/*empty*/
                ;

WS: (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};

COMMENT : '/*' .* '*/' {$channel = HIDDEN;};

MAIN	:'main';

DRAW	: 'draw';

STRUCTURE 
	:	'structure';

FUNC	:'func';

INT	:'int';

AND	:'&&';

OR	:'||';

NOT_EQLS:	'!=';

DBL_EQLS:	'==';

LESS_EQL:	'<=';

GRTR_EQL:	'>=';

LESS	:'<';

NOT	: '!';

GRTR	:'>';

WHILE	:'while';

ASSIGN	:'=';

MINUS	:'-';	

PLUS	:'+';

TIMES	:'*';

DIVIDE	:'/';

RETURN	:'return';

BOOLEAN	:'boolean';

IF	:'if';

ELSE	:'else';

SET	:'set';

SIZE	:'size';

END	:'end';

START	:'start';

FALSE	:'false';

TRUE	:'true';

BOARD	:'board';

LEFT	:	'left';

UPP	: 'up';

DWN : 'down';

RIGHT	:'right';

PATH	:'path';

POINT	:'point';

PRINT	: 'print';

CONST	: ('0'..'9')+
	    ;

ID	:  ('a'..'z' | 'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')*
		;

STRING	: '"'('a'..'z'| 'A'..'Z'| '0'..'9' |' ' | '\t' | '\n' | '\r' | '\f')*  '"' 
	      ;
	

