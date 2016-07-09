// Generated from C:/Users/Jihed/IdeaProjects/SEProjekt/src/dsl/antlr\Gram.g4 by ANTLR 4.5.3
package dsl.oldgram.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(GramParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#logo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogo(GramParser.LogoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#backGround}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackGround(GramParser.BackGroundContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#player}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayer(GramParser.PlayerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#enemy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnemy(GramParser.EnemyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#bullet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBullet(GramParser.BulletContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#objectName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectName(GramParser.ObjectNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#fileName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileName(GramParser.FileNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#nubmerLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNubmerLine(GramParser.NubmerLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#numberColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberColumn(GramParser.NumberColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#objectWidth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectWidth(GramParser.ObjectWidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#objectHeight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectHeight(GramParser.ObjectHeightContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#movingType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMovingType(GramParser.MovingTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#speed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpeed(GramParser.SpeedContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#offense}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffense(GramParser.OffenseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#defence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefence(GramParser.DefenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#probability}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProbability(GramParser.ProbabilityContext ctx);
}