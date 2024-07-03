// Generated from C:/Users/benja/OneDrive/Escritorio/projectos de mods/TALF_projectoFinal/src/SQLgrammar.g4 by ANTLR 4.13.1

package sql;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SQLgrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, INT=54, ID=55, STRING=56, WS=57;
	public static final int
		RULE_sql = 0, RULE_declaracion = 1, RULE_columnas = 2, RULE_valores = 3, 
		RULE_asignaciones = 4, RULE_comparacion = 5, RULE_condicion = 6, RULE_expresion = 7, 
		RULE_seleccion = 8, RULE_where = 9, RULE_orderby = 10, RULE_eliminacion = 11, 
		RULE_insercion = 12, RULE_actualizacion = 13, RULE_createTable = 14, RULE_restriccion = 15, 
		RULE_columna = 16, RULE_restriccionColumna = 17, RULE_tipoDato = 18, RULE_dropTable = 19, 
		RULE_alterTable = 20, RULE_alterAction = 21, RULE_createIndex = 22, RULE_createConstraint = 23, 
		RULE_createView = 24, RULE_createProcedure = 25, RULE_parametro = 26, 
		RULE_callProcedure = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"sql", "declaracion", "columnas", "valores", "asignaciones", "comparacion", 
			"condicion", "expresion", "seleccion", "where", "orderby", "eliminacion", 
			"insercion", "actualizacion", "createTable", "restriccion", "columna", 
			"restriccionColumna", "tipoDato", "dropTable", "alterTable", "alterAction", 
			"createIndex", "createConstraint", "createView", "createProcedure", "parametro", 
			"callProcedure"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'='", "'<'", "'>'", "'>='", "'<='", "'!='", "'SELECT'", 
			"'*'", "'FROM'", "'WHERE'", "'ORDER'", "'BY'", "'ASC'", "'DESC'", "'DELETE'", 
			"'INSERT'", "'INTO'", "'('", "')'", "'VALUES'", "'UPDATE'", "'SET'", 
			"'CREATE'", "'TABLE'", "'PRIMARY'", "'KEY'", "'FOREIGN'", "'REFERENCES'", 
			"'UNIQUE'", "'NOT'", "'NULL'", "'AUTO_INCREMENT'", "'INT'", "'VARCHAR'", 
			"'DECIMAL'", "'DATE'", "'DROP'", "'ALTER'", "'ADD'", "'COLUMN'", "'MODIFY'", 
			"'INDEX'", "'ON'", "'CONSTRAINT'", "'VIEW'", "'AS'", "'PROCEDURE'", "'BEGIN'", 
			"'END'", "'IN'", "'CALL'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "INT", "ID", "STRING", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "SQLgrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLgrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SqlContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SQLgrammarParser.EOF, 0); }
		public SqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).enterSql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).exitSql(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLgrammarVisitor ) return ((SQLgrammarVisitor<? extends T>)visitor).visitSql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlContext sql() throws RecognitionException {
		SqlContext _localctx = new SqlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sql);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			declaracion();
			setState(57);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionContext extends ParserRuleContext {
		public SeleccionContext seleccion() {
			return getRuleContext(SeleccionContext.class,0);
		}
		public EliminacionContext eliminacion() {
			return getRuleContext(EliminacionContext.class,0);
		}
		public InsercionContext insercion() {
			return getRuleContext(InsercionContext.class,0);
		}
		public ActualizacionContext actualizacion() {
			return getRuleContext(ActualizacionContext.class,0);
		}
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public DropTableContext dropTable() {
			return getRuleContext(DropTableContext.class,0);
		}
		public AlterTableContext alterTable() {
			return getRuleContext(AlterTableContext.class,0);
		}
		public CreateIndexContext createIndex() {
			return getRuleContext(CreateIndexContext.class,0);
		}
		public CreateConstraintContext createConstraint() {
			return getRuleContext(CreateConstraintContext.class,0);
		}
		public CreateViewContext createView() {
			return getRuleContext(CreateViewContext.class,0);
		}
		public CreateProcedureContext createProcedure() {
			return getRuleContext(CreateProcedureContext.class,0);
		}
		public CallProcedureContext callProcedure() {
			return getRuleContext(CallProcedureContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLgrammarVisitor ) return ((SQLgrammarVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracion);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				seleccion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				eliminacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				insercion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				actualizacion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				createTable();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				dropTable();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(66);
				alterTable();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(67);
				createIndex();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(68);
				createConstraint();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(69);
				createView();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(70);
				createProcedure();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(71);
				callProcedure();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnasContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SQLgrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLgrammarParser.ID, i);
		}
		public ColumnasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).enterColumnas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).exitColumnas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLgrammarVisitor ) return ((SQLgrammarVisitor<? extends T>)visitor).visitColumnas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnasContext columnas() throws RecognitionException {
		ColumnasContext _localctx = new ColumnasContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_columnas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(ID);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(75);
				match(T__1);
				setState(76);
				match(ID);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValoresContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public ValoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).enterValores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).exitValores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLgrammarVisitor ) return ((SQLgrammarVisitor<? extends T>)visitor).visitValores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValoresContext valores() throws RecognitionException {
		ValoresContext _localctx = new ValoresContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_valores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			expresion();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(83);
				match(T__1);
				setState(84);
				expresion();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionesContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SQLgrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLgrammarParser.ID, i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public AsignacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).enterAsignaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).exitAsignaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLgrammarVisitor ) return ((SQLgrammarVisitor<? extends T>)visitor).visitAsignaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionesContext asignaciones() throws RecognitionException {
		AsignacionesContext _localctx = new AsignacionesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_asignaciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(ID);
			setState(91);
			match(T__2);
			setState(92);
			expresion();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(93);
				match(T__1);
				setState(94);
				match(ID);
				setState(95);
				match(T__2);
				setState(96);
				expresion();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparacionContext extends ParserRuleContext {
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).exitComparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLgrammarVisitor ) return ((SQLgrammarVisitor<? extends T>)visitor).visitComparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 504L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLgrammarVisitor ) return ((SQLgrammarVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			expresion();
			setState(105);
			comparacion();
			setState(106);
			expresion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SQLgrammarParser.INT, 0); }
		public TerminalNode ID() { return getToken(SQLgrammarParser.ID, 0); }
		public TerminalNode STRING() { return getToken(SQLgrammarParser.STRING, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLgrammarVisitor ) return ((SQLgrammarVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 126100789566373888L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class SeleccionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLgrammarParser.ID, 0); }
		public ColumnasContext columnas() {
			return getRuleContext(ColumnasContext.class,0);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public OrderbyContext orderby() {
			return getRuleContext(OrderbyContext.class,0);
		}
		public SeleccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seleccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).enterSeleccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).exitSeleccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLgrammarVisitor ) return ((SQLgrammarVisitor<? extends T>)visitor).visitSeleccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeleccionContext seleccion() throws RecognitionException {
		SeleccionContext _localctx = new SeleccionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_seleccion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__8);
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				{
				setState(111);
				match(T__9);
				}
				break;
			case ID:
				{
				setState(112);
				columnas();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(115);
			match(T__10);
			setState(116);
			match(ID);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(117);
				where();
				}
			}

			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(120);
				orderby();
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class WhereContext extends ParserRuleContext {
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public WhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).exitWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLgrammarVisitor ) return ((SQLgrammarVisitor<? extends T>)visitor).visitWhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_where);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__11);
			setState(124);
			condicion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OrderbyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLgrammarParser.ID, 0); }
		public OrderbyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).enterOrderby(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).exitOrderby(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLgrammarVisitor ) return ((SQLgrammarVisitor<? extends T>)visitor).visitOrderby(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderbyContext orderby() throws RecognitionException {
		OrderbyContext _localctx = new OrderbyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_orderby);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__12);
			setState(127);
			match(T__13);
			setState(128);
			match(ID);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14 || _la==T__15) {
				{
				setState(129);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__15) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class EliminacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLgrammarParser.ID, 0); }
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public EliminacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eliminacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).enterEliminacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).exitEliminacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLgrammarVisitor ) return ((SQLgrammarVisitor<? extends T>)visitor).visitEliminacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EliminacionContext eliminacion() throws RecognitionException {
		EliminacionContext _localctx = new EliminacionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_eliminacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__16);
			setState(133);
			match(T__10);
			setState(134);
			match(ID);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(135);
				where();
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class InsercionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLgrammarParser.ID, 0); }
		public ColumnasContext columnas() {
			return getRuleContext(ColumnasContext.class,0);
		}
		public ValoresContext valores() {
			return getRuleContext(ValoresContext.class,0);
		}
		public InsercionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insercion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).enterInsercion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).exitInsercion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLgrammarVisitor ) return ((SQLgrammarVisitor<? extends T>)visitor).visitInsercion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsercionContext insercion() throws RecognitionException {
		InsercionContext _localctx = new InsercionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_insercion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__17);
			setState(139);
			match(T__18);
			setState(140);
			match(ID);
			setState(141);
			match(T__19);
			setState(142);
			columnas();
			setState(143);
			match(T__20);
			setState(144);
			match(T__21);
			setState(145);
			match(T__19);
			setState(146);
			valores();
			setState(147);
			match(T__20);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ActualizacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLgrammarParser.ID, 0); }
		public AsignacionesContext asignaciones() {
			return getRuleContext(AsignacionesContext.class,0);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public ActualizacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualizacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).enterActualizacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).exitActualizacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLgrammarVisitor ) return ((SQLgrammarVisitor<? extends T>)visitor).visitActualizacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualizacionContext actualizacion() throws RecognitionException {
		ActualizacionContext _localctx = new ActualizacionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_actualizacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__22);
			setState(150);
			match(ID);
			setState(151);
			match(T__23);
			setState(152);
			asignaciones();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(153);
				where();
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLgrammarParser.ID, 0); }
		public List<ColumnaContext> columna() {
			return getRuleContexts(ColumnaContext.class);
		}
		public ColumnaContext columna(int i) {
			return getRuleContext(ColumnaContext.class,i);
		}
		public List<RestriccionContext> restriccion() {
			return getRuleContexts(RestriccionContext.class);
		}
		public RestriccionContext restriccion(int i) {
			return getRuleContext(RestriccionContext.class,i);
		}
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLgrammarVisitor ) return ((SQLgrammarVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_createTable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__24);
			setState(157);
			match(T__25);
			setState(158);
			match(ID);
			setState(159);
			match(T__19);
			setState(160);
			columna();
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(161);
					match(T__1);
					setState(162);
					columna();
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(168);
				match(T__1);
				setState(169);
				restriccion();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			match(T__20);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RestriccionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SQLgrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLgrammarParser.ID, i);
		}
		public RestriccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restriccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).enterRestriccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).exitRestriccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLgrammarVisitor ) return ((SQLgrammarVisitor<? extends T>)visitor).visitRestriccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestriccionContext restriccion() throws RecognitionException {
		RestriccionContext _localctx = new RestriccionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_restriccion);
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(T__26);
				setState(178);
				match(T__27);
				setState(179);
				match(T__19);
				setState(180);
				match(ID);
				setState(181);
				match(T__20);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(T__28);
				setState(183);
				match(T__27);
				setState(184);
				match(T__19);
				setState(185);
				match(ID);
				setState(186);
				match(T__20);
				setState(187);
				match(T__29);
				setState(188);
				match(ID);
				setState(189);
				match(T__19);
				setState(190);
				match(ID);
				setState(191);
				match(T__20);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				match(T__30);
				setState(193);
				match(T__19);
				setState(194);
				match(ID);
				setState(195);
				match(T__20);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLgrammarParser.ID, 0); }
		public TipoDatoContext tipoDato() {
			return getRuleContext(TipoDatoContext.class,0);
		}
		public List<RestriccionColumnaContext> restriccionColumna() {
			return getRuleContexts(RestriccionColumnaContext.class);
		}
		public RestriccionColumnaContext restriccionColumna(int i) {
			return getRuleContext(RestriccionColumnaContext.class,i);
		}
		public ColumnaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).enterColumna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).exitColumna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLgrammarVisitor ) return ((SQLgrammarVisitor<? extends T>)visitor).visitColumna(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnaContext columna() throws RecognitionException {
		ColumnaContext _localctx = new ColumnaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_columna);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(ID);
			setState(199);
			tipoDato();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 21609054208L) != 0)) {
				{
				{
				setState(200);
				restriccionColumna();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class RestriccionColumnaContext extends ParserRuleContext {
		public RestriccionColumnaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restriccionColumna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).enterRestriccionColumna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).exitRestriccionColumna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLgrammarVisitor ) return ((SQLgrammarVisitor<? extends T>)visitor).visitRestriccionColumna(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestriccionColumnaContext restriccionColumna() throws RecognitionException {
		RestriccionColumnaContext _localctx = new RestriccionColumnaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_restriccionColumna);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(T__31);
				setState(207);
				match(T__32);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(T__26);
				setState(209);
				match(T__27);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				match(T__33);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoDatoContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(SQLgrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SQLgrammarParser.INT, i);
		}
		public TipoDatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoDato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).enterTipoDato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).exitTipoDato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLgrammarVisitor ) return ((SQLgrammarVisitor<? extends T>)visitor).visitTipoDato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoDatoContext tipoDato() throws RecognitionException {
		TipoDatoContext _localctx = new TipoDatoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tipoDato);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(T__35);
				setState(215);
				match(T__19);
				setState(216);
				match(INT);
				setState(217);
				match(T__20);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				match(T__36);
				setState(219);
				match(T__19);
				setState(220);
				match(INT);
				setState(221);
				match(T__1);
				setState(222);
				match(INT);
				setState(223);
				match(T__20);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				match(T__37);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DropTableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLgrammarParser.ID, 0); }
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLgrammarVisitor ) return ((SQLgrammarVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__38);
			setState(228);
			match(T__25);
			setState(229);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AlterTableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLgrammarParser.ID, 0); }
		public AlterActionContext alterAction() {
			return getRuleContext(AlterActionContext.class,0);
		}
		public AlterTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).enterAlterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).exitAlterTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLgrammarVisitor ) return ((SQLgrammarVisitor<? extends T>)visitor).visitAlterTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterTableContext alterTable() throws RecognitionException {
		AlterTableContext _localctx = new AlterTableContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_alterTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__39);
			setState(232);
			match(T__25);
			setState(233);
			match(ID);
			setState(234);
			alterAction();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AlterActionContext extends ParserRuleContext {
		public ColumnaContext columna() {
			return getRuleContext(ColumnaContext.class,0);
		}
		public TerminalNode ID() { return getToken(SQLgrammarParser.ID, 0); }
		public AlterActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).enterAlterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).exitAlterAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLgrammarVisitor ) return ((SQLgrammarVisitor<? extends T>)visitor).visitAlterAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterActionContext alterAction() throws RecognitionException {
		AlterActionContext _localctx = new AlterActionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_alterAction);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(T__40);
				setState(237);
				match(T__41);
				setState(238);
				columna();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(T__42);
				setState(240);
				match(T__41);
				setState(241);
				columna();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				match(T__38);
				setState(243);
				match(T__41);
				setState(244);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CreateIndexContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SQLgrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLgrammarParser.ID, i);
		}
		public CreateIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).enterCreateIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).exitCreateIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLgrammarVisitor ) return ((SQLgrammarVisitor<? extends T>)visitor).visitCreateIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateIndexContext createIndex() throws RecognitionException {
		CreateIndexContext _localctx = new CreateIndexContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_createIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__24);
			setState(248);
			match(T__43);
			setState(249);
			match(ID);
			setState(250);
			match(T__44);
			setState(251);
			match(ID);
			setState(252);
			match(T__19);
			setState(253);
			match(ID);
			setState(254);
			match(T__20);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CreateConstraintContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SQLgrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLgrammarParser.ID, i);
		}
		public RestriccionContext restriccion() {
			return getRuleContext(RestriccionContext.class,0);
		}
		public CreateConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).enterCreateConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).exitCreateConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLgrammarVisitor ) return ((SQLgrammarVisitor<? extends T>)visitor).visitCreateConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateConstraintContext createConstraint() throws RecognitionException {
		CreateConstraintContext _localctx = new CreateConstraintContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_createConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(T__39);
			setState(257);
			match(T__25);
			setState(258);
			match(ID);
			setState(259);
			match(T__40);
			setState(260);
			match(T__45);
			setState(261);
			match(ID);
			setState(262);
			restriccion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CreateViewContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLgrammarParser.ID, 0); }
		public SeleccionContext seleccion() {
			return getRuleContext(SeleccionContext.class,0);
		}
		public CreateViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLgrammarVisitor ) return ((SQLgrammarVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateViewContext createView() throws RecognitionException {
		CreateViewContext _localctx = new CreateViewContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_createView);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__24);
			setState(265);
			match(T__46);
			setState(266);
			match(ID);
			setState(267);
			match(T__47);
			setState(268);
			seleccion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CreateProcedureContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLgrammarParser.ID, 0); }
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<DeclaracionContext> declaracion() {
			return getRuleContexts(DeclaracionContext.class);
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public CreateProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createProcedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).enterCreateProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).exitCreateProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLgrammarVisitor ) return ((SQLgrammarVisitor<? extends T>)visitor).visitCreateProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateProcedureContext createProcedure() throws RecognitionException {
		CreateProcedureContext _localctx = new CreateProcedureContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_createProcedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(T__24);
			setState(271);
			match(T__48);
			setState(272);
			match(ID);
			setState(273);
			match(T__19);
			setState(274);
			parametro();
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(275);
				match(T__1);
				setState(276);
				parametro();
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282);
			match(T__20);
			setState(283);
			match(T__49);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9008848564519424L) != 0)) {
				{
				{
				setState(284);
				declaracion();
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(290);
			match(T__50);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLgrammarParser.ID, 0); }
		public TipoDatoContext tipoDato() {
			return getRuleContext(TipoDatoContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLgrammarVisitor ) return ((SQLgrammarVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(T__51);
			setState(293);
			match(ID);
			setState(294);
			tipoDato();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CallProcedureContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLgrammarParser.ID, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public CallProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callProcedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).enterCallProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLgrammarListener ) ((SQLgrammarListener)listener).exitCallProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLgrammarVisitor ) return ((SQLgrammarVisitor<? extends T>)visitor).visitCallProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallProcedureContext callProcedure() throws RecognitionException {
		CallProcedureContext _localctx = new CallProcedureContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_callProcedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(T__52);
			setState(297);
			match(ID);
			setState(298);
			match(T__19);
			setState(299);
			expresion();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(300);
				match(T__1);
				setState(301);
				expresion();
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307);
			match(T__20);
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
		"\u0004\u00019\u0136\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001I\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002N\b\u0002\n\u0002\f\u0002"+
		"Q\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003V\b\u0003\n\u0003"+
		"\f\u0003Y\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004b\b\u0004\n\u0004\f\u0004e\t"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003\br\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\bw\b\b\u0001\b\u0003\bz\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0083\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0089\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u009b\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u00a4\b\u000e\n\u000e\f\u000e\u00a7\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u00ab\b\u000e\n\u000e\f\u000e\u00ae\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00c5\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u00ca\b\u0010\n\u0010\f\u0010\u00cd\t\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00d4"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u00e2\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00f6\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0116"+
		"\b\u0019\n\u0019\f\u0019\u0119\t\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0005\u0019\u011e\b\u0019\n\u0019\f\u0019\u0121\t\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u012f"+
		"\b\u001b\n\u001b\f\u001b\u0132\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0000\u0000\u001c\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246\u0000\u0003\u0001\u0000\u0003"+
		"\b\u0001\u000068\u0001\u0000\u000f\u0010\u013c\u00008\u0001\u0000\u0000"+
		"\u0000\u0002H\u0001\u0000\u0000\u0000\u0004J\u0001\u0000\u0000\u0000\u0006"+
		"R\u0001\u0000\u0000\u0000\bZ\u0001\u0000\u0000\u0000\nf\u0001\u0000\u0000"+
		"\u0000\fh\u0001\u0000\u0000\u0000\u000el\u0001\u0000\u0000\u0000\u0010"+
		"n\u0001\u0000\u0000\u0000\u0012{\u0001\u0000\u0000\u0000\u0014~\u0001"+
		"\u0000\u0000\u0000\u0016\u0084\u0001\u0000\u0000\u0000\u0018\u008a\u0001"+
		"\u0000\u0000\u0000\u001a\u0095\u0001\u0000\u0000\u0000\u001c\u009c\u0001"+
		"\u0000\u0000\u0000\u001e\u00c4\u0001\u0000\u0000\u0000 \u00c6\u0001\u0000"+
		"\u0000\u0000\"\u00d3\u0001\u0000\u0000\u0000$\u00e1\u0001\u0000\u0000"+
		"\u0000&\u00e3\u0001\u0000\u0000\u0000(\u00e7\u0001\u0000\u0000\u0000*"+
		"\u00f5\u0001\u0000\u0000\u0000,\u00f7\u0001\u0000\u0000\u0000.\u0100\u0001"+
		"\u0000\u0000\u00000\u0108\u0001\u0000\u0000\u00002\u010e\u0001\u0000\u0000"+
		"\u00004\u0124\u0001\u0000\u0000\u00006\u0128\u0001\u0000\u0000\u00008"+
		"9\u0003\u0002\u0001\u00009:\u0005\u0001\u0000\u0000:;\u0005\u0000\u0000"+
		"\u0001;\u0001\u0001\u0000\u0000\u0000<I\u0003\u0010\b\u0000=I\u0003\u0016"+
		"\u000b\u0000>I\u0003\u0018\f\u0000?I\u0003\u001a\r\u0000@I\u0003\u001c"+
		"\u000e\u0000AI\u0003&\u0013\u0000BI\u0003(\u0014\u0000CI\u0003,\u0016"+
		"\u0000DI\u0003.\u0017\u0000EI\u00030\u0018\u0000FI\u00032\u0019\u0000"+
		"GI\u00036\u001b\u0000H<\u0001\u0000\u0000\u0000H=\u0001\u0000\u0000\u0000"+
		"H>\u0001\u0000\u0000\u0000H?\u0001\u0000\u0000\u0000H@\u0001\u0000\u0000"+
		"\u0000HA\u0001\u0000\u0000\u0000HB\u0001\u0000\u0000\u0000HC\u0001\u0000"+
		"\u0000\u0000HD\u0001\u0000\u0000\u0000HE\u0001\u0000\u0000\u0000HF\u0001"+
		"\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000I\u0003\u0001\u0000\u0000"+
		"\u0000JO\u00057\u0000\u0000KL\u0005\u0002\u0000\u0000LN\u00057\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000P\u0005\u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000RW\u0003\u000e\u0007\u0000ST\u0005\u0002\u0000\u0000"+
		"TV\u0003\u000e\u0007\u0000US\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000"+
		"\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X\u0007\u0001"+
		"\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z[\u00057\u0000\u0000[\\\u0005"+
		"\u0003\u0000\u0000\\c\u0003\u000e\u0007\u0000]^\u0005\u0002\u0000\u0000"+
		"^_\u00057\u0000\u0000_`\u0005\u0003\u0000\u0000`b\u0003\u000e\u0007\u0000"+
		"a]\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000d\t\u0001\u0000\u0000\u0000ec\u0001\u0000"+
		"\u0000\u0000fg\u0007\u0000\u0000\u0000g\u000b\u0001\u0000\u0000\u0000"+
		"hi\u0003\u000e\u0007\u0000ij\u0003\n\u0005\u0000jk\u0003\u000e\u0007\u0000"+
		"k\r\u0001\u0000\u0000\u0000lm\u0007\u0001\u0000\u0000m\u000f\u0001\u0000"+
		"\u0000\u0000nq\u0005\t\u0000\u0000or\u0005\n\u0000\u0000pr\u0003\u0004"+
		"\u0002\u0000qo\u0001\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000rs\u0001"+
		"\u0000\u0000\u0000st\u0005\u000b\u0000\u0000tv\u00057\u0000\u0000uw\u0003"+
		"\u0012\t\u0000vu\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0001"+
		"\u0000\u0000\u0000xz\u0003\u0014\n\u0000yx\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z\u0011\u0001\u0000\u0000\u0000{|\u0005\f\u0000\u0000"+
		"|}\u0003\f\u0006\u0000}\u0013\u0001\u0000\u0000\u0000~\u007f\u0005\r\u0000"+
		"\u0000\u007f\u0080\u0005\u000e\u0000\u0000\u0080\u0082\u00057\u0000\u0000"+
		"\u0081\u0083\u0007\u0002\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0015\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0005\u0011\u0000\u0000\u0085\u0086\u0005\u000b\u0000\u0000"+
		"\u0086\u0088\u00057\u0000\u0000\u0087\u0089\u0003\u0012\t\u0000\u0088"+
		"\u0087\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089"+
		"\u0017\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u0012\u0000\u0000\u008b"+
		"\u008c\u0005\u0013\u0000\u0000\u008c\u008d\u00057\u0000\u0000\u008d\u008e"+
		"\u0005\u0014\u0000\u0000\u008e\u008f\u0003\u0004\u0002\u0000\u008f\u0090"+
		"\u0005\u0015\u0000\u0000\u0090\u0091\u0005\u0016\u0000\u0000\u0091\u0092"+
		"\u0005\u0014\u0000\u0000\u0092\u0093\u0003\u0006\u0003\u0000\u0093\u0094"+
		"\u0005\u0015\u0000\u0000\u0094\u0019\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0005\u0017\u0000\u0000\u0096\u0097\u00057\u0000\u0000\u0097\u0098\u0005"+
		"\u0018\u0000\u0000\u0098\u009a\u0003\b\u0004\u0000\u0099\u009b\u0003\u0012"+
		"\t\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000"+
		"\u0000\u009b\u001b\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0019\u0000"+
		"\u0000\u009d\u009e\u0005\u001a\u0000\u0000\u009e\u009f\u00057\u0000\u0000"+
		"\u009f\u00a0\u0005\u0014\u0000\u0000\u00a0\u00a5\u0003 \u0010\u0000\u00a1"+
		"\u00a2\u0005\u0002\u0000\u0000\u00a2\u00a4\u0003 \u0010\u0000\u00a3\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00ac"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0005\u0002\u0000\u0000\u00a9\u00ab\u0003\u001e\u000f\u0000\u00aa\u00a8"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00af"+
		"\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0005\u0015\u0000\u0000\u00b0\u001d\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0005\u001b\u0000\u0000\u00b2\u00b3\u0005\u001c\u0000\u0000\u00b3\u00b4"+
		"\u0005\u0014\u0000\u0000\u00b4\u00b5\u00057\u0000\u0000\u00b5\u00c5\u0005"+
		"\u0015\u0000\u0000\u00b6\u00b7\u0005\u001d\u0000\u0000\u00b7\u00b8\u0005"+
		"\u001c\u0000\u0000\u00b8\u00b9\u0005\u0014\u0000\u0000\u00b9\u00ba\u0005"+
		"7\u0000\u0000\u00ba\u00bb\u0005\u0015\u0000\u0000\u00bb\u00bc\u0005\u001e"+
		"\u0000\u0000\u00bc\u00bd\u00057\u0000\u0000\u00bd\u00be\u0005\u0014\u0000"+
		"\u0000\u00be\u00bf\u00057\u0000\u0000\u00bf\u00c5\u0005\u0015\u0000\u0000"+
		"\u00c0\u00c1\u0005\u001f\u0000\u0000\u00c1\u00c2\u0005\u0014\u0000\u0000"+
		"\u00c2\u00c3\u00057\u0000\u0000\u00c3\u00c5\u0005\u0015\u0000\u0000\u00c4"+
		"\u00b1\u0001\u0000\u0000\u0000\u00c4\u00b6\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c5\u001f\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u00057\u0000\u0000\u00c7\u00cb\u0003$\u0012\u0000\u00c8\u00ca\u0003"+
		"\"\u0011\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cc!\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0005 \u0000\u0000\u00cf\u00d4\u0005!\u0000\u0000\u00d0"+
		"\u00d1\u0005\u001b\u0000\u0000\u00d1\u00d4\u0005\u001c\u0000\u0000\u00d2"+
		"\u00d4\u0005\"\u0000\u0000\u00d3\u00ce\u0001\u0000\u0000\u0000\u00d3\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4#\u0001"+
		"\u0000\u0000\u0000\u00d5\u00e2\u0005#\u0000\u0000\u00d6\u00d7\u0005$\u0000"+
		"\u0000\u00d7\u00d8\u0005\u0014\u0000\u0000\u00d8\u00d9\u00056\u0000\u0000"+
		"\u00d9\u00e2\u0005\u0015\u0000\u0000\u00da\u00db\u0005%\u0000\u0000\u00db"+
		"\u00dc\u0005\u0014\u0000\u0000\u00dc\u00dd\u00056\u0000\u0000\u00dd\u00de"+
		"\u0005\u0002\u0000\u0000\u00de\u00df\u00056\u0000\u0000\u00df\u00e2\u0005"+
		"\u0015\u0000\u0000\u00e0\u00e2\u0005&\u0000\u0000\u00e1\u00d5\u0001\u0000"+
		"\u0000\u0000\u00e1\u00d6\u0001\u0000\u0000\u0000\u00e1\u00da\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2%\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0005\'\u0000\u0000\u00e4\u00e5\u0005\u001a\u0000\u0000"+
		"\u00e5\u00e6\u00057\u0000\u0000\u00e6\'\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e8\u0005(\u0000\u0000\u00e8\u00e9\u0005\u001a\u0000\u0000\u00e9\u00ea"+
		"\u00057\u0000\u0000\u00ea\u00eb\u0003*\u0015\u0000\u00eb)\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ed\u0005)\u0000\u0000\u00ed\u00ee\u0005*\u0000\u0000"+
		"\u00ee\u00f6\u0003 \u0010\u0000\u00ef\u00f0\u0005+\u0000\u0000\u00f0\u00f1"+
		"\u0005*\u0000\u0000\u00f1\u00f6\u0003 \u0010\u0000\u00f2\u00f3\u0005\'"+
		"\u0000\u0000\u00f3\u00f4\u0005*\u0000\u0000\u00f4\u00f6\u00057\u0000\u0000"+
		"\u00f5\u00ec\u0001\u0000\u0000\u0000\u00f5\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f2\u0001\u0000\u0000\u0000\u00f6+\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f8\u0005\u0019\u0000\u0000\u00f8\u00f9\u0005,\u0000\u0000\u00f9\u00fa"+
		"\u00057\u0000\u0000\u00fa\u00fb\u0005-\u0000\u0000\u00fb\u00fc\u00057"+
		"\u0000\u0000\u00fc\u00fd\u0005\u0014\u0000\u0000\u00fd\u00fe\u00057\u0000"+
		"\u0000\u00fe\u00ff\u0005\u0015\u0000\u0000\u00ff-\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0005(\u0000\u0000\u0101\u0102\u0005\u001a\u0000\u0000\u0102"+
		"\u0103\u00057\u0000\u0000\u0103\u0104\u0005)\u0000\u0000\u0104\u0105\u0005"+
		".\u0000\u0000\u0105\u0106\u00057\u0000\u0000\u0106\u0107\u0003\u001e\u000f"+
		"\u0000\u0107/\u0001\u0000\u0000\u0000\u0108\u0109\u0005\u0019\u0000\u0000"+
		"\u0109\u010a\u0005/\u0000\u0000\u010a\u010b\u00057\u0000\u0000\u010b\u010c"+
		"\u00050\u0000\u0000\u010c\u010d\u0003\u0010\b\u0000\u010d1\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0005\u0019\u0000\u0000\u010f\u0110\u00051\u0000"+
		"\u0000\u0110\u0111\u00057\u0000\u0000\u0111\u0112\u0005\u0014\u0000\u0000"+
		"\u0112\u0117\u00034\u001a\u0000\u0113\u0114\u0005\u0002\u0000\u0000\u0114"+
		"\u0116\u00034\u001a\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0116\u0119"+
		"\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0118"+
		"\u0001\u0000\u0000\u0000\u0118\u011a\u0001\u0000\u0000\u0000\u0119\u0117"+
		"\u0001\u0000\u0000\u0000\u011a\u011b\u0005\u0015\u0000\u0000\u011b\u011f"+
		"\u00052\u0000\u0000\u011c\u011e\u0003\u0002\u0001\u0000\u011d\u011c\u0001"+
		"\u0000\u0000\u0000\u011e\u0121\u0001\u0000\u0000\u0000\u011f\u011d\u0001"+
		"\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0122\u0001"+
		"\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0122\u0123\u0005"+
		"3\u0000\u0000\u01233\u0001\u0000\u0000\u0000\u0124\u0125\u00054\u0000"+
		"\u0000\u0125\u0126\u00057\u0000\u0000\u0126\u0127\u0003$\u0012\u0000\u0127"+
		"5\u0001\u0000\u0000\u0000\u0128\u0129\u00055\u0000\u0000\u0129\u012a\u0005"+
		"7\u0000\u0000\u012a\u012b\u0005\u0014\u0000\u0000\u012b\u0130\u0003\u000e"+
		"\u0007\u0000\u012c\u012d\u0005\u0002\u0000\u0000\u012d\u012f\u0003\u000e"+
		"\u0007\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f\u0132\u0001\u0000"+
		"\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000"+
		"\u0000\u0000\u0131\u0133\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000"+
		"\u0000\u0000\u0133\u0134\u0005\u0015\u0000\u0000\u01347\u0001\u0000\u0000"+
		"\u0000\u0014HOWcqvy\u0082\u0088\u009a\u00a5\u00ac\u00c4\u00cb\u00d3\u00e1"+
		"\u00f5\u0117\u011f\u0130";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}