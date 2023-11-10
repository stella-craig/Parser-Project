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
		T__0=1, T__1=2, WS=3, IDENTIFIER=4, ARRAY_BEGIN=5, CONTINUE_ARRAY=6, ASSIGNMENT_OPERATOR=7, 
		PLUS=8, MINUS=9, TIMES=10, DIVIDE=11, MOD=12, NUMBER=13, BOOL=14, STRING=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "WS", "IDENTIFIER", "ARRAY_BEGIN", "CONTINUE_ARRAY", 
			"ASSIGNMENT_OPERATOR", "PLUS", "MINUS", "TIMES", "DIVIDE", "MOD", "NUMBER", 
			"BOOL", "STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", null, null, null, null, null, "'+'", "'-'", "'*'", 
			"'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "WS", "IDENTIFIER", "ARRAY_BEGIN", "CONTINUE_ARRAY", 
			"ASSIGNMENT_OPERATOR", "PLUS", "MINUS", "TIMES", "DIVIDE", "MOD", "NUMBER", 
			"BOOL", "STRING"
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
		"\u0004\u0000\u000f\u008a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u0002"+
		"%\b\u0002\u000b\u0002\f\u0002&\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0005\u0003-\b\u0003\n\u0003\f\u00030\t\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u00046\b\u0004\u0001\u0004\u0005"+
		"\u00049\b\u0004\n\u0004\f\u0004<\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005D\b\u0005\u0001"+
		"\u0005\u0005\u0005G\b\u0005\n\u0005\f\u0005J\t\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006U\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0004\fb\b\f\u000b\f\f\fc\u0001\f\u0001\f\u0004\fh\b\f\u000b\f\f\f"+
		"i\u0003\fl\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0003\rw\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u0089\b\u000e\u0000\u0000\u000f\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u0001\u0000\u0004"+
		"\u0003\u0000\t\n\r\r  \u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u0000"+
		"09\u009c\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000\u0000\u0003"+
		"!\u0001\u0000\u0000\u0000\u0005$\u0001\u0000\u0000\u0000\u0007*\u0001"+
		"\u0000\u0000\u0000\t1\u0001\u0000\u0000\u0000\u000b?\u0001\u0000\u0000"+
		"\u0000\rT\u0001\u0000\u0000\u0000\u000fV\u0001\u0000\u0000\u0000\u0011"+
		"X\u0001\u0000\u0000\u0000\u0013Z\u0001\u0000\u0000\u0000\u0015\\\u0001"+
		"\u0000\u0000\u0000\u0017^\u0001\u0000\u0000\u0000\u0019a\u0001\u0000\u0000"+
		"\u0000\u001bv\u0001\u0000\u0000\u0000\u001d\u0088\u0001\u0000\u0000\u0000"+
		"\u001f \u0005(\u0000\u0000 \u0002\u0001\u0000\u0000\u0000!\"\u0005)\u0000"+
		"\u0000\"\u0004\u0001\u0000\u0000\u0000#%\u0007\u0000\u0000\u0000$#\u0001"+
		"\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000"+
		"&\'\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000()\u0006\u0002\u0000"+
		"\u0000)\u0006\u0001\u0000\u0000\u0000*.\u0007\u0001\u0000\u0000+-\u0007"+
		"\u0002\u0000\u0000,+\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000"+
		".,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/\b\u0001\u0000\u0000"+
		"\u00000.\u0001\u0000\u0000\u000015\u0005[\u0000\u000026\u0003\u001d\u000e"+
		"\u000036\u0003\u001b\r\u000046\u0003\u0019\f\u000052\u0001\u0000\u0000"+
		"\u000053\u0001\u0000\u0000\u000054\u0001\u0000\u0000\u00006:\u0001\u0000"+
		"\u0000\u000079\u0003\u000b\u0005\u000087\u0001\u0000\u0000\u00009<\u0001"+
		"\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000"+
		";=\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=>\u0005]\u0000\u0000"+
		">\n\u0001\u0000\u0000\u0000?C\u0005,\u0000\u0000@D\u0003\u001d\u000e\u0000"+
		"AD\u0003\u001b\r\u0000BD\u0003\u0019\f\u0000C@\u0001\u0000\u0000\u0000"+
		"CA\u0001\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000DH\u0001\u0000\u0000"+
		"\u0000EG\u0003\u000b\u0005\u0000FE\u0001\u0000\u0000\u0000GJ\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000I\f\u0001"+
		"\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000KU\u0005=\u0000\u0000LM\u0005"+
		"+\u0000\u0000MU\u0005=\u0000\u0000NO\u0005-\u0000\u0000OU\u0005=\u0000"+
		"\u0000PQ\u0005*\u0000\u0000QU\u0005=\u0000\u0000RS\u0005/\u0000\u0000"+
		"SU\u0005=\u0000\u0000TK\u0001\u0000\u0000\u0000TL\u0001\u0000\u0000\u0000"+
		"TN\u0001\u0000\u0000\u0000TP\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000"+
		"\u0000U\u000e\u0001\u0000\u0000\u0000VW\u0005+\u0000\u0000W\u0010\u0001"+
		"\u0000\u0000\u0000XY\u0005-\u0000\u0000Y\u0012\u0001\u0000\u0000\u0000"+
		"Z[\u0005*\u0000\u0000[\u0014\u0001\u0000\u0000\u0000\\]\u0005/\u0000\u0000"+
		"]\u0016\u0001\u0000\u0000\u0000^_\u0005%\u0000\u0000_\u0018\u0001\u0000"+
		"\u0000\u0000`b\u0007\u0003\u0000\u0000a`\u0001\u0000\u0000\u0000bc\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000"+
		"dk\u0001\u0000\u0000\u0000eg\u0005.\u0000\u0000fh\u0007\u0003\u0000\u0000"+
		"gf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000"+
		"\u0000ij\u0001\u0000\u0000\u0000jl\u0001\u0000\u0000\u0000ke\u0001\u0000"+
		"\u0000\u0000kl\u0001\u0000\u0000\u0000l\u001a\u0001\u0000\u0000\u0000"+
		"mn\u0005T\u0000\u0000no\u0005r\u0000\u0000op\u0005u\u0000\u0000pw\u0005"+
		"e\u0000\u0000qr\u0005F\u0000\u0000rs\u0005a\u0000\u0000st\u0005l\u0000"+
		"\u0000tu\u0005s\u0000\u0000uw\u0005e\u0000\u0000vm\u0001\u0000\u0000\u0000"+
		"vq\u0001\u0000\u0000\u0000w\u001c\u0001\u0000\u0000\u0000xy\u0005\"\u0000"+
		"\u0000yz\u0003\u0007\u0003\u0000z{\u0005\"\u0000\u0000{\u0089\u0001\u0000"+
		"\u0000\u0000|}\u0005\'\u0000\u0000}~\u0003\u0007\u0003\u0000~\u007f\u0005"+
		"\'\u0000\u0000\u007f\u0089\u0001\u0000\u0000\u0000\u0080\u0081\u0005\""+
		"\u0000\u0000\u0081\u0082\u0003\u0019\f\u0000\u0082\u0083\u0005\"\u0000"+
		"\u0000\u0083\u0089\u0001\u0000\u0000\u0000\u0084\u0085\u0005\'\u0000\u0000"+
		"\u0085\u0086\u0003\u0019\f\u0000\u0086\u0087\u0005\'\u0000\u0000\u0087"+
		"\u0089\u0001\u0000\u0000\u0000\u0088x\u0001\u0000\u0000\u0000\u0088|\u0001"+
		"\u0000\u0000\u0000\u0088\u0080\u0001\u0000\u0000\u0000\u0088\u0084\u0001"+
		"\u0000\u0000\u0000\u0089\u001e\u0001\u0000\u0000\u0000\r\u0000&.5:CHT"+
		"cikv\u0088\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}