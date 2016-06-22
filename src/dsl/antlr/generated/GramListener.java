// Generated from C:/Users/Jihed/IdeaProjects/SEProjekt/src/dsl/antlr\Gram.g4 by ANTLR 4.5.3
package dsl.antlr.generated;
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
	 * Enter a parse tree produced by {@link GramParser#backgroundRow}.
	 * @param ctx the parse tree
	 */
	void enterBackgroundRow(GramParser.BackgroundRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#backgroundRow}.
	 * @param ctx the parse tree
	 */
	void exitBackgroundRow(GramParser.BackgroundRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#playerRow}.
	 * @param ctx the parse tree
	 */
	void enterPlayerRow(GramParser.PlayerRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#playerRow}.
	 * @param ctx the parse tree
	 */
	void exitPlayerRow(GramParser.PlayerRowContext ctx);
}