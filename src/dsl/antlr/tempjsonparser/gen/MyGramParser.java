// Generated from C:/Users/Jihed/IdeaProjects/SEProjekt/src/dsl/antlr/jsonparser\MyGram.g4 by ANTLR 4.5.3
package dsl.antlr.tempjsonparser.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, Type=20, STRING=21, DIGIT=22, ZIGZAG=23, VERTICAL=24, 
		CONTINUE=25, WS=26;
	public static final int
		RULE_gram = 0, RULE_images = 1, RULE_logo = 2, RULE_background = 3, RULE_player = 4, 
		RULE_bullet = 5, RULE_enemy = 6, RULE_spriteObject = 7, RULE_imageObject = 8, 
		RULE_numberLine = 9, RULE_numberColumn = 10, RULE_width = 11, RULE_height = 12, 
		RULE_attack = 13, RULE_defense = 14, RULE_speed = 15, RULE_movement = 16, 
		RULE_movingType = 17;
	public static final String[] ruleNames = {
		"gram", "images", "logo", "background", "player", "bullet", "enemy", "spriteObject", 
		"imageObject", "numberLine", "numberColumn", "width", "height", "attack", 
		"defense", "speed", "movement", "movingType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'image'", "'ImageLogo'", "'{'", "'}'", "'ImageBackground'", "'ImagePlayer'", 
		"'BulletNormal'", "'CommonAttackEnemy'", "'file'", "':'", "'.'", "'row'", 
		"'column'", "'width'", "'height'", "'attack'", "'defense'", "'speed'", 
		"'movement:'", null, null, null, "'zigzag'", "'vertical'", "'continue'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "Type", "STRING", "DIGIT", 
		"ZIGZAG", "VERTICAL", "CONTINUE", "WS"
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
	public String getGrammarFileName() { return "MyGram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyGramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GramContext extends ParserRuleContext {
		public ImagesContext images() {
			return getRuleContext(ImagesContext.class,0);
		}
		public BulletContext bullet() {
			return getRuleContext(BulletContext.class,0);
		}
		public EnemyContext enemy() {
			return getRuleContext(EnemyContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MyGramParser.EOF, 0); }
		public GramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).enterGram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).exitGram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramVisitor ) return ((MyGramVisitor<? extends T>)visitor).visitGram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GramContext gram() throws RecognitionException {
		GramContext _localctx = new GramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_gram);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			images();
			setState(37);
			bullet();
			setState(38);
			enemy();
			setState(39);
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

	public static class ImagesContext extends ParserRuleContext {
		public LogoContext logo() {
			return getRuleContext(LogoContext.class,0);
		}
		public BackgroundContext background() {
			return getRuleContext(BackgroundContext.class,0);
		}
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public ImagesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_images; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).enterImages(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).exitImages(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramVisitor ) return ((MyGramVisitor<? extends T>)visitor).visitImages(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImagesContext images() throws RecognitionException {
		ImagesContext _localctx = new ImagesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_images);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__0);
			setState(42);
			logo();
			setState(43);
			background();
			setState(44);
			player();
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
		public ImageObjectContext imageObject() {
			return getRuleContext(ImageObjectContext.class,0);
		}
		public LogoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).enterLogo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).exitLogo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramVisitor ) return ((MyGramVisitor<? extends T>)visitor).visitLogo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogoContext logo() throws RecognitionException {
		LogoContext _localctx = new LogoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_logo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__1);
			setState(47);
			match(T__2);
			setState(48);
			imageObject();
			setState(49);
			match(T__3);
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

	public static class BackgroundContext extends ParserRuleContext {
		public ImageObjectContext imageObject() {
			return getRuleContext(ImageObjectContext.class,0);
		}
		public BackgroundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_background; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).enterBackground(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).exitBackground(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramVisitor ) return ((MyGramVisitor<? extends T>)visitor).visitBackground(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackgroundContext background() throws RecognitionException {
		BackgroundContext _localctx = new BackgroundContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_background);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__4);
			setState(52);
			match(T__2);
			setState(53);
			imageObject();
			setState(54);
			match(T__3);
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
		public SpriteObjectContext spriteObject() {
			return getRuleContext(SpriteObjectContext.class,0);
		}
		public PlayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).enterPlayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).exitPlayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramVisitor ) return ((MyGramVisitor<? extends T>)visitor).visitPlayer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlayerContext player() throws RecognitionException {
		PlayerContext _localctx = new PlayerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_player);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__5);
			setState(57);
			match(T__2);
			setState(58);
			spriteObject();
			setState(59);
			match(T__3);
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
		public SpriteObjectContext spriteObject() {
			return getRuleContext(SpriteObjectContext.class,0);
		}
		public AttackContext attack() {
			return getRuleContext(AttackContext.class,0);
		}
		public SpeedContext speed() {
			return getRuleContext(SpeedContext.class,0);
		}
		public BulletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bullet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).enterBullet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).exitBullet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramVisitor ) return ((MyGramVisitor<? extends T>)visitor).visitBullet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BulletContext bullet() throws RecognitionException {
		BulletContext _localctx = new BulletContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bullet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__6);
			setState(62);
			match(T__2);
			setState(63);
			spriteObject();
			setState(64);
			attack();
			setState(65);
			speed();
			setState(66);
			match(T__3);
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
		public SpriteObjectContext spriteObject() {
			return getRuleContext(SpriteObjectContext.class,0);
		}
		public MovementContext movement() {
			return getRuleContext(MovementContext.class,0);
		}
		public AttackContext attack() {
			return getRuleContext(AttackContext.class,0);
		}
		public DefenseContext defense() {
			return getRuleContext(DefenseContext.class,0);
		}
		public SpeedContext speed() {
			return getRuleContext(SpeedContext.class,0);
		}
		public EnemyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enemy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).enterEnemy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).exitEnemy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramVisitor ) return ((MyGramVisitor<? extends T>)visitor).visitEnemy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnemyContext enemy() throws RecognitionException {
		EnemyContext _localctx = new EnemyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_enemy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__7);
			setState(69);
			match(T__2);
			setState(70);
			spriteObject();
			setState(71);
			movement();
			setState(72);
			attack();
			setState(73);
			defense();
			setState(74);
			speed();
			setState(75);
			match(T__3);
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

	public static class SpriteObjectContext extends ParserRuleContext {
		public ImageObjectContext imageObject() {
			return getRuleContext(ImageObjectContext.class,0);
		}
		public NumberLineContext numberLine() {
			return getRuleContext(NumberLineContext.class,0);
		}
		public NumberColumnContext numberColumn() {
			return getRuleContext(NumberColumnContext.class,0);
		}
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public HeightContext height() {
			return getRuleContext(HeightContext.class,0);
		}
		public SpriteObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spriteObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).enterSpriteObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).exitSpriteObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramVisitor ) return ((MyGramVisitor<? extends T>)visitor).visitSpriteObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpriteObjectContext spriteObject() throws RecognitionException {
		SpriteObjectContext _localctx = new SpriteObjectContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_spriteObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			imageObject();
			setState(78);
			numberLine();
			setState(79);
			numberColumn();
			setState(80);
			width();
			setState(81);
			height();
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

	public static class ImageObjectContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(MyGramParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MyGramParser.STRING, i);
		}
		public ImageObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imageObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).enterImageObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).exitImageObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramVisitor ) return ((MyGramVisitor<? extends T>)visitor).visitImageObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageObjectContext imageObject() throws RecognitionException {
		ImageObjectContext _localctx = new ImageObjectContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_imageObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__8);
			setState(84);
			match(T__9);
			setState(85);
			match(STRING);
			setState(86);
			match(T__10);
			setState(87);
			match(STRING);
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

	public static class NumberLineContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(MyGramParser.DIGIT, 0); }
		public NumberLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).enterNumberLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).exitNumberLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramVisitor ) return ((MyGramVisitor<? extends T>)visitor).visitNumberLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLineContext numberLine() throws RecognitionException {
		NumberLineContext _localctx = new NumberLineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_numberLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__11);
			setState(90);
			match(T__9);
			setState(91);
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
		public TerminalNode DIGIT() { return getToken(MyGramParser.DIGIT, 0); }
		public NumberColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).enterNumberColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).exitNumberColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramVisitor ) return ((MyGramVisitor<? extends T>)visitor).visitNumberColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberColumnContext numberColumn() throws RecognitionException {
		NumberColumnContext _localctx = new NumberColumnContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_numberColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__12);
			setState(94);
			match(T__9);
			setState(95);
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

	public static class WidthContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(MyGramParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(MyGramParser.DIGIT, i);
		}
		public WidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_width; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).enterWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).exitWidth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramVisitor ) return ((MyGramVisitor<? extends T>)visitor).visitWidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidthContext width() throws RecognitionException {
		WidthContext _localctx = new WidthContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_width);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__13);
			setState(98);
			match(T__9);
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(99);
				match(DIGIT);
				}
				}
				setState(102); 
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

	public static class HeightContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(MyGramParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(MyGramParser.DIGIT, i);
		}
		public HeightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_height; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).enterHeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).exitHeight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramVisitor ) return ((MyGramVisitor<? extends T>)visitor).visitHeight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeightContext height() throws RecognitionException {
		HeightContext _localctx = new HeightContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_height);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__14);
			setState(105);
			match(T__9);
			setState(107); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(106);
				match(DIGIT);
				}
				}
				setState(109); 
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

	public static class AttackContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(MyGramParser.DIGIT, 0); }
		public AttackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).enterAttack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).exitAttack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramVisitor ) return ((MyGramVisitor<? extends T>)visitor).visitAttack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttackContext attack() throws RecognitionException {
		AttackContext _localctx = new AttackContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_attack);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__15);
			setState(112);
			match(T__9);
			setState(113);
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

	public static class DefenseContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(MyGramParser.DIGIT, 0); }
		public DefenseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defense; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).enterDefense(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).exitDefense(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramVisitor ) return ((MyGramVisitor<? extends T>)visitor).visitDefense(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefenseContext defense() throws RecognitionException {
		DefenseContext _localctx = new DefenseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_defense);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__16);
			setState(116);
			match(T__9);
			setState(117);
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

	public static class SpeedContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(MyGramParser.DIGIT, 0); }
		public SpeedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_speed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).enterSpeed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).exitSpeed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramVisitor ) return ((MyGramVisitor<? extends T>)visitor).visitSpeed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpeedContext speed() throws RecognitionException {
		SpeedContext _localctx = new SpeedContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_speed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__17);
			setState(120);
			match(T__9);
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

	public static class MovementContext extends ParserRuleContext {
		public MovingTypeContext movingType() {
			return getRuleContext(MovingTypeContext.class,0);
		}
		public MovementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_movement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).enterMovement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).exitMovement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramVisitor ) return ((MyGramVisitor<? extends T>)visitor).visitMovement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MovementContext movement() throws RecognitionException {
		MovementContext _localctx = new MovementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_movement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__18);
			setState(124);
			movingType();
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
		public TerminalNode Type() { return getToken(MyGramParser.Type, 0); }
		public MovingTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_movingType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).enterMovingType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).exitMovingType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramVisitor ) return ((MyGramVisitor<? extends T>)visitor).visitMovingType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MovingTypeContext movingType() throws RecognitionException {
		MovingTypeContext _localctx = new MovingTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_movingType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34\u0083\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\6\rg\n\r"+
		"\r\r\16\rh\3\16\3\16\3\16\6\16n\n\16\r\16\16\16o\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\2"+
		"\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\2r\2&\3\2\2\2\4+\3"+
		"\2\2\2\6\60\3\2\2\2\b\65\3\2\2\2\n:\3\2\2\2\f?\3\2\2\2\16F\3\2\2\2\20"+
		"O\3\2\2\2\22U\3\2\2\2\24[\3\2\2\2\26_\3\2\2\2\30c\3\2\2\2\32j\3\2\2\2"+
		"\34q\3\2\2\2\36u\3\2\2\2 y\3\2\2\2\"}\3\2\2\2$\u0080\3\2\2\2&\'\5\4\3"+
		"\2\'(\5\f\7\2()\5\16\b\2)*\7\2\2\3*\3\3\2\2\2+,\7\3\2\2,-\5\6\4\2-.\5"+
		"\b\5\2./\5\n\6\2/\5\3\2\2\2\60\61\7\4\2\2\61\62\7\5\2\2\62\63\5\22\n\2"+
		"\63\64\7\6\2\2\64\7\3\2\2\2\65\66\7\7\2\2\66\67\7\5\2\2\678\5\22\n\28"+
		"9\7\6\2\29\t\3\2\2\2:;\7\b\2\2;<\7\5\2\2<=\5\20\t\2=>\7\6\2\2>\13\3\2"+
		"\2\2?@\7\t\2\2@A\7\5\2\2AB\5\20\t\2BC\5\34\17\2CD\5 \21\2DE\7\6\2\2E\r"+
		"\3\2\2\2FG\7\n\2\2GH\7\5\2\2HI\5\20\t\2IJ\5\"\22\2JK\5\34\17\2KL\5\36"+
		"\20\2LM\5 \21\2MN\7\6\2\2N\17\3\2\2\2OP\5\22\n\2PQ\5\24\13\2QR\5\26\f"+
		"\2RS\5\30\r\2ST\5\32\16\2T\21\3\2\2\2UV\7\13\2\2VW\7\f\2\2WX\7\27\2\2"+
		"XY\7\r\2\2YZ\7\27\2\2Z\23\3\2\2\2[\\\7\16\2\2\\]\7\f\2\2]^\7\30\2\2^\25"+
		"\3\2\2\2_`\7\17\2\2`a\7\f\2\2ab\7\30\2\2b\27\3\2\2\2cd\7\20\2\2df\7\f"+
		"\2\2eg\7\30\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\31\3\2\2\2jk"+
		"\7\21\2\2km\7\f\2\2ln\7\30\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2"+
		"p\33\3\2\2\2qr\7\22\2\2rs\7\f\2\2st\7\30\2\2t\35\3\2\2\2uv\7\23\2\2vw"+
		"\7\f\2\2wx\7\30\2\2x\37\3\2\2\2yz\7\24\2\2z{\7\f\2\2{|\7\30\2\2|!\3\2"+
		"\2\2}~\7\25\2\2~\177\5$\23\2\177#\3\2\2\2\u0080\u0081\7\26\2\2\u0081%"+
		"\3\2\2\2\4ho";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}