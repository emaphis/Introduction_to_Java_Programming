/*
 * Listing 6.9
 *  6.8 Overloading Methods
 */
package chapter06.example.listing06_09;

/**
 *  Two max methods
 * @author emaph
 */
public class TestMethodOverloading {


    public static void main(String[] args) {
        // Called with int parameters
        System.out.println("The maximum of 3 and 4 is " + max(3, 4));

        // Called with double parameters
        System.out.println("The maximum of 3.0 and 5.4 is "  + max(3.0, 5.4));

        // Invoke the max method with three double parameters
        System.out.println("The maximum of 3.0, 5.4, and 10.14 is " + max(3.0, 5.4, 10.14));
    }

    /** Return the max of two int values */
    public static int max(int num1, int num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    /** Return the max of two int values */
    public static double max(double num1, double num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    /** Return the max of three double values */
    public static double max(double num1, double num2, double num3) {
        return max(max(num1, num2), num3);
    }
}
