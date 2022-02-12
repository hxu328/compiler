####
# This Makefile can be used to make a scanner (Yylex.class)
# and to make a program that tests the scanner (simpleEx.class).
#
# The default makes both the scanner and the test program.
#
# make clean removes all generated files.
#
# Note: simpleEx.java will not compile unless Yylex.class exists.
#
###

# define the java compiler to be used and the flags
JC = javac
FLAGS = -g -cp $(CP)
CP = ./deps:.

simpleEx.class: simpleEx.java Yylex.class
	$(JC) $(FLAGS) simpleEx.java

Yylex.class: example.jlex.java 
	$(JC) $(FLAGS) example.jlex.java

example.jlex.java: example.jlex 
	java -cp $(CP) JLex.Main example.jlex

###
# test the scanner by running it on testInput.txt
###
test:
	java -cp $(CP) simpleEx testInput.txt 	
	
###
# clean up
###

clean:
	rm -f *~ *.class example.jlex.java
