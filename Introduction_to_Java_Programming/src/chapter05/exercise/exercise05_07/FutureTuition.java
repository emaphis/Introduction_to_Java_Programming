/*
 * Exercise 5.7
 *  (Financial application: compute future tuition) Suppose the tuition for a univer-
 *  sity is $10,000 this year and increases 5% every year. In one year, the tuition will
 *  be $10,500. Write a program that displays the tuition in 10 years, and the total
 *  cost of four years’ worth of tuition starting after the tenth year.
 *  Based on Listing 5.10
 */
package chapter05.exercise.exercise05_07;


public class FutureTuition {
    public static void main(String[] args) {
        double tuition = 10000;  // Year 1
        double accTuition = 0;

        for (int year = 1; year <= 14; year++) {
            tuition = tuition * 1.05;

            //System.out.printf("Year: %3d, Tuition %5.2f\n", year, tuition);

            if (year == 10)
                System.out.printf("Tuition at 10 years is %5.2f\n ", tuition);

            if (year > 10)
                accTuition += tuition;
        }

        System.out.printf("Four years of tuition is %5.2f\n", accTuition);
    }
}

// Tuition at 10 years is 16288.95
// Four years of tuition is 73717.76
