/*
 * Check Point 9.11
 * Array of Objects
 */
package chapter09.check_point;

// 9.11.1 What is wrong in the following code?
// a. Dates are created as nulls
// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.util.Date.toString()" because "dates[0]" is null

public class CheckPoint09_11 {
    public static void main(String[] args) {
        java.util.Date[] dates = new java.util.Date[10];
        System.out.println(dates[0]);
        System.out.println(dates[0].toString());
    }
}
