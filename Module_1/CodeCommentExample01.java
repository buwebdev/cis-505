/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by A. Student 2021
*/ 
public class CodeCommentExample01 {

    /**
     * Method with two arguments, which are used to print the user's first and last name.
     * @param firstName String 
     * @param lastName String 
     * @return prints the results to the console window.
     */
    public static void myName(String firstName, String lastName) {
        System.out.println(String.format("My name is %s %s", firstName, lastName));
    } // end myName

    public static void main(String[] args) {
        myName("Richard", "Krasso"); // Call the myName() method with the values "Richard" and "Krasso."
    } // end main
} // end CodeCommentExample01