/**
 * P1
 *
 * This is a class whose sole purpose is to test both Sym and Symtable classes, which
 * provides the following operations:
 *     Sym:
 *       Sym(String type)     -- initialize the Sym to have the given type
 *       String getType()     -- return this Sym's type
 *       String toString()    -- return this Sym's type
 *     SymTable:
 *       SymTable()           -- initialize SymTable to contain a single empty HashMap
 *       void addDecl(String name, Sym sym) throws DuplicateSymException, EmptySymTableException
 *       void addScope()      -- add a new, empty HashMap to the front of the list
 *       void lookupLocal(String name) throws EmptySymTableException
 *       void lookupGlobal(String name) throws EmptySymTableException
 *       void removeScope() throws EmptySymTableException
 *       void print()         -- print every Hashmap in the list 
 * 
 * It produces output ONLY if a test fails.
 */
public class P1 {

    public static void testSym(){
        // test constructor
        String type = "test";
        Sym sym = new Sym(type);
        // test getType
        if(!sym.getType().equals(type)){
            System.out.println("Sym: getType() returned a wrong type");
        }
        // test toString
        if(!sys.toString().equals(type)){
            System.out.println("Sym: toString() returned a wrong type");
        }
    }

    public static void testSymTable(){
        // test constructor
        SymTable symtable = new SymTable();
        Sym sym = new Sym("test");
        // test lookupLocal empty list
        try{
            symtable.lookupLocal("test")
            System.out.println("SymTable: lookupLocal() failed to throw an exception for empty list");
        } catch(EmptySymTableException e){
            assert true;
        } catch(Exception e){
            System.out.println("SymTable: lookupLocal() failed to throw the correct exception for empty list");
        }
        // test lookupGlobal empty list
        try{
            symtable.lookupGlobal("test");
            System.out.println("SymTable: lookupGlobal() failed to throw an exception for empty list");
        } catch(EmptySymTableException e){
            assert true;
        } catch(Exception e){
            System.out.println("SymTable: lookupGlobal() failed to throw the correct exception for empty list");
        }
        // test removeScope empty list
        try{
            symtable.removeScope();
            System.out.println("SymTable: removeScope() failed to throw an exception for empty list");
        } catch(EmptySymTableException e){
            assert true;
        } catch(Exception e){
            System.out.println("SymTable: removeScope() failed to throw the correct exception for empty list");
        }
        // test addDecl empty list
        try{
            symtable.addDecl("test", sym);
            System.out.println("SymTable: addDecl() failed to throw an exception for empty list");
        } catch(EmptySymTableException e){
            assert true;
        } catch(Exception e){
            System.out.println("SymTable: addDecl() failed to throw the correct exception for empty list");
        }
        // add a hashmap to the list of scopes
        symtable.addScope();
        // test lookupLocal non-existent name
        if(symtable.lookupLocal("test") != null){
            System.out.println("SymTable: lookupLocal() failed to return null for non-existent name");
        }
        // test lookupGlobal non-existent name
        if(symtable.lookupGlobal("test") != null){
            System.out.println("SymTable: lookupGlobal() failed to return null for non-existent name");
        }
        // test addDecl illegal argument
        try{
            symtable.addDecl(null, sym);
            System.out.println("SymTable: addDecl() failed to throw an exception for illegal arguments");
            symtable.addDecl("test", null);
            System.out.println("SymTable: addDecl() failed to throw an exception for illegal arguments");
            symtable.addDecl(null, null);
            System.out.println("SymTable: addDecl() failed to throw an exception for illegal arguments");
        } catch(IllegalArgumentException e){
            assert true;
        } catch(Exception e){
            System.out.println("SymTable: addDecl() failed to throw the correct exception for illegal arguments");
        }
        // add a new name to the scope
        symtable.addDecl("test", sym);
        // test lookupLocal existent name
        if(!symtable.lookupLocal("test").getType().equals(sym.getType())){
            System.out.println("SymTable: lookupLocal() failed to correctly retrieve an existent variable");
        }
        // test lookupGlobal existent name
        if(!symtable.lookupGlobal("test").getType().equals(sym.getType())){
            System.out.println("SymTable: lookupGlobal() failed to correctly retrieve an existent variable");
        }
        // test addDecl duplicate name
        try{
            symtable.addDecl("test", sym);
            System.out.println("SymTable: addDecl() failed to throw an exception for duplicate name");
        } catch(DuplicateSymException e){
            assert true;
        } catch(Exception e){
            System.out.println("SymTable: addDecl() failed to throw the correct exception for duplicate name");
        }
        // add a nested scope
        symtable.addScope();
        // test lookupLocal non-existent name
        if(symtable.lookupGlobal("test") != null){
            System.out.println("SymTable: lookupGlobal() failed to to return null for non-existent name");
        }
        // test lookupGlobal existent name
        if(!symtable.lookupGlobal("test").getType().equals(sym.getType())){
            System.out.println("SymTable: lookupGlobal() failed to correctly retrieve an existent variable");
        }
        // addDecl local override
        Sym override = new Sym("override");
        symtable.addDecl("test", override);
        // test lookupLocal local override
        if(!symtable.lookupLocal("test").getType().equals(override.getType())){
            System.out.println("SymTable: lookupLocal() failed to correctly retrieve an overriden variable");
        }
        // test lookupGlobal local override
        if(!symtable.lookupGlobal("test").getType().equals(override.getType())){
            System.out.println("SymTable: lookupGlobal() failed to correctly retrieve an overriden variable");
        }
        // add a nested scope
        symtable.addScope();
        // stress test addDecl and lookupLocal
        for(int i = 0; i < 10000; i++){
            symtable.addDecl("stress"+i, new Sym("stress"+i));
        }
        for(int i = 0; i < 10000; i++){
            if(!symtable.lookupLocal("stress"+i).getType().equals("stress"+i)){
                System.out.println("SymTable: stress test number " + i + " failed");
            }
        }
        // print symtable
        symtable.print();
        // remove scope
        symtable.removeScope();
        // verify scope removal
        for(int i = 0; i < 10000; i++){
            if(symtable.lookupLocal("stress"+i) != null){
                System.out.println("SymTable: scope removal unsuccessful for stress test number " + i)
            }
        }
    }

    public static void main(String [] args) {
        testSym();
        testSymTable();
    }
}
