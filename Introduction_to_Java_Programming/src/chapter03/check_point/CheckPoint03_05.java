/*
 * Check Point 3.5
 */
package chapter03.check_point;

/**
 * Nested if
 *
 * @author emaph
 */
public class CheckPoint03_05 {

    // 3.5.2 Suppose x = 2 and y = 3. Show the output, if any, of the following code. What is
    //          the output if x = 3 and y = 2? What is the output if x = 3 and y = 3?
    static void code2() {
        int x = 3;
        int y = 2;

        if (x > 2) {
            if (y > 2) {
                int z = x + y;
                System.out.println("z is " + z);
            } else {
                System.out.println("x is " + x);
            }
        }
    }

    // 3.5.3 What is wrong in the following code?
    // it's in reverse.
    static void code3() {
        /*
        int score = 10;
        if (score >= 60) {
            System.out.println("D");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 90) {
            System.out.println("A");
        } else {
            System.out.println("F");
        }
        */
        // it should be:
        int score = 80;

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

    public static void main(String[] args) {
        code2();
        //code3();
    }
}
