// Generated from C:/Users/Jihed/IdeaProjects/SEProjekt/src/dsl/antlr\Gram.g4 by ANTLR 4.5.3
package dsl.oldgram.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Type=1, LETTERS=2, DIGIT=3, ZIGZAG=4, VERTICAL=5, CONTINUE=6, LineBreak=7, 
		Separator=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Type", "LETTERS", "DIGIT", "ZIGZAG", "VERTICAL", "CONTINUE", "LineBreak", 
		"Separator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'zigzag'", "'vertical'", "'continue'", null, 
		"';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Type", "LETTERS", "DIGIT", "ZIGZAG", "VERTICAL", "CONTINUE", "LineBreak", 
		"Separator"
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


	public GramLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\nA\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\5\2"+
		"\27\n\2\3\3\6\3\32\n\3\r\3\16\3\33\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\5\b:\n\b\3\b\3\b\5\b>\n\b\3\t\3\t\2\2\n\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\3\2\3\4\2\60\60c|E\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\26\3\2"+
		"\2\2\5\31\3\2\2\2\7\35\3\2\2\2\t\37\3\2\2\2\13&\3\2\2\2\r/\3\2\2\2\17"+
		"=\3\2\2\2\21?\3\2\2\2\23\27\5\t\5\2\24\27\5\13\6\2\25\27\5\r\7\2\26\23"+
		"\3\2\2\2\26\24\3\2\2\2\26\25\3\2\2\2\27\4\3\2\2\2\30\32\t\2\2\2\31\30"+
		"\3\2\2\2\32\33\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\6\3\2\2\2\35\36"+
		"\4\62;\2\36\b\3\2\2\2\37 \7|\2\2 !\7k\2\2!\"\7i\2\2\"#\7|\2\2#$\7c\2\2"+
		"$%\7i\2\2%\n\3\2\2\2&\'\7x\2\2\'(\7g\2\2()\7t\2\2)*\7v\2\2*+\7k\2\2+,"+
		"\7e\2\2,-\7c\2\2-.\7n\2\2.\f\3\2\2\2/\60\7e\2\2\60\61\7q\2\2\61\62\7p"+
		"\2\2\62\63\7v\2\2\63\64\7k\2\2\64\65\7p\2\2\65\66\7w\2\2\66\67\7g\2\2"+
		"\67\16\3\2\2\28:\7\17\2\298\3\2\2\29:\3\2\2\2:;\3\2\2\2;>\7\f\2\2<>\7"+
		"\17\2\2=9\3\2\2\2=<\3\2\2\2>\20\3\2\2\2?@\7=\2\2@\22\3\2\2\2\7\2\26\33"+
		"9=\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}