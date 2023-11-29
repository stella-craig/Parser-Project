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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, ASSIGNMENT_OPERATOR=16, 
		CONDITIONAL_OPERATORS=17, CONDITION=18, WS=19, TAB=20, IDENTIFIER=21, 
		INT=22, FLOAT=23, BOOL=24, STRING=25, COMMENT=26, RANGE=27;
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_loop_statement = 2, RULE_while_loop = 3, 
		RULE_for_loop = 4, RULE_comment = 5, RULE_assignment_statement = 6, RULE_expression = 7, 
		RULE_array_begin = 8, RULE_continue_array = 9, RULE_conditional_statement = 10, 
		RULE_conditional = 11, RULE_continue_conditional = 12, RULE_block = 13, 
		RULE_continue_block = 14, RULE_id = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statement", "loop_statement", "while_loop", "for_loop", "comment", 
			"assignment_statement", "expression", "array_begin", "continue_array", 
			"conditional_statement", "conditional", "continue_conditional", "block", 
			"continue_block", "id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'while'", "'('", "')'", "':'", "'for'", "'in'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'['", "']'", "','", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "ASSIGNMENT_OPERATOR", "CONDITIONAL_OPERATORS", 
			"CONDITION", "WS", "TAB", "IDENTIFIER", "INT", "FLOAT", "BOOL", "STRING", 
			"COMMENT", "RANGE"
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 69468194L) != 0) );
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
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
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
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				assignment_statement();
				}
				break;
			case CONDITION:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				conditional_statement();
				}
				break;
			case T__0:
			case T__4:
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
		enterRule(_localctx, 4, RULE_loop_statement);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				while_loop();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
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
		enterRule(_localctx, 6, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__0);
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(48);
				match(T__1);
				}
				break;
			}
			setState(51);
			conditional();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(52);
				match(T__2);
				}
			}

			setState(55);
			match(T__3);
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
		enterRule(_localctx, 8, RULE_for_loop);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(T__4);
				setState(59);
				match(IDENTIFIER);
				setState(60);
				match(T__5);
				setState(61);
				match(IDENTIFIER);
				setState(62);
				match(T__3);
				setState(63);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(T__4);
				setState(65);
				match(IDENTIFIER);
				setState(66);
				match(T__5);
				setState(67);
				match(RANGE);
				setState(68);
				match(T__3);
				setState(69);
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
		enterRule(_localctx, 10, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
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
		enterRule(_localctx, 12, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(IDENTIFIER);
			setState(75);
			match(ASSIGNMENT_OPERATOR);
			setState(76);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(79);
				array_begin();
				}
				break;
			case 2:
				{
				setState(80);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(81);
				match(BOOL);
				}
				break;
			case 4:
				{
				setState(82);
				match(INT);
				}
				break;
			case 5:
				{
				setState(83);
				match(FLOAT);
				}
				break;
			case 6:
				{
				setState(84);
				match(IDENTIFIER);
				}
				break;
			case 7:
				{
				setState(85);
				conditional();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(88);
					if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
					setState(89);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3968L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(90);
					expression(9);
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
			setState(96);
			match(T__11);
			setState(97);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 65011712L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(98);
				continue_array();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
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
			setState(106);
			match(T__13);
			setState(107);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 65011712L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(108);
					continue_array();
					}
					} 
				}
				setState(113);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public Conditional_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_statement; }
	}

	public final Conditional_statementContext conditional_statement() throws RecognitionException {
		Conditional_statementContext _localctx = new Conditional_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conditional_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(CONDITION);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 65044484L) != 0)) {
				{
				setState(115);
				conditional();
				}
			}

			setState(118);
			match(T__3);
			setState(119);
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
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> CONDITIONAL_OPERATORS() { return getTokens(MyLanguageParser.CONDITIONAL_OPERATORS); }
		public TerminalNode CONDITIONAL_OPERATORS(int i) {
			return getToken(MyLanguageParser.CONDITIONAL_OPERATORS, i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			id();
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(122);
					match(CONDITIONAL_OPERATORS);
					setState(123);
					id();
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(129);
					continue_conditional();
					}
					} 
				}
				setState(134);
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
			setState(135);
			match(CONDITIONAL_OPERATORS);
			setState(136);
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
			setState(138);
			match(TAB);
			setState(139);
			statement();
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(140);
					continue_block();
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 28, RULE_continue_block);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(TAB);
				setState(148);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				statement();
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
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(T__1);
				setState(153);
				id();
				setState(154);
				match(T__2);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				match(STRING);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				match(IDENTIFIER);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 6);
				{
				setState(160);
				match(BOOL);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 7);
				{
				setState(161);
				match(T__14);
				setState(162);
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
		case 7:
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
		"\u0004\u0001\u001b\u00a6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0001\u0000\u0004\u0000\"\b\u0000\u000b\u0000\f\u0000#\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001*\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0003\u0002.\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003"+
		"2\b\u0003\u0001\u0003\u0001\u0003\u0003\u00036\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004G\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007W\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\\\b\u0007"+
		"\n\u0007\f\u0007_\t\u0007\u0001\b\u0001\b\u0001\b\u0005\bd\b\b\n\b\f\b"+
		"g\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\tn\b\t\n\t\f\tq\t"+
		"\t\u0001\n\u0001\n\u0003\nu\b\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b}\b\u000b\n\u000b\f\u000b\u0080\t\u000b"+
		"\u0001\u000b\u0005\u000b\u0083\b\u000b\n\u000b\f\u000b\u0086\t\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r\u008e\b\r\n\r\f\r\u0091"+
		"\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0097"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00a4\b\u000f\u0001\u000f\u0000\u0001\u000e\u0010\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000"+
		"\u0002\u0001\u0000\u0007\u000b\u0001\u0000\u0015\u0019\u00b2\u0000!\u0001"+
		"\u0000\u0000\u0000\u0002)\u0001\u0000\u0000\u0000\u0004-\u0001\u0000\u0000"+
		"\u0000\u0006/\u0001\u0000\u0000\u0000\bF\u0001\u0000\u0000\u0000\nH\u0001"+
		"\u0000\u0000\u0000\fJ\u0001\u0000\u0000\u0000\u000eV\u0001\u0000\u0000"+
		"\u0000\u0010`\u0001\u0000\u0000\u0000\u0012j\u0001\u0000\u0000\u0000\u0014"+
		"r\u0001\u0000\u0000\u0000\u0016y\u0001\u0000\u0000\u0000\u0018\u0087\u0001"+
		"\u0000\u0000\u0000\u001a\u008a\u0001\u0000\u0000\u0000\u001c\u0096\u0001"+
		"\u0000\u0000\u0000\u001e\u00a3\u0001\u0000\u0000\u0000 \"\u0003\u0002"+
		"\u0001\u0000! \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#!\u0001"+
		"\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\u0001\u0001\u0000\u0000"+
		"\u0000%*\u0003\n\u0005\u0000&*\u0003\f\u0006\u0000\'*\u0003\u0014\n\u0000"+
		"(*\u0003\u0004\u0002\u0000)%\u0001\u0000\u0000\u0000)&\u0001\u0000\u0000"+
		"\u0000)\'\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000*\u0003\u0001"+
		"\u0000\u0000\u0000+.\u0003\u0006\u0003\u0000,.\u0003\b\u0004\u0000-+\u0001"+
		"\u0000\u0000\u0000-,\u0001\u0000\u0000\u0000.\u0005\u0001\u0000\u0000"+
		"\u0000/1\u0005\u0001\u0000\u000002\u0005\u0002\u0000\u000010\u0001\u0000"+
		"\u0000\u000012\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000035\u0003"+
		"\u0016\u000b\u000046\u0005\u0003\u0000\u000054\u0001\u0000\u0000\u0000"+
		"56\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0005\u0004\u0000"+
		"\u000089\u0003\u001a\r\u00009\u0007\u0001\u0000\u0000\u0000:;\u0005\u0005"+
		"\u0000\u0000;<\u0005\u0015\u0000\u0000<=\u0005\u0006\u0000\u0000=>\u0005"+
		"\u0015\u0000\u0000>?\u0005\u0004\u0000\u0000?G\u0003\u001a\r\u0000@A\u0005"+
		"\u0005\u0000\u0000AB\u0005\u0015\u0000\u0000BC\u0005\u0006\u0000\u0000"+
		"CD\u0005\u001b\u0000\u0000DE\u0005\u0004\u0000\u0000EG\u0003\u001a\r\u0000"+
		"F:\u0001\u0000\u0000\u0000F@\u0001\u0000\u0000\u0000G\t\u0001\u0000\u0000"+
		"\u0000HI\u0005\u001a\u0000\u0000I\u000b\u0001\u0000\u0000\u0000JK\u0005"+
		"\u0015\u0000\u0000KL\u0005\u0010\u0000\u0000LM\u0003\u000e\u0007\u0000"+
		"M\r\u0001\u0000\u0000\u0000NO\u0006\u0007\uffff\uffff\u0000OW\u0003\u0010"+
		"\b\u0000PW\u0005\u0019\u0000\u0000QW\u0005\u0018\u0000\u0000RW\u0005\u0016"+
		"\u0000\u0000SW\u0005\u0017\u0000\u0000TW\u0005\u0015\u0000\u0000UW\u0003"+
		"\u0016\u000b\u0000VN\u0001\u0000\u0000\u0000VP\u0001\u0000\u0000\u0000"+
		"VQ\u0001\u0000\u0000\u0000VR\u0001\u0000\u0000\u0000VS\u0001\u0000\u0000"+
		"\u0000VT\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000W]\u0001\u0000"+
		"\u0000\u0000XY\n\b\u0000\u0000YZ\u0007\u0000\u0000\u0000Z\\\u0003\u000e"+
		"\u0007\t[X\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\u000f\u0001\u0000\u0000"+
		"\u0000_]\u0001\u0000\u0000\u0000`a\u0005\f\u0000\u0000ae\u0007\u0001\u0000"+
		"\u0000bd\u0003\u0012\t\u0000cb\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000"+
		"\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fh\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000hi\u0005\r\u0000\u0000i\u0011\u0001"+
		"\u0000\u0000\u0000jk\u0005\u000e\u0000\u0000ko\u0007\u0001\u0000\u0000"+
		"ln\u0003\u0012\t\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000p\u0013\u0001\u0000"+
		"\u0000\u0000qo\u0001\u0000\u0000\u0000rt\u0005\u0012\u0000\u0000su\u0003"+
		"\u0016\u000b\u0000ts\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000vw\u0005\u0004\u0000\u0000wx\u0003\u001a\r\u0000"+
		"x\u0015\u0001\u0000\u0000\u0000y~\u0003\u001e\u000f\u0000z{\u0005\u0011"+
		"\u0000\u0000{}\u0003\u001e\u000f\u0000|z\u0001\u0000\u0000\u0000}\u0080"+
		"\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000"+
		"\u0000\u0000\u007f\u0084\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0081\u0083\u0003\u0018\f\u0000\u0082\u0081\u0001\u0000\u0000\u0000"+
		"\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0017\u0001\u0000\u0000\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u0011\u0000\u0000"+
		"\u0088\u0089\u0003\u001e\u000f\u0000\u0089\u0019\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0005\u0014\u0000\u0000\u008b\u008f\u0003\u0002\u0001\u0000"+
		"\u008c\u008e\u0003\u001c\u000e\u0000\u008d\u008c\u0001\u0000\u0000\u0000"+
		"\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u001b\u0001\u0000\u0000\u0000"+
		"\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0097\u0003\u001a\r\u0000\u0093"+
		"\u0094\u0005\u0014\u0000\u0000\u0094\u0097\u0003\u001a\r\u0000\u0095\u0097"+
		"\u0003\u0002\u0001\u0000\u0096\u0092\u0001\u0000\u0000\u0000\u0096\u0093"+
		"\u0001\u0000\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u001d"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u0002\u0000\u0000\u0099\u009a"+
		"\u0003\u001e\u000f\u0000\u009a\u009b\u0005\u0003\u0000\u0000\u009b\u00a4"+
		"\u0001\u0000\u0000\u0000\u009c\u00a4\u0005\u0016\u0000\u0000\u009d\u00a4"+
		"\u0005\u0017\u0000\u0000\u009e\u00a4\u0005\u0019\u0000\u0000\u009f\u00a4"+
		"\u0005\u0015\u0000\u0000\u00a0\u00a4\u0005\u0018\u0000\u0000\u00a1\u00a2"+
		"\u0005\u000f\u0000\u0000\u00a2\u00a4\u0003\u001e\u000f\u0000\u00a3\u0098"+
		"\u0001\u0000\u0000\u0000\u00a3\u009c\u0001\u0000\u0000\u0000\u00a3\u009d"+
		"\u0001\u0000\u0000\u0000\u00a3\u009e\u0001\u0000\u0000\u0000\u00a3\u009f"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a4\u001f\u0001\u0000\u0000\u0000\u0010#)-"+
		"15FV]eot~\u0084\u008f\u0096\u00a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}