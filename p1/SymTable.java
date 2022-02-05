/**
*     SymTable:
*       SymTable()           -- initialize SymTable to contain a single empty HashMap
*       void addDecl(String name, Sym sym) throws DuplicateSymException, EmptySymTableException
*       void addScope()      -- add a new, empty HashMap to the front of the list
*       Sym lookupLocal(String name) throws EmptySymTableException
*       Sym lookupGlobal(String name) throws EmptySymTableException
*       void removeScope() throws EmptySymTableException
*       void print()         -- print every Hashmap in the list 
*/

import java.util.*;

public class SymTable {

    private LinkedList<HashMap<String, Sym>> scopes;

    public SymTable(){
        scopes = new LinkedList<HashMap<String, Sym>>();
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
