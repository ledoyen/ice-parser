// Generated from C:/workspaces/github/ice-parser/src/main/antlr4/com/github/ledoyen/ice/parser\Gherkin.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GherkinParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GherkinVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GherkinParser#gherkin_document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGherkin_document(GherkinParser.Gherkin_documentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GherkinParser#feature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeature(GherkinParser.FeatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link GherkinParser#feature_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeature_header(GherkinParser.Feature_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GherkinParser#background}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackground(GherkinParser.BackgroundContext ctx);
	/**
	 * Visit a parse tree produced by {@link GherkinParser#scenario_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScenario_definition(GherkinParser.Scenario_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GherkinParser#scenario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScenario(GherkinParser.ScenarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link GherkinParser#scenario_outline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScenario_outline(GherkinParser.Scenario_outlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GherkinParser#examples_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExamples_definition(GherkinParser.Examples_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GherkinParser#examples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExamples(GherkinParser.ExamplesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GherkinParser#examples_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExamples_table(GherkinParser.Examples_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GherkinParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(GherkinParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GherkinParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep(GherkinParser.StepContext ctx);
	/**
	 * Visit a parse tree produced by {@link GherkinParser#step_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep_line(GherkinParser.Step_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GherkinParser#step_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep_args(GherkinParser.Step_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GherkinParser#data_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_table(GherkinParser.Data_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GherkinParser#doc_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoc_string(GherkinParser.Doc_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link GherkinParser#language}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguage(GherkinParser.LanguageContext ctx);
	/**
	 * Visit a parse tree produced by {@link GherkinParser#tags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTags(GherkinParser.TagsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GherkinParser#tag_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag_line(GherkinParser.Tag_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GherkinParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(GherkinParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GherkinParser#feature_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeature_line(GherkinParser.Feature_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GherkinParser#background_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackground_line(GherkinParser.Background_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GherkinParser#scenario_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScenario_line(GherkinParser.Scenario_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GherkinParser#scenario_outline_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScenario_outline_line(GherkinParser.Scenario_outline_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GherkinParser#examples_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExamples_line(GherkinParser.Examples_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GherkinParser#description_helper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription_helper(GherkinParser.Description_helperContext ctx);
	/**
	 * Visit a parse tree produced by {@link GherkinParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(GherkinParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GherkinParser#table_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_row(GherkinParser.Table_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link GherkinParser#cell}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCell(GherkinParser.CellContext ctx);
	/**
	 * Visit a parse tree produced by {@link GherkinParser#cell_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCell_value(GherkinParser.Cell_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GherkinParser#line_to_eol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine_to_eol(GherkinParser.Line_to_eolContext ctx);
}