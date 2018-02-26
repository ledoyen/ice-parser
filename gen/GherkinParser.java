// Generated from C:/workspaces/github/ice-parser/src/main/antlr4/com/github/ledoyen/ice/parser\Gherkin.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GherkinParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, NL=9, 
		FEATURE_KEYWORD=10, BACKGROUND_KEYWORD=11, SCENARIO_KEYWORD=12, SCENARIO_OUTLINE_KEYWORD=13, 
		STEP_KEYWORD=14, EXAMPLES_KEYWORD=15, SEPARATOR=16, WORD=17, ANY=18, WS=19, 
		LINE_COMMENT=20, SPACE=21;
	public static final int
		RULE_gherkin_document = 0, RULE_feature = 1, RULE_feature_header = 2, 
		RULE_background = 3, RULE_scenario_definition = 4, RULE_scenario = 5, 
		RULE_scenario_outline = 6, RULE_examples_definition = 7, RULE_examples = 8, 
		RULE_examples_table = 9, RULE_document = 10, RULE_step = 11, RULE_step_line = 12, 
		RULE_step_args = 13, RULE_data_table = 14, RULE_doc_string = 15, RULE_language = 16, 
		RULE_tags = 17, RULE_tag_line = 18, RULE_comment = 19, RULE_feature_line = 20, 
		RULE_background_line = 21, RULE_scenario_line = 22, RULE_scenario_outline_line = 23, 
		RULE_examples_line = 24, RULE_description_helper = 25, RULE_description = 26, 
		RULE_table_row = 27, RULE_cell = 28, RULE_cell_value = 29, RULE_line_to_eol = 30;
	public static final String[] ruleNames = {
		"gherkin_document", "feature", "feature_header", "background", "scenario_definition", 
		"scenario", "scenario_outline", "examples_definition", "examples", "examples_table", 
		"document", "step", "step_line", "step_args", "data_table", "doc_string", 
		"language", "tags", "tag_line", "comment", "feature_line", "background_line", 
		"scenario_line", "scenario_outline_line", "examples_line", "description_helper", 
		"description", "table_row", "cell", "cell_value", "line_to_eol"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", "'#'", "'language'", "':'", "'@'", "'\r'", "'\n'", "'|'", 
		null, "'Feature'", "'Background'", "'Scenario'", "'Scenario Outline'", 
		null, "'Examples'", "'''''"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "NL", "FEATURE_KEYWORD", 
		"BACKGROUND_KEYWORD", "SCENARIO_KEYWORD", "SCENARIO_OUTLINE_KEYWORD", 
		"STEP_KEYWORD", "EXAMPLES_KEYWORD", "SEPARATOR", "WORD", "ANY", "WS", 
		"LINE_COMMENT", "SPACE"
	};
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
	public String getGrammarFileName() { return "Gherkin.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GherkinParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Gherkin_documentContext extends ParserRuleContext {
		public FeatureContext feature() {
			return getRuleContext(FeatureContext.class,0);
		}
		public Gherkin_documentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gherkin_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).enterGherkin_document(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).exitGherkin_document(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GherkinVisitor ) return ((GherkinVisitor<? extends T>)visitor).visitGherkin_document(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gherkin_documentContext gherkin_document() throws RecognitionException {
		Gherkin_documentContext _localctx = new Gherkin_documentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_gherkin_document);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			feature();
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

	public static class FeatureContext extends ParserRuleContext {
		public Feature_headerContext feature_header() {
			return getRuleContext(Feature_headerContext.class,0);
		}
		public BackgroundContext background() {
			return getRuleContext(BackgroundContext.class,0);
		}
		public List<Scenario_definitionContext> scenario_definition() {
			return getRuleContexts(Scenario_definitionContext.class);
		}
		public Scenario_definitionContext scenario_definition(int i) {
			return getRuleContext(Scenario_definitionContext.class,i);
		}
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).enterFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).exitFeature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GherkinVisitor ) return ((GherkinVisitor<? extends T>)visitor).visitFeature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_feature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			feature_header();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BACKGROUND_KEYWORD) {
				{
				setState(65);
				background();
				}
			}

			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				scenario_definition();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << SCENARIO_KEYWORD) | (1L << SCENARIO_OUTLINE_KEYWORD))) != 0) );
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

	public static class Feature_headerContext extends ParserRuleContext {
		public Feature_lineContext feature_line() {
			return getRuleContext(Feature_lineContext.class,0);
		}
		public Description_helperContext description_helper() {
			return getRuleContext(Description_helperContext.class,0);
		}
		public LanguageContext language() {
			return getRuleContext(LanguageContext.class,0);
		}
		public TagsContext tags() {
			return getRuleContext(TagsContext.class,0);
		}
		public Feature_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).enterFeature_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).exitFeature_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GherkinVisitor ) return ((GherkinVisitor<? extends T>)visitor).visitFeature_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Feature_headerContext feature_header() throws RecognitionException {
		Feature_headerContext _localctx = new Feature_headerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_feature_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(73);
				language();
				}
			}

			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(76);
				tags();
				}
			}

			setState(79);
			feature_line();
			setState(80);
			description_helper();
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

	public static class BackgroundContext extends ParserRuleContext {
		public Background_lineContext background_line() {
			return getRuleContext(Background_lineContext.class,0);
		}
		public Description_helperContext description_helper() {
			return getRuleContext(Description_helperContext.class,0);
		}
		public List<StepContext> step() {
			return getRuleContexts(StepContext.class);
		}
		public StepContext step(int i) {
			return getRuleContext(StepContext.class,i);
		}
		public BackgroundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_background; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).enterBackground(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).exitBackground(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GherkinVisitor ) return ((GherkinVisitor<? extends T>)visitor).visitBackground(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackgroundContext background() throws RecognitionException {
		BackgroundContext _localctx = new BackgroundContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_background);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			background_line();
			setState(83);
			description_helper();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STEP_KEYWORD || _la==LINE_COMMENT) {
				{
				{
				setState(84);
				step();
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

	public static class Scenario_definitionContext extends ParserRuleContext {
		public ScenarioContext scenario() {
			return getRuleContext(ScenarioContext.class,0);
		}
		public Scenario_outlineContext scenario_outline() {
			return getRuleContext(Scenario_outlineContext.class,0);
		}
		public TagsContext tags() {
			return getRuleContext(TagsContext.class,0);
		}
		public Scenario_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scenario_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).enterScenario_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).exitScenario_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GherkinVisitor ) return ((GherkinVisitor<? extends T>)visitor).visitScenario_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scenario_definitionContext scenario_definition() throws RecognitionException {
		Scenario_definitionContext _localctx = new Scenario_definitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_scenario_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(90);
				tags();
				}
			}

			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCENARIO_KEYWORD:
				{
				setState(93);
				scenario();
				}
				break;
			case SCENARIO_OUTLINE_KEYWORD:
				{
				setState(94);
				scenario_outline();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ScenarioContext extends ParserRuleContext {
		public Scenario_lineContext scenario_line() {
			return getRuleContext(Scenario_lineContext.class,0);
		}
		public Description_helperContext description_helper() {
			return getRuleContext(Description_helperContext.class,0);
		}
		public List<StepContext> step() {
			return getRuleContexts(StepContext.class);
		}
		public StepContext step(int i) {
			return getRuleContext(StepContext.class,i);
		}
		public ScenarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scenario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).enterScenario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).exitScenario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GherkinVisitor ) return ((GherkinVisitor<? extends T>)visitor).visitScenario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScenarioContext scenario() throws RecognitionException {
		ScenarioContext _localctx = new ScenarioContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_scenario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			scenario_line();
			setState(98);
			description_helper();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STEP_KEYWORD || _la==LINE_COMMENT) {
				{
				{
				setState(99);
				step();
				}
				}
				setState(104);
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

	public static class Scenario_outlineContext extends ParserRuleContext {
		public Scenario_outline_lineContext scenario_outline_line() {
			return getRuleContext(Scenario_outline_lineContext.class,0);
		}
		public Description_helperContext description_helper() {
			return getRuleContext(Description_helperContext.class,0);
		}
		public List<StepContext> step() {
			return getRuleContexts(StepContext.class);
		}
		public StepContext step(int i) {
			return getRuleContext(StepContext.class,i);
		}
		public List<Examples_definitionContext> examples_definition() {
			return getRuleContexts(Examples_definitionContext.class);
		}
		public Examples_definitionContext examples_definition(int i) {
			return getRuleContext(Examples_definitionContext.class,i);
		}
		public Scenario_outlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scenario_outline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).enterScenario_outline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).exitScenario_outline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GherkinVisitor ) return ((GherkinVisitor<? extends T>)visitor).visitScenario_outline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scenario_outlineContext scenario_outline() throws RecognitionException {
		Scenario_outlineContext _localctx = new Scenario_outlineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_scenario_outline);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			scenario_outline_line();
			setState(106);
			description_helper();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STEP_KEYWORD || _la==LINE_COMMENT) {
				{
				{
				setState(107);
				step();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(113);
					examples_definition();
					}
					} 
				}
				setState(118);
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
			exitRule();
		}
		return _localctx;
	}

	public static class Examples_definitionContext extends ParserRuleContext {
		public ExamplesContext examples() {
			return getRuleContext(ExamplesContext.class,0);
		}
		public TagsContext tags() {
			return getRuleContext(TagsContext.class,0);
		}
		public Examples_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_examples_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).enterExamples_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).exitExamples_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GherkinVisitor ) return ((GherkinVisitor<? extends T>)visitor).visitExamples_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Examples_definitionContext examples_definition() throws RecognitionException {
		Examples_definitionContext _localctx = new Examples_definitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_examples_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(119);
				tags();
				}
			}

			setState(122);
			examples();
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

	public static class ExamplesContext extends ParserRuleContext {
		public Examples_lineContext examples_line() {
			return getRuleContext(Examples_lineContext.class,0);
		}
		public Description_helperContext description_helper() {
			return getRuleContext(Description_helperContext.class,0);
		}
		public Examples_tableContext examples_table() {
			return getRuleContext(Examples_tableContext.class,0);
		}
		public ExamplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_examples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).enterExamples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).exitExamples(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GherkinVisitor ) return ((GherkinVisitor<? extends T>)visitor).visitExamples(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExamplesContext examples() throws RecognitionException {
		ExamplesContext _localctx = new ExamplesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_examples);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			examples_line();
			setState(125);
			description_helper();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(126);
				examples_table();
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

	public static class Examples_tableContext extends ParserRuleContext {
		public List<Table_rowContext> table_row() {
			return getRuleContexts(Table_rowContext.class);
		}
		public Table_rowContext table_row(int i) {
			return getRuleContext(Table_rowContext.class,i);
		}
		public Examples_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_examples_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).enterExamples_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).exitExamples_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GherkinVisitor ) return ((GherkinVisitor<? extends T>)visitor).visitExamples_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Examples_tableContext examples_table() throws RecognitionException {
		Examples_tableContext _localctx = new Examples_tableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_examples_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			table_row();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(130);
				table_row();
				}
				}
				setState(135);
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

	public static class DocumentContext extends ParserRuleContext {
		public List<StepContext> step() {
			return getRuleContexts(StepContext.class);
		}
		public StepContext step(int i) {
			return getRuleContext(StepContext.class,i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).exitDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GherkinVisitor ) return ((GherkinVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STEP_KEYWORD || _la==LINE_COMMENT) {
				{
				{
				setState(136);
				step();
				}
				}
				setState(141);
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

	public static class StepContext extends ParserRuleContext {
		public Step_lineContext step_line() {
			return getRuleContext(Step_lineContext.class,0);
		}
		public List<TerminalNode> LINE_COMMENT() { return getTokens(GherkinParser.LINE_COMMENT); }
		public TerminalNode LINE_COMMENT(int i) {
			return getToken(GherkinParser.LINE_COMMENT, i);
		}
		public List<TerminalNode> NL() { return getTokens(GherkinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GherkinParser.NL, i);
		}
		public Step_argsContext step_args() {
			return getRuleContext(Step_argsContext.class,0);
		}
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).exitStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GherkinVisitor ) return ((GherkinVisitor<? extends T>)visitor).visitStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_step);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT) {
				{
				{
				setState(142);
				match(LINE_COMMENT);
				setState(143);
				match(NL);
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			step_line();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7 || _la==SEPARATOR) {
				{
				setState(150);
				step_args();
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

	public static class Step_lineContext extends ParserRuleContext {
		public TerminalNode STEP_KEYWORD() { return getToken(GherkinParser.STEP_KEYWORD, 0); }
		public Line_to_eolContext line_to_eol() {
			return getRuleContext(Line_to_eolContext.class,0);
		}
		public TerminalNode NL() { return getToken(GherkinParser.NL, 0); }
		public List<TerminalNode> SPACE() { return getTokens(GherkinParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(GherkinParser.SPACE, i);
		}
		public Step_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).enterStep_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).exitStep_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GherkinVisitor ) return ((GherkinVisitor<? extends T>)visitor).visitStep_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Step_lineContext step_line() throws RecognitionException {
		Step_lineContext _localctx = new Step_lineContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_step_line);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(STEP_KEYWORD);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(154);
					match(SPACE);
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(160);
			line_to_eol();
			setState(161);
			match(NL);
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

	public static class Step_argsContext extends ParserRuleContext {
		public Data_tableContext data_table() {
			return getRuleContext(Data_tableContext.class,0);
		}
		public Doc_stringContext doc_string() {
			return getRuleContext(Doc_stringContext.class,0);
		}
		public Step_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).enterStep_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).exitStep_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GherkinVisitor ) return ((GherkinVisitor<? extends T>)visitor).visitStep_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Step_argsContext step_args() throws RecognitionException {
		Step_argsContext _localctx = new Step_argsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_step_args);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(163);
				data_table();
				}
				break;
			case SEPARATOR:
				{
				setState(164);
				doc_string();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Data_tableContext extends ParserRuleContext {
		public List<Table_rowContext> table_row() {
			return getRuleContexts(Table_rowContext.class);
		}
		public Table_rowContext table_row(int i) {
			return getRuleContext(Table_rowContext.class,i);
		}
		public Data_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).enterData_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).exitData_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GherkinVisitor ) return ((GherkinVisitor<? extends T>)visitor).visitData_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_tableContext data_table() throws RecognitionException {
		Data_tableContext _localctx = new Data_tableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_data_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(167);
				table_row();
				}
				}
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 );
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

	public static class Doc_stringContext extends ParserRuleContext {
		public List<TerminalNode> SEPARATOR() { return getTokens(GherkinParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(GherkinParser.SEPARATOR, i);
		}
		public Doc_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).enterDoc_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).exitDoc_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GherkinVisitor ) return ((GherkinVisitor<? extends T>)visitor).visitDoc_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Doc_stringContext doc_string() throws RecognitionException {
		Doc_stringContext _localctx = new Doc_stringContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_doc_string);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(SEPARATOR);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(173);
					matchWildcard();
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(179);
			match(SEPARATOR);
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

	public static class LanguageContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(GherkinParser.WORD, 0); }
		public TerminalNode NL() { return getToken(GherkinParser.NL, 0); }
		public LanguageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_language; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).enterLanguage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).exitLanguage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GherkinVisitor ) return ((GherkinVisitor<? extends T>)visitor).visitLanguage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LanguageContext language() throws RecognitionException {
		LanguageContext _localctx = new LanguageContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_language);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(181);
				match(T__0);
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			match(T__1);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(188);
				match(T__0);
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			match(T__2);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(195);
				match(T__0);
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			match(T__3);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(202);
				match(T__0);
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
			match(WORD);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(209);
				match(T__0);
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215);
			match(NL);
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

	public static class TagsContext extends ParserRuleContext {
		public List<Tag_lineContext> tag_line() {
			return getRuleContexts(Tag_lineContext.class);
		}
		public Tag_lineContext tag_line(int i) {
			return getRuleContext(Tag_lineContext.class,i);
		}
		public TagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).enterTags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).exitTags(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GherkinVisitor ) return ((GherkinVisitor<? extends T>)visitor).visitTags(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagsContext tags() throws RecognitionException {
		TagsContext _localctx = new TagsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(217);
				tag_line();
				}
				}
				setState(220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
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

	public static class Tag_lineContext extends ParserRuleContext {
		public Line_to_eolContext line_to_eol() {
			return getRuleContext(Line_to_eolContext.class,0);
		}
		public TerminalNode NL() { return getToken(GherkinParser.NL, 0); }
		public Tag_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).enterTag_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).exitTag_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GherkinVisitor ) return ((GherkinVisitor<? extends T>)visitor).visitTag_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tag_lineContext tag_line() throws RecognitionException {
		Tag_lineContext _localctx = new Tag_lineContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tag_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(T__4);
			setState(223);
			line_to_eol();
			setState(224);
			match(NL);
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

	public static class CommentContext extends ParserRuleContext {
		public Line_to_eolContext line_to_eol() {
			return getRuleContext(Line_to_eolContext.class,0);
		}
		public TerminalNode NL() { return getToken(GherkinParser.NL, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GherkinVisitor ) return ((GherkinVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(T__1);
			setState(227);
			line_to_eol();
			setState(228);
			match(NL);
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

	public static class Feature_lineContext extends ParserRuleContext {
		public TerminalNode FEATURE_KEYWORD() { return getToken(GherkinParser.FEATURE_KEYWORD, 0); }
		public Line_to_eolContext line_to_eol() {
			return getRuleContext(Line_to_eolContext.class,0);
		}
		public TerminalNode NL() { return getToken(GherkinParser.NL, 0); }
		public List<TerminalNode> SPACE() { return getTokens(GherkinParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(GherkinParser.SPACE, i);
		}
		public Feature_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).enterFeature_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).exitFeature_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GherkinVisitor ) return ((GherkinVisitor<? extends T>)visitor).visitFeature_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Feature_lineContext feature_line() throws RecognitionException {
		Feature_lineContext _localctx = new Feature_lineContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_feature_line);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(FEATURE_KEYWORD);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(231);
				match(SPACE);
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			match(T__3);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(238);
					match(SPACE);
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(244);
			line_to_eol();
			setState(245);
			match(NL);
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

	public static class Background_lineContext extends ParserRuleContext {
		public TerminalNode BACKGROUND_KEYWORD() { return getToken(GherkinParser.BACKGROUND_KEYWORD, 0); }
		public Line_to_eolContext line_to_eol() {
			return getRuleContext(Line_to_eolContext.class,0);
		}
		public TerminalNode NL() { return getToken(GherkinParser.NL, 0); }
		public List<TerminalNode> SPACE() { return getTokens(GherkinParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(GherkinParser.SPACE, i);
		}
		public Background_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_background_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).enterBackground_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).exitBackground_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GherkinVisitor ) return ((GherkinVisitor<? extends T>)visitor).visitBackground_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Background_lineContext background_line() throws RecognitionException {
		Background_lineContext _localctx = new Background_lineContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_background_line);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(BACKGROUND_KEYWORD);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(248);
				match(SPACE);
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			match(T__3);
			setState(258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(255);
					match(SPACE);
					}
					} 
				}
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(261);
			line_to_eol();
			setState(262);
			match(NL);
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

	public static class Scenario_lineContext extends ParserRuleContext {
		public TerminalNode SCENARIO_KEYWORD() { return getToken(GherkinParser.SCENARIO_KEYWORD, 0); }
		public Line_to_eolContext line_to_eol() {
			return getRuleContext(Line_to_eolContext.class,0);
		}
		public TerminalNode NL() { return getToken(GherkinParser.NL, 0); }
		public List<TerminalNode> SPACE() { return getTokens(GherkinParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(GherkinParser.SPACE, i);
		}
		public Scenario_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scenario_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).enterScenario_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).exitScenario_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GherkinVisitor ) return ((GherkinVisitor<? extends T>)visitor).visitScenario_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scenario_lineContext scenario_line() throws RecognitionException {
		Scenario_lineContext _localctx = new Scenario_lineContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_scenario_line);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(SCENARIO_KEYWORD);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(265);
				match(SPACE);
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
			match(T__3);
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(272);
					match(SPACE);
					}
					} 
				}
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(278);
			line_to_eol();
			setState(279);
			match(NL);
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

	public static class Scenario_outline_lineContext extends ParserRuleContext {
		public TerminalNode SCENARIO_OUTLINE_KEYWORD() { return getToken(GherkinParser.SCENARIO_OUTLINE_KEYWORD, 0); }
		public Line_to_eolContext line_to_eol() {
			return getRuleContext(Line_to_eolContext.class,0);
		}
		public TerminalNode NL() { return getToken(GherkinParser.NL, 0); }
		public List<TerminalNode> SPACE() { return getTokens(GherkinParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(GherkinParser.SPACE, i);
		}
		public Scenario_outline_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scenario_outline_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).enterScenario_outline_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).exitScenario_outline_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GherkinVisitor ) return ((GherkinVisitor<? extends T>)visitor).visitScenario_outline_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scenario_outline_lineContext scenario_outline_line() throws RecognitionException {
		Scenario_outline_lineContext _localctx = new Scenario_outline_lineContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_scenario_outline_line);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(SCENARIO_OUTLINE_KEYWORD);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(282);
				match(SPACE);
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			match(T__3);
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(289);
					match(SPACE);
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(295);
			line_to_eol();
			setState(296);
			match(NL);
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

	public static class Examples_lineContext extends ParserRuleContext {
		public TerminalNode EXAMPLES_KEYWORD() { return getToken(GherkinParser.EXAMPLES_KEYWORD, 0); }
		public Line_to_eolContext line_to_eol() {
			return getRuleContext(Line_to_eolContext.class,0);
		}
		public TerminalNode NL() { return getToken(GherkinParser.NL, 0); }
		public List<TerminalNode> SPACE() { return getTokens(GherkinParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(GherkinParser.SPACE, i);
		}
		public Examples_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_examples_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).enterExamples_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).exitExamples_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GherkinVisitor ) return ((GherkinVisitor<? extends T>)visitor).visitExamples_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Examples_lineContext examples_line() throws RecognitionException {
		Examples_lineContext _localctx = new Examples_lineContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_examples_line);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(EXAMPLES_KEYWORD);
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(299);
				match(SPACE);
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
			match(T__3);
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(306);
					match(SPACE);
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(312);
			line_to_eol();
			setState(313);
			match(NL);
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

	public static class Description_helperContext extends ParserRuleContext {
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public Description_helperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description_helper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).enterDescription_helper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).exitDescription_helper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GherkinVisitor ) return ((GherkinVisitor<? extends T>)visitor).visitDescription_helper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Description_helperContext description_helper() throws RecognitionException {
		Description_helperContext _localctx = new Description_helperContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_description_helper);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(316);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__5) {
						{
						setState(315);
						match(T__5);
						}
					}

					setState(318);
					match(T__6);
					setState(322);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(319);
							match(T__0);
							}
							} 
						}
						setState(324);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
					}
					}
					} 
				}
				setState(329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(330);
				description();
				}
				break;
			}
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(333);
				comment();
				}
				}
				setState(338);
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

	public static class DescriptionContext extends ParserRuleContext {
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).exitDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GherkinVisitor ) return ((GherkinVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_description);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(339);
					matchWildcard();
					}
					} 
				}
				setState(344);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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

	public static class Table_rowContext extends ParserRuleContext {
		public List<CellContext> cell() {
			return getRuleContexts(CellContext.class);
		}
		public CellContext cell(int i) {
			return getRuleContext(CellContext.class,i);
		}
		public Table_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).enterTable_row(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).exitTable_row(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GherkinVisitor ) return ((GherkinVisitor<? extends T>)visitor).visitTable_row(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_rowContext table_row() throws RecognitionException {
		Table_rowContext _localctx = new Table_rowContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_table_row);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(346); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(345);
					cell();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(348); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class CellContext extends ParserRuleContext {
		public Cell_valueContext cell_value() {
			return getRuleContext(Cell_valueContext.class,0);
		}
		public CellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cell; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).enterCell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).exitCell(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GherkinVisitor ) return ((GherkinVisitor<? extends T>)visitor).visitCell(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CellContext cell() throws RecognitionException {
		CellContext _localctx = new CellContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_cell);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(T__7);
			setState(351);
			cell_value();
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

	public static class Cell_valueContext extends ParserRuleContext {
		public Cell_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cell_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).enterCell_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).exitCell_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GherkinVisitor ) return ((GherkinVisitor<? extends T>)visitor).visitCell_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cell_valueContext cell_value() throws RecognitionException {
		Cell_valueContext _localctx = new Cell_valueContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_cell_value);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(354); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(353);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__7) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(356); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Line_to_eolContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(GherkinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GherkinParser.NL, i);
		}
		public Line_to_eolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_to_eol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).enterLine_to_eol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GherkinListener ) ((GherkinListener)listener).exitLine_to_eol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GherkinVisitor ) return ((GherkinVisitor<? extends T>)visitor).visitLine_to_eol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Line_to_eolContext line_to_eol() throws RecognitionException {
		Line_to_eolContext _localctx = new Line_to_eolContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_line_to_eol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << FEATURE_KEYWORD) | (1L << BACKGROUND_KEYWORD) | (1L << SCENARIO_KEYWORD) | (1L << SCENARIO_OUTLINE_KEYWORD) | (1L << STEP_KEYWORD) | (1L << EXAMPLES_KEYWORD) | (1L << SEPARATOR) | (1L << WORD) | (1L << ANY) | (1L << WS) | (1L << LINE_COMMENT) | (1L << SPACE))) != 0)) {
				{
				{
				setState(358);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(363);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u016f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\5\3E\n\3\3\3\6\3H\n\3\r\3\16\3I\3\4\5\4M\n\4\3\4\5\4P\n\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\7\5X\n\5\f\5\16\5[\13\5\3\6\5\6^\n\6\3\6\3\6"+
		"\5\6b\n\6\3\7\3\7\3\7\7\7g\n\7\f\7\16\7j\13\7\3\b\3\b\3\b\7\bo\n\b\f\b"+
		"\16\br\13\b\3\b\7\bu\n\b\f\b\16\bx\13\b\3\t\5\t{\n\t\3\t\3\t\3\n\3\n\3"+
		"\n\5\n\u0082\n\n\3\13\3\13\7\13\u0086\n\13\f\13\16\13\u0089\13\13\3\f"+
		"\7\f\u008c\n\f\f\f\16\f\u008f\13\f\3\r\3\r\7\r\u0093\n\r\f\r\16\r\u0096"+
		"\13\r\3\r\3\r\5\r\u009a\n\r\3\16\3\16\7\16\u009e\n\16\f\16\16\16\u00a1"+
		"\13\16\3\16\3\16\3\16\3\17\3\17\5\17\u00a8\n\17\3\20\6\20\u00ab\n\20\r"+
		"\20\16\20\u00ac\3\21\3\21\7\21\u00b1\n\21\f\21\16\21\u00b4\13\21\3\21"+
		"\3\21\3\22\7\22\u00b9\n\22\f\22\16\22\u00bc\13\22\3\22\3\22\7\22\u00c0"+
		"\n\22\f\22\16\22\u00c3\13\22\3\22\3\22\7\22\u00c7\n\22\f\22\16\22\u00ca"+
		"\13\22\3\22\3\22\7\22\u00ce\n\22\f\22\16\22\u00d1\13\22\3\22\3\22\7\22"+
		"\u00d5\n\22\f\22\16\22\u00d8\13\22\3\22\3\22\3\23\6\23\u00dd\n\23\r\23"+
		"\16\23\u00de\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\7\26\u00eb"+
		"\n\26\f\26\16\26\u00ee\13\26\3\26\3\26\7\26\u00f2\n\26\f\26\16\26\u00f5"+
		"\13\26\3\26\3\26\3\26\3\27\3\27\7\27\u00fc\n\27\f\27\16\27\u00ff\13\27"+
		"\3\27\3\27\7\27\u0103\n\27\f\27\16\27\u0106\13\27\3\27\3\27\3\27\3\30"+
		"\3\30\7\30\u010d\n\30\f\30\16\30\u0110\13\30\3\30\3\30\7\30\u0114\n\30"+
		"\f\30\16\30\u0117\13\30\3\30\3\30\3\30\3\31\3\31\7\31\u011e\n\31\f\31"+
		"\16\31\u0121\13\31\3\31\3\31\7\31\u0125\n\31\f\31\16\31\u0128\13\31\3"+
		"\31\3\31\3\31\3\32\3\32\7\32\u012f\n\32\f\32\16\32\u0132\13\32\3\32\3"+
		"\32\7\32\u0136\n\32\f\32\16\32\u0139\13\32\3\32\3\32\3\32\3\33\5\33\u013f"+
		"\n\33\3\33\3\33\7\33\u0143\n\33\f\33\16\33\u0146\13\33\7\33\u0148\n\33"+
		"\f\33\16\33\u014b\13\33\3\33\5\33\u014e\n\33\3\33\7\33\u0151\n\33\f\33"+
		"\16\33\u0154\13\33\3\34\7\34\u0157\n\34\f\34\16\34\u015a\13\34\3\35\6"+
		"\35\u015d\n\35\r\35\16\35\u015e\3\36\3\36\3\36\3\37\6\37\u0165\n\37\r"+
		"\37\16\37\u0166\3 \7 \u016a\n \f \16 \u016d\13 \3 \3\u00b2\2!\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\4\3\2\n\n\3"+
		"\2\13\13\2\u017c\2@\3\2\2\2\4B\3\2\2\2\6L\3\2\2\2\bT\3\2\2\2\n]\3\2\2"+
		"\2\fc\3\2\2\2\16k\3\2\2\2\20z\3\2\2\2\22~\3\2\2\2\24\u0083\3\2\2\2\26"+
		"\u008d\3\2\2\2\30\u0094\3\2\2\2\32\u009b\3\2\2\2\34\u00a7\3\2\2\2\36\u00aa"+
		"\3\2\2\2 \u00ae\3\2\2\2\"\u00ba\3\2\2\2$\u00dc\3\2\2\2&\u00e0\3\2\2\2"+
		"(\u00e4\3\2\2\2*\u00e8\3\2\2\2,\u00f9\3\2\2\2.\u010a\3\2\2\2\60\u011b"+
		"\3\2\2\2\62\u012c\3\2\2\2\64\u0149\3\2\2\2\66\u0158\3\2\2\28\u015c\3\2"+
		"\2\2:\u0160\3\2\2\2<\u0164\3\2\2\2>\u016b\3\2\2\2@A\5\4\3\2A\3\3\2\2\2"+
		"BD\5\6\4\2CE\5\b\5\2DC\3\2\2\2DE\3\2\2\2EG\3\2\2\2FH\5\n\6\2GF\3\2\2\2"+
		"HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\5\3\2\2\2KM\5\"\22\2LK\3\2\2\2LM\3\2\2"+
		"\2MO\3\2\2\2NP\5$\23\2ON\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\5*\26\2RS\5\64"+
		"\33\2S\7\3\2\2\2TU\5,\27\2UY\5\64\33\2VX\5\30\r\2WV\3\2\2\2X[\3\2\2\2"+
		"YW\3\2\2\2YZ\3\2\2\2Z\t\3\2\2\2[Y\3\2\2\2\\^\5$\23\2]\\\3\2\2\2]^\3\2"+
		"\2\2^a\3\2\2\2_b\5\f\7\2`b\5\16\b\2a_\3\2\2\2a`\3\2\2\2b\13\3\2\2\2cd"+
		"\5.\30\2dh\5\64\33\2eg\5\30\r\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2"+
		"\2i\r\3\2\2\2jh\3\2\2\2kl\5\60\31\2lp\5\64\33\2mo\5\30\r\2nm\3\2\2\2o"+
		"r\3\2\2\2pn\3\2\2\2pq\3\2\2\2qv\3\2\2\2rp\3\2\2\2su\5\20\t\2ts\3\2\2\2"+
		"ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\17\3\2\2\2xv\3\2\2\2y{\5$\23\2zy\3\2\2"+
		"\2z{\3\2\2\2{|\3\2\2\2|}\5\22\n\2}\21\3\2\2\2~\177\5\62\32\2\177\u0081"+
		"\5\64\33\2\u0080\u0082\5\24\13\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2"+
		"\2\u0082\23\3\2\2\2\u0083\u0087\58\35\2\u0084\u0086\58\35\2\u0085\u0084"+
		"\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\25\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008c\5\30\r\2\u008b\u008a\3\2\2"+
		"\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\27"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7\26\2\2\u0091\u0093\7\13\2\2"+
		"\u0092\u0090\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0099\5\32\16\2"+
		"\u0098\u009a\5\34\17\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\31"+
		"\3\2\2\2\u009b\u009f\7\20\2\2\u009c\u009e\7\27\2\2\u009d\u009c\3\2\2\2"+
		"\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2"+
		"\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\5> \2\u00a3\u00a4\7\13\2\2\u00a4"+
		"\33\3\2\2\2\u00a5\u00a8\5\36\20\2\u00a6\u00a8\5 \21\2\u00a7\u00a5\3\2"+
		"\2\2\u00a7\u00a6\3\2\2\2\u00a8\35\3\2\2\2\u00a9\u00ab\58\35\2\u00aa\u00a9"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\37\3\2\2\2\u00ae\u00b2\7\22\2\2\u00af\u00b1\13\2\2\2\u00b0\u00af\3\2"+
		"\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\22\2\2\u00b6!\3\2\2\2"+
		"\u00b7\u00b9\7\3\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd"+
		"\u00c1\7\4\2\2\u00be\u00c0\7\3\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2"+
		"\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c4\u00c8\7\5\2\2\u00c5\u00c7\7\3\2\2\u00c6\u00c5\3\2"+
		"\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cf\7\6\2\2\u00cc\u00ce\7\3"+
		"\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d6\7\23"+
		"\2\2\u00d3\u00d5\7\3\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d9\u00da\7\13\2\2\u00da#\3\2\2\2\u00db\u00dd\5&\24\2\u00dc\u00db"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"%\3\2\2\2\u00e0\u00e1\7\7\2\2\u00e1\u00e2\5> \2\u00e2\u00e3\7\13\2\2\u00e3"+
		"\'\3\2\2\2\u00e4\u00e5\7\4\2\2\u00e5\u00e6\5> \2\u00e6\u00e7\7\13\2\2"+
		"\u00e7)\3\2\2\2\u00e8\u00ec\7\f\2\2\u00e9\u00eb\7\27\2\2\u00ea\u00e9\3"+
		"\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f3\7\6\2\2\u00f0\u00f2\7\27"+
		"\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\5>"+
		" \2\u00f7\u00f8\7\13\2\2\u00f8+\3\2\2\2\u00f9\u00fd\7\r\2\2\u00fa\u00fc"+
		"\7\27\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2"+
		"\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0104"+
		"\7\6\2\2\u0101\u0103\7\27\2\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2"+
		"\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0104"+
		"\3\2\2\2\u0107\u0108\5> \2\u0108\u0109\7\13\2\2\u0109-\3\2\2\2\u010a\u010e"+
		"\7\16\2\2\u010b\u010d\7\27\2\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2"+
		"\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010e"+
		"\3\2\2\2\u0111\u0115\7\6\2\2\u0112\u0114\7\27\2\2\u0113\u0112\3\2\2\2"+
		"\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118"+
		"\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\5> \2\u0119\u011a\7\13\2\2\u011a"+
		"/\3\2\2\2\u011b\u011f\7\17\2\2\u011c\u011e\7\27\2\2\u011d\u011c\3\2\2"+
		"\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122"+
		"\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0126\7\6\2\2\u0123\u0125\7\27\2\2"+
		"\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127"+
		"\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\5> \2\u012a"+
		"\u012b\7\13\2\2\u012b\61\3\2\2\2\u012c\u0130\7\21\2\2\u012d\u012f\7\27"+
		"\2\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0137\7\6"+
		"\2\2\u0134\u0136\7\27\2\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0137\3\2"+
		"\2\2\u013a\u013b\5> \2\u013b\u013c\7\13\2\2\u013c\63\3\2\2\2\u013d\u013f"+
		"\7\b\2\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0144\7\t\2\2\u0141\u0143\7\3\2\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2"+
		"\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0148\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0147\u013e\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2"+
		"\2\2\u0149\u014a\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014c"+
		"\u014e\5\66\34\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0152\3"+
		"\2\2\2\u014f\u0151\5(\25\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\65\3\2\2\2\u0154\u0152\3\2\2"+
		"\2\u0155\u0157\13\2\2\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158"+
		"\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\67\3\2\2\2\u015a\u0158\3\2\2"+
		"\2\u015b\u015d\5:\36\2\u015c\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015c"+
		"\3\2\2\2\u015e\u015f\3\2\2\2\u015f9\3\2\2\2\u0160\u0161\7\n\2\2\u0161"+
		"\u0162\5<\37\2\u0162;\3\2\2\2\u0163\u0165\n\2\2\2\u0164\u0163\3\2\2\2"+
		"\u0165\u0166\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167=\3"+
		"\2\2\2\u0168\u016a\n\3\2\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c?\3\2\2\2\u016d\u016b\3\2\2\2"+
		"/DILOY]ahpvz\u0081\u0087\u008d\u0094\u0099\u009f\u00a7\u00ac\u00b2\u00ba"+
		"\u00c1\u00c8\u00cf\u00d6\u00de\u00ec\u00f3\u00fd\u0104\u010e\u0115\u011f"+
		"\u0126\u0130\u0137\u013e\u0144\u0149\u014d\u0152\u0158\u015e\u0166\u016b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}