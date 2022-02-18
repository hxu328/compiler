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
 * Sym:
 *  Sym(String type)     -- initialize the Sym to have the given type
 *  String getType()     -- return this Sym's type
 *  String toString()    -- return this Sym's type
 *  @author Huan Xu
 */
public class Sym {
    private String type;

    /**
     * Sym constructor. Initialize this type to the passed in type.
     * @param type
     */
    public Sym(String type){
        this.type = type;
    }

    /**
     * @return this type
     */
    public String getType(){
        return this.type;
    }

    /**
     * @return this type
     */
    public String toString(){
        return this.type;
    }
}
