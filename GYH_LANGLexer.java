// Generated from GYH_LANG.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GYH_LANGLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, PC=5, Delim=6, OpRel=7, Var=8, NumInt=9, 
		NumReal=10, Atrib=11, WS=12, Coment=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "PC", "Delim", "OpRel", "Var", "NumInt", 
			"NumReal", "Atrib", "WS", "Coment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DEC'", "'INT'", "'REAL'", "'+'", null, "':'", null, null, null, 
			null, "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "PC", "Delim", "OpRel", "Var", "NumInt", 
			"NumReal", "Atrib", "WS", "Coment"
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


	public GYH_LANGLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GYH_LANG.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u00a0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6]\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bk\n"+
		"\b\3\t\3\t\7\to\n\t\f\t\16\tr\13\t\3\n\6\nu\n\n\r\n\16\nv\3\13\6\13z\n"+
		"\13\r\13\16\13{\3\13\3\13\7\13\u0080\n\13\f\13\16\13\u0083\13\13\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\7\16\u0098\n\16\f\16\16\16\u009b\13\16\3\16\3\16\3\16\3"+
		"\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\3\2\b\3\2c|\5\2\62;C\\c|\3\2\62;\5\2\13\f\17\17\"\"\6\2\62;>>C\\c"+
		"|\6\2\13\13\17\17\"\"%%\2\u00ba\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2"+
		"\5!\3\2\2\2\7%\3\2\2\2\t*\3\2\2\2\13\\\3\2\2\2\r^\3\2\2\2\17j\3\2\2\2"+
		"\21l\3\2\2\2\23t\3\2\2\2\25y\3\2\2\2\27\u0084\3\2\2\2\31\u0087\3\2\2\2"+
		"\33\u008b\3\2\2\2\35\36\7F\2\2\36\37\7G\2\2\37 \7E\2\2 \4\3\2\2\2!\"\7"+
		"K\2\2\"#\7P\2\2#$\7V\2\2$\6\3\2\2\2%&\7T\2\2&\'\7G\2\2\'(\7C\2\2()\7N"+
		"\2\2)\b\3\2\2\2*+\7-\2\2+\n\3\2\2\2,-\7F\2\2-.\7G\2\2.]\7E\2\2/\60\7R"+
		"\2\2\60\61\7T\2\2\61\62\7Q\2\2\62]\7I\2\2\63\64\7K\2\2\64\65\7P\2\2\65"+
		"]\7V\2\2\66\67\7T\2\2\678\7G\2\289\7C\2\29]\7N\2\2:;\7N\2\2;<\7G\2\2<"+
		"]\7T\2\2=>\7K\2\2>?\7O\2\2?@\7R\2\2@A\7T\2\2AB\7K\2\2BC\7O\2\2CD\7K\2"+
		"\2D]\7T\2\2EF\7U\2\2F]\7G\2\2GH\7G\2\2HI\7P\2\2IJ\7V\2\2JK\7C\2\2K]\7"+
		"Q\2\2LM\7U\2\2MN\7G\2\2NO\7P\2\2OP\7C\2\2P]\7Q\2\2QR\7G\2\2RS\7P\2\2S"+
		"T\7S\2\2TU\7V\2\2U]\7Q\2\2VW\7K\2\2WX\7P\2\2X]\7K\2\2YZ\7H\2\2Z[\7K\2"+
		"\2[]\7O\2\2\\,\3\2\2\2\\/\3\2\2\2\\\63\3\2\2\2\\\66\3\2\2\2\\:\3\2\2\2"+
		"\\=\3\2\2\2\\E\3\2\2\2\\G\3\2\2\2\\L\3\2\2\2\\Q\3\2\2\2\\V\3\2\2\2\\Y"+
		"\3\2\2\2]\f\3\2\2\2^_\7<\2\2_\16\3\2\2\2`k\7>\2\2ab\7>\2\2bk\7?\2\2ck"+
		"\7@\2\2de\7@\2\2ek\7?\2\2fg\7?\2\2gk\7?\2\2hi\7#\2\2ik\7?\2\2j`\3\2\2"+
		"\2ja\3\2\2\2jc\3\2\2\2jd\3\2\2\2jf\3\2\2\2jh\3\2\2\2k\20\3\2\2\2lp\t\2"+
		"\2\2mo\t\3\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\22\3\2\2\2rp\3"+
		"\2\2\2su\t\4\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\24\3\2\2\2x"+
		"z\t\4\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\u0081\7\60"+
		"\2\2~\u0080\t\4\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2"+
		"\u0081\u0082\3\2\2\2\u0082\26\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085"+
		"\7<\2\2\u0085\u0086\7?\2\2\u0086\30\3\2\2\2\u0087\u0088\t\5\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008a\b\r\2\2\u008a\32\3\2\2\2\u008b\u0099\7%\2\2"+
		"\u008c\u0098\t\6\2\2\u008d\u008e\7>\2\2\u008e\u0098\7?\2\2\u008f\u0098"+
		"\7@\2\2\u0090\u0091\7@\2\2\u0091\u0098\7?\2\2\u0092\u0093\7?\2\2\u0093"+
		"\u0098\7?\2\2\u0094\u0095\7#\2\2\u0095\u0098\7?\2\2\u0096\u0098\t\7\2"+
		"\2\u0097\u008c\3\2\2\2\u0097\u008d\3\2\2\2\u0097\u008f\3\2\2\2\u0097\u0090"+
		"\3\2\2\2\u0097\u0092\3\2\2\2\u0097\u0094\3\2\2\2\u0097\u0096\3\2\2\2\u0098"+
		"\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7\f\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\b\16\2\2\u009f\34\3\2\2\2\f\2\\jnpv{\u0081\u0097\u0099\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}