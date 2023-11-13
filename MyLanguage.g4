//My Language
grammar MyLanguage;

start: statement+;

//A statement can be an assignment or expression for Deliverable 1
statement: IDENTIFIER ASSIGNMENT_OPERATOR expression | conditional;

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

//
conditional: CONDITION (conditional_statement)? ':' block;

conditional_statement:  id CONDITIONAL_OPERATORS id (continue_conditional)*;

continue_conditional: CONDITIONAL_OPERATORS id ;

block: TAB statement continue_block* ;

continue_block: block | statement ;

// identifiers for conditionals
id: '(' id ')' | INT | FLOAT | STRING | IDENTIFIER | BOOL | 'not' id ;

// conditional operators
CONDITIONAL_OPERATORS: '<' | '<=' | '>' | '>=' | '==' | '!=' | 'and' | 'or' ; 

// token for conditional keywords
CONDITION: 'if' | 'elif' | 'else' ;

// Token for arrays since arrays in python can hold anything it just takes any string, bool, number, or IDENTIFIER
array_begin: '[' (IDENTIFIER|BOOL|INT|FLOAT|STRING) continue_array* ']' ;
continue_array: ',' (IDENTIFIER|BOOL|INT|FLOAT|STRING) continue_array* ;

//Tokens for operators
ASSIGNMENT_OPERATOR: '=' | '+=' | '-=' | '*=' | '/=' ;

TAB: [\t]+;

//Ignore whitespace rule
WS: [ \n\r]+ -> skip ;

//Tokens for literals and IDENTIFIERs
IDENTIFIER: [a-zA-Z][a-zA-Z_0-9]*;
INT: ('-')?[0-9]+;
FLOAT: [0-9]+'.'[0-9]+;
BOOL: 'True' | 'False' ;
IDENTIFIER_NUM: [a-zA-Z_0-9]+ ;
STRING: '\'' IDENTIFIER_NUM ([ ]IDENTIFIER_NUM)* '\'' | '"' IDENTIFIER_NUM ([ ]IDENTIFIER_NUM)* '"' | '"''"'|'\'''\'' ;