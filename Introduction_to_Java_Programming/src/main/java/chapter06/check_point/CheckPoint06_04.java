/*
 * Check Point 6.4
 * void vs. Value-Returning Methods
 */
package chapter06.check_point;

/**
 * * @author emaph
 */
public class CheckPoint06_04 {

    // 6.4.1 True or false? A call to a method with a void return type is always a statement it-
    //       self, but a call to a value-returning method cannot be a statement by itself.
    // a. true - call to a void method is alwasys a stement.
    //    tlase - a call to a method wiht a return value is always an expression


    // 6.4.2 What is the return type of a main method?
    // a. void


    // 6.4.3 What would be wrong with not writing a return statement in a value-returning
    //       method? Can you have a return statement in a void method? Does the return
    //       statement in the following method cause syntax errors?
    // a. The compiler wouldn't know what you intended on returning.
    //    Yes, the the method is not declaired to return the any value, so the
    //      return value is a syntax error.

    public static void xMethod(double x, double y) {
        System.out.println(x + y);
        //return x + y;  // error
    }


    // 6.4.4 Write method headers (not the bodies) for the following methods:

    //a. Return a sales commission, given the sales amount and the commission rate.
    static double salesCommission(double salesAmound, double commissionRate) { return 0; }

    //b. Display the calendar for a month, given the month and year.
    static void displayCalendar(int month, int year) { }

    //c. Return a square root of a number.
    static double squareroot(double number) { return 0; }

    //d. Test whether a number is even, and returning true if it is.
    static boolean isEven(int number) { return false; }

    //e. Display a message a specified number of times.
    static void displayMessage(String message, int times) { }

    //f. Return the monthly payment, given the loan amount, number of years, and
    //   annual interest rate.
    static double payment(double loanAmount, int numYears, double annualInterestRate) {
        return 0;
    }

    //g. Return the corresponding uppercase letter, given a lowercase letter
    static char upperCase(char letter) { return 0; }


    // 6.4.5 Identify and correct the errors in the following program:
    public static void method1(int n, int m) { // add void method declaration,
                                               // add int declaration to m parameter
        n += m;
        int out = method2(n);   // probably wanted to return n...
                                // handle return value
        System.out.println("output = " + out);
    }

    public static int method2(int n) {
        if (n > 0) return 1;
        else if (n == 0) return 0;
        else return -1;  // get rid of extraneous if statement.
    }


    public static void main(String[] args) {
        //xMethod(2, 4);
        method1(1, 2);
    }
}
