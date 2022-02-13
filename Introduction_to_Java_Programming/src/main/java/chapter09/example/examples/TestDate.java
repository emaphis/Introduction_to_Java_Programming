/*
 * Example from 9.6.1
 * 9.6 Using Classes from the Java Library
 */
package chapter09.example.examples;

/**
 *
 * @author emaph
 */
public class TestDate {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        System.out.println("The elapsed time since Jan 1, 1970 is " +
                date.getTime() + " milliseconds");
        System.out.println(date.toString());
    }
}

/*
The elapsed time since Jan 1, 1970 is 1644723789966 milliseconds
Sat Feb 12 22:43:09 EST 2022
*/