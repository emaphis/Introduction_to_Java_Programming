/*
 * Check Point 9.13
 *  The Scope of Variables
 */
package chapter09.check_point;

// 9.13.1 What is the output of the following program?
// a.
// i + j is 23
// k is 2
// j is 0

public class CheckPoint09_13 {
    private static int i = 0;
    private static int j = 0;

    public static void main(String[] args) {
        int i = 2;
        int k = 3;

        {
            int j = 3;
            System.out.println("i + j is " + i + j);
        }

        k = i + j;
        System.out.println("k is " + k);
        System.out.println("j is " + j);
    }

}
