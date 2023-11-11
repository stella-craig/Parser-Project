//My Language
grammar MyLanguage;

start: statement+;

//A statement can be an assignment or expression for Deliverable 1
statement: IDENTIFIER ASSIGNMENT_OPERATOR expression ;

//Handles expressions
expression: expression ('+'|'-'|'*'|'/'|'%') expression    // all operations
            | array_begin                                   
            | STRING
            | BOOL
            | INT
            | FLOAT
            | IDENTIFIER
            ;

// Token for arrays since arrays in python can hold anything it just takes any string, bool, number, or IDENTIFIER
array_begin: '[' (IDENTIFIER|BOOL|INT|FLOAT|STRING) continue_array* ']' ;
continue_array: ',' (IDENTIFIER|BOOL|INT|FLOAT|STRING) continue_array* ;

//Tokens for operators
ASSIGNMENT_OPERATOR: '=' | '+=' | '-=' | '*=' | '/=' ;

// NEWLINE: [\n\r]+;

//Ignore whitespace rule
WS: [ \t\n\r]+ -> skip ;

//Tokens for literals and IDENTIFIERs
IDENTIFIER: [a-zA-Z][a-zA-Z_0-9]*;
INT: [0-9]+;
FLOAT: [0-9]+'.'[0-9]+;
BOOL: 'True' | 'False' ;
STRING: '\'' IDENTIFIER '\'' | '\'' INT '\'' | '\'' FLOAT '\'' | '"' IDENTIFIER '"' | '"' INT '"' | '"' FLOAT '"' ;