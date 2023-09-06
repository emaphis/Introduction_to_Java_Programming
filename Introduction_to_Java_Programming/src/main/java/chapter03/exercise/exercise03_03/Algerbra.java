/*
 * Exercise 3.3
 *  (Algebra: solve 2 * 2 linear equations) A linear equation can be solved using
 *  Cramer’s rule given in Programming Exercise 1.13. Write a program that prompts
 *  the user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, report
 *  that “The equation has no solution.”
 *
 * You can use Cramer’s rule to solve the following
 * 2 * 2 system of linear equation:
 *      ax + by = e   x = ed - bf  y = af - ec
 *	cx + dy = f       ad - bc      ad - bc
 */
package chapter03.exercise.exercise03_03;

import java.util.Scanner;

/**
 * Algebra solution
 *
 * @author emaph
 */
public class Algerbra {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        
        input.close();

        // Calculate the divisor
        double div = a * d - b * c;

        if (Math.abs(div) > 0.000000001) {
            double x = (e * d - b * f) / div;
            double y = (a * f - e * c) / div;
            System.out.println("x is " + x + " and y is " + y);
        }
        else
            System.out.println("The equation has no solution.");
    }
}

// test data:
// 9.0 4.0 3.0 -5.0 -6.0 -21.0
// solution x is -2.0 y is 3.0

// 1.0 2.0 2.0 4.0 4.0 5.0
// no soluion
