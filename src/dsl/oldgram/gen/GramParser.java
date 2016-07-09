// Generated from C:/Users/Jihed/IdeaProjects/SEProjekt/src/dsl/antlr\Gram.g4 by ANTLR 4.5.3
package dsl.oldgram.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Type=1, LETTERS=2, DIGIT=3, ZIGZAG=4, VERTICAL=5, CONTINUE=6, LineBreak=7, 
		Separator=8;
	public static final int
		RULE_file = 0, RULE_logo = 1, RULE_backGround = 2, RULE_player = 3, RULE_enemy = 4, 
		RULE_bullet = 5, RULE_objectName = 6, RULE_fileName = 7, RULE_nubmerLine = 8, 
		RULE_numberColumn = 9, RULE_objectWidth = 10, RULE_objectHeight = 11, 
		RULE_movingType = 12, RULE_speed = 13, RULE_offense = 14, RULE_defence = 15, 
		RULE_probability = 16;
	public static final String[] ruleNames = {
		"file", "logo", "backGround", "player", "enemy", "bullet", "objectName", 
		"fileName", "nubmerLine", "numberColumn", "objectWidth", "objectHeight", 
		"movingType", "speed", "offense", "defence", "probability"
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
		public LogoContext logo() {
			return getRuleContext(LogoContext.class,0);
		}
		public BackGroundContext backGround() {
			return getRuleContext(BackGroundContext.class,0);
		}
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public EnemyContext enemy() {
			return getRuleContext(EnemyContext.class,0);
		}
		public BulletContext bullet() {
			return getRuleContext(BulletContext.class,0);
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
			setState(34);
			logo();
			setState(35);
			backGround();
			setState(36);
			player();
			setState(37);
			enemy();
			setState(38);
			bullet();
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

	public static class LogoContext extends ParserRuleContext {
		public ObjectNameContext objectName() {
			return getRuleContext(ObjectNameContext.class,0);
		}
		public TerminalNode Separator() { return getToken(GramParser.Separator, 0); }
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public TerminalNode LineBreak() { return getToken(GramParser.LineBreak, 0); }
		public LogoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterLogo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitLogo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitLogo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogoContext logo() throws RecognitionException {
		LogoContext _localctx = new LogoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_logo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			objectName();
			setState(41);
			match(Separator);
			setState(42);
			fileName();
			setState(43);
			match(LineBreak);
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

	public static class BackGroundContext extends ParserRuleContext {
		public ObjectNameContext objectName() {
			return getRuleContext(ObjectNameContext.class,0);
		}
		public TerminalNode Separator() { return getToken(GramParser.Separator, 0); }
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public TerminalNode LineBreak() { return getToken(GramParser.LineBreak, 0); }
		public BackGroundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backGround; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterBackGround(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitBackGround(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitBackGround(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackGroundContext backGround() throws RecognitionException {
		BackGroundContext _localctx = new BackGroundContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_backGround);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			objectName();
			setState(46);
			match(Separator);
			setState(47);
			fileName();
			setState(48);
			match(LineBreak);
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

	public static class PlayerContext extends ParserRuleContext {
		public ObjectNameContext objectName() {
			return getRuleContext(ObjectNameContext.class,0);
		}
		public List<TerminalNode> Separator() { return getTokens(GramParser.Separator); }
		public TerminalNode Separator(int i) {
			return getToken(GramParser.Separator, i);
		}
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public NubmerLineContext nubmerLine() {
			return getRuleContext(NubmerLineContext.class,0);
		}
		public NumberColumnContext numberColumn() {
			return getRuleContext(NumberColumnContext.class,0);
		}
		public ObjectWidthContext objectWidth() {
			return getRuleContext(ObjectWidthContext.class,0);
		}
		public ObjectHeightContext objectHeight() {
			return getRuleContext(ObjectHeightContext.class,0);
		}
		public TerminalNode LineBreak() { return getToken(GramParser.LineBreak, 0); }
		public PlayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterPlayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitPlayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitPlayer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlayerContext player() throws RecognitionException {
		PlayerContext _localctx = new PlayerContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_player);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			objectName();
			setState(51);
			match(Separator);
			setState(52);
			fileName();
			setState(53);
			match(Separator);
			setState(54);
			nubmerLine();
			setState(55);
			match(Separator);
			setState(56);
			numberColumn();
			setState(57);
			match(Separator);
			setState(58);
			objectWidth();
			setState(59);
			match(Separator);
			setState(60);
			objectHeight();
			setState(61);
			match(LineBreak);
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

	public static class EnemyContext extends ParserRuleContext {
		public ObjectNameContext objectName() {
			return getRuleContext(ObjectNameContext.class,0);
		}
		public List<TerminalNode> Separator() { return getTokens(GramParser.Separator); }
		public TerminalNode Separator(int i) {
			return getToken(GramParser.Separator, i);
		}
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public NubmerLineContext nubmerLine() {
			return getRuleContext(NubmerLineContext.class,0);
		}
		public NumberColumnContext numberColumn() {
			return getRuleContext(NumberColumnContext.class,0);
		}
		public ObjectWidthContext objectWidth() {
			return getRuleContext(ObjectWidthContext.class,0);
		}
		public ObjectHeightContext objectHeight() {
			return getRuleContext(ObjectHeightContext.class,0);
		}
		public MovingTypeContext movingType() {
			return getRuleContext(MovingTypeContext.class,0);
		}
		public SpeedContext speed() {
			return getRuleContext(SpeedContext.class,0);
		}
		public OffenseContext offense() {
			return getRuleContext(OffenseContext.class,0);
		}
		public DefenceContext defence() {
			return getRuleContext(DefenceContext.class,0);
		}
		public ProbabilityContext probability() {
			return getRuleContext(ProbabilityContext.class,0);
		}
		public TerminalNode LineBreak() { return getToken(GramParser.LineBreak, 0); }
		public EnemyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enemy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterEnemy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitEnemy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitEnemy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnemyContext enemy() throws RecognitionException {
		EnemyContext _localctx = new EnemyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_enemy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			objectName();
			setState(64);
			match(Separator);
			setState(65);
			fileName();
			setState(66);
			match(Separator);
			setState(67);
			nubmerLine();
			setState(68);
			match(Separator);
			setState(69);
			numberColumn();
			setState(70);
			match(Separator);
			setState(71);
			objectWidth();
			setState(72);
			match(Separator);
			setState(73);
			objectHeight();
			setState(74);
			match(Separator);
			setState(75);
			movingType();
			setState(76);
			match(Separator);
			setState(77);
			speed();
			setState(78);
			match(Separator);
			setState(79);
			offense();
			setState(80);
			match(Separator);
			setState(81);
			defence();
			setState(82);
			match(Separator);
			setState(83);
			probability();
			setState(84);
			match(LineBreak);
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

	public static class BulletContext extends ParserRuleContext {
		public ObjectNameContext objectName() {
			return getRuleContext(ObjectNameContext.class,0);
		}
		public List<TerminalNode> Separator() { return getTokens(GramParser.Separator); }
		public TerminalNode Separator(int i) {
			return getToken(GramParser.Separator, i);
		}
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public NubmerLineContext nubmerLine() {
			return getRuleContext(NubmerLineContext.class,0);
		}
		public NumberColumnContext numberColumn() {
			return getRuleContext(NumberColumnContext.class,0);
		}
		public ObjectWidthContext objectWidth() {
			return getRuleContext(ObjectWidthContext.class,0);
		}
		public ObjectHeightContext objectHeight() {
			return getRuleContext(ObjectHeightContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GramParser.EOF, 0); }
		public BulletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bullet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterBullet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitBullet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitBullet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BulletContext bullet() throws RecognitionException {
		BulletContext _localctx = new BulletContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bullet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			objectName();
			setState(87);
			match(Separator);
			setState(88);
			fileName();
			setState(89);
			match(Separator);
			setState(90);
			nubmerLine();
			setState(91);
			match(Separator);
			setState(92);
			numberColumn();
			setState(93);
			match(Separator);
			setState(94);
			objectWidth();
			setState(95);
			match(Separator);
			setState(96);
			objectHeight();
			setState(97);
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

	public static class ObjectNameContext extends ParserRuleContext {
		public TerminalNode LETTERS() { return getToken(GramParser.LETTERS, 0); }
		public ObjectNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterObjectName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitObjectName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitObjectName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectNameContext objectName() throws RecognitionException {
		ObjectNameContext _localctx = new ObjectNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_objectName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(LETTERS);
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

	public static class FileNameContext extends ParserRuleContext {
		public TerminalNode LETTERS() { return getToken(GramParser.LETTERS, 0); }
		public FileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterFileName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitFileName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitFileName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileNameContext fileName() throws RecognitionException {
		FileNameContext _localctx = new FileNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(LETTERS);
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

	public static class NubmerLineContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(GramParser.DIGIT, 0); }
		public NubmerLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nubmerLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterNubmerLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitNubmerLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitNubmerLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NubmerLineContext nubmerLine() throws RecognitionException {
		NubmerLineContext _localctx = new NubmerLineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nubmerLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(DIGIT);
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

	public static class NumberColumnContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(GramParser.DIGIT, 0); }
		public NumberColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterNumberColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitNumberColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitNumberColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberColumnContext numberColumn() throws RecognitionException {
		NumberColumnContext _localctx = new NumberColumnContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_numberColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(DIGIT);
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

	public static class ObjectWidthContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(GramParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(GramParser.DIGIT, i);
		}
		public ObjectWidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectWidth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterObjectWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitObjectWidth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitObjectWidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectWidthContext objectWidth() throws RecognitionException {
		ObjectWidthContext _localctx = new ObjectWidthContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_objectWidth);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(107);
				match(DIGIT);
				}
				}
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	public static class ObjectHeightContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(GramParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(GramParser.DIGIT, i);
		}
		public ObjectHeightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectHeight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterObjectHeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitObjectHeight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitObjectHeight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectHeightContext objectHeight() throws RecognitionException {
		ObjectHeightContext _localctx = new ObjectHeightContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_objectHeight);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112);
				match(DIGIT);
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	public static class MovingTypeContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(GramParser.Type, 0); }
		public MovingTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_movingType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterMovingType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitMovingType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitMovingType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MovingTypeContext movingType() throws RecognitionException {
		MovingTypeContext _localctx = new MovingTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_movingType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(Type);
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

	public static class SpeedContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(GramParser.DIGIT, 0); }
		public SpeedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_speed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterSpeed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitSpeed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitSpeed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpeedContext speed() throws RecognitionException {
		SpeedContext _localctx = new SpeedContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_speed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(DIGIT);
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

	public static class OffenseContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(GramParser.DIGIT, 0); }
		public OffenseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offense; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterOffense(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitOffense(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitOffense(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffenseContext offense() throws RecognitionException {
		OffenseContext _localctx = new OffenseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_offense);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(DIGIT);
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

	public static class DefenceContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(GramParser.DIGIT, 0); }
		public DefenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterDefence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitDefence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitDefence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefenceContext defence() throws RecognitionException {
		DefenceContext _localctx = new DefenceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_defence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(DIGIT);
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

	public static class ProbabilityContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(GramParser.DIGIT, 0); }
		public ProbabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_probability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterProbability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitProbability(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitProbability(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProbabilityContext probability() throws RecognitionException {
		ProbabilityContext _localctx = new ProbabilityContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_probability);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(DIGIT);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\n\u0082\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\6\fo\n\f\r\f\16\fp\3\r\6\rt\n\r\r\r\16\ru\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"\2\2r\2$\3\2\2\2\4*\3\2\2\2\6/\3\2\2\2\b\64\3"+
		"\2\2\2\nA\3\2\2\2\fX\3\2\2\2\16e\3\2\2\2\20g\3\2\2\2\22i\3\2\2\2\24k\3"+
		"\2\2\2\26n\3\2\2\2\30s\3\2\2\2\32w\3\2\2\2\34y\3\2\2\2\36{\3\2\2\2 }\3"+
		"\2\2\2\"\177\3\2\2\2$%\5\4\3\2%&\5\6\4\2&\'\5\b\5\2\'(\5\n\6\2()\5\f\7"+
		"\2)\3\3\2\2\2*+\5\16\b\2+,\7\n\2\2,-\5\20\t\2-.\7\t\2\2.\5\3\2\2\2/\60"+
		"\5\16\b\2\60\61\7\n\2\2\61\62\5\20\t\2\62\63\7\t\2\2\63\7\3\2\2\2\64\65"+
		"\5\16\b\2\65\66\7\n\2\2\66\67\5\20\t\2\678\7\n\2\289\5\22\n\29:\7\n\2"+
		"\2:;\5\24\13\2;<\7\n\2\2<=\5\26\f\2=>\7\n\2\2>?\5\30\r\2?@\7\t\2\2@\t"+
		"\3\2\2\2AB\5\16\b\2BC\7\n\2\2CD\5\20\t\2DE\7\n\2\2EF\5\22\n\2FG\7\n\2"+
		"\2GH\5\24\13\2HI\7\n\2\2IJ\5\26\f\2JK\7\n\2\2KL\5\30\r\2LM\7\n\2\2MN\5"+
		"\32\16\2NO\7\n\2\2OP\5\34\17\2PQ\7\n\2\2QR\5\36\20\2RS\7\n\2\2ST\5 \21"+
		"\2TU\7\n\2\2UV\5\"\22\2VW\7\t\2\2W\13\3\2\2\2XY\5\16\b\2YZ\7\n\2\2Z[\5"+
		"\20\t\2[\\\7\n\2\2\\]\5\22\n\2]^\7\n\2\2^_\5\24\13\2_`\7\n\2\2`a\5\26"+
		"\f\2ab\7\n\2\2bc\5\30\r\2cd\7\2\2\3d\r\3\2\2\2ef\7\4\2\2f\17\3\2\2\2g"+
		"h\7\4\2\2h\21\3\2\2\2ij\7\5\2\2j\23\3\2\2\2kl\7\5\2\2l\25\3\2\2\2mo\7"+
		"\5\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\27\3\2\2\2rt\7\5\2\2s"+
		"r\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v\31\3\2\2\2wx\7\3\2\2x\33\3\2"+
		"\2\2yz\7\5\2\2z\35\3\2\2\2{|\7\5\2\2|\37\3\2\2\2}~\7\5\2\2~!\3\2\2\2\177"+
		"\u0080\7\5\2\2\u0080#\3\2\2\2\4pu";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}