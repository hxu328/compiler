import java_cup.runtime.*; // defines the Symbol class
// The generated scanner will return a Symbol for each token that it finds.
// A Symbol contains an Object field named value; that field will be of type
// TokenVal, defined below.
//
// A TokenVal object contains the line number on which the token occurs as
// well as the number of the character on that line that starts the token.
// Some tokens (literals and IDs) also include the value of the token.
class TokenVal {
  // fields
    int lineNum;
    int charNum;
  // constructor
    TokenVal(int lineNum, int charNum) {
        this.lineNum = lineNum;
        this.charNum = charNum;
    }
}
class IntLitTokenVal extends TokenVal {
  // new field: the value of the integer literal
    int intVal;
  // constructor
    IntLitTokenVal(int lineNum, int charNum, int intVal) {
        super(lineNum, charNum);
        this.intVal = intVal;
    }
}
class IdTokenVal extends TokenVal {
  // new field: the value of the identifier
    String idVal;
  // constructor
    IdTokenVal(int lineNum, int charNum, String idVal) {
        super(lineNum, charNum);
        this.idVal = idVal;
    }
}
class StrLitTokenVal extends TokenVal {
  // new field: the value of the string literal
    String strVal;
  // constructor
    StrLitTokenVal(int lineNum, int charNum, String strVal) {
        super(lineNum, charNum);
        this.strVal = strVal;
    }
}
StringBuffer string = new StringBuffer();
// The following class is used to keep track of the character number at 
// which the current token starts on its line.
class CharNum {
    static int num = 1;
}


class Yylex implements java_cup.runtime.Scanner {
	private final int YY_BUFFER_SIZE = 512;
	private final int YY_F = -1;
	private final int YY_NO_STATE = -1;
	private final int YY_NOT_ACCEPT = 0;
	private final int YY_START = 1;
	private final int YY_END = 2;
	private final int YY_NO_ANCHOR = 4;
	private final int YY_BOL = 128;
	private final int YY_EOF = 129;
	private java.io.BufferedReader yy_reader;
	private int yy_buffer_index;
	private int yy_buffer_read;
	private int yy_buffer_start;
	private int yy_buffer_end;
	private char yy_buffer[];
	private int yyline;
	private boolean yy_at_bol;
	private int yy_lexical_state;

	Yylex (java.io.Reader reader) {
		this ();
		if (null == reader) {
			throw (new Error("Error: Bad input stream initializer."));
		}
		yy_reader = new java.io.BufferedReader(reader);
	}

	Yylex (java.io.InputStream instream) {
		this ();
		if (null == instream) {
			throw (new Error("Error: Bad input stream initializer."));
		}
		yy_reader = new java.io.BufferedReader(new java.io.InputStreamReader(instream));
	}

	private Yylex () {
		yy_buffer = new char[YY_BUFFER_SIZE];
		yy_buffer_read = 0;
		yy_buffer_index = 0;
		yy_buffer_start = 0;
		yy_buffer_end = 0;
		yyline = 0;
		yy_at_bol = true;
		yy_lexical_state = YYINITIAL;
	}

	private boolean yy_eof_done = false;
	private final int STRING = 1;
	private final int YYINITIAL = 0;
	private final int yy_state_dtrans[] = {
		0,
		49
	};
	private void yybegin (int state) {
		yy_lexical_state = state;
	}
	private int yy_advance ()
		throws java.io.IOException {
		int next_read;
		int i;
		int j;

		if (yy_buffer_index < yy_buffer_read) {
			return yy_buffer[yy_buffer_index++];
		}

		if (0 != yy_buffer_start) {
			i = yy_buffer_start;
			j = 0;
			while (i < yy_buffer_read) {
				yy_buffer[j] = yy_buffer[i];
				++i;
				++j;
			}
			yy_buffer_end = yy_buffer_end - yy_buffer_start;
			yy_buffer_start = 0;
			yy_buffer_read = j;
			yy_buffer_index = j;
			next_read = yy_reader.read(yy_buffer,
					yy_buffer_read,
					yy_buffer.length - yy_buffer_read);
			if (-1 == next_read) {
				return YY_EOF;
			}
			yy_buffer_read = yy_buffer_read + next_read;
		}

		while (yy_buffer_index >= yy_buffer_read) {
			if (yy_buffer_index >= yy_buffer.length) {
				yy_buffer = yy_double(yy_buffer);
			}
			next_read = yy_reader.read(yy_buffer,
					yy_buffer_read,
					yy_buffer.length - yy_buffer_read);
			if (-1 == next_read) {
				return YY_EOF;
			}
			yy_buffer_read = yy_buffer_read + next_read;
		}
		return yy_buffer[yy_buffer_index++];
	}
	private void yy_move_end () {
		if (yy_buffer_end > yy_buffer_start &&
		    '\n' == yy_buffer[yy_buffer_end-1])
			yy_buffer_end--;
		if (yy_buffer_end > yy_buffer_start &&
		    '\r' == yy_buffer[yy_buffer_end-1])
			yy_buffer_end--;
	}
	private boolean yy_last_was_cr=false;
	private void yy_mark_start () {
		int i;
		for (i = yy_buffer_start; i < yy_buffer_index; ++i) {
			if ('\n' == yy_buffer[i] && !yy_last_was_cr) {
				++yyline;
			}
			if ('\r' == yy_buffer[i]) {
				++yyline;
				yy_last_was_cr=true;
			} else yy_last_was_cr=false;
		}
		yy_buffer_start = yy_buffer_index;
	}
	private void yy_mark_end () {
		yy_buffer_end = yy_buffer_index;
	}
	private void yy_to_mark () {
		yy_buffer_index = yy_buffer_end;
		yy_at_bol = (yy_buffer_end > yy_buffer_start) &&
		            ('\r' == yy_buffer[yy_buffer_end-1] ||
		             '\n' == yy_buffer[yy_buffer_end-1] ||
		             2028/*LS*/ == yy_buffer[yy_buffer_end-1] ||
		             2029/*PS*/ == yy_buffer[yy_buffer_end-1]);
	}
	private java.lang.String yytext () {
		return (new java.lang.String(yy_buffer,
			yy_buffer_start,
			yy_buffer_end - yy_buffer_start));
	}
	private int yylength () {
		return yy_buffer_end - yy_buffer_start;
	}
	private char[] yy_double (char buf[]) {
		int i;
		char newbuf[];
		newbuf = new char[2*buf.length];
		for (i = 0; i < buf.length; ++i) {
			newbuf[i] = buf[i];
		}
		return newbuf;
	}
	private final int YY_E_INTERNAL = 0;
	private final int YY_E_MATCH = 1;
	private java.lang.String yy_error_string[] = {
		"Error: Internal error.\n",
		"Error: Unmatched input.\n"
	};
	private void yy_error (int code,boolean fatal) {
		java.lang.System.out.print(yy_error_string[code]);
		java.lang.System.out.flush();
		if (fatal) {
			throw new Error("Fatal Error.\n");
		}
	}
	private int[][] unpackFromString(int size1, int size2, String st) {
		int colonIndex = -1;
		String lengthString;
		int sequenceLength = 0;
		int sequenceInteger = 0;

		int commaIndex;
		String workString;

		int res[][] = new int[size1][size2];
		for (int i= 0; i < size1; i++) {
			for (int j= 0; j < size2; j++) {
				if (sequenceLength != 0) {
					res[i][j] = sequenceInteger;
					sequenceLength--;
					continue;
				}
				commaIndex = st.indexOf(',');
				workString = (commaIndex==-1) ? st :
					st.substring(0, commaIndex);
				st = st.substring(commaIndex+1);
				colonIndex = workString.indexOf(':');
				if (colonIndex == -1) {
					res[i][j]=Integer.parseInt(workString);
					continue;
				}
				lengthString =
					workString.substring(colonIndex+1);
				sequenceLength=Integer.parseInt(lengthString);
				workString=workString.substring(0,colonIndex);
				sequenceInteger=Integer.parseInt(workString);
				res[i][j] = sequenceInteger;
				sequenceLength--;
			}
		}
		return res;
	}
	private int yy_acpt[] = {
		/* 0 */ YY_NOT_ACCEPT,
		/* 1 */ YY_NO_ANCHOR,
		/* 2 */ YY_NO_ANCHOR,
		/* 3 */ YY_NO_ANCHOR,
		/* 4 */ YY_NO_ANCHOR,
		/* 5 */ YY_NO_ANCHOR,
		/* 6 */ YY_NO_ANCHOR,
		/* 7 */ YY_NO_ANCHOR,
		/* 8 */ YY_NO_ANCHOR,
		/* 9 */ YY_NO_ANCHOR,
		/* 10 */ YY_NO_ANCHOR,
		/* 11 */ YY_NO_ANCHOR,
		/* 12 */ YY_NO_ANCHOR,
		/* 13 */ YY_NO_ANCHOR,
		/* 14 */ YY_NO_ANCHOR,
		/* 15 */ YY_NO_ANCHOR,
		/* 16 */ YY_NO_ANCHOR,
		/* 17 */ YY_NO_ANCHOR,
		/* 18 */ YY_NO_ANCHOR,
		/* 19 */ YY_NO_ANCHOR,
		/* 20 */ YY_NO_ANCHOR,
		/* 21 */ YY_NO_ANCHOR,
		/* 22 */ YY_NO_ANCHOR,
		/* 23 */ YY_NO_ANCHOR,
		/* 24 */ YY_NO_ANCHOR,
		/* 25 */ YY_NO_ANCHOR,
		/* 26 */ YY_NO_ANCHOR,
		/* 27 */ YY_NO_ANCHOR,
		/* 28 */ YY_NO_ANCHOR,
		/* 29 */ YY_NO_ANCHOR,
		/* 30 */ YY_NO_ANCHOR,
		/* 31 */ YY_NO_ANCHOR,
		/* 32 */ YY_NO_ANCHOR,
		/* 33 */ YY_NO_ANCHOR,
		/* 34 */ YY_NO_ANCHOR,
		/* 35 */ YY_NO_ANCHOR,
		/* 36 */ YY_NO_ANCHOR,
		/* 37 */ YY_NO_ANCHOR,
		/* 38 */ YY_NO_ANCHOR,
		/* 39 */ YY_NO_ANCHOR,
		/* 40 */ YY_NO_ANCHOR,
		/* 41 */ YY_NO_ANCHOR,
		/* 42 */ YY_NO_ANCHOR,
		/* 43 */ YY_NO_ANCHOR,
		/* 44 */ YY_NO_ANCHOR,
		/* 45 */ YY_NO_ANCHOR,
		/* 46 */ YY_NO_ANCHOR,
		/* 47 */ YY_NO_ANCHOR,
		/* 48 */ YY_NO_ANCHOR,
		/* 49 */ YY_NOT_ACCEPT,
		/* 50 */ YY_NO_ANCHOR,
		/* 51 */ YY_NO_ANCHOR,
		/* 52 */ YY_NO_ANCHOR,
		/* 53 */ YY_NO_ANCHOR,
		/* 54 */ YY_NO_ANCHOR,
		/* 55 */ YY_NO_ANCHOR,
		/* 56 */ YY_NO_ANCHOR,
		/* 57 */ YY_NO_ANCHOR,
		/* 58 */ YY_NO_ANCHOR,
		/* 59 */ YY_NO_ANCHOR,
		/* 60 */ YY_NO_ANCHOR,
		/* 61 */ YY_NO_ANCHOR,
		/* 62 */ YY_NO_ANCHOR,
		/* 63 */ YY_NO_ANCHOR,
		/* 64 */ YY_NO_ANCHOR,
		/* 65 */ YY_NO_ANCHOR,
		/* 66 */ YY_NO_ANCHOR,
		/* 67 */ YY_NO_ANCHOR,
		/* 68 */ YY_NO_ANCHOR,
		/* 69 */ YY_NO_ANCHOR,
		/* 70 */ YY_NO_ANCHOR,
		/* 71 */ YY_NO_ANCHOR,
		/* 72 */ YY_NO_ANCHOR,
		/* 73 */ YY_NO_ANCHOR,
		/* 74 */ YY_NO_ANCHOR,
		/* 75 */ YY_NO_ANCHOR,
		/* 76 */ YY_NO_ANCHOR,
		/* 77 */ YY_NO_ANCHOR,
		/* 78 */ YY_NO_ANCHOR,
		/* 79 */ YY_NO_ANCHOR,
		/* 80 */ YY_NO_ANCHOR,
		/* 81 */ YY_NO_ANCHOR,
		/* 82 */ YY_NO_ANCHOR,
		/* 83 */ YY_NO_ANCHOR,
		/* 84 */ YY_NO_ANCHOR,
		/* 85 */ YY_NO_ANCHOR,
		/* 86 */ YY_NO_ANCHOR,
		/* 87 */ YY_NO_ANCHOR,
		/* 88 */ YY_NO_ANCHOR,
		/* 89 */ YY_NO_ANCHOR,
		/* 90 */ YY_NO_ANCHOR
	};
	private int yy_cmap[] = unpackFromString(1,130,
"43:9,6,4,43:2,3,43:19,39,2,43:3,40,43,29,30,37,7,32,36,33,38,1:10,43,31,34," +
"42,35,43:2,26:26,43,5,43:2,26,43,22,18,25,14,15,9,26,24,8,26:2,16,26,10,13," +
"21,26,19,17,11,20,12,23,26:3,27,41,28,43:2,0:2")[0];

	private int yy_rmap[] = unpackFromString(1,91,
"0,1,2,1:3,3,4,5,1:7,6,7,8,1:2,9,10,1,11,1:9,11:11,1,12,1:2,13,14,15,16,17,1" +
"8,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,4" +
"3,44,45,46,47,48,49,50,51,11,52,53")[0];

	private int yy_nxt[][] = unpackFromString(54,44,
"1,2,3,-1,4,5,6,7,8,53,88,76,77,88,78,79,88,52,80,89,88:3,90,88:3,9,10,11,12" +
",13,14,15,16,17,18,19,20,21,51,54,22,5,-1:45,2,-1:48,6,-1:10,6,-1:33,23,-1:" +
"37,88,-1:6,88,24,55,88:16,-1:51,25,-1:7,26,-1:36,27,-1:6,28,-1:37,29,-1:49," +
"30,-1:43,33,-1:2,88,-1:6,88:19,-1:18,46,-1,46,-1:2,46:38,1,50,45,46,47,48,4" +
"6:38,-1,50,-1,46,-1:2,46:38,-1:40,31,-1:4,88,-1:4,6,-1,88:3,82,88:5,87,88:9" +
",-1:18,88,-1:6,88:14,81,88:4,-1:58,32,-1:3,88,-1:6,88:3,34,88:9,71,88:5,-1:" +
"18,88,-1:6,88:7,35,88:11,-1:18,88,-1:6,88:6,36,88:12,-1:18,88,-1:6,88:13,37" +
",88:5,-1:18,88,-1:6,88:7,38,88:11,-1:18,88,-1:6,88:8,39,88:10,-1:18,88,-1:6" +
",88:3,40,88:15,-1:18,88,-1:6,88:7,41,88:11,-1:18,88,-1:6,88:7,42,88:11,-1:1" +
"8,88,-1:6,88:3,43,88:15,-1:18,88,-1:6,88:2,44,88:16,-1:18,88,-1:6,88:12,56," +
"88:6,-1:18,88,-1:6,57,88:18,-1:18,88,-1:6,88:9,58,88:9,-1:18,88,-1:6,88:9,5" +
"9,88:9,-1:18,88,-1:6,88:5,60,88:13,-1:18,88,-1:6,88:12,61,88:6,-1:18,88,-1:" +
"6,88:9,62,88:9,-1:18,88,-1:6,88:8,63,88:10,-1:18,88,-1:6,88:17,64,88,-1:18," +
"88,-1:6,88:11,65,88:7,-1:18,88,-1:6,88:11,66,88:7,-1:18,88,-1:6,88:5,67,88:" +
"13,-1:18,88,-1:6,68,88:18,-1:18,88,-1:6,88:8,69,88:10,-1:18,88,-1:6,88:5,70" +
",88:13,-1:18,88,-1:6,88:8,72,88:10,-1:18,88,-1:6,88:11,85,88:7,-1:18,88,-1:" +
"6,88:3,86,88:15,-1:18,88,-1:6,73,88:18,-1:18,88,-1:6,88:12,74,88:6,-1:18,88" +
",-1:6,88:12,75,88:6,-1:18,88,-1:4,6,-1,88:9,87,88:9,-1:18,88,-1:6,88:7,83,8" +
"8:11,-1:18,88,-1:6,88:16,84,88:2,-1:17");

	public java_cup.runtime.Symbol next_token ()
		throws java.io.IOException {
		int yy_lookahead;
		int yy_anchor = YY_NO_ANCHOR;
		int yy_state = yy_state_dtrans[yy_lexical_state];
		int yy_next_state = YY_NO_STATE;
		int yy_last_accept_state = YY_NO_STATE;
		boolean yy_initial = true;
		int yy_this_accept;

		yy_mark_start();
		yy_this_accept = yy_acpt[yy_state];
		if (YY_NOT_ACCEPT != yy_this_accept) {
			yy_last_accept_state = yy_state;
			yy_mark_end();
		}
		while (true) {
			if (yy_initial && yy_at_bol) yy_lookahead = YY_BOL;
			else yy_lookahead = yy_advance();
			yy_next_state = YY_F;
			yy_next_state = yy_nxt[yy_rmap[yy_state]][yy_cmap[yy_lookahead]];
			if (YY_EOF == yy_lookahead && true == yy_initial) {

return new Symbol(sym.EOF);
			}
			if (YY_F != yy_next_state) {
				yy_state = yy_next_state;
				yy_initial = false;
				yy_this_accept = yy_acpt[yy_state];
				if (YY_NOT_ACCEPT != yy_this_accept) {
					yy_last_accept_state = yy_state;
					yy_mark_end();
				}
			}
			else {
				if (YY_NO_STATE == yy_last_accept_state) {
					throw (new Error("Lexical Error: Unmatched Input."));
				}
				else {
					yy_anchor = yy_acpt[yy_last_accept_state];
					if (0 != (YY_END & yy_anchor)) {
						yy_move_end();
					}
					yy_to_mark();
					switch (yy_last_accept_state) {
					case 1:
						
					case -2:
						break;
					case 2:
						{ // NOTE: the following computation of the integer value does
            //       NOT check for overflow. This must be changed.
            int val = Integer.parseInt(yytext());
            Symbol S = new Symbol(sym.INTLITERAL,
                             new IntLitTokenVal(yyline+1, CharNum.num, val));
            CharNum.num += yytext().length();
            return S;
          }
					case -3:
						break;
					case 3:
						{ string.setLength(0); 
                  string.append('\"'); 
                  CharNum.num += yytext().length(); 
                  yybegin(STRING);}
					case -4:
						break;
					case 4:
						{ CharNum.num = 1; }
					case -5:
						break;
					case 5:
						{ ErrMsg.fatal(yyline+1, CharNum.num,
                         "ignoring illegal character: " + yytext());
            CharNum.num++;
          }
					case -6:
						break;
					case 6:
						{ CharNum.num += yytext().length(); }
					case -7:
						break;
					case 7:
						{ Symbol S = new Symbol(sym.PLUS, new TokenVal(yyline+1, CharNum.num));
            CharNum.num++;
            return S;
          }
					case -8:
						break;
					case 8:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -9:
						break;
					case 9:
						{ Symbol S = new Symbol(sym.LCURLY,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -10:
						break;
					case 10:
						{ Symbol S = new Symbol(sym.RCURLY,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -11:
						break;
					case 11:
						{ Symbol S = new Symbol(sym.LPAREN,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -12:
						break;
					case 12:
						{ Symbol S = new Symbol(sym.RPAREN,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -13:
						break;
					case 13:
						{ Symbol S = new Symbol(sym.SEMICOLON,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -14:
						break;
					case 14:
						{ Symbol S = new Symbol(sym.COMMA,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -15:
						break;
					case 15:
						{ Symbol S = new Symbol(sym.DOT,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -16:
						break;
					case 16:
						{ Symbol S = new Symbol(sym.LESS,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -17:
						break;
					case 17:
						{ Symbol S = new Symbol(sym.GREATER,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -18:
						break;
					case 18:
						{ Symbol S = new Symbol(sym.MINUS,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -19:
						break;
					case 19:
						{ Symbol S = new Symbol(sym.TIMES,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -20:
						break;
					case 20:
						{ Symbol S = new Symbol(sym.DIVIDE,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -21:
						break;
					case 21:
						{ Symbol S = new Symbol(sym.NOT,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -22:
						break;
					case 22:
						{ Symbol S = new Symbol(sym.ASSIGN,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -23:
						break;
					case 23:
						{ Symbol S = new Symbol(sym.PLUSPLUS,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -24:
						break;
					case 24:
						{ Symbol S = new Symbol(sym.IF,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -25:
						break;
					case 25:
						{ Symbol S = new Symbol(sym.WRITE,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -26:
						break;
					case 26:
						{ Symbol S = new Symbol(sym.LESSEQ,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -27:
						break;
					case 27:
						{ Symbol S = new Symbol(sym.READ,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -28:
						break;
					case 28:
						{ Symbol S = new Symbol(sym.GREATEREQ,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -29:
						break;
					case 29:
						{ Symbol S = new Symbol(sym.MINUSMINUS,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -30:
						break;
					case 30:
						{ Symbol S = new Symbol(sym.NOTEQUALS,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -31:
						break;
					case 31:
						{ Symbol S = new Symbol(sym.AND,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -32:
						break;
					case 32:
						{ Symbol S = new Symbol(sym.OR,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -33:
						break;
					case 33:
						{ Symbol S = new Symbol(sym.EQUALS,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -34:
						break;
					case 34:
						{ Symbol S = new Symbol(sym.INT,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -35:
						break;
					case 35:
						{ Symbol S = new Symbol(sym.TRUE,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -36:
						break;
					case 36:
						{ Symbol S = new Symbol(sym.VOID,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -37:
						break;
					case 37:
						{ Symbol S = new Symbol(sym.DISP,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -38:
						break;
					case 38:
						{ Symbol S = new Symbol(sym.ELSE,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -39:
						break;
					case 39:
						{ Symbol S = new Symbol(sym.BOOL,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -40:
						break;
					case 40:
						{ Symbol S = new Symbol(sym.INPUT,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -41:
						break;
					case 41:
						{ Symbol S = new Symbol(sym.FALSE,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -42:
						break;
					case 42:
						{ Symbol S = new Symbol(sym.WHILE,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -43:
						break;
					case 43:
						{ Symbol S = new Symbol(sym.STRUCT,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -44:
						break;
					case 44:
						{ Symbol S = new Symbol(sym.RETURN,
                          new TokenVal(yyline+1, CharNum.num));
            CharNum.num += yytext().length();
            return S;
          }
					case -45:
						break;
					case 45:
						{ yybegin(YYINITIAL);
                string.append('\"');
                CharNum.num += yytext().length();
                return symbol(sym.STRINGLITERAL,
                string.toString());}
					case -46:
						break;
					case 46:
						{ CharNum.num += yytext().length();
                        string.append(yytext());}
					case -47:
						break;
					case 47:
						{ CharNum.num += yytext().length(); 
                ErrMsg.fatal(yyline+1, CharNum.num,
                "ignoring new line inside a string.");}
					case -48:
						break;
					case 48:
						{ CharNum.num += yytext().length(); string.append('\\');}
					case -49:
						break;
					case 50:
						{ // NOTE: the following computation of the integer value does
            //       NOT check for overflow. This must be changed.
            int val = Integer.parseInt(yytext());
            Symbol S = new Symbol(sym.INTLITERAL,
                             new IntLitTokenVal(yyline+1, CharNum.num, val));
            CharNum.num += yytext().length();
            return S;
          }
					case -50:
						break;
					case 51:
						{ ErrMsg.fatal(yyline+1, CharNum.num,
                         "ignoring illegal character: " + yytext());
            CharNum.num++;
          }
					case -51:
						break;
					case 52:
						{ CharNum.num += yytext().length(); }
					case -52:
						break;
					case 53:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -53:
						break;
					case 54:
						{ ErrMsg.fatal(yyline+1, CharNum.num,
                         "ignoring illegal character: " + yytext());
            CharNum.num++;
          }
					case -54:
						break;
					case 55:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -55:
						break;
					case 56:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -56:
						break;
					case 57:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -57:
						break;
					case 58:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -58:
						break;
					case 59:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -59:
						break;
					case 60:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -60:
						break;
					case 61:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -61:
						break;
					case 62:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -62:
						break;
					case 63:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -63:
						break;
					case 64:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -64:
						break;
					case 65:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -65:
						break;
					case 66:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -66:
						break;
					case 67:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -67:
						break;
					case 68:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -68:
						break;
					case 69:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -69:
						break;
					case 70:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -70:
						break;
					case 71:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -71:
						break;
					case 72:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -72:
						break;
					case 73:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -73:
						break;
					case 74:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -74:
						break;
					case 75:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -75:
						break;
					case 76:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -76:
						break;
					case 77:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -77:
						break;
					case 78:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -78:
						break;
					case 79:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -79:
						break;
					case 80:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -80:
						break;
					case 81:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -81:
						break;
					case 82:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -82:
						break;
					case 83:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -83:
						break;
					case 84:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -84:
						break;
					case 85:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -85:
						break;
					case 86:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -86:
						break;
					case 87:
						{ CharNum.num += yytext().length(); }
					case -87:
						break;
					case 88:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -88:
						break;
					case 89:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -89:
						break;
					case 90:
						{ Symbol S = new Symbol (sym.ID,
                                                new IdTokenVal(yyline+1, CharNum.num, yytext()));
                                                CharNum.num += yytext().length();
                                                return S;
                                            }
					case -90:
						break;
					default:
						yy_error(YY_E_INTERNAL,false);
					case -1:
					}
					yy_initial = true;
					yy_state = yy_state_dtrans[yy_lexical_state];
					yy_next_state = YY_NO_STATE;
					yy_last_accept_state = YY_NO_STATE;
					yy_mark_start();
					yy_this_accept = yy_acpt[yy_state];
					if (YY_NOT_ACCEPT != yy_this_accept) {
						yy_last_accept_state = yy_state;
						yy_mark_end();
					}
				}
			}
		}
	}
}
