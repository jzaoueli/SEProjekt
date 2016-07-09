// Generated from C:/Users/Jihed/IdeaProjects/SEProjekt/src/dsl/antlr\Gram.g4 by ANTLR 4.5.3
package dsl.oldgram.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramParser}.
 */
public interface GramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(GramParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(GramParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#logo}.
	 * @param ctx the parse tree
	 */
	void enterLogo(GramParser.LogoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#logo}.
	 * @param ctx the parse tree
	 */
	void exitLogo(GramParser.LogoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#backGround}.
	 * @param ctx the parse tree
	 */
	void enterBackGround(GramParser.BackGroundContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#backGround}.
	 * @param ctx the parse tree
	 */
	void exitBackGround(GramParser.BackGroundContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#player}.
	 * @param ctx the parse tree
	 */
	void enterPlayer(GramParser.PlayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#player}.
	 * @param ctx the parse tree
	 */
	void exitPlayer(GramParser.PlayerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#enemy}.
	 * @param ctx the parse tree
	 */
	void enterEnemy(GramParser.EnemyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#enemy}.
	 * @param ctx the parse tree
	 */
	void exitEnemy(GramParser.EnemyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#bullet}.
	 * @param ctx the parse tree
	 */
	void enterBullet(GramParser.BulletContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#bullet}.
	 * @param ctx the parse tree
	 */
	void exitBullet(GramParser.BulletContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#objectName}.
	 * @param ctx the parse tree
	 */
	void enterObjectName(GramParser.ObjectNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#objectName}.
	 * @param ctx the parse tree
	 */
	void exitObjectName(GramParser.ObjectNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFileName(GramParser.FileNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFileName(GramParser.FileNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#nubmerLine}.
	 * @param ctx the parse tree
	 */
	void enterNubmerLine(GramParser.NubmerLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#nubmerLine}.
	 * @param ctx the parse tree
	 */
	void exitNubmerLine(GramParser.NubmerLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#numberColumn}.
	 * @param ctx the parse tree
	 */
	void enterNumberColumn(GramParser.NumberColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#numberColumn}.
	 * @param ctx the parse tree
	 */
	void exitNumberColumn(GramParser.NumberColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#objectWidth}.
	 * @param ctx the parse tree
	 */
	void enterObjectWidth(GramParser.ObjectWidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#objectWidth}.
	 * @param ctx the parse tree
	 */
	void exitObjectWidth(GramParser.ObjectWidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#objectHeight}.
	 * @param ctx the parse tree
	 */
	void enterObjectHeight(GramParser.ObjectHeightContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#objectHeight}.
	 * @param ctx the parse tree
	 */
	void exitObjectHeight(GramParser.ObjectHeightContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#movingType}.
	 * @param ctx the parse tree
	 */
	void enterMovingType(GramParser.MovingTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#movingType}.
	 * @param ctx the parse tree
	 */
	void exitMovingType(GramParser.MovingTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#speed}.
	 * @param ctx the parse tree
	 */
	void enterSpeed(GramParser.SpeedContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#speed}.
	 * @param ctx the parse tree
	 */
	void exitSpeed(GramParser.SpeedContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#offense}.
	 * @param ctx the parse tree
	 */
	void enterOffense(GramParser.OffenseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#offense}.
	 * @param ctx the parse tree
	 */
	void exitOffense(GramParser.OffenseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#defence}.
	 * @param ctx the parse tree
	 */
	void enterDefence(GramParser.DefenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#defence}.
	 * @param ctx the parse tree
	 */
	void exitDefence(GramParser.DefenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#probability}.
	 * @param ctx the parse tree
	 */
	void enterProbability(GramParser.ProbabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#probability}.
	 * @param ctx the parse tree
	 */
	void exitProbability(GramParser.ProbabilityContext ctx);
}