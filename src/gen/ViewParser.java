// Generated from src/View.g4 by ANTLR 4.8
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ViewParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

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
		T__52=53, T__53=54, T__54=55, T__55=56, KEYWORD=57, RETURN=58, COMMAND=59, 
		COMPARISON=60, OPERATOR=61, CONSTANTS=62, VALUE=63, NAME=64, WHITESPACE=65, 
		ANY=66;
	public static final int
		RULE_root = 0, RULE_scope = 1, RULE_query = 2, RULE_changegraph = 3, RULE_pipeline = 4, 
		RULE_replacements = 5, RULE_iteration = 6, RULE_validVal = 7, RULE_iterationCase = 8, 
		RULE_size = 9, RULE_range = 10, RULE_pipeconditions = 11, RULE_pipeexpr = 12, 
		RULE_function = 13, RULE_viewuse = 14, RULE_usedviews = 15, RULE_viewatom = 16, 
		RULE_returnstmt = 17, RULE_retval = 18, RULE_expr = 19, RULE_variable = 20, 
		RULE_type = 21, RULE_nodeName = 22, RULE_relation = 23, RULE_relationValue = 24, 
		RULE_relationLength = 25, RULE_pathExp = 26, RULE_path = 27, RULE_conditions = 28, 
		RULE_boolexpr = 29, RULE_attribute = 30, RULE_val = 31, RULE_indexing = 32, 
		RULE_setattr = 33, RULE_arithmetic = 34, RULE_insertion = 35, RULE_insertrelation = 36, 
		RULE_insertionVar = 37, RULE_insertAttributes = 38, RULE_as = 39, RULE_exists = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "scope", "query", "changegraph", "pipeline", "replacements", 
			"iteration", "validVal", "iterationCase", "size", "range", "pipeconditions", 
			"pipeexpr", "function", "viewuse", "usedviews", "viewatom", "returnstmt", 
			"retval", "expr", "variable", "type", "nodeName", "relation", "relationValue", 
			"relationLength", "pathExp", "path", "conditions", "boolexpr", "attribute", 
			"val", "indexing", "setattr", "arithmetic", "insertion", "insertrelation", 
			"insertionVar", "insertAttributes", "as", "exists"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CG'", "'LOCAL'", "'GLOBAL'", "'SET'", "'DELETE'", "'REMOVE'", 
			"'CREATE'", "'WITH'", "','", "'['", "'IN'", "'('", "')'", "'|'", "']'", 
			"'NULL'", "'CASE WHEN'", "'THEN'", "'ELSE'", "'END'", "'SIZE'", "'size'", 
			"'RANGE'", "'range'", "'WHERE'", "'='", "'COLLECT('", "'UNWIND'", "'COUNT('", 
			"'COUNT(*)'", "'MAX('", "'WITH VIEWS'", "'-['", "']-'", "']->'", "'<-['", 
			"'NODES('", "'*'", "':'", "'()'", "'..'", "'*..'", "'AND'", "'OR'", "'.'", 
			"'not'", "'NOT'", "'+'", "'-'", "'/'", "'{'", "'}'", "'AS'", "'as'", 
			"'EXISTS'", "'exists'", null, "'RETURN'", "'CREATE VIEW AS'", null, null, 
			null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "KEYWORD", "RETURN", 
			"COMMAND", "COMPARISON", "OPERATOR", "CONSTANTS", "VALUE", "NAME", "WHITESPACE", 
			"ANY"
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
	public String getGrammarFileName() { return "View.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ViewParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public TerminalNode COMMAND() { return getToken(ViewParser.COMMAND, 0); }
		public TerminalNode NAME() { return getToken(ViewParser.NAME, 0); }
		public ViewuseContext viewuse() {
			return getRuleContext(ViewuseContext.class,0);
		}
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ChangegraphContext changegraph() {
			return getRuleContext(ChangegraphContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(COMMAND);
				setState(83);
				match(NAME);
				setState(84);
				viewuse();
				setState(85);
				scope();
				setState(86);
				query();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(T__0);
				setState(89);
				query();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				changegraph();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				viewuse();
				setState(92);
				scope();
				setState(93);
				query();
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

	public static class ScopeContext extends ParserRuleContext {
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitScope(this);
		}
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_scope);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(T__2);
				}
				break;
			case KEYWORD:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class QueryContext extends ParserRuleContext {
		public TerminalNode KEYWORD() { return getToken(ViewParser.KEYWORD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public ReturnstmtContext returnstmt() {
			return getRuleContext(ReturnstmtContext.class,0);
		}
		public PipelineContext pipeline() {
			return getRuleContext(PipelineContext.class,0);
		}
		public PathExpContext pathExp() {
			return getRuleContext(PathExpContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitQuery(this);
		}
		
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_query);
		int _la;
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(KEYWORD);
				setState(103);
				expr();
				setState(104);
				conditions();
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(105);
					pipeline();
					}
				}

				setState(108);
				returnstmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(KEYWORD);
				setState(111);
				pathExp();
				setState(112);
				conditions();
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(113);
					pipeline();
					}
				}

				setState(116);
				returnstmt();
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

	public static class ChangegraphContext extends ParserRuleContext {
		public TerminalNode KEYWORD() { return getToken(ViewParser.KEYWORD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public SetattrContext setattr() {
			return getRuleContext(SetattrContext.class,0);
		}
		public TerminalNode NAME() { return getToken(ViewParser.NAME, 0); }
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public InsertionContext insertion() {
			return getRuleContext(InsertionContext.class,0);
		}
		public ChangegraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_changegraph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterChangegraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitChangegraph(this);
		}
	}

	public final ChangegraphContext changegraph() throws RecognitionException {
		ChangegraphContext _localctx = new ChangegraphContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_changegraph);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(KEYWORD);
				setState(121);
				expr();
				setState(122);
				conditions();
				setState(123);
				match(T__3);
				setState(124);
				setattr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(KEYWORD);
				setState(127);
				expr();
				setState(128);
				conditions();
				setState(129);
				match(T__4);
				setState(130);
				match(NAME);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(KEYWORD);
				setState(133);
				expr();
				setState(134);
				conditions();
				setState(135);
				match(T__5);
				setState(136);
				attribute(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				match(KEYWORD);
				setState(139);
				expr();
				setState(140);
				conditions();
				setState(141);
				match(T__6);
				setState(142);
				insertion(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				match(T__6);
				setState(145);
				insertion(0);
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

	public static class PipelineContext extends ParserRuleContext {
		public ReplacementsContext replacements() {
			return getRuleContext(ReplacementsContext.class,0);
		}
		public PipeconditionsContext pipeconditions() {
			return getRuleContext(PipeconditionsContext.class,0);
		}
		public PipelineContext pipeline() {
			return getRuleContext(PipelineContext.class,0);
		}
		public PipelineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipeline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterPipeline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitPipeline(this);
		}
	}

	public final PipelineContext pipeline() throws RecognitionException {
		PipelineContext _localctx = new PipelineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pipeline);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(T__7);
				setState(149);
				replacements();
				setState(150);
				pipeconditions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(T__7);
				setState(153);
				replacements();
				setState(154);
				pipeconditions();
				setState(155);
				pipeline();
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

	public static class ReplacementsContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(ViewParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ViewParser.NAME, i);
		}
		public AsContext as() {
			return getRuleContext(AsContext.class,0);
		}
		public ReplacementsContext replacements() {
			return getRuleContext(ReplacementsContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public IterationContext iteration() {
			return getRuleContext(IterationContext.class,0);
		}
		public ReplacementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replacements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterReplacements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitReplacements(this);
		}
	}

	public final ReplacementsContext replacements() throws RecognitionException {
		ReplacementsContext _localctx = new ReplacementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_replacements);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(NAME);
				setState(160);
				as();
				setState(161);
				match(NAME);
				{
				setState(162);
				match(T__8);
				setState(163);
				replacements();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				function();
				setState(166);
				as();
				setState(167);
				match(NAME);
				{
				setState(168);
				match(T__8);
				setState(169);
				replacements();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				match(NAME);
				{
				setState(172);
				match(T__8);
				setState(173);
				replacements();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				match(NAME);
				setState(175);
				as();
				setState(176);
				match(NAME);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				function();
				setState(179);
				as();
				setState(180);
				match(NAME);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(182);
				match(NAME);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(183);
				iteration();
				setState(184);
				as();
				setState(185);
				match(NAME);
				{
				setState(186);
				match(T__8);
				setState(187);
				replacements();
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(189);
				iteration();
				setState(190);
				as();
				setState(191);
				match(NAME);
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

	public static class IterationContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ViewParser.NAME, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public List<ValidValContext> validVal() {
			return getRuleContexts(ValidValContext.class);
		}
		public ValidValContext validVal(int i) {
			return getRuleContext(ValidValContext.class,i);
		}
		public IterationCaseContext iterationCase() {
			return getRuleContext(IterationCaseContext.class,0);
		}
		public IterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterIteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitIteration(this);
		}
	}

	public final IterationContext iteration() throws RecognitionException {
		IterationContext _localctx = new IterationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_iteration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__9);
			setState(196);
			match(NAME);
			setState(197);
			match(T__10);
			setState(198);
			range();
			setState(199);
			match(T__11);
			setState(200);
			validVal(0);
			setState(201);
			match(T__8);
			setState(202);
			validVal(0);
			setState(203);
			match(T__12);
			setState(204);
			match(T__13);
			setState(205);
			iterationCase();
			setState(206);
			match(T__14);
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

	public static class ValidValContext extends ParserRuleContext {
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public TerminalNode NAME() { return getToken(ViewParser.NAME, 0); }
		public TerminalNode VALUE() { return getToken(ViewParser.VALUE, 0); }
		public IndexingContext indexing() {
			return getRuleContext(IndexingContext.class,0);
		}
		public List<ValidValContext> validVal() {
			return getRuleContexts(ValidValContext.class);
		}
		public ValidValContext validVal(int i) {
			return getRuleContext(ValidValContext.class,i);
		}
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public ValidValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterValidVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitValidVal(this);
		}
	}

	public final ValidValContext validVal() throws RecognitionException {
		return validVal(0);
	}

	private ValidValContext validVal(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValidValContext _localctx = new ValidValContext(_ctx, _parentState);
		ValidValContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_validVal, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
			case T__21:
				{
				setState(209);
				size();
				setState(210);
				match(T__11);
				setState(211);
				match(NAME);
				setState(212);
				match(T__12);
				}
				break;
			case VALUE:
				{
				setState(214);
				match(VALUE);
				}
				break;
			case T__15:
				{
				setState(215);
				match(T__15);
				}
				break;
			case NAME:
				{
				setState(216);
				indexing();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ValidValContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_validVal);
					setState(219);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(220);
					arithmetic();
					setState(221);
					validVal(5);
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IterationCaseContext extends ParserRuleContext {
		public PipeexprContext pipeexpr() {
			return getRuleContext(PipeexprContext.class,0);
		}
		public List<ValidValContext> validVal() {
			return getRuleContexts(ValidValContext.class);
		}
		public ValidValContext validVal(int i) {
			return getRuleContext(ValidValContext.class,i);
		}
		public IterationCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterIterationCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitIterationCase(this);
		}
	}

	public final IterationCaseContext iterationCase() throws RecognitionException {
		IterationCaseContext _localctx = new IterationCaseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_iterationCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__16);
			setState(229);
			pipeexpr();
			setState(230);
			match(T__17);
			setState(231);
			validVal(0);
			setState(232);
			match(T__18);
			setState(233);
			validVal(0);
			setState(234);
			match(T__19);
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

	public static class SizeContext extends ParserRuleContext {
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitSize(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_la = _input.LA(1);
			if ( !(_la==T__20 || _la==T__21) ) {
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

	public static class RangeContext extends ParserRuleContext {
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitRange(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if ( !(_la==T__22 || _la==T__23) ) {
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

	public static class PipeconditionsContext extends ParserRuleContext {
		public PipeexprContext pipeexpr() {
			return getRuleContext(PipeexprContext.class,0);
		}
		public TerminalNode KEYWORD() { return getToken(ViewParser.KEYWORD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public PipeconditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipeconditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterPipeconditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitPipeconditions(this);
		}
	}

	public final PipeconditionsContext pipeconditions() throws RecognitionException {
		PipeconditionsContext _localctx = new PipeconditionsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pipeconditions);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(T__24);
				setState(241);
				pipeexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(KEYWORD);
				setState(243);
				expr();
				setState(244);
				conditions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				match(KEYWORD);
				setState(247);
				path();
				setState(248);
				conditions();
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

	public static class PipeexprContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode COMPARISON() { return getToken(ViewParser.COMPARISON, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public PipeexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipeexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterPipeexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitPipeexpr(this);
		}
	}

	public final PipeexprContext pipeexpr() throws RecognitionException {
		PipeexprContext _localctx = new PipeexprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pipeexpr);
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				attribute(0);
				setState(253);
				match(COMPARISON);
				setState(254);
				attribute(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				attribute(0);
				setState(257);
				match(COMPARISON);
				setState(258);
				val();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				attribute(0);
				setState(261);
				match(T__25);
				setState(262);
				attribute(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				attribute(0);
				setState(265);
				match(T__25);
				setState(266);
				val();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(268);
				function();
				setState(269);
				match(COMPARISON);
				setState(270);
				attribute(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(272);
				function();
				setState(273);
				match(COMPARISON);
				setState(274);
				val();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(276);
				function();
				setState(277);
				match(T__25);
				setState(278);
				attribute(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(280);
				function();
				setState(281);
				match(T__25);
				setState(282);
				val();
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ViewParser.NAME, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function);
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(T__26);
				setState(287);
				match(NAME);
				setState(288);
				match(T__12);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(T__27);
				setState(290);
				match(NAME);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				match(T__28);
				setState(292);
				match(NAME);
				setState(293);
				match(T__12);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 5);
				{
				setState(295);
				match(T__30);
				setState(296);
				match(NAME);
				setState(297);
				match(T__12);
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

	public static class ViewuseContext extends ParserRuleContext {
		public UsedviewsContext usedviews() {
			return getRuleContext(UsedviewsContext.class,0);
		}
		public ViewuseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewuse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterViewuse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitViewuse(this);
		}
	}

	public final ViewuseContext viewuse() throws RecognitionException {
		ViewuseContext _localctx = new ViewuseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_viewuse);
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(T__31);
				setState(301);
				usedviews();
				}
				break;
			case T__1:
			case T__2:
			case KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class UsedviewsContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(ViewParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ViewParser.NAME, i);
		}
		public UsedviewsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usedviews; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterUsedviews(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitUsedviews(this);
		}
	}

	public final UsedviewsContext usedviews() throws RecognitionException {
		UsedviewsContext _localctx = new UsedviewsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_usedviews);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(305);
				match(NAME);
				}
				}
				setState(310);
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

	public static class ViewatomContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public List<ViewatomContext> viewatom() {
			return getRuleContexts(ViewatomContext.class);
		}
		public ViewatomContext viewatom(int i) {
			return getRuleContext(ViewatomContext.class,i);
		}
		public ViewatomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewatom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterViewatom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitViewatom(this);
		}
	}

	public final ViewatomContext viewatom() throws RecognitionException {
		return viewatom(0);
	}

	private ViewatomContext viewatom(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ViewatomContext _localctx = new ViewatomContext(_ctx, _parentState);
		ViewatomContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_viewatom, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(312);
				variable();
				}
				break;
			case 2:
				{
				setState(313);
				variable();
				setState(314);
				match(T__32);
				setState(315);
				relation();
				setState(316);
				match(T__33);
				setState(317);
				viewatom(8);
				}
				break;
			case 3:
				{
				setState(319);
				variable();
				setState(320);
				match(T__32);
				setState(321);
				relation();
				setState(322);
				match(T__34);
				setState(323);
				viewatom(7);
				}
				break;
			case 4:
				{
				setState(325);
				variable();
				setState(326);
				match(T__35);
				setState(327);
				relation();
				setState(328);
				match(T__33);
				setState(329);
				viewatom(6);
				}
				break;
			case 5:
				{
				setState(331);
				variable();
				setState(332);
				match(T__35);
				setState(333);
				relation();
				setState(334);
				match(T__34);
				setState(335);
				viewatom(5);
				}
				break;
			case 6:
				{
				setState(337);
				variable();
				setState(338);
				match(T__32);
				setState(339);
				relation();
				setState(340);
				match(T__33);
				setState(341);
				variable();
				}
				break;
			case 7:
				{
				setState(343);
				variable();
				setState(344);
				match(T__32);
				setState(345);
				relation();
				setState(346);
				match(T__34);
				setState(347);
				variable();
				}
				break;
			case 8:
				{
				setState(349);
				variable();
				setState(350);
				match(T__35);
				setState(351);
				relation();
				setState(352);
				match(T__33);
				setState(353);
				variable();
				}
				break;
			case 9:
				{
				setState(355);
				variable();
				setState(356);
				match(T__35);
				setState(357);
				relation();
				setState(358);
				match(T__34);
				setState(359);
				variable();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(413);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(411);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ViewatomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_viewatom);
						setState(363);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(364);
						match(T__32);
						setState(365);
						relation();
						setState(366);
						match(T__33);
						setState(367);
						viewatom(17);
						}
						break;
					case 2:
						{
						_localctx = new ViewatomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_viewatom);
						setState(369);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(370);
						match(T__32);
						setState(371);
						relation();
						setState(372);
						match(T__34);
						setState(373);
						viewatom(16);
						}
						break;
					case 3:
						{
						_localctx = new ViewatomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_viewatom);
						setState(375);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(376);
						match(T__35);
						setState(377);
						relation();
						setState(378);
						match(T__33);
						setState(379);
						viewatom(15);
						}
						break;
					case 4:
						{
						_localctx = new ViewatomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_viewatom);
						setState(381);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(382);
						match(T__35);
						setState(383);
						relation();
						setState(384);
						match(T__34);
						setState(385);
						viewatom(14);
						}
						break;
					case 5:
						{
						_localctx = new ViewatomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_viewatom);
						setState(387);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(388);
						match(T__32);
						setState(389);
						relation();
						setState(390);
						match(T__33);
						setState(391);
						variable();
						}
						break;
					case 6:
						{
						_localctx = new ViewatomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_viewatom);
						setState(393);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(394);
						match(T__32);
						setState(395);
						relation();
						setState(396);
						match(T__34);
						setState(397);
						variable();
						}
						break;
					case 7:
						{
						_localctx = new ViewatomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_viewatom);
						setState(399);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(400);
						match(T__35);
						setState(401);
						relation();
						setState(402);
						match(T__33);
						setState(403);
						variable();
						}
						break;
					case 8:
						{
						_localctx = new ViewatomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_viewatom);
						setState(405);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(406);
						match(T__35);
						setState(407);
						relation();
						setState(408);
						match(T__34);
						setState(409);
						variable();
						}
						break;
					}
					} 
				}
				setState(415);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ReturnstmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ViewParser.RETURN, 0); }
		public List<RetvalContext> retval() {
			return getRuleContexts(RetvalContext.class);
		}
		public RetvalContext retval(int i) {
			return getRuleContext(RetvalContext.class,i);
		}
		public ReturnstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterReturnstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitReturnstmt(this);
		}
	}

	public final ReturnstmtContext returnstmt() throws RecognitionException {
		ReturnstmtContext _localctx = new ReturnstmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(RETURN);
			setState(417);
			retval();
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(418);
				match(T__8);
				setState(419);
				retval();
				}
				}
				setState(424);
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

	public static class RetvalContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ViewParser.NAME, 0); }
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public RetvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterRetval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitRetval(this);
		}
	}

	public final RetvalContext retval() throws RecognitionException {
		RetvalContext _localctx = new RetvalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_retval);
		try {
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				match(T__36);
				setState(426);
				match(NAME);
				setState(427);
				match(T__12);
				}
				break;
			case CONSTANTS:
			case VALUE:
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				attribute(0);
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

	public static class ExprContext extends ParserRuleContext {
		public ViewatomContext viewatom() {
			return getRuleContext(ViewatomContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr);
		try {
			setState(433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				viewatom(0);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
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

	public static class VariableContext extends ParserRuleContext {
		public NodeNameContext nodeName() {
			return getRuleContext(NodeNameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variable);
		try {
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				match(T__11);
				setState(436);
				nodeName();
				setState(437);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				match(T__11);
				setState(440);
				nodeName();
				setState(441);
				match(T__38);
				setState(442);
				type();
				setState(443);
				match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(445);
				match(T__39);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ViewParser.NAME, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(NAME);
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

	public static class NodeNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ViewParser.NAME, 0); }
		public NodeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterNodeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitNodeName(this);
		}
	}

	public final NodeNameContext nodeName() throws RecognitionException {
		NodeNameContext _localctx = new NodeNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_nodeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(NAME);
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

	public static class RelationContext extends ParserRuleContext {
		public RelationValueContext relationValue() {
			return getRuleContext(RelationValueContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public RelationLengthContext relationLength() {
			return getRuleContext(RelationLengthContext.class,0);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitRelation(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(452);
				relationValue();
				}
			}

			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(455);
				match(T__38);
				setState(456);
				type();
				}
			}

			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(459);
				match(T__13);
				setState(460);
				type();
				}
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__37 || _la==T__41) {
				{
				setState(466);
				relationLength();
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

	public static class RelationValueContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ViewParser.NAME, 0); }
		public RelationValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterRelationValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitRelationValue(this);
		}
	}

	public final RelationValueContext relationValue() throws RecognitionException {
		RelationValueContext _localctx = new RelationValueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_relationValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(NAME);
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

	public static class RelationLengthContext extends ParserRuleContext {
		public List<TerminalNode> VALUE() { return getTokens(ViewParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(ViewParser.VALUE, i);
		}
		public RelationLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationLength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterRelationLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitRelationLength(this);
		}
	}

	public final RelationLengthContext relationLength() throws RecognitionException {
		RelationLengthContext _localctx = new RelationLengthContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_relationLength);
		try {
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				match(T__37);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				match(T__37);
				setState(473);
				match(VALUE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(474);
				match(T__37);
				setState(475);
				match(VALUE);
				setState(476);
				match(T__40);
				setState(477);
				match(VALUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(478);
				match(T__41);
				setState(479);
				match(VALUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(480);
				match(T__37);
				setState(481);
				match(VALUE);
				setState(482);
				match(T__40);
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

	public static class PathExpContext extends ParserRuleContext {
		public List<PathContext> path() {
			return getRuleContexts(PathContext.class);
		}
		public PathContext path(int i) {
			return getRuleContext(PathContext.class,i);
		}
		public PathExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterPathExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitPathExp(this);
		}
		
	}

	public final PathExpContext pathExp() throws RecognitionException {
		PathExpContext _localctx = new PathExpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_pathExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			path();
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(486);
				match(T__8);
				setState(487);
				path();
				}
				}
				setState(492);
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

	public static class PathContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ViewParser.NAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitPath(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(NAME);
			setState(494);
			match(T__25);
			setState(495);
			expr();
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

	public static class ConditionsContext extends ParserRuleContext {
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitConditions(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_conditions);
		try {
			setState(500);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				match(T__24);
				setState(498);
				boolexpr(0);
				}
				break;
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class BoolexprContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode COMPARISON() { return getToken(ViewParser.COMPARISON, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TerminalNode VALUE() { return getToken(ViewParser.VALUE, 0); }
		public TerminalNode OPERATOR() { return getToken(ViewParser.OPERATOR, 0); }
		public List<TerminalNode> NAME() { return getTokens(ViewParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ViewParser.NAME, i);
		}
		public List<BoolexprContext> boolexpr() {
			return getRuleContexts(BoolexprContext.class);
		}
		public BoolexprContext boolexpr(int i) {
			return getRuleContext(BoolexprContext.class,i);
		}
		public ExistsContext exists() {
			return getRuleContext(ExistsContext.class,0);
		}
		public BoolexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterBoolexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitBoolexpr(this);
		}
	}

	public final BoolexprContext boolexpr() throws RecognitionException {
		return boolexpr(0);
	}

	private BoolexprContext boolexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolexprContext _localctx = new BoolexprContext(_ctx, _parentState);
		BoolexprContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_boolexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(503);
				attribute(0);
				setState(504);
				match(COMPARISON);
				setState(505);
				attribute(0);
				}
				break;
			case 2:
				{
				setState(507);
				attribute(0);
				setState(508);
				match(COMPARISON);
				setState(509);
				val();
				}
				break;
			case 3:
				{
				setState(511);
				attribute(0);
				setState(512);
				match(T__25);
				setState(513);
				attribute(0);
				}
				break;
			case 4:
				{
				setState(515);
				attribute(0);
				setState(516);
				match(T__25);
				setState(517);
				val();
				}
				break;
			case 5:
				{
				setState(519);
				match(VALUE);
				setState(520);
				match(OPERATOR);
				setState(521);
				attribute(0);
				}
				break;
			case 6:
				{
				setState(522);
				match(NAME);
				setState(523);
				match(T__10);
				setState(524);
				match(NAME);
				setState(527);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(525);
					match(T__44);
					setState(526);
					match(NAME);
					}
					break;
				}
				}
				break;
			case 7:
				{
				setState(529);
				match(T__11);
				setState(530);
				boolexpr(0);
				setState(531);
				match(T__12);
				}
				break;
			case 8:
				{
				setState(533);
				match(T__45);
				setState(534);
				boolexpr(3);
				}
				break;
			case 9:
				{
				setState(535);
				match(T__46);
				setState(536);
				boolexpr(2);
				}
				break;
			case 10:
				{
				setState(537);
				exists();
				setState(538);
				match(T__11);
				setState(539);
				attribute(0);
				setState(540);
				match(T__12);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(552);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(550);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new BoolexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_boolexpr);
						setState(544);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(545);
						match(T__42);
						setState(546);
						boolexpr(9);
						}
						break;
					case 2:
						{
						_localctx = new BoolexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_boolexpr);
						setState(547);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(548);
						match(T__43);
						setState(549);
						boolexpr(8);
						}
						break;
					}
					} 
				}
				setState(554);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(ViewParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ViewParser.NAME, i);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public IndexingContext indexing() {
			return getRuleContext(IndexingContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		return attribute(0);
	}

	private AttributeContext attribute(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AttributeContext _localctx = new AttributeContext(_ctx, _parentState);
		AttributeContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_attribute, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(556);
				match(NAME);
				setState(559);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(557);
					match(T__44);
					setState(558);
					match(NAME);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(561);
				val();
				setState(562);
				arithmetic();
				setState(563);
				attribute(3);
				}
				break;
			case 3:
				{
				setState(565);
				indexing();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(574);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AttributeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_attribute);
					setState(568);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(569);
					arithmetic();
					setState(570);
					val();
					}
					} 
				}
				setState(576);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ValContext extends ParserRuleContext {
		public TerminalNode VALUE() { return getToken(ViewParser.VALUE, 0); }
		public TerminalNode NAME() { return getToken(ViewParser.NAME, 0); }
		public TerminalNode CONSTANTS() { return getToken(ViewParser.CONSTANTS, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitVal(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (CONSTANTS - 62)) | (1L << (VALUE - 62)) | (1L << (NAME - 62)))) != 0)) ) {
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

	public static class IndexingContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(ViewParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ViewParser.NAME, i);
		}
		public TerminalNode VALUE() { return getToken(ViewParser.VALUE, 0); }
		public IndexingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterIndexing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitIndexing(this);
		}
	}

	public final IndexingContext indexing() throws RecognitionException {
		IndexingContext _localctx = new IndexingContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_indexing);
		try {
			setState(587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				match(NAME);
				setState(580);
				match(T__9);
				setState(581);
				match(VALUE);
				setState(582);
				match(T__14);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
				match(NAME);
				setState(584);
				match(T__9);
				setState(585);
				match(NAME);
				setState(586);
				match(T__14);
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

	public static class SetattrContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public SetattrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setattr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterSetattr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitSetattr(this);
		}
	}

	public final SetattrContext setattr() throws RecognitionException {
		SetattrContext _localctx = new SetattrContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_setattr);
		try {
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				attribute(0);
				setState(590);
				match(T__25);
				setState(591);
				attribute(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(593);
				attribute(0);
				setState(594);
				match(T__25);
				setState(595);
				val();
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

	public static class ArithmeticContext extends ParserRuleContext {
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitArithmetic(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__47) | (1L << T__48) | (1L << T__49))) != 0)) ) {
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

	public static class InsertionContext extends ParserRuleContext {
		public InsertionVarContext insertionVar() {
			return getRuleContext(InsertionVarContext.class,0);
		}
		public List<InsertionContext> insertion() {
			return getRuleContexts(InsertionContext.class);
		}
		public InsertionContext insertion(int i) {
			return getRuleContext(InsertionContext.class,i);
		}
		public InsertrelationContext insertrelation() {
			return getRuleContext(InsertrelationContext.class,0);
		}
		public InsertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterInsertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitInsertion(this);
		}
	}

	public final InsertionContext insertion() throws RecognitionException {
		return insertion(0);
	}

	private InsertionContext insertion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InsertionContext _localctx = new InsertionContext(_ctx, _parentState);
		InsertionContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_insertion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(602);
			insertionVar();
			}
			_ctx.stop = _input.LT(-1);
			setState(612);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InsertionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_insertion);
					setState(604);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(605);
					match(T__32);
					setState(606);
					insertrelation();
					setState(607);
					match(T__33);
					setState(608);
					insertion(2);
					}
					} 
				}
				setState(614);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InsertrelationContext extends ParserRuleContext {
		public RelationValueContext relationValue() {
			return getRuleContext(RelationValueContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InsertrelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertrelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterInsertrelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitInsertrelation(this);
		}
	}

	public final InsertrelationContext insertrelation() throws RecognitionException {
		InsertrelationContext _localctx = new InsertrelationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_insertrelation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(615);
				relationValue();
				}
			}

			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(618);
				match(T__38);
				setState(619);
				type();
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

	public static class InsertionVarContext extends ParserRuleContext {
		public NodeNameContext nodeName() {
			return getRuleContext(NodeNameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InsertAttributesContext insertAttributes() {
			return getRuleContext(InsertAttributesContext.class,0);
		}
		public InsertionVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertionVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterInsertionVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitInsertionVar(this);
		}
	}

	public final InsertionVarContext insertionVar() throws RecognitionException {
		InsertionVarContext _localctx = new InsertionVarContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_insertionVar);
		int _la;
		try {
			setState(644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(622);
				match(T__11);
				setState(623);
				nodeName();
				setState(624);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(626);
				match(T__11);
				setState(627);
				nodeName();
				setState(628);
				match(T__38);
				setState(629);
				type();
				setState(630);
				match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(632);
				match(T__11);
				setState(633);
				nodeName();
				setState(634);
				match(T__38);
				setState(635);
				type();
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__50) {
					{
					setState(636);
					match(T__50);
					setState(637);
					insertAttributes();
					setState(638);
					match(T__51);
					}
				}

				setState(642);
				match(T__12);
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

	public static class InsertAttributesContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ViewParser.NAME, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public List<InsertAttributesContext> insertAttributes() {
			return getRuleContexts(InsertAttributesContext.class);
		}
		public InsertAttributesContext insertAttributes(int i) {
			return getRuleContext(InsertAttributesContext.class,i);
		}
		public InsertAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterInsertAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitInsertAttributes(this);
		}
	}

	public final InsertAttributesContext insertAttributes() throws RecognitionException {
		InsertAttributesContext _localctx = new InsertAttributesContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_insertAttributes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(NAME);
			setState(647);
			match(T__38);
			setState(648);
			val();
			setState(653);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(649);
					match(T__8);
					setState(650);
					insertAttributes();
					}
					} 
				}
				setState(655);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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

	public static class AsContext extends ParserRuleContext {
		public AsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterAs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitAs(this);
		}
	}

	public final AsContext as() throws RecognitionException {
		AsContext _localctx = new AsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_as);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			_la = _input.LA(1);
			if ( !(_la==T__52 || _la==T__53) ) {
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

	public static class ExistsContext extends ParserRuleContext {
		public ExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ViewListener ) ((ViewListener)listener).exitExists(this);
		}
	}

	public final ExistsContext exists() throws RecognitionException {
		ExistsContext _localctx = new ExistsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_exists);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			_la = _input.LA(1);
			if ( !(_la==T__54 || _la==T__55) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return validVal_sempred((ValidValContext)_localctx, predIndex);
		case 16:
			return viewatom_sempred((ViewatomContext)_localctx, predIndex);
		case 29:
			return boolexpr_sempred((BoolexprContext)_localctx, predIndex);
		case 30:
			return attribute_sempred((AttributeContext)_localctx, predIndex);
		case 35:
			return insertion_sempred((InsertionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean validVal_sempred(ValidValContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean viewatom_sempred(ViewatomContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		}
		return true;
	}
	private boolean boolexpr_sempred(BoolexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean attribute_sempred(AttributeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean insertion_sempred(InsertionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3D\u0297\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2b\n\2\3\3\3\3\3\3\5\3"+
		"g\n\3\3\4\3\4\3\4\3\4\5\4m\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4u\n\4\3\4\3"+
		"\4\5\4y\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0095\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a0\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00c4\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u00dc\n\t\3\t\3\t\3\t\3\t\7\t\u00e2\n\t\f\t\16\t\u00e5\13\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u00fd\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u011f\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u012d\n\17\3\20"+
		"\3\20\3\20\5\20\u0132\n\20\3\21\7\21\u0135\n\21\f\21\16\21\u0138\13\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u016c\n\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u019e\n\22\f\22\16\22\u01a1\13\22\3\23\3\23\3\23"+
		"\3\23\7\23\u01a7\n\23\f\23\16\23\u01aa\13\23\3\24\3\24\3\24\3\24\5\24"+
		"\u01b0\n\24\3\25\3\25\5\25\u01b4\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\5\26\u01c1\n\26\3\27\3\27\3\30\3\30\3\31\5\31"+
		"\u01c8\n\31\3\31\3\31\5\31\u01cc\n\31\3\31\3\31\7\31\u01d0\n\31\f\31\16"+
		"\31\u01d3\13\31\3\31\5\31\u01d6\n\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01e6\n\33\3\34\3\34\3\34\7\34"+
		"\u01eb\n\34\f\34\16\34\u01ee\13\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\5\36\u01f7\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u0212\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u0221\n\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0229\n"+
		"\37\f\37\16\37\u022c\13\37\3 \3 \3 \3 \5 \u0232\n \3 \3 \3 \3 \3 \5 \u0239"+
		"\n \3 \3 \3 \3 \7 \u023f\n \f \16 \u0242\13 \3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\5\"\u024e\n\"\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0258\n#\3$\3$\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u0265\n%\f%\16%\u0268\13%\3&\5&\u026b\n&"+
		"\3&\3&\5&\u026f\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\5\'\u0283\n\'\3\'\3\'\5\'\u0287\n\'\3(\3(\3(\3(\3"+
		"(\7(\u028e\n(\f(\16(\u0291\13(\3)\3)\3*\3*\3*\2\7\20\"<>H+\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\b\3\2"+
		"\27\30\3\2\31\32\3\2@B\4\2((\62\64\3\2\678\3\29:\2\u02cc\2a\3\2\2\2\4"+
		"f\3\2\2\2\6x\3\2\2\2\b\u0094\3\2\2\2\n\u009f\3\2\2\2\f\u00c3\3\2\2\2\16"+
		"\u00c5\3\2\2\2\20\u00db\3\2\2\2\22\u00e6\3\2\2\2\24\u00ee\3\2\2\2\26\u00f0"+
		"\3\2\2\2\30\u00fc\3\2\2\2\32\u011e\3\2\2\2\34\u012c\3\2\2\2\36\u0131\3"+
		"\2\2\2 \u0136\3\2\2\2\"\u016b\3\2\2\2$\u01a2\3\2\2\2&\u01af\3\2\2\2(\u01b3"+
		"\3\2\2\2*\u01c0\3\2\2\2,\u01c2\3\2\2\2.\u01c4\3\2\2\2\60\u01c7\3\2\2\2"+
		"\62\u01d7\3\2\2\2\64\u01e5\3\2\2\2\66\u01e7\3\2\2\28\u01ef\3\2\2\2:\u01f6"+
		"\3\2\2\2<\u0220\3\2\2\2>\u0238\3\2\2\2@\u0243\3\2\2\2B\u024d\3\2\2\2D"+
		"\u0257\3\2\2\2F\u0259\3\2\2\2H\u025b\3\2\2\2J\u026a\3\2\2\2L\u0286\3\2"+
		"\2\2N\u0288\3\2\2\2P\u0292\3\2\2\2R\u0294\3\2\2\2TU\7=\2\2UV\7B\2\2VW"+
		"\5\36\20\2WX\5\4\3\2XY\5\6\4\2Yb\3\2\2\2Z[\7\3\2\2[b\5\6\4\2\\b\5\b\5"+
		"\2]^\5\36\20\2^_\5\4\3\2_`\5\6\4\2`b\3\2\2\2aT\3\2\2\2aZ\3\2\2\2a\\\3"+
		"\2\2\2a]\3\2\2\2b\3\3\2\2\2cg\7\4\2\2dg\7\5\2\2eg\3\2\2\2fc\3\2\2\2fd"+
		"\3\2\2\2fe\3\2\2\2g\5\3\2\2\2hi\7;\2\2ij\5(\25\2jl\5:\36\2km\5\n\6\2l"+
		"k\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\5$\23\2oy\3\2\2\2pq\7;\2\2qr\5\66\34\2"+
		"rt\5:\36\2su\5\n\6\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\5$\23\2wy\3\2\2\2"+
		"xh\3\2\2\2xp\3\2\2\2y\7\3\2\2\2z{\7;\2\2{|\5(\25\2|}\5:\36\2}~\7\6\2\2"+
		"~\177\5D#\2\177\u0095\3\2\2\2\u0080\u0081\7;\2\2\u0081\u0082\5(\25\2\u0082"+
		"\u0083\5:\36\2\u0083\u0084\7\7\2\2\u0084\u0085\7B\2\2\u0085\u0095\3\2"+
		"\2\2\u0086\u0087\7;\2\2\u0087\u0088\5(\25\2\u0088\u0089\5:\36\2\u0089"+
		"\u008a\7\b\2\2\u008a\u008b\5> \2\u008b\u0095\3\2\2\2\u008c\u008d\7;\2"+
		"\2\u008d\u008e\5(\25\2\u008e\u008f\5:\36\2\u008f\u0090\7\t\2\2\u0090\u0091"+
		"\5H%\2\u0091\u0095\3\2\2\2\u0092\u0093\7\t\2\2\u0093\u0095\5H%\2\u0094"+
		"z\3\2\2\2\u0094\u0080\3\2\2\2\u0094\u0086\3\2\2\2\u0094\u008c\3\2\2\2"+
		"\u0094\u0092\3\2\2\2\u0095\t\3\2\2\2\u0096\u0097\7\n\2\2\u0097\u0098\5"+
		"\f\7\2\u0098\u0099\5\30\r\2\u0099\u00a0\3\2\2\2\u009a\u009b\7\n\2\2\u009b"+
		"\u009c\5\f\7\2\u009c\u009d\5\30\r\2\u009d\u009e\5\n\6\2\u009e\u00a0\3"+
		"\2\2\2\u009f\u0096\3\2\2\2\u009f\u009a\3\2\2\2\u00a0\13\3\2\2\2\u00a1"+
		"\u00a2\7B\2\2\u00a2\u00a3\5P)\2\u00a3\u00a4\7B\2\2\u00a4\u00a5\7\13\2"+
		"\2\u00a5\u00a6\5\f\7\2\u00a6\u00c4\3\2\2\2\u00a7\u00a8\5\34\17\2\u00a8"+
		"\u00a9\5P)\2\u00a9\u00aa\7B\2\2\u00aa\u00ab\7\13\2\2\u00ab\u00ac\5\f\7"+
		"\2\u00ac\u00c4\3\2\2\2\u00ad\u00ae\7B\2\2\u00ae\u00af\7\13\2\2\u00af\u00c4"+
		"\5\f\7\2\u00b0\u00b1\7B\2\2\u00b1\u00b2\5P)\2\u00b2\u00b3\7B\2\2\u00b3"+
		"\u00c4\3\2\2\2\u00b4\u00b5\5\34\17\2\u00b5\u00b6\5P)\2\u00b6\u00b7\7B"+
		"\2\2\u00b7\u00c4\3\2\2\2\u00b8\u00c4\7B\2\2\u00b9\u00ba\5\16\b\2\u00ba"+
		"\u00bb\5P)\2\u00bb\u00bc\7B\2\2\u00bc\u00bd\7\13\2\2\u00bd\u00be\5\f\7"+
		"\2\u00be\u00c4\3\2\2\2\u00bf\u00c0\5\16\b\2\u00c0\u00c1\5P)\2\u00c1\u00c2"+
		"\7B\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00a1\3\2\2\2\u00c3\u00a7\3\2\2\2\u00c3"+
		"\u00ad\3\2\2\2\u00c3\u00b0\3\2\2\2\u00c3\u00b4\3\2\2\2\u00c3\u00b8\3\2"+
		"\2\2\u00c3\u00b9\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c4\r\3\2\2\2\u00c5\u00c6"+
		"\7\f\2\2\u00c6\u00c7\7B\2\2\u00c7\u00c8\7\r\2\2\u00c8\u00c9\5\26\f\2\u00c9"+
		"\u00ca\7\16\2\2\u00ca\u00cb\5\20\t\2\u00cb\u00cc\7\13\2\2\u00cc\u00cd"+
		"\5\20\t\2\u00cd\u00ce\7\17\2\2\u00ce\u00cf\7\20\2\2\u00cf\u00d0\5\22\n"+
		"\2\u00d0\u00d1\7\21\2\2\u00d1\17\3\2\2\2\u00d2\u00d3\b\t\1\2\u00d3\u00d4"+
		"\5\24\13\2\u00d4\u00d5\7\16\2\2\u00d5\u00d6\7B\2\2\u00d6\u00d7\7\17\2"+
		"\2\u00d7\u00dc\3\2\2\2\u00d8\u00dc\7A\2\2\u00d9\u00dc\7\22\2\2\u00da\u00dc"+
		"\5B\"\2\u00db\u00d2\3\2\2\2\u00db\u00d8\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00da\3\2\2\2\u00dc\u00e3\3\2\2\2\u00dd\u00de\f\6\2\2\u00de\u00df\5F"+
		"$\2\u00df\u00e0\5\20\t\7\u00e0\u00e2\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e2"+
		"\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\21\3\2\2"+
		"\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\7\23\2\2\u00e7\u00e8\5\32\16\2\u00e8"+
		"\u00e9\7\24\2\2\u00e9\u00ea\5\20\t\2\u00ea\u00eb\7\25\2\2\u00eb\u00ec"+
		"\5\20\t\2\u00ec\u00ed\7\26\2\2\u00ed\23\3\2\2\2\u00ee\u00ef\t\2\2\2\u00ef"+
		"\25\3\2\2\2\u00f0\u00f1\t\3\2\2\u00f1\27\3\2\2\2\u00f2\u00f3\7\33\2\2"+
		"\u00f3\u00fd\5\32\16\2\u00f4\u00f5\7;\2\2\u00f5\u00f6\5(\25\2\u00f6\u00f7"+
		"\5:\36\2\u00f7\u00fd\3\2\2\2\u00f8\u00f9\7;\2\2\u00f9\u00fa\58\35\2\u00fa"+
		"\u00fb\5:\36\2\u00fb\u00fd\3\2\2\2\u00fc\u00f2\3\2\2\2\u00fc\u00f4\3\2"+
		"\2\2\u00fc\u00f8\3\2\2\2\u00fd\31\3\2\2\2\u00fe\u00ff\5> \2\u00ff\u0100"+
		"\7>\2\2\u0100\u0101\5> \2\u0101\u011f\3\2\2\2\u0102\u0103\5> \2\u0103"+
		"\u0104\7>\2\2\u0104\u0105\5@!\2\u0105\u011f\3\2\2\2\u0106\u0107\5> \2"+
		"\u0107\u0108\7\34\2\2\u0108\u0109\5> \2\u0109\u011f\3\2\2\2\u010a\u010b"+
		"\5> \2\u010b\u010c\7\34\2\2\u010c\u010d\5@!\2\u010d\u011f\3\2\2\2\u010e"+
		"\u010f\5\34\17\2\u010f\u0110\7>\2\2\u0110\u0111\5> \2\u0111\u011f\3\2"+
		"\2\2\u0112\u0113\5\34\17\2\u0113\u0114\7>\2\2\u0114\u0115\5@!\2\u0115"+
		"\u011f\3\2\2\2\u0116\u0117\5\34\17\2\u0117\u0118\7\34\2\2\u0118\u0119"+
		"\5> \2\u0119\u011f\3\2\2\2\u011a\u011b\5\34\17\2\u011b\u011c\7\34\2\2"+
		"\u011c\u011d\5@!\2\u011d\u011f\3\2\2\2\u011e\u00fe\3\2\2\2\u011e\u0102"+
		"\3\2\2\2\u011e\u0106\3\2\2\2\u011e\u010a\3\2\2\2\u011e\u010e\3\2\2\2\u011e"+
		"\u0112\3\2\2\2\u011e\u0116\3\2\2\2\u011e\u011a\3\2\2\2\u011f\33\3\2\2"+
		"\2\u0120\u0121\7\35\2\2\u0121\u0122\7B\2\2\u0122\u012d\7\17\2\2\u0123"+
		"\u0124\7\36\2\2\u0124\u012d\7B\2\2\u0125\u0126\7\37\2\2\u0126\u0127\7"+
		"B\2\2\u0127\u012d\7\17\2\2\u0128\u012d\7 \2\2\u0129\u012a\7!\2\2\u012a"+
		"\u012b\7B\2\2\u012b\u012d\7\17\2\2\u012c\u0120\3\2\2\2\u012c\u0123\3\2"+
		"\2\2\u012c\u0125\3\2\2\2\u012c\u0128\3\2\2\2\u012c\u0129\3\2\2\2\u012d"+
		"\35\3\2\2\2\u012e\u012f\7\"\2\2\u012f\u0132\5 \21\2\u0130\u0132\3\2\2"+
		"\2\u0131\u012e\3\2\2\2\u0131\u0130\3\2\2\2\u0132\37\3\2\2\2\u0133\u0135"+
		"\7B\2\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137!\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\b\22\1\2"+
		"\u013a\u016c\5*\26\2\u013b\u013c\5*\26\2\u013c\u013d\7#\2\2\u013d\u013e"+
		"\5\60\31\2\u013e\u013f\7$\2\2\u013f\u0140\5\"\22\n\u0140\u016c\3\2\2\2"+
		"\u0141\u0142\5*\26\2\u0142\u0143\7#\2\2\u0143\u0144\5\60\31\2\u0144\u0145"+
		"\7%\2\2\u0145\u0146\5\"\22\t\u0146\u016c\3\2\2\2\u0147\u0148\5*\26\2\u0148"+
		"\u0149\7&\2\2\u0149\u014a\5\60\31\2\u014a\u014b\7$\2\2\u014b\u014c\5\""+
		"\22\b\u014c\u016c\3\2\2\2\u014d\u014e\5*\26\2\u014e\u014f\7&\2\2\u014f"+
		"\u0150\5\60\31\2\u0150\u0151\7%\2\2\u0151\u0152\5\"\22\7\u0152\u016c\3"+
		"\2\2\2\u0153\u0154\5*\26\2\u0154\u0155\7#\2\2\u0155\u0156\5\60\31\2\u0156"+
		"\u0157\7$\2\2\u0157\u0158\5*\26\2\u0158\u016c\3\2\2\2\u0159\u015a\5*\26"+
		"\2\u015a\u015b\7#\2\2\u015b\u015c\5\60\31\2\u015c\u015d\7%\2\2\u015d\u015e"+
		"\5*\26\2\u015e\u016c\3\2\2\2\u015f\u0160\5*\26\2\u0160\u0161\7&\2\2\u0161"+
		"\u0162\5\60\31\2\u0162\u0163\7$\2\2\u0163\u0164\5*\26\2\u0164\u016c\3"+
		"\2\2\2\u0165\u0166\5*\26\2\u0166\u0167\7&\2\2\u0167\u0168\5\60\31\2\u0168"+
		"\u0169\7%\2\2\u0169\u016a\5*\26\2\u016a\u016c\3\2\2\2\u016b\u0139\3\2"+
		"\2\2\u016b\u013b\3\2\2\2\u016b\u0141\3\2\2\2\u016b\u0147\3\2\2\2\u016b"+
		"\u014d\3\2\2\2\u016b\u0153\3\2\2\2\u016b\u0159\3\2\2\2\u016b\u015f\3\2"+
		"\2\2\u016b\u0165\3\2\2\2\u016c\u019f\3\2\2\2\u016d\u016e\f\22\2\2\u016e"+
		"\u016f\7#\2\2\u016f\u0170\5\60\31\2\u0170\u0171\7$\2\2\u0171\u0172\5\""+
		"\22\23\u0172\u019e\3\2\2\2\u0173\u0174\f\21\2\2\u0174\u0175\7#\2\2\u0175"+
		"\u0176\5\60\31\2\u0176\u0177\7%\2\2\u0177\u0178\5\"\22\22\u0178\u019e"+
		"\3\2\2\2\u0179\u017a\f\20\2\2\u017a\u017b\7&\2\2\u017b\u017c\5\60\31\2"+
		"\u017c\u017d\7$\2\2\u017d\u017e\5\"\22\21\u017e\u019e\3\2\2\2\u017f\u0180"+
		"\f\17\2\2\u0180\u0181\7&\2\2\u0181\u0182\5\60\31\2\u0182\u0183\7%\2\2"+
		"\u0183\u0184\5\"\22\20\u0184\u019e\3\2\2\2\u0185\u0186\f\16\2\2\u0186"+
		"\u0187\7#\2\2\u0187\u0188\5\60\31\2\u0188\u0189\7$\2\2\u0189\u018a\5*"+
		"\26\2\u018a\u019e\3\2\2\2\u018b\u018c\f\r\2\2\u018c\u018d\7#\2\2\u018d"+
		"\u018e\5\60\31\2\u018e\u018f\7%\2\2\u018f\u0190\5*\26\2\u0190\u019e\3"+
		"\2\2\2\u0191\u0192\f\f\2\2\u0192\u0193\7&\2\2\u0193\u0194\5\60\31\2\u0194"+
		"\u0195\7$\2\2\u0195\u0196\5*\26\2\u0196\u019e\3\2\2\2\u0197\u0198\f\13"+
		"\2\2\u0198\u0199\7&\2\2\u0199\u019a\5\60\31\2\u019a\u019b\7%\2\2\u019b"+
		"\u019c\5*\26\2\u019c\u019e\3\2\2\2\u019d\u016d\3\2\2\2\u019d\u0173\3\2"+
		"\2\2\u019d\u0179\3\2\2\2\u019d\u017f\3\2\2\2\u019d\u0185\3\2\2\2\u019d"+
		"\u018b\3\2\2\2\u019d\u0191\3\2\2\2\u019d\u0197\3\2\2\2\u019e\u01a1\3\2"+
		"\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0#\3\2\2\2\u01a1\u019f"+
		"\3\2\2\2\u01a2\u01a3\7<\2\2\u01a3\u01a8\5&\24\2\u01a4\u01a5\7\13\2\2\u01a5"+
		"\u01a7\5&\24\2\u01a6\u01a4\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2"+
		"\2\2\u01a8\u01a9\3\2\2\2\u01a9%\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac"+
		"\7\'\2\2\u01ac\u01ad\7B\2\2\u01ad\u01b0\7\17\2\2\u01ae\u01b0\5> \2\u01af"+
		"\u01ab\3\2\2\2\u01af\u01ae\3\2\2\2\u01b0\'\3\2\2\2\u01b1\u01b4\5\"\22"+
		"\2\u01b2\u01b4\7(\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b4)\3"+
		"\2\2\2\u01b5\u01b6\7\16\2\2\u01b6\u01b7\5.\30\2\u01b7\u01b8\7\17\2\2\u01b8"+
		"\u01c1\3\2\2\2\u01b9\u01ba\7\16\2\2\u01ba\u01bb\5.\30\2\u01bb\u01bc\7"+
		")\2\2\u01bc\u01bd\5,\27\2\u01bd\u01be\7\17\2\2\u01be\u01c1\3\2\2\2\u01bf"+
		"\u01c1\7*\2\2\u01c0\u01b5\3\2\2\2\u01c0\u01b9\3\2\2\2\u01c0\u01bf\3\2"+
		"\2\2\u01c1+\3\2\2\2\u01c2\u01c3\7B\2\2\u01c3-\3\2\2\2\u01c4\u01c5\7B\2"+
		"\2\u01c5/\3\2\2\2\u01c6\u01c8\5\62\32\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8"+
		"\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01ca\7)\2\2\u01ca\u01cc\5,\27\2\u01cb"+
		"\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01d1\3\2\2\2\u01cd\u01ce\7\20"+
		"\2\2\u01ce\u01d0\5,\27\2\u01cf\u01cd\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1"+
		"\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2"+
		"\2\2\u01d4\u01d6\5\64\33\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6"+
		"\61\3\2\2\2\u01d7\u01d8\7B\2\2\u01d8\63\3\2\2\2\u01d9\u01e6\7(\2\2\u01da"+
		"\u01db\7(\2\2\u01db\u01e6\7A\2\2\u01dc\u01dd\7(\2\2\u01dd\u01de\7A\2\2"+
		"\u01de\u01df\7+\2\2\u01df\u01e6\7A\2\2\u01e0\u01e1\7,\2\2\u01e1\u01e6"+
		"\7A\2\2\u01e2\u01e3\7(\2\2\u01e3\u01e4\7A\2\2\u01e4\u01e6\7+\2\2\u01e5"+
		"\u01d9\3\2\2\2\u01e5\u01da\3\2\2\2\u01e5\u01dc\3\2\2\2\u01e5\u01e0\3\2"+
		"\2\2\u01e5\u01e2\3\2\2\2\u01e6\65\3\2\2\2\u01e7\u01ec\58\35\2\u01e8\u01e9"+
		"\7\13\2\2\u01e9\u01eb\58\35\2\u01ea\u01e8\3\2\2\2\u01eb\u01ee\3\2\2\2"+
		"\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\67\3\2\2\2\u01ee\u01ec"+
		"\3\2\2\2\u01ef\u01f0\7B\2\2\u01f0\u01f1\7\34\2\2\u01f1\u01f2\5(\25\2\u01f2"+
		"9\3\2\2\2\u01f3\u01f4\7\33\2\2\u01f4\u01f7\5<\37\2\u01f5\u01f7\3\2\2\2"+
		"\u01f6\u01f3\3\2\2\2\u01f6\u01f5\3\2\2\2\u01f7;\3\2\2\2\u01f8\u01f9\b"+
		"\37\1\2\u01f9\u01fa\5> \2\u01fa\u01fb\7>\2\2\u01fb\u01fc\5> \2\u01fc\u0221"+
		"\3\2\2\2\u01fd\u01fe\5> \2\u01fe\u01ff\7>\2\2\u01ff\u0200\5@!\2\u0200"+
		"\u0221\3\2\2\2\u0201\u0202\5> \2\u0202\u0203\7\34\2\2\u0203\u0204\5> "+
		"\2\u0204\u0221\3\2\2\2\u0205\u0206\5> \2\u0206\u0207\7\34\2\2\u0207\u0208"+
		"\5@!\2\u0208\u0221\3\2\2\2\u0209\u020a\7A\2\2\u020a\u020b\7?\2\2\u020b"+
		"\u0221\5> \2\u020c\u020d\7B\2\2\u020d\u020e\7\r\2\2\u020e\u0211\7B\2\2"+
		"\u020f\u0210\7/\2\2\u0210\u0212\7B\2\2\u0211\u020f\3\2\2\2\u0211\u0212"+
		"\3\2\2\2\u0212\u0221\3\2\2\2\u0213\u0214\7\16\2\2\u0214\u0215\5<\37\2"+
		"\u0215\u0216\7\17\2\2\u0216\u0221\3\2\2\2\u0217\u0218\7\60\2\2\u0218\u0221"+
		"\5<\37\5\u0219\u021a\7\61\2\2\u021a\u0221\5<\37\4\u021b\u021c\5R*\2\u021c"+
		"\u021d\7\16\2\2\u021d\u021e\5> \2\u021e\u021f\7\17\2\2\u021f\u0221\3\2"+
		"\2\2\u0220\u01f8\3\2\2\2\u0220\u01fd\3\2\2\2\u0220\u0201\3\2\2\2\u0220"+
		"\u0205\3\2\2\2\u0220\u0209\3\2\2\2\u0220\u020c\3\2\2\2\u0220\u0213\3\2"+
		"\2\2\u0220\u0217\3\2\2\2\u0220\u0219\3\2\2\2\u0220\u021b\3\2\2\2\u0221"+
		"\u022a\3\2\2\2\u0222\u0223\f\n\2\2\u0223\u0224\7-\2\2\u0224\u0229\5<\37"+
		"\13\u0225\u0226\f\t\2\2\u0226\u0227\7.\2\2\u0227\u0229\5<\37\n\u0228\u0222"+
		"\3\2\2\2\u0228\u0225\3\2\2\2\u0229\u022c\3\2\2\2\u022a\u0228\3\2\2\2\u022a"+
		"\u022b\3\2\2\2\u022b=\3\2\2\2\u022c\u022a\3\2\2\2\u022d\u022e\b \1\2\u022e"+
		"\u0231\7B\2\2\u022f\u0230\7/\2\2\u0230\u0232\7B\2\2\u0231\u022f\3\2\2"+
		"\2\u0231\u0232\3\2\2\2\u0232\u0239\3\2\2\2\u0233\u0234\5@!\2\u0234\u0235"+
		"\5F$\2\u0235\u0236\5> \5\u0236\u0239\3\2\2\2\u0237\u0239\5B\"\2\u0238"+
		"\u022d\3\2\2\2\u0238\u0233\3\2\2\2\u0238\u0237\3\2\2\2\u0239\u0240\3\2"+
		"\2\2\u023a\u023b\f\4\2\2\u023b\u023c\5F$\2\u023c\u023d\5@!\2\u023d\u023f"+
		"\3\2\2\2\u023e\u023a\3\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0240"+
		"\u0241\3\2\2\2\u0241?\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0244\t\4\2\2"+
		"\u0244A\3\2\2\2\u0245\u0246\7B\2\2\u0246\u0247\7\f\2\2\u0247\u0248\7A"+
		"\2\2\u0248\u024e\7\21\2\2\u0249\u024a\7B\2\2\u024a\u024b\7\f\2\2\u024b"+
		"\u024c\7B\2\2\u024c\u024e\7\21\2\2\u024d\u0245\3\2\2\2\u024d\u0249\3\2"+
		"\2\2\u024eC\3\2\2\2\u024f\u0250\5> \2\u0250\u0251\7\34\2\2\u0251\u0252"+
		"\5> \2\u0252\u0258\3\2\2\2\u0253\u0254\5> \2\u0254\u0255\7\34\2\2\u0255"+
		"\u0256\5@!\2\u0256\u0258\3\2\2\2\u0257\u024f\3\2\2\2\u0257\u0253\3\2\2"+
		"\2\u0258E\3\2\2\2\u0259\u025a\t\5\2\2\u025aG\3\2\2\2\u025b\u025c\b%\1"+
		"\2\u025c\u025d\5L\'\2\u025d\u0266\3\2\2\2\u025e\u025f\f\3\2\2\u025f\u0260"+
		"\7#\2\2\u0260\u0261\5J&\2\u0261\u0262\7$\2\2\u0262\u0263\5H%\4\u0263\u0265"+
		"\3\2\2\2\u0264\u025e\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0266"+
		"\u0267\3\2\2\2\u0267I\3\2\2\2\u0268\u0266\3\2\2\2\u0269\u026b\5\62\32"+
		"\2\u026a\u0269\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026d"+
		"\7)\2\2\u026d\u026f\5,\27\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f"+
		"K\3\2\2\2\u0270\u0271\7\16\2\2\u0271\u0272\5.\30\2\u0272\u0273\7\17\2"+
		"\2\u0273\u0287\3\2\2\2\u0274\u0275\7\16\2\2\u0275\u0276\5.\30\2\u0276"+
		"\u0277\7)\2\2\u0277\u0278\5,\27\2\u0278\u0279\7\17\2\2\u0279\u0287\3\2"+
		"\2\2\u027a\u027b\7\16\2\2\u027b\u027c\5.\30\2\u027c\u027d\7)\2\2\u027d"+
		"\u0282\5,\27\2\u027e\u027f\7\65\2\2\u027f\u0280\5N(\2\u0280\u0281\7\66"+
		"\2\2\u0281\u0283\3\2\2\2\u0282\u027e\3\2\2\2\u0282\u0283\3\2\2\2\u0283"+
		"\u0284\3\2\2\2\u0284\u0285\7\17\2\2\u0285\u0287\3\2\2\2\u0286\u0270\3"+
		"\2\2\2\u0286\u0274\3\2\2\2\u0286\u027a\3\2\2\2\u0287M\3\2\2\2\u0288\u0289"+
		"\7B\2\2\u0289\u028a\7)\2\2\u028a\u028f\5@!\2\u028b\u028c\7\13\2\2\u028c"+
		"\u028e\5N(\2\u028d\u028b\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d\3\2\2"+
		"\2\u028f\u0290\3\2\2\2\u0290O\3\2\2\2\u0291\u028f\3\2\2\2\u0292\u0293"+
		"\t\6\2\2\u0293Q\3\2\2\2\u0294\u0295\t\7\2\2\u0295S\3\2\2\2.afltx\u0094"+
		"\u009f\u00c3\u00db\u00e3\u00fc\u011e\u012c\u0131\u0136\u016b\u019d\u019f"+
		"\u01a8\u01af\u01b3\u01c0\u01c7\u01cb\u01d1\u01d5\u01e5\u01ec\u01f6\u0211"+
		"\u0220\u0228\u022a\u0231\u0238\u0240\u024d\u0257\u0266\u026a\u026e\u0282"+
		"\u0286\u028f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}