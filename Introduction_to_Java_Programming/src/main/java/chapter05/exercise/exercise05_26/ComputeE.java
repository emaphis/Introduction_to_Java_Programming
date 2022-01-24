/*
 * Exercise 5.26
 *  (Compute e) You can approximate e using the following summation:
 *
 *      e = 1 + 1/1! + 1/2! + 1/3! + 1/4! + ...
 *
 *
 */
package chapter05.exercise.exercise05_26;

/**
 * Compute e
 * @author emaph
 */
public class ComputeE {

    public static void main(String args[]) {
        double e = 1;
        double item = 1;

        for (int i = 1; i <= 20; i++) {
            item /= i;
            e += item;
            System.out.println("E = " + e + " at " + i + " iterations");
        }

        System.out.println("E = " + Math.E);
    }
}

//  = 2.7182818284590455 at 20 iterations