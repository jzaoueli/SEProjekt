// Generated from C:/Users/Jihed/IdeaProjects/SEProjekt/src/dsl/antlr\Gram.g4 by ANTLR 4.5.3
package dsl.antlr.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Name=1, FileName=2, Line=3, Column=4, Width=5, Height=6, DIGIT=7, LineBreak=8, 
		Separator=9;
	public static final int
		RULE_file = 0, RULE_backgroundRow = 1, RULE_playerRow = 2;
	public static final String[] ruleNames = {
		"file", "backgroundRow", "playerRow"
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

	@Override
	public String getGrammarFileName() { return "Gram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public BackgroundRowContext backgroundRow() {
			return getRuleContext(BackgroundRowContext.class,0);
		}
		public TerminalNode LineBreak() { return getToken(GramParser.LineBreak, 0); }
		public PlayerRowContext playerRow() {
			return getRuleContext(PlayerRowContext.class,0);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			backgroundRow();
			setState(7);
			match(LineBreak);
			setState(8);
			playerRow();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BackgroundRowContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(GramParser.Name, 0); }
		public TerminalNode Separator() { return getToken(GramParser.Separator, 0); }
		public TerminalNode FileName() { return getToken(GramParser.FileName, 0); }
		public BackgroundRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backgroundRow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterBackgroundRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitBackgroundRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitBackgroundRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackgroundRowContext backgroundRow() throws RecognitionException {
		BackgroundRowContext _localctx = new BackgroundRowContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_backgroundRow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(Name);
			setState(11);
			match(Separator);
			setState(12);
			match(FileName);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlayerRowContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(GramParser.Name, 0); }
		public List<TerminalNode> Separator() { return getTokens(GramParser.Separator); }
		public TerminalNode Separator(int i) {
			return getToken(GramParser.Separator, i);
		}
		public TerminalNode FileName() { return getToken(GramParser.FileName, 0); }
		public TerminalNode Line() { return getToken(GramParser.Line, 0); }
		public TerminalNode Column() { return getToken(GramParser.Column, 0); }
		public TerminalNode Width() { return getToken(GramParser.Width, 0); }
		public TerminalNode Height() { return getToken(GramParser.Height, 0); }
		public TerminalNode EOF() { return getToken(GramParser.EOF, 0); }
		public PlayerRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playerRow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterPlayerRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitPlayerRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitPlayerRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlayerRowContext playerRow() throws RecognitionException {
		PlayerRowContext _localctx = new PlayerRowContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_playerRow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(Name);
			setState(15);
			match(Separator);
			setState(16);
			match(FileName);
			setState(17);
			match(Separator);
			setState(18);
			match(Line);
			setState(19);
			match(Separator);
			setState(20);
			match(Column);
			setState(21);
			match(Separator);
			setState(22);
			match(Width);
			setState(23);
			match(Separator);
			setState(24);
			match(Height);
			setState(25);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\13\36\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\2\2\5\2\4\6\2\2\32\2\b\3\2\2\2\4\f\3\2"+
		"\2\2\6\20\3\2\2\2\b\t\5\4\3\2\t\n\7\n\2\2\n\13\5\6\4\2\13\3\3\2\2\2\f"+
		"\r\7\3\2\2\r\16\7\13\2\2\16\17\7\4\2\2\17\5\3\2\2\2\20\21\7\3\2\2\21\22"+
		"\7\13\2\2\22\23\7\4\2\2\23\24\7\13\2\2\24\25\7\5\2\2\25\26\7\13\2\2\26"+
		"\27\7\6\2\2\27\30\7\13\2\2\30\31\7\7\2\2\31\32\7\13\2\2\32\33\7\b\2\2"+
		"\33\34\7\2\2\3\34\7\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}