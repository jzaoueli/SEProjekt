// Generated from C:/Users/Jihed/IdeaProjects/SEProjekt/src/dsl/antlr\MyGram.g4 by ANTLR 4.5.3
package dsl.antlr.recognition;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGramParser}.
 */
public interface MyGramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGramParser#gram}.
	 * @param ctx the parse tree
	 */
	void enterGram(MyGramParser.GramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramParser#gram}.
	 * @param ctx the parse tree
	 */
	void exitGram(MyGramParser.GramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramParser#images}.
	 * @param ctx the parse tree
	 */
	void enterImages(MyGramParser.ImagesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramParser#images}.
	 * @param ctx the parse tree
	 */
	void exitImages(MyGramParser.ImagesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramParser#enemyCollection}.
	 * @param ctx the parse tree
	 */
	void enterEnemyCollection(MyGramParser.EnemyCollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramParser#enemyCollection}.
	 * @param ctx the parse tree
	 */
	void exitEnemyCollection(MyGramParser.EnemyCollectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramParser#itemCollection}.
	 * @param ctx the parse tree
	 */
	void enterItemCollection(MyGramParser.ItemCollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramParser#itemCollection}.
	 * @param ctx the parse tree
	 */
	void exitItemCollection(MyGramParser.ItemCollectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramParser#logo}.
	 * @param ctx the parse tree
	 */
	void enterLogo(MyGramParser.LogoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramParser#logo}.
	 * @param ctx the parse tree
	 */
	void exitLogo(MyGramParser.LogoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramParser#background}.
	 * @param ctx the parse tree
	 */
	void enterBackground(MyGramParser.BackgroundContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramParser#background}.
	 * @param ctx the parse tree
	 */
	void exitBackground(MyGramParser.BackgroundContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramParser#player}.
	 * @param ctx the parse tree
	 */
	void enterPlayer(MyGramParser.PlayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramParser#player}.
	 * @param ctx the parse tree
	 */
	void exitPlayer(MyGramParser.PlayerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramParser#bullet}.
	 * @param ctx the parse tree
	 */
	void enterBullet(MyGramParser.BulletContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramParser#bullet}.
	 * @param ctx the parse tree
	 */
	void exitBullet(MyGramParser.BulletContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramParser#enemy}.
	 * @param ctx the parse tree
	 */
	void enterEnemy(MyGramParser.EnemyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramParser#enemy}.
	 * @param ctx the parse tree
	 */
	void exitEnemy(MyGramParser.EnemyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(MyGramParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(MyGramParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramParser#spriteObject}.
	 * @param ctx the parse tree
	 */
	void enterSpriteObject(MyGramParser.SpriteObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramParser#spriteObject}.
	 * @param ctx the parse tree
	 */
	void exitSpriteObject(MyGramParser.SpriteObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(MyGramParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(MyGramParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramParser#imageObject}.
	 * @param ctx the parse tree
	 */
	void enterImageObject(MyGramParser.ImageObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramParser#imageObject}.
	 * @param ctx the parse tree
	 */
	void exitImageObject(MyGramParser.ImageObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramParser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFileName(MyGramParser.FileNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramParser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFileName(MyGramParser.FileNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramParser#numberLine}.
	 * @param ctx the parse tree
	 */
	void enterNumberLine(MyGramParser.NumberLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramParser#numberLine}.
	 * @param ctx the parse tree
	 */
	void exitNumberLine(MyGramParser.NumberLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramParser#numberColumn}.
	 * @param ctx the parse tree
	 */
	void enterNumberColumn(MyGramParser.NumberColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramParser#numberColumn}.
	 * @param ctx the parse tree
	 */
	void exitNumberColumn(MyGramParser.NumberColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramParser#width}.
	 * @param ctx the parse tree
	 */
	void enterWidth(MyGramParser.WidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramParser#width}.
	 * @param ctx the parse tree
	 */
	void exitWidth(MyGramParser.WidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramParser#height}.
	 * @param ctx the parse tree
	 */
	void enterHeight(MyGramParser.HeightContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramParser#height}.
	 * @param ctx the parse tree
	 */
	void exitHeight(MyGramParser.HeightContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramParser#attack}.
	 * @param ctx the parse tree
	 */
	void enterAttack(MyGramParser.AttackContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramParser#attack}.
	 * @param ctx the parse tree
	 */
	void exitAttack(MyGramParser.AttackContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramParser#defense}.
	 * @param ctx the parse tree
	 */
	void enterDefense(MyGramParser.DefenseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramParser#defense}.
	 * @param ctx the parse tree
	 */
	void exitDefense(MyGramParser.DefenseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramParser#speed}.
	 * @param ctx the parse tree
	 */
	void enterSpeed(MyGramParser.SpeedContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramParser#speed}.
	 * @param ctx the parse tree
	 */
	void exitSpeed(MyGramParser.SpeedContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramParser#probability}.
	 * @param ctx the parse tree
	 */
	void enterProbability(MyGramParser.ProbabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramParser#probability}.
	 * @param ctx the parse tree
	 */
	void exitProbability(MyGramParser.ProbabilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramParser#movement}.
	 * @param ctx the parse tree
	 */
	void enterMovement(MyGramParser.MovementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramParser#movement}.
	 * @param ctx the parse tree
	 */
	void exitMovement(MyGramParser.MovementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramParser#effect}.
	 * @param ctx the parse tree
	 */
	void enterEffect(MyGramParser.EffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramParser#effect}.
	 * @param ctx the parse tree
	 */
	void exitEffect(MyGramParser.EffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(MyGramParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(MyGramParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramParser#movingType}.
	 * @param ctx the parse tree
	 */
	void enterMovingType(MyGramParser.MovingTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramParser#movingType}.
	 * @param ctx the parse tree
	 */
	void exitMovingType(MyGramParser.MovingTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramParser#effectType}.
	 * @param ctx the parse tree
	 */
	void enterEffectType(MyGramParser.EffectTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramParser#effectType}.
	 * @param ctx the parse tree
	 */
	void exitEffectType(MyGramParser.EffectTypeContext ctx);
}