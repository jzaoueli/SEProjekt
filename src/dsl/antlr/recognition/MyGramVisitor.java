// Generated from C:/Users/Jihed/IdeaProjects/SEProjekt/src/dsl/antlr\MyGram.g4 by ANTLR 4.5.3
package dsl.antlr.recognition;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyGramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyGramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyGramParser#gram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGram(MyGramParser.GramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramParser#images}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImages(MyGramParser.ImagesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramParser#enemyCollection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnemyCollection(MyGramParser.EnemyCollectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramParser#itemCollection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemCollection(MyGramParser.ItemCollectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramParser#logo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogo(MyGramParser.LogoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramParser#background}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackground(MyGramParser.BackgroundContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramParser#player}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayer(MyGramParser.PlayerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramParser#bullet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBullet(MyGramParser.BulletContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramParser#enemy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnemy(MyGramParser.EnemyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(MyGramParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramParser#spriteObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpriteObject(MyGramParser.SpriteObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(MyGramParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramParser#imageObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageObject(MyGramParser.ImageObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramParser#fileName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileName(MyGramParser.FileNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramParser#numberLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLine(MyGramParser.NumberLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramParser#numberColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberColumn(MyGramParser.NumberColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramParser#width}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidth(MyGramParser.WidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramParser#height}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeight(MyGramParser.HeightContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramParser#attack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttack(MyGramParser.AttackContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramParser#defense}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefense(MyGramParser.DefenseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramParser#speed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpeed(MyGramParser.SpeedContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramParser#probability}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProbability(MyGramParser.ProbabilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramParser#movement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMovement(MyGramParser.MovementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramParser#effect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEffect(MyGramParser.EffectContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(MyGramParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramParser#movingType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMovingType(MyGramParser.MovingTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramParser#effectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEffectType(MyGramParser.EffectTypeContext ctx);
}