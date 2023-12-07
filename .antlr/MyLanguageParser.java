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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, WS=16, ASSIGNMENT_OPERATOR=17, 
		CONDITIONAL_OPERATORS=18, CONDITION=19, TAB=20, IDENTIFIER=21, INT=22, 
		FLOAT=23, BOOL=24, STRING=25, COMMENT=26, RANGE=27;
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_assignment_statement = 2, RULE_expression = 3, 
		RULE_loop_statement = 4, RULE_while_loop = 5, RULE_for_loop = 6, RULE_comment = 7, 
		RULE_array_begin = 8, RULE_continue_array = 9, RULE_conditional_statement = 10, 
		RULE_conditional = 11, RULE_continue_conditional = 12, RULE_block = 13, 
		RULE_continue_block = 14, RULE_id = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statement", "assignment_statement", "expression", "loop_statement", 
			"while_loop", "for_loop", "comment", "array_begin", "continue_array", 
			"conditional_statement", "conditional", "continue_conditional", "block", 
			"continue_block", "id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'while'", "'('", "')'", "':'", 
			"'for'", "'in'", "'['", "']'", "','", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "WS", "ASSIGNMENT_OPERATOR", "CONDITIONAL_OPERATORS", 
			"CONDITION", "TAB", "IDENTIFIER", "INT", "FLOAT", "BOOL", "STRING", "COMMENT", 
			"RANGE"
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
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				statement();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 69731392L) != 0) );
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
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
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
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				comment();
				}
				break;
			case CONDITION:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				conditional_statement();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				assignment_statement();
				}
				break;
			case T__5:
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				loop_statement();
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
	public static class Assignment_statementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MyLanguageParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT_OPERATOR() { return getToken(MyLanguageParser.ASSIGNMENT_OPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(IDENTIFIER);
			setState(44);
			match(ASSIGNMENT_OPERATOR);
			setState(45);
			expression(0);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(48);
				array_begin();
				}
				break;
			case STRING:
				{
				setState(49);
				match(STRING);
				}
				break;
			case BOOL:
				{
				setState(50);
				match(BOOL);
				}
				break;
			case INT:
				{
				setState(51);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(52);
				match(FLOAT);
				}
				break;
			case IDENTIFIER:
				{
				setState(53);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(61);
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
					setState(56);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(57);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(58);
					expression(8);
					}
					} 
				}
				setState(63);
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
	public static class Loop_statementContext extends ParserRuleContext {
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loop_statement);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				while_loop();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				for_loop();
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
	public static class While_loopContext extends ParserRuleContext {
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__5);
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(69);
				match(T__6);
				}
				break;
			}
			setState(72);
			conditional();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(73);
				match(T__7);
				}
			}

			setState(76);
			match(T__8);
			setState(77);
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
	public static class For_loopContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MyLanguageParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MyLanguageParser.IDENTIFIER, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RANGE() { return getToken(MyLanguageParser.RANGE, 0); }
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_for_loop);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(T__9);
				setState(80);
				match(IDENTIFIER);
				setState(81);
				match(T__10);
				setState(82);
				match(IDENTIFIER);
				setState(83);
				match(T__8);
				setState(84);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(T__9);
				setState(86);
				match(IDENTIFIER);
				setState(87);
				match(T__10);
				setState(88);
				match(RANGE);
				setState(89);
				match(T__8);
				setState(90);
				block();
				}
				break;
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
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(MyLanguageParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(COMMENT);
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
		enterRule(_localctx, 16, RULE_array_begin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__11);
			setState(96);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 65011712L) != 0)) ) {
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
			while (_la==T__13) {
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
			match(T__12);
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
		enterRule(_localctx, 18, RULE_continue_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__13);
			setState(106);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 65011712L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
	public static class Conditional_statementContext extends ParserRuleContext {
		public TerminalNode CONDITION() { return getToken(MyLanguageParser.CONDITION, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Conditional_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_statement; }
	}

	public final Conditional_statementContext conditional_statement() throws RecognitionException {
		Conditional_statementContext _localctx = new Conditional_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conditional_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(CONDITION);
			setState(114);
			conditional();
			setState(115);
			match(T__8);
			setState(116);
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
	public static class ConditionalContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<Continue_conditionalContext> continue_conditional() {
			return getRuleContexts(Continue_conditionalContext.class);
		}
		public Continue_conditionalContext continue_conditional(int i) {
			return getRuleContext(Continue_conditionalContext.class,i);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 65044608L) != 0)) {
				{
				setState(118);
				id();
				}
			}

			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONDITIONAL_OPERATORS) {
				{
				{
				setState(121);
				continue_conditional();
				}
				}
				setState(126);
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
		enterRule(_localctx, 24, RULE_continue_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(CONDITIONAL_OPERATORS);
			setState(128);
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
		enterRule(_localctx, 26, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(TAB);
			setState(131);
			statement();
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(132);
					continue_block();
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		public TerminalNode TAB() { return getToken(MyLanguageParser.TAB, 0); }
		public Continue_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_block; }
	}

	public final Continue_blockContext continue_block() throws RecognitionException {
		Continue_blockContext _localctx = new Continue_blockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_continue_block);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(TAB);
				setState(140);
				block();
				}
				break;
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
		enterRule(_localctx, 30, RULE_id);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(T__6);
				setState(144);
				id();
				setState(145);
				match(T__7);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				match(STRING);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				match(IDENTIFIER);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 6);
				{
				setState(151);
				match(BOOL);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 7);
				{
				setState(152);
				match(T__14);
				setState(153);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001b\u009d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0001\u0000\u0004\u0000\"\b\u0000\u000b\u0000\f\u0000#\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001*\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00037\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003<\b\u0003\n\u0003\f\u0003"+
		"?\t\u0003\u0001\u0004\u0001\u0004\u0003\u0004C\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0003\u0005G\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005K\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\\\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\bc\b\b\n\b\f\bf\t\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0005\tm\b\t\n\t\f\tp\t\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0003\u000bx\b\u000b\u0001\u000b"+
		"\u0005\u000b{\b\u000b\n\u000b\f\u000b~\t\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0005\r\u0086\b\r\n\r\f\r\u0089\t\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u008e\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u009b\b\u000f\u0001\u000f"+
		"\u0000\u0001\u0006\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0002\u0001\u0000\u0001\u0005"+
		"\u0001\u0000\u0015\u0019\u00a6\u0000!\u0001\u0000\u0000\u0000\u0002)\u0001"+
		"\u0000\u0000\u0000\u0004+\u0001\u0000\u0000\u0000\u00066\u0001\u0000\u0000"+
		"\u0000\bB\u0001\u0000\u0000\u0000\nD\u0001\u0000\u0000\u0000\f[\u0001"+
		"\u0000\u0000\u0000\u000e]\u0001\u0000\u0000\u0000\u0010_\u0001\u0000\u0000"+
		"\u0000\u0012i\u0001\u0000\u0000\u0000\u0014q\u0001\u0000\u0000\u0000\u0016"+
		"w\u0001\u0000\u0000\u0000\u0018\u007f\u0001\u0000\u0000\u0000\u001a\u0082"+
		"\u0001\u0000\u0000\u0000\u001c\u008d\u0001\u0000\u0000\u0000\u001e\u009a"+
		"\u0001\u0000\u0000\u0000 \"\u0003\u0002\u0001\u0000! \u0001\u0000\u0000"+
		"\u0000\"#\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000"+
		"\u0000\u0000$\u0001\u0001\u0000\u0000\u0000%*\u0003\u000e\u0007\u0000"+
		"&*\u0003\u0014\n\u0000\'*\u0003\u0004\u0002\u0000(*\u0003\b\u0004\u0000"+
		")%\u0001\u0000\u0000\u0000)&\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000"+
		"\u0000)(\u0001\u0000\u0000\u0000*\u0003\u0001\u0000\u0000\u0000+,\u0005"+
		"\u0015\u0000\u0000,-\u0005\u0011\u0000\u0000-.\u0003\u0006\u0003\u0000"+
		".\u0005\u0001\u0000\u0000\u0000/0\u0006\u0003\uffff\uffff\u000007\u0003"+
		"\u0010\b\u000017\u0005\u0019\u0000\u000027\u0005\u0018\u0000\u000037\u0005"+
		"\u0016\u0000\u000047\u0005\u0017\u0000\u000057\u0005\u0015\u0000\u0000"+
		"6/\u0001\u0000\u0000\u000061\u0001\u0000\u0000\u000062\u0001\u0000\u0000"+
		"\u000063\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000065\u0001\u0000"+
		"\u0000\u00007=\u0001\u0000\u0000\u000089\n\u0007\u0000\u00009:\u0007\u0000"+
		"\u0000\u0000:<\u0003\u0006\u0003\b;8\u0001\u0000\u0000\u0000<?\u0001\u0000"+
		"\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>\u0007"+
		"\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@C\u0003\n\u0005\u0000"+
		"AC\u0003\f\u0006\u0000B@\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000"+
		"C\t\u0001\u0000\u0000\u0000DF\u0005\u0006\u0000\u0000EG\u0005\u0007\u0000"+
		"\u0000FE\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000HJ\u0003\u0016\u000b\u0000IK\u0005\b\u0000\u0000JI\u0001\u0000"+
		"\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0005"+
		"\t\u0000\u0000MN\u0003\u001a\r\u0000N\u000b\u0001\u0000\u0000\u0000OP"+
		"\u0005\n\u0000\u0000PQ\u0005\u0015\u0000\u0000QR\u0005\u000b\u0000\u0000"+
		"RS\u0005\u0015\u0000\u0000ST\u0005\t\u0000\u0000T\\\u0003\u001a\r\u0000"+
		"UV\u0005\n\u0000\u0000VW\u0005\u0015\u0000\u0000WX\u0005\u000b\u0000\u0000"+
		"XY\u0005\u001b\u0000\u0000YZ\u0005\t\u0000\u0000Z\\\u0003\u001a\r\u0000"+
		"[O\u0001\u0000\u0000\u0000[U\u0001\u0000\u0000\u0000\\\r\u0001\u0000\u0000"+
		"\u0000]^\u0005\u001a\u0000\u0000^\u000f\u0001\u0000\u0000\u0000_`\u0005"+
		"\f\u0000\u0000`d\u0007\u0001\u0000\u0000ac\u0003\u0012\t\u0000ba\u0001"+
		"\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000eg\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000"+
		"\u0000gh\u0005\r\u0000\u0000h\u0011\u0001\u0000\u0000\u0000ij\u0005\u000e"+
		"\u0000\u0000jn\u0007\u0001\u0000\u0000km\u0003\u0012\t\u0000lk\u0001\u0000"+
		"\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001"+
		"\u0000\u0000\u0000o\u0013\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000"+
		"\u0000qr\u0005\u0013\u0000\u0000rs\u0003\u0016\u000b\u0000st\u0005\t\u0000"+
		"\u0000tu\u0003\u001a\r\u0000u\u0015\u0001\u0000\u0000\u0000vx\u0003\u001e"+
		"\u000f\u0000wv\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x|\u0001"+
		"\u0000\u0000\u0000y{\u0003\u0018\f\u0000zy\u0001\u0000\u0000\u0000{~\u0001"+
		"\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000"+
		"}\u0017\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0005\u0012\u0000\u0000\u0080\u0081\u0003\u001e\u000f\u0000\u0081\u0019"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u0014\u0000\u0000\u0083\u0087"+
		"\u0003\u0002\u0001\u0000\u0084\u0086\u0003\u001c\u000e\u0000\u0085\u0084"+
		"\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u001b"+
		"\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008e"+
		"\u0003\u001a\r\u0000\u008b\u008c\u0005\u0014\u0000\u0000\u008c\u008e\u0003"+
		"\u001a\r\u0000\u008d\u008a\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000"+
		"\u0000\u0000\u008e\u001d\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u0007"+
		"\u0000\u0000\u0090\u0091\u0003\u001e\u000f\u0000\u0091\u0092\u0005\b\u0000"+
		"\u0000\u0092\u009b\u0001\u0000\u0000\u0000\u0093\u009b\u0005\u0016\u0000"+
		"\u0000\u0094\u009b\u0005\u0017\u0000\u0000\u0095\u009b\u0005\u0019\u0000"+
		"\u0000\u0096\u009b\u0005\u0015\u0000\u0000\u0097\u009b\u0005\u0018\u0000"+
		"\u0000\u0098\u0099\u0005\u000f\u0000\u0000\u0099\u009b\u0003\u001e\u000f"+
		"\u0000\u009a\u008f\u0001\u0000\u0000\u0000\u009a\u0093\u0001\u0000\u0000"+
		"\u0000\u009a\u0094\u0001\u0000\u0000\u0000\u009a\u0095\u0001\u0000\u0000"+
		"\u0000\u009a\u0096\u0001\u0000\u0000\u0000\u009a\u0097\u0001\u0000\u0000"+
		"\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u001f\u0001\u0000\u0000"+
		"\u0000\u000f#)6=BFJ[dnw|\u0087\u008d\u009a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}