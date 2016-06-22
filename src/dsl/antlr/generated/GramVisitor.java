// Generated from C:/Users/Jihed/IdeaProjects/SEProjekt/src/dsl/antlr\Gram.g4 by ANTLR 4.5.3
package dsl.antlr.generated;
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
	 * Visit a parse tree produced by {@link GramParser#backgroundRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackgroundRow(GramParser.BackgroundRowContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#playerRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayerRow(GramParser.PlayerRowContext ctx);
}