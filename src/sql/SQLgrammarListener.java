// Generated from C:/Users/benja/OneDrive/Escritorio/projectos de mods/TALF_projectoFinal/src/SQLgrammar.g4 by ANTLR 4.13.1

package sql;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLgrammarParser}.
 */
public interface SQLgrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLgrammarParser#sql}.
	 * @param ctx the parse tree
	 */
	void enterSql(SQLgrammarParser.SqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLgrammarParser#sql}.
	 * @param ctx the parse tree
	 */
	void exitSql(SQLgrammarParser.SqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLgrammarParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(SQLgrammarParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLgrammarParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(SQLgrammarParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLgrammarParser#columnas}.
	 * @param ctx the parse tree
	 */
	void enterColumnas(SQLgrammarParser.ColumnasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLgrammarParser#columnas}.
	 * @param ctx the parse tree
	 */
	void exitColumnas(SQLgrammarParser.ColumnasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLgrammarParser#valores}.
	 * @param ctx the parse tree
	 */
	void enterValores(SQLgrammarParser.ValoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLgrammarParser#valores}.
	 * @param ctx the parse tree
	 */
	void exitValores(SQLgrammarParser.ValoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLgrammarParser#asignaciones}.
	 * @param ctx the parse tree
	 */
	void enterAsignaciones(SQLgrammarParser.AsignacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLgrammarParser#asignaciones}.
	 * @param ctx the parse tree
	 */
	void exitAsignaciones(SQLgrammarParser.AsignacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLgrammarParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(SQLgrammarParser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLgrammarParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(SQLgrammarParser.ComparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLgrammarParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(SQLgrammarParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLgrammarParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(SQLgrammarParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLgrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(SQLgrammarParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLgrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(SQLgrammarParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLgrammarParser#seleccion}.
	 * @param ctx the parse tree
	 */
	void enterSeleccion(SQLgrammarParser.SeleccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLgrammarParser#seleccion}.
	 * @param ctx the parse tree
	 */
	void exitSeleccion(SQLgrammarParser.SeleccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLgrammarParser#where}.
	 * @param ctx the parse tree
	 */
	void enterWhere(SQLgrammarParser.WhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLgrammarParser#where}.
	 * @param ctx the parse tree
	 */
	void exitWhere(SQLgrammarParser.WhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLgrammarParser#orderby}.
	 * @param ctx the parse tree
	 */
	void enterOrderby(SQLgrammarParser.OrderbyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLgrammarParser#orderby}.
	 * @param ctx the parse tree
	 */
	void exitOrderby(SQLgrammarParser.OrderbyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLgrammarParser#eliminacion}.
	 * @param ctx the parse tree
	 */
	void enterEliminacion(SQLgrammarParser.EliminacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLgrammarParser#eliminacion}.
	 * @param ctx the parse tree
	 */
	void exitEliminacion(SQLgrammarParser.EliminacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLgrammarParser#insercion}.
	 * @param ctx the parse tree
	 */
	void enterInsercion(SQLgrammarParser.InsercionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLgrammarParser#insercion}.
	 * @param ctx the parse tree
	 */
	void exitInsercion(SQLgrammarParser.InsercionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLgrammarParser#actualizacion}.
	 * @param ctx the parse tree
	 */
	void enterActualizacion(SQLgrammarParser.ActualizacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLgrammarParser#actualizacion}.
	 * @param ctx the parse tree
	 */
	void exitActualizacion(SQLgrammarParser.ActualizacionContext ctx);
}