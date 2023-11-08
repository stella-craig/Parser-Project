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
		T__0=1, T__1=2, T__2=3, ARRAY=4, ARRAY_BEGIN=5, CONTINUE_ARRAY=6, END_ARRAY=7, 
		ASSIGNMENT_OPERATOR=8, PLUS=9, MINUS=10, TIMES=11, DIVIDE=12, MOD=13, 
		STRING=14, NUMBER=15, IDENTIFIER=16, BOOL=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "ARRAY", "ARRAY_BEGIN", "CONTINUE_ARRAY", "END_ARRAY", 
			"ASSIGNMENT_OPERATOR", "PLUS", "MINUS", "TIMES", "DIVIDE", "MOD", "STRING", 
			"NUMBER", "IDENTIFIER", "BOOL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", null, null, null, "']'", null, "'+'", "'-'", 
			"'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "ARRAY", "ARRAY_BEGIN", "CONTINUE_ARRAY", "END_ARRAY", 
			"ASSIGNMENT_OPERATOR", "PLUS", "MINUS", "TIMES", "DIVIDE", "MOD", "STRING", 
			"NUMBER", "IDENTIFIER", "BOOL", "WS"
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
		"\u0004\u0000\u0012\u0092\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004:\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"I\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007V\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0005\rf\b\r\n\r\f\ri\t\r\u0001\r\u0001\r\u0001\u000e\u0004\u000en"+
		"\b\u000e\u000b\u000e\f\u000eo\u0001\u000e\u0001\u000e\u0004\u000et\b\u000e"+
		"\u000b\u000e\f\u000eu\u0003\u000ex\b\u000e\u0001\u000f\u0001\u000f\u0005"+
		"\u000f|\b\u000f\n\u000f\f\u000f\u007f\t\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u008a\b\u0010\u0001\u0011\u0004\u0011\u008d\b"+
		"\u0011\u000b\u0011\f\u0011\u008e\u0001\u0011\u0001\u0011\u0000\u0000\u0012"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012\u0001\u0000\u0006\u0002\u0000\""+
		"\"\\\\\u0004\u0000\n\n\r\r\"\"\\\\\u0001\u000009\u0003\u0000AZ__az\u0004"+
		"\u000009AZ__az\u0003\u0000\t\n\r\r  \u00a2\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003\'\u0001\u0000"+
		"\u0000\u0000\u0005)\u0001\u0000\u0000\u0000\u0007+\u0001\u0000\u0000\u0000"+
		"\t9\u0001\u0000\u0000\u0000\u000bH\u0001\u0000\u0000\u0000\rJ\u0001\u0000"+
		"\u0000\u0000\u000fU\u0001\u0000\u0000\u0000\u0011W\u0001\u0000\u0000\u0000"+
		"\u0013Y\u0001\u0000\u0000\u0000\u0015[\u0001\u0000\u0000\u0000\u0017]"+
		"\u0001\u0000\u0000\u0000\u0019_\u0001\u0000\u0000\u0000\u001ba\u0001\u0000"+
		"\u0000\u0000\u001dm\u0001\u0000\u0000\u0000\u001fy\u0001\u0000\u0000\u0000"+
		"!\u0089\u0001\u0000\u0000\u0000#\u008c\u0001\u0000\u0000\u0000%&\u0005"+
		"=\u0000\u0000&\u0002\u0001\u0000\u0000\u0000\'(\u0005(\u0000\u0000(\u0004"+
		"\u0001\u0000\u0000\u0000)*\u0005)\u0000\u0000*\u0006\u0001\u0000\u0000"+
		"\u0000+,\u0003\t\u0004\u0000,\b\u0001\u0000\u0000\u0000-.\u0005[\u0000"+
		"\u0000./\u0003\u001d\u000e\u0000/0\u0003\u000b\u0005\u00000:\u0001\u0000"+
		"\u0000\u000012\u0005[\u0000\u000023\u0003\u001f\u000f\u000034\u0003\u000b"+
		"\u0005\u00004:\u0001\u0000\u0000\u000056\u0005[\u0000\u000067\u0003\u001b"+
		"\r\u000078\u0003\u000b\u0005\u00008:\u0001\u0000\u0000\u00009-\u0001\u0000"+
		"\u0000\u000091\u0001\u0000\u0000\u000095\u0001\u0000\u0000\u0000:\n\u0001"+
		"\u0000\u0000\u0000;<\u0005,\u0000\u0000<=\u0003\u001d\u000e\u0000=>\u0003"+
		"\u000b\u0005\u0000>I\u0001\u0000\u0000\u0000?@\u0005,\u0000\u0000@A\u0003"+
		"\u001f\u000f\u0000AB\u0003\u000b\u0005\u0000BI\u0001\u0000\u0000\u0000"+
		"CD\u0005,\u0000\u0000DE\u0003\u001b\r\u0000EF\u0003\u000b\u0005\u0000"+
		"FI\u0001\u0000\u0000\u0000GI\u0003\r\u0006\u0000H;\u0001\u0000\u0000\u0000"+
		"H?\u0001\u0000\u0000\u0000HC\u0001\u0000\u0000\u0000HG\u0001\u0000\u0000"+
		"\u0000I\f\u0001\u0000\u0000\u0000JK\u0005]\u0000\u0000K\u000e\u0001\u0000"+
		"\u0000\u0000LV\u0005=\u0000\u0000MN\u0005+\u0000\u0000NV\u0005=\u0000"+
		"\u0000OP\u0005-\u0000\u0000PV\u0005=\u0000\u0000QR\u0005*\u0000\u0000"+
		"RV\u0005=\u0000\u0000ST\u0005/\u0000\u0000TV\u0005=\u0000\u0000UL\u0001"+
		"\u0000\u0000\u0000UM\u0001\u0000\u0000\u0000UO\u0001\u0000\u0000\u0000"+
		"UQ\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000V\u0010\u0001\u0000"+
		"\u0000\u0000WX\u0005+\u0000\u0000X\u0012\u0001\u0000\u0000\u0000YZ\u0005"+
		"-\u0000\u0000Z\u0014\u0001\u0000\u0000\u0000[\\\u0005*\u0000\u0000\\\u0016"+
		"\u0001\u0000\u0000\u0000]^\u0005/\u0000\u0000^\u0018\u0001\u0000\u0000"+
		"\u0000_`\u0005%\u0000\u0000`\u001a\u0001\u0000\u0000\u0000ag\u0005\"\u0000"+
		"\u0000bc\u0005\\\u0000\u0000cf\u0007\u0000\u0000\u0000df\b\u0001\u0000"+
		"\u0000eb\u0001\u0000\u0000\u0000ed\u0001\u0000\u0000\u0000fi\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hj\u0001"+
		"\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jk\u0005\"\u0000\u0000k\u001c"+
		"\u0001\u0000\u0000\u0000ln\u0007\u0002\u0000\u0000ml\u0001\u0000\u0000"+
		"\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000"+
		"\u0000\u0000pw\u0001\u0000\u0000\u0000qs\u0005.\u0000\u0000rt\u0007\u0002"+
		"\u0000\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000"+
		"wq\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x\u001e\u0001\u0000"+
		"\u0000\u0000y}\u0007\u0003\u0000\u0000z|\u0007\u0004\u0000\u0000{z\u0001"+
		"\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~ \u0001\u0000\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0005T\u0000\u0000\u0081\u0082\u0005r\u0000"+
		"\u0000\u0082\u0083\u0005u\u0000\u0000\u0083\u008a\u0005e\u0000\u0000\u0084"+
		"\u0085\u0005F\u0000\u0000\u0085\u0086\u0005a\u0000\u0000\u0086\u0087\u0005"+
		"l\u0000\u0000\u0087\u0088\u0005s\u0000\u0000\u0088\u008a\u0005e\u0000"+
		"\u0000\u0089\u0080\u0001\u0000\u0000\u0000\u0089\u0084\u0001\u0000\u0000"+
		"\u0000\u008a\"\u0001\u0000\u0000\u0000\u008b\u008d\u0007\u0005\u0000\u0000"+
		"\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000"+
		"\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0006\u0011\u0000\u0000"+
		"\u0091$\u0001\u0000\u0000\u0000\f\u00009HUegouw}\u0089\u008e\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}