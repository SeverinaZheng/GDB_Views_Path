// Generated from src/View.g4 by ANTLR 4.8
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ViewLexer extends Lexer {
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
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, KEYWORD=69, RETURN=70, COMMAND=71, COMPARISON=72, 
		OPERATOR=73, CONSTANTS=74, VALUE=75, NAME=76, WHITESPACE=77, ANY=78;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
			"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "T__56", 
			"T__57", "T__58", "T__59", "T__60", "T__61", "T__62", "T__63", "T__64", 
			"T__65", "T__66", "T__67", "KEYWORD", "RETURN", "COMMAND", "COMPARISON", 
			"OPERATOR", "CONSTANTS", "VALUE", "NAME", "WHITESPACE", "ANY"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CG'", "'LOCAL'", "'GLOBAL'", "'SET'", "'DELETE'", "'REMOVE'", 
			"'CREATE'", "'WITH'", "','", "'DISTINCT'", "'CASE WHEN'", "'THEN'", "'ELSE'", 
			"'END'", "'['", "'IN'", "'('", "')'", "'|'", "']'", "'NULL'", "'SIZE'", 
			"'size'", "'RANGE'", "'range'", "'WHERE'", "'='", "'AND'", "'OR'", "'COLLECT('", 
			"'UNWIND'", "'COUNT('", "'COUNT(*)'", "'MAX('", "'toInteger('", "'ID('", 
			"'SUM('", "'DISTINCT('", "'WITH VIEWS'", "'-['", "']-'", "']->'", "'<-['", 
			"'NODES('", "'GRAPH'", "'CONSTRUCT'", "'ORDER BY'", "'DESC'", "'ASC'", 
			"'LIMIT'", "'*'", "':'", "'()'", "'..'", "'*..'", "'.'", "'not'", "'NOT'", 
			"'STARTS WITH'", "'+'", "'-'", "'/'", "'{'", "'}'", "'AS'", "'as'", "'EXISTS'", 
			"'exists'", null, "'RETURN'", "'CREATE VIEW AS'", null, null, null, null, 
			null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
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


	public ViewLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "View.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2P\u02bd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%"+
		"\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3-\3"+
		"-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66"+
		"\3\66\3\66\3\67\3\67\3\67\38\38\38\38\39\39\3:\3:\3:\3:\3;\3;\3;\3;\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3"+
		"B\3B\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3"+
		"F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3"+
		"F\3F\5F\u0212\nF\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3"+
		"H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\5I\u0230\nI\3J\3J\3J\3J\3J\3J\3J\3J\3"+
		"J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3"+
		"J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3"+
		"J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\5J\u027b\nJ\3"+
		"K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u028a\nK\3L\3L\3L\7L\u028f\n"+
		"L\fL\16L\u0292\13L\3L\3L\3L\7L\u0297\nL\fL\16L\u029a\13L\3L\3L\3L\6L\u029f"+
		"\nL\rL\16L\u02a0\3L\3L\3L\6L\u02a6\nL\rL\16L\u02a7\3L\5L\u02ab\nL\3M\6"+
		"M\u02ae\nM\rM\16M\u02af\3M\7M\u02b3\nM\fM\16M\u02b6\13M\3N\3N\3N\3N\3"+
		"O\3O\2\2P\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008b"+
		"G\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\3\2\t"+
		"\4\2>>@@\3\2\62\62\3\2\63;\3\2\62;\b\2\"\"%%\62;C\\aac|\5\2C\\aac|\4\2"+
		"\62;aa\2\u02da\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2"+
		"\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\3\u009f\3\2\2\2\5\u00a2\3\2\2\2\7\u00a8\3\2\2\2\t\u00af\3\2\2\2\13"+
		"\u00b3\3\2\2\2\r\u00ba\3\2\2\2\17\u00c1\3\2\2\2\21\u00c8\3\2\2\2\23\u00cd"+
		"\3\2\2\2\25\u00cf\3\2\2\2\27\u00d8\3\2\2\2\31\u00e2\3\2\2\2\33\u00e7\3"+
		"\2\2\2\35\u00ec\3\2\2\2\37\u00f0\3\2\2\2!\u00f2\3\2\2\2#\u00f5\3\2\2\2"+
		"%\u00f7\3\2\2\2\'\u00f9\3\2\2\2)\u00fb\3\2\2\2+\u00fd\3\2\2\2-\u0102\3"+
		"\2\2\2/\u0107\3\2\2\2\61\u010c\3\2\2\2\63\u0112\3\2\2\2\65\u0118\3\2\2"+
		"\2\67\u011e\3\2\2\29\u0120\3\2\2\2;\u0124\3\2\2\2=\u0127\3\2\2\2?\u0130"+
		"\3\2\2\2A\u0137\3\2\2\2C\u013e\3\2\2\2E\u0147\3\2\2\2G\u014c\3\2\2\2I"+
		"\u0157\3\2\2\2K\u015b\3\2\2\2M\u0160\3\2\2\2O\u016a\3\2\2\2Q\u0175\3\2"+
		"\2\2S\u0178\3\2\2\2U\u017b\3\2\2\2W\u017f\3\2\2\2Y\u0183\3\2\2\2[\u018a"+
		"\3\2\2\2]\u0190\3\2\2\2_\u019a\3\2\2\2a\u01a3\3\2\2\2c\u01a8\3\2\2\2e"+
		"\u01ac\3\2\2\2g\u01b2\3\2\2\2i\u01b4\3\2\2\2k\u01b6\3\2\2\2m\u01b9\3\2"+
		"\2\2o\u01bc\3\2\2\2q\u01c0\3\2\2\2s\u01c2\3\2\2\2u\u01c6\3\2\2\2w\u01ca"+
		"\3\2\2\2y\u01d6\3\2\2\2{\u01d8\3\2\2\2}\u01da\3\2\2\2\177\u01dc\3\2\2"+
		"\2\u0081\u01de\3\2\2\2\u0083\u01e0\3\2\2\2\u0085\u01e3\3\2\2\2\u0087\u01e6"+
		"\3\2\2\2\u0089\u01ed\3\2\2\2\u008b\u0211\3\2\2\2\u008d\u0213\3\2\2\2\u008f"+
		"\u021a\3\2\2\2\u0091\u022f\3\2\2\2\u0093\u027a\3\2\2\2\u0095\u0289\3\2"+
		"\2\2\u0097\u02aa\3\2\2\2\u0099\u02ad\3\2\2\2\u009b\u02b7\3\2\2\2\u009d"+
		"\u02bb\3\2\2\2\u009f\u00a0\7E\2\2\u00a0\u00a1\7I\2\2\u00a1\4\3\2\2\2\u00a2"+
		"\u00a3\7N\2\2\u00a3\u00a4\7Q\2\2\u00a4\u00a5\7E\2\2\u00a5\u00a6\7C\2\2"+
		"\u00a6\u00a7\7N\2\2\u00a7\6\3\2\2\2\u00a8\u00a9\7I\2\2\u00a9\u00aa\7N"+
		"\2\2\u00aa\u00ab\7Q\2\2\u00ab\u00ac\7D\2\2\u00ac\u00ad\7C\2\2\u00ad\u00ae"+
		"\7N\2\2\u00ae\b\3\2\2\2\u00af\u00b0\7U\2\2\u00b0\u00b1\7G\2\2\u00b1\u00b2"+
		"\7V\2\2\u00b2\n\3\2\2\2\u00b3\u00b4\7F\2\2\u00b4\u00b5\7G\2\2\u00b5\u00b6"+
		"\7N\2\2\u00b6\u00b7\7G\2\2\u00b7\u00b8\7V\2\2\u00b8\u00b9\7G\2\2\u00b9"+
		"\f\3\2\2\2\u00ba\u00bb\7T\2\2\u00bb\u00bc\7G\2\2\u00bc\u00bd\7O\2\2\u00bd"+
		"\u00be\7Q\2\2\u00be\u00bf\7X\2\2\u00bf\u00c0\7G\2\2\u00c0\16\3\2\2\2\u00c1"+
		"\u00c2\7E\2\2\u00c2\u00c3\7T\2\2\u00c3\u00c4\7G\2\2\u00c4\u00c5\7C\2\2"+
		"\u00c5\u00c6\7V\2\2\u00c6\u00c7\7G\2\2\u00c7\20\3\2\2\2\u00c8\u00c9\7"+
		"Y\2\2\u00c9\u00ca\7K\2\2\u00ca\u00cb\7V\2\2\u00cb\u00cc\7J\2\2\u00cc\22"+
		"\3\2\2\2\u00cd\u00ce\7.\2\2\u00ce\24\3\2\2\2\u00cf\u00d0\7F\2\2\u00d0"+
		"\u00d1\7K\2\2\u00d1\u00d2\7U\2\2\u00d2\u00d3\7V\2\2\u00d3\u00d4\7K\2\2"+
		"\u00d4\u00d5\7P\2\2\u00d5\u00d6\7E\2\2\u00d6\u00d7\7V\2\2\u00d7\26\3\2"+
		"\2\2\u00d8\u00d9\7E\2\2\u00d9\u00da\7C\2\2\u00da\u00db\7U\2\2\u00db\u00dc"+
		"\7G\2\2\u00dc\u00dd\7\"\2\2\u00dd\u00de\7Y\2\2\u00de\u00df\7J\2\2\u00df"+
		"\u00e0\7G\2\2\u00e0\u00e1\7P\2\2\u00e1\30\3\2\2\2\u00e2\u00e3\7V\2\2\u00e3"+
		"\u00e4\7J\2\2\u00e4\u00e5\7G\2\2\u00e5\u00e6\7P\2\2\u00e6\32\3\2\2\2\u00e7"+
		"\u00e8\7G\2\2\u00e8\u00e9\7N\2\2\u00e9\u00ea\7U\2\2\u00ea\u00eb\7G\2\2"+
		"\u00eb\34\3\2\2\2\u00ec\u00ed\7G\2\2\u00ed\u00ee\7P\2\2\u00ee\u00ef\7"+
		"F\2\2\u00ef\36\3\2\2\2\u00f0\u00f1\7]\2\2\u00f1 \3\2\2\2\u00f2\u00f3\7"+
		"K\2\2\u00f3\u00f4\7P\2\2\u00f4\"\3\2\2\2\u00f5\u00f6\7*\2\2\u00f6$\3\2"+
		"\2\2\u00f7\u00f8\7+\2\2\u00f8&\3\2\2\2\u00f9\u00fa\7~\2\2\u00fa(\3\2\2"+
		"\2\u00fb\u00fc\7_\2\2\u00fc*\3\2\2\2\u00fd\u00fe\7P\2\2\u00fe\u00ff\7"+
		"W\2\2\u00ff\u0100\7N\2\2\u0100\u0101\7N\2\2\u0101,\3\2\2\2\u0102\u0103"+
		"\7U\2\2\u0103\u0104\7K\2\2\u0104\u0105\7\\\2\2\u0105\u0106\7G\2\2\u0106"+
		".\3\2\2\2\u0107\u0108\7u\2\2\u0108\u0109\7k\2\2\u0109\u010a\7|\2\2\u010a"+
		"\u010b\7g\2\2\u010b\60\3\2\2\2\u010c\u010d\7T\2\2\u010d\u010e\7C\2\2\u010e"+
		"\u010f\7P\2\2\u010f\u0110\7I\2\2\u0110\u0111\7G\2\2\u0111\62\3\2\2\2\u0112"+
		"\u0113\7t\2\2\u0113\u0114\7c\2\2\u0114\u0115\7p\2\2\u0115\u0116\7i\2\2"+
		"\u0116\u0117\7g\2\2\u0117\64\3\2\2\2\u0118\u0119\7Y\2\2\u0119\u011a\7"+
		"J\2\2\u011a\u011b\7G\2\2\u011b\u011c\7T\2\2\u011c\u011d\7G\2\2\u011d\66"+
		"\3\2\2\2\u011e\u011f\7?\2\2\u011f8\3\2\2\2\u0120\u0121\7C\2\2\u0121\u0122"+
		"\7P\2\2\u0122\u0123\7F\2\2\u0123:\3\2\2\2\u0124\u0125\7Q\2\2\u0125\u0126"+
		"\7T\2\2\u0126<\3\2\2\2\u0127\u0128\7E\2\2\u0128\u0129\7Q\2\2\u0129\u012a"+
		"\7N\2\2\u012a\u012b\7N\2\2\u012b\u012c\7G\2\2\u012c\u012d\7E\2\2\u012d"+
		"\u012e\7V\2\2\u012e\u012f\7*\2\2\u012f>\3\2\2\2\u0130\u0131\7W\2\2\u0131"+
		"\u0132\7P\2\2\u0132\u0133\7Y\2\2\u0133\u0134\7K\2\2\u0134\u0135\7P\2\2"+
		"\u0135\u0136\7F\2\2\u0136@\3\2\2\2\u0137\u0138\7E\2\2\u0138\u0139\7Q\2"+
		"\2\u0139\u013a\7W\2\2\u013a\u013b\7P\2\2\u013b\u013c\7V\2\2\u013c\u013d"+
		"\7*\2\2\u013dB\3\2\2\2\u013e\u013f\7E\2\2\u013f\u0140\7Q\2\2\u0140\u0141"+
		"\7W\2\2\u0141\u0142\7P\2\2\u0142\u0143\7V\2\2\u0143\u0144\7*\2\2\u0144"+
		"\u0145\7,\2\2\u0145\u0146\7+\2\2\u0146D\3\2\2\2\u0147\u0148\7O\2\2\u0148"+
		"\u0149\7C\2\2\u0149\u014a\7Z\2\2\u014a\u014b\7*\2\2\u014bF\3\2\2\2\u014c"+
		"\u014d\7v\2\2\u014d\u014e\7q\2\2\u014e\u014f\7K\2\2\u014f\u0150\7p\2\2"+
		"\u0150\u0151\7v\2\2\u0151\u0152\7g\2\2\u0152\u0153\7i\2\2\u0153\u0154"+
		"\7g\2\2\u0154\u0155\7t\2\2\u0155\u0156\7*\2\2\u0156H\3\2\2\2\u0157\u0158"+
		"\7K\2\2\u0158\u0159\7F\2\2\u0159\u015a\7*\2\2\u015aJ\3\2\2\2\u015b\u015c"+
		"\7U\2\2\u015c\u015d\7W\2\2\u015d\u015e\7O\2\2\u015e\u015f\7*\2\2\u015f"+
		"L\3\2\2\2\u0160\u0161\7F\2\2\u0161\u0162\7K\2\2\u0162\u0163\7U\2\2\u0163"+
		"\u0164\7V\2\2\u0164\u0165\7K\2\2\u0165\u0166\7P\2\2\u0166\u0167\7E\2\2"+
		"\u0167\u0168\7V\2\2\u0168\u0169\7*\2\2\u0169N\3\2\2\2\u016a\u016b\7Y\2"+
		"\2\u016b\u016c\7K\2\2\u016c\u016d\7V\2\2\u016d\u016e\7J\2\2\u016e\u016f"+
		"\7\"\2\2\u016f\u0170\7X\2\2\u0170\u0171\7K\2\2\u0171\u0172\7G\2\2\u0172"+
		"\u0173\7Y\2\2\u0173\u0174\7U\2\2\u0174P\3\2\2\2\u0175\u0176\7/\2\2\u0176"+
		"\u0177\7]\2\2\u0177R\3\2\2\2\u0178\u0179\7_\2\2\u0179\u017a\7/\2\2\u017a"+
		"T\3\2\2\2\u017b\u017c\7_\2\2\u017c\u017d\7/\2\2\u017d\u017e\7@\2\2\u017e"+
		"V\3\2\2\2\u017f\u0180\7>\2\2\u0180\u0181\7/\2\2\u0181\u0182\7]\2\2\u0182"+
		"X\3\2\2\2\u0183\u0184\7P\2\2\u0184\u0185\7Q\2\2\u0185\u0186\7F\2\2\u0186"+
		"\u0187\7G\2\2\u0187\u0188\7U\2\2\u0188\u0189\7*\2\2\u0189Z\3\2\2\2\u018a"+
		"\u018b\7I\2\2\u018b\u018c\7T\2\2\u018c\u018d\7C\2\2\u018d\u018e\7R\2\2"+
		"\u018e\u018f\7J\2\2\u018f\\\3\2\2\2\u0190\u0191\7E\2\2\u0191\u0192\7Q"+
		"\2\2\u0192\u0193\7P\2\2\u0193\u0194\7U\2\2\u0194\u0195\7V\2\2\u0195\u0196"+
		"\7T\2\2\u0196\u0197\7W\2\2\u0197\u0198\7E\2\2\u0198\u0199\7V\2\2\u0199"+
		"^\3\2\2\2\u019a\u019b\7Q\2\2\u019b\u019c\7T\2\2\u019c\u019d\7F\2\2\u019d"+
		"\u019e\7G\2\2\u019e\u019f\7T\2\2\u019f\u01a0\7\"\2\2\u01a0\u01a1\7D\2"+
		"\2\u01a1\u01a2\7[\2\2\u01a2`\3\2\2\2\u01a3\u01a4\7F\2\2\u01a4\u01a5\7"+
		"G\2\2\u01a5\u01a6\7U\2\2\u01a6\u01a7\7E\2\2\u01a7b\3\2\2\2\u01a8\u01a9"+
		"\7C\2\2\u01a9\u01aa\7U\2\2\u01aa\u01ab\7E\2\2\u01abd\3\2\2\2\u01ac\u01ad"+
		"\7N\2\2\u01ad\u01ae\7K\2\2\u01ae\u01af\7O\2\2\u01af\u01b0\7K\2\2\u01b0"+
		"\u01b1\7V\2\2\u01b1f\3\2\2\2\u01b2\u01b3\7,\2\2\u01b3h\3\2\2\2\u01b4\u01b5"+
		"\7<\2\2\u01b5j\3\2\2\2\u01b6\u01b7\7*\2\2\u01b7\u01b8\7+\2\2\u01b8l\3"+
		"\2\2\2\u01b9\u01ba\7\60\2\2\u01ba\u01bb\7\60\2\2\u01bbn\3\2\2\2\u01bc"+
		"\u01bd\7,\2\2\u01bd\u01be\7\60\2\2\u01be\u01bf\7\60\2\2\u01bfp\3\2\2\2"+
		"\u01c0\u01c1\7\60\2\2\u01c1r\3\2\2\2\u01c2\u01c3\7p\2\2\u01c3\u01c4\7"+
		"q\2\2\u01c4\u01c5\7v\2\2\u01c5t\3\2\2\2\u01c6\u01c7\7P\2\2\u01c7\u01c8"+
		"\7Q\2\2\u01c8\u01c9\7V\2\2\u01c9v\3\2\2\2\u01ca\u01cb\7U\2\2\u01cb\u01cc"+
		"\7V\2\2\u01cc\u01cd\7C\2\2\u01cd\u01ce\7T\2\2\u01ce\u01cf\7V\2\2\u01cf"+
		"\u01d0\7U\2\2\u01d0\u01d1\7\"\2\2\u01d1\u01d2\7Y\2\2\u01d2\u01d3\7K\2"+
		"\2\u01d3\u01d4\7V\2\2\u01d4\u01d5\7J\2\2\u01d5x\3\2\2\2\u01d6\u01d7\7"+
		"-\2\2\u01d7z\3\2\2\2\u01d8\u01d9\7/\2\2\u01d9|\3\2\2\2\u01da\u01db\7\61"+
		"\2\2\u01db~\3\2\2\2\u01dc\u01dd\7}\2\2\u01dd\u0080\3\2\2\2\u01de\u01df"+
		"\7\177\2\2\u01df\u0082\3\2\2\2\u01e0\u01e1\7C\2\2\u01e1\u01e2\7U\2\2\u01e2"+
		"\u0084\3\2\2\2\u01e3\u01e4\7c\2\2\u01e4\u01e5\7u\2\2\u01e5\u0086\3\2\2"+
		"\2\u01e6\u01e7\7G\2\2\u01e7\u01e8\7Z\2\2\u01e8\u01e9\7K\2\2\u01e9\u01ea"+
		"\7U\2\2\u01ea\u01eb\7V\2\2\u01eb\u01ec\7U\2\2\u01ec\u0088\3\2\2\2\u01ed"+
		"\u01ee\7g\2\2\u01ee\u01ef\7z\2\2\u01ef\u01f0\7k\2\2\u01f0\u01f1\7u\2\2"+
		"\u01f1\u01f2\7v\2\2\u01f2\u01f3\7u\2\2\u01f3\u008a\3\2\2\2\u01f4\u01f5"+
		"\7O\2\2\u01f5\u01f6\7C\2\2\u01f6\u01f7\7V\2\2\u01f7\u01f8\7E\2\2\u01f8"+
		"\u0212\7J\2\2\u01f9\u01fa\7O\2\2\u01fa\u01fb\7G\2\2\u01fb\u01fc\7T\2\2"+
		"\u01fc\u01fd\7I\2\2\u01fd\u0212\7G\2\2\u01fe\u01ff\7Q\2\2\u01ff\u0200"+
		"\7R\2\2\u0200\u0201\7V\2\2\u0201\u0202\7K\2\2\u0202\u0203\7Q\2\2\u0203"+
		"\u0204\7P\2\2\u0204\u0205\7C\2\2\u0205\u0206\7N\2\2\u0206\u0207\7\"\2"+
		"\2\u0207\u0208\7O\2\2\u0208\u0209\7C\2\2\u0209\u020a\7V\2\2\u020a\u020b"+
		"\7E\2\2\u020b\u0212\7J\2\2\u020c\u020d\7O\2\2\u020d\u020e\7G\2\2\u020e"+
		"\u020f\7T\2\2\u020f\u0210\7I\2\2\u0210\u0212\7G\2\2\u0211\u01f4\3\2\2"+
		"\2\u0211\u01f9\3\2\2\2\u0211\u01fe\3\2\2\2\u0211\u020c\3\2\2\2\u0212\u008c"+
		"\3\2\2\2\u0213\u0214\7T\2\2\u0214\u0215\7G\2\2\u0215\u0216\7V\2\2\u0216"+
		"\u0217\7W\2\2\u0217\u0218\7T\2\2\u0218\u0219\7P\2\2\u0219\u008e\3\2\2"+
		"\2\u021a\u021b\7E\2\2\u021b\u021c\7T\2\2\u021c\u021d\7G\2\2\u021d\u021e"+
		"\7C\2\2\u021e\u021f\7V\2\2\u021f\u0220\7G\2\2\u0220\u0221\7\"\2\2\u0221"+
		"\u0222\7X\2\2\u0222\u0223\7K\2\2\u0223\u0224\7G\2\2\u0224\u0225\7Y\2\2"+
		"\u0225\u0226\7\"\2\2\u0226\u0227\7C\2\2\u0227\u0228\7U\2\2\u0228\u0090"+
		"\3\2\2\2\u0229\u0230\t\2\2\2\u022a\u022b\7@\2\2\u022b\u0230\7?\2\2\u022c"+
		"\u022d\7>\2\2\u022d\u0230\7?\2\2\u022e\u0230\7?\2\2\u022f\u0229\3\2\2"+
		"\2\u022f\u022a\3\2\2\2\u022f\u022c\3\2\2\2\u022f\u022e\3\2\2\2\u0230\u0092"+
		"\3\2\2\2\u0231\u0232\7E\2\2\u0232\u0233\7C\2\2\u0233\u0234\7U\2\2\u0234"+
		"\u027b\7G\2\2\u0235\u0236\7E\2\2\u0236\u0237\7Q\2\2\u0237\u0238\7P\2\2"+
		"\u0238\u0239\7V\2\2\u0239\u023a\7C\2\2\u023a\u023b\7K\2\2\u023b\u023c"+
		"\7P\2\2\u023c\u027b\7U\2\2\u023d\u023e\7G\2\2\u023e\u023f\7N\2\2\u023f"+
		"\u0240\7U\2\2\u0240\u027b\7G\2\2\u0241\u0242\7G\2\2\u0242\u0243\7P\2\2"+
		"\u0243\u027b\7F\2\2\u0244\u0245\7G\2\2\u0245\u0246\7P\2\2\u0246\u0247"+
		"\7F\2\2\u0247\u0248\7U\2\2\u0248\u0249\7\"\2\2\u0249\u024a\7Y\2\2\u024a"+
		"\u024b\7K\2\2\u024b\u024c\7V\2\2\u024c\u027b\7J\2\2\u024d\u024e\7K\2\2"+
		"\u024e\u027b\7P\2\2\u024f\u0250\7K\2\2\u0250\u0251\7U\2\2\u0251\u0252"+
		"\7\"\2\2\u0252\u0253\7P\2\2\u0253\u0254\7Q\2\2\u0254\u0255\7V\2\2\u0255"+
		"\u0256\7\"\2\2\u0256\u0257\7P\2\2\u0257\u0258\7W\2\2\u0258\u0259\7N\2"+
		"\2\u0259\u027b\7N\2\2\u025a\u025b\7K\2\2\u025b\u025c\7U\2\2\u025c\u025d"+
		"\7\"\2\2\u025d\u025e\7P\2\2\u025e\u025f\7W\2\2\u025f\u0260\7N\2\2\u0260"+
		"\u027b\7N\2\2\u0261\u0262\7P\2\2\u0262\u0263\7Q\2\2\u0263\u027b\7V\2\2"+
		"\u0264\u0265\7U\2\2\u0265\u0266\7V\2\2\u0266\u0267\7C\2\2\u0267\u0268"+
		"\7T\2\2\u0268\u0269\7V\2\2\u0269\u026a\7U\2\2\u026a\u026b\7\"\2\2\u026b"+
		"\u026c\7Y\2\2\u026c\u026d\7K\2\2\u026d\u026e\7V\2\2\u026e\u027b\7J\2\2"+
		"\u026f\u0270\7V\2\2\u0270\u0271\7J\2\2\u0271\u0272\7G\2\2\u0272\u027b"+
		"\7P\2\2\u0273\u0274\7Y\2\2\u0274\u0275\7J\2\2\u0275\u0276\7G\2\2\u0276"+
		"\u027b\7P\2\2\u0277\u0278\7Z\2\2\u0278\u0279\7Q\2\2\u0279\u027b\7T\2\2"+
		"\u027a\u0231\3\2\2\2\u027a\u0235\3\2\2\2\u027a\u023d\3\2\2\2\u027a\u0241"+
		"\3\2\2\2\u027a\u0244\3\2\2\2\u027a\u024d\3\2\2\2\u027a\u024f\3\2\2\2\u027a"+
		"\u025a\3\2\2\2\u027a\u0261\3\2\2\2\u027a\u0264\3\2\2\2\u027a\u026f\3\2"+
		"\2\2\u027a\u0273\3\2\2\2\u027a\u0277\3\2\2\2\u027b\u0094\3\2\2\2\u027c"+
		"\u027d\7v\2\2\u027d\u027e\7t\2\2\u027e\u027f\7w\2\2\u027f\u028a\7g\2\2"+
		"\u0280\u0281\7h\2\2\u0281\u0282\7c\2\2\u0282\u0283\7n\2\2\u0283\u0284"+
		"\7u\2\2\u0284\u028a\7g\2\2\u0285\u0286\7p\2\2\u0286\u0287\7w\2\2\u0287"+
		"\u0288\7n\2\2\u0288\u028a\7n\2\2\u0289\u027c\3\2\2\2\u0289\u0280\3\2\2"+
		"\2\u0289\u0285\3\2\2\2\u028a\u0096\3\2\2\2\u028b\u02ab\t\3\2\2\u028c\u0290"+
		"\t\4\2\2\u028d\u028f\t\5\2\2\u028e\u028d\3\2\2\2\u028f\u0292\3\2\2\2\u0290"+
		"\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u02ab\3\2\2\2\u0292\u0290\3\2"+
		"\2\2\u0293\u0294\t\3\2\2\u0294\u0298\7\60\2\2\u0295\u0297\t\5\2\2\u0296"+
		"\u0295\3\2\2\2\u0297\u029a\3\2\2\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2"+
		"\2\2\u0299\u029b\3\2\2\2\u029a\u0298\3\2\2\2\u029b\u02ab\t\4\2\2\u029c"+
		"\u029e\7$\2\2\u029d\u029f\t\6\2\2\u029e\u029d\3\2\2\2\u029f\u02a0\3\2"+
		"\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2"+
		"\u02ab\7$\2\2\u02a3\u02a5\7)\2\2\u02a4\u02a6\t\6\2\2\u02a5\u02a4\3\2\2"+
		"\2\u02a6\u02a7\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9"+
		"\3\2\2\2\u02a9\u02ab\7)\2\2\u02aa\u028b\3\2\2\2\u02aa\u028c\3\2\2\2\u02aa"+
		"\u0293\3\2\2\2\u02aa\u029c\3\2\2\2\u02aa\u02a3\3\2\2\2\u02ab\u0098\3\2"+
		"\2\2\u02ac\u02ae\t\7\2\2\u02ad\u02ac\3\2\2\2\u02ae\u02af\3\2\2\2\u02af"+
		"\u02ad\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b4\3\2\2\2\u02b1\u02b3\t\b"+
		"\2\2\u02b2\u02b1\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b4"+
		"\u02b5\3\2\2\2\u02b5\u009a\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7\u02b8\7\""+
		"\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\bN\2\2\u02ba\u009c\3\2\2\2\u02bb"+
		"\u02bc\13\2\2\2\u02bc\u009e\3\2\2\2\16\2\u0211\u022f\u027a\u0289\u0290"+
		"\u0298\u02a0\u02a7\u02aa\u02af\u02b4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}