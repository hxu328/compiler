### Overview
This is a simple version of symbol table used for later components of the compiler

### Specifications
The SymTable class will be used by the compiler you write later in the semester to represent a symbol table: a data structure that stores the identifiers declared in the program being compiled (e.g., function and variable names) and information about each identifier (e.g., its type, where it will be stored at runtime). The symbol table will be implemented as a `List` of `HashMaps`. Eventually, each `HashMap` will store the identifiers declared in one *scope* in the program being compiled.

The `HashMap` keys will be `Strings` (the declared identifier names) and the associated information will be `Syms` (you will also implement the `Sym` class). For now, the only information in a `Sym` will be the type of the identifier, represented using a `String` (e.g., "int", "double", etc.).

The `DuplicateSymException` and `EmptySymTableException` classes will define exceptions that can be thrown by methods of the SymTable class.

In addition to defining the four classes, you will write a main program to test your implementation. You will be graded on the correctness of your `Sym` and `SymTable` classes, on how thoroughly you test the classes that you implement, on the efficiency of your code, and on your programming style. You will also answer a couple questions designed to get you thinking about implementation issues.

### The `Sym` Class
The `Sym` class must be in a file named `Sym.java`. You must implement the following `Sym` constructor and public methods (and no other public or protected methods):


| `Sym(String type)`	| This is the constructor; it should initialize the Sym to have the given type. |
|-----------|----------|
| `String getType()`	| Return this Sym's type. |
| `String toString()`	| Return this Sym's type. (This method will be changed later when more information is stored in a Sym.) |

### The `SymTable` Class
The `SymTable` class must be in a file named `SymTable.java`. It must be implemented using a `List` of `HashMaps`. (Think about the operations that will be done on a SymTable to decide whether to use an `ArrayList` or a `LinkedList`.) The `HashMaps` must map a `String` to a `Sym`. This means that the `SymTable` class will have a (private) field of type `List<HashMap<String,Sym>>`.

List and HashMap are defined in the `java.util` package. This means that you will need to have the line `import java.util.*;` at the top of `SymTable.java`.

You must implement the following `SymTable` constructor and public methods (and no other public or protected methods):


| `SymTable()` | This is the constructor; it should initialize the `SymTable`'s List field to contain a single, empty HashMap. |
|-------------------|----------------|
| `void addDecl(String name, Sym sym) throws DuplicateSymException, EmptySymTableException, IllegalArgumentException` | If this SymTable's list is empty, throw an `EmptySymTableException`. If either `name` or `sym` (or both) is null, throw an `IllegalArgumentException`. If the first `HashMap` in the list already contains the given name as a key, throw a `DuplicateSymException`. Otherwise, add the given name and sym to the first `HashMap` in the list. |
|  `void addScope()` | Add a new, empty `HashMap` to the front of the list. |
|  `Sym lookupLocal(String name) throws EmptySymTableException` | If this `SymTable`'s list is empty, throw an `EmptySymTableException`. Otherwise, if the **first** `HashMap` in the list contains `name` as a key, return the associated `Sym`; otherwise, return `null`. |
| `Sym lookupGlobal(String name) throws EmptySymTableException` | If this `SymTable`'s list is empty, throw an `EmptySymTableException`. Otherwise, if **any** `HashMap` in the list contains name as a key, return the first associated `Sym` (i.e., the one from the `HashMap` that is closest to the front of the list); otherwise, return `null`. |
| `void removeScope() throws EmptySymTableException` | If this `SymTable`'s list is empty, throw an `EmptySymTableException`; otherwise, remove the `HashMap` from the front of the list. To clarify, throw an exception only if before attempting to remove, the list is empty (i.e., there are no `HashMaps` to remove). |
| `void print()` | This method is for debugging. First, print `"\n** Sym Table **\n".` Then, for each `HashMap` M in the list, print `M.toString()` followed by a newline. Finally, print one more newline. All output should go to `System.out`. |

### The `DuplicateSymException` and `EmptySymTableException` Classes
These two classes (which must be in files named `DuplicateSymException.java` and `EmptySymTableException.java`) will simply define the two checked exceptions that can be thrown by the `SymTable` class. Each exception must be able to be created using a constructor that takes no arguments.

To define a checked exception named XXX, you can use code like this:  
`public class XXX extends Exception { }` 
Note that the class has an empty body (it will have a no-argument constructor by default).

### The main program
To test your `SymTable` implementation, you will write a main program in a file named `P1.java`. The program **must not** expect any command-line arguments or user input. It can read from one or more files; if you set it up to do that, be sure to hand in the file(s) along with `P1.java`.  

Be sure that your `P1.java` tests all of the `Sym` and `SymTable` operations and all situations under which exceptions are thrown. Also think about testing both "boundary" and "non-boundary" cases.  

It is up to you how your program works. A suggested approach is to write your program so that output is only produced if one of the methods that it is testing does not work as expected (e.g., if the lookupLocal method of the SymTable class returns null when you expect it to return a non-null value). This will make it much easier to determine whether your test succeeds or fails. The one exception to this approach is that P1.java will need to test the `print` method of the `SymTable` class and that will cause output to be produced.  

To help you understand better the kind of code you would write using this suggested approach, look at [`TestList.java`](TestList.java). This file contains a main program designed to test a (fictional) List class whose methods are documented in `TestList.java`. You are being asked to write something similar (in a file called `P1.java`) to test the `Sym` and `SymTable` classes. You should be able to write `P1.java` before you write the classes that it's designed to test.

### Test Code
After the Part 1 deadline download our `P1.java` and test it against the expected output. Make sure that your actual output matches this exactly.
On a Linux machine you can see whether two files match by using the diff utility. For example, typing  
`diff file1 file2`  
compares the two files file1 and file2. Typing  
`diff -b -B file1 file2`  
does the same comparison, but ignores differences in whitespace.  
If you send the output of `P1.java` to a file, you can use `diff` to make sure that it matches the expected output. To send the output of `P1.java` to a file named `out.txt` (on a Linux machine) type the following:  
`java P1 >& out.txt`

### Questions to Answer
Create a text file named `Questions.txt` containing your answers to the following:
1. Each scope in your `SymTable` is a `HashMap`. Java also has a `TreeMap` implementation of the `Map` interface. The `HashMap` is implemented using a hashtable, while the `TreeMap` is implemented using a red-black tree. Why is the `HashMap` preferable in this situation? When would a `TreeMap` be preferable to a `HashMap`?
2. When implementing the List in your `SymTable`, you had a choice between an `ArrayList` and a `LinkedList`. Which implementation did you choose? Why is the implementation you chose preferable to the alternative?

### Handing in
By the Part 1 deadline, submit your `P1.java file` (and the files that it reads, if any).  
By the Part 2 deadline, submit your `Questions.txt` file and the rest of your .java files (this should include your `Sym.java`, `SymTable.java`, `DuplicateSymException.java`, and `EmptySymTableException.java`).  
You may work in the environment of your choice, but be aware that your submitted code must run on the CS department Linux machines.  
**Do not turn in any .class files and do not create any subdirectories in your submission.** If you accidentally turn in (or create) extra files or subdirectories, make a new submission that does not include them.  
Note that your `P1.java` will be worth 15% of your grade for this assignment and will not be accepted late.













