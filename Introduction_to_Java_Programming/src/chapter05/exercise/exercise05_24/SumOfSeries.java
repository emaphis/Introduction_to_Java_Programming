/*
 * Exercise 5.24
 *  (Sum a series) Write a program to compute the following summation:
 *
 *      1/3 + 3/5 + 5/7 + 9/11 + 11/13 + ... + 95/97 + 97/99
 */
package chapter05.exercise.exercise05_24;


/**
 * um a series
 * @author emaph
 */
public class SumOfSeries {
    public static void main(String[] args) {
        double sum = 0.0;
        for (int i = 1; i <= 97; i += 2)
            sum += i / (i + 2.0);

         System.out.println("Sum: " + sum);
    }
}

// Sum: 45.124450303050196