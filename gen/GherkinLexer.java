// Generated from C:/workspaces/github/ice-parser/src/main/antlr4/com/github/ledoyen/ice/parser\Gherkin.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GherkinLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, NL=9, 
		FEATURE_KEYWORD=10, BACKGROUND_KEYWORD=11, SCENARIO_KEYWORD=12, SCENARIO_OUTLINE_KEYWORD=13, 
		STEP_KEYWORD=14, EXAMPLES_KEYWORD=15, SEPARATOR=16, WORD=17, ANY=18, WS=19, 
		LINE_COMMENT=20, SPACE=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "NL", 
		"FEATURE_KEYWORD", "BACKGROUND_KEYWORD", "SCENARIO_KEYWORD", "SCENARIO_OUTLINE_KEYWORD", 
		"STEP_KEYWORD", "EXAMPLES_KEYWORD", "SEPARATOR", "WORD", "ANY", "WS", 
		"LINE_COMMENT", "SPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", "'#'", "'language'", "':'", "'@'", "'\r'", "'\n'", "'|'", 
		null, "'Feature'", "'Background'", "'Scenario'", "'Scenario Outline'", 
		null, "'Examples'", "'''''"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "NL", "FEATURE_KEYWORD", 
		"BACKGROUND_KEYWORD", "SCENARIO_KEYWORD", "SCENARIO_OUTLINE_KEYWORD", 
		"STEP_KEYWORD", "EXAMPLES_KEYWORD", "SEPARATOR", "WORD", "ANY", "WS", 
		"LINE_COMMENT", "SPACE"
	};
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


	public GherkinLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gherkin.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 20:
			SPACE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u00b9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\5\nF\n\n\3\n\3\n\7\nJ\n\n\f\n\16\nM\13\n\3\n\5\nP\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u008f"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\22\6\22\u009f\n\22\r\22\16\22\u00a0\3\23\3\23\3\24\6\24\u00a6\n\24"+
		"\r\24\16\24\u00a7\3\24\3\24\3\25\3\25\7\25\u00ae\n\25\f\25\16\25\u00b1"+
		"\13\25\3\26\6\26\u00b4\n\26\r\26\16\26\u00b5\3\26\3\26\2\2\27\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27\3\2\5\6\2//C\\aac|\4\2\13\13\"\"\4\2\f\f\17\17\2"+
		"\u00c2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5"+
		"/\3\2\2\2\7\61\3\2\2\2\t:\3\2\2\2\13<\3\2\2\2\r>\3\2\2\2\17@\3\2\2\2\21"+
		"B\3\2\2\2\23O\3\2\2\2\25Q\3\2\2\2\27Y\3\2\2\2\31d\3\2\2\2\33m\3\2\2\2"+
		"\35\u008e\3\2\2\2\37\u0090\3\2\2\2!\u0099\3\2\2\2#\u009e\3\2\2\2%\u00a2"+
		"\3\2\2\2\'\u00a5\3\2\2\2)\u00ab\3\2\2\2+\u00b3\3\2\2\2-.\7\"\2\2.\4\3"+
		"\2\2\2/\60\7%\2\2\60\6\3\2\2\2\61\62\7n\2\2\62\63\7c\2\2\63\64\7p\2\2"+
		"\64\65\7i\2\2\65\66\7w\2\2\66\67\7c\2\2\678\7i\2\289\7g\2\29\b\3\2\2\2"+
		":;\7<\2\2;\n\3\2\2\2<=\7B\2\2=\f\3\2\2\2>?\7\17\2\2?\16\3\2\2\2@A\7\f"+
		"\2\2A\20\3\2\2\2BC\7~\2\2C\22\3\2\2\2DF\7\17\2\2ED\3\2\2\2EF\3\2\2\2F"+
		"G\3\2\2\2GK\7\f\2\2HJ\7\"\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2"+
		"LP\3\2\2\2MK\3\2\2\2NP\7\2\2\3OE\3\2\2\2ON\3\2\2\2P\24\3\2\2\2QR\7H\2"+
		"\2RS\7g\2\2ST\7c\2\2TU\7v\2\2UV\7w\2\2VW\7t\2\2WX\7g\2\2X\26\3\2\2\2Y"+
		"Z\7D\2\2Z[\7c\2\2[\\\7e\2\2\\]\7m\2\2]^\7i\2\2^_\7t\2\2_`\7q\2\2`a\7w"+
		"\2\2ab\7p\2\2bc\7f\2\2c\30\3\2\2\2de\7U\2\2ef\7e\2\2fg\7g\2\2gh\7p\2\2"+
		"hi\7c\2\2ij\7t\2\2jk\7k\2\2kl\7q\2\2l\32\3\2\2\2mn\7U\2\2no\7e\2\2op\7"+
		"g\2\2pq\7p\2\2qr\7c\2\2rs\7t\2\2st\7k\2\2tu\7q\2\2uv\7\"\2\2vw\7Q\2\2"+
		"wx\7w\2\2xy\7v\2\2yz\7n\2\2z{\7k\2\2{|\7p\2\2|}\7g\2\2}\34\3\2\2\2~\177"+
		"\7I\2\2\177\u0080\7k\2\2\u0080\u0081\7x\2\2\u0081\u0082\7g\2\2\u0082\u008f"+
		"\7p\2\2\u0083\u0084\7Y\2\2\u0084\u0085\7j\2\2\u0085\u0086\7g\2\2\u0086"+
		"\u008f\7p\2\2\u0087\u0088\7V\2\2\u0088\u0089\7j\2\2\u0089\u008a\7g\2\2"+
		"\u008a\u008f\7p\2\2\u008b\u008c\7C\2\2\u008c\u008d\7p\2\2\u008d\u008f"+
		"\7f\2\2\u008e~\3\2\2\2\u008e\u0083\3\2\2\2\u008e\u0087\3\2\2\2\u008e\u008b"+
		"\3\2\2\2\u008f\36\3\2\2\2\u0090\u0091\7G\2\2\u0091\u0092\7z\2\2\u0092"+
		"\u0093\7c\2\2\u0093\u0094\7o\2\2\u0094\u0095\7r\2\2\u0095\u0096\7n\2\2"+
		"\u0096\u0097\7g\2\2\u0097\u0098\7u\2\2\u0098 \3\2\2\2\u0099\u009a\7)\2"+
		"\2\u009a\u009b\7)\2\2\u009b\u009c\7)\2\2\u009c\"\3\2\2\2\u009d\u009f\t"+
		"\2\2\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1$\3\2\2\2\u00a2\u00a3\13\2\2\2\u00a3&\3\2\2\2\u00a4"+
		"\u00a6\t\3\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\b\24\2\2\u00aa"+
		"(\3\2\2\2\u00ab\u00af\7%\2\2\u00ac\u00ae\n\4\2\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0*\3\2\2\2"+
		"\u00b1\u00af\3\2\2\2\u00b2\u00b4\t\3\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b8\b\26\3\2\u00b8,\3\2\2\2\13\2EKO\u008e\u00a0\u00a7\u00af\u00b5\4"+
		"\b\2\2\3\26\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}