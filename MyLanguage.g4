//My Language
grammar MyLanguage;
start: (statement)+ ;

//A statement can be an assignment or expression for Deliverable 1
statement: assignment;

assignment: IDENTIFIER ASSIGNMENT_OPERATOR expression 
          | IDENTIFIER '=' literal;                 # handles assignment for regular literals

//Handles the arithmetic operations
expression: 
              expression op=('*'|'/') expression    # MulDiv
            | expression op=('+'|'-') expression    # AddSub
            | expression op=('%') expression        # Mod
            | '(' expression ')'                    # Parens
            | NUMBER                                # Number
            | IDENTIFIER                            # Variable
            ;

# literal definition
literal: STRING
        | NUMBER
        | IDENTIFIER
        | BOOL
        | ARRAY
        ;

// Token for arrays
ARRAY: ARRAY_BEGIN ;
ARRAY_BEGIN: '[' NUMBER CONTINUE_ARRAY
            | '[' IDENTIFIER CONTINUE_ARRAY
            | '[' STRING CONTINUE_ARRAY
            ;
CONTINUE_ARRAY: ',' NUMBER CONTINUE_ARRAY
            | ',' IDENTIFIER CONTINUE_ARRAY
            | ',' STRING CONTINUE_ARRAY
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

//Tokens for literals and identifiers
STRING: '"' (.)+ '"'
        | ''' (.)+ ''';
NUMBER: [0-9]+ ('.' [0-9]+)? ;
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]* ;
#INTEGER: [0-9]+;
#FLOAT: [0-9]*'.'[0-9]+;
BOOL: 'True'
      | 'False'
      ;

//Ignore whitespace
WS: [ \t\r\n]+ -> skip ;