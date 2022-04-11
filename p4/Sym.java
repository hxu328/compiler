import java.util.*;

public class Sym {
	private String type;
	private int level;
	
	public Sym(String type, int level) {
		this.type = type;
		this.level = level;
	}
	
	public String getType() {
		return type;
	}
	
	public int getLevel() {
		return level;
	}

	public String toString() {
		return type;
	}
}

class FnSym extends Sym {
	private int numParam;  					// number of formals
	private LinkedList<String> paramTypes;	// list of the formals' types

	public FnSym(String retType, int level, LinkedList<String> paramTypes, int numParam){
		super(retType, level);
		this.numParam = numParam;
		this.paramTypes = paramTypes;
	}

	public int getNumParam(){
		return numParam;
	}

	@Override
	public int getLevel(){
		return super.getLevel();
	}

	public LinkedList<String> getParamTypes(){
		return paramTypes;
	}

	@Override
	public String toString(){  //paramType1,paramType2->retType
		if(numParam == 0){
			return "->" + super.getType();
		}

		String temp = "";
		for(int i = 0; i < numParam; i++) {
			if(i == numParam -1) {
				temp = temp + paramTypes.get(i);
			} else {
				temp = temp + paramTypes.get(i) + ",";
			}
		}
		temp = temp + "->" + super.getType();
		return temp;
 
	}
}

class StructSym extends Sym {  // Struct a b; a is the type

	public StructSym(String type, int level){
		super(type, level);
	}

	@Override
	public int getLevel(){
		return super.getLevel();
	}

	@Override
	public String getType(){
		return super.getType();
	}

	@Override
	public String toString(){
		return super.getType();
	}
}

class StructDefSym extends Sym {  // struct definition symbol
	private SymTable fields;

	public StructDefSym(String type, int level, SymTable fields){  // once constructed, all the fields are correct
		super(type, level);
		this.fields = fields;
	}

	public SymTable getFields(){
		return fields;
	}

	public Sym getField(String name){
		try{
			return fields.lookupLocal(name);
		} catch(Exception e){
			return null;
		}
	}

	@Override
	public int getLevel(){
		return super.getLevel();
	}

	@Override
	public String toString(){
		return fields.toString();
	}

	public boolean contains(String name){
		try{
			return this.fields.lookupLocal(name) != null;
		} catch(Exception e){
			return false;
		}
	}

}
