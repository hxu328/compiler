import java.util.*;

public class SymTable {
	private List<HashMap<String, Sym>> list;
	
	public SymTable() {
		list = new LinkedList<HashMap<String, Sym>>();
		list.add(new HashMap<String, Sym>());
	}

	public void addDeclAtLast(String name, Sym sym) 
	throws DuplicateSymException, EmptySymTableException {
		if (name == null || sym == null)
			throw new IllegalArgumentException();
		
		if (list.isEmpty())
			throw new EmptySymTableException();
		
		int lastIndex = list.size();
		HashMap<String, Sym> symTab = list.get(lastIndex - 1);
		if (symTab.containsKey(name))
			throw new DuplicateSymException();
		
		symTab.put(name, sym);
	}
	
	public void addDecl(String name, Sym sym) 
	throws DuplicateSymException, EmptySymTableException {
		if (name == null || sym == null)
			throw new IllegalArgumentException();
		
		if (list.isEmpty())
			throw new EmptySymTableException();
		
		HashMap<String, Sym> symTab = list.get(0);
		if (symTab.containsKey(name))
			throw new DuplicateSymException();
		
		symTab.put(name, sym);
	}
	
	public void addScope() {
		list.add(0, new HashMap<String, Sym>());
	}
	
	public Sym lookupLocal(String name) 
	throws EmptySymTableException {
		if (list.isEmpty())
			throw new EmptySymTableException();
		
		HashMap<String, Sym> symTab = list.get(0); 
		return symTab.get(name);
	}
	
	public Sym lookupGlobal(String name) 
	throws EmptySymTableException {
		if (list.isEmpty())
			throw new EmptySymTableException();
		
		for (HashMap<String, Sym> symTab : list) {
			Sym sym = symTab.get(name);
			if (sym != null)
				return sym;
		}
		return null;
	}
	
	public void removeScope() throws EmptySymTableException {
		if (list.isEmpty())
			throw new EmptySymTableException();
		list.remove(0);
	}
	
	public void print() {
		System.out.print("\n** Sym Table **\n");
		for (HashMap<String, Sym> symTab : list) {
			System.out.println(symTab.toString());
		}
		System.out.println();
	}

	@Override
	public String toString() {  // used for check fields
		HashMap<String, Sym> fields = list.get(0);
		String temp = " ";
		for(Map.Entry<String, Sym> entry : fields.entrySet()) {
			String key = entry.getKey();
			Sym sym = entry.getValue();
			temp += key + "=" + sym.getType() + "; ";
		}
		return temp;
	}
}
