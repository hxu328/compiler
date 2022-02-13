
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
import java.util.*;

/**
 * This class represents an symbol table object
 * 
 * @author Hong Xu
 *
 */
public class SymTable {
	private int numScope; // number of scope
	private LinkedList<HashMap<String, Sym>> listOfScope; // the list of scope

	/**
	 * Constructor
	 */
	public SymTable() {
		listOfScope = new LinkedList<HashMap<String, Sym>>();
		HashMap<String, Sym> headScope = new HashMap<String, Sym>();
		listOfScope.add(headScope);
		numScope = 1;
	}

	/**
	 * Add a pair of key and value to the first HashMap of the list
	 * 
	 * @param name key
	 * @param sym  value
	 * @throws DuplicateSymException    the first HashMap in the list already
	 *                                  contains the given name as a key when
	 *                                  SymTable's list is empty
	 * @throws EmptySymTableException   when SymTable's list is empty
	 * @throws IllegalArgumentException when either name or sym (or both) is
	 *                                  null
	 */
	public void addDecl(String name, Sym sym)
			throws DuplicateSymException, EmptySymTableException {
		if (numScope == 0) { // list is empty
			throw new EmptySymTableException();
		}

		if (name == null || sym == null) { // illegal arguments
			throw new IllegalArgumentException();
		}

		if (listOfScope.getFirst().containsKey(name)) { // duplicate keys
			throw new DuplicateSymException();
		} else { // if not duplicate, then add
			listOfScope.getFirst().put(name, sym);
		}

	}

	/**
	 * Add an empty HashMap at the head of the list, increment the number of
	 * scope
	 */
	public void addScope() {
		HashMap<String, Sym> newHeadScope = new HashMap<String, Sym>();
		listOfScope.addFirst(newHeadScope);
		numScope++;
	}

	/**
	 * Get the associated Sym object of the "name" in the first HashMap within
	 * the list
	 * 
	 * @param name key
	 * @return the associate Sym object or null if not exits
	 * @throws EmptySymTableException when SymTable's list is empty
	 */
	public Sym lookupLocal(String name) throws EmptySymTableException {
		if (numScope == 0) { // list is empty
			throw new EmptySymTableException();
		}

		if (name == null) { // illegal argument
			return null;
		}

		if (!listOfScope.getFirst().containsKey(name)) { // key not exists in
															// the first HashMap
			return null;
		} else { // key exists in the first HashMap
			return listOfScope.getFirst().get(name);
		}
	}

	/**
	 * Get the associated Sym object of the "name" in the all HashMaps within
	 * the list
	 * 
	 * @param name key
	 * @return the first associated Sym object or null if not exits
	 * @throws EmptySymTableException when SymTable's list is empty
	 */
	public Sym lookupGlobal(String name) throws EmptySymTableException {
		if (numScope == 0) { // list is empty
			throw new EmptySymTableException();
		} else if (name == null) { // illegal argument
			return null;
		} else { // iterate through all HashMaps from the head of the list
			Iterator<HashMap<String, Sym>> it = listOfScope.iterator();
			while (it.hasNext()) {
				HashMap<String, Sym> tempHashMap = it.next();
				if (tempHashMap.containsKey(name)) {// find the key
					return tempHashMap.get(name);
				}
			}
			return null;// not found, return null
		}

	}

	/**
	 * Remove the HashMap from the front of the list.
	 * 
	 * @throws EmptySymTableException when SymTable's list is empty
	 */
	public void removeScope() throws EmptySymTableException {
		if (numScope == 0) {// list is empty
			throw new EmptySymTableException();
		} else {// remove the first HashMap
			listOfScope.removeFirst();
			numScope--;
		}
	}

	/**
	 * Print the list of HashMap (top -> bottom: first -> end)
	 */
	public void print() {
		System.out.print("\n** Sym Table **\n");
		Iterator<HashMap<String, Sym>> it = listOfScope.iterator();
		while (it.hasNext()) {
			HashMap<String, Sym> tempHashMap = it.next();
			System.out.println(tempHashMap.toString());
		}
		System.out.println();

	}

}
