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
		T__0=1, T__1=2, T__2=3, WS=4, ARRAY=5, ARRAY_BEGIN=6, CONTINUE_ARRAY=7, 
		END_ARRAY=8, ASSIGNMENT_OPERATOR=9, PLUS=10, MINUS=11, TIMES=12, DIVIDE=13, 
		MOD=14, STRING=15, NUMBER=16, IDENTIFIER=17, BOOL=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "WS", "ARRAY", "ARRAY_BEGIN", "CONTINUE_ARRAY", 
			"END_ARRAY", "ASSIGNMENT_OPERATOR", "PLUS", "MINUS", "TIMES", "DIVIDE", 
			"MOD", "STRING", "NUMBER", "IDENTIFIER", "BOOL"
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
			null, null, null, null, "WS", "ARRAY", "ARRAY_BEGIN", "CONTINUE_ARRAY", 
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
		"\u0004\u0000\u0012\u0097\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0004\u0003-\b\u0003\u000b\u0003\f\u0003.\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005A\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006P\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b]\b\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0004\u000ek\b\u000e\u000b\u000e\f\u000el\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0004\u000er\b\u000e\u000b\u000e\f\u000e"+
		"s\u0001\u000e\u0003\u000ew\b\u000e\u0001\u000f\u0004\u000fz\b\u000f\u000b"+
		"\u000f\f\u000f{\u0001\u000f\u0001\u000f\u0004\u000f\u0080\b\u000f\u000b"+
		"\u000f\f\u000f\u0081\u0003\u000f\u0084\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u0088\b\u0010\n\u0010\f\u0010\u008b\t\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u0096\b\u0011\u0000\u0000\u0012\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012\u0001\u0000\u0005\u0003\u0000\t\n\r\r  \u0001"+
		"\u0000..\u0001\u000009\u0003\u0000AZ__az\u0004\u000009AZ__az\u00a8\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000"+
		"\u0000\u0003\'\u0001\u0000\u0000\u0000\u0005)\u0001\u0000\u0000\u0000"+
		"\u0007,\u0001\u0000\u0000\u0000\t2\u0001\u0000\u0000\u0000\u000b@\u0001"+
		"\u0000\u0000\u0000\rO\u0001\u0000\u0000\u0000\u000fQ\u0001\u0000\u0000"+
		"\u0000\u0011\\\u0001\u0000\u0000\u0000\u0013^\u0001\u0000\u0000\u0000"+
		"\u0015`\u0001\u0000\u0000\u0000\u0017b\u0001\u0000\u0000\u0000\u0019d"+
		"\u0001\u0000\u0000\u0000\u001bf\u0001\u0000\u0000\u0000\u001dv\u0001\u0000"+
		"\u0000\u0000\u001fy\u0001\u0000\u0000\u0000!\u0085\u0001\u0000\u0000\u0000"+
		"#\u0095\u0001\u0000\u0000\u0000%&\u0005=\u0000\u0000&\u0002\u0001\u0000"+
		"\u0000\u0000\'(\u0005(\u0000\u0000(\u0004\u0001\u0000\u0000\u0000)*\u0005"+
		")\u0000\u0000*\u0006\u0001\u0000\u0000\u0000+-\u0007\u0000\u0000\u0000"+
		",+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000"+
		"\u0000./\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000001\u0006\u0003"+
		"\u0000\u00001\b\u0001\u0000\u0000\u000023\u0003\u000b\u0005\u00003\n\u0001"+
		"\u0000\u0000\u000045\u0005[\u0000\u000056\u0003\u001f\u000f\u000067\u0003"+
		"\r\u0006\u00007A\u0001\u0000\u0000\u000089\u0005[\u0000\u00009:\u0003"+
		"!\u0010\u0000:;\u0003\r\u0006\u0000;A\u0001\u0000\u0000\u0000<=\u0005"+
		"[\u0000\u0000=>\u0003\u001d\u000e\u0000>?\u0003\r\u0006\u0000?A\u0001"+
		"\u0000\u0000\u0000@4\u0001\u0000\u0000\u0000@8\u0001\u0000\u0000\u0000"+
		"@<\u0001\u0000\u0000\u0000A\f\u0001\u0000\u0000\u0000BC\u0005,\u0000\u0000"+
		"CD\u0003\u001f\u000f\u0000DE\u0003\r\u0006\u0000EP\u0001\u0000\u0000\u0000"+
		"FG\u0005,\u0000\u0000GH\u0003!\u0010\u0000HI\u0003\r\u0006\u0000IP\u0001"+
		"\u0000\u0000\u0000JK\u0005,\u0000\u0000KL\u0003\u001d\u000e\u0000LM\u0003"+
		"\r\u0006\u0000MP\u0001\u0000\u0000\u0000NP\u0003\u000f\u0007\u0000OB\u0001"+
		"\u0000\u0000\u0000OF\u0001\u0000\u0000\u0000OJ\u0001\u0000\u0000\u0000"+
		"ON\u0001\u0000\u0000\u0000P\u000e\u0001\u0000\u0000\u0000QR\u0005]\u0000"+
		"\u0000R\u0010\u0001\u0000\u0000\u0000S]\u0005=\u0000\u0000TU\u0005+\u0000"+
		"\u0000U]\u0005=\u0000\u0000VW\u0005-\u0000\u0000W]\u0005=\u0000\u0000"+
		"XY\u0005*\u0000\u0000Y]\u0005=\u0000\u0000Z[\u0005/\u0000\u0000[]\u0005"+
		"=\u0000\u0000\\S\u0001\u0000\u0000\u0000\\T\u0001\u0000\u0000\u0000\\"+
		"V\u0001\u0000\u0000\u0000\\X\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000]\u0012\u0001\u0000\u0000\u0000^_\u0005+\u0000\u0000_\u0014\u0001"+
		"\u0000\u0000\u0000`a\u0005-\u0000\u0000a\u0016\u0001\u0000\u0000\u0000"+
		"bc\u0005*\u0000\u0000c\u0018\u0001\u0000\u0000\u0000de\u0005/\u0000\u0000"+
		"e\u001a\u0001\u0000\u0000\u0000fg\u0005%\u0000\u0000g\u001c\u0001\u0000"+
		"\u0000\u0000hj\u0005\"\u0000\u0000ik\u0007\u0001\u0000\u0000ji\u0001\u0000"+
		"\u0000\u0000kl\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nw\u0005\"\u0000\u0000oq\u0005"+
		"\'\u0000\u0000pr\u0007\u0001\u0000\u0000qp\u0001\u0000\u0000\u0000rs\u0001"+
		"\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000"+
		"tu\u0001\u0000\u0000\u0000uw\u0005\'\u0000\u0000vh\u0001\u0000\u0000\u0000"+
		"vo\u0001\u0000\u0000\u0000w\u001e\u0001\u0000\u0000\u0000xz\u0007\u0002"+
		"\u0000\u0000yx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{y\u0001"+
		"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u0083\u0001\u0000\u0000"+
		"\u0000}\u007f\u0005.\u0000\u0000~\u0080\u0007\u0002\u0000\u0000\u007f"+
		"~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0084"+
		"\u0001\u0000\u0000\u0000\u0083}\u0001\u0000\u0000\u0000\u0083\u0084\u0001"+
		"\u0000\u0000\u0000\u0084 \u0001\u0000\u0000\u0000\u0085\u0089\u0007\u0003"+
		"\u0000\u0000\u0086\u0088\u0007\u0004\u0000\u0000\u0087\u0086\u0001\u0000"+
		"\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\"\u0001\u0000\u0000"+
		"\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008d\u0005T\u0000\u0000"+
		"\u008d\u008e\u0005r\u0000\u0000\u008e\u008f\u0005u\u0000\u0000\u008f\u0096"+
		"\u0005e\u0000\u0000\u0090\u0091\u0005F\u0000\u0000\u0091\u0092\u0005a"+
		"\u0000\u0000\u0092\u0093\u0005l\u0000\u0000\u0093\u0094\u0005s\u0000\u0000"+
		"\u0094\u0096\u0005e\u0000\u0000\u0095\u008c\u0001\u0000\u0000\u0000\u0095"+
		"\u0090\u0001\u0000\u0000\u0000\u0096$\u0001\u0000\u0000\u0000\r\u0000"+
		".@O\\lsv{\u0081\u0083\u0089\u0095\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}