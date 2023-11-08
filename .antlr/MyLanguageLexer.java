// Generated from c:/Users/mayab/OneDrive - University of Missouri/Desktop/Coding Projects/School/Principles_of_Programming_Language/Parser-Project/MyLanguage.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MyLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, WS=4, LITERAL=5, ARRAY=6, ARRAY_BEGIN=7, CONTINUE_ARRAY=8, 
		END_ARRAY=9, ASSIGNMENT_OPERATOR=10, PLUS=11, MINUS=12, TIMES=13, DIVIDE=14, 
		MOD=15, STRING=16, NUMBER=17, IDENTIFIER=18, BOOL=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "WS", "LITERAL", "ARRAY", "ARRAY_BEGIN", "CONTINUE_ARRAY", 
			"END_ARRAY", "ASSIGNMENT_OPERATOR", "PLUS", "MINUS", "TIMES", "DIVIDE", 
			"MOD", "STRING", "NUMBER", "IDENTIFIER", "BOOL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", null, null, null, null, null, "']'", null, 
			"'+'", "'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "WS", "LITERAL", "ARRAY", "ARRAY_BEGIN", "CONTINUE_ARRAY", 
			"END_ARRAY", "ASSIGNMENT_OPERATOR", "PLUS", "MINUS", "TIMES", "DIVIDE", 
			"MOD", "STRING", "NUMBER", "IDENTIFIER", "BOOL"
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


	public MyLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0013\u0098\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0004\u0003/\b\u0003\u000b\u0003"+
		"\f\u00030\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004:\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"C\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007L\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007Q\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t^\b\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0004\u000fl\b\u000f\u000b"+
		"\u000f\f\u000fm\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000fs\b\u000f"+
		"\u000b\u000f\f\u000ft\u0001\u000f\u0003\u000fx\b\u000f\u0001\u0010\u0004"+
		"\u0010{\b\u0010\u000b\u0010\f\u0010|\u0001\u0010\u0001\u0010\u0004\u0010"+
		"\u0081\b\u0010\u000b\u0010\f\u0010\u0082\u0003\u0010\u0085\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u0089\b\u0011\n\u0011\f\u0011\u008c\t\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0097\b\u0012\u0000\u0000"+
		"\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\u0001\u0000\u0005\u0003"+
		"\u0000\t\n\r\r  \u0001\u0000..\u0001\u000009\u0003\u0000AZ__az\u0004\u0000"+
		"09AZ__az\u00af\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003)\u0001"+
		"\u0000\u0000\u0000\u0005+\u0001\u0000\u0000\u0000\u0007.\u0001\u0000\u0000"+
		"\u0000\t9\u0001\u0000\u0000\u0000\u000b;\u0001\u0000\u0000\u0000\r=\u0001"+
		"\u0000\u0000\u0000\u000fP\u0001\u0000\u0000\u0000\u0011R\u0001\u0000\u0000"+
		"\u0000\u0013]\u0001\u0000\u0000\u0000\u0015_\u0001\u0000\u0000\u0000\u0017"+
		"a\u0001\u0000\u0000\u0000\u0019c\u0001\u0000\u0000\u0000\u001be\u0001"+
		"\u0000\u0000\u0000\u001dg\u0001\u0000\u0000\u0000\u001fw\u0001\u0000\u0000"+
		"\u0000!z\u0001\u0000\u0000\u0000#\u0086\u0001\u0000\u0000\u0000%\u0096"+
		"\u0001\u0000\u0000\u0000\'(\u0005=\u0000\u0000(\u0002\u0001\u0000\u0000"+
		"\u0000)*\u0005(\u0000\u0000*\u0004\u0001\u0000\u0000\u0000+,\u0005)\u0000"+
		"\u0000,\u0006\u0001\u0000\u0000\u0000-/\u0007\u0000\u0000\u0000.-\u0001"+
		"\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u0000"+
		"01\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000023\u0006\u0003\u0000"+
		"\u00003\b\u0001\u0000\u0000\u00004:\u0003\u001f\u000f\u00005:\u0003!\u0010"+
		"\u00006:\u0003#\u0011\u00007:\u0003%\u0012\u00008:\u0003\u000b\u0005\u0000"+
		"94\u0001\u0000\u0000\u000095\u0001\u0000\u0000\u000096\u0001\u0000\u0000"+
		"\u000097\u0001\u0000\u0000\u000098\u0001\u0000\u0000\u0000:\n\u0001\u0000"+
		"\u0000\u0000;<\u0003\r\u0006\u0000<\f\u0001\u0000\u0000\u0000=B\u0005"+
		"[\u0000\u0000>C\u0003\u001f\u000f\u0000?C\u0003%\u0012\u0000@C\u0003!"+
		"\u0010\u0000AC\u0003#\u0011\u0000B>\u0001\u0000\u0000\u0000B?\u0001\u0000"+
		"\u0000\u0000B@\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000DE\u0003\u000f\u0007\u0000E\u000e\u0001\u0000\u0000"+
		"\u0000FK\u0005,\u0000\u0000GL\u0003\u001f\u000f\u0000HL\u0003%\u0012\u0000"+
		"IL\u0003!\u0010\u0000JL\u0003#\u0011\u0000KG\u0001\u0000\u0000\u0000K"+
		"H\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KJ\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MN\u0003\u000f\u0007\u0000NQ\u0001\u0000"+
		"\u0000\u0000OQ\u0003\u0011\b\u0000PF\u0001\u0000\u0000\u0000PO\u0001\u0000"+
		"\u0000\u0000Q\u0010\u0001\u0000\u0000\u0000RS\u0005]\u0000\u0000S\u0012"+
		"\u0001\u0000\u0000\u0000T^\u0005=\u0000\u0000UV\u0005+\u0000\u0000V^\u0005"+
		"=\u0000\u0000WX\u0005-\u0000\u0000X^\u0005=\u0000\u0000YZ\u0005*\u0000"+
		"\u0000Z^\u0005=\u0000\u0000[\\\u0005/\u0000\u0000\\^\u0005=\u0000\u0000"+
		"]T\u0001\u0000\u0000\u0000]U\u0001\u0000\u0000\u0000]W\u0001\u0000\u0000"+
		"\u0000]Y\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^\u0014\u0001"+
		"\u0000\u0000\u0000_`\u0005+\u0000\u0000`\u0016\u0001\u0000\u0000\u0000"+
		"ab\u0005-\u0000\u0000b\u0018\u0001\u0000\u0000\u0000cd\u0005*\u0000\u0000"+
		"d\u001a\u0001\u0000\u0000\u0000ef\u0005/\u0000\u0000f\u001c\u0001\u0000"+
		"\u0000\u0000gh\u0005%\u0000\u0000h\u001e\u0001\u0000\u0000\u0000ik\u0005"+
		"\"\u0000\u0000jl\u0007\u0001\u0000\u0000kj\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000ox\u0005\"\u0000\u0000pr\u0005\'\u0000\u0000"+
		"qs\u0007\u0001\u0000\u0000rq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0001\u0000"+
		"\u0000\u0000vx\u0005\'\u0000\u0000wi\u0001\u0000\u0000\u0000wp\u0001\u0000"+
		"\u0000\u0000x \u0001\u0000\u0000\u0000y{\u0007\u0002\u0000\u0000zy\u0001"+
		"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}\u0084\u0001\u0000\u0000\u0000~\u0080\u0005"+
		".\u0000\u0000\u007f\u0081\u0007\u0002\u0000\u0000\u0080\u007f\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0085\u0001\u0000"+
		"\u0000\u0000\u0084~\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000"+
		"\u0000\u0085\"\u0001\u0000\u0000\u0000\u0086\u008a\u0007\u0003\u0000\u0000"+
		"\u0087\u0089\u0007\u0004\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000"+
		"\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0001\u0000\u0000\u0000\u008b$\u0001\u0000\u0000\u0000\u008c"+
		"\u008a\u0001\u0000\u0000\u0000\u008d\u008e\u0005T\u0000\u0000\u008e\u008f"+
		"\u0005r\u0000\u0000\u008f\u0090\u0005u\u0000\u0000\u0090\u0097\u0005e"+
		"\u0000\u0000\u0091\u0092\u0005F\u0000\u0000\u0092\u0093\u0005a\u0000\u0000"+
		"\u0093\u0094\u0005l\u0000\u0000\u0094\u0095\u0005s\u0000\u0000\u0095\u0097"+
		"\u0005e\u0000\u0000\u0096\u008d\u0001\u0000\u0000\u0000\u0096\u0091\u0001"+
		"\u0000\u0000\u0000\u0097&\u0001\u0000\u0000\u0000\u000f\u000009BKP]mt"+
		"w|\u0082\u0084\u008a\u0096\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}