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
		WS=10, IDENTIFIER=11, INT=12, FLOAT=13, BOOL=14, STRING=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "ASSIGNMENT_OPERATOR", 
			"WS", "IDENTIFIER", "INT", "FLOAT", "BOOL", "STRING"
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
			"WS", "IDENTIFIER", "INT", "FLOAT", "BOOL", "STRING"
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
		"\u0004\u0000\u000f}\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b9\b\b\u0001\t\u0004"+
		"\t<\b\t\u000b\t\f\t=\u0001\t\u0001\t\u0001\n\u0001\n\u0005\nD\b\n\n\n"+
		"\f\nG\t\n\u0001\u000b\u0004\u000bJ\b\u000b\u000b\u000b\f\u000bK\u0001"+
		"\f\u0004\fO\b\f\u000b\f\f\fP\u0001\f\u0001\f\u0004\fU\b\f\u000b\f\f\f"+
		"V\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\rb\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e|\b\u000e\u0000\u0000\u000f\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u0001\u0000\u0004\u0003\u0000\t\n\r\r  \u0002\u0000AZaz\u0004\u00000"+
		"9AZ__az\u0001\u000009\u008b\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001"+
		"\u0000\u0000\u0000\u0003!\u0001\u0000\u0000\u0000\u0005#\u0001\u0000\u0000"+
		"\u0000\u0007%\u0001\u0000\u0000\u0000\t\'\u0001\u0000\u0000\u0000\u000b"+
		")\u0001\u0000\u0000\u0000\r+\u0001\u0000\u0000\u0000\u000f-\u0001\u0000"+
		"\u0000\u0000\u00118\u0001\u0000\u0000\u0000\u0013;\u0001\u0000\u0000\u0000"+
		"\u0015A\u0001\u0000\u0000\u0000\u0017I\u0001\u0000\u0000\u0000\u0019N"+
		"\u0001\u0000\u0000\u0000\u001ba\u0001\u0000\u0000\u0000\u001d{\u0001\u0000"+
		"\u0000\u0000\u001f \u0005+\u0000\u0000 \u0002\u0001\u0000\u0000\u0000"+
		"!\"\u0005-\u0000\u0000\"\u0004\u0001\u0000\u0000\u0000#$\u0005*\u0000"+
		"\u0000$\u0006\u0001\u0000\u0000\u0000%&\u0005/\u0000\u0000&\b\u0001\u0000"+
		"\u0000\u0000\'(\u0005%\u0000\u0000(\n\u0001\u0000\u0000\u0000)*\u0005"+
		"[\u0000\u0000*\f\u0001\u0000\u0000\u0000+,\u0005]\u0000\u0000,\u000e\u0001"+
		"\u0000\u0000\u0000-.\u0005,\u0000\u0000.\u0010\u0001\u0000\u0000\u0000"+
		"/9\u0005=\u0000\u000001\u0005+\u0000\u000019\u0005=\u0000\u000023\u0005"+
		"-\u0000\u000039\u0005=\u0000\u000045\u0005*\u0000\u000059\u0005=\u0000"+
		"\u000067\u0005/\u0000\u000079\u0005=\u0000\u00008/\u0001\u0000\u0000\u0000"+
		"80\u0001\u0000\u0000\u000082\u0001\u0000\u0000\u000084\u0001\u0000\u0000"+
		"\u000086\u0001\u0000\u0000\u00009\u0012\u0001\u0000\u0000\u0000:<\u0007"+
		"\u0000\u0000\u0000;:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000"+
		"=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000"+
		"\u0000?@\u0006\t\u0000\u0000@\u0014\u0001\u0000\u0000\u0000AE\u0007\u0001"+
		"\u0000\u0000BD\u0007\u0002\u0000\u0000CB\u0001\u0000\u0000\u0000DG\u0001"+
		"\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000"+
		"F\u0016\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HJ\u0007\u0003"+
		"\u0000\u0000IH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KI\u0001"+
		"\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000L\u0018\u0001\u0000\u0000"+
		"\u0000MO\u0007\u0003\u0000\u0000NM\u0001\u0000\u0000\u0000OP\u0001\u0000"+
		"\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000RT\u0005.\u0000\u0000SU\u0007\u0003\u0000\u0000TS\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000W\u001a\u0001\u0000\u0000\u0000XY\u0005T\u0000"+
		"\u0000YZ\u0005r\u0000\u0000Z[\u0005u\u0000\u0000[b\u0005e\u0000\u0000"+
		"\\]\u0005F\u0000\u0000]^\u0005a\u0000\u0000^_\u0005l\u0000\u0000_`\u0005"+
		"s\u0000\u0000`b\u0005e\u0000\u0000aX\u0001\u0000\u0000\u0000a\\\u0001"+
		"\u0000\u0000\u0000b\u001c\u0001\u0000\u0000\u0000cd\u0005\'\u0000\u0000"+
		"de\u0003\u0015\n\u0000ef\u0005\'\u0000\u0000f|\u0001\u0000\u0000\u0000"+
		"gh\u0005\'\u0000\u0000hi\u0003\u0017\u000b\u0000ij\u0005\'\u0000\u0000"+
		"j|\u0001\u0000\u0000\u0000kl\u0005\'\u0000\u0000lm\u0003\u0019\f\u0000"+
		"mn\u0005\'\u0000\u0000n|\u0001\u0000\u0000\u0000op\u0005\"\u0000\u0000"+
		"pq\u0003\u0015\n\u0000qr\u0005\"\u0000\u0000r|\u0001\u0000\u0000\u0000"+
		"st\u0005\"\u0000\u0000tu\u0003\u0017\u000b\u0000uv\u0005\"\u0000\u0000"+
		"v|\u0001\u0000\u0000\u0000wx\u0005\"\u0000\u0000xy\u0003\u0019\f\u0000"+
		"yz\u0005\"\u0000\u0000z|\u0001\u0000\u0000\u0000{c\u0001\u0000\u0000\u0000"+
		"{g\u0001\u0000\u0000\u0000{k\u0001\u0000\u0000\u0000{o\u0001\u0000\u0000"+
		"\u0000{s\u0001\u0000\u0000\u0000{w\u0001\u0000\u0000\u0000|\u001e\u0001"+
		"\u0000\u0000\u0000\t\u00008=EKPVa{\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}