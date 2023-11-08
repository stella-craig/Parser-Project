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
		END_ARRAY=8, LITERAL=9, ASSIGNMENT_OPERATOR=10, PLUS=11, MINUS=12, TIMES=13, 
		DIVIDE=14, MOD=15, STRING=16, NUMBER=17, IDENTIFIER=18, BOOL=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "WS", "ARRAY", "ARRAY_BEGIN", "CONTINUE_ARRAY", 
			"END_ARRAY", "LITERAL", "ASSIGNMENT_OPERATOR", "PLUS", "MINUS", "TIMES", 
			"DIVIDE", "MOD", "STRING", "NUMBER", "IDENTIFIER", "BOOL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", null, null, null, null, "']'", null, null, 
			"'+'", "'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "WS", "ARRAY", "ARRAY_BEGIN", "CONTINUE_ARRAY", 
			"END_ARRAY", "LITERAL", "ASSIGNMENT_OPERATOR", "PLUS", "MINUS", "TIMES", 
			"DIVIDE", "MOD", "STRING", "NUMBER", "IDENTIFIER", "BOOL"
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
		"\u0004\u0000\u0013\u008e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0004\u0003/\b\u0003\u000b\u0003"+
		"\f\u00030\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006@\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bI\b\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tT\b\t"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0004\u000fb\b\u000f"+
		"\u000b\u000f\f\u000fc\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f"+
		"i\b\u000f\u000b\u000f\f\u000fj\u0001\u000f\u0003\u000fn\b\u000f\u0001"+
		"\u0010\u0004\u0010q\b\u0010\u000b\u0010\f\u0010r\u0001\u0010\u0001\u0010"+
		"\u0004\u0010w\b\u0010\u000b\u0010\f\u0010x\u0003\u0010{\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u007f\b\u0011\n\u0011\f\u0011\u0082\t\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u008d\b\u0012\u0000\u0000"+
		"\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\u0001\u0000\u0005\u0003"+
		"\u0000\t\n\r\r  \u0001\u0000..\u0001\u000009\u0003\u0000AZ__az\u0004\u0000"+
		"09AZ__az\u009f\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
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
		"\u0000\t4\u0001\u0000\u0000\u0000\u000b6\u0001\u0000\u0000\u0000\r?\u0001"+
		"\u0000\u0000\u0000\u000fA\u0001\u0000\u0000\u0000\u0011H\u0001\u0000\u0000"+
		"\u0000\u0013S\u0001\u0000\u0000\u0000\u0015U\u0001\u0000\u0000\u0000\u0017"+
		"W\u0001\u0000\u0000\u0000\u0019Y\u0001\u0000\u0000\u0000\u001b[\u0001"+
		"\u0000\u0000\u0000\u001d]\u0001\u0000\u0000\u0000\u001fm\u0001\u0000\u0000"+
		"\u0000!p\u0001\u0000\u0000\u0000#|\u0001\u0000\u0000\u0000%\u008c\u0001"+
		"\u0000\u0000\u0000\'(\u0005=\u0000\u0000(\u0002\u0001\u0000\u0000\u0000"+
		")*\u0005(\u0000\u0000*\u0004\u0001\u0000\u0000\u0000+,\u0005)\u0000\u0000"+
		",\u0006\u0001\u0000\u0000\u0000-/\u0007\u0000\u0000\u0000.-\u0001\u0000"+
		"\u0000\u0000/0\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001"+
		"\u0000\u0000\u000012\u0001\u0000\u0000\u000023\u0006\u0003\u0000\u0000"+
		"3\b\u0001\u0000\u0000\u000045\u0003\u000b\u0005\u00005\n\u0001\u0000\u0000"+
		"\u000067\u0005[\u0000\u000078\u0003\u0011\b\u000089\u0003\r\u0006\u0000"+
		"9\f\u0001\u0000\u0000\u0000:;\u0005,\u0000\u0000;<\u0003\u0011\b\u0000"+
		"<=\u0003\r\u0006\u0000=@\u0001\u0000\u0000\u0000>@\u0003\u000f\u0007\u0000"+
		"?:\u0001\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@\u000e\u0001\u0000"+
		"\u0000\u0000AB\u0005]\u0000\u0000B\u0010\u0001\u0000\u0000\u0000CI\u0003"+
		"\u001f\u000f\u0000DI\u0003!\u0010\u0000EI\u0003#\u0011\u0000FI\u0003%"+
		"\u0012\u0000GI\u0003\t\u0004\u0000HC\u0001\u0000\u0000\u0000HD\u0001\u0000"+
		"\u0000\u0000HE\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HG\u0001"+
		"\u0000\u0000\u0000I\u0012\u0001\u0000\u0000\u0000JT\u0005=\u0000\u0000"+
		"KL\u0005+\u0000\u0000LT\u0005=\u0000\u0000MN\u0005-\u0000\u0000NT\u0005"+
		"=\u0000\u0000OP\u0005*\u0000\u0000PT\u0005=\u0000\u0000QR\u0005/\u0000"+
		"\u0000RT\u0005=\u0000\u0000SJ\u0001\u0000\u0000\u0000SK\u0001\u0000\u0000"+
		"\u0000SM\u0001\u0000\u0000\u0000SO\u0001\u0000\u0000\u0000SQ\u0001\u0000"+
		"\u0000\u0000T\u0014\u0001\u0000\u0000\u0000UV\u0005+\u0000\u0000V\u0016"+
		"\u0001\u0000\u0000\u0000WX\u0005-\u0000\u0000X\u0018\u0001\u0000\u0000"+
		"\u0000YZ\u0005*\u0000\u0000Z\u001a\u0001\u0000\u0000\u0000[\\\u0005/\u0000"+
		"\u0000\\\u001c\u0001\u0000\u0000\u0000]^\u0005%\u0000\u0000^\u001e\u0001"+
		"\u0000\u0000\u0000_a\u0005\"\u0000\u0000`b\u0007\u0001\u0000\u0000a`\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000en\u0005\"\u0000\u0000"+
		"fh\u0005\'\u0000\u0000gi\u0007\u0001\u0000\u0000hg\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000kl\u0001\u0000\u0000\u0000ln\u0005\'\u0000\u0000m_\u0001\u0000\u0000"+
		"\u0000mf\u0001\u0000\u0000\u0000n \u0001\u0000\u0000\u0000oq\u0007\u0002"+
		"\u0000\u0000po\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rp\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sz\u0001\u0000\u0000\u0000"+
		"tv\u0005.\u0000\u0000uw\u0007\u0002\u0000\u0000vu\u0001\u0000\u0000\u0000"+
		"wx\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000"+
		"\u0000y{\u0001\u0000\u0000\u0000zt\u0001\u0000\u0000\u0000z{\u0001\u0000"+
		"\u0000\u0000{\"\u0001\u0000\u0000\u0000|\u0080\u0007\u0003\u0000\u0000"+
		"}\u007f\u0007\u0004\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u0082"+
		"\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001"+
		"\u0000\u0000\u0000\u0081$\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0005T\u0000\u0000\u0084\u0085\u0005r\u0000\u0000"+
		"\u0085\u0086\u0005u\u0000\u0000\u0086\u008d\u0005e\u0000\u0000\u0087\u0088"+
		"\u0005F\u0000\u0000\u0088\u0089\u0005a\u0000\u0000\u0089\u008a\u0005l"+
		"\u0000\u0000\u008a\u008b\u0005s\u0000\u0000\u008b\u008d\u0005e\u0000\u0000"+
		"\u008c\u0083\u0001\u0000\u0000\u0000\u008c\u0087\u0001\u0000\u0000\u0000"+
		"\u008d&\u0001\u0000\u0000\u0000\r\u00000?HScjmrxz\u0080\u008c\u0001\u0006"+
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