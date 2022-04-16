###
# This Makefile can be used to make a parser for the minim language
# (parser.class) and to make a program (P5.class) that tests the 
# parser and the unparse, name-analysis, and type-check methods in 
# ast.java.
#
# make clean removes all generated files.
#
###

JC = javac

CP = ./deps:.

P5.class: P5.java parser.class Yylex.class ASTnode.class
	$(JC) -g -cp $(CP) P5.java

parser.class: parser.java ASTnode.class Yylex.class ErrMsg.class
	$(JC) -g -cp $(CP) parser.java

parser.java: minim.cup
	java -cp $(CP) java_cup.Main < minim.cup

Yylex.class: minim.jlex.java sym.class ErrMsg.class
	$(JC) -g -cp $(CP) minim.jlex.java

ASTnode.class: ast.java Type.java Sym.class
	$(JC) -g -cp $(CP) ast.java Type.java

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

Type.class: Type.java
	$(JC) -g -cp $(CP) Type.java ast.java

DuplicateSymException.class: DuplicateSymException.java
	$(JC) -g -cp $(CP) DuplicateSymException.java

EmptySymTableException.class: EmptySymTableException.java
	$(JC) -g -cp $(CP) EmptySymTableException.java

###
# test
###
test:
	java -cp $(CP) P5 typeErrors.minim typeErrors.out
	java -cp $(CP) P5 test.minim test.out

###
# clean
###
clean:
	rm -f *~ *.class parser.java minim.jlex.java sym.java

cleantest:
	rm -f *.out
