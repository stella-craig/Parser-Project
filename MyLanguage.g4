//My Language
grammar MyLanguage;

start: statement EOF;

//Ignore whitespace
WS: [ \t\r\n]+ -> skip ;

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

// Token for arrays since arrays in python can hold anything it just takes a literal
ARRAY: ARRAY_BEGIN ;
ARRAY_BEGIN: '[' LITERAL CONTINUE_ARRAY
            ;
CONTINUE_ARRAY: ',' LITERAL CONTINUE_ARRAY
            | END_ARRAY
            ;
END_ARRAY: ']';

// literal definition
LITERAL: STRING
        | NUMBER
        | IDENTIFIER
        | BOOL
        | ARRAY
        ;

//Tokens for operators
ASSIGNMENT_OPERATOR: '=' | '+=' | '-=' | '*=' | '/=' ;
PLUS: '+' ;
MINUS: '-' ;
TIMES: '*';
DIVIDE: '/';
MOD: '%';

//Tokens for literals and identifiers
STRING: '"' [.]+ '"' | '\'' [.]+ '\'';
NUMBER: [0-9]+ ('.' [0-9]+)? ;
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]* ;
BOOL: 'True'
      | 'False'
      ;
