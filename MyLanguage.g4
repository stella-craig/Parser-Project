//My Language
grammar MyLanguage;

start: statement;
//Ignore whitespace rule
WS: [ \t\r\n]+ -> skip ;

IDENTIFIER: [a-zA-Z_] [a-zA-Z_0-9]*;

//A statement can be an assignment or expression for Deliverable 1
statement: IDENTIFIER ASSIGNMENT_OPERATOR expression
          | IDENTIFIER '=' LITERAL;                 // handles assignment for regular literals

//Handles the arithmetic operations
expression: 
              expression op=(PLUS|MINUS|TIMES|DIVIDE|MOD) expression    // all operations
            | '(' expression ')'                    // Parens
            | NUMBER                                // Number
            | IDENTIFIER                            // Variable
            ;

// Token for arrays since arrays in python can hold anything it just takes any string, bool, number, or IDENTIFIER
ARRAY: ARRAY_BEGIN ;
ARRAY_BEGIN: '[' (STRING|BOOL|NUMBER|IDENTIFIER) CONTINUE_ARRAY
            ;
CONTINUE_ARRAY: ',' (STRING|BOOL|NUMBER|IDENTIFIER) CONTINUE_ARRAY
            | END_ARRAY
            ;
END_ARRAY: ']';

//Tokens for operators
ASSIGNMENT_OPERATOR: '=' | '+=' | '-=' | '*=' | '/=' ;
PLUS: '+' ;
MINUS: '-' ;
TIMES: '*';
DIVIDE: '/';
MOD: '%';

// literal definition
LITERAL: STRING
        | NUMBER
        | IDENTIFIER
        | BOOL
        | ARRAY
        ;

//Tokens for literals and IDENTIFIERs
NUMBER: [0-9]+ ('.' [0-9]+)? ;
BOOL: 'True'
      | 'False'
      ;
STRING: '"' IDENTIFIER '"' | '\'' IDENTIFIER '\'' | '"' NUMBER '"';