// Generated from C:/workspaces/github/ice-parser/src/main/antlr4/com/github/ledoyen/ice/parser\Gherkin.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GherkinParser}.
 */
public interface GherkinListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GherkinParser#gherkin_document}.
	 * @param ctx the parse tree
	 */
	void enterGherkin_document(GherkinParser.Gherkin_documentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GherkinParser#gherkin_document}.
	 * @param ctx the parse tree
	 */
	void exitGherkin_document(GherkinParser.Gherkin_documentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GherkinParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterFeature(GherkinParser.FeatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GherkinParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitFeature(GherkinParser.FeatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GherkinParser#feature_header}.
	 * @param ctx the parse tree
	 */
	void enterFeature_header(GherkinParser.Feature_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GherkinParser#feature_header}.
	 * @param ctx the parse tree
	 */
	void exitFeature_header(GherkinParser.Feature_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GherkinParser#background}.
	 * @param ctx the parse tree
	 */
	void enterBackground(GherkinParser.BackgroundContext ctx);
	/**
	 * Exit a parse tree produced by {@link GherkinParser#background}.
	 * @param ctx the parse tree
	 */
	void exitBackground(GherkinParser.BackgroundContext ctx);
	/**
	 * Enter a parse tree produced by {@link GherkinParser#scenario_definition}.
	 * @param ctx the parse tree
	 */
	void enterScenario_definition(GherkinParser.Scenario_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GherkinParser#scenario_definition}.
	 * @param ctx the parse tree
	 */
	void exitScenario_definition(GherkinParser.Scenario_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GherkinParser#scenario}.
	 * @param ctx the parse tree
	 */
	void enterScenario(GherkinParser.ScenarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link GherkinParser#scenario}.
	 * @param ctx the parse tree
	 */
	void exitScenario(GherkinParser.ScenarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link GherkinParser#scenario_outline}.
	 * @param ctx the parse tree
	 */
	void enterScenario_outline(GherkinParser.Scenario_outlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GherkinParser#scenario_outline}.
	 * @param ctx the parse tree
	 */
	void exitScenario_outline(GherkinParser.Scenario_outlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GherkinParser#examples_definition}.
	 * @param ctx the parse tree
	 */
	void enterExamples_definition(GherkinParser.Examples_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GherkinParser#examples_definition}.
	 * @param ctx the parse tree
	 */
	void exitExamples_definition(GherkinParser.Examples_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GherkinParser#examples}.
	 * @param ctx the parse tree
	 */
	void enterExamples(GherkinParser.ExamplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GherkinParser#examples}.
	 * @param ctx the parse tree
	 */
	void exitExamples(GherkinParser.ExamplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GherkinParser#examples_table}.
	 * @param ctx the parse tree
	 */
	void enterExamples_table(GherkinParser.Examples_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GherkinParser#examples_table}.
	 * @param ctx the parse tree
	 */
	void exitExamples_table(GherkinParser.Examples_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GherkinParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(GherkinParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GherkinParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(GherkinParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GherkinParser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(GherkinParser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link GherkinParser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(GherkinParser.StepContext ctx);
	/**
	 * Enter a parse tree produced by {@link GherkinParser#step_line}.
	 * @param ctx the parse tree
	 */
	void enterStep_line(GherkinParser.Step_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GherkinParser#step_line}.
	 * @param ctx the parse tree
	 */
	void exitStep_line(GherkinParser.Step_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GherkinParser#step_args}.
	 * @param ctx the parse tree
	 */
	void enterStep_args(GherkinParser.Step_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GherkinParser#step_args}.
	 * @param ctx the parse tree
	 */
	void exitStep_args(GherkinParser.Step_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GherkinParser#data_table}.
	 * @param ctx the parse tree
	 */
	void enterData_table(GherkinParser.Data_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GherkinParser#data_table}.
	 * @param ctx the parse tree
	 */
	void exitData_table(GherkinParser.Data_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GherkinParser#doc_string}.
	 * @param ctx the parse tree
	 */
	void enterDoc_string(GherkinParser.Doc_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link GherkinParser#doc_string}.
	 * @param ctx the parse tree
	 */
	void exitDoc_string(GherkinParser.Doc_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link GherkinParser#language}.
	 * @param ctx the parse tree
	 */
	void enterLanguage(GherkinParser.LanguageContext ctx);
	/**
	 * Exit a parse tree produced by {@link GherkinParser#language}.
	 * @param ctx the parse tree
	 */
	void exitLanguage(GherkinParser.LanguageContext ctx);
	/**
	 * Enter a parse tree produced by {@link GherkinParser#tags}.
	 * @param ctx the parse tree
	 */
	void enterTags(GherkinParser.TagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GherkinParser#tags}.
	 * @param ctx the parse tree
	 */
	void exitTags(GherkinParser.TagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GherkinParser#tag_line}.
	 * @param ctx the parse tree
	 */
	void enterTag_line(GherkinParser.Tag_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GherkinParser#tag_line}.
	 * @param ctx the parse tree
	 */
	void exitTag_line(GherkinParser.Tag_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GherkinParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(GherkinParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GherkinParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(GherkinParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GherkinParser#feature_line}.
	 * @param ctx the parse tree
	 */
	void enterFeature_line(GherkinParser.Feature_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GherkinParser#feature_line}.
	 * @param ctx the parse tree
	 */
	void exitFeature_line(GherkinParser.Feature_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GherkinParser#background_line}.
	 * @param ctx the parse tree
	 */
	void enterBackground_line(GherkinParser.Background_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GherkinParser#background_line}.
	 * @param ctx the parse tree
	 */
	void exitBackground_line(GherkinParser.Background_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GherkinParser#scenario_line}.
	 * @param ctx the parse tree
	 */
	void enterScenario_line(GherkinParser.Scenario_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GherkinParser#scenario_line}.
	 * @param ctx the parse tree
	 */
	void exitScenario_line(GherkinParser.Scenario_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GherkinParser#scenario_outline_line}.
	 * @param ctx the parse tree
	 */
	void enterScenario_outline_line(GherkinParser.Scenario_outline_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GherkinParser#scenario_outline_line}.
	 * @param ctx the parse tree
	 */
	void exitScenario_outline_line(GherkinParser.Scenario_outline_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GherkinParser#examples_line}.
	 * @param ctx the parse tree
	 */
	void enterExamples_line(GherkinParser.Examples_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GherkinParser#examples_line}.
	 * @param ctx the parse tree
	 */
	void exitExamples_line(GherkinParser.Examples_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GherkinParser#description_helper}.
	 * @param ctx the parse tree
	 */
	void enterDescription_helper(GherkinParser.Description_helperContext ctx);
	/**
	 * Exit a parse tree produced by {@link GherkinParser#description_helper}.
	 * @param ctx the parse tree
	 */
	void exitDescription_helper(GherkinParser.Description_helperContext ctx);
	/**
	 * Enter a parse tree produced by {@link GherkinParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(GherkinParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GherkinParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(GherkinParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GherkinParser#table_row}.
	 * @param ctx the parse tree
	 */
	void enterTable_row(GherkinParser.Table_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link GherkinParser#table_row}.
	 * @param ctx the parse tree
	 */
	void exitTable_row(GherkinParser.Table_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link GherkinParser#cell}.
	 * @param ctx the parse tree
	 */
	void enterCell(GherkinParser.CellContext ctx);
	/**
	 * Exit a parse tree produced by {@link GherkinParser#cell}.
	 * @param ctx the parse tree
	 */
	void exitCell(GherkinParser.CellContext ctx);
	/**
	 * Enter a parse tree produced by {@link GherkinParser#cell_value}.
	 * @param ctx the parse tree
	 */
	void enterCell_value(GherkinParser.Cell_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GherkinParser#cell_value}.
	 * @param ctx the parse tree
	 */
	void exitCell_value(GherkinParser.Cell_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GherkinParser#line_to_eol}.
	 * @param ctx the parse tree
	 */
	void enterLine_to_eol(GherkinParser.Line_to_eolContext ctx);
	/**
	 * Exit a parse tree produced by {@link GherkinParser#line_to_eol}.
	 * @param ctx the parse tree
	 */
	void exitLine_to_eol(GherkinParser.Line_to_eolContext ctx);
}