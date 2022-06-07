# Overview
This part(P2) of project use JLex to write a scanner for a language called minim, a small subset of the C++ language

## Tokens
The tokens of the minim language are defined as follows:
1. Any of the following reserved words (remember that you will need to give the JLex patterns for reserved words before the pattern for identifier):
- void   bool  int  true  false  struct
- input  disp  if   else  while  return  
2. Any identifier (a sequence of one or more letters and/or digits and/or underscores, starting with a letter or underscore, excluding reserved words).
3. Any integer literal (a sequence of one or more digits).
4. Any string literal (a sequence of zero or more string characters surrounded by double quotes). A string character is either an escaped character: a backslash followed by any one of the following six characters:
- n
- t
- a single quote
- a double quote
- a question mark
- another backslash
- a single character other than newline or double quote or backslash.
5. Any of the following one- or two-character symbols:
- {      }      (      )      ;      
- ,      .      <<     >>     ++
- --     +      -      *      /
- !      &&     ||     ==     !=
- <      >      <=     >=     =
