///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Title:            P1
// Files:            P1.java Sym.java SymTable.java EmptySymTableException.java
//					 DuplicateSymException.java
// Semester:         CS536 Spring 2022
//
// Author:           Hong Xu
// Email:            hxu328@wisc.edu
// CS Login:         hongx
// Lecturer's Name:  Beck Hasti
// Lab Section:      N/A
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ////////////////////
//
//                   CHECK ASSIGNMENT PAGE TO see IF PAIR-PROGRAMMING IS ALLOWED
//                   If pair programming is allowed:
//                   1. Read PAIR-PROGRAMMING policy
//                   2. choose a partner wisely
//                   3. REGISTER THE TEAM BEFORE YOU WORK TOGETHER 
//                      a. one partner creates the team
//                      b. the other partner must join the team
//                   4. complete this section for each program file.
//
// Pair Partner:     (name of your pair programming partner)
// Email:            (email address of your programming partner)
// CS Login:         (partner's login name)
// Lecturer's Name:  (name of your partner's lecturer)
// Lab Section:      (your partner's lab section number)
//
//////////////////// STUDENTS WHO GET HELP FROM OTHER THAN THEIR PARTNER //////
//                   must fully acknowledge and credit those sources of help.
//                   Instructors and TAs do not have to be credited here,
//                   but tutors, roommates, relatives, strangers, etc do.
//
// Persons:          Identify persons by name, relationship to you, and email.
//                   Describe in detail the the ideas and help they provided.
//
// Online sources:   avoid web searches to solve your problems, but if you do
//                   search, be sure to include Web URLs and description of 
//                   of any information you find.
//////////////////////////// 80 columns wide //////////////////////////////////

/**
 * This main class is to test the functionalities of both Sym and SymTable
 * classes
 * 
 * @author Hong Xu
 *
 */
public class P1 {

	/**
	 * This method tests the functionality of the Sym Class
	 */
	public static void testSym() {

		// Scenario 1: test the constructor
		try {
			Sym symbol1 = new Sym("A"); // a Sym object used for testing the
										// constructor
			symbol1.getType();
		} catch (Exception e) {
			System.out.println("testSym failed: constructor throws exceptions");
		}

		// Scenario 2: test the getType() functionality
		try {
			Sym symbol2 = new Sym("B"); // a Sym object used for testing the
										// getType()
			String s2 = "B";// a string for testing getType()
			if (!symbol2.getType().equals(s2)) {
				System.out.println("testSym failed: getType() unmatch");
			}
		} catch (Exception e) {
			System.out.println("testSym failed: getType() throws exceptions");
		}

		// Scenario 3: test the toString() functionality
		try {
			Sym symbol3 = new Sym("C");
			String s3 = "C";// a string for testing getType()
			if (!symbol3.toString().equals(s3)) {
				System.out.println("testSym failed: toString() unmatch");
			}
		} catch (Exception e) {
			System.out.println("testSym failed: toString() throws exceptions");
		}

	}

	/**
	 * This method tests the functionality of the SymTable Class
	 */
	public static void testSymTable() {

		SymTable table1; // a SymTable object used for testing the constructor
		SymTable table2; // a SymTable object used for testing the addDecl
		SymTable table3; // a SymTable object used for testing the addScope and
							// removeScope()
		SymTable table4;// a SymTable object used for testing lookupLocal(String
						// name)
		SymTable table5; // a SymTable object used for testing
							// lookupGlobal(String name)
		SymTable table6; // a SymTable object used for testing print()

		// Scenario 1: test the constructor
		try {
			table1 = new SymTable();

			// If catches an exception, the constructor did not initialize at
			// least one HashMap
			try {
				table1.removeScope();
			} catch (Exception e) {
				System.out.println(
						"testSymTable failed: constructor fail to initialize "
								+ "HashMap");
			}

			// If not catches an exception, the constructor initialized more
			// than one HashMap
			try {
				table1.removeScope();
				System.out.println(
						"testSymTable failed: constructor fail to initialize a "
								+ "single HashMap");
			} catch (Exception e) {
			}
		} catch (Exception e) { // If catches an exception, the constructor
								// fails
			System.out.println(
					"testSymTable failed: constructor throws exceptions");
		}

		// Scenario 2: test the addDecl(String name, Sym sym) functionality
		try {// test whether it throws an EmptySymTableException when tries to
				// add to an empty table
			table2 = new SymTable();
			table2.removeScope();
			table2.addDecl("first", new Sym("A"));
			System.out.println("testSymTable failed: addDecl not throws an"
					+ " EmptySymTableException");
		} catch (EmptySymTableException e) {
			// If not reach here, fail to throw an EmptySymTableException
		} catch (Exception e) {
			System.out.println("testSymTable failed: addDecl throws an "
					+ "unexpected Exception");
		}

		try {// test whether it throws IllegalArgumentException properly
			table2 = new SymTable();

			try {// both arguments are null
				table2.addDecl(null, null);
				System.out.println("testSymTable failed: addDecl not throws an "
						+ "IllegalArgumentException when both arguments are null");
			} catch (IllegalArgumentException e) {
			} catch (Exception e) {
				System.out.println(
						"testSymTable failed: addDecl throws an unexpected "
								+ "Exception when both arguments are null");
			}

			try {// first argument is null
				table2.addDecl(null, new Sym("B"));
				System.out.println("testSymTable failed: addDecl not throws an "
						+ "IllegalArgumentException when the first argument is null");
			} catch (IllegalArgumentException e) {
			} catch (Exception e) {
				System.out.println(
						"testSymTable failed: addDecl throws an unexpected "
								+ "Exception when the first arguments is null");
			}

			try {// second argument is null
				table2.addDecl("second", null);
				System.out.println("testSymTable failed: addDecl not throws an "
						+ "IllegalArgumentException when the second argument is null");
			} catch (IllegalArgumentException e) {
			} catch (Exception e) {
				System.out.println(
						"testSymTable failed: addDecl throws an unexpected "
								+ "Exception when the second arguments is null");
			}
		} catch (Exception e) {
			System.out.println(
					"testSymTable failed: constructor throws exceptions");
		}

		try {// test whether it throws DuplicateSYmException properly
			table2 = new SymTable();
			table2.addDecl("first", new Sym("A"));
			table2.addDecl("first", new Sym("a"));
			System.out.println("testSymTable failed: addDecl not throws an "
					+ "DuplicateSYmException when it adds duplicate keys");
		} catch (DuplicateSymException e) {
		} catch (Exception e) {
			System.out.println(
					"testSymTable failed: addDecl throws an unexpected "
							+ "Exception when it adds duplicate keys");
		}

		// Scenario 3: test the addScope() and removeScope() functionalities
		try {// test whether it adds and removes correct number of scopes
			table3 = new SymTable();
			table3.addScope();
			table3.removeScope();
			table3.removeScope();
			table3.removeScope();
			System.out.println(
					"testSymTable failed: not throw an EmptySymTableException");
		} catch (EmptySymTableException e) {
		} catch (Exception e) {
			System.out.println(
					"testSymTable failed: addScope or removeScope throw an unexpected "
							+ "Exception when add one time and remove 3 times");
		}

		try {// test whether the order of scope is kept properly when adds and
				// removes
			table3 = new SymTable();
			table3.addDecl("first", new Sym("A"));
			table3.addDecl("second", new Sym("B"));
			table3.addScope();
			table3.addDecl("third", new Sym("C"));
			table3.removeScope();
			if (table3.lookupLocal("first") == null) {
				System.out.println(
						"testSymTable failed: addScope or removeScope do not "
								+ "manage the order of HashMaps properly");
			}
			if (table3.lookupGlobal("third") != null) {
				System.out.println(
						"testSymTable failed: addScope or removeScope do not "
								+ "manage the order of HashMaps properly");
			}
		} catch (Exception e) {
			System.out.println(
					"testSymTable failed: addScope or removeScope throw an "
							+ "unexpected Exceptions");
		}

		// Scenario 4: test the lookupLocal(String name) functionalities
		try {// test whether it throws EmptySymTableException
			table4 = new SymTable();
			table4.removeScope();
			table4.lookupLocal("first");
			System.out.println("testSymTable failed: lookupLocal not throws an "
					+ "EmptySymTableException");
		} catch (EmptySymTableException e) {
		} catch (Exception e) {
			System.out.println(
					"testSymTable failed: lookupLocal throws an unexpected "
							+ "Exceptions");
		}

		try {// test whether it get the correct value
			table4 = new SymTable();
			table4.addDecl("first", new Sym("A"));
			table4.addDecl("second", new Sym("B"));
			table4.addScope();
			table4.addDecl("third", new Sym("C"));
			table4.addDecl("fourth", new Sym("D"));

			if (table4.lookupLocal(null) != null) {
				System.out.println(
						"testSymTable failed: lookupLocal not get null when "
								+ "the argument is null");
			}

			if (table4.lookupLocal("sixth") != null) {
				System.out.println(
						"testSymTable failed: lookupLocal not get null when "
								+ "the argument does not exits");
			}

			if (table4.lookupLocal("third") == null
					|| !table4.lookupLocal("third").getType().equals("C")) {
				System.out.println(
						"testSymTable failed: lookupLocal get incorrect value");
			}

			if (table4.lookupLocal("first") != null) {
				System.out.println(
						"testSymTable failed: lookupLocal get incorrect value");
			}

		} catch (Exception e) {
			System.out.println(
					"testSymTable failed: lookupLocal throws an unexpected "
							+ "Exceptions");
		}

		// Scenario 5: test the lookupGlobal(String name) functionalities
		try {// test whether it throws EmptySymTableException
			table5 = new SymTable();
			table5.removeScope();
			table5.lookupGlobal("first");
			System.out
					.println("testSymTable failed: lookupGlobal not throws an "
							+ "EmptySymTableException");
		} catch (EmptySymTableException e) {
		} catch (Exception e) {
			System.out.println(
					"testSymTable failed: lookupGlobal throws an unexpected "
							+ "Exceptions");
		}

		try {// test whether it get the correct value
			table5 = new SymTable();
			table5.addDecl("first", new Sym("A"));
			table5.addDecl("second", new Sym("B"));
			table5.addDecl("fifth", new Sym("E1"));
			table5.addScope();
			table5.addDecl("first", new Sym("A1"));
			table5.addDecl("fourth", new Sym("D"));
			table5.addScope();
			table5.addDecl("second", new Sym("B1"));
			table5.addDecl("fourth", new Sym("D1"));

			if (table5.lookupGlobal(null) != null) {
				System.out.println(
						"testSymTable failed: lookupGlobal not gets null when "
								+ "the argument is null");
			}

			if (table5.lookupGlobal("sixth") != null) {
				System.out.println(
						"testSymTable failed: lookupGlobal not gets null when "
								+ "the argument not exists");
			}

			if (table5.lookupGlobal("first") == null
					|| table5.lookupGlobal("second") == null
					|| table5.lookupGlobal("fourth") == null
					|| table5.lookupGlobal("fifth") == null
					|| !table5.lookupGlobal("first").getType().equals("A1")
					|| !table5.lookupGlobal("second").getType().equals("B1")
					|| !table5.lookupGlobal("fourth").getType().equals("D1")
					|| !table5.lookupGlobal("fifth").getType().equals("E1")) {
				System.out.println(
						"testSymTable failed: lookupGlobal get incorrect value");
			}

		} catch (Exception e) {
			System.out.println(
					"testSymTable failed: lookupGlobal throws an unexpected "
							+ "Exceptions");
		}

		// Scenario 6: test the print() functionality
		try {
			table6 = new SymTable();
			table6.addDecl("first", new Sym("A"));
			table6.addDecl("second", new Sym("B"));
			table6.addDecl("fifth", new Sym("E1"));
			table6.addScope();
			table6.addDecl("first", new Sym("A1"));
			table6.addDecl("fourth", new Sym("D"));
			table6.addScope();
			table6.addDecl("second", new Sym("B1"));
			table6.addDecl("fourth", new Sym("D1"));
			table6.print();
		} catch (Exception e) {
			System.out.println(
					"testSymTable failed: print() throws an unexpected "
							+ "Exceptions");
		}

	}

	/**
	 * Main method for this class
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		testSym();
		testSymTable();
	}

}
