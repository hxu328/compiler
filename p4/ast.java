import java.io.*;
import java.util.*;
import java.lang.*;

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

    // global name space for name check
    static protected SymTable mySymTable;

    // global struct definition check
    static protected HashMap<String, Sym> structPool;

    // global linkedlist for formals
    static protected LinkedList<String> paramTypes;

    // name scope level (global scope's level is 0)
    static protected int myLevel = 0;

    // Error messages
    protected String multi_msg = "Identifier multiply-declared";            // More than one declaration of an identifier
                                                                            // in a given scope (note: includes identifier 
                                                                            // associated with a struct definition)

    protected String undecl_msg = "Identifier undeclared";                  // Use of an undeclared identifier

    protected String lhs_badAccess_msg = "Dot-access of non-struct type";   // Bad struct access (LHS of dot-access is not
                                                                            // of a struct type)

    protected String rhs_badAccess_msg = "Struct field name invalid";       // Bad struct access (RHS of dot-access is not 
                                                                            // a field of the appropriate a struct)

    protected String void_badDecl_msg = "Non-function declared void";       // Bad declaration (variable or parameter of 
                                                                            // type void) -- a declaration of anything other
                                                                            // than a function to be of type void 

    protected String struct_badDecl_msg = "Name of struct type invalid";    // Bad declaration (attempt to declare variable 
                                                                            // of a bad struct type) -- the name of the
                                                                            // struct type doesn't exist or is not a struct
                                                                            // type
}

// **********************************************************************
//   ProgramNode,  DeclListNode, FormalsListNode, FnBodyNode,
//   StmtListNode, ExpListNode
// **********************************************************************

class ProgramNode extends ASTnode {
    public ProgramNode(DeclListNode L) {
        myDeclList = L;
    }

    public void unparse(PrintWriter p, int indent) {
        myDeclList.unparse(p, indent);
    }

    public void nameCheck3000(){
        // initialize the global name space
        mySymTable = new SymTable();
        structPool = new HashMap<String, Sym>();
        paramTypes = new LinkedList<String>();
        // conduct name check for each element of myDeclList, from left to right
        myDeclList.nameCheck3000(mySymTable);
        
        // print the structPool for debug
        System.out.println("** struct pool **");
        System.out.println(structPool.toString());

        // print the symtables for debug
        mySymTable.print();
    }

    // one kid
    private DeclListNode myDeclList;
}

class DeclListNode extends ASTnode {
    public DeclListNode(List<DeclNode> S) {
        myDecls = S;
    }

    public void nameCheck3000(SymTable symTable){
        // conduct name check for each element of myDecls, from left to right
        for(DeclNode declNode : myDecls){
            declNode.nameCheck3000(symTable);
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

    public List<DeclNode> getMyDecls(){
        return myDecls;
    }

    // list of kids (DeclNodes)
    private List<DeclNode> myDecls;
}

class FormalsListNode extends ASTnode {
    public FormalsListNode(List<FormalDeclNode> S) {
        myFormals = S;
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

    public void nameCheck3000(SymTable symTable){
        for(FormalDeclNode formalDecl: myFormals){
            formalDecl.nameCheck3000(symTable);
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

    public void unparse(PrintWriter p, int indent) {
        myDeclList.unparse(p, indent);
        myStmtList.unparse(p, indent);
    }

    public void nameCheck3000(SymTable symTable){
        myDeclList.nameCheck3000(symTable);
        myStmtList.nameCheck3000(symTable);
    }

    // two kids
    private DeclListNode myDeclList;
    private StmtListNode myStmtList;
}

class StmtListNode extends ASTnode {
    public StmtListNode(List<StmtNode> S) {
        myStmts = S;
    }

    public void unparse(PrintWriter p, int indent) {
        Iterator<StmtNode> it = myStmts.iterator();
        while (it.hasNext()) {
            it.next().unparse(p, indent);
        }
    }

    public void nameCheck3000(SymTable symTable){
        for(StmtNode node : myStmts){
            node.nameCheck3000(symTable);
        }
    }

    // list of kids (StmtNodes)
    private List<StmtNode> myStmts;
}

class ExpListNode extends ASTnode {
    public ExpListNode(List<ExpNode> S) {
        myExps = S;
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

    public void nameCheck3000(SymTable symTable){
        for(ExpNode node : myExps){
            node.nameCheck3000(symTable);
        }
    }

    // list of kids (ExpNodes)
    private List<ExpNode> myExps;
}

// **********************************************************************
// ******  DeclNode and its subclasses
// **********************************************************************

abstract class DeclNode extends ASTnode {
    abstract public void nameCheck3000(SymTable symTable);
    //abstract public void nameCheck3000(SymTable symTable, LinkedList<String> paramTypes);
}

class VarDeclNode extends DeclNode {
    public VarDeclNode(TypeNode type, IdNode id, int size) {
        myType = type;
        myId = id;
        mySize = size;
    }

    public void unparse(PrintWriter p, int indent) {
        doIndent(p, indent);
        myType.unparse(p, 0);
        p.print(" ");
        myId.unparse(p, 0);
        p.println(";");
    }

    public void nameCheck3000(SymTable symTable){
        // check (type id;) OR (STRUCT id id;)
        if (mySize == NOT_STRUCT){  // var decl.
            String typeStr = myType.getType(); // int, bool
            String name = myId.getStrVal(); // variable's name
            boolean hasError = false;
            // check "bad"
            if(typeStr.compareTo("void") == 0){
                myId.callErrorMessage(void_badDecl_msg);
                hasError = true;
            }

            // check "multi"
            try{
                if(symTable.lookupLocal(name) != null || structPool.containsKey(name)){
                    myId.callErrorMessage(multi_msg);
                    hasError = true;
                }
            } catch (Exception e) {
                    System.exit(-1);
            }

            // add if no error
            Sym newSym = new Sym(typeStr, myLevel);
            if(hasError == true){
                return;
            } else {
                try{
                    symTable.addDecl(name, newSym);
                } catch(Exception e){
                    System.exit(-1);  // unexpected fatal error
                }
            }

        } else {  // struct declaration: struct point a;
            String structType = myType.getType();
            String name = myId.getStrVal(); // variable's name
            boolean hasError = false;
            // check "bad"
            if(!(structPool.containsKey(structType))){  // struct type is not defined
                ((StructNode)myType).getIdNode().callErrorMessage(struct_badDecl_msg);
                hasError = true;
            }

            // check "multi"
            try{
                if(symTable.lookupLocal(name) != null || structPool.containsKey(name)){
                    myId.callErrorMessage(multi_msg);
                    hasError = true;
                }
            } catch (Exception e) {
                System.exit(1);
            }

            // add if not error
            Sym newSym = new StructSym(structType, myLevel);
            if(hasError == true){
                return;
            } else {
                try{
                    symTable.addDecl(name, newSym);
                } catch(Exception e){
                    System.exit(1);  // unexpected fatal error
                }
            }
        }

        return;
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

    public void unparse(PrintWriter p, int indent) {
        doIndent(p, indent);
        myType.unparse(p, 0);
        p.print(" ");
        myId.unparse(p, 0);
        p.print("(");
        myFormalsList.unparse(p, 0);
        p.println(") {");
        myBody.unparse(p, indent+4);
        p.println("}\n");
    }

    public void nameCheck3000(SymTable symTable){
        String name = myId.getStrVal();
        LinkedList<String> tempList = new LinkedList<String>();
        boolean hasError = false;
        // check "multi" of the function's name
        try{
            if(symTable.lookupLocal(name) != null || structPool.containsKey(name)){
                myId.callErrorMessage(multi_msg);
                hasError = true;
            }
        } catch (Exception e) {
            System.exit(1);
        }

        // create a scope for function
        symTable.addScope();
        myLevel++;

        // check formals
        myFormalsList.nameCheck3000(symTable);
        tempList = (LinkedList<String>) paramTypes.clone();
        paramTypes = new LinkedList<String>(); // set to empty

        // check funtion body
        myBody.nameCheck3000(symTable);

        // delete the scope for function
        try{
            symTable.removeScope();
            myLevel--;
        } catch (Exception e) {
            System.exit(1);
        }

        // if the name has no error, add entry
        if(!hasError){
            Sym newSym = new FnSym(myType.getType(), myLevel, tempList, tempList.size());
            try{
                symTable.addDecl(name, newSym);
            } catch (Exception e){
                System.exit(1);
            }
        }
        

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

    public void unparse(PrintWriter p, int indent) {
        myType.unparse(p, 0);
        p.print(" ");
        myId.unparse(p, 0);
    }

    public void nameCheck3000(SymTable symTable){
        String type = myType.getType();
        String name = myId.getStrVal();
        boolean hasError = false;

        // check "bad"
        if(type.compareTo("void") == 0){
            myId.callErrorMessage(void_badDecl_msg);
            hasError = true;
        }

        // check "multi"
        try{
            if(symTable.lookupLocal(name) != null){  // not check struct pool
                myId.callErrorMessage(multi_msg);
                hasError = true;
            }
        } catch (Exception e) {
                System.exit(1);
        }

        // add if no error (to scope and paramType)
        Sym newSym = new Sym(type, myLevel);
        if(hasError == true){
            return;
        } else {
            try{
                symTable.addDecl(name, newSym);
                paramTypes.addLast(type);
                // System.out.println("paramtype " + paramTypes.toString());
            } catch(Exception e){
                System.exit(1);  // unexpected fatal error
            }
        }

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

    public void unparse(PrintWriter p, int indent) {
        doIndent(p, indent);
        p.print("struct ");
		myId.unparse(p, 0);
		p.println("{");
        myDeclList.unparse(p, indent+4);
        doIndent(p, indent);
        p.println("};\n");

    }

    public void nameCheck3000(SymTable symTable){
        String structType = myId.getStrVal();

        try{
            // check "multi"
            if(symTable.lookupLocal(structType) != null || structPool.containsKey(structType)){
                myId.callErrorMessage(multi_msg);
                return;
            }
            // check fields
            SymTable childTable = new SymTable();
            for(DeclNode declNode : myDeclList.getMyDecls()){
                declNode.nameCheck3000(childTable);
            }
            Sym newSym = new StructDefSym("struct", 0, childTable);
            structPool.put(structType, newSym);

        } catch (Exception e) {
            System.exit(1);
        }
    }

    // two kids
    private IdNode myId;
	private DeclListNode myDeclList;
}

// **********************************************************************
// ******  TypeNode and its Subclasses
// **********************************************************************

abstract class TypeNode extends ASTnode {
    abstract public String getType();
}

class IntNode extends TypeNode {
    public IntNode() {
    }

    public void unparse(PrintWriter p, int indent) {
        p.print("int");
    }

    public String getType(){
        return "int";
    }
}

class BoolNode extends TypeNode {
    public BoolNode() {
    }

    public void unparse(PrintWriter p, int indent) {
        p.print("bool");
    }

    public String getType(){
        return "bool";
    }
}

class VoidNode extends TypeNode {
    public VoidNode() {
    }

    public void unparse(PrintWriter p, int indent) {
        p.print("void");
    }

    public String getType(){
        return "void";
    }
}

class StructNode extends TypeNode {
    public StructNode(IdNode id) {
		myId = id;
    }

    public void unparse(PrintWriter p, int indent) {
        p.print("struct ");
		myId.unparse(p, 0);
    }

    public String getType(){
        return myId.getStrVal();
    }

    public IdNode getIdNode(){
        return myId;
    }
	
	// one kid
    private IdNode myId;
}

// **********************************************************************
// ******  StmtNode and its subclasses
// **********************************************************************

abstract class StmtNode extends ASTnode {
    abstract public void nameCheck3000(SymTable symTable);
}

class AssignStmtNode extends StmtNode {
    public AssignStmtNode(AssignExpNode assign) {
        myAssign = assign;
    }

    public void unparse(PrintWriter p, int indent) {
        doIndent(p, indent);
        myAssign.unparse(p, -1); // no parentheses
        p.println(";");
    }

    public void nameCheck3000(SymTable symTable){
        myAssign.nameCheck3000(symTable);
    }

    // one kid
    private AssignExpNode myAssign;
}

class PostIncStmtNode extends StmtNode {
    public PostIncStmtNode(ExpNode exp) {
        myExp = exp;
    }

    public void unparse(PrintWriter p, int indent) {
        doIndent(p, indent);
        myExp.unparse(p, 0);
        p.println("++;");
    }

    public void nameCheck3000(SymTable symTable){
        myExp.nameCheck3000(symTable);
    }

    // one kid
    private ExpNode myExp;
}

class PostDecStmtNode extends StmtNode {
    public PostDecStmtNode(ExpNode exp) {
        myExp = exp;
    }

    public void unparse(PrintWriter p, int indent) {
        doIndent(p, indent);
        myExp.unparse(p, 0);
        p.println("--;");
    }

    public void nameCheck3000(SymTable symTable){
        myExp.nameCheck3000(symTable);
    }

    // one kid
    private ExpNode myExp;
}

class ReadStmtNode extends StmtNode {
    public ReadStmtNode(ExpNode e) {
        myExp = e;
    }

    public void unparse(PrintWriter p, int indent) {
        doIndent(p, indent);
        p.print("input >> ");
        myExp.unparse(p, 0);
        p.println(";");
    }

    public void nameCheck3000(SymTable symTable){
        myExp.nameCheck3000(symTable);
    }

    // one kid (actually can only be an IdNode or an ArrayExpNode)
    private ExpNode myExp;
}

class WriteStmtNode extends StmtNode {
    public WriteStmtNode(ExpNode exp) {
        myExp = exp;
    }

    public void unparse(PrintWriter p, int indent) {
        doIndent(p, indent);
        p.print("disp << ");
        myExp.unparse(p, 0);
        p.println(";");
    }

    public void nameCheck3000(SymTable symTable){
        myExp.nameCheck3000(symTable);
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

    public void nameCheck3000(SymTable symTable){
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

    public void nameCheck3000(SymTable symTable){
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

    public void nameCheck3000(SymTable symTable){}

    // three kids
    private ExpNode myExp;
    private DeclListNode myDeclList;
    private StmtListNode myStmtList;
}

class CallStmtNode extends StmtNode {
    public CallStmtNode(CallExpNode call) {
        myCall = call;
    }

    public void unparse(PrintWriter p, int indent) {
        doIndent(p, indent);
        myCall.unparse(p, indent);
        p.println(";");
    }

    public void nameCheck3000(SymTable symTable){
        myCall.nameCheck3000(symTable);
    }

    // one kid
    private CallExpNode myCall;
}

class ReturnStmtNode extends StmtNode {
    public ReturnStmtNode(ExpNode exp) {
        myExp = exp;
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

    public void nameCheck3000(SymTable symTable){
        myExp.nameCheck3000(symTable);
    }

    // one kid
    private ExpNode myExp; // possibly null
}

// **********************************************************************
// ******  ExpNode and its subclasses
// **********************************************************************

abstract class ExpNode extends ASTnode {
    abstract public void nameCheck3000(SymTable symTable);
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

    public void nameCheck3000(SymTable symTable){
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

    public void nameCheck3000(SymTable symTable){
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

    public void nameCheck3000(SymTable symTable){
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

    public void nameCheck3000(SymTable symTable){
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

    public void unparse(PrintWriter p, int indent) {
        p.print(myStrVal);
    }

    public String getStrVal(){
        return myStrVal;
    }

    public void callErrorMessage(String msg){
        ErrMsg.fatal(myLineNum, myCharNum, msg);
    }

    public void nameCheck3000(SymTable symTable){
        // check whether myStrVal is in the symTable, if not, throw udecl msg
        try{
            if(symTable.lookupGlobal(myStrVal) == null){
                callErrorMessage(undecl_msg);
            }
        } catch(Exception e){
            callErrorMessage(undecl_msg);
        }
    }

    private int myLineNum;
    private int myCharNum;
    private String myStrVal;
}

class DotAccessExpNode extends ExpNode {
    public DotAccessExpNode(ExpNode loc, IdNode id) {
        myLoc = loc;	
        myId = id;
    }

    public void unparse(PrintWriter p, int indent) {
	    p.print("(");
		myLoc.unparse(p, 0);
		p.print(").");
		myId.unparse(p, 0);
    }

    public void nameCheck3000(SymTable symTable){}

    // two kids
    private ExpNode myLoc;	
    private IdNode myId;
}

class AssignExpNode extends ExpNode {
    public AssignExpNode(ExpNode lhs, ExpNode exp) {
        myLhs = lhs;
        myExp = exp;
    }

    // ** unparse **
    public void unparse(PrintWriter p, int indent) {
		if (indent != -1)  p.print("(");
	    myLhs.unparse(p, 0);
		p.print(" = ");
		myExp.unparse(p, 0);
		if (indent != -1)  p.print(")");
    }

    public void nameCheck3000(SymTable symTable){
        myLhs.nameCheck3000(symTable);
        myExp.nameCheck3000(symTable);
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

    public void unparse(PrintWriter p, int indent) {
	    myId.unparse(p, 0);
		p.print("(");
		if (myExpList != null) {
			myExpList.unparse(p, 0);
		}
		p.print(")");
    }

    public void nameCheck3000(SymTable symTable){
        myId.nameCheck3000(symTable);
        if (myExpList != null){
            myExpList.nameCheck3000(symTable);
        }
    }

    // two kids
    private IdNode myId;
    private ExpListNode myExpList;  // possibly null
}

abstract class UnaryExpNode extends ExpNode {
    public UnaryExpNode(ExpNode exp) {
        myExp = exp;
    }

    // one kid
    protected ExpNode myExp;
}

abstract class BinaryExpNode extends ExpNode {
    public BinaryExpNode(ExpNode exp1, ExpNode exp2) {
        myExp1 = exp1;
        myExp2 = exp2;
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

    public void nameCheck3000(SymTable symTable){
        myExp.nameCheck3000(symTable);
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

    public void nameCheck3000(SymTable symTable){
        myExp.nameCheck3000(symTable);
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

    public void nameCheck3000(SymTable symTable){
        myExp1.nameCheck3000(symTable);
        myExp2.nameCheck3000(symTable);
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

    public void nameCheck3000(SymTable symTable){
        myExp1.nameCheck3000(symTable);
        myExp2.nameCheck3000(symTable);
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

    public void nameCheck3000(SymTable symTable){
        myExp1.nameCheck3000(symTable);
        myExp2.nameCheck3000(symTable);
    }
}

class DivideNode extends BinaryExpNode {
    public DivideNode(ExpNode exp1, ExpNode exp2) {
        super(exp1, exp2);
    }

    public void unparse(PrintWriter p, int indent) {
	    p.print("(");
		myExp1.unparse(p, 0);
		p.print(" / ");
		myExp2.unparse(p, 0);
		p.print(")");
    }

    public void nameCheck3000(SymTable symTable){
        myExp1.nameCheck3000(symTable);
        myExp2.nameCheck3000(symTable);
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

    public void nameCheck3000(SymTable symTable){
        myExp1.nameCheck3000(symTable);
        myExp2.nameCheck3000(symTable);
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

    public void nameCheck3000(SymTable symTable){
        myExp1.nameCheck3000(symTable);
        myExp2.nameCheck3000(symTable);
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

    public void nameCheck3000(SymTable symTable){
        myExp1.nameCheck3000(symTable);
        myExp2.nameCheck3000(symTable);
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

    public void nameCheck3000(SymTable symTable){
        myExp1.nameCheck3000(symTable);
        myExp2.nameCheck3000(symTable);
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

    public void nameCheck3000(SymTable symTable){
        myExp1.nameCheck3000(symTable);
        myExp2.nameCheck3000(symTable);
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

    public void nameCheck3000(SymTable symTable){
        myExp1.nameCheck3000(symTable);
        myExp2.nameCheck3000(symTable);
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

    public void nameCheck3000(SymTable symTable){
        myExp1.nameCheck3000(symTable);
        myExp2.nameCheck3000(symTable);
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

    public void nameCheck3000(SymTable symTable){
        myExp1.nameCheck3000(symTable);
        myExp2.nameCheck3000(symTable);
    }
}
