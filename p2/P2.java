///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:  P2.java
// File:             P2.java
// Semester:         CS536 Spring 2022
//
// Author:           Huan Xu at hxu296@wisc.edu
// CS Login:         huanx
// Lecturer's Name:  Beck Hasti
// Lab Section:      001
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ////////////////////
//
// Pair Partner:     Hong Xu
// Email:            hxu328@wisc.edu
// CS Login:         hongx
// Lecturer's Name:  Beck Hasti
// Lab Section:      001
//
//////////////////// STUDENTS WHO GET HELP FROM OTHER THAN THEIR PARTNER //////
//                   fully acknowledge and credit all sources of help,
//                   other than Instructors and TAs.
//
// Persons:          Identify persons by name, relationship to you, and email.
//                   Describe in detail the the ideas and help they provided.
//
// Online sources:   avoid web searches to solve your problems, but if you do
//                   search, be sure to include Web URLs and description of 
//                   of any information you find.
//////////////////////////// 80 columns wide //////////////////////////////////

import java.util.*;
import java.io.*;
import java_cup.runtime.*;  // defines Symbol

/**
 * This program is to be used to test the CSX scanner.
 * This version is set up to test all tokens, but more code is needed to test 
 * other aspects of the scanner (e.g., input that causes errors, character 
 * numbers, values associated with tokens)
 */
public class P2 {
    public static void main(String[] args) throws IOException {
                                           // exception may be thrown by yylex
        // test all tokens
        testAllTokens();
        CharNum.num = 1;
    
        // ADD CALLS TO OTHER TEST METHODS HERE

        testmy_1();
        CharNum.num = 1;

        testmy_2("stress.txt");
        CharNum.num = 1;


    }

    /**
     * testAllTokens
     *
     * Open and read from file allTokens.txt
     * For each token read, write the corresponding string to allTokens.out
     * If the input file contains all tokens, one per line, we can verify
     * correctness of the scanner by comparing the input and output files
     * (e.g., using a 'diff' command).
     */
    private static void testAllTokens() throws IOException {
        // open input and output files
        FileReader inFile = null;
        PrintWriter outFile = null;
        try {
            inFile = new FileReader("allTokens.in");
            outFile = new PrintWriter(new FileWriter("allTokens.out"));
        } catch (FileNotFoundException ex) {
            System.err.println("File allTokens.in not found.");
            System.exit(-1);
        } catch (IOException ex) {
            System.err.println("allTokens.out cannot be opened.");
            System.exit(-1);
        }

        // create and call the scanner
        Yylex scanner = new Yylex(inFile);
        Symbol token = scanner.next_token();
        while (token.sym != sym.EOF) {
            switch (token.sym) {
            case sym.BOOL:
                outFile.println("bool"); 
                break;
            case sym.INT:
                outFile.println("int");
                break;
            case sym.VOID:
                outFile.println("void");
                break;
            case sym.TRUE:
                outFile.println("true"); 
                break;
            case sym.FALSE:
                outFile.println("false"); 
                break;
            case sym.STRUCT:
                outFile.println("struct"); 
                break;
            case sym.INPUT:
                outFile.println("input"); 
                break;
            case sym.DISP:
                outFile.println("disp");
                break;				
            case sym.IF:
                outFile.println("if");
                break;
            case sym.ELSE:
                outFile.println("else");
                break;
            case sym.WHILE:
                outFile.println("while");
                break;
            case sym.RETURN:
                outFile.println("return");
                break;
            case sym.ID:
                outFile.println(((IdTokenVal)token.value).idVal);
                break;
            case sym.INTLITERAL:  
                outFile.println(((IntLitTokenVal)token.value).intVal);
                break;
            case sym.STRINGLITERAL: 
                outFile.println(((StrLitTokenVal)token.value).strVal);
                break;    
            case sym.LCURLY:
                outFile.println("{");
                break;
            case sym.RCURLY:
                outFile.println("}");
                break;
            case sym.LPAREN:
                outFile.println("(");
                break;
            case sym.RPAREN:
                outFile.println(")");
                break;
            case sym.SEMICOLON:
                outFile.println(";");
                break;
            case sym.COMMA:
                outFile.println(",");
                break;
            case sym.DOT:
                outFile.println(".");
                break;
            case sym.WRITE:
                outFile.println("<<");
                break;
            case sym.READ:
                outFile.println(">>");
                break;				
            case sym.PLUSPLUS:
                outFile.println("++");
                break;
            case sym.MINUSMINUS:
                outFile.println("--");
                break;	
            case sym.PLUS:
                outFile.println("+");
                break;
            case sym.MINUS:
                outFile.println("-");
                break;
            case sym.TIMES:
                outFile.println("*");
                break;
            case sym.DIVIDE:
                outFile.println("/");
                break;
            case sym.NOT:
                outFile.println("!");
                break;
            case sym.AND:
                outFile.println("&&");
                break;
            case sym.OR:
                outFile.println("||");
                break;
            case sym.EQUALS:
                outFile.println("==");
                break;
            case sym.NOTEQUALS:
                outFile.println("!=");
                break;
            case sym.LESS:
                outFile.println("<");
                break;
            case sym.GREATER:
                outFile.println(">");
                break;
            case sym.LESSEQ:
                outFile.println("<=");
                break;
            case sym.GREATEREQ:
                outFile.println(">=");
                break;
            case sym.ASSIGN:
                outFile.println("=");
                break;
            default:
                outFile.println("UNKNOWN TOKEN");
            } // end switch

            token = scanner.next_token();
        } // end while
        outFile.close();
    }

    /**
     * testmy_1
     * 
     * Open and read from test_1.in
     * This file contains bad and unterminated string literals, along with
     * some legal strings
     * We can verify the correctness of the error message functionality by
     * comparing test_1.err and test_1.err.exp (expected error messages)
     * We can also verify the correctness by comparing test_1.out and
     * test_1.out.exp (expected out for tokens)
     *
     * @throws IOException
     */
    private static void testmy_1() throws IOException {
        // open input and output files
        FileReader inFile = null;
        PrintWriter outFile = null;
        PrintStream outError = null;

        try {
            inFile = new FileReader("test_1.in");
            outFile = new PrintWriter(new FileWriter("test_1.out"));
            outError = new PrintStream("test_1.err");
        } catch (FileNotFoundException ex) {
            System.err.println("File test_1.in not found.");
            System.exit(-1);
        } catch (IOException ex) {
            System.err.println("test_1.out/test_1.out cannot be opened.");
            System.exit(-1);
        }

        // set up err output stream
        System.setErr(outError);

        // create and call the scanner
        Yylex scanner = new Yylex(inFile);
        Symbol token = scanner.next_token();
        while (token.sym != sym.EOF) {
            switch (token.sym) {
            case sym.BOOL:
                outFile.println(((TokenVal)token.value).lineNum + ":" +
                                ((TokenVal)token.value).charNum + " " + 
                                "bool"); 
                break;
            case sym.INT:
                outFile.println(((TokenVal)token.value).lineNum + ":" +
                                ((TokenVal)token.value).charNum + " " + 
                                "int");
                break;
            case sym.VOID:
                outFile.println(((TokenVal)token.value).lineNum + ":" +
                                ((TokenVal)token.value).charNum + " " +
                                "void");
                break;
            case sym.TRUE:
                outFile.println(((TokenVal)token.value).lineNum + ":" +
                                ((TokenVal)token.value).charNum + " " +
                                "true"); 
                break;
            case sym.FALSE:
                outFile.println(((TokenVal)token.value).lineNum + ":" +         
                                ((TokenVal)token.value).charNum + " " +
                                "false"); 
                break;
            case sym.STRUCT:
                outFile.println(((TokenVal)token.value).lineNum + ":" +         
                                ((TokenVal)token.value).charNum + " " +
                                "struct"); 
                break;
            case sym.INPUT:
                outFile.println(((TokenVal)token.value).lineNum + ":" +         
                                ((TokenVal)token.value).charNum + " " +
                                "input"); 
                break;
            case sym.DISP:
                outFile.println(((TokenVal)token.value).lineNum + ":" +         
                                ((TokenVal)token.value).charNum + " " +
                                "disp");
                break;				
            case sym.IF:
                outFile.println(((TokenVal)token.value).lineNum + ":" +         
                                ((TokenVal)token.value).charNum + " " +
                                "if");
                break;
            case sym.ELSE:
                outFile.println(((TokenVal)token.value).lineNum + ":" +         
                                ((TokenVal)token.value).charNum + " " +
                                "else");
                break;
            case sym.WHILE:
                outFile.println(((TokenVal)token.value).lineNum + ":" +         
                                ((TokenVal)token.value).charNum + " " +
                                "while");
                break;
            case sym.RETURN:
                outFile.println(((TokenVal)token.value).lineNum + ":" +         
                                ((TokenVal)token.value).charNum + " " +
                                "return");
                break;
            case sym.ID:
                outFile.println(((IdTokenVal)token.value).lineNum + ":" +         
                                ((IdTokenVal)token.value).charNum + " " + 
                                ((IdTokenVal)token.value).idVal);
                break;
            case sym.INTLITERAL:  
                outFile.println(((IntLitTokenVal)token.value).lineNum + ":" +         
                                ((IntLitTokenVal)token.value).charNum + " " +
                                ((IntLitTokenVal)token.value).intVal);
                break;
            case sym.STRINGLITERAL: 
                outFile.println(((StrLitTokenVal)token.value).lineNum + ":" +         
                                ((StrLitTokenVal)token.value).charNum + " " +
                                ((StrLitTokenVal)token.value).strVal);
                break;    
            case sym.LCURLY:
                outFile.println(((TokenVal)token.value).lineNum + ":" +         
                                ((TokenVal)token.value).charNum + " " +
                                "{");
                break;
            case sym.RCURLY:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "}");
                break;
            case sym.LPAREN:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "(");
                break;
            case sym.RPAREN:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                ")");
                break;
            case sym.SEMICOLON:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                ";");
                break;
            case sym.COMMA:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                ",");
                break;
            case sym.DOT:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                ".");
                break;
            case sym.WRITE:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "<<");
                break;
            case sym.READ:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                ">>");
                break;				
            case sym.PLUSPLUS:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "++");
                break;
            case sym.MINUSMINUS:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "--");
                break;	
            case sym.PLUS:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "+");
                break;
            case sym.MINUS:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "-");
                break;
            case sym.TIMES:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "*");
                break;
            case sym.DIVIDE:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "/");
                break;
            case sym.NOT:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "!");
                break;
            case sym.AND:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "&&");
                break;
            case sym.OR:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "||");
                break;
            case sym.EQUALS:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "==");
                break;
            case sym.NOTEQUALS:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "!=");
                break;
            case sym.LESS:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "<");
                break;
            case sym.GREATER:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                ">");
                break;
            case sym.LESSEQ:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "<=");
                break;
            case sym.GREATEREQ:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                ">=");
                break;
            case sym.ASSIGN:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "=");
                break;
            default:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "UNKNOWN TOKEN");
            } // end switch

            token = scanner.next_token();
        } // end while
        outFile.close();
    }

    private static void testmy_2(String filename) throws IOException {
        // open input and output files
        FileReader inFile = null;
        PrintWriter outFile = null;
        try {
            inFile = new FileReader("test_2.in");
            outFile = new PrintWriter(new FileWriter("test_2.out"));
        } catch (FileNotFoundException ex) {
            System.err.println("File test_2.in not found.");
            System.exit(-1);
        } catch (IOException ex) {
            System.err.println("test_2.out cannot be opened.");
            System.exit(-1);
        }

        // create and call the scanner
        Yylex scanner = new Yylex(inFile);
        Symbol token = scanner.next_token();
        while (token.sym != sym.EOF) {
            switch (token.sym) {
            case sym.BOOL:
                outFile.println(((TokenVal)token.value).lineNum + ":" +
                                ((TokenVal)token.value).charNum + " " + 
                                "bool"); 
                break;
            case sym.INT:
                outFile.println(((TokenVal)token.value).lineNum + ":" +
                                ((TokenVal)token.value).charNum + " " + 
                                "int");
                break;
            case sym.VOID:
                outFile.println(((TokenVal)token.value).lineNum + ":" +
                                ((TokenVal)token.value).charNum + " " +
                                "void");
                break;
            case sym.TRUE:
                outFile.println(((TokenVal)token.value).lineNum + ":" +
                                ((TokenVal)token.value).charNum + " " +
                                "true"); 
                break;
            case sym.FALSE:
                outFile.println(((TokenVal)token.value).lineNum + ":" +         
                                ((TokenVal)token.value).charNum + " " +
                                "false"); 
                break;
            case sym.STRUCT:
                outFile.println(((TokenVal)token.value).lineNum + ":" +         
                                ((TokenVal)token.value).charNum + " " +
                                "struct"); 
                break;
            case sym.INPUT:
                outFile.println(((TokenVal)token.value).lineNum + ":" +         
                                ((TokenVal)token.value).charNum + " " +
                                "input"); 
                break;
            case sym.DISP:
                outFile.println(((TokenVal)token.value).lineNum + ":" +         
                                ((TokenVal)token.value).charNum + " " +
                                "disp");
                break;				
            case sym.IF:
                outFile.println(((TokenVal)token.value).lineNum + ":" +         
                                ((TokenVal)token.value).charNum + " " +
                                "if");
                break;
            case sym.ELSE:
                outFile.println(((TokenVal)token.value).lineNum + ":" +         
                                ((TokenVal)token.value).charNum + " " +
                                "else");
                break;
            case sym.WHILE:
                outFile.println(((TokenVal)token.value).lineNum + ":" +         
                                ((TokenVal)token.value).charNum + " " +
                                "while");
                break;
            case sym.RETURN:
                outFile.println(((TokenVal)token.value).lineNum + ":" +         
                                ((TokenVal)token.value).charNum + " " +
                                "return");
                break;
            case sym.ID:
                outFile.println(((IdTokenVal)token.value).lineNum + ":" +         
                                ((IdTokenVal)token.value).charNum + " " + 
                                ((IdTokenVal)token.value).idVal);
                break;
            case sym.INTLITERAL:  
                outFile.println(((IntLitTokenVal)token.value).lineNum + ":" +         
                                ((IntLitTokenVal)token.value).charNum + " " +
                                ((IntLitTokenVal)token.value).intVal);
                break;
            case sym.STRINGLITERAL: 
                outFile.println(((StrLitTokenVal)token.value).lineNum + ":" +         
                                ((StrLitTokenVal)token.value).charNum + " " +
                                ((StrLitTokenVal)token.value).strVal);
                break;    
            case sym.LCURLY:
                outFile.println(((TokenVal)token.value).lineNum + ":" +         
                                ((TokenVal)token.value).charNum + " " +
                                "{");
                break;
            case sym.RCURLY:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "}");
                break;
            case sym.LPAREN:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "(");
                break;
            case sym.RPAREN:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                ")");
                break;
            case sym.SEMICOLON:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                ";");
                break;
            case sym.COMMA:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                ",");
                break;
            case sym.DOT:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                ".");
                break;
            case sym.WRITE:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "<<");
                break;
            case sym.READ:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                ">>");
                break;				
            case sym.PLUSPLUS:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "++");
                break;
            case sym.MINUSMINUS:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "--");
                break;	
            case sym.PLUS:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "+");
                break;
            case sym.MINUS:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "-");
                break;
            case sym.TIMES:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "*");
                break;
            case sym.DIVIDE:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "/");
                break;
            case sym.NOT:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "!");
                break;
            case sym.AND:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "&&");
                break;
            case sym.OR:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "||");
                break;
            case sym.EQUALS:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "==");
                break;
            case sym.NOTEQUALS:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "!=");
                break;
            case sym.LESS:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "<");
                break;
            case sym.GREATER:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                ">");
                break;
            case sym.LESSEQ:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "<=");
                break;
            case sym.GREATEREQ:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                ">=");
                break;
            case sym.ASSIGN:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "=");
                break;
            default:
                outFile.println(((TokenVal)token.value).lineNum + ":" +       
                                ((TokenVal)token.value).charNum + " " +
                                "UNKNOWN TOKEN");
            } // end switch

            token = scanner.next_token();
        } // end while
        outFile.close();
    }
}
