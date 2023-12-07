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


    # Enter a parse tree produced by MyLanguageParser#assignment_statement.
    def enterAssignment_statement(self, ctx:MyLanguageParser.Assignment_statementContext):
        pass

    # Exit a parse tree produced by MyLanguageParser#assignment_statement.
    def exitAssignment_statement(self, ctx:MyLanguageParser.Assignment_statementContext):
        pass


    # Enter a parse tree produced by MyLanguageParser#expression.
    def enterExpression(self, ctx:MyLanguageParser.ExpressionContext):
        pass

    # Exit a parse tree produced by MyLanguageParser#expression.
    def exitExpression(self, ctx:MyLanguageParser.ExpressionContext):
        pass


    # Enter a parse tree produced by MyLanguageParser#loop_statement.
    def enterLoop_statement(self, ctx:MyLanguageParser.Loop_statementContext):
        pass

    # Exit a parse tree produced by MyLanguageParser#loop_statement.
    def exitLoop_statement(self, ctx:MyLanguageParser.Loop_statementContext):
        pass


    # Enter a parse tree produced by MyLanguageParser#while_loop.
    def enterWhile_loop(self, ctx:MyLanguageParser.While_loopContext):
        pass

    # Exit a parse tree produced by MyLanguageParser#while_loop.
    def exitWhile_loop(self, ctx:MyLanguageParser.While_loopContext):
        pass


    # Enter a parse tree produced by MyLanguageParser#for_loop.
    def enterFor_loop(self, ctx:MyLanguageParser.For_loopContext):
        pass

    # Exit a parse tree produced by MyLanguageParser#for_loop.
    def exitFor_loop(self, ctx:MyLanguageParser.For_loopContext):
        pass


    # Enter a parse tree produced by MyLanguageParser#comment.
    def enterComment(self, ctx:MyLanguageParser.CommentContext):
        pass

    # Exit a parse tree produced by MyLanguageParser#comment.
    def exitComment(self, ctx:MyLanguageParser.CommentContext):
        pass


    # Enter a parse tree produced by MyLanguageParser#array_begin.
    def enterArray_begin(self, ctx:MyLanguageParser.Array_beginContext):
        pass

    # Exit a parse tree produced by MyLanguageParser#array_begin.
    def exitArray_begin(self, ctx:MyLanguageParser.Array_beginContext):
        pass


    # Enter a parse tree produced by MyLanguageParser#continue_array.
    def enterContinue_array(self, ctx:MyLanguageParser.Continue_arrayContext):
        pass

    # Exit a parse tree produced by MyLanguageParser#continue_array.
    def exitContinue_array(self, ctx:MyLanguageParser.Continue_arrayContext):
        pass


    # Enter a parse tree produced by MyLanguageParser#conditional_statement.
    def enterConditional_statement(self, ctx:MyLanguageParser.Conditional_statementContext):
        pass

    # Exit a parse tree produced by MyLanguageParser#conditional_statement.
    def exitConditional_statement(self, ctx:MyLanguageParser.Conditional_statementContext):
        pass


    # Enter a parse tree produced by MyLanguageParser#conditional.
    def enterConditional(self, ctx:MyLanguageParser.ConditionalContext):
        pass

    # Exit a parse tree produced by MyLanguageParser#conditional.
    def exitConditional(self, ctx:MyLanguageParser.ConditionalContext):
        pass


    # Enter a parse tree produced by MyLanguageParser#continue_conditional.
    def enterContinue_conditional(self, ctx:MyLanguageParser.Continue_conditionalContext):
        pass

    # Exit a parse tree produced by MyLanguageParser#continue_conditional.
    def exitContinue_conditional(self, ctx:MyLanguageParser.Continue_conditionalContext):
        pass


    # Enter a parse tree produced by MyLanguageParser#block.
    def enterBlock(self, ctx:MyLanguageParser.BlockContext):
        pass

    # Exit a parse tree produced by MyLanguageParser#block.
    def exitBlock(self, ctx:MyLanguageParser.BlockContext):
        pass


    # Enter a parse tree produced by MyLanguageParser#continue_block.
    def enterContinue_block(self, ctx:MyLanguageParser.Continue_blockContext):
        pass

    # Exit a parse tree produced by MyLanguageParser#continue_block.
    def exitContinue_block(self, ctx:MyLanguageParser.Continue_blockContext):
        pass


    # Enter a parse tree produced by MyLanguageParser#id.
    def enterId(self, ctx:MyLanguageParser.IdContext):
        pass

    # Exit a parse tree produced by MyLanguageParser#id.
    def exitId(self, ctx:MyLanguageParser.IdContext):
        pass



del MyLanguageParser