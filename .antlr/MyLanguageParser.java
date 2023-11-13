// Generated from c:/Users/mayab/OneDrive - University of Missouri/Desktop/Coding Projects/School/Principles_of_Programming_Language/Parser-Project/MyLanguage.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MyLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, CONDITIONAL_OPERATORS=13, CONDITION=14, ASSIGNMENT_OPERATOR=15, 
		TAB=16, WS=17, IDENTIFIER=18, INT=19, FLOAT=20, BOOL=21, IDENTIFIER_NUM=22, 
		STRING=23;
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_expression = 2, RULE_conditional = 3, 
		RULE_conditional_statement = 4, RULE_continue_conditional = 5, RULE_block = 6, 
		RULE_continue_block = 7, RULE_id = 8, RULE_array_begin = 9, RULE_continue_array = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statement", "expression", "conditional", "conditional_statement", 
			"continue_conditional", "block", "continue_block", "id", "array_begin", 
			"continue_array"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "':'", "'('", "')'", "'not'", 
			"'['", "']'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "CONDITIONAL_OPERATORS", "CONDITION", "ASSIGNMENT_OPERATOR", "TAB", 
			"WS", "IDENTIFIER", "INT", "FLOAT", "BOOL", "IDENTIFIER_NUM", "STRING"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MyLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				statement();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CONDITION || _la==IDENTIFIER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MyLanguageParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT_OPERATOR() { return getToken(MyLanguageParser.ASSIGNMENT_OPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				match(IDENTIFIER);
				setState(28);
				match(ASSIGNMENT_OPERATOR);
				setState(29);
				expression(0);
				}
				break;
			case CONDITION:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				conditional();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Array_beginContext array_begin() {
			return getRuleContext(Array_beginContext.class,0);
		}
		public TerminalNode STRING() { return getToken(MyLanguageParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(MyLanguageParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(MyLanguageParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(MyLanguageParser.FLOAT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MyLanguageParser.IDENTIFIER, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				{
				setState(34);
				array_begin();
				}
				break;
			case STRING:
				{
				setState(35);
				match(STRING);
				}
				break;
			case BOOL:
				{
				setState(36);
				match(BOOL);
				}
				break;
			case INT:
				{
				setState(37);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(38);
				match(FLOAT);
				}
				break;
			case IDENTIFIER:
				{
				setState(39);
				match(IDENTIFIER);
				}
				break;
			case CONDITION:
				{
				setState(40);
				conditional();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(43);
					if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
					setState(44);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(45);
					expression(9);
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode CONDITION() { return getToken(MyLanguageParser.CONDITION, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(CONDITION);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12321408L) != 0)) {
				{
				setState(52);
				conditional_statement();
				}
			}

			setState(55);
			match(T__5);
			setState(56);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Conditional_statementContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode CONDITIONAL_OPERATORS() { return getToken(MyLanguageParser.CONDITIONAL_OPERATORS, 0); }
		public List<Continue_conditionalContext> continue_conditional() {
			return getRuleContexts(Continue_conditionalContext.class);
		}
		public Continue_conditionalContext continue_conditional(int i) {
			return getRuleContext(Continue_conditionalContext.class,i);
		}
		public Conditional_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_statement; }
	}

	public final Conditional_statementContext conditional_statement() throws RecognitionException {
		Conditional_statementContext _localctx = new Conditional_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_conditional_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			id();
			setState(59);
			match(CONDITIONAL_OPERATORS);
			setState(60);
			id();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONDITIONAL_OPERATORS) {
				{
				{
				setState(61);
				continue_conditional();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Continue_conditionalContext extends ParserRuleContext {
		public TerminalNode CONDITIONAL_OPERATORS() { return getToken(MyLanguageParser.CONDITIONAL_OPERATORS, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Continue_conditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_conditional; }
	}

	public final Continue_conditionalContext continue_conditional() throws RecognitionException {
		Continue_conditionalContext _localctx = new Continue_conditionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_continue_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(CONDITIONAL_OPERATORS);
			setState(68);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode TAB() { return getToken(MyLanguageParser.TAB, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<Continue_blockContext> continue_block() {
			return getRuleContexts(Continue_blockContext.class);
		}
		public Continue_blockContext continue_block(int i) {
			return getRuleContext(Continue_blockContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(TAB);
			setState(71);
			statement();
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(72);
					continue_block();
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Continue_blockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Continue_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_block; }
	}

	public final Continue_blockContext continue_block() throws RecognitionException {
		Continue_blockContext _localctx = new Continue_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_continue_block);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAB:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				block();
				}
				break;
			case CONDITION:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode INT() { return getToken(MyLanguageParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(MyLanguageParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(MyLanguageParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MyLanguageParser.IDENTIFIER, 0); }
		public TerminalNode BOOL() { return getToken(MyLanguageParser.BOOL, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_id);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(T__6);
				setState(83);
				id();
				setState(84);
				match(T__7);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				match(STRING);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				match(IDENTIFIER);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 6);
				{
				setState(90);
				match(BOOL);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 7);
				{
				setState(91);
				match(T__8);
				setState(92);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_beginContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MyLanguageParser.IDENTIFIER, 0); }
		public TerminalNode BOOL() { return getToken(MyLanguageParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(MyLanguageParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(MyLanguageParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(MyLanguageParser.STRING, 0); }
		public List<Continue_arrayContext> continue_array() {
			return getRuleContexts(Continue_arrayContext.class);
		}
		public Continue_arrayContext continue_array(int i) {
			return getRuleContext(Continue_arrayContext.class,i);
		}
		public Array_beginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_begin; }
	}

	public final Array_beginContext array_begin() throws RecognitionException {
		Array_beginContext _localctx = new Array_beginContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_array_begin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__9);
			setState(96);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 12320768L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(97);
				continue_array();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Continue_arrayContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MyLanguageParser.IDENTIFIER, 0); }
		public TerminalNode BOOL() { return getToken(MyLanguageParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(MyLanguageParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(MyLanguageParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(MyLanguageParser.STRING, 0); }
		public List<Continue_arrayContext> continue_array() {
			return getRuleContexts(Continue_arrayContext.class);
		}
		public Continue_arrayContext continue_array(int i) {
			return getRuleContext(Continue_arrayContext.class,i);
		}
		public Continue_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_array; }
	}

	public final Continue_arrayContext continue_array() throws RecognitionException {
		Continue_arrayContext _localctx = new Continue_arrayContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_continue_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__11);
			setState(106);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 12320768L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(107);
					continue_array();
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0017r\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0004\u0000\u0018"+
		"\b\u0000\u000b\u0000\f\u0000\u0019\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001 \b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"*\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002/\b\u0002\n\u0002"+
		"\f\u00022\t\u0002\u0001\u0003\u0001\u0003\u0003\u00036\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004?\b\u0004\n\u0004\f\u0004B\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006J\b\u0006"+
		"\n\u0006\f\u0006M\t\u0006\u0001\u0007\u0001\u0007\u0003\u0007Q\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b^\b\b\u0001\t\u0001\t\u0001\t\u0005\tc\b\t\n"+
		"\t\f\tf\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\nm\b\n\n\n\f"+
		"\np\t\n\u0001\n\u0000\u0001\u0004\u000b\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0000\u0002\u0001\u0000\u0001\u0005\u0002\u0000"+
		"\u0012\u0015\u0017\u0017{\u0000\u0017\u0001\u0000\u0000\u0000\u0002\u001f"+
		"\u0001\u0000\u0000\u0000\u0004)\u0001\u0000\u0000\u0000\u00063\u0001\u0000"+
		"\u0000\u0000\b:\u0001\u0000\u0000\u0000\nC\u0001\u0000\u0000\u0000\fF"+
		"\u0001\u0000\u0000\u0000\u000eP\u0001\u0000\u0000\u0000\u0010]\u0001\u0000"+
		"\u0000\u0000\u0012_\u0001\u0000\u0000\u0000\u0014i\u0001\u0000\u0000\u0000"+
		"\u0016\u0018\u0003\u0002\u0001\u0000\u0017\u0016\u0001\u0000\u0000\u0000"+
		"\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000"+
		"\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u0001\u0001\u0000\u0000\u0000"+
		"\u001b\u001c\u0005\u0012\u0000\u0000\u001c\u001d\u0005\u000f\u0000\u0000"+
		"\u001d \u0003\u0004\u0002\u0000\u001e \u0003\u0006\u0003\u0000\u001f\u001b"+
		"\u0001\u0000\u0000\u0000\u001f\u001e\u0001\u0000\u0000\u0000 \u0003\u0001"+
		"\u0000\u0000\u0000!\"\u0006\u0002\uffff\uffff\u0000\"*\u0003\u0012\t\u0000"+
		"#*\u0005\u0017\u0000\u0000$*\u0005\u0015\u0000\u0000%*\u0005\u0013\u0000"+
		"\u0000&*\u0005\u0014\u0000\u0000\'*\u0005\u0012\u0000\u0000(*\u0003\u0006"+
		"\u0003\u0000)!\u0001\u0000\u0000\u0000)#\u0001\u0000\u0000\u0000)$\u0001"+
		"\u0000\u0000\u0000)%\u0001\u0000\u0000\u0000)&\u0001\u0000\u0000\u0000"+
		")\'\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000*0\u0001\u0000\u0000"+
		"\u0000+,\n\b\u0000\u0000,-\u0007\u0000\u0000\u0000-/\u0003\u0004\u0002"+
		"\t.+\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u00001\u0005\u0001\u0000\u0000\u000020\u0001"+
		"\u0000\u0000\u000035\u0005\u000e\u0000\u000046\u0003\b\u0004\u000054\u0001"+
		"\u0000\u0000\u000056\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u0000"+
		"78\u0005\u0006\u0000\u000089\u0003\f\u0006\u00009\u0007\u0001\u0000\u0000"+
		"\u0000:;\u0003\u0010\b\u0000;<\u0005\r\u0000\u0000<@\u0003\u0010\b\u0000"+
		"=?\u0003\n\u0005\u0000>=\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000"+
		"@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A\t\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000CD\u0005\r\u0000\u0000DE\u0003\u0010\b"+
		"\u0000E\u000b\u0001\u0000\u0000\u0000FG\u0005\u0010\u0000\u0000GK\u0003"+
		"\u0002\u0001\u0000HJ\u0003\u000e\u0007\u0000IH\u0001\u0000\u0000\u0000"+
		"JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000L\r\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000NQ\u0003\f"+
		"\u0006\u0000OQ\u0003\u0002\u0001\u0000PN\u0001\u0000\u0000\u0000PO\u0001"+
		"\u0000\u0000\u0000Q\u000f\u0001\u0000\u0000\u0000RS\u0005\u0007\u0000"+
		"\u0000ST\u0003\u0010\b\u0000TU\u0005\b\u0000\u0000U^\u0001\u0000\u0000"+
		"\u0000V^\u0005\u0013\u0000\u0000W^\u0005\u0014\u0000\u0000X^\u0005\u0017"+
		"\u0000\u0000Y^\u0005\u0012\u0000\u0000Z^\u0005\u0015\u0000\u0000[\\\u0005"+
		"\t\u0000\u0000\\^\u0003\u0010\b\u0000]R\u0001\u0000\u0000\u0000]V\u0001"+
		"\u0000\u0000\u0000]W\u0001\u0000\u0000\u0000]X\u0001\u0000\u0000\u0000"+
		"]Y\u0001\u0000\u0000\u0000]Z\u0001\u0000\u0000\u0000][\u0001\u0000\u0000"+
		"\u0000^\u0011\u0001\u0000\u0000\u0000_`\u0005\n\u0000\u0000`d\u0007\u0001"+
		"\u0000\u0000ac\u0003\u0014\n\u0000ba\u0001\u0000\u0000\u0000cf\u0001\u0000"+
		"\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eg\u0001"+
		"\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000gh\u0005\u000b\u0000\u0000"+
		"h\u0013\u0001\u0000\u0000\u0000ij\u0005\f\u0000\u0000jn\u0007\u0001\u0000"+
		"\u0000km\u0003\u0014\n\u0000lk\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000"+
		"\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o\u0015\u0001"+
		"\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000\u000b\u0019\u001f)05@KP]"+
		"dn";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}