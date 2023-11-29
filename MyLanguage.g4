//My Language
grammar MyLanguage;

start: statement+;

// statement can be an assignment_statement or a conditional
statement: comment | assignment_statement | conditional_statement | loop_statement;

//handling loop statements
loop_statement : while_loop | for_loop ;

while_loop : 'while' ('(')? conditional (')')? ':' block;
for_loop : 'for' IDENTIFIER 'in' IDENTIFIER ':' block | 'for' IDENTIFIER 'in' RANGE ':' block;

// handling comments
comment : COMMENT ;

/* handling assignment statements */
assignment_statement: IDENTIFIER ASSIGNMENT_OPERATOR expression ;

//Handles expressions
expression: expression ('+'|'-'|'*'|'/'|'%') expression    // all operations
            | array_begin                                   
            | STRING
            | BOOL
            | INT
            | FLOAT
            | IDENTIFIER
            | conditional
            ;

// Token for arrays since arrays in python can hold anything it just takes any string, bool, number, or IDENTIFIER
array_begin: '[' (IDENTIFIER|BOOL|INT|FLOAT|STRING) continue_array* ']' ;
continue_array: ',' (IDENTIFIER|BOOL|INT|FLOAT|STRING) continue_array* ;

//Tokens for operators
ASSIGNMENT_OPERATOR: '=' | '+=' | '-=' | '*=' | '/=' ;



/* handling conditional statemetns */
conditional_statement: CONDITION (conditional)? ':' block;
conditional:  id (CONDITIONAL_OPERATORS id)* (continue_conditional)*;
continue_conditional: CONDITIONAL_OPERATORS id ;

// block underneath a conditional
// first one needs to be tabbed over, but afterwards it can be tabbed over or be a regular statement
block: TAB statement continue_block* ;
continue_block: block | TAB block | statement ;

// identifiers for conditionals
id: '(' id ')' | INT | FLOAT | STRING | IDENTIFIER | BOOL | 'not' id ;
// conditional operators
CONDITIONAL_OPERATORS: '<' | '<=' | '>' | '>=' | '==' | '!=' | 'and' | 'or' ; 
// token for conditional keywords
CONDITION: 'if' | 'elif' | 'else' ;


//Ignore whitespace rule
WS: [ \n\r]+ -> skip ;

//Tokens
TAB: [\t]+;
IDENTIFIER: [a-zA-Z][a-zA-Z_0-9]*;
INT: ('-')?[0-9]+;
FLOAT: ('-')?[0-9]+'.'[0-9]+;
BOOL: 'True' | 'False' ;
STRING: '\'' [a-zA-Z_0-9]+ ([ ][a-zA-Z_0-9]+)* '\'' | '"' [a-zA-Z_0-9]+ ([ ][a-zA-Z_0-9.']+)* '"' | '"''"'|'\'''\'' ;
COMMENT : '\'\'\'' ([ a-zA-Z_0-9.',\n\t\r])+ '\'\'\''
            | '#' ([ #a-zA-Z_0-9])+ ([ ][a-zA-Z_0-9]+)* ;
RANGE : 'range(' INT ',' INT ')' ;