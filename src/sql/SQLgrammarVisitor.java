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
	 * Visit a parse tree produced by {@link SQLgrammarParser#valores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValores(SQLgrammarParser.ValoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLgrammarParser#asignaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignaciones(SQLgrammarParser.AsignacionesContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link SQLgrammarParser#eliminacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEliminacion(SQLgrammarParser.EliminacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLgrammarParser#insercion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsercion(SQLgrammarParser.InsercionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLgrammarParser#actualizacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualizacion(SQLgrammarParser.ActualizacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLgrammarParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(SQLgrammarParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLgrammarParser#restriccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestriccion(SQLgrammarParser.RestriccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLgrammarParser#columna}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumna(SQLgrammarParser.ColumnaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLgrammarParser#restriccionColumna}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestriccionColumna(SQLgrammarParser.RestriccionColumnaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLgrammarParser#tipoDato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoDato(SQLgrammarParser.TipoDatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLgrammarParser#dropTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(SQLgrammarParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLgrammarParser#alterTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTable(SQLgrammarParser.AlterTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLgrammarParser#alterAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterAction(SQLgrammarParser.AlterActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLgrammarParser#createIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndex(SQLgrammarParser.CreateIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLgrammarParser#createConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateConstraint(SQLgrammarParser.CreateConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLgrammarParser#createView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateView(SQLgrammarParser.CreateViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLgrammarParser#createProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateProcedure(SQLgrammarParser.CreateProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLgrammarParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(SQLgrammarParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLgrammarParser#callProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallProcedure(SQLgrammarParser.CallProcedureContext ctx);
}