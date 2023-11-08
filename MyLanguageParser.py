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
        4,1,19,35,2,0,7,0,2,1,7,1,2,2,7,2,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,
        1,1,1,3,1,16,8,1,1,2,1,2,1,2,1,2,1,2,1,2,1,2,3,2,25,8,2,1,2,1,2,
        1,2,5,2,30,8,2,10,2,12,2,33,9,2,1,2,0,1,4,3,0,2,4,0,1,1,0,10,14,
        35,0,6,1,0,0,0,2,15,1,0,0,0,4,24,1,0,0,0,6,7,3,2,1,0,7,8,5,0,0,1,
        8,1,1,0,0,0,9,10,5,17,0,0,10,11,5,9,0,0,11,16,3,4,2,0,12,13,5,17,
        0,0,13,14,5,1,0,0,14,16,5,4,0,0,15,9,1,0,0,0,15,12,1,0,0,0,16,3,
        1,0,0,0,17,18,6,2,-1,0,18,19,5,2,0,0,19,20,3,4,2,0,20,21,5,3,0,0,
        21,25,1,0,0,0,22,25,5,16,0,0,23,25,5,17,0,0,24,17,1,0,0,0,24,22,
        1,0,0,0,24,23,1,0,0,0,25,31,1,0,0,0,26,27,10,4,0,0,27,28,7,0,0,0,
        28,30,3,4,2,5,29,26,1,0,0,0,30,33,1,0,0,0,31,29,1,0,0,0,31,32,1,
        0,0,0,32,5,1,0,0,0,33,31,1,0,0,0,3,15,24,31
    ]

class MyLanguageParser ( Parser ):

    grammarFileName = "MyLanguage.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'='", "'('", "')'", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "']'", "<INVALID>", "'+'", 
                     "'-'", "'*'", "'/'", "'%'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "LITERAL", "ARRAY", "ARRAY_BEGIN", "CONTINUE_ARRAY", 
                      "END_ARRAY", "ASSIGNMENT_OPERATOR", "PLUS", "MINUS", 
                      "TIMES", "DIVIDE", "MOD", "STRING", "NUMBER", "IDENTIFIER", 
                      "BOOL", "WS" ]

    RULE_start = 0
    RULE_statement = 1
    RULE_expression = 2

    ruleNames =  [ "start", "statement", "expression" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    LITERAL=4
    ARRAY=5
    ARRAY_BEGIN=6
    CONTINUE_ARRAY=7
    END_ARRAY=8
    ASSIGNMENT_OPERATOR=9
    PLUS=10
    MINUS=11
    TIMES=12
    DIVIDE=13
    MOD=14
    STRING=15
    NUMBER=16
    IDENTIFIER=17
    BOOL=18
    WS=19

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

        def statement(self):
            return self.getTypedRuleContext(MyLanguageParser.StatementContext,0)


        def EOF(self):
            return self.getToken(MyLanguageParser.EOF, 0)

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
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 6
            self.statement()
            self.state = 7
            self.match(MyLanguageParser.EOF)
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

        def IDENTIFIER(self):
            return self.getToken(MyLanguageParser.IDENTIFIER, 0)

        def ASSIGNMENT_OPERATOR(self):
            return self.getToken(MyLanguageParser.ASSIGNMENT_OPERATOR, 0)

        def expression(self):
            return self.getTypedRuleContext(MyLanguageParser.ExpressionContext,0)


        def LITERAL(self):
            return self.getToken(MyLanguageParser.LITERAL, 0)

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
            self.state = 15
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,0,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 9
                self.match(MyLanguageParser.IDENTIFIER)
                self.state = 10
                self.match(MyLanguageParser.ASSIGNMENT_OPERATOR)
                self.state = 11
                self.expression(0)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 12
                self.match(MyLanguageParser.IDENTIFIER)
                self.state = 13
                self.match(MyLanguageParser.T__0)
                self.state = 14
                self.match(MyLanguageParser.LITERAL)
                pass


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
            self.op = None # Token

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MyLanguageParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(MyLanguageParser.ExpressionContext,i)


        def NUMBER(self):
            return self.getToken(MyLanguageParser.NUMBER, 0)

        def IDENTIFIER(self):
            return self.getToken(MyLanguageParser.IDENTIFIER, 0)

        def PLUS(self):
            return self.getToken(MyLanguageParser.PLUS, 0)

        def MINUS(self):
            return self.getToken(MyLanguageParser.MINUS, 0)

        def TIMES(self):
            return self.getToken(MyLanguageParser.TIMES, 0)

        def DIVIDE(self):
            return self.getToken(MyLanguageParser.DIVIDE, 0)

        def MOD(self):
            return self.getToken(MyLanguageParser.MOD, 0)

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
        _startState = 4
        self.enterRecursionRule(localctx, 4, self.RULE_expression, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 24
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [2]:
                self.state = 18
                self.match(MyLanguageParser.T__1)
                self.state = 19
                self.expression(0)
                self.state = 20
                self.match(MyLanguageParser.T__2)
                pass
            elif token in [16]:
                self.state = 22
                self.match(MyLanguageParser.NUMBER)
                pass
            elif token in [17]:
                self.state = 23
                self.match(MyLanguageParser.IDENTIFIER)
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 31
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,2,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    localctx = MyLanguageParser.ExpressionContext(self, _parentctx, _parentState)
                    self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                    self.state = 26
                    if not self.precpred(self._ctx, 4):
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "self.precpred(self._ctx, 4)")
                    self.state = 27
                    localctx.op = self._input.LT(1)
                    _la = self._input.LA(1)
                    if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 31744) != 0)):
                        localctx.op = self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume()
                    self.state = 28
                    self.expression(5) 
                self.state = 33
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,2,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[2] = self.expression_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expression_sempred(self, localctx:ExpressionContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 4)
         




