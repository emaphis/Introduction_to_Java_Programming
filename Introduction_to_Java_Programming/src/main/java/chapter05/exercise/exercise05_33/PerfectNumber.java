/*
 * Exercise 5.33
 *  (Perfect number) A positive integer is called a perfect number if it is equal to the sum
 *  of all of its positive divisors, excluding itself. For example, 6 is the first perfect num-
 *  ber because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1. There are
 *  four perfect numbers 6 10,000. Write a program to find all these four numbers.
 * See: Exercise 5.16
 */
package chapter05.exercise.exercise05_33;

/**
 * Perfect number
 * @author emaph
 */
public class PerfectNumber {
    public static void main(String[] args) {
        final int lastNumber = 10000;

        // find the perfect numbers
        for (int number = 1; number <= lastNumber; number++) {
            int sum = 0;

            for (int i = number / 2; i > 0; i--) {
                if (number % i == 0)
                    sum += i;
            }

            if (number == sum)
                System.out.println(number + " is a perfect number.");
        }
    }
}

// 6 is a perfect number.
// 28 is a perfect number.
// 496 is a perfect number.
// 8128 is a perfect number.
