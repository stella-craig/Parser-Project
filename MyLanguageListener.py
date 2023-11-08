# Generated from MyLanguage.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .MyLanguageParser import MyLanguageParser
else:
    from MyLanguageParser import MyLanguageParser

# This class defines a complete listener for a parse tree produced by MyLanguageParser.
class MyLanguageListener(ParseTreeListener):

    # Enter a parse tree produced by MyLanguageParser#start.
    def enterStart(self, ctx:MyLanguageParser.StartContext):
        pass

    # Exit a parse tree produced by MyLanguageParser#start.
    def exitStart(self, ctx:MyLanguageParser.StartContext):
        pass


    # Enter a parse tree produced by MyLanguageParser#statement.
    def enterStatement(self, ctx:MyLanguageParser.StatementContext):
        pass

    # Exit a parse tree produced by MyLanguageParser#statement.
    def exitStatement(self, ctx:MyLanguageParser.StatementContext):
        pass


    # Enter a parse tree produced by MyLanguageParser#expression.
    def enterExpression(self, ctx:MyLanguageParser.ExpressionContext):
        pass

    # Exit a parse tree produced by MyLanguageParser#expression.
    def exitExpression(self, ctx:MyLanguageParser.ExpressionContext):
        pass



del MyLanguageParser