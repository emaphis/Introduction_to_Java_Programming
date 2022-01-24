/*
 * Check Point 10.8
 * Automatic Conversion between Primitive Types and Wrapper Class Types
 */
package chapter10.check_point;


public class CheckPoint10_08 {

    // 10.8.1 What are autoboxing and autounboxing? Are the following statements correct?
    // a. Boxing is wrapping a primative in a wrapper class.
    //    Unboxxng is removing the primative balue from the wrapper object.
    static void Boxing1() {
        // a.  ok, but uneeded.
        Integer a = 3 + Integer.valueOf(5);

        // b.  ok
        Integer b = 3;

        // c.  Incompatible types
        // Double c = 3;

        // d. ok
        Double d = 3.0;

        // e.  ok, but unneeded.
        int e = Integer.valueOf(3);

        // f.  ok, bu unneeded
        int x = Integer.valueOf(3) + Integer.valueOf(4);
    }


    // 10.8.2 Show the output of the following code.
    // 3
    // -1
    static class Test {
        public static void main(String[] args) {
            Double x = 3.5;
            System.out.println(x.intValue());
            System.out.println(x.compareTo(4.5));
        }
    }

}
