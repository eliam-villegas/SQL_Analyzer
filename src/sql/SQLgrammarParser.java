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
		INT=25, ID=26, STRING=27, WS=28;
	public static final int
		RULE_sql = 0, RULE_declaracion = 1, RULE_columnas = 2, RULE_valores = 3, 
		RULE_asignaciones = 4, RULE_comparacion = 5, RULE_condicion = 6, RULE_expresion = 7, 
		RULE_seleccion = 8, RULE_where = 9, RULE_orderby = 10, RULE_eliminacion = 11, 
		RULE_insercion = 12, RULE_actualizacion = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"sql", "declaracion", "columnas", "valores", "asignaciones", "comparacion", 
			"condicion", "expresion", "seleccion", "where", "orderby", "eliminacion", 
			"insercion", "actualizacion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'='", "'<'", "'>'", "'>='", "'<='", "'!='", "'SELECT'", 
			"'*'", "'FROM'", "'WHERE'", "'ORDER'", "'BY'", "'ASC'", "'DESC'", "'DELETE'", 
			"'INSERT'", "'INTO'", "'('", "')'", "'VALUES'", "'UPDATE'", "'SET'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "INT", "ID", "STRING", "WS"
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
			setState(28);
			declaracion();
			setState(29);
			match(T__0);
			setState(30);
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
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				seleccion();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				eliminacion();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				insercion();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				actualizacion();
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
			setState(38);
			match(ID);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(39);
				match(T__1);
				setState(40);
				match(ID);
				}
				}
				setState(45);
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
			setState(46);
			expresion();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(47);
				match(T__1);
				setState(48);
				expresion();
				}
				}
				setState(53);
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
			setState(54);
			match(ID);
			setState(55);
			match(T__2);
			setState(56);
			expresion();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(57);
				match(T__1);
				setState(58);
				match(ID);
				setState(59);
				match(T__2);
				setState(60);
				expresion();
				}
				}
				setState(65);
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
			setState(66);
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
			setState(68);
			expresion();
			setState(69);
			comparacion();
			setState(70);
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
			setState(72);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 234881024L) != 0)) ) {
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
			setState(74);
			match(T__8);
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				{
				setState(75);
				match(T__9);
				}
				break;
			case ID:
				{
				setState(76);
				columnas();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(79);
			match(T__10);
			setState(80);
			match(ID);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(81);
				where();
				}
			}

			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(84);
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
			setState(87);
			match(T__11);
			setState(88);
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
			setState(90);
			match(T__12);
			setState(91);
			match(T__13);
			setState(92);
			match(ID);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14 || _la==T__15) {
				{
				setState(93);
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
			setState(96);
			match(T__16);
			setState(97);
			match(T__10);
			setState(98);
			match(ID);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(99);
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
			setState(102);
			match(T__17);
			setState(103);
			match(T__18);
			setState(104);
			match(ID);
			setState(105);
			match(T__19);
			setState(106);
			columnas();
			setState(107);
			match(T__20);
			setState(108);
			match(T__21);
			setState(109);
			match(T__19);
			setState(110);
			valores();
			setState(111);
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
			setState(113);
			match(T__22);
			setState(114);
			match(ID);
			setState(115);
			match(T__23);
			setState(116);
			asignaciones();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(117);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001cy\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001%\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002*\b\u0002\n\u0002\f\u0002"+
		"-\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u00032\b\u0003\n\u0003"+
		"\f\u00035\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004>\b\u0004\n\u0004\f\u0004A\t"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003\bN\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\bS\b\b\u0001\b\u0003\bV\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n_\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000be\b\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\rw\b\r\u0001\r\u0000\u0000\u000e"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u0000\u0003\u0001\u0000\u0003\b\u0001\u0000\u0019\u001b\u0001\u0000\u000f"+
		"\u0010v\u0000\u001c\u0001\u0000\u0000\u0000\u0002$\u0001\u0000\u0000\u0000"+
		"\u0004&\u0001\u0000\u0000\u0000\u0006.\u0001\u0000\u0000\u0000\b6\u0001"+
		"\u0000\u0000\u0000\nB\u0001\u0000\u0000\u0000\fD\u0001\u0000\u0000\u0000"+
		"\u000eH\u0001\u0000\u0000\u0000\u0010J\u0001\u0000\u0000\u0000\u0012W"+
		"\u0001\u0000\u0000\u0000\u0014Z\u0001\u0000\u0000\u0000\u0016`\u0001\u0000"+
		"\u0000\u0000\u0018f\u0001\u0000\u0000\u0000\u001aq\u0001\u0000\u0000\u0000"+
		"\u001c\u001d\u0003\u0002\u0001\u0000\u001d\u001e\u0005\u0001\u0000\u0000"+
		"\u001e\u001f\u0005\u0000\u0000\u0001\u001f\u0001\u0001\u0000\u0000\u0000"+
		" %\u0003\u0010\b\u0000!%\u0003\u0016\u000b\u0000\"%\u0003\u0018\f\u0000"+
		"#%\u0003\u001a\r\u0000$ \u0001\u0000\u0000\u0000$!\u0001\u0000\u0000\u0000"+
		"$\"\u0001\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000%\u0003\u0001\u0000"+
		"\u0000\u0000&+\u0005\u001a\u0000\u0000\'(\u0005\u0002\u0000\u0000(*\u0005"+
		"\u001a\u0000\u0000)\'\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000"+
		"+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,\u0005\u0001\u0000"+
		"\u0000\u0000-+\u0001\u0000\u0000\u0000.3\u0003\u000e\u0007\u0000/0\u0005"+
		"\u0002\u0000\u000002\u0003\u000e\u0007\u00001/\u0001\u0000\u0000\u0000"+
		"25\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000"+
		"\u00004\u0007\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000067\u0005"+
		"\u001a\u0000\u000078\u0005\u0003\u0000\u00008?\u0003\u000e\u0007\u0000"+
		"9:\u0005\u0002\u0000\u0000:;\u0005\u001a\u0000\u0000;<\u0005\u0003\u0000"+
		"\u0000<>\u0003\u000e\u0007\u0000=9\u0001\u0000\u0000\u0000>A\u0001\u0000"+
		"\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@\t\u0001"+
		"\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BC\u0007\u0000\u0000\u0000"+
		"C\u000b\u0001\u0000\u0000\u0000DE\u0003\u000e\u0007\u0000EF\u0003\n\u0005"+
		"\u0000FG\u0003\u000e\u0007\u0000G\r\u0001\u0000\u0000\u0000HI\u0007\u0001"+
		"\u0000\u0000I\u000f\u0001\u0000\u0000\u0000JM\u0005\t\u0000\u0000KN\u0005"+
		"\n\u0000\u0000LN\u0003\u0004\u0002\u0000MK\u0001\u0000\u0000\u0000ML\u0001"+
		"\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0005\u000b\u0000\u0000"+
		"PR\u0005\u001a\u0000\u0000QS\u0003\u0012\t\u0000RQ\u0001\u0000\u0000\u0000"+
		"RS\u0001\u0000\u0000\u0000SU\u0001\u0000\u0000\u0000TV\u0003\u0014\n\u0000"+
		"UT\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000V\u0011\u0001\u0000"+
		"\u0000\u0000WX\u0005\f\u0000\u0000XY\u0003\f\u0006\u0000Y\u0013\u0001"+
		"\u0000\u0000\u0000Z[\u0005\r\u0000\u0000[\\\u0005\u000e\u0000\u0000\\"+
		"^\u0005\u001a\u0000\u0000]_\u0007\u0002\u0000\u0000^]\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_\u0015\u0001\u0000\u0000\u0000`a\u0005"+
		"\u0011\u0000\u0000ab\u0005\u000b\u0000\u0000bd\u0005\u001a\u0000\u0000"+
		"ce\u0003\u0012\t\u0000dc\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000"+
		"e\u0017\u0001\u0000\u0000\u0000fg\u0005\u0012\u0000\u0000gh\u0005\u0013"+
		"\u0000\u0000hi\u0005\u001a\u0000\u0000ij\u0005\u0014\u0000\u0000jk\u0003"+
		"\u0004\u0002\u0000kl\u0005\u0015\u0000\u0000lm\u0005\u0016\u0000\u0000"+
		"mn\u0005\u0014\u0000\u0000no\u0003\u0006\u0003\u0000op\u0005\u0015\u0000"+
		"\u0000p\u0019\u0001\u0000\u0000\u0000qr\u0005\u0017\u0000\u0000rs\u0005"+
		"\u001a\u0000\u0000st\u0005\u0018\u0000\u0000tv\u0003\b\u0004\u0000uw\u0003"+
		"\u0012\t\u0000vu\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w\u001b"+
		"\u0001\u0000\u0000\u0000\n$+3?MRU^dv";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}