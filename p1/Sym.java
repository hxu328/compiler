/**
 *     Sym:
 *       Sym(String type)     -- initialize the Sym to have the given type
 *       String getType()     -- return this Sym's type
 *       String toString()    -- return this Sym's type
 */
public class Sym {
    private String type;

    public Sym(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public String toString(){
        return this.type;
    }
}
