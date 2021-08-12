/*
 * Exercise 5.35
 * Summation) Write a program to compute the following summation
 *  1/(sqrt(1)+(sqrt(2)) + 1/(sqrt(2)+sqrt(3)) + 1/(sqrt(3)_sqrt(4)) .....
 */
package chapter05.exercise.exercise05_35;

/**
 *
 * @author emaph
 */
public class Summation {
    public static void main(String[] args) {
        final double LIMIT = 625.0;
        double sum = 0;

        for (double b = LIMIT; b > 1; b -= 1.0)
            //System.out.println("(" + (b-1) + ", " + b + ")");
            sum += 1.0 / (Math.sqrt(b - 1) + Math.sqrt(b));

        System.out.println("high to low sum = " + sum);

        sum = 0;

        for (double b = 1; b < LIMIT; b += 1.0)
            //System.out.println("(" + b + ", " + (b+1) + ")");
            sum += 1.0 / (Math.sqrt(b) + Math.sqrt(b));

        System.out.println("low to high sum = " + sum);
    }
}

// igh to low sum = 23.999999999999993
// low to high sum = 24.25982141226206
