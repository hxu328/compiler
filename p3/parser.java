
//----------------------------------------------------
// The following code was generated by CUP v0.11b ${cupversion} (SVN rev )
//----------------------------------------------------

import java_cup.runtime.*;
import java.util.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b ${cupversion} (SVN rev ) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\026\000\002\002\004\000\002\002\003\000\002\003" +
    "\004\000\002\003\002\000\002\004\003\000\002\004\003" +
    "\000\002\004\003\000\002\015\004\000\002\015\002\000" +
    "\002\005\005\000\002\005\006\000\002\012\006\000\002" +
    "\011\010\000\002\010\004\000\002\010\003\000\002\013" +
    "\004\000\002\014\006\000\002\016\002\000\002\006\003" +
    "\000\002\006\003\000\002\006\003\000\002\007\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\046\000\014\002\ufffe\004\ufffe\005\ufffe\006\ufffe\011" +
    "\ufffe\001\002\000\014\002\000\004\010\005\011\006\013" +
    "\011\012\001\002\000\004\002\006\001\002\000\004\002" +
    "\001\001\002\000\014\002\ufffd\004\ufffd\005\ufffd\006\ufffd" +
    "\011\ufffd\001\002\000\004\020\uffef\001\002\000\004\020" +
    "\uffee\001\002\000\004\020\020\001\002\000\004\020\uffed" +
    "\001\002\000\004\020\020\001\002\000\014\002\uffff\004" +
    "\uffff\005\uffff\006\uffff\011\uffff\001\002\000\014\002\ufffc" +
    "\004\ufffc\005\ufffc\006\ufffc\011\ufffc\001\002\000\014\002" +
    "\ufffb\004\ufffb\005\ufffb\006\ufffb\011\ufffb\001\002\000\012" +
    "\020\uffec\023\uffec\025\uffec\027\uffec\001\002\000\006\025" +
    "\024\027\022\001\002\000\016\002\ufff8\004\ufff8\005\ufff8" +
    "\006\ufff8\011\ufff8\024\ufff8\001\002\000\004\023\026\001" +
    "\002\000\004\026\025\001\002\000\004\023\ufff2\001\002" +
    "\000\014\004\ufff9\005\ufff9\006\ufff9\011\ufff9\024\ufff9\001" +
    "\002\000\014\002\ufff6\004\ufff6\005\ufff6\006\ufff6\011\ufff6" +
    "\001\002\000\014\004\010\005\011\006\013\011\032\024" +
    "\ufff0\001\002\000\004\020\020\001\002\000\004\020\020" +
    "\001\002\000\004\024\035\001\002\000\014\004\ufffa\005" +
    "\ufffa\006\ufffa\011\ufffa\024\ufffa\001\002\000\014\002\ufff1" +
    "\004\ufff1\005\ufff1\006\ufff1\011\ufff1\001\002\000\004\020" +
    "\020\001\002\000\004\027\040\001\002\000\016\002\ufff7" +
    "\004\ufff7\005\ufff7\006\ufff7\011\ufff7\024\ufff7\001\002\000" +
    "\004\027\022\001\002\000\006\020\020\023\043\001\002" +
    "\000\012\004\010\005\011\006\013\011\032\001\002\000" +
    "\014\004\ufff3\005\ufff3\006\ufff3\011\ufff3\024\ufff3\001\002" +
    "\000\014\004\010\005\011\006\013\011\032\024\047\001" +
    "\002\000\014\004\ufff4\005\ufff4\006\ufff4\011\ufff4\024\ufff4" +
    "\001\002\000\004\027\050\001\002\000\014\002\ufff5\004" +
    "\ufff5\005\ufff5\006\ufff5\011\ufff5\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\046\000\006\002\004\003\003\001\001\000\014\004" +
    "\014\005\006\006\013\011\016\012\015\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\007\041\001\001\000\002" +
    "\001\001\000\004\007\020\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\013\022\001\001\000\002\001\001\000\004\014\026\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\015\027" +
    "\001\001\000\002\001\001\000\010\005\033\006\030\016" +
    "\032\001\001\000\004\007\040\001\001\000\004\007\035" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\007\036\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\007\036\001\001\000" +
    "\010\005\043\006\030\010\044\001\001\000\002\001\001" +
    "\000\006\005\045\006\030\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




public void syntax_error(Symbol currToken) {
    if (currToken.value == null) {
        ErrMsg.fatal(0,0, "Syntax error at end of file");
    }
    else {
        ErrMsg.fatal(((TokenVal)currToken.value).lineNum,
                     ((TokenVal)currToken.value).charNum,
                     "Syntax error");
    }
    System.exit(-1);
}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ProgramNode start_val = (ProgramNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // program ::= declList 
            {
              ProgramNode RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		LinkedList d = (LinkedList)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new ProgramNode(new DeclListNode(d));
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // declList ::= declList decl 
            {
              LinkedList RESULT =null;
		int dlleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int dlright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		LinkedList dl = (LinkedList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		DeclNode d = (DeclNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 dl.addLast(d);
                   RESULT = dl;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("declList",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // declList ::= 
            {
              LinkedList RESULT =null;
		 RESULT = new LinkedList<DeclNode>();
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("declList",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // decl ::= varDecl 
            {
              DeclNode RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		VarDeclNode v = (VarDeclNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = v;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("decl",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // decl ::= fnDecl 
            {
              DeclNode RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		FnDeclNode f = (FnDeclNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = f;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("decl",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // decl ::= structDecl 
            {
              DeclNode RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		StructDeclNode s = (StructDeclNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = s;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("decl",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // varDeclList ::= varDeclList varDecl 
            {
              LinkedList RESULT =null;
		int vlleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int vlright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		LinkedList vl = (LinkedList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		VarDeclNode v = (VarDeclNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 vl.addLast(v);
                   RESULT = vl;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("varDeclList",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // varDeclList ::= 
            {
              LinkedList RESULT =null;
		 RESULT = new LinkedList<VarDeclNode>();
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("varDeclList",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // varDecl ::= type id SEMICOLON 
            {
              VarDeclNode RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		TypeNode t = (TypeNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		IdNode i = (IdNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new VarDeclNode(t, i, VarDeclNode.NOT_STRUCT);
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("varDecl",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // varDecl ::= STRUCT id id SEMICOLON 
            {
              VarDeclNode RESULT =null;
		int i1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int i1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		IdNode i1 = (IdNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int i2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int i2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		IdNode i2 = (IdNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new VarDeclNode(new StructNode(i1), i2, 0);
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("varDecl",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // fnDecl ::= type id formals fnBody 
            {
              FnDeclNode RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		TypeNode t = (TypeNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		IdNode i = (IdNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int fmleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int fmright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		LinkedList fm = (LinkedList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int fbleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fbright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		FnBodyNode fb = (FnBodyNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new FnDeclNode(t, i, new FormalsListNode(fm), fb);
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("fnDecl",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // structDecl ::= STRUCT id LCURLY structBody RCURLY SEMICOLON 
            {
              StructDeclNode RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		IdNode i = (IdNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int sbleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int sbright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		LinkedList sb = (LinkedList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 RESULT = new StructDeclNode(i, new DeclListNode(sb));
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("structDecl",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // structBody ::= structBody varDecl 
            {
              LinkedList RESULT =null;
		int sbleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sbright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		LinkedList sb = (LinkedList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int vdleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int vdright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		VarDeclNode vd = (VarDeclNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 sb.addLast(vd);
                   RESULT = sb;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("structBody",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // structBody ::= varDecl 
            {
              LinkedList RESULT =null;
		int vdleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int vdright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		VarDeclNode vd = (VarDeclNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new LinkedList<DeclNode>(Arrays.asList(vd));
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("structBody",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // formals ::= LPAREN RPAREN 
            {
              LinkedList RESULT =null;
		 RESULT = new LinkedList<FormalDeclNode>();
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("formals",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // fnBody ::= LCURLY varDeclList stmtList RCURLY 
            {
              FnBodyNode RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		LinkedList v = (LinkedList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		LinkedList s = (LinkedList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new FnBodyNode(new DeclListNode(v), new StmtListNode(s));
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("fnBody",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // stmtList ::= 
            {
              LinkedList RESULT =null;
		 RESULT = new LinkedList<StmtNode>();
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmtList",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // type ::= INT 
            {
              TypeNode RESULT =null;
		 RESULT = new IntNode();
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("type",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // type ::= BOOL 
            {
              TypeNode RESULT =null;
		 RESULT = new BoolNode();
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("type",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // type ::= VOID 
            {
              TypeNode RESULT =null;
		 RESULT = new VoidNode();
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("type",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // id ::= ID 
            {
              IdNode RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		IdTokenVal i = (IdTokenVal)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new IdNode(i.lineNum, i.charNum, i.idVal);
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("id",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}