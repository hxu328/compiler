###
#
# make clean removes all generated files.
#
###

JC = javac

CP = ./deps:.

P6.class: P6.java parser.class Yylex.class ASTnode.class
	$(JC) -g -cp $(CP) P6.java

parser.class: parser.java ASTnode.class Yylex.class ErrMsg.class
	$(JC) -g -cp $(CP) parser.java

parser.java: minim.cup
	java -cp $(CP) java_cup.Main < minim.cup

Yylex.class: minim.jlex.java sym.class ErrMsg.class
	$(JC) -g -cp $(CP) minim.jlex.java

ASTnode.class: ast.java Type.java Sym.class Codegen.java
	$(JC) -g -cp $(CP) ast.java Type.java Codegen.java

minim.jlex.java: minim.jlex sym.class
	java -cp $(CP) JLex.Main minim.jlex

sym.class: sym.java
	$(JC) -g -cp $(CP) sym.java

sym.java: minim.cup
	java -cp $(CP) java_cup.Main < minim.cup

ErrMsg.class: ErrMsg.java
	$(JC) -g -cp $(CP) ErrMsg.java

Sym.class: Sym.java Type.class ast.java
	$(JC) -g -cp $(CP) Sym.java ast.java

SymTable.class: SymTable.java Sym.class DuplicateSymException.class EmptySymTableException.class
	$(JC) -g -cp $(CP) SymTable.java

Type.class: Type.java ast.java Sym.java
	$(JC) -g -cp $(CP) Type.java ast.java Sym.java

Codegen.class: Codegen.java
	$(JC) -g -cp $(CP) Codegen.java

DuplicateSymException.class: DuplicateSymException.java
	$(JC) -g -cp $(CP) DuplicateSymException.java

EmptySymTableException.class: EmptySymTableException.java
	$(JC) -g -cp $(CP) EmptySymTableException.java

###
# test
###
test:
	java -cp $(CP) P6 test.minim test.s

###
# clean
###
clean:
	rm -f *~ *.class parser.java minim.jlex.java sym.java

cleantest:
	rm -f *.s
