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

document: step*;
step: (LINE_COMMENT NL)* STEP_KEYWORD SPACE* line_to_eol (NL | NL value_bloc | INDENT step+ DEDENT);
line_to_eol : (~NL)* ;
value_bloc: SEPARATOR (~NL)* SEPARATOR;

NL: ('\r'? '\n' ' '*) | EOF;
STEP_KEYWORD: {lexerLookup.contains(STEP_KEYWORD, _input)}? . ;
SEPARATOR: '"""';
ANY: .;
WS: [ \t]+ -> skip;
LINE_COMMENT: '#' ~[\r\n]*;
SPACE	: 	(' '|'\t')+ {skip();};


