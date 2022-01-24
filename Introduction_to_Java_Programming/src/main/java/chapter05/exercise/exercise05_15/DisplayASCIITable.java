/*
 * Exercise 5.15
 *  (Display the ASCII character table) Write a program that prints the characters in
 *  the ASCII character table from ! to ~. Display 10 characters per line. The ASCII
 *  table is given in Appendix B. Characters are separated by exactly one space.
 */
package chapter05.exercise.exercise05_15;

/**
 *  Display ACII table
 * @author emaph
 */
public class DisplayASCIITable {
    public static void main(String[] args) {
        final char START = '!';
        final char END = '~';

        // Print details
        for (char chr = START, count = 1; chr <= END; chr++, count++) {
            if (count % 10 == 0)
                System.out.println(chr);
            else
                System.out.print(chr + " ");
        }
        System.out.println();
    }
}
