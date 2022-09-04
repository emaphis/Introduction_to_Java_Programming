/*
 * Exercise 11.17
 *  (Algebra: perfect square) Write a program that prompts the user to enter an
 *  integer m and find the smallest integer n such that m * n is a perfect square.
 *  (Hint: Store all smallest factors of m into an array list. n is the product
 *  of the factors that appear an odd number of times in the array list.
 *  For example, consider m = 90, store the factors 2, 3, 3, and 5 in an array
 *  list. 2 and 5 appear an odd number of times in the array list. Thus, n is 10.)
 */
package chapter11.exercise.exercise11_17;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Algebra: perfect square
 * @author emaph
 */
public class Exercise11_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer m: ");
        int m = input.nextInt();
        input.close();

        int n = getSquare(m);
        System.out.println("The smallest number n for m * n to be a perfects square is " + n);
        System.out.println("m * n is " + (m * n));
    }

    /** Find the prefect square of m */
    private static int getSquare(int m) {
        return product(getOddCounts(getFactors(m)));
    }

    /** Get a list of factors of m */
    private static ArrayList<Integer> getFactors(int m) {
        ArrayList<Integer> factors = new ArrayList<>();
        int factor = 2;

        while (m > 1) {
            if (m % factor == 0) {
                factors.add(factor);
                m /= factor;
            } else
                factor++;   // Try next number for factorization
        }

        return factors;
    }

    /** Return numbers that have an odd count in the passed list */
    private static ArrayList<Integer> getOddCounts(ArrayList<Integer> numbers) {
        ArrayList<Integer> odds = new ArrayList<>();

        for (Integer number : numbers) {
            int count = 0;
            for (Integer other : numbers) {
                if (other == number)
                    count++;
            }
            if (count % 2 == 1 && !odds.contains(number))
                odds.add(number);
        }

        return odds;
    }

    /** Return the product of the ints on the list */
    private static int product(ArrayList<Integer> list) {
        int prod = 1;
        for (Integer num : list) {
            prod *= num;
        }
        return prod;
    }
}

/*
Enter an integer m: 1500
The smallest number n for m * n to be a perfects square is 15
m * n is 22500

Enter an integer m: 63
The smallest number n for m * n to be a perfects square is 7
m * n is 441

Enter an integer m: 90
The smallest number n for m * n to be a perfects square is 10
m * n is 900
*/