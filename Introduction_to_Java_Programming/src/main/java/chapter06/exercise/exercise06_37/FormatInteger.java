/*
 * Exercise 6.37
 *  (Format an integer) Write a method with the following header to format the inte-
 *  ger with the specified width
 *
 *      public static String format(int number, int width)
 *
 *  The method returns a string for the number with one or more prefix 0s. The size
 *  of the string is the width. For example, format(34, 4) returns 0034 and for-
 *  mat(34, 5) returns 00034. If the number is longer than the width, the method
 *  returns the string representation for the number. For example, format(34, 1)
 *  returns 34.
 */
package chapter06.exercise.exercise06_37;

import java.util.Scanner;

/**
 * Format an integer
 * @author emaph
 */
public class FormatInteger {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);

        System.out.print("Enter number to format: ");
        int number = inpt.nextInt();
        System.out.print("Enter with to format number: ");
        int width = inpt.nextInt();

        System.out.println(format(number, width));
    }

    /** format an inter prepending '0's to fill with
      * Do as much using integer arithmetic to speed up formatting.*/
    public static String format(int number, int width) {
        int numWidth = getSize(number);
        String out = "";

        for (int i = 0; i < width - numWidth; i++)
            out += "0";

        out = out + number;

        return out;
    }

    /** Return the number of digits in d
     * Borrowed from Ex 6.31  */
    public static int getSize(long d) {
        int size = 0;
        while (d > 0) {
            size++;
            d /= 10;
        }
        return size;
    }
}
