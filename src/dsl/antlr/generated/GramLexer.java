// Generated from C:/Users/Jihed/IdeaProjects/SEProjekt/src/dsl/antlr\Gram.g4 by ANTLR 4.5.3
package dsl.antlr.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Name=1, FileName=2, Line=3, Column=4, Width=5, Height=6, DIGIT=7, LineBreak=8, 
		Separator=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Name", "FileName", "Line", "Column", "Width", "Height", "DIGIT", "LineBreak", 
		"Separator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Name", "FileName", "Line", "Column", "Width", "Height", "DIGIT", 
		"LineBreak", "Separator"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\138\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6\2"+
		"\27\n\2\r\2\16\2\30\3\3\6\3\34\n\3\r\3\16\3\35\3\4\3\4\3\5\3\5\3\6\6\6"+
		"%\n\6\r\6\16\6&\3\7\6\7*\n\7\r\7\16\7+\3\b\3\b\3\t\5\t\61\n\t\3\t\3\t"+
		"\5\t\65\n\t\3\n\3\n\2\2\13\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\3"+
		"\2\3\4\2\60\60c|=\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\26\3\2\2"+
		"\2\5\33\3\2\2\2\7\37\3\2\2\2\t!\3\2\2\2\13$\3\2\2\2\r)\3\2\2\2\17-\3\2"+
		"\2\2\21\64\3\2\2\2\23\66\3\2\2\2\25\27\4c|\2\26\25\3\2\2\2\27\30\3\2\2"+
		"\2\30\26\3\2\2\2\30\31\3\2\2\2\31\4\3\2\2\2\32\34\t\2\2\2\33\32\3\2\2"+
		"\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\6\3\2\2\2\37 \5\17\b\2"+
		" \b\3\2\2\2!\"\5\17\b\2\"\n\3\2\2\2#%\5\17\b\2$#\3\2\2\2%&\3\2\2\2&$\3"+
		"\2\2\2&\'\3\2\2\2\'\f\3\2\2\2(*\5\17\b\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2"+
		"+,\3\2\2\2,\16\3\2\2\2-.\4\62;\2.\20\3\2\2\2/\61\7\17\2\2\60/\3\2\2\2"+
		"\60\61\3\2\2\2\61\62\3\2\2\2\62\65\7\f\2\2\63\65\7\17\2\2\64\60\3\2\2"+
		"\2\64\63\3\2\2\2\65\22\3\2\2\2\66\67\7=\2\2\67\24\3\2\2\2\t\2\30\35&+"+
		"\60\64\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}