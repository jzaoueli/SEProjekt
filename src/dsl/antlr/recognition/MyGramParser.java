// Generated from C:/Users/Jihed/IdeaProjects/SEProjekt/src/dsl/antlr\MyGram.g4 by ANTLR 4.5.3
package dsl.antlr.recognition;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

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
		RULE_fileName = 9, RULE_numberLine = 10, RULE_numberColumn = 11, RULE_width = 12, 
		RULE_height = 13, RULE_attack = 14, RULE_defense = 15, RULE_speed = 16, 
		RULE_movement = 17, RULE_value = 18, RULE_movingType = 19;
	public static final String[] ruleNames = {
		"gram", "images", "logo", "background", "player", "bullet", "enemy", "spriteObject", 
		"imageObject", "fileName", "numberLine", "numberColumn", "width", "height", 
		"attack", "defense", "speed", "movement", "value", "movingType"
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
			setState(40);
			images();
			setState(41);
			bullet();
			setState(42);
			enemy();
			setState(43);
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
			setState(45);
			match(T__0);
			setState(46);
			logo();
			setState(47);
			background();
			setState(48);
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
			setState(50);
			match(T__1);
			setState(51);
			match(T__2);
			setState(52);
			imageObject();
			setState(53);
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
			setState(55);
			match(T__4);
			setState(56);
			match(T__2);
			setState(57);
			imageObject();
			setState(58);
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
			setState(60);
			match(T__5);
			setState(61);
			match(T__2);
			setState(62);
			spriteObject();
			setState(63);
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
			setState(65);
			match(T__6);
			setState(66);
			match(T__2);
			setState(67);
			spriteObject();
			setState(68);
			attack();
			setState(69);
			speed();
			setState(70);
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
			setState(72);
			match(T__7);
			setState(73);
			match(T__2);
			setState(74);
			spriteObject();
			setState(75);
			movement();
			setState(76);
			attack();
			setState(77);
			defense();
			setState(78);
			speed();
			setState(79);
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
			setState(81);
			imageObject();
			setState(82);
			numberLine();
			setState(83);
			numberColumn();
			setState(84);
			width();
			setState(85);
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
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
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
			setState(87);
			match(T__8);
			setState(88);
			match(T__9);
			setState(89);
			fileName();
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
		public List<TerminalNode> STRING() { return getTokens(MyGramParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MyGramParser.STRING, i);
		}
		public FileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).enterFileName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).exitFileName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramVisitor ) return ((MyGramVisitor<? extends T>)visitor).visitFileName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileNameContext fileName() throws RecognitionException {
		FileNameContext _localctx = new FileNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(STRING);
			setState(92);
			match(T__10);
			setState(93);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
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
		enterRule(_localctx, 20, RULE_numberLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__11);
			setState(96);
			match(T__9);
			setState(97);
			value();
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_numberColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__12);
			setState(100);
			match(T__9);
			setState(101);
			value();
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		enterRule(_localctx, 24, RULE_width);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__13);
			setState(104);
			match(T__9);
			setState(105);
			value();
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		enterRule(_localctx, 26, RULE_height);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__14);
			setState(108);
			match(T__9);
			setState(109);
			value();
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
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
		enterRule(_localctx, 28, RULE_attack);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__15);
			setState(112);
			match(T__9);
			setState(113);
			value();
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
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
		enterRule(_localctx, 30, RULE_defense);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__16);
			setState(116);
			match(T__9);
			setState(117);
			value();
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
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
		enterRule(_localctx, 32, RULE_speed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__17);
			setState(120);
			match(T__9);
			setState(121);
			value();
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
		enterRule(_localctx, 34, RULE_movement);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(MyGramParser.DIGIT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramVisitor ) return ((MyGramVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
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
		enterRule(_localctx, 38, RULE_movingType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34\u0085\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\2p\2*\3\2"+
		"\2\2\4/\3\2\2\2\6\64\3\2\2\2\b9\3\2\2\2\n>\3\2\2\2\fC\3\2\2\2\16J\3\2"+
		"\2\2\20S\3\2\2\2\22Y\3\2\2\2\24]\3\2\2\2\26a\3\2\2\2\30e\3\2\2\2\32i\3"+
		"\2\2\2\34m\3\2\2\2\36q\3\2\2\2 u\3\2\2\2\"y\3\2\2\2$}\3\2\2\2&\u0080\3"+
		"\2\2\2(\u0082\3\2\2\2*+\5\4\3\2+,\5\f\7\2,-\5\16\b\2-.\7\2\2\3.\3\3\2"+
		"\2\2/\60\7\3\2\2\60\61\5\6\4\2\61\62\5\b\5\2\62\63\5\n\6\2\63\5\3\2\2"+
		"\2\64\65\7\4\2\2\65\66\7\5\2\2\66\67\5\22\n\2\678\7\6\2\28\7\3\2\2\29"+
		":\7\7\2\2:;\7\5\2\2;<\5\22\n\2<=\7\6\2\2=\t\3\2\2\2>?\7\b\2\2?@\7\5\2"+
		"\2@A\5\20\t\2AB\7\6\2\2B\13\3\2\2\2CD\7\t\2\2DE\7\5\2\2EF\5\20\t\2FG\5"+
		"\36\20\2GH\5\"\22\2HI\7\6\2\2I\r\3\2\2\2JK\7\n\2\2KL\7\5\2\2LM\5\20\t"+
		"\2MN\5$\23\2NO\5\36\20\2OP\5 \21\2PQ\5\"\22\2QR\7\6\2\2R\17\3\2\2\2ST"+
		"\5\22\n\2TU\5\26\f\2UV\5\30\r\2VW\5\32\16\2WX\5\34\17\2X\21\3\2\2\2YZ"+
		"\7\13\2\2Z[\7\f\2\2[\\\5\24\13\2\\\23\3\2\2\2]^\7\27\2\2^_\7\r\2\2_`\7"+
		"\27\2\2`\25\3\2\2\2ab\7\16\2\2bc\7\f\2\2cd\5&\24\2d\27\3\2\2\2ef\7\17"+
		"\2\2fg\7\f\2\2gh\5&\24\2h\31\3\2\2\2ij\7\20\2\2jk\7\f\2\2kl\5&\24\2l\33"+
		"\3\2\2\2mn\7\21\2\2no\7\f\2\2op\5&\24\2p\35\3\2\2\2qr\7\22\2\2rs\7\f\2"+
		"\2st\5&\24\2t\37\3\2\2\2uv\7\23\2\2vw\7\f\2\2wx\5&\24\2x!\3\2\2\2yz\7"+
		"\24\2\2z{\7\f\2\2{|\5&\24\2|#\3\2\2\2}~\7\25\2\2~\177\5(\25\2\177%\3\2"+
		"\2\2\u0080\u0081\7\30\2\2\u0081\'\3\2\2\2\u0082\u0083\7\26\2\2\u0083)"+
		"\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}