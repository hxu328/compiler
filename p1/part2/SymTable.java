///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:  P1.java
// File:             ./P1.java
// Semester:         CS536 Spring 2022
//
// Author:           Huan Xu at hxu296@wisc.edu
// CS Login:         huanx
// Lecturer's Name:  Beck Hasti
// Lab Section:      001
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ////////////////////
//
// Pair Partner:     (name of your pair programming partner)
// Email:            (email address of your programming partner)
// CS Login:         (partner's login name)
// Lecturer's Name:  (name of your partner's lecturer)
// Lab Section:      (your partner's lab section number)
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

/**
* SymTable:
*   SymTable()           -- initialize SymTable to contain a single empty HashMap
*   void addDecl(String name, Sym sym) throws DuplicateSymException, EmptySymTableException
*   void addScope()      -- add a new, empty HashMap to the front of the list
*   Sym lookupLocal(String name) throws EmptySymTableException
*   Sym lookupGlobal(String name) throws EmptySymTableException
*   void removeScope() throws EmptySymTableException
*   void print()         -- print every Hashmap in the list 
* @author Huan Xu
*/

import java.util.*;

public class SymTable {

    private LinkedList<HashMap<String, Sym>> scopes;

    public SymTable(){
        scopes = new LinkedList<HashMap<String, Sym>>();
        addScope();
    }

    public void addDecl(String name, Sym sym) throws DuplicateSymException, EmptySymTableException, IllegalArgumentException
    {
        if(scopes.isEmpty()){
            throw new EmptySymTableException();
        } 
        if(name == null || sym == null){
            throw new IllegalArgumentException();
        }

        HashMap<String, Sym> currScope = scopes.getFirst();
        if(currScope.containsKey(name)){
            throw new DuplicateSymException();
        }
        currScope.put(name, sym);
    }
    
    public Sym lookupLocal(String name) throws EmptySymTableException
    {
        if(scopes.isEmpty()){
            throw new EmptySymTableException();
        }

        HashMap<String, Sym> currScope = scopes.getFirst();
        if(currScope.containsKey(name)){
            return currScope.get(name);
        } else{
            return null;
        }
    }

    public Sym lookupGlobal(String name) throws EmptySymTableException
    {
        if(scopes.isEmpty()){
            throw new EmptySymTableException();
        }

        for(HashMap<String, Sym> currScope : scopes){
            if(currScope.containsKey(name)){
                return currScope.get(name);
            }
        }

        return null;
    }

    public void addScope(){
        scopes.addFirst(new HashMap<String, Sym>());
    }

    public void removeScope() throws EmptySymTableException
    {
        if(scopes.isEmpty()){
            throw new EmptySymTableException();
        }
        scopes.removeFirst();
    }

    public void print(){
        for(HashMap<String, Sym> scope : scopes){
            System.out.println(scope.toString() + "\n");
        }
    }
}
