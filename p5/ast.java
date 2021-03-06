import java.io.*;
import java.util.*;

// **********************************************************************
// The ASTnode class defines the nodes of the abstract-syntax tree that
// represents a minim program.
//
// Internal nodes of the tree contain pointers to children, organized
// either in a list (for nodes that may have a variable number of 
// children) or as a fixed set of fields.
//
// The nodes for literals and ids contain line and character number
// information; for string literals and identifiers, they also contain a
// string; for integer literals, they also contain an integer value.
//
// Here are all the different kinds of AST nodes and what kinds of children
// they have.  All of these kinds of AST nodes are subclasses of "ASTnode".
// Indentation indicates further subclassing:
//
//     Subclass            Kids
//     --------            ----
//     ProgramNode         DeclListNode
//     DeclListNode        linked list of DeclNode
//     DeclNode:
//       VarDeclNode       TypeNode, IdNode, int
//       FnDeclNode        TypeNode, IdNode, FormalsListNode, FnBodyNode
//       FormalDeclNode    TypeNode, IdNode
//       StructDeclNode    IdNode, DeclListNode
//
//     FormalsListNode     linked list of FormalDeclNode
//     FnBodyNode          DeclListNode, StmtListNode
//     StmtListNode        linked list of StmtNode
//     ExpListNode         linked list of ExpNode
//
//     TypeNode:
//       IntNode           -- none --
//       BoolNode          -- none --
//       VoidNode          -- none --
//       StructNode        IdNode
//
//     StmtNode:
//       AssignStmtNode      AssignExpNode
//       PostIncStmtNode     ExpNode
//       PostDecStmtNode     ExpNode
//       ReadStmtNode        ExpNode
//       WriteStmtNode       ExpNode
//       IfStmtNode          ExpNode, DeclListNode, StmtListNode
//       IfElseStmtNode      ExpNode, DeclListNode, StmtListNode,
//                                    DeclListNode, StmtListNode
//       WhileStmtNode       ExpNode, DeclListNode, StmtListNode
//       CallStmtNode        CallExpNode
//       ReturnStmtNode      ExpNode
//
//     ExpNode:
//       IntLitNode          -- none --
//       StrLitNode          -- none --
//       TrueNode            -- none --
//       FalseNode           -- none --
//       IdNode              -- none --
//       DotAccessNode       ExpNode, IdNode
//       AssignExpNode       ExpNode, ExpNode
//       CallExpNode         IdNode, ExpListNode
//       UnaryExpNode        ExpNode
//         UnaryMinusNode
//         NotNode
//       BinaryExpNode       ExpNode ExpNode
//         PlusNode     
//         MinusNode
//         TimesNode
//         DivideNode
//         AndNode
//         OrNode
//         EqualsNode
//         NotEqualsNode
//         LessNode
//         GreaterNode
//         LessEqNode
//         GreaterEqNode
//
// Here are the different kinds of AST nodes again, organized according to
// whether they are leaves, internal nodes with linked lists of kids, or
// internal nodes with a fixed number of kids:
//
// (1) Leaf nodes:
//        IntNode,   BoolNode,  VoidNode,  IntLitNode,  StrLitNode,
//        TrueNode,  FalseNode, IdNode
//
// (2) Internal nodes with (possibly empty) linked lists of children:
//        DeclListNode, FormalsListNode, StmtListNode, ExpListNode
//
// (3) Internal nodes with fixed numbers of kids:
//        ProgramNode,     VarDeclNode,     FnDeclNode,     FormalDeclNode,
//        StructDeclNode,  FnBodyNode,      StructNode,     AssignStmtNode,
//        PostIncStmtNode, PostDecStmtNode, ReadStmtNode,   WriteStmtNode   
//        IfStmtNode,      IfElseStmtNode,  WhileStmtNode,  CallStmtNode
//        ReturnStmtNode,  DotAccessNode,   AssignExpNode,  CallExpNode,
//        UnaryExpNode,    BinaryExpNode,   UnaryMinusNode, NotNode,
//        PlusNode,        MinusNode,       TimesNode,      DivideNode,
//        AndNode,         OrNode,          EqualsNode,     NotEqualsNode,
//        LessNode,        GreaterNode,     LessEqNode,     GreaterEqNode
//
// **********************************************************************

// **********************************************************************
//   ASTnode class (base class for all other kinds of nodes)
// **********************************************************************

abstract class ASTnode { 
    // every subclass must provide an unparse operation
    abstract public void unparse(PrintWriter p, int indent);

    // this method can be used by the unparse methods to do indenting
    protected void doIndent(PrintWriter p, int indent) {
        for (int k=0; k<indent; k++) p.print(" ");
    }

    // Error messages
    protected String write_fnct = "Write attempt of function";
    protected String write_struct_name = "Write attempt of struct name";
    protected String write_struct_var = "Write attempt of struct variable";
    protected String write_void = "Write attempt of void";
    protected String read_fnct = "Read attempt of function";
    protected String read_struct_name = "Read attempt of struct name";
    protected String read_struct_var = "Read attempt of struct variable";
    protected String call_non_fnct = "Call attempt on non-function";
    protected String call_wrg_num_args = "Function call with wrong # of args";
    protected String call_type_mismatch = "Actual type and formal type do not match";
    protected String return_mis = "Return value missing";
    protected String return_to_void = "Return with value in void function";
    protected String return_bad = "Bad return value";
    protected String arith_non_numeric = "Arithmetic operator with non-numeric operand";
    protected String rela_non_numeric = "Relational operator with non-numeric operand";
    protected String logi_non_bool = "Logical operator with non-bool operand";
    protected String if_non_bool = "Non-bool expression in condition of if";
    protected String while_non_bool = "Non-bool expression in condition of while";
    protected String type_mismatch = "Type mismatch";
    protected String equ_void_fnct = "Equality operator used with void functions";
    protected String equ_fnct_name = "Equality operator used with functions";
    protected String equ_struct_name = "Equality operator used with struct names";
    protected String equ_struct_var = "Equality operator used with struct variables";
    protected String assign_fnct_name = "Function assignment";
    protected String assign_struct_name = "Struct name assignment";
    protected String assign_struct_var = "Struct variable assignment";


}

// **********************************************************************
//   ProgramNode,  DeclListNode, FormalsListNode, FnBodyNode,
//   StmtListNode, ExpListNode
// **********************************************************************

class ProgramNode extends ASTnode {
    public ProgramNode(DeclListNode L) {
        myDeclList = L;
    }

    /***
     * nameAnalysis
     * Creates an empty symbol table for the outermost scope, then processes
     * all of the globals, struct defintions, and functions in the program.
     ***/
    public void nameAnalysis() {
        SymTable symTab = new SymTable();
        myDeclList.nameAnalysis(symTab);
    }
    
    public void typeCheck3000(){
        // call typeCheck for its child
        myDeclList.typeCheck3000();
    }

    public void unparse(PrintWriter p, int indent) {
        myDeclList.unparse(p, indent);
    }

    // one kid
    private DeclListNode myDeclList;
}

class DeclListNode extends ASTnode {
    public DeclListNode(List<DeclNode> S) {
        myDecls = S;
    }

    /***
     * nameAnalysis
     * Given a symbol table symTab, process all of the decls in the list.
     ***/
    public void nameAnalysis(SymTable symTab) {
        nameAnalysis(symTab, symTab);
    }
    
    /***
     * nameAnalysis
     * Given a symbol table symTab and a global symbol table globalTab
     * (for processing struct names in variable decls), process all of the 
     * decls in the list.
     ***/    
    public void nameAnalysis(SymTable symTab, SymTable globalTab) {
        for (DeclNode node : myDecls) {
            if (node instanceof VarDeclNode) {
                ((VarDeclNode)node).nameAnalysis(symTab, globalTab);
            } else {
                node.nameAnalysis(symTab);
            }
        }
    }    
    
    public void unparse(PrintWriter p, int indent) {
        Iterator it = myDecls.iterator();
        try {
            while (it.hasNext()) {
                ((DeclNode)it.next()).unparse(p, indent);
            }
        } catch (NoSuchElementException ex) {
            System.err.println("unexpected NoSuchElementException in DeclListNode.print");
            System.exit(-1);
        }
    }

    public void typeCheck3000(){
        for(DeclNode node : myDecls){
            if(node instanceof FnDeclNode){
                ((FnDeclNode)node).typeCheck3000();
            }
        }
    }

    // list of kids (DeclNodes)
    private List<DeclNode> myDecls;
}

class FormalsListNode extends ASTnode {
    public FormalsListNode(List<FormalDeclNode> S) {
        myFormals = S;
    }

    /***
     * nameAnalysis
     * Given a symbol table symTab, do:
     * for each formal decl in the list
     *     process the formal decl
     *     if there was no error, add type of formal decl to list
     ***/
    public List<Type> nameAnalysis(SymTable symTab) {
        List<Type> typeList = new LinkedList<Type>();
        for (FormalDeclNode node : myFormals) {
            Sym sym = node.nameAnalysis(symTab);
            if (sym != null) {
                typeList.add(sym.getType());
            }
        }
        return typeList;
    }    
    
    /***
     * Return the number of formals in this list.
     ***/
    public int length() {
        return myFormals.size();
    }
    
    public void unparse(PrintWriter p, int indent) {
        Iterator<FormalDeclNode> it = myFormals.iterator();
        if (it.hasNext()) { // if there is at least one element
            it.next().unparse(p, indent);
            while (it.hasNext()) {  // print the rest of the list
                p.print(", ");
                it.next().unparse(p, indent);
            }
        } 
    }

    // list of kids (FormalDeclNodes)
    private List<FormalDeclNode> myFormals;
}

class FnBodyNode extends ASTnode {
    public FnBodyNode(DeclListNode declList, StmtListNode stmtList) {
        myDeclList = declList;
        myStmtList = stmtList;
    }

    /***
     * nameAnalysis
     * Given a symbol table symTab, do:
     * - process the declaration list
     * - process the statement list
     ***/
    public void nameAnalysis(SymTable symTab) {
        myDeclList.nameAnalysis(symTab);
        myStmtList.nameAnalysis(symTab);
    }    
    
    public void unparse(PrintWriter p, int indent) {
        myDeclList.unparse(p, indent);
        myStmtList.unparse(p, indent);
    }

    public void typeCheck3000(TypeNode myType){
        myStmtList.typeCheck3000(myType);
    }

    // two kids
    private DeclListNode myDeclList;
    private StmtListNode myStmtList;
}

class StmtListNode extends ASTnode {
    public StmtListNode(List<StmtNode> S) {
        myStmts = S;
    }

    /***
     * nameAnalysis
     * Given a symbol table symTab, process each statement in the list.
     ***/
    public void nameAnalysis(SymTable symTab) {
        for (StmtNode node : myStmts) {
            node.nameAnalysis(symTab);
        }
    }    
    
    public void unparse(PrintWriter p, int indent) {
        Iterator<StmtNode> it = myStmts.iterator();
        while (it.hasNext()) {
            it.next().unparse(p, indent);
        }
    }

    public void typeCheck3000(TypeNode myType){
        for(StmtNode node : myStmts){
            node.typeCheck3000(myType);
        }
    }

    // list of kids (StmtNodes)
    private List<StmtNode> myStmts;
}

class ExpListNode extends ASTnode {
    public ExpListNode(List<ExpNode> S) {
        myExps = S;
    }
    
    /***
     * nameAnalysis
     * Given a symbol table symTab, process each exp in the list.
     ***/
    public void nameAnalysis(SymTable symTab) {
        for (ExpNode node : myExps) {
            node.nameAnalysis(symTab);
        }
    }
    
    public void unparse(PrintWriter p, int indent) {
        Iterator<ExpNode> it = myExps.iterator();
        if (it.hasNext()) { // if there is at least one element
            it.next().unparse(p, indent);
            while (it.hasNext()) {  // print the rest of the list
                p.print(", ");
                it.next().unparse(p, indent);
            }
        } 
    }

    public List<ExpNode> getList(){
        return myExps;
    }

    // list of kids (ExpNodes)
    private List<ExpNode> myExps;
}

// **********************************************************************
// ******  DeclNode and its subclasses
// **********************************************************************

abstract class DeclNode extends ASTnode {
    /***
     * Note: a formal decl needs to return a sym
     ***/
    abstract public Sym nameAnalysis(SymTable symTab);
}

class VarDeclNode extends DeclNode {
    public VarDeclNode(TypeNode type, IdNode id, int size) {
        myType = type;
        myId = id;
        mySize = size;
    }

    /***
     * nameAnalysis (overloaded)
     * Given a symbol table symTab, do:
     * if this name is declared void, then error
     * else if the declaration is of a struct type, 
     *     lookup type name (globally)
     *     if type name doesn't exist, then error
     * if no errors so far,
     *     if name has already been declared in this scope, then error
     *     else add name to local symbol table     
     *
     * symTab is local symbol table (say, for struct field decls)
     * globalTab is global symbol table (for struct type names)
     * symTab and globalTab can be the same
     ***/
    public Sym nameAnalysis(SymTable symTab) {
        return nameAnalysis(symTab, symTab);
    }
    
    public Sym nameAnalysis(SymTable symTab, SymTable globalTab) {
        boolean badDecl = false;
        String name = myId.name();
        Sym sym = null;
        IdNode structId = null;

        if (myType instanceof VoidNode) {  // check for void type
            ErrMsg.fatal(myId.lineNum(), myId.charNum(), 
                         "Non-function declared void");
            badDecl = true;        
        }
        
        else if (myType instanceof StructNode) {
            structId = ((StructNode)myType).idNode();
			try {
				sym = globalTab.lookupGlobal(structId.name());
            
				// if the name for the struct type is not found, 
				// or is not a struct type
				if (sym == null || !(sym instanceof StructDefSym)) {
					ErrMsg.fatal(structId.lineNum(), structId.charNum(), 
								"Name of struct type invalid");
					badDecl = true;
				}
				else {
					structId.link(sym);
				}
			} catch (EmptySymTableException ex) {
				System.err.println("Unexpected EmptySymTableException " +
								    " in VarDeclNode.nameAnalysis");
				System.exit(-1);
			} 
        }
        
		try {
			if (symTab.lookupLocal(name) != null) {
				ErrMsg.fatal(myId.lineNum(), myId.charNum(), 
							"Identifier multiply-declared");
				badDecl = true;            
			}
		} catch (EmptySymTableException ex) {
            System.err.println("Unexpected EmptySymTableException " +
                               " in VarDeclNode.nameAnalysis");
            System.exit(-1);
        } 
        
        if (!badDecl) {  // insert into symbol table
            try {
                if (myType instanceof StructNode) {
                    sym = new StructSym(structId);
                }
                else {
                    sym = new Sym(myType.type());
                }
                symTab.addDecl(name, sym);
                myId.link(sym);
            } catch (DuplicateSymException ex) {
                System.err.println("Unexpected DuplicateSymException " +
                                   " in VarDeclNode.nameAnalysis");
                System.exit(-1);
            } catch (EmptySymTableException ex) {
                System.err.println("Unexpected EmptySymTableException " +
                                   " in VarDeclNode.nameAnalysis");
                System.exit(-1);
            }
        }
        
        return sym;
    }    
    
    public void unparse(PrintWriter p, int indent) {
        doIndent(p, indent);
        myType.unparse(p, 0);
        p.print(" ");
        p.print(myId.name());
        p.println(";");
    }

    // three kids
    private TypeNode myType;
    private IdNode myId;
    private int mySize;  // use value NOT_STRUCT if this is not a struct type

    public static int NOT_STRUCT = -1;
}

class FnDeclNode extends DeclNode {
    public FnDeclNode(TypeNode type,
                      IdNode id,
                      FormalsListNode formalList,
                      FnBodyNode body) {
        myType = type;
        myId = id;
        myFormalsList = formalList;
        myBody = body;
    }

    /***
     * nameAnalysis
     * Given a symbol table symTab, do:
     * if this name has already been declared in this scope, then error
     * else add name to local symbol table
     * in any case, do the following:
     *     enter new scope
     *     process the formals
     *     if this function is not multiply declared,
     *         update symbol table entry with types of formals
     *     process the body of the function
     *     exit scope
     ***/
    public Sym nameAnalysis(SymTable symTab) {
        String name = myId.name();
        FnSym sym = null;
        try {
			if (symTab.lookupLocal(name) != null) {
				ErrMsg.fatal(myId.lineNum(), myId.charNum(),
							"Identifier multiply-declared");
			}
        
			else { // add function name to local symbol table
				try {
					sym = new FnSym(myType.type(), myFormalsList.length());
					symTab.addDecl(name, sym);
					myId.link(sym);
				} catch (DuplicateSymException ex) {
					System.err.println("Unexpected DuplicateSymException " +
									" in FnDeclNode.nameAnalysis");
					System.exit(-1);
				} catch (EmptySymTableException ex) {
					System.err.println("Unexpected EmptySymTableException " +
									" in FnDeclNode.nameAnalysis");
					System.exit(-1);
				}
			}
		} catch (EmptySymTableException ex) {
            System.err.println("Unexpected EmptySymTableException " +
                               " in FnDeclNode.nameAnalysis");
            System.exit(-1);
        } 
        
        symTab.addScope();  // add a new scope for locals and params
        
        // process the formals
        List<Type> typeList = myFormalsList.nameAnalysis(symTab);
        if (sym != null) {
            sym.addFormals(typeList);
        }
        
        myBody.nameAnalysis(symTab); // process the function body
        
        try {
            symTab.removeScope();  // exit scope
        } catch (EmptySymTableException ex) {
            System.err.println("Unexpected EmptySymTableException " +
                               " in FnDeclNode.nameAnalysis");
            System.exit(-1);
        }
        
        return null;
    }    
    
    public void unparse(PrintWriter p, int indent) {
        doIndent(p, indent);
        myType.unparse(p, 0);
        p.print(" ");
        p.print(myId.name());
        p.print("(");
        myFormalsList.unparse(p, 0);
        p.println(") {");
        myBody.unparse(p, indent+4);
        p.println("}\n");
    }

    public void typeCheck3000(){
        myBody.typeCheck3000(myType);
    }

    // 4 kids
    private TypeNode myType;
    private IdNode myId;
    private FormalsListNode myFormalsList;
    private FnBodyNode myBody;
}

class FormalDeclNode extends DeclNode {
    public FormalDeclNode(TypeNode type, IdNode id) {
        myType = type;
        myId = id;
    }

    /***
     * nameAnalysis
     * Given a symbol table symTab, do:
     * if this formal is declared void, then error
     * else if this formal is already in the local symble table,
     *     then issue multiply declared error message and return null
     * else add a new entry to the symbol table and return that Sym
     ***/
    public Sym nameAnalysis(SymTable symTab) {
        String name = myId.name();
        boolean badDecl = false;
        Sym sym = null;
        
        if (myType instanceof VoidNode) {
            ErrMsg.fatal(myId.lineNum(), myId.charNum(), 
                         "Non-function declared void");
            badDecl = true;        
        }
        
        try { 
			if (symTab.lookupLocal(name) != null) {
				ErrMsg.fatal(myId.lineNum(), myId.charNum(), 
							"Identifier multiply-declared");
				badDecl = true;
			}
        } catch (EmptySymTableException ex) {
            System.err.println("Unexpected EmptySymTableException " +
                               " in FormalDeclNode.nameAnalysis");
            System.exit(-1);
        } 
        
        if (!badDecl) {  // insert into symbol table
            try {
                sym = new Sym(myType.type());
                symTab.addDecl(name, sym);
                myId.link(sym);
            } catch (DuplicateSymException ex) {
                System.err.println("Unexpected DuplicateSymException " +
                                   " in FormalDeclNode.nameAnalysis");
                System.exit(-1);
            } catch (EmptySymTableException ex) {
                System.err.println("Unexpected EmptySymTableException " +
                                   " in FormalDeclNode.nameAnalysis");
                System.exit(-1);
            }
        }
        
        return sym;
    }    
    
    public void unparse(PrintWriter p, int indent) {
        myType.unparse(p, 0);
        p.print(" ");
        p.print(myId.name());
    }

    // two kids
    private TypeNode myType;
    private IdNode myId;
}

class StructDeclNode extends DeclNode {
    public StructDeclNode(IdNode id, DeclListNode declList) {
        myId = id;
        myDeclList = declList;
    }

    /***
     * nameAnalysis
     * Given a symbol table symTab, do:
     * if this name is already in the symbol table,
     *     then multiply declared error (don't add to symbol table)
     * create a new symbol table for this struct definition
     * process the decl list
     * if no errors
     *     add a new entry to symbol table for this struct
     ***/
    public Sym nameAnalysis(SymTable symTab) {
        String name = myId.name();
        boolean badDecl = false;
        try {
			if (symTab.lookupLocal(name) != null) {
				ErrMsg.fatal(myId.lineNum(), myId.charNum(), 
							"Identifier multiply-declared");
				badDecl = true;            
			}
		} catch (EmptySymTableException ex) {
            System.err.println("Unexpected EmptySymTableException " +
                               " in StructDeclNode.nameAnalysis");
            System.exit(-1);
        } 

        SymTable structSymTab = new SymTable();
        
        // process the fields of the struct
        myDeclList.nameAnalysis(structSymTab, symTab);
        
        if (!badDecl) {
            try {   // add entry to symbol table
                StructDefSym sym = new StructDefSym(structSymTab);
                symTab.addDecl(name, sym);
                myId.link(sym);
            } catch (DuplicateSymException ex) {
                System.err.println("Unexpected DuplicateSymException " +
                                   " in StructDeclNode.nameAnalysis");
                System.exit(-1);
            } catch (EmptySymTableException ex) {
                System.err.println("Unexpected EmptySymTableException " +
                                   " in StructDeclNode.nameAnalysis");
                System.exit(-1);
            }
        }
        
        return null;
    }    
    
    public void unparse(PrintWriter p, int indent) {
        doIndent(p, indent);
        p.print("struct ");
        p.print(myId.name());
        p.println("{");
        myDeclList.unparse(p, indent+4);
        doIndent(p, indent);
        p.println("};\n");

    }

    // two kids
    private IdNode myId;
    private DeclListNode myDeclList;
}

// **********************************************************************
// ******  TypeNode and its Subclasses
// **********************************************************************

abstract class TypeNode extends ASTnode {
    /* all subclasses must provide a type method */
    abstract public Type type();
}

class IntNode extends TypeNode {
    public IntNode() {
    }

    /***
     * type
     ***/
    public Type type() {
        return new IntType();
    }
    
    public void unparse(PrintWriter p, int indent) {
        p.print("int");
    }
}

class BoolNode extends TypeNode {
    public BoolNode() {
    }

    /***
     * type
     ***/
    public Type type() {
        return new BoolType();
    }
    
    public void unparse(PrintWriter p, int indent) {
        p.print("bool");
    }
}

class VoidNode extends TypeNode {
    public VoidNode() {
    }
    
    /***
     * type
     ***/
    public Type type() {
        return new VoidType();
    }
    
    public void unparse(PrintWriter p, int indent) {
        p.print("void");
    }
}

class StructNode extends TypeNode {
    public StructNode(IdNode id) {
        myId = id;
    }

    public IdNode idNode() {
        return myId;
    }
    
    /***
     * type
     ***/
    public Type type() {
        return new StructType(myId);
    }
    
    public void unparse(PrintWriter p, int indent) {
        p.print("struct ");
        p.print(myId.name());
    }
    
    // one kid
    private IdNode myId;
}

// **********************************************************************
// ******  StmtNode and its subclasses
// **********************************************************************

abstract class StmtNode extends ASTnode {
    abstract public void nameAnalysis(SymTable symTab);
    abstract public void typeCheck3000(TypeNode myType);
}

class AssignStmtNode extends StmtNode {
    public AssignStmtNode(AssignExpNode assign) {
        myAssign = assign;
    }

    /***
     * nameAnalysis
     * Given a symbol table symTab, perform name analysis on this node's child
     ***/
    public void nameAnalysis(SymTable symTab) {
        myAssign.nameAnalysis(symTab);
    }
    
    public void unparse(PrintWriter p, int indent) {
        doIndent(p, indent);
        myAssign.unparse(p, -1); // no parentheses
        p.println(";");
    }

    public void typeCheck3000(TypeNode myType){
        myAssign.nameCheckExp();
    }

    // one kid
    private AssignExpNode myAssign;
}

class PostIncStmtNode extends StmtNode {
    public PostIncStmtNode(ExpNode exp) {
        myExp = exp;
    }
    
    /***
     * nameAnalysis
     * Given a symbol table symTab, perform name analysis on this node's child
     ***/
    public void nameAnalysis(SymTable symTab) {
        myExp.nameAnalysis(symTab);
    }
    
    public void unparse(PrintWriter p, int indent) {
        doIndent(p, indent);
        myExp.unparse(p, 0);
        p.println("++;");
    }

    public void typeCheck3000(TypeNode myType){
        Type expType = myExp.nameCheckExp();
        if(expType.isIntType() || expType.isErrorType()){
            // do nothing
        }else{
            myExp.callErrorMessage(arith_non_numeric);
        }

    }

    // one kid
    private ExpNode myExp;
}

class PostDecStmtNode extends StmtNode {
    public PostDecStmtNode(ExpNode exp) {
        myExp = exp;
    }

    /***
     * nameAnalysis
     * Given a symbol table symTab, perform name analysis on this node's child
     ***/
    public void nameAnalysis(SymTable symTab) {
        myExp.nameAnalysis(symTab);
    }
    
    public void unparse(PrintWriter p, int indent) {
        doIndent(p, indent);
        myExp.unparse(p, 0);
        p.println("--;");
    }

    public void typeCheck3000(TypeNode myType){
        Type expType = myExp.nameCheckExp();
        if(expType.isIntType() || expType.isErrorType()){
            // do nothing
        }else{
            myExp.callErrorMessage(arith_non_numeric);
        }
    }

    // one kid
    private ExpNode myExp;
}

class ReadStmtNode extends StmtNode {
    public ReadStmtNode(ExpNode e) {
        myExp = e;
    }

    /***
     * nameAnalysis
     * Given a symbol table symTab, perform name analysis on this node's child
     ***/
    public void nameAnalysis(SymTable symTab) {
        myExp.nameAnalysis(symTab);
    }    
    
    public void unparse(PrintWriter p, int indent) {
        doIndent(p, indent);
        p.print("cin >> ");
        myExp.unparse(p, 0);
        p.println(";");
    }

    public void typeCheck3000(TypeNode myType){
        Type expType = myExp.nameCheckExp();
        if(expType.isFnType()){
            myExp.callErrorMessage(read_fnct);
        } else if (expType.isStructDefType()){
            myExp.callErrorMessage(read_struct_name);
        } else if (expType.isStructType()){
            myExp.callErrorMessage(read_struct_var);
        } else {
            // do nothing (expType can be int, bool, ErrorType, won't be void or String due to the grammer)
        }
    }

    // one kid (actually can only be an IdNode or an ArrayExpNode)
    private ExpNode myExp;
}

class WriteStmtNode extends StmtNode {
    public WriteStmtNode(ExpNode exp) {
        myExp = exp;
    }

    /***
     * nameAnalysis
     * Given a symbol table symTab, perform name analysis on this node's child
     ***/
    public void nameAnalysis(SymTable symTab) {
        myExp.nameAnalysis(symTab);
    }
    
    public void unparse(PrintWriter p, int indent) {
        doIndent(p, indent);
        p.print("cout << ");
        myExp.unparse(p, 0);
        p.println(";");
    }

    public void typeCheck3000(TypeNode myType){
        Type expType = myExp.nameCheckExp();
        if(expType.isFnType()){
            myExp.callErrorMessage(write_fnct);
        } else if (expType.isStructDefType()){
            myExp.callErrorMessage(write_struct_name);
        } else if (expType.isStructType()){
            myExp.callErrorMessage(write_struct_var);
        } else if (expType.isVoidType()){
            myExp.callErrorMessage(write_void);
        } else {
            // do nothing (expType is int, bool, String, ErrorType)
        }
    }

    // one kid
    private ExpNode myExp;
}

class IfStmtNode extends StmtNode {
    public IfStmtNode(ExpNode exp, DeclListNode dlist, StmtListNode slist) {
        myDeclList = dlist;
        myExp = exp;
        myStmtList = slist;
    }
    
    /***
     * nameAnalysis
     * Given a symbol table symTab, do:
     * - process the condition
     * - enter a new scope
     * - process the decls and stmts
     * - exit the scope
     ***/
    public void nameAnalysis(SymTable symTab) {
        myExp.nameAnalysis(symTab);
        symTab.addScope();
        myDeclList.nameAnalysis(symTab);
        myStmtList.nameAnalysis(symTab);
        try {
            symTab.removeScope();
        } catch (EmptySymTableException ex) {
            System.err.println("Unexpected EmptySymTableException " +
                               " in IfStmtNode.nameAnalysis");
            System.exit(-1);        
        }
    }
    
    public void unparse(PrintWriter p, int indent) {
        doIndent(p, indent);
        p.print("if (");
        myExp.unparse(p, 0);
        p.println(") {");
        myDeclList.unparse(p, indent+4);
        myStmtList.unparse(p, indent+4);
        doIndent(p, indent);
        p.println("}");
    }

    public void typeCheck3000(TypeNode myType){
        Type condType = myExp.nameCheckExp();
        if((!condType.isBoolType()) && (!condType.isErrorType())){
            myExp.callErrorMessage(if_non_bool);
        }

        myStmtList.typeCheck3000(myType);
        

    }
    
    // three kids
    private ExpNode myExp;
    private DeclListNode myDeclList;
    private StmtListNode myStmtList;
}

class IfElseStmtNode extends StmtNode {
    public IfElseStmtNode(ExpNode exp, DeclListNode dlist1,
                          StmtListNode slist1, DeclListNode dlist2,
                          StmtListNode slist2) {
        myExp = exp;
        myThenDeclList = dlist1;
        myThenStmtList = slist1;
        myElseDeclList = dlist2;
        myElseStmtList = slist2;
    }
    
    /***
     * nameAnalysis
     * Given a symbol table symTab, do:
     * - process the condition
     * - enter a new scope
     * - process the decls and stmts of then
     * - exit the scope
     * - enter a new scope
     * - process the decls and stmts of else
     * - exit the scope
     ***/
    public void nameAnalysis(SymTable symTab) {
        myExp.nameAnalysis(symTab);
        symTab.addScope();
        myThenDeclList.nameAnalysis(symTab);
        myThenStmtList.nameAnalysis(symTab);
        try {
            symTab.removeScope();
        } catch (EmptySymTableException ex) {
            System.err.println("Unexpected EmptySymTableException " +
                               " in IfStmtNode.nameAnalysis");
            System.exit(-1);        
        }
        symTab.addScope();
        myElseDeclList.nameAnalysis(symTab);
        myElseStmtList.nameAnalysis(symTab);
        try {
            symTab.removeScope();
        } catch (EmptySymTableException ex) {
            System.err.println("Unexpected EmptySymTableException " +
                               " in IfStmtNode.nameAnalysis");
            System.exit(-1);        
        }
    }
    
    public void unparse(PrintWriter p, int indent) {
        doIndent(p, indent);
        p.print("if (");
        myExp.unparse(p, 0);
        p.println(") {");
        myThenDeclList.unparse(p, indent+4);
        myThenStmtList.unparse(p, indent+4);
        doIndent(p, indent);
        p.println("}");
        doIndent(p, indent);
        p.println("else {");
        myElseDeclList.unparse(p, indent+4);
        myElseStmtList.unparse(p, indent+4);
        doIndent(p, indent);
        p.println("}");        
    }

    public void typeCheck3000(TypeNode myType){
        Type condType = myExp.nameCheckExp();
        if((!condType.isBoolType()) && (!condType.isErrorType())){
            myExp.callErrorMessage(if_non_bool);
        }

        myThenStmtList.typeCheck3000(myType);
        myElseStmtList.typeCheck3000(myType);
    }

    // 5 kids
    private ExpNode myExp;
    private DeclListNode myThenDeclList;
    private StmtListNode myThenStmtList;
    private StmtListNode myElseStmtList;
    private DeclListNode myElseDeclList;
}

class WhileStmtNode extends StmtNode {
    public WhileStmtNode(ExpNode exp, DeclListNode dlist, StmtListNode slist) {
        myExp = exp;
        myDeclList = dlist;
        myStmtList = slist;
    }
    
    /***
     * nameAnalysis
     * Given a symbol table symTab, do:
     * - process the condition
     * - enter a new scope
     * - process the decls and stmts
     * - exit the scope
     ***/
    public void nameAnalysis(SymTable symTab) {
        myExp.nameAnalysis(symTab);
        symTab.addScope();
        myDeclList.nameAnalysis(symTab);
        myStmtList.nameAnalysis(symTab);
        try {
            symTab.removeScope();
        } catch (EmptySymTableException ex) {
            System.err.println("Unexpected EmptySymTableException " +
                               " in IfStmtNode.nameAnalysis");
            System.exit(-1);        
        }
    }
    
    public void unparse(PrintWriter p, int indent) {
        doIndent(p, indent);
        p.print("while (");
        myExp.unparse(p, 0);
        p.println(") {");
        myDeclList.unparse(p, indent+4);
        myStmtList.unparse(p, indent+4);
        doIndent(p, indent);
        p.println("}");
    }

    public void typeCheck3000(TypeNode myType){
        Type condType = myExp.nameCheckExp();
        if((!condType.isBoolType()) && (!condType.isErrorType())){
            myExp.callErrorMessage(while_non_bool);
        }

        myStmtList.typeCheck3000(myType);
    }

    // three kids
    private ExpNode myExp;
    private DeclListNode myDeclList;
    private StmtListNode myStmtList;
}

class CallStmtNode extends StmtNode {
    public CallStmtNode(CallExpNode call) {
        myCall = call;
    }
    
    /***
     * nameAnalysis
     * Given a symbol table symTab, perform name analysis on this node's child
     ***/
    public void nameAnalysis(SymTable symTab) {
        myCall.nameAnalysis(symTab);
    }

    public void unparse(PrintWriter p, int indent) {
        doIndent(p, indent);
        myCall.unparse(p, indent);
        p.println(";");
    }

    public void typeCheck3000(TypeNode myType){
        myCall.nameCheckExp();
    }

    // one kid
    private CallExpNode myCall;
}

class ReturnStmtNode extends StmtNode {
    public ReturnStmtNode(ExpNode exp) {
        myExp = exp;
    }
    
    /***
     * nameAnalysis
     * Given a symbol table symTab, perform name analysis on this node's child,
     * if it has one
     ***/
    public void nameAnalysis(SymTable symTab) {
        if (myExp != null) {
            myExp.nameAnalysis(symTab);
        }
    }

    public void unparse(PrintWriter p, int indent) {
        doIndent(p, indent);
        p.print("return");
        if (myExp != null) {
            p.print(" ");
            myExp.unparse(p, 0);
        }
        p.println(";");
    }

    public void typeCheck3000(TypeNode myType){
        Type retType = myType.type();
        if(!retType.isVoidType()){  // function is non-void
            if(myExp == null){
                ErrMsg.fatal(0,0,return_mis);
                return;
            }
            Type expType = myExp.nameCheckExp();
            if(retType.equals(expType) || expType.isErrorType()){
                return;
            } else {
                myExp.callErrorMessage(return_bad);
                return;
            }
        } else {  // function is void
            if(myExp != null){
                myExp.callErrorMessage(return_to_void);
            }
            return;
        }
    }

    // one kid
    private ExpNode myExp; // possibly null
}

// **********************************************************************
// ******  ExpNode and its subclasses
// **********************************************************************

abstract class ExpNode extends ASTnode {
    /***
     * Default version for nodes with no names
     ***/
    public void nameAnalysis(SymTable symTab) { }
    abstract public Type nameCheckExp();
    abstract public void callErrorMessage(String msg);
}

class IntLitNode extends ExpNode {
    public IntLitNode(int lineNum, int charNum, int intVal) {
        myLineNum = lineNum;
        myCharNum = charNum;
        myIntVal = intVal;
    }

    public void unparse(PrintWriter p, int indent) {
        p.print(myIntVal);
    }

    public void callErrorMessage(String msg){
        ErrMsg.fatal(myLineNum, myCharNum, msg);
    }

    public Type nameCheckExp() {
        Type myType = new IntType();
        return myType;
    }

    private int myLineNum;
    private int myCharNum;
    private int myIntVal;
}

class StringLitNode extends ExpNode {
    public StringLitNode(int lineNum, int charNum, String strVal) {
        myLineNum = lineNum;
        myCharNum = charNum;
        myStrVal = strVal;
    }

    public void unparse(PrintWriter p, int indent) {
        p.print(myStrVal);
    }

    public void callErrorMessage(String msg){
        ErrMsg.fatal(myLineNum, myCharNum, msg);
    }

    public Type nameCheckExp() {
        Type myType = new StringType();
        return myType;
    }

    private int myLineNum;
    private int myCharNum;
    private String myStrVal;
}

class TrueNode extends ExpNode {
    public TrueNode(int lineNum, int charNum) {
        myLineNum = lineNum;
        myCharNum = charNum;
    }

    public void unparse(PrintWriter p, int indent) {
        p.print("true");
    }

    public void callErrorMessage(String msg){
        ErrMsg.fatal(myLineNum, myCharNum, msg);
    }

    public Type nameCheckExp() {
        Type myType = new BoolType();
        return myType;
    }

    private int myLineNum;
    private int myCharNum;
}

class FalseNode extends ExpNode {
    public FalseNode(int lineNum, int charNum) {
        myLineNum = lineNum;
        myCharNum = charNum;
    }

    public void unparse(PrintWriter p, int indent) {
        p.print("false");
    }

    public void callErrorMessage(String msg){
        ErrMsg.fatal(myLineNum, myCharNum, msg);
    }

    public Type nameCheckExp() {
        Type myType = new BoolType();
        return myType;
    }

    private int myLineNum;
    private int myCharNum;
}

class IdNode extends ExpNode {
    public IdNode(int lineNum, int charNum, String strVal) {
        myLineNum = lineNum;
        myCharNum = charNum;
        myStrVal = strVal;
    }

    /***
     * Link the given symbol to this ID.
     ***/
    public void link(Sym sym) {
        mySym = sym;
    }
    
    /***
     * Return the name of this ID.
     ***/
    public String name() {
        return myStrVal;
    }
    
    /***
     * Return the symbol associated with this ID.
     ***/
    public Sym sym() {
        return mySym;
    }
    
    /***
     * Return the line number for this ID.
     ***/
    public int lineNum() {
        return myLineNum;
    }
    
    /***
     * Return the char number for this ID.
     ***/
    public int charNum() {
        return myCharNum;
    }

    public void callErrorMessage(String msg){
        ErrMsg.fatal(myLineNum, myCharNum, msg);
    }

    public Type nameCheckExp() {
        Type myType = mySym.getType();
        return myType;
    }   
    
    /***
     * nameAnalysis
     * Given a symbol table symTab, do:
     * - check for use of undeclared name
     * - if ok, link to symbol table entry
     ***/
    public void nameAnalysis(SymTable symTab) {
		try {
            Sym sym = symTab.lookupGlobal(myStrVal);
            if (sym == null) {
                ErrMsg.fatal(myLineNum, myCharNum, "Identifier undeclared");
            } else {
                link(sym);
            }
        } catch (EmptySymTableException ex) {
            System.err.println("Unexpected EmptySymTableException " +
                               " in IdNode.nameAnalysis");
            System.exit(-1);
        } 
    }
    
    public void unparse(PrintWriter p, int indent) {
        p.print(myStrVal);
        if (mySym != null) {
            p.print("(" + mySym + ")");
        }
    }

    private int myLineNum;
    private int myCharNum;
    private String myStrVal;
    private Sym mySym;
}

class DotAccessExpNode extends ExpNode {
    public DotAccessExpNode(ExpNode loc, IdNode id) {
        myLoc = loc;    
        myId = id;
        mySym = null;
    }

    /***
     * Return the symbol associated with this dot-access node.
     ***/
    public Sym sym() {
        return mySym;
    }    
    
    /***
     * Return the line number for this dot-access node. 
     * The line number is the one corresponding to the RHS of the dot-access.
     ***/
    public int lineNum() {
        return myId.lineNum();
    }
    
    /***
     * Return the char number for this dot-access node.
     * The char number is the one corresponding to the RHS of the dot-access.
     ***/
    public int charNum() {
        return myId.charNum();
    }
    
    /***
     * nameAnalysis
     * Given a symbol table symTab, do:
     * - process the LHS of the dot-access
     * - process the RHS of the dot-access
     * - if the RHS is of a struct type, set the sym for this node so that
     *   a dot-access "higher up" in the AST can get access to the symbol
     *   table for the appropriate struct definition
     ***/
    public void nameAnalysis(SymTable symTab) {
        badAccess = false;
        SymTable structSymTab = null; // to lookup RHS of dot-access
        Sym sym = null;
        
        myLoc.nameAnalysis(symTab);  // do name analysis on LHS
        
        // if myLoc is really an ID, then sym will be a link to the ID's symbol
        if (myLoc instanceof IdNode) {
            IdNode id = (IdNode)myLoc;
            sym = id.sym();
            
            // check ID has been declared to be of a struct type
            
            if (sym == null) { // ID was undeclared
                badAccess = true;
            }
            else if (sym instanceof StructSym) { 
                // get symbol table for struct type
                Sym tempSym = ((StructSym)sym).getStructType().sym();
                structSymTab = ((StructDefSym)tempSym).getSymTable();
            } 
            else {  // LHS is not a struct type
                ErrMsg.fatal(id.lineNum(), id.charNum(), 
                             "Dot-access of non-struct type");
                badAccess = true;
            }
        }
        
        // if myLoc is really a dot-access (i.e., myLoc was of the form
        // LHSloc.RHSid), then sym will either be
        // null - indicating RHSid is not of a struct type, or
        // a link to the Sym for the struct type RHSid was declared to be
        else if (myLoc instanceof DotAccessExpNode) {
            DotAccessExpNode loc = (DotAccessExpNode)myLoc;
            
            if (loc.badAccess) {  // if errors in processing myLoc
                badAccess = true; // don't continue proccessing this dot-access
            }
            else { //  no errors in processing myLoc
                sym = loc.sym();

                if (sym == null) {  // no struct in which to look up RHS
                    ErrMsg.fatal(loc.lineNum(), loc.charNum(), 
                                 "Dot-access of non-struct type");
                    badAccess = true;
                }
                else {  // get the struct's symbol table in which to lookup RHS
                    if (sym instanceof StructDefSym) {
                        structSymTab = ((StructDefSym)sym).getSymTable();
                    }
                    else {
                        System.err.println("Unexpected Sym type in DotAccessExpNode");
                        System.exit(-1);
                    }
                }
            }

        }
        
        else { // don't know what kind of thing myLoc is
            System.err.println("Unexpected node type in LHS of dot-access");
            System.exit(-1);
        }
        
        // do name analysis on RHS of dot-access in the struct's symbol table
        if (!badAccess) {
			try {
				sym = structSymTab.lookupGlobal(myId.name()); // lookup
				if (sym == null) { // not found - RHS is not a valid field name
					ErrMsg.fatal(myId.lineNum(), myId.charNum(), 
								"Struct field name invalid");
					badAccess = true;
				}
            
				else {
					myId.link(sym);  // link the symbol
					// if RHS is itself as struct type, link the symbol for its struct 
					// type to this dot-access node (to allow chained dot-access)
					if (sym instanceof StructSym) {
						mySym = ((StructSym)sym).getStructType().sym();
					}
				}
			} catch (EmptySymTableException ex) {
				System.err.println("Unexpected EmptySymTableException " +
								" in DotAccessExpNode.nameAnalysis");
				System.exit(-1);
			} 
        }
    }    
    
    public void unparse(PrintWriter p, int indent) {
        myLoc.unparse(p, 0);
        p.print(".");
        myId.unparse(p, 0);
    }

    public void callErrorMessage(String msg){
        myLoc.callErrorMessage(msg);
    }

    public Type nameCheckExp() {
        return myId.nameCheckExp();
    }



    // two kids
    private ExpNode myLoc;    
    private IdNode myId;
    private Sym mySym;          // link to Sym for struct type
    private boolean badAccess;  // to prevent multiple, cascading errors
}

class AssignExpNode extends ExpNode {
    public AssignExpNode(ExpNode lhs, ExpNode exp) {
        myLhs = lhs;
        myExp = exp;
    }

    /***
     * nameAnalysis
     * Given a symbol table symTab, perform name analysis on this node's 
     * two children
     ***/
    public void nameAnalysis(SymTable symTab) {
        myLhs.nameAnalysis(symTab);
        myExp.nameAnalysis(symTab);
    }
    
	// *** unparse ***
    public void unparse(PrintWriter p, int indent) {
        if (indent != -1)  p.print("(");
        myLhs.unparse(p, 0);
        p.print(" = ");
        myExp.unparse(p, 0);
        if (indent != -1)  p.print(")");
    }

    public void callErrorMessage(String msg){
        myLhs.callErrorMessage(msg);
    }

    public Type nameCheckExp() {
        Type lhsType = myLhs.nameCheckExp();  // can't be error type
        Type rhsType = myExp.nameCheckExp();

        if(!lhsType.equals(rhsType)){
            if(!lhsType.isErrorType() && !rhsType.isErrorType()){
                myLhs.callErrorMessage(type_mismatch);
            }
            return new ErrorType();
        }

        if(lhsType.isFnType() && rhsType.isFnType()){
            myLhs.callErrorMessage(assign_fnct_name);
            return new ErrorType();
        }

        if(lhsType.isStructDefType() && rhsType.isStructDefType()){
            myLhs.callErrorMessage(assign_struct_name);
            return new ErrorType();
        }

        if(lhsType.isStructType() && rhsType.isStructType()){
            myLhs.callErrorMessage(assign_struct_var);
            return new ErrorType();
        }

        if(!lhsType.isErrorType() && !rhsType.isErrorType()){
            return rhsType;
        } else {
            return new ErrorType();
        }

    }

    // two kids
    private ExpNode myLhs;
    private ExpNode myExp;
}

class CallExpNode extends ExpNode {
    public CallExpNode(IdNode name, ExpListNode elist) {
        myId = name;
        myExpList = elist;
    }

    public CallExpNode(IdNode name) {
        myId = name;
        myExpList = new ExpListNode(new LinkedList<ExpNode>());
    }

    /***
     * nameAnalysis
     * Given a symbol table symTab, perform name analysis on this node's 
     * two children
     ***/
    public void nameAnalysis(SymTable symTab) {
        myId.nameAnalysis(symTab);
        myExpList.nameAnalysis(symTab);
    }    
    
    public void unparse(PrintWriter p, int indent) {
        myId.unparse(p, 0);
        p.print("(");
        if (myExpList != null) {
            myExpList.unparse(p, 0);
        }
        p.print(")");
    }

    public void callErrorMessage(String msg){
        myId.callErrorMessage(msg);
    }

    public Type nameCheckExp() {
        Type myType = myId.nameCheckExp();
        if(!myType.isFnType()){  // myId is non-function
            myId.callErrorMessage(call_non_fnct);
            return new ErrorType();
        }

        Sym expSym = myId.sym();
        Type retType = ((FnSym)expSym).getReturnType();
        int numParams = ((FnSym)expSym).getNumParams();
        List<ExpNode> exps = myExpList.getList();

        // # of args in fnct def is 0
        if(numParams == 0){
            if(exps.size() != 0){
                myId.callErrorMessage(call_wrg_num_args);
            }
            return retType;
        }

        // # of args in fnct def is > 0
        if(numParams != exps.size()){  // wrong # of args
            myId.callErrorMessage(call_wrg_num_args);
            return retType;
        }

        // check types (# args > 0)
        List<Type> types = ((FnSym)expSym).getParamTypes();
        for(int i = 0; i < exps.size(); i++){
            Type tempType1 = (exps.get(i)).nameCheckExp();
            Type tempType2 = types.get(i);
            if(tempType1.equals(tempType2) || tempType1.isErrorType()){
                continue;
            } else {
                (exps.get(i)).callErrorMessage(call_type_mismatch);
            }
        }


        return retType;
    }

    // two kids
    private IdNode myId;
    private ExpListNode myExpList;  // possibly null
}

abstract class UnaryExpNode extends ExpNode {
    public UnaryExpNode(ExpNode exp) {
        myExp = exp;
    }

    /***
     * nameAnalysis
     * Given a symbol table symTab, perform name analysis on this node's child
     ***/
    public void nameAnalysis(SymTable symTab) {
        myExp.nameAnalysis(symTab);
    }
    
    // one child
    protected ExpNode myExp;
}

abstract class BinaryExpNode extends ExpNode {
    public BinaryExpNode(ExpNode exp1, ExpNode exp2) {
        myExp1 = exp1;
        myExp2 = exp2;
    }

    /***
     * nameAnalysis
     * Given a symbol table symTab, perform name analysis on this node's 
     * two children
     ***/
    public void nameAnalysis(SymTable symTab) {
        myExp1.nameAnalysis(symTab);
        myExp2.nameAnalysis(symTab);
    }
    
    // two kids
    protected ExpNode myExp1;
    protected ExpNode myExp2;
}

// **********************************************************************
// ******  Subclasses of UnaryExpNode
// **********************************************************************

class UnaryMinusNode extends UnaryExpNode {
    public UnaryMinusNode(ExpNode exp) {
        super(exp);
    }

    public void unparse(PrintWriter p, int indent) {
        p.print("(-");
        myExp.unparse(p, 0);
        p.print(")");
    }

    public void callErrorMessage(String msg){
        myExp.callErrorMessage(msg);
    }

    public Type nameCheckExp() {
        Type myType = myExp.nameCheckExp();
        if(myType.isIntType()){
            return myType;
        }else if (myType.isErrorType()){
            return myType;
        }else{
            myType = new ErrorType();
            myExp.callErrorMessage(arith_non_numeric);
            return myType;
        }
    }
}

class NotNode extends UnaryExpNode {
    public NotNode(ExpNode exp) {
        super(exp);
    }

    public void unparse(PrintWriter p, int indent) {
        p.print("(!");
        myExp.unparse(p, 0);
        p.print(")");
    }

    public void callErrorMessage(String msg){
        myExp.callErrorMessage(msg);
    }

    public Type nameCheckExp() {
        Type myType = myExp.nameCheckExp();
        if(myType.isBoolType()){
            return myType;
        }else if (myType.isErrorType()){
            return myType;
        }else{
            myType = new ErrorType();
            myExp.callErrorMessage(logi_non_bool);
            return myType;
        }

    }
}

// **********************************************************************
// ******  Subclasses of BinaryExpNode
// **********************************************************************

class PlusNode extends BinaryExpNode {
    public PlusNode(ExpNode exp1, ExpNode exp2) {
        super(exp1, exp2);
    }

    public void unparse(PrintWriter p, int indent) {
        p.print("(");
        myExp1.unparse(p, 0);
        p.print(" + ");
        myExp2.unparse(p, 0);
        p.print(")");
    }

    public void callErrorMessage(String msg){
        myExp1.callErrorMessage(msg);
    }

    public Type nameCheckExp() {
        Type myType1 = myExp1.nameCheckExp();
        Type myType2 = myExp2.nameCheckExp();
        if((!myType1.isIntType()) && (!myType1.isErrorType())){
            myExp1.callErrorMessage(arith_non_numeric);
        }
        if((!myType2.isIntType()) && (!myType2.isErrorType())){
            myExp2.callErrorMessage(arith_non_numeric);
        }

        if(myType1.isIntType() && myType2.isIntType()){ // lhs and rhs operands are good
            return myType1;
        }else{
            return new ErrorType();
        }
    }
}

class MinusNode extends BinaryExpNode {
    public MinusNode(ExpNode exp1, ExpNode exp2) {
        super(exp1, exp2);
    }

    public void unparse(PrintWriter p, int indent) {
        p.print("(");
        myExp1.unparse(p, 0);
        p.print(" - ");
        myExp2.unparse(p, 0);
        p.print(")");
    }

    public void callErrorMessage(String msg){
        myExp1.callErrorMessage(msg);
    }

    public Type nameCheckExp() {
        Type myType1 = myExp1.nameCheckExp();
        Type myType2 = myExp2.nameCheckExp();
        if((!myType1.isIntType()) && (!myType1.isErrorType())){
            myExp1.callErrorMessage(arith_non_numeric);
        }
        if((!myType2.isIntType()) && (!myType2.isErrorType())){
            myExp2.callErrorMessage(arith_non_numeric);
        }

        if(myType1.isIntType() && myType2.isIntType()){ // lhs and rhs operands are good
            return myType1;
        }else{
            return new ErrorType();
        }
    }
}

class TimesNode extends BinaryExpNode {
    public TimesNode(ExpNode exp1, ExpNode exp2) {
        super(exp1, exp2);
    }

    public void unparse(PrintWriter p, int indent) {
        p.print("(");
        myExp1.unparse(p, 0);
        p.print(" * ");
        myExp2.unparse(p, 0);
        p.print(")");
    }

    public void callErrorMessage(String msg){
        myExp1.callErrorMessage(msg);
    }

    public Type nameCheckExp() {
        Type myType1 = myExp1.nameCheckExp();
        Type myType2 = myExp2.nameCheckExp();
        if((!myType1.isIntType()) && (!myType1.isErrorType())){
            myExp1.callErrorMessage(arith_non_numeric);
        }
        if((!myType2.isIntType()) && (!myType2.isErrorType())){
            myExp2.callErrorMessage(arith_non_numeric);
        }

        if(myType1.isIntType() && myType2.isIntType()){ // lhs and rhs operands are good
            return myType1;
        }else{
            return new ErrorType();
        }
    }
}

class DivideNode extends BinaryExpNode {
    public DivideNode(ExpNode exp1, ExpNode exp2) {
        super(exp1, exp2);
    }

    public void callErrorMessage(String msg){
        myExp1.callErrorMessage(msg);
    }

    public void unparse(PrintWriter p, int indent) {
        p.print("(");
        myExp1.unparse(p, 0);
        p.print(" / ");
        myExp2.unparse(p, 0);
        p.print(")");
    }

    public Type nameCheckExp() {
        Type myType1 = myExp1.nameCheckExp();
        Type myType2 = myExp2.nameCheckExp();
        if((!myType1.isIntType()) && (!myType1.isErrorType())){
            myExp1.callErrorMessage(arith_non_numeric);
        }
        if((!myType2.isIntType()) && (!myType2.isErrorType())){
            myExp2.callErrorMessage(arith_non_numeric);
        }

        if(myType1.isIntType() && myType2.isIntType()){ // lhs and rhs operands are good
            return myType1;
        }else{
            return new ErrorType();
        }
    }
}

class AndNode extends BinaryExpNode {
    public AndNode(ExpNode exp1, ExpNode exp2) {
        super(exp1, exp2);
    }

    public void unparse(PrintWriter p, int indent) {
        p.print("(");
        myExp1.unparse(p, 0);
        p.print(" && ");
        myExp2.unparse(p, 0);
        p.print(")");
    }

    public void callErrorMessage(String msg){
        myExp1.callErrorMessage(msg);
    }

    public Type nameCheckExp() {
        Type myType1 = myExp1.nameCheckExp();
        Type myType2 = myExp2.nameCheckExp();
        if((!myType1.isBoolType()) && (!myType1.isErrorType())){
            myExp1.callErrorMessage(logi_non_bool);
        }
        if((!myType2.isBoolType()) && (!myType2.isErrorType())){
            myExp2.callErrorMessage(logi_non_bool);
        }

        if(myType1.isBoolType() && myType2.isBoolType()){ // lhs and rhs operands are good
            return myType1;
        }else{
            return new ErrorType();
        }
    }
}

class OrNode extends BinaryExpNode {
    public OrNode(ExpNode exp1, ExpNode exp2) {
        super(exp1, exp2);
    }

    public void unparse(PrintWriter p, int indent) {
        p.print("(");
        myExp1.unparse(p, 0);
        p.print(" || ");
        myExp2.unparse(p, 0);
        p.print(")");
    }

    public void callErrorMessage(String msg){
        myExp1.callErrorMessage(msg);
    }

    public Type nameCheckExp() {
        Type myType1 = myExp1.nameCheckExp();
        Type myType2 = myExp2.nameCheckExp();
        if((!myType1.isBoolType()) && (!myType1.isErrorType())){
            myExp1.callErrorMessage(logi_non_bool);
        }
        if((!myType2.isBoolType()) && (!myType2.isErrorType())){
            myExp2.callErrorMessage(logi_non_bool);
        }

        if(myType1.isBoolType() && myType2.isBoolType()){ // lhs and rhs operands are good
            return myType1;
        }else{
            return new ErrorType();
        }
    }
}

class EqualsNode extends BinaryExpNode {
    public EqualsNode(ExpNode exp1, ExpNode exp2) {
        super(exp1, exp2);
    }

    public void unparse(PrintWriter p, int indent) {
        p.print("(");
        myExp1.unparse(p, 0);
        p.print(" == ");
        myExp2.unparse(p, 0);
        p.print(")");
    }

    public void callErrorMessage(String msg){
        myExp1.callErrorMessage(msg);
    }

    public Type nameCheckExp() {
        Type myType1 = myExp1.nameCheckExp();
        Type myType2 = myExp2.nameCheckExp();

        // check mismatch
        if(!myType1.equals(myType2)){
            if(!myType1.isErrorType() && !myType2.isErrorType()){
                myExp1.callErrorMessage(type_mismatch);
            }
            return new ErrorType();
        }

        // check void operands
        if(myType1.isVoidType() && myType2.isVoidType()){
            myExp1.callErrorMessage(equ_void_fnct);
            return new ErrorType();
        }

        // check fnct name operands
        if(myType1.isFnType() && myType2.isFnType()){
            myExp1.callErrorMessage(equ_fnct_name);
            return new ErrorType();
        }

        // check struct name operands
        if(myType1.isStructDefType() && myType2.isStructDefType()){
            myExp1.callErrorMessage(equ_struct_name);
            return new ErrorType();
        }

        // check struct variable operands
        if(myType1.isStructType() && myType2.isStructType()){
            myExp1.callErrorMessage(equ_struct_var);
            return new ErrorType();
        }

        if(!myType1.isErrorType() && !myType2.isErrorType()){
            return new BoolType();
        } else {
            return new ErrorType();
        }


    }
}

class NotEqualsNode extends BinaryExpNode {
    public NotEqualsNode(ExpNode exp1, ExpNode exp2) {
        super(exp1, exp2);
    }

    public void unparse(PrintWriter p, int indent) {
        p.print("(");
        myExp1.unparse(p, 0);
        p.print(" != ");
        myExp2.unparse(p, 0);
        p.print(")");
    }

    public void callErrorMessage(String msg){
        myExp1.callErrorMessage(msg);
    }

    public Type nameCheckExp() {
        Type myType1 = myExp1.nameCheckExp();
        Type myType2 = myExp2.nameCheckExp();

        // check mismatch
        if(!myType1.equals(myType2)){
            if(!myType1.isErrorType() && !myType2.isErrorType()){
                myExp1.callErrorMessage(type_mismatch);
            }
            return new ErrorType();
        }

        // check void operands
        if(myType1.isVoidType() && myType2.isVoidType()){
            myExp1.callErrorMessage(equ_void_fnct);
            return new ErrorType();
        }

        // check fnct name operands
        if(myType1.isFnType() && myType2.isFnType()){
            myExp1.callErrorMessage(equ_fnct_name);
            return new ErrorType();
        }

        // check struct name operands
        if(myType1.isStructDefType() && myType2.isStructDefType()){
            myExp1.callErrorMessage(equ_struct_name);
            return new ErrorType();
        }

        // check struct variable operands
        if(myType1.isStructType() && myType2.isStructType()){
            myExp1.callErrorMessage(equ_struct_var);
            return new ErrorType();
        }

        if(!myType1.isErrorType() && !myType2.isErrorType()){
            return new BoolType();
        } else {
            return new ErrorType();
        }


    }
}

class LessNode extends BinaryExpNode {
    public LessNode(ExpNode exp1, ExpNode exp2) {
        super(exp1, exp2);
    }

    public void unparse(PrintWriter p, int indent) {
        p.print("(");
        myExp1.unparse(p, 0);
        p.print(" < ");
        myExp2.unparse(p, 0);
        p.print(")");
    }

    public void callErrorMessage(String msg){
        myExp1.callErrorMessage(msg);
    }

    public Type nameCheckExp() {
        Type myType1 = myExp1.nameCheckExp();
        Type myType2 = myExp2.nameCheckExp();
        if((!myType1.isIntType()) && (!myType1.isErrorType())){
            myExp1.callErrorMessage(rela_non_numeric);
        }
        if((!myType2.isIntType()) && (!myType2.isErrorType())){
            myExp2.callErrorMessage(rela_non_numeric);
        }

        if(myType1.isIntType() && myType2.isIntType()){
            return new BoolType();
        }else{
            return new ErrorType();
        }
    }
}

class GreaterNode extends BinaryExpNode {
    public GreaterNode(ExpNode exp1, ExpNode exp2) {
        super(exp1, exp2);
    }

    public void unparse(PrintWriter p, int indent) {
        p.print("(");
        myExp1.unparse(p, 0);
        p.print(" > ");
        myExp2.unparse(p, 0);
        p.print(")");
    }

    public void callErrorMessage(String msg){
        myExp1.callErrorMessage(msg);
    }

    public Type nameCheckExp() {
        Type myType1 = myExp1.nameCheckExp();
        Type myType2 = myExp2.nameCheckExp();
        if((!myType1.isIntType()) && (!myType1.isErrorType())){
            myExp1.callErrorMessage(rela_non_numeric);
        }
        if((!myType2.isIntType()) && (!myType2.isErrorType())){
            myExp2.callErrorMessage(rela_non_numeric);
        }

        if(myType1.isIntType() && myType2.isIntType()){
            return new BoolType();
        }else{
            return new ErrorType();
        }
    }
}

class LessEqNode extends BinaryExpNode {
    public LessEqNode(ExpNode exp1, ExpNode exp2) {
        super(exp1, exp2);
    }

    public void unparse(PrintWriter p, int indent) {
        p.print("(");
        myExp1.unparse(p, 0);
        p.print(" <= ");
        myExp2.unparse(p, 0);
        p.print(")");
    }

    public void callErrorMessage(String msg){
        myExp1.callErrorMessage(msg);
    }

    public Type nameCheckExp() {
        Type myType1 = myExp1.nameCheckExp();
        Type myType2 = myExp2.nameCheckExp();
        if((!myType1.isIntType()) && (!myType1.isErrorType())){
            myExp1.callErrorMessage(rela_non_numeric);
        }
        if((!myType2.isIntType()) && (!myType2.isErrorType())){
            myExp2.callErrorMessage(rela_non_numeric);
        }

        if(myType1.isIntType() && myType2.isIntType()){
            return new BoolType();
        }else{
            return new ErrorType();
        }
    }
}

class GreaterEqNode extends BinaryExpNode {
    public GreaterEqNode(ExpNode exp1, ExpNode exp2) {
        super(exp1, exp2);
    }

    public void unparse(PrintWriter p, int indent) {
        p.print("(");
        myExp1.unparse(p, 0);
        p.print(" >= ");
        myExp2.unparse(p, 0);
        p.print(")");
    }

    public void callErrorMessage(String msg){
        myExp1.callErrorMessage(msg);
    }

    public Type nameCheckExp() {
        Type myType1 = myExp1.nameCheckExp();
        Type myType2 = myExp2.nameCheckExp();
        if((!myType1.isIntType()) && (!myType1.isErrorType())){
            myExp1.callErrorMessage(rela_non_numeric);
        }
        if((!myType2.isIntType()) && (!myType2.isErrorType())){
            myExp2.callErrorMessage(rela_non_numeric);
        }

        if(myType1.isIntType() && myType2.isIntType()){
            return new BoolType();
        }else{
            return new ErrorType();
        }
    }
}
