/*
 * Check Point 3.10
 */
package chapter03;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class CheckPoint03_10 {
    // 3.10.1  Assuming that x is 1, show the result of the following Boolean expressions:
    static void booleanExpressions1() {
        int x =  1;
        System.out.println( (true) && (3 > 4) );    // false
        System.out.println( !(x > 0) && (x > 0) );  // false
        System.out.println( (x > 0) || (x < 0) );      // true
        System.out.println( (x != 0) || (x == 0) );   // true
        System.out.println( (x >= 0) || (x < 0) );    // true
        System.out.println( (x != 1) == !(x == 1) );  // true
    }

    // 3.10.2 (a) Write a Boolean expression that evaluates to true if a number stored in vari-
    // able num is between 1 and 100. (b) Write a Boolean expression that evaluates to
    //  true if a number stored in variable num is between 1 and 100 or the number is
    // negative.
    static void booleanExpressions2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to test ");;
        int num = input.nextInt();

        // a.
        System.out.println( (num >= 1) && (num <= 100) );

        // b
        System.out.println( ((num >= 1) && (num <= 100)) || (num < 0) );
    }

    // 3.10.3  (a) Write a Boolean expression for | x - 5 | < 4.5. (b) Write a Boolean expres-
    //             sion for | x - 5 | > 4.5.
    static void booleanExpressions3() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to test ");;
        double x = input.nextDouble();

        // a
        System.out.println( (4.5 < (x-5)) || (4.5 < (x+5)) );

        // b
       // System.out.println( (4.5 < (x-5)) || (4.5 > (x-5)) );
    }

    public static void main(String args[]) {
        booleanExpressions3();
    }
}
