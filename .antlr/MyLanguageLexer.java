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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ASSIGNMENT_OPERATOR=9, 
		NEWLINE=10, WS=11, IDENTIFIER=12, INT=13, FLOAT=14, BOOL=15, STRING=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "ASSIGNMENT_OPERATOR", 
			"NEWLINE", "WS", "IDENTIFIER", "INT", "FLOAT", "BOOL", "STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'['", "']'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "ASSIGNMENT_OPERATOR", 
			"NEWLINE", "WS", "IDENTIFIER", "INT", "FLOAT", "BOOL", "STRING"
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
		"\u0004\u0000\u0010\u0084\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b;\b\b\u0001\t\u0004\t>\b\t\u000b\t\f\t?\u0001\n\u0004\nC\b\n"+
		"\u000b\n\f\nD\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000bK\b\u000b"+
		"\n\u000b\f\u000bN\t\u000b\u0001\f\u0004\fQ\b\f\u000b\f\f\fR\u0001\r\u0004"+
		"\rV\b\r\u000b\r\f\rW\u0001\r\u0001\r\u0004\r\\\b\r\u000b\r\f\r]\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000ei\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0083"+
		"\b\u000f\u0000\u0000\u0010\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010\u0001\u0000\u0005\u0002"+
		"\u0000\n\n\r\r\u0002\u0000\t\t  \u0002\u0000AZaz\u0004\u000009AZ__az\u0001"+
		"\u000009\u0093\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0001!\u0001\u0000\u0000\u0000\u0003#\u0001\u0000\u0000\u0000\u0005%"+
		"\u0001\u0000\u0000\u0000\u0007\'\u0001\u0000\u0000\u0000\t)\u0001\u0000"+
		"\u0000\u0000\u000b+\u0001\u0000\u0000\u0000\r-\u0001\u0000\u0000\u0000"+
		"\u000f/\u0001\u0000\u0000\u0000\u0011:\u0001\u0000\u0000\u0000\u0013="+
		"\u0001\u0000\u0000\u0000\u0015B\u0001\u0000\u0000\u0000\u0017H\u0001\u0000"+
		"\u0000\u0000\u0019P\u0001\u0000\u0000\u0000\u001bU\u0001\u0000\u0000\u0000"+
		"\u001dh\u0001\u0000\u0000\u0000\u001f\u0082\u0001\u0000\u0000\u0000!\""+
		"\u0005+\u0000\u0000\"\u0002\u0001\u0000\u0000\u0000#$\u0005-\u0000\u0000"+
		"$\u0004\u0001\u0000\u0000\u0000%&\u0005*\u0000\u0000&\u0006\u0001\u0000"+
		"\u0000\u0000\'(\u0005/\u0000\u0000(\b\u0001\u0000\u0000\u0000)*\u0005"+
		"%\u0000\u0000*\n\u0001\u0000\u0000\u0000+,\u0005[\u0000\u0000,\f\u0001"+
		"\u0000\u0000\u0000-.\u0005]\u0000\u0000.\u000e\u0001\u0000\u0000\u0000"+
		"/0\u0005,\u0000\u00000\u0010\u0001\u0000\u0000\u00001;\u0005=\u0000\u0000"+
		"23\u0005+\u0000\u00003;\u0005=\u0000\u000045\u0005-\u0000\u00005;\u0005"+
		"=\u0000\u000067\u0005*\u0000\u00007;\u0005=\u0000\u000089\u0005/\u0000"+
		"\u00009;\u0005=\u0000\u0000:1\u0001\u0000\u0000\u0000:2\u0001\u0000\u0000"+
		"\u0000:4\u0001\u0000\u0000\u0000:6\u0001\u0000\u0000\u0000:8\u0001\u0000"+
		"\u0000\u0000;\u0012\u0001\u0000\u0000\u0000<>\u0007\u0000\u0000\u0000"+
		"=<\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000"+
		"\u0000?@\u0001\u0000\u0000\u0000@\u0014\u0001\u0000\u0000\u0000AC\u0007"+
		"\u0001\u0000\u0000BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000FG\u0006\n\u0000\u0000G\u0016\u0001\u0000\u0000\u0000HL\u0007\u0002"+
		"\u0000\u0000IK\u0007\u0003\u0000\u0000JI\u0001\u0000\u0000\u0000KN\u0001"+
		"\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000"+
		"M\u0018\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OQ\u0007\u0004"+
		"\u0000\u0000PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RP\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000S\u001a\u0001\u0000\u0000"+
		"\u0000TV\u0007\u0004\u0000\u0000UT\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000Y[\u0005.\u0000\u0000Z\\\u0007\u0004\u0000\u0000[Z\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000"+
		"]^\u0001\u0000\u0000\u0000^\u001c\u0001\u0000\u0000\u0000_`\u0005T\u0000"+
		"\u0000`a\u0005r\u0000\u0000ab\u0005u\u0000\u0000bi\u0005e\u0000\u0000"+
		"cd\u0005F\u0000\u0000de\u0005a\u0000\u0000ef\u0005l\u0000\u0000fg\u0005"+
		"s\u0000\u0000gi\u0005e\u0000\u0000h_\u0001\u0000\u0000\u0000hc\u0001\u0000"+
		"\u0000\u0000i\u001e\u0001\u0000\u0000\u0000jk\u0005\'\u0000\u0000kl\u0003"+
		"\u0017\u000b\u0000lm\u0005\'\u0000\u0000m\u0083\u0001\u0000\u0000\u0000"+
		"no\u0005\'\u0000\u0000op\u0003\u0019\f\u0000pq\u0005\'\u0000\u0000q\u0083"+
		"\u0001\u0000\u0000\u0000rs\u0005\'\u0000\u0000st\u0003\u001b\r\u0000t"+
		"u\u0005\'\u0000\u0000u\u0083\u0001\u0000\u0000\u0000vw\u0005\"\u0000\u0000"+
		"wx\u0003\u0017\u000b\u0000xy\u0005\"\u0000\u0000y\u0083\u0001\u0000\u0000"+
		"\u0000z{\u0005\"\u0000\u0000{|\u0003\u0019\f\u0000|}\u0005\"\u0000\u0000"+
		"}\u0083\u0001\u0000\u0000\u0000~\u007f\u0005\"\u0000\u0000\u007f\u0080"+
		"\u0003\u001b\r\u0000\u0080\u0081\u0005\"\u0000\u0000\u0081\u0083\u0001"+
		"\u0000\u0000\u0000\u0082j\u0001\u0000\u0000\u0000\u0082n\u0001\u0000\u0000"+
		"\u0000\u0082r\u0001\u0000\u0000\u0000\u0082v\u0001\u0000\u0000\u0000\u0082"+
		"z\u0001\u0000\u0000\u0000\u0082~\u0001\u0000\u0000\u0000\u0083 \u0001"+
		"\u0000\u0000\u0000\n\u0000:?DLRW]h\u0082\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}