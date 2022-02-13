// This class creates a scanner and runs it on a given input file.

import java.io.*;

public class simpleEx {
    public static void main(String[] args) {
	// check for command-line arg
	if (args.length != 1) {
	    System.err.println("please supply name of file to be scanned.");
	    System.exit(-1);
	}

	// open input file
	FileReader inFile = null;
	try {
	    inFile = new FileReader(args[0]);
	} catch (FileNotFoundException ex) {
	    System.err.println("File " + args[0] + " not found.");
	    System.exit(-1);
	}

	// create and call the scanner
	Yylex scanner = new Yylex(inFile);
	try {
	    scanner.next_token();
	} catch (IOException ex) {
	    System.err.println("unexpected IOException thrown by the scanner");
	    System.exit(-1);
	}
    }
}
