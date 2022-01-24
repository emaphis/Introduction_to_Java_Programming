/*
 * Check Point 9.12
 * Immutable Objects and Classes
 */
package chapter09.check_point;

// 9.12.1 If a class contains only private data fields and no setter methods, is the class
//        immutable?
// a. maybe.  The accesor methods may return a reference to a mutable object.


// 9.12.2 If all the data fields in a class are private and of primitive types, and the class
//        doesn’t contain any setter methods, is the class immutable?
// a. yes


// 9.12.3 Is the following class immutable?
// a. No getValues returns a reference to mutable array.

class A1 {
    private int[] values;
    public int[] getValues() {
        return values;
    }
}


public class CheckPoint09_12 {
    public static void main(String[] args) {
        System.out.println("in main");
    }
}
