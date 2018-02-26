grammar Ice;

tokens { INDENT, DEDENT }
@lexer::header {
  import com.github.ledoyen.ice.parser.LexerLookup;
  import com.yuvalshavit.antlr4.DenterHelper;
}
@lexer::members {
  private final LexerLookup lexerLookup = new LexerLookup();
  
  public LexerLookup getLexerLookup() {
    return lexerLookup;
  }

  private final DenterHelper denter = new DenterHelper(NL, IceParser.INDENT, IceParser.DEDENT) {
    @Override
    public Token pullToken() {
      return IceLexer.super.nextToken();
    }
  };

  @Override
  public Token nextToken() {
    return denter.nextToken();
  }

  public Token rawNextToken() {
    return super.nextToken();
  }
}

gherkin_document: feature;
feature: feature_header background? scenario_definition+;
feature_header: language? tags? feature_line description_helper;

background: background_line description_helper step*;

scenario_definition: tags? (scenario | scenario_outline);
scenario: scenario_line description_helper step*;
scenario_outline: scenario_outline_line description_helper step* examples_definition*;
examples_definition: tags? examples;
examples: examples_line description_helper examples_table?;
examples_table: table_row table_row*;

step: (LINE_COMMENT NL)* step_line step_args?;
step_line: STEP_KEYWORD SPACE* line_to_eol NL;
step_args: (data_table | doc_string | INDENT step+ DEDENT);

data_table: table_row+;
doc_string: SEPARATOR .*? SEPARATOR;



language: ' '* '#' ' '* 'language' ' '* ':' ' '* ANY+ ' '* NL;
tags: LINE_TAG+;
feature_line: FEATURE_KEYWORD SPACE* ':' SPACE* line_to_eol NL;
background_line: BACKGROUND_KEYWORD SPACE* ':' SPACE* line_to_eol NL;
scenario_line: SCENARIO_KEYWORD SPACE* ':' SPACE* line_to_eol NL;
scenario_outline_line: SCENARIO_OUTLINE_KEYWORD SPACE* ':' SPACE* line_to_eol NL;
examples_line: EXAMPLES_KEYWORD SPACE* ':' SPACE* line_to_eol NL;
description_helper: ('\r'? '\n' ' '*)* (description | LINE_COMMENT+ | description LINE_COMMENT+);
description: .+?;
table_row: cell+;
cell: '|' cell_value;
cell_value: ~('|')+;

line_to_eol : (~NL)* ;

NL: ('\r'? '\n' ' '*) | EOF;
FEATURE_KEYWORD: {lexerLookup.contains(FEATURE_KEYWORD, _input)}? . ;
BACKGROUND_KEYWORD: {lexerLookup.contains(BACKGROUND_KEYWORD, _input)}? . ;
SCENARIO_KEYWORD: {lexerLookup.contains(SCENARIO_KEYWORD, _input)}? . ;
SCENARIO_OUTLINE_KEYWORD: {lexerLookup.contains(SCENARIO_OUTLINE_KEYWORD, _input)}? . ;
STEP_KEYWORD: {lexerLookup.contains(STEP_KEYWORD, _input)}? . ;
EXAMPLES_KEYWORD: {lexerLookup.contains(EXAMPLES_KEYWORD, _input)}? . ;
SEPARATOR: '\'\'\'';
ANY: ~[\r\n];
WS: [ \t]+ -> skip;
LINE_COMMENT: '#' ~[\r\n]*;
LINE_TAG: '@' ~[\r\n]*;
SPACE	: 	(' '|'\t')+ {skip();};


