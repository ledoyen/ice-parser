grammar Gherkin;

gherkin_document: feature EOF;
feature: feature_header background? scenario_definition+;
feature_header: language? tags? feature_line description_helper;

background: background_line description_helper? step*;

scenario_definition: tags? (scenario | scenario_outline);
scenario: scenario_line step*;
scenario_outline: scenario_outline_line step* examples_definition*;
examples_definition: tags? examples;
examples: examples_line examples_table?;
examples_table: table_row table_row*;

step: (LINE_COMMENT NL)* step_line step_args?;
step_line: STEP_KEYWORD SPACE* line_to_eol NL?;
step_args: (data_table NL? | DOC_STRING NL?);

data_table: table_row+;

language: ' '* '#' ' '* 'language' ' '* ':' (~NL)* NL;
tags: tag_line+;
tag_line: '@' line_to_eol NL;
comment: '#' line_to_eol NL;
feature_line: FEATURE_KEYWORD SPACE* ':' SPACE* line_to_eol NL;
background_line: BACKGROUND_KEYWORD SPACE* ':' SPACE* line_to_eol NL;
scenario_line: SCENARIO_KEYWORD SPACE* ':' SPACE* line_to_eol NL;
scenario_outline_line: SCENARIO_OUTLINE_KEYWORD SPACE* ':' SPACE* line_to_eol NL;
examples_line: EXAMPLES_KEYWORD SPACE* ':' SPACE* line_to_eol NL;
description_helper: ('\r'? '\n' ' '*)* description comment*;
description: .+?;
table_row: cell+ '|' NL?;
cell: '|' NE+?;

line_to_eol : (~NL)* ;

DOC_STRING: SEPARATOR (.)*? SEPARATOR;

NL: ('\r'? '\n' ' '*) | EOF;
FEATURE_KEYWORD: 'Feature' ;
BACKGROUND_KEYWORD: 'Background' ;
SCENARIO_KEYWORD: 'Scenario' ;
SCENARIO_OUTLINE_KEYWORD: 'Scenario Outline' ;
STEP_KEYWORD: 'Given' | 'When' | 'Then' | 'And' ;
EXAMPLES_KEYWORD: 'Examples' ;
SEPARATOR: '\'\'\'';
NE: ~[\r\n];
ANY: .;
WS: [ \t]+ -> skip;
LINE_COMMENT: '#' ~[\r\n]*;
SPACE	: 	(' '|'\t')+ {skip();};


