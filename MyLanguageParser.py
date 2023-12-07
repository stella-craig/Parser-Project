# Generated from MyLanguage.g4 by ANTLR 4.13.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,27,157,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,1,0,4,0,34,8,0,11,0,12,0,35,1,1,1,1,1,1,1,1,
        3,1,42,8,1,1,2,1,2,1,2,1,2,1,3,1,3,1,3,1,3,1,3,1,3,1,3,3,3,55,8,
        3,1,3,1,3,1,3,5,3,60,8,3,10,3,12,3,63,9,3,1,4,1,4,3,4,67,8,4,1,5,
        1,5,3,5,71,8,5,1,5,1,5,3,5,75,8,5,1,5,1,5,1,5,1,6,1,6,1,6,1,6,1,
        6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,3,6,92,8,6,1,7,1,7,1,8,1,8,1,8,5,8,
        99,8,8,10,8,12,8,102,9,8,1,8,1,8,1,9,1,9,1,9,5,9,109,8,9,10,9,12,
        9,112,9,9,1,10,1,10,1,10,1,10,1,10,1,11,3,11,120,8,11,1,11,5,11,
        123,8,11,10,11,12,11,126,9,11,1,12,1,12,1,12,1,13,1,13,1,13,5,13,
        134,8,13,10,13,12,13,137,9,13,1,14,1,14,1,14,3,14,142,8,14,1,15,
        1,15,1,15,1,15,1,15,1,15,1,15,1,15,1,15,1,15,1,15,3,15,155,8,15,
        1,15,0,1,6,16,0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,0,2,1,0,
        1,5,1,0,21,25,166,0,33,1,0,0,0,2,41,1,0,0,0,4,43,1,0,0,0,6,54,1,
        0,0,0,8,66,1,0,0,0,10,68,1,0,0,0,12,91,1,0,0,0,14,93,1,0,0,0,16,
        95,1,0,0,0,18,105,1,0,0,0,20,113,1,0,0,0,22,119,1,0,0,0,24,127,1,
        0,0,0,26,130,1,0,0,0,28,141,1,0,0,0,30,154,1,0,0,0,32,34,3,2,1,0,
        33,32,1,0,0,0,34,35,1,0,0,0,35,33,1,0,0,0,35,36,1,0,0,0,36,1,1,0,
        0,0,37,42,3,14,7,0,38,42,3,20,10,0,39,42,3,4,2,0,40,42,3,8,4,0,41,
        37,1,0,0,0,41,38,1,0,0,0,41,39,1,0,0,0,41,40,1,0,0,0,42,3,1,0,0,
        0,43,44,5,21,0,0,44,45,5,17,0,0,45,46,3,6,3,0,46,5,1,0,0,0,47,48,
        6,3,-1,0,48,55,3,16,8,0,49,55,5,25,0,0,50,55,5,24,0,0,51,55,5,22,
        0,0,52,55,5,23,0,0,53,55,5,21,0,0,54,47,1,0,0,0,54,49,1,0,0,0,54,
        50,1,0,0,0,54,51,1,0,0,0,54,52,1,0,0,0,54,53,1,0,0,0,55,61,1,0,0,
        0,56,57,10,7,0,0,57,58,7,0,0,0,58,60,3,6,3,8,59,56,1,0,0,0,60,63,
        1,0,0,0,61,59,1,0,0,0,61,62,1,0,0,0,62,7,1,0,0,0,63,61,1,0,0,0,64,
        67,3,10,5,0,65,67,3,12,6,0,66,64,1,0,0,0,66,65,1,0,0,0,67,9,1,0,
        0,0,68,70,5,6,0,0,69,71,5,7,0,0,70,69,1,0,0,0,70,71,1,0,0,0,71,72,
        1,0,0,0,72,74,3,22,11,0,73,75,5,8,0,0,74,73,1,0,0,0,74,75,1,0,0,
        0,75,76,1,0,0,0,76,77,5,9,0,0,77,78,3,26,13,0,78,11,1,0,0,0,79,80,
        5,10,0,0,80,81,5,21,0,0,81,82,5,11,0,0,82,83,5,21,0,0,83,84,5,9,
        0,0,84,92,3,26,13,0,85,86,5,10,0,0,86,87,5,21,0,0,87,88,5,11,0,0,
        88,89,5,27,0,0,89,90,5,9,0,0,90,92,3,26,13,0,91,79,1,0,0,0,91,85,
        1,0,0,0,92,13,1,0,0,0,93,94,5,26,0,0,94,15,1,0,0,0,95,96,5,12,0,
        0,96,100,7,1,0,0,97,99,3,18,9,0,98,97,1,0,0,0,99,102,1,0,0,0,100,
        98,1,0,0,0,100,101,1,0,0,0,101,103,1,0,0,0,102,100,1,0,0,0,103,104,
        5,13,0,0,104,17,1,0,0,0,105,106,5,14,0,0,106,110,7,1,0,0,107,109,
        3,18,9,0,108,107,1,0,0,0,109,112,1,0,0,0,110,108,1,0,0,0,110,111,
        1,0,0,0,111,19,1,0,0,0,112,110,1,0,0,0,113,114,5,19,0,0,114,115,
        3,22,11,0,115,116,5,9,0,0,116,117,3,26,13,0,117,21,1,0,0,0,118,120,
        3,30,15,0,119,118,1,0,0,0,119,120,1,0,0,0,120,124,1,0,0,0,121,123,
        3,24,12,0,122,121,1,0,0,0,123,126,1,0,0,0,124,122,1,0,0,0,124,125,
        1,0,0,0,125,23,1,0,0,0,126,124,1,0,0,0,127,128,5,18,0,0,128,129,
        3,30,15,0,129,25,1,0,0,0,130,131,5,20,0,0,131,135,3,2,1,0,132,134,
        3,28,14,0,133,132,1,0,0,0,134,137,1,0,0,0,135,133,1,0,0,0,135,136,
        1,0,0,0,136,27,1,0,0,0,137,135,1,0,0,0,138,142,3,26,13,0,139,140,
        5,20,0,0,140,142,3,26,13,0,141,138,1,0,0,0,141,139,1,0,0,0,142,29,
        1,0,0,0,143,144,5,7,0,0,144,145,3,30,15,0,145,146,5,8,0,0,146,155,
        1,0,0,0,147,155,5,22,0,0,148,155,5,23,0,0,149,155,5,25,0,0,150,155,
        5,21,0,0,151,155,5,24,0,0,152,153,5,15,0,0,153,155,3,30,15,0,154,
        143,1,0,0,0,154,147,1,0,0,0,154,148,1,0,0,0,154,149,1,0,0,0,154,
        150,1,0,0,0,154,151,1,0,0,0,154,152,1,0,0,0,155,31,1,0,0,0,15,35,
        41,54,61,66,70,74,91,100,110,119,124,135,141,154
    ]

class MyLanguageParser ( Parser ):

    grammarFileName = "MyLanguage.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'+'", "'-'", "'*'", "'/'", "'%'", "'while'", 
                     "'('", "')'", "':'", "'for'", "'in'", "'['", "']'", 
                     "','", "'not'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "WS", "ASSIGNMENT_OPERATOR", "CONDITIONAL_OPERATORS", 
                      "CONDITION", "TAB", "IDENTIFIER", "INT", "FLOAT", 
                      "BOOL", "STRING", "COMMENT", "RANGE" ]

    RULE_start = 0
    RULE_statement = 1
    RULE_assignment_statement = 2
    RULE_expression = 3
    RULE_loop_statement = 4
    RULE_while_loop = 5
    RULE_for_loop = 6
    RULE_comment = 7
    RULE_array_begin = 8
    RULE_continue_array = 9
    RULE_conditional_statement = 10
    RULE_conditional = 11
    RULE_continue_conditional = 12
    RULE_block = 13
    RULE_continue_block = 14
    RULE_id = 15

    ruleNames =  [ "start", "statement", "assignment_statement", "expression", 
                   "loop_statement", "while_loop", "for_loop", "comment", 
                   "array_begin", "continue_array", "conditional_statement", 
                   "conditional", "continue_conditional", "block", "continue_block", 
                   "id" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    WS=16
    ASSIGNMENT_OPERATOR=17
    CONDITIONAL_OPERATORS=18
    CONDITION=19
    TAB=20
    IDENTIFIER=21
    INT=22
    FLOAT=23
    BOOL=24
    STRING=25
    COMMENT=26
    RANGE=27

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class StartContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MyLanguageParser.StatementContext)
            else:
                return self.getTypedRuleContext(MyLanguageParser.StatementContext,i)


        def getRuleIndex(self):
            return MyLanguageParser.RULE_start

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStart" ):
                listener.enterStart(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStart" ):
                listener.exitStart(self)




    def start(self):

        localctx = MyLanguageParser.StartContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_start)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 33 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 32
                self.statement()
                self.state = 35 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 69731392) != 0)):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def comment(self):
            return self.getTypedRuleContext(MyLanguageParser.CommentContext,0)


        def conditional_statement(self):
            return self.getTypedRuleContext(MyLanguageParser.Conditional_statementContext,0)


        def assignment_statement(self):
            return self.getTypedRuleContext(MyLanguageParser.Assignment_statementContext,0)


        def loop_statement(self):
            return self.getTypedRuleContext(MyLanguageParser.Loop_statementContext,0)


        def getRuleIndex(self):
            return MyLanguageParser.RULE_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStatement" ):
                listener.enterStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStatement" ):
                listener.exitStatement(self)




    def statement(self):

        localctx = MyLanguageParser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_statement)
        try:
            self.state = 41
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [26]:
                self.enterOuterAlt(localctx, 1)
                self.state = 37
                self.comment()
                pass
            elif token in [19]:
                self.enterOuterAlt(localctx, 2)
                self.state = 38
                self.conditional_statement()
                pass
            elif token in [21]:
                self.enterOuterAlt(localctx, 3)
                self.state = 39
                self.assignment_statement()
                pass
            elif token in [6, 10]:
                self.enterOuterAlt(localctx, 4)
                self.state = 40
                self.loop_statement()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Assignment_statementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IDENTIFIER(self):
            return self.getToken(MyLanguageParser.IDENTIFIER, 0)

        def ASSIGNMENT_OPERATOR(self):
            return self.getToken(MyLanguageParser.ASSIGNMENT_OPERATOR, 0)

        def expression(self):
            return self.getTypedRuleContext(MyLanguageParser.ExpressionContext,0)


        def getRuleIndex(self):
            return MyLanguageParser.RULE_assignment_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssignment_statement" ):
                listener.enterAssignment_statement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssignment_statement" ):
                listener.exitAssignment_statement(self)




    def assignment_statement(self):

        localctx = MyLanguageParser.Assignment_statementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_assignment_statement)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 43
            self.match(MyLanguageParser.IDENTIFIER)
            self.state = 44
            self.match(MyLanguageParser.ASSIGNMENT_OPERATOR)
            self.state = 45
            self.expression(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def array_begin(self):
            return self.getTypedRuleContext(MyLanguageParser.Array_beginContext,0)


        def STRING(self):
            return self.getToken(MyLanguageParser.STRING, 0)

        def BOOL(self):
            return self.getToken(MyLanguageParser.BOOL, 0)

        def INT(self):
            return self.getToken(MyLanguageParser.INT, 0)

        def FLOAT(self):
            return self.getToken(MyLanguageParser.FLOAT, 0)

        def IDENTIFIER(self):
            return self.getToken(MyLanguageParser.IDENTIFIER, 0)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MyLanguageParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(MyLanguageParser.ExpressionContext,i)


        def getRuleIndex(self):
            return MyLanguageParser.RULE_expression

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpression" ):
                listener.enterExpression(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpression" ):
                listener.exitExpression(self)



    def expression(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = MyLanguageParser.ExpressionContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 6
        self.enterRecursionRule(localctx, 6, self.RULE_expression, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 54
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [12]:
                self.state = 48
                self.array_begin()
                pass
            elif token in [25]:
                self.state = 49
                self.match(MyLanguageParser.STRING)
                pass
            elif token in [24]:
                self.state = 50
                self.match(MyLanguageParser.BOOL)
                pass
            elif token in [22]:
                self.state = 51
                self.match(MyLanguageParser.INT)
                pass
            elif token in [23]:
                self.state = 52
                self.match(MyLanguageParser.FLOAT)
                pass
            elif token in [21]:
                self.state = 53
                self.match(MyLanguageParser.IDENTIFIER)
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 61
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,3,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    localctx = MyLanguageParser.ExpressionContext(self, _parentctx, _parentState)
                    self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                    self.state = 56
                    if not self.precpred(self._ctx, 7):
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "self.precpred(self._ctx, 7)")
                    self.state = 57
                    _la = self._input.LA(1)
                    if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 62) != 0)):
                        self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume()
                    self.state = 58
                    self.expression(8) 
                self.state = 63
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,3,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class Loop_statementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def while_loop(self):
            return self.getTypedRuleContext(MyLanguageParser.While_loopContext,0)


        def for_loop(self):
            return self.getTypedRuleContext(MyLanguageParser.For_loopContext,0)


        def getRuleIndex(self):
            return MyLanguageParser.RULE_loop_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLoop_statement" ):
                listener.enterLoop_statement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLoop_statement" ):
                listener.exitLoop_statement(self)




    def loop_statement(self):

        localctx = MyLanguageParser.Loop_statementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_loop_statement)
        try:
            self.state = 66
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [6]:
                self.enterOuterAlt(localctx, 1)
                self.state = 64
                self.while_loop()
                pass
            elif token in [10]:
                self.enterOuterAlt(localctx, 2)
                self.state = 65
                self.for_loop()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class While_loopContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def conditional(self):
            return self.getTypedRuleContext(MyLanguageParser.ConditionalContext,0)


        def block(self):
            return self.getTypedRuleContext(MyLanguageParser.BlockContext,0)


        def getRuleIndex(self):
            return MyLanguageParser.RULE_while_loop

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWhile_loop" ):
                listener.enterWhile_loop(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWhile_loop" ):
                listener.exitWhile_loop(self)




    def while_loop(self):

        localctx = MyLanguageParser.While_loopContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_while_loop)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 68
            self.match(MyLanguageParser.T__5)
            self.state = 70
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,5,self._ctx)
            if la_ == 1:
                self.state = 69
                self.match(MyLanguageParser.T__6)


            self.state = 72
            self.conditional()
            self.state = 74
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==8:
                self.state = 73
                self.match(MyLanguageParser.T__7)


            self.state = 76
            self.match(MyLanguageParser.T__8)
            self.state = 77
            self.block()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class For_loopContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IDENTIFIER(self, i:int=None):
            if i is None:
                return self.getTokens(MyLanguageParser.IDENTIFIER)
            else:
                return self.getToken(MyLanguageParser.IDENTIFIER, i)

        def block(self):
            return self.getTypedRuleContext(MyLanguageParser.BlockContext,0)


        def RANGE(self):
            return self.getToken(MyLanguageParser.RANGE, 0)

        def getRuleIndex(self):
            return MyLanguageParser.RULE_for_loop

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFor_loop" ):
                listener.enterFor_loop(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFor_loop" ):
                listener.exitFor_loop(self)




    def for_loop(self):

        localctx = MyLanguageParser.For_loopContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_for_loop)
        try:
            self.state = 91
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,7,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 79
                self.match(MyLanguageParser.T__9)
                self.state = 80
                self.match(MyLanguageParser.IDENTIFIER)
                self.state = 81
                self.match(MyLanguageParser.T__10)
                self.state = 82
                self.match(MyLanguageParser.IDENTIFIER)
                self.state = 83
                self.match(MyLanguageParser.T__8)
                self.state = 84
                self.block()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 85
                self.match(MyLanguageParser.T__9)
                self.state = 86
                self.match(MyLanguageParser.IDENTIFIER)
                self.state = 87
                self.match(MyLanguageParser.T__10)
                self.state = 88
                self.match(MyLanguageParser.RANGE)
                self.state = 89
                self.match(MyLanguageParser.T__8)
                self.state = 90
                self.block()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CommentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def COMMENT(self):
            return self.getToken(MyLanguageParser.COMMENT, 0)

        def getRuleIndex(self):
            return MyLanguageParser.RULE_comment

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterComment" ):
                listener.enterComment(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitComment" ):
                listener.exitComment(self)




    def comment(self):

        localctx = MyLanguageParser.CommentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_comment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 93
            self.match(MyLanguageParser.COMMENT)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Array_beginContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IDENTIFIER(self):
            return self.getToken(MyLanguageParser.IDENTIFIER, 0)

        def BOOL(self):
            return self.getToken(MyLanguageParser.BOOL, 0)

        def INT(self):
            return self.getToken(MyLanguageParser.INT, 0)

        def FLOAT(self):
            return self.getToken(MyLanguageParser.FLOAT, 0)

        def STRING(self):
            return self.getToken(MyLanguageParser.STRING, 0)

        def continue_array(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MyLanguageParser.Continue_arrayContext)
            else:
                return self.getTypedRuleContext(MyLanguageParser.Continue_arrayContext,i)


        def getRuleIndex(self):
            return MyLanguageParser.RULE_array_begin

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArray_begin" ):
                listener.enterArray_begin(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArray_begin" ):
                listener.exitArray_begin(self)




    def array_begin(self):

        localctx = MyLanguageParser.Array_beginContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_array_begin)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 95
            self.match(MyLanguageParser.T__11)
            self.state = 96
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 65011712) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 100
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==14:
                self.state = 97
                self.continue_array()
                self.state = 102
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 103
            self.match(MyLanguageParser.T__12)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Continue_arrayContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IDENTIFIER(self):
            return self.getToken(MyLanguageParser.IDENTIFIER, 0)

        def BOOL(self):
            return self.getToken(MyLanguageParser.BOOL, 0)

        def INT(self):
            return self.getToken(MyLanguageParser.INT, 0)

        def FLOAT(self):
            return self.getToken(MyLanguageParser.FLOAT, 0)

        def STRING(self):
            return self.getToken(MyLanguageParser.STRING, 0)

        def continue_array(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MyLanguageParser.Continue_arrayContext)
            else:
                return self.getTypedRuleContext(MyLanguageParser.Continue_arrayContext,i)


        def getRuleIndex(self):
            return MyLanguageParser.RULE_continue_array

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterContinue_array" ):
                listener.enterContinue_array(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitContinue_array" ):
                listener.exitContinue_array(self)




    def continue_array(self):

        localctx = MyLanguageParser.Continue_arrayContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_continue_array)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 105
            self.match(MyLanguageParser.T__13)
            self.state = 106
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 65011712) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 110
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,9,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 107
                    self.continue_array() 
                self.state = 112
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,9,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Conditional_statementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CONDITION(self):
            return self.getToken(MyLanguageParser.CONDITION, 0)

        def conditional(self):
            return self.getTypedRuleContext(MyLanguageParser.ConditionalContext,0)


        def block(self):
            return self.getTypedRuleContext(MyLanguageParser.BlockContext,0)


        def getRuleIndex(self):
            return MyLanguageParser.RULE_conditional_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterConditional_statement" ):
                listener.enterConditional_statement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitConditional_statement" ):
                listener.exitConditional_statement(self)




    def conditional_statement(self):

        localctx = MyLanguageParser.Conditional_statementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_conditional_statement)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 113
            self.match(MyLanguageParser.CONDITION)
            self.state = 114
            self.conditional()
            self.state = 115
            self.match(MyLanguageParser.T__8)
            self.state = 116
            self.block()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ConditionalContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def id_(self):
            return self.getTypedRuleContext(MyLanguageParser.IdContext,0)


        def continue_conditional(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MyLanguageParser.Continue_conditionalContext)
            else:
                return self.getTypedRuleContext(MyLanguageParser.Continue_conditionalContext,i)


        def getRuleIndex(self):
            return MyLanguageParser.RULE_conditional

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterConditional" ):
                listener.enterConditional(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitConditional" ):
                listener.exitConditional(self)




    def conditional(self):

        localctx = MyLanguageParser.ConditionalContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_conditional)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 119
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 65044608) != 0):
                self.state = 118
                self.id_()


            self.state = 124
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==18:
                self.state = 121
                self.continue_conditional()
                self.state = 126
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Continue_conditionalContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CONDITIONAL_OPERATORS(self):
            return self.getToken(MyLanguageParser.CONDITIONAL_OPERATORS, 0)

        def id_(self):
            return self.getTypedRuleContext(MyLanguageParser.IdContext,0)


        def getRuleIndex(self):
            return MyLanguageParser.RULE_continue_conditional

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterContinue_conditional" ):
                listener.enterContinue_conditional(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitContinue_conditional" ):
                listener.exitContinue_conditional(self)




    def continue_conditional(self):

        localctx = MyLanguageParser.Continue_conditionalContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_continue_conditional)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 127
            self.match(MyLanguageParser.CONDITIONAL_OPERATORS)
            self.state = 128
            self.id_()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BlockContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TAB(self):
            return self.getToken(MyLanguageParser.TAB, 0)

        def statement(self):
            return self.getTypedRuleContext(MyLanguageParser.StatementContext,0)


        def continue_block(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MyLanguageParser.Continue_blockContext)
            else:
                return self.getTypedRuleContext(MyLanguageParser.Continue_blockContext,i)


        def getRuleIndex(self):
            return MyLanguageParser.RULE_block

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBlock" ):
                listener.enterBlock(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBlock" ):
                listener.exitBlock(self)




    def block(self):

        localctx = MyLanguageParser.BlockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_block)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 130
            self.match(MyLanguageParser.TAB)
            self.state = 131
            self.statement()
            self.state = 135
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,12,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 132
                    self.continue_block() 
                self.state = 137
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,12,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Continue_blockContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def block(self):
            return self.getTypedRuleContext(MyLanguageParser.BlockContext,0)


        def TAB(self):
            return self.getToken(MyLanguageParser.TAB, 0)

        def getRuleIndex(self):
            return MyLanguageParser.RULE_continue_block

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterContinue_block" ):
                listener.enterContinue_block(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitContinue_block" ):
                listener.exitContinue_block(self)




    def continue_block(self):

        localctx = MyLanguageParser.Continue_blockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_continue_block)
        try:
            self.state = 141
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,13,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 138
                self.block()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 139
                self.match(MyLanguageParser.TAB)
                self.state = 140
                self.block()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class IdContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def id_(self):
            return self.getTypedRuleContext(MyLanguageParser.IdContext,0)


        def INT(self):
            return self.getToken(MyLanguageParser.INT, 0)

        def FLOAT(self):
            return self.getToken(MyLanguageParser.FLOAT, 0)

        def STRING(self):
            return self.getToken(MyLanguageParser.STRING, 0)

        def IDENTIFIER(self):
            return self.getToken(MyLanguageParser.IDENTIFIER, 0)

        def BOOL(self):
            return self.getToken(MyLanguageParser.BOOL, 0)

        def getRuleIndex(self):
            return MyLanguageParser.RULE_id

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterId" ):
                listener.enterId(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitId" ):
                listener.exitId(self)




    def id_(self):

        localctx = MyLanguageParser.IdContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_id)
        try:
            self.state = 154
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [7]:
                self.enterOuterAlt(localctx, 1)
                self.state = 143
                self.match(MyLanguageParser.T__6)
                self.state = 144
                self.id_()
                self.state = 145
                self.match(MyLanguageParser.T__7)
                pass
            elif token in [22]:
                self.enterOuterAlt(localctx, 2)
                self.state = 147
                self.match(MyLanguageParser.INT)
                pass
            elif token in [23]:
                self.enterOuterAlt(localctx, 3)
                self.state = 148
                self.match(MyLanguageParser.FLOAT)
                pass
            elif token in [25]:
                self.enterOuterAlt(localctx, 4)
                self.state = 149
                self.match(MyLanguageParser.STRING)
                pass
            elif token in [21]:
                self.enterOuterAlt(localctx, 5)
                self.state = 150
                self.match(MyLanguageParser.IDENTIFIER)
                pass
            elif token in [24]:
                self.enterOuterAlt(localctx, 6)
                self.state = 151
                self.match(MyLanguageParser.BOOL)
                pass
            elif token in [15]:
                self.enterOuterAlt(localctx, 7)
                self.state = 152
                self.match(MyLanguageParser.T__14)
                self.state = 153
                self.id_()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[3] = self.expression_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expression_sempred(self, localctx:ExpressionContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 7)
         




