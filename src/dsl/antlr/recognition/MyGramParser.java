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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, Effect=23, Movement=24, 
		LETTERS=25, SMALLLETTER=26, BIGLETTER=27, DIGIT=28, ZIGZAG=29, VERTICAL=30, 
		CONTINUE=31, LIFEPOINTS=32, BULLETRATE=33, WS=34;
	public static final int
		RULE_gram = 0, RULE_images = 1, RULE_enemyCollection = 2, RULE_itemCollection = 3, 
		RULE_logo = 4, RULE_background = 5, RULE_player = 6, RULE_bullet = 7, 
		RULE_enemy = 8, RULE_item = 9, RULE_spriteObject = 10, RULE_className = 11, 
		RULE_imageObject = 12, RULE_fileName = 13, RULE_numberLine = 14, RULE_numberColumn = 15, 
		RULE_width = 16, RULE_height = 17, RULE_attack = 18, RULE_defense = 19, 
		RULE_speed = 20, RULE_probability = 21, RULE_movement = 22, RULE_effect = 23, 
		RULE_value = 24, RULE_movingType = 25, RULE_effectType = 26;
	public static final String[] ruleNames = {
		"gram", "images", "enemyCollection", "itemCollection", "logo", "background", 
		"player", "bullet", "enemy", "item", "spriteObject", "className", "imageObject", 
		"fileName", "numberLine", "numberColumn", "width", "height", "attack", 
		"defense", "speed", "probability", "movement", "effect", "value", "movingType", 
		"effectType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'image'", "'enemy'", "'item'", "'ImageLogo'", "'{'", "'}'", "'ImageBackground'", 
		"'ImagePlayer'", "'BulletNormal'", "'file'", "':'", "'.'", "'row'", "'column'", 
		"'width'", "'height'", "'attack'", "'defense'", "'speed'", "'probability'", 
		"'movement:'", "'effect:'", null, null, null, null, null, null, "'zigzag'", 
		"'vertical'", "'continue'", "'lifepoints'", "'bulletrate'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "Effect", 
		"Movement", "LETTERS", "SMALLLETTER", "BIGLETTER", "DIGIT", "ZIGZAG", 
		"VERTICAL", "CONTINUE", "LIFEPOINTS", "BULLETRATE", "WS"
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
		public EnemyCollectionContext enemyCollection() {
			return getRuleContext(EnemyCollectionContext.class,0);
		}
		public ItemCollectionContext itemCollection() {
			return getRuleContext(ItemCollectionContext.class,0);
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
			setState(54);
			images();
			setState(55);
			bullet();
			setState(56);
			enemyCollection();
			setState(57);
			itemCollection();
			setState(58);
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
			setState(60);
			match(T__0);
			setState(61);
			logo();
			setState(62);
			background();
			setState(63);
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

	public static class EnemyCollectionContext extends ParserRuleContext {
		public List<EnemyContext> enemy() {
			return getRuleContexts(EnemyContext.class);
		}
		public EnemyContext enemy(int i) {
			return getRuleContext(EnemyContext.class,i);
		}
		public EnemyCollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enemyCollection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).enterEnemyCollection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).exitEnemyCollection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramVisitor ) return ((MyGramVisitor<? extends T>)visitor).visitEnemyCollection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnemyCollectionContext enemyCollection() throws RecognitionException {
		EnemyCollectionContext _localctx = new EnemyCollectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_enemyCollection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__1);
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				enemy();
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LETTERS );
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

	public static class ItemCollectionContext extends ParserRuleContext {
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public ItemCollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemCollection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).enterItemCollection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).exitItemCollection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramVisitor ) return ((MyGramVisitor<? extends T>)visitor).visitItemCollection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemCollectionContext itemCollection() throws RecognitionException {
		ItemCollectionContext _localctx = new ItemCollectionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_itemCollection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__2);
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				item();
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LETTERS );
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
		enterRule(_localctx, 8, RULE_logo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__3);
			setState(78);
			match(T__4);
			setState(79);
			imageObject();
			setState(80);
			match(T__5);
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
		enterRule(_localctx, 10, RULE_background);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__6);
			setState(83);
			match(T__4);
			setState(84);
			imageObject();
			setState(85);
			match(T__5);
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
		enterRule(_localctx, 12, RULE_player);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__7);
			setState(88);
			match(T__4);
			setState(89);
			spriteObject();
			setState(90);
			match(T__5);
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
		enterRule(_localctx, 14, RULE_bullet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__8);
			setState(93);
			match(T__4);
			setState(94);
			spriteObject();
			setState(95);
			attack();
			setState(96);
			speed();
			setState(97);
			match(T__5);
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
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_enemy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			className();
			setState(100);
			match(T__4);
			setState(101);
			spriteObject();
			setState(102);
			movement();
			setState(103);
			attack();
			setState(104);
			defense();
			setState(105);
			speed();
			setState(106);
			probability();
			setState(107);
			match(T__5);
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

	public static class ItemContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public SpriteObjectContext spriteObject() {
			return getRuleContext(SpriteObjectContext.class,0);
		}
		public EffectContext effect() {
			return getRuleContext(EffectContext.class,0);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramVisitor ) return ((MyGramVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			className();
			setState(110);
			match(T__4);
			setState(111);
			spriteObject();
			setState(112);
			effect();
			setState(113);
			match(T__5);
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
		enterRule(_localctx, 20, RULE_spriteObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			imageObject();
			setState(116);
			numberLine();
			setState(117);
			numberColumn();
			setState(118);
			width();
			setState(119);
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

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode LETTERS() { return getToken(MyGramParser.LETTERS, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramVisitor ) return ((MyGramVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
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
		enterRule(_localctx, 24, RULE_imageObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__9);
			setState(124);
			match(T__10);
			setState(125);
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
		public List<TerminalNode> LETTERS() { return getTokens(MyGramParser.LETTERS); }
		public TerminalNode LETTERS(int i) {
			return getToken(MyGramParser.LETTERS, i);
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
		enterRule(_localctx, 26, RULE_fileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(LETTERS);
			setState(128);
			match(T__11);
			setState(129);
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
		enterRule(_localctx, 28, RULE_numberLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__12);
			setState(132);
			match(T__10);
			setState(133);
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
		enterRule(_localctx, 30, RULE_numberColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__13);
			setState(136);
			match(T__10);
			setState(137);
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
		enterRule(_localctx, 32, RULE_width);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__14);
			setState(140);
			match(T__10);
			setState(141);
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
		enterRule(_localctx, 34, RULE_height);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__15);
			setState(144);
			match(T__10);
			setState(145);
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
		enterRule(_localctx, 36, RULE_attack);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__16);
			setState(148);
			match(T__10);
			setState(149);
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
		enterRule(_localctx, 38, RULE_defense);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__17);
			setState(152);
			match(T__10);
			setState(153);
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
		enterRule(_localctx, 40, RULE_speed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__18);
			setState(156);
			match(T__10);
			setState(157);
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
		enterRule(_localctx, 42, RULE_probability);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__19);
			setState(160);
			match(T__10);
			setState(161);
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
		enterRule(_localctx, 44, RULE_movement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__20);
			setState(164);
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

	public static class EffectContext extends ParserRuleContext {
		public EffectTypeContext effectType() {
			return getRuleContext(EffectTypeContext.class,0);
		}
		public EffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).enterEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).exitEffect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramVisitor ) return ((MyGramVisitor<? extends T>)visitor).visitEffect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EffectContext effect() throws RecognitionException {
		EffectContext _localctx = new EffectContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_effect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__21);
			setState(167);
			effectType();
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
		enterRule(_localctx, 48, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
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
		public TerminalNode Movement() { return getToken(MyGramParser.Movement, 0); }
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
		enterRule(_localctx, 50, RULE_movingType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(Movement);
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

	public static class EffectTypeContext extends ParserRuleContext {
		public TerminalNode Effect() { return getToken(MyGramParser.Effect, 0); }
		public EffectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effectType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).enterEffectType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramListener ) ((MyGramListener)listener).exitEffectType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramVisitor ) return ((MyGramVisitor<? extends T>)visitor).visitEffectType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EffectTypeContext effectType() throws RecognitionException {
		EffectTypeContext _localctx = new EffectTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_effectType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(Effect);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u00b2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\6\4F\n\4\r\4\16\4G\3\5\3\5\6\5L\n\5\r\5\16\5M\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\66\2\2\u0098\28\3\2\2\2\4>\3\2\2\2\6C\3\2\2\2\bI\3"+
		"\2\2\2\nO\3\2\2\2\fT\3\2\2\2\16Y\3\2\2\2\20^\3\2\2\2\22e\3\2\2\2\24o\3"+
		"\2\2\2\26u\3\2\2\2\30{\3\2\2\2\32}\3\2\2\2\34\u0081\3\2\2\2\36\u0085\3"+
		"\2\2\2 \u0089\3\2\2\2\"\u008d\3\2\2\2$\u0091\3\2\2\2&\u0095\3\2\2\2(\u0099"+
		"\3\2\2\2*\u009d\3\2\2\2,\u00a1\3\2\2\2.\u00a5\3\2\2\2\60\u00a8\3\2\2\2"+
		"\62\u00ab\3\2\2\2\64\u00ad\3\2\2\2\66\u00af\3\2\2\289\5\4\3\29:\5\20\t"+
		"\2:;\5\6\4\2;<\5\b\5\2<=\7\2\2\3=\3\3\2\2\2>?\7\3\2\2?@\5\n\6\2@A\5\f"+
		"\7\2AB\5\16\b\2B\5\3\2\2\2CE\7\4\2\2DF\5\22\n\2ED\3\2\2\2FG\3\2\2\2GE"+
		"\3\2\2\2GH\3\2\2\2H\7\3\2\2\2IK\7\5\2\2JL\5\24\13\2KJ\3\2\2\2LM\3\2\2"+
		"\2MK\3\2\2\2MN\3\2\2\2N\t\3\2\2\2OP\7\6\2\2PQ\7\7\2\2QR\5\32\16\2RS\7"+
		"\b\2\2S\13\3\2\2\2TU\7\t\2\2UV\7\7\2\2VW\5\32\16\2WX\7\b\2\2X\r\3\2\2"+
		"\2YZ\7\n\2\2Z[\7\7\2\2[\\\5\26\f\2\\]\7\b\2\2]\17\3\2\2\2^_\7\13\2\2_"+
		"`\7\7\2\2`a\5\26\f\2ab\5&\24\2bc\5*\26\2cd\7\b\2\2d\21\3\2\2\2ef\5\30"+
		"\r\2fg\7\7\2\2gh\5\26\f\2hi\5.\30\2ij\5&\24\2jk\5(\25\2kl\5*\26\2lm\5"+
		",\27\2mn\7\b\2\2n\23\3\2\2\2op\5\30\r\2pq\7\7\2\2qr\5\26\f\2rs\5\60\31"+
		"\2st\7\b\2\2t\25\3\2\2\2uv\5\32\16\2vw\5\36\20\2wx\5 \21\2xy\5\"\22\2"+
		"yz\5$\23\2z\27\3\2\2\2{|\7\33\2\2|\31\3\2\2\2}~\7\f\2\2~\177\7\r\2\2\177"+
		"\u0080\5\34\17\2\u0080\33\3\2\2\2\u0081\u0082\7\33\2\2\u0082\u0083\7\16"+
		"\2\2\u0083\u0084\7\33\2\2\u0084\35\3\2\2\2\u0085\u0086\7\17\2\2\u0086"+
		"\u0087\7\r\2\2\u0087\u0088\5\62\32\2\u0088\37\3\2\2\2\u0089\u008a\7\20"+
		"\2\2\u008a\u008b\7\r\2\2\u008b\u008c\5\62\32\2\u008c!\3\2\2\2\u008d\u008e"+
		"\7\21\2\2\u008e\u008f\7\r\2\2\u008f\u0090\5\62\32\2\u0090#\3\2\2\2\u0091"+
		"\u0092\7\22\2\2\u0092\u0093\7\r\2\2\u0093\u0094\5\62\32\2\u0094%\3\2\2"+
		"\2\u0095\u0096\7\23\2\2\u0096\u0097\7\r\2\2\u0097\u0098\5\62\32\2\u0098"+
		"\'\3\2\2\2\u0099\u009a\7\24\2\2\u009a\u009b\7\r\2\2\u009b\u009c\5\62\32"+
		"\2\u009c)\3\2\2\2\u009d\u009e\7\25\2\2\u009e\u009f\7\r\2\2\u009f\u00a0"+
		"\5\62\32\2\u00a0+\3\2\2\2\u00a1\u00a2\7\26\2\2\u00a2\u00a3\7\r\2\2\u00a3"+
		"\u00a4\5\62\32\2\u00a4-\3\2\2\2\u00a5\u00a6\7\27\2\2\u00a6\u00a7\5\64"+
		"\33\2\u00a7/\3\2\2\2\u00a8\u00a9\7\30\2\2\u00a9\u00aa\5\66\34\2\u00aa"+
		"\61\3\2\2\2\u00ab\u00ac\7\36\2\2\u00ac\63\3\2\2\2\u00ad\u00ae\7\32\2\2"+
		"\u00ae\65\3\2\2\2\u00af\u00b0\7\31\2\2\u00b0\67\3\2\2\2\4GM";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}