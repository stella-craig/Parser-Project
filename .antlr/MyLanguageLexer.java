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
		T__0=1, T__1=2, T__2=3, LITERAL=4, ARRAY=5, ARRAY_BEGIN=6, CONTINUE_ARRAY=7, 
		END_ARRAY=8, ASSIGNMENT_OPERATOR=9, PLUS=10, MINUS=11, TIMES=12, DIVIDE=13, 
		MOD=14, STRING=15, NUMBER=16, IDENTIFIER=17, BOOL=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "LITERAL", "ARRAY", "ARRAY_BEGIN", "CONTINUE_ARRAY", 
			"END_ARRAY", "ASSIGNMENT_OPERATOR", "PLUS", "MINUS", "TIMES", "DIVIDE", 
			"MOD", "STRING", "NUMBER", "IDENTIFIER", "BOOL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", null, null, null, null, "']'", null, "'+'", 
			"'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "LITERAL", "ARRAY", "ARRAY_BEGIN", "CONTINUE_ARRAY", 
			"END_ARRAY", "ASSIGNMENT_OPERATOR", "PLUS", "MINUS", "TIMES", "DIVIDE", 
			"MOD", "STRING", "NUMBER", "IDENTIFIER", "BOOL", "WS"
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
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u00033\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005<\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006E\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006J\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bW\b\b\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0004\u000ee\b\u000e\u000b\u000e\f"+
		"\u000ef\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000el\b\u000e\u000b"+
		"\u000e\f\u000em\u0001\u000e\u0003\u000eq\b\u000e\u0001\u000f\u0004\u000f"+
		"t\b\u000f\u000b\u000f\f\u000fu\u0001\u000f\u0001\u000f\u0004\u000fz\b"+
		"\u000f\u000b\u000f\f\u000f{\u0003\u000f~\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u0082\b\u0010\n\u0010\f\u0010\u0085\t\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u0090\b\u0011\u0001\u0012\u0004\u0012\u0093"+
		"\b\u0012\u000b\u0012\f\u0012\u0094\u0001\u0012\u0001\u0012\u0000\u0000"+
		"\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\u0001\u0000\u0005\u0001"+
		"\u0000..\u0001\u000009\u0003\u0000AZ__az\u0004\u000009AZ__az\u0003\u0000"+
		"\t\n\r\r  \u00af\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003)\u0001"+
		"\u0000\u0000\u0000\u0005+\u0001\u0000\u0000\u0000\u00072\u0001\u0000\u0000"+
		"\u0000\t4\u0001\u0000\u0000\u0000\u000b6\u0001\u0000\u0000\u0000\rI\u0001"+
		"\u0000\u0000\u0000\u000fK\u0001\u0000\u0000\u0000\u0011V\u0001\u0000\u0000"+
		"\u0000\u0013X\u0001\u0000\u0000\u0000\u0015Z\u0001\u0000\u0000\u0000\u0017"+
		"\\\u0001\u0000\u0000\u0000\u0019^\u0001\u0000\u0000\u0000\u001b`\u0001"+
		"\u0000\u0000\u0000\u001dp\u0001\u0000\u0000\u0000\u001fs\u0001\u0000\u0000"+
		"\u0000!\u007f\u0001\u0000\u0000\u0000#\u008f\u0001\u0000\u0000\u0000%"+
		"\u0092\u0001\u0000\u0000\u0000\'(\u0005=\u0000\u0000(\u0002\u0001\u0000"+
		"\u0000\u0000)*\u0005(\u0000\u0000*\u0004\u0001\u0000\u0000\u0000+,\u0005"+
		")\u0000\u0000,\u0006\u0001\u0000\u0000\u0000-3\u0003\u001d\u000e\u0000"+
		".3\u0003\u001f\u000f\u0000/3\u0003!\u0010\u000003\u0003#\u0011\u00001"+
		"3\u0003\t\u0004\u00002-\u0001\u0000\u0000\u00002.\u0001\u0000\u0000\u0000"+
		"2/\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000021\u0001\u0000\u0000"+
		"\u00003\b\u0001\u0000\u0000\u000045\u0003\u000b\u0005\u00005\n\u0001\u0000"+
		"\u0000\u00006;\u0005[\u0000\u00007<\u0003\u001d\u000e\u00008<\u0003#\u0011"+
		"\u00009<\u0003\u001f\u000f\u0000:<\u0003!\u0010\u0000;7\u0001\u0000\u0000"+
		"\u0000;8\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;:\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0003\r\u0006\u0000>\f\u0001"+
		"\u0000\u0000\u0000?D\u0005,\u0000\u0000@E\u0003\u001d\u000e\u0000AE\u0003"+
		"#\u0011\u0000BE\u0003\u001f\u000f\u0000CE\u0003!\u0010\u0000D@\u0001\u0000"+
		"\u0000\u0000DA\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DC\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0003\r\u0006\u0000GJ\u0001"+
		"\u0000\u0000\u0000HJ\u0003\u000f\u0007\u0000I?\u0001\u0000\u0000\u0000"+
		"IH\u0001\u0000\u0000\u0000J\u000e\u0001\u0000\u0000\u0000KL\u0005]\u0000"+
		"\u0000L\u0010\u0001\u0000\u0000\u0000MW\u0005=\u0000\u0000NO\u0005+\u0000"+
		"\u0000OW\u0005=\u0000\u0000PQ\u0005-\u0000\u0000QW\u0005=\u0000\u0000"+
		"RS\u0005*\u0000\u0000SW\u0005=\u0000\u0000TU\u0005/\u0000\u0000UW\u0005"+
		"=\u0000\u0000VM\u0001\u0000\u0000\u0000VN\u0001\u0000\u0000\u0000VP\u0001"+
		"\u0000\u0000\u0000VR\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"W\u0012\u0001\u0000\u0000\u0000XY\u0005+\u0000\u0000Y\u0014\u0001\u0000"+
		"\u0000\u0000Z[\u0005-\u0000\u0000[\u0016\u0001\u0000\u0000\u0000\\]\u0005"+
		"*\u0000\u0000]\u0018\u0001\u0000\u0000\u0000^_\u0005/\u0000\u0000_\u001a"+
		"\u0001\u0000\u0000\u0000`a\u0005%\u0000\u0000a\u001c\u0001\u0000\u0000"+
		"\u0000bd\u0005\"\u0000\u0000ce\u0007\u0000\u0000\u0000dc\u0001\u0000\u0000"+
		"\u0000ef\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hq\u0005\"\u0000\u0000ik\u0005\'"+
		"\u0000\u0000jl\u0007\u0000\u0000\u0000kj\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000oq\u0005\'\u0000\u0000pb\u0001\u0000\u0000\u0000"+
		"pi\u0001\u0000\u0000\u0000q\u001e\u0001\u0000\u0000\u0000rt\u0007\u0001"+
		"\u0000\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v}\u0001\u0000\u0000\u0000"+
		"wy\u0005.\u0000\u0000xz\u0007\u0001\u0000\u0000yx\u0001\u0000\u0000\u0000"+
		"z{\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000"+
		"\u0000|~\u0001\u0000\u0000\u0000}w\u0001\u0000\u0000\u0000}~\u0001\u0000"+
		"\u0000\u0000~ \u0001\u0000\u0000\u0000\u007f\u0083\u0007\u0002\u0000\u0000"+
		"\u0080\u0082\u0007\u0003\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000"+
		"\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0001\u0000\u0000\u0000\u0084\"\u0001\u0000\u0000\u0000\u0085"+
		"\u0083\u0001\u0000\u0000\u0000\u0086\u0087\u0005T\u0000\u0000\u0087\u0088"+
		"\u0005r\u0000\u0000\u0088\u0089\u0005u\u0000\u0000\u0089\u0090\u0005e"+
		"\u0000\u0000\u008a\u008b\u0005F\u0000\u0000\u008b\u008c\u0005a\u0000\u0000"+
		"\u008c\u008d\u0005l\u0000\u0000\u008d\u008e\u0005s\u0000\u0000\u008e\u0090"+
		"\u0005e\u0000\u0000\u008f\u0086\u0001\u0000\u0000\u0000\u008f\u008a\u0001"+
		"\u0000\u0000\u0000\u0090$\u0001\u0000\u0000\u0000\u0091\u0093\u0007\u0004"+
		"\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000"+
		"\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0006\u0012"+
		"\u0000\u0000\u0097&\u0001\u0000\u0000\u0000\u000f\u00002;DIVfmpu{}\u0083"+
		"\u008f\u0094\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}