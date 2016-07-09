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
		T__17=18, T__18=19, T__19=20, Type=21, STRING=22, DIGIT=23, ZIGZAG=24, 
		VERTICAL=25, CONTINUE=26, WS=27;
	public static final int
		RULE_gram = 0, RULE_images = 1, RULE_logo = 2, RULE_background = 3, RULE_player = 4, 
		RULE_bullet = 5, RULE_enemy = 6, RULE_spriteObject = 7, RULE_imageObject = 8, 
		RULE_fileName = 9, RULE_numberLine = 10, RULE_numberColumn = 11, RULE_width = 12, 
		RULE_height = 13, RULE_attack = 14, RULE_defense = 15, RULE_speed = 16, 
		RULE_probability = 17, RULE_movement = 18, RULE_value = 19, RULE_movingType = 20;
	public static final String[] ruleNames = {
		"gram", "images", "logo", "background", "player", "bullet", "enemy", "spriteObject", 
		"imageObject", "fileName", "numberLine", "numberColumn", "width", "height", 
		"attack", "defense", "speed", "probability", "movement", "value", "movingType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'image'", "'ImageLogo'", "'{'", "'}'", "'ImageBackground'", "'ImagePlayer'", 
		"'BulletNormal'", "'CommonAttackEnemy'", "'file'", "':'", "'.'", "'row'", 
		"'column'", "'width'", "'height'", "'attack'", "'defense'", "'speed'", 
		"'probability'", "'movement:'", null, null, null, "'zigzag'", "'vertical'", 
		"'continue'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "Type", "STRING", 
		"DIGIT", "ZIGZAG", "VERTICAL", "CONTINUE", "WS"
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
			setState(42);
			images();
			setState(43);
			bullet();
			setState(44);
			enemy();
			setState(45);
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
			setState(47);
			match(T__0);
			setState(48);
			logo();
			setState(49);
			background();
			setState(50);
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
			setState(52);
			match(T__1);
			setState(53);
			match(T__2);
			setState(54);
			imageObject();
			setState(55);
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
			setState(57);
			match(T__4);
			setState(58);
			match(T__2);
			setState(59);
			imageObject();
			setState(60);
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
			setState(62);
			match(T__5);
			setState(63);
			match(T__2);
			setState(64);
			spriteObject();
			setState(65);
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
			setState(67);
			match(T__6);
			setState(68);
			match(T__2);
			setState(69);
			spriteObject();
			setState(70);
			attack();
			setState(71);
			speed();
			setState(72);
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
		public ProbabilityContext probability() {
			return getRuleContext(ProbabilityContext.class,0);
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
			setState(74);
			match(T__7);
			setState(75);
			match(T__2);
			setState(76);
			spriteObject();
			setState(77);
			movement();
			setState(78);
			attack();
			setState(79);
			defense();
			setState(80);
			speed();
			setState(81);
			probability();
			setState(82);
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
			setState(84);
			imageObject();
			setState(85);
			numberLine();
			setState(86);
			numberColumn();
			setState(87);
			width();
			setState(88);
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
			setState(90);
			match(T__8);
			setState(91);
			match(T__9);
			setState(92);
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
			setState(94);
			match(STRING);
			setState(95);
			match(T__10);
			setState(96);
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
			setState(98);
			match(T__11);
			setState(99);
			match(T__9);
			setState(100);
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
			setState(102);
			match(T__12);
			setState(103);
			match(T__9);
			setState(104);
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
			setState(106);
			match(T__13);
			setState(107);
			match(T__9);
			setState(108);
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
			setState(110);
			match(T__14);
			setState(111);
			match(T__9);
			setState(112);
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
			setState(114);
			match(T__15);
			setState(115);
			match(T__9);
			setState(116);
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
			setState(118);
			match(T__16);
			setState(119);
			match(T__9);
			setState(120);
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
			setState(122);
			match(T__17);
			setState(123);
			match(T__9);
			setState(124);
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

	public static class ProbabilityContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ProbabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_probability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).enterProbability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).exitProbability(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramVisitor ) return ((MyGramVisitor<? extends T>)visitor).visitProbability(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProbabilityContext probability() throws RecognitionException {
		ProbabilityContext _localctx = new ProbabilityContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_probability);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__18);
			setState(127);
			match(T__9);
			setState(128);
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
		enterRule(_localctx, 36, RULE_movement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__19);
			setState(131);
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
		enterRule(_localctx, 38, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
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
		enterRule(_localctx, 40, RULE_movingType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35\u008c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*\2\2v\2,\3\2\2\2\4\61\3\2\2\2\6\66\3\2\2\2\b;\3"+
		"\2\2\2\n@\3\2\2\2\fE\3\2\2\2\16L\3\2\2\2\20V\3\2\2\2\22\\\3\2\2\2\24`"+
		"\3\2\2\2\26d\3\2\2\2\30h\3\2\2\2\32l\3\2\2\2\34p\3\2\2\2\36t\3\2\2\2 "+
		"x\3\2\2\2\"|\3\2\2\2$\u0080\3\2\2\2&\u0084\3\2\2\2(\u0087\3\2\2\2*\u0089"+
		"\3\2\2\2,-\5\4\3\2-.\5\f\7\2./\5\16\b\2/\60\7\2\2\3\60\3\3\2\2\2\61\62"+
		"\7\3\2\2\62\63\5\6\4\2\63\64\5\b\5\2\64\65\5\n\6\2\65\5\3\2\2\2\66\67"+
		"\7\4\2\2\678\7\5\2\289\5\22\n\29:\7\6\2\2:\7\3\2\2\2;<\7\7\2\2<=\7\5\2"+
		"\2=>\5\22\n\2>?\7\6\2\2?\t\3\2\2\2@A\7\b\2\2AB\7\5\2\2BC\5\20\t\2CD\7"+
		"\6\2\2D\13\3\2\2\2EF\7\t\2\2FG\7\5\2\2GH\5\20\t\2HI\5\36\20\2IJ\5\"\22"+
		"\2JK\7\6\2\2K\r\3\2\2\2LM\7\n\2\2MN\7\5\2\2NO\5\20\t\2OP\5&\24\2PQ\5\36"+
		"\20\2QR\5 \21\2RS\5\"\22\2ST\5$\23\2TU\7\6\2\2U\17\3\2\2\2VW\5\22\n\2"+
		"WX\5\26\f\2XY\5\30\r\2YZ\5\32\16\2Z[\5\34\17\2[\21\3\2\2\2\\]\7\13\2\2"+
		"]^\7\f\2\2^_\5\24\13\2_\23\3\2\2\2`a\7\30\2\2ab\7\r\2\2bc\7\30\2\2c\25"+
		"\3\2\2\2de\7\16\2\2ef\7\f\2\2fg\5(\25\2g\27\3\2\2\2hi\7\17\2\2ij\7\f\2"+
		"\2jk\5(\25\2k\31\3\2\2\2lm\7\20\2\2mn\7\f\2\2no\5(\25\2o\33\3\2\2\2pq"+
		"\7\21\2\2qr\7\f\2\2rs\5(\25\2s\35\3\2\2\2tu\7\22\2\2uv\7\f\2\2vw\5(\25"+
		"\2w\37\3\2\2\2xy\7\23\2\2yz\7\f\2\2z{\5(\25\2{!\3\2\2\2|}\7\24\2\2}~\7"+
		"\f\2\2~\177\5(\25\2\177#\3\2\2\2\u0080\u0081\7\25\2\2\u0081\u0082\7\f"+
		"\2\2\u0082\u0083\5(\25\2\u0083%\3\2\2\2\u0084\u0085\7\26\2\2\u0085\u0086"+
		"\5*\26\2\u0086\'\3\2\2\2\u0087\u0088\7\31\2\2\u0088)\3\2\2\2\u0089\u008a"+
		"\7\27\2\2\u008a+\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}