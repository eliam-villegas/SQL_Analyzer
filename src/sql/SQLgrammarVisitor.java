// Generated from C:/Users/benja/OneDrive/Escritorio/projectos de mods/TALF_projectoFinal/src/SQLgrammar.g4 by ANTLR 4.13.1

package sql;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLgrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLgrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLgrammarParser#sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql(SQLgrammarParser.SqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLgrammarParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(SQLgrammarParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLgrammarParser#columnas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnas(SQLgrammarParser.ColumnasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLgrammarParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(SQLgrammarParser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLgrammarParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(SQLgrammarParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLgrammarParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(SQLgrammarParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLgrammarParser#seleccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeleccion(SQLgrammarParser.SeleccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLgrammarParser#where}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere(SQLgrammarParser.WhereContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLgrammarParser#orderby}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderby(SQLgrammarParser.OrderbyContext ctx);
}