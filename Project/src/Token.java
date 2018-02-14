public class Token{
  public int kind;
  public String spelling;
  public int line;

  private final static String[] keywords = {
      "<Place holder>", "<Place holder>", "int", "bool", "false", "true"
   };
  
  public Token(int kind, String spelling, int line){
    this.kind = kind;
    this.spelling = spelling;
    this.line = line;
    if(kind==IDENTIFIER)
    	for(int k = 0; k < keywords.length; k++)
    		if(spelling.equals(keywords[k])){
    			this.kind = k;
    			return;
    		}
  }

  public final static int
    IDENTIFIER 	= 0,
    LITERAL		= 1,
    INT			= 2,		//int
    BOOLEAN		= 3,		//bool
    FALSE		= 4,		//false
    TRUE		= 5,		//true
    LPAREN		= 6,		//(
    RPAREN		= 7,		//)
    PLUS		= 8,		//+
    MINUS		= 9,		//-
    TIMES		= 10,		//*
    DIVIDE		= 11,		///
    LESS		= 12,		//<
    LEQ			= 13,		//<=
    GREATER		= 14,		//>
    GEQ			= 15,		//>=
    EQ			= 16,		//==
    NEQ			= 17,		//!=
    AND			= 18,		//&&
    OR			= 19,		//||
    NOT			= 20,		//!
    NOTHING    	= 21,       //Never happen but we need to return some thing in
    EOT        	= 22,
    SEMICOLON	= 23,		//;
    ASSIGN		= 24,		//=
    UNDEFINED 	= 25;		//Note: I added this for the next phases of the compiler. We do not need it for the parser
}