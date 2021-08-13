/*
 *  Listing 1
 * 6.3 Calling a Method
 */
package chapter06.example.listing06_01;

/**
 *  program that is used to test the max method.
 * @author emaph
 */
public class TestMax {

    public static void main(String args[]) {
        int i = 5;
        int j = 2;
        int k = max(i, j);

        System.out.println("The maximum of " + i + " and " + j + " is " + k);
    }

    /** Return the max of two numbers */
    private static int max(int num1, int num2) {
        int result;

        if (num1 > num2)
            result = num1;
        else
            result = num2;

        return result;
    }
}
