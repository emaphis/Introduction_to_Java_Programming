/*
 *  Check Point 3.2.
 */
package chapter03.check_point;

/**
 *
 * @author emaph
 */
public class CheckPoint03_02 {
    // 3.2.1  List six relational operators.
    // > < == != => <=

    //  3.2.2  Assuming x is 1, show the result of the following Boolean expressions:
    static void expressions() {
        int x = 1;
        System.out.println(x > 0);
        System.out.println(x < 0);
        System.out.println(x != 0);
        System.out.println(x >= 0);
        System.out.println(x != 1);
        System.out.println();
    }

    // 3.2.3  Can the following conversions involving casting be allowed? Write a test program
    //           to verify it.
    static void conversions() {
        boolean b = true;
        //int i = (int)b;  // not legal

        int i = 1;
        //b = (boolean) i;   // not legal
    }

    public static void main(String[] args) {
        expressions();
    }
}
