//My Language
grammar MyLanguage;
start: (statement)+ ;

//A statement can be an assignment or expression for Deliverable 1
statement: assignment
            | expression
            | ;

assignment: identifier assignment_operator expression ;

//Handles the arithmetic operations
expression: 
              expression op=('*'|'/') expression    # MulDiv
            | expression op=('+'|'-') expression    # AddSub
            | expression op=('%') expression        # Mod
            | '(' expression ')'                    # Parens
            | NUMBER                                # Number
            | identifier                            # Variable
            ;

// Token for arrays
ARRAY: ARRAY_BEGIN ;
ARRAY_BEGIN: '[' NUMBER CONTINUE_ARRAY
            | '[' IDENTIFIER CONTINUE_ARRAY
            ;
CONTINUE_ARRAY: ',' NUMBER
            | ',' IDENTIFIER
            | END_ARRAY
            ;
END_ARRAY: ']';

//Tokens for operators
assignment_operator: '=' | '+=' | '-=' | '*=' | '/=' ;
PLUS: '+' ;
MINUS: '-' ;
TIMES: '*';
DIVIDE: '/';
MOD: '%';

//Tokens for literals and identifiers
STRING: '"' (.)+ '"' ;
NUMBER: [0-9]+ ('.' [0-9]+)? ;
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]* ;

//Ignore whitespace
WS: [ \t\r\n]+ -> skip ;