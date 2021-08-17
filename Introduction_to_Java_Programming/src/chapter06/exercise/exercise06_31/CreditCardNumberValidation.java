/*
 * Exercise 6.31
 *  (Financial: credit card number validation) Credit card numbers follow certain
 *  patterns. A credit card number must have between 13 and 16 digits. It must start
 *  with
 *
 *      ■ 4 for Visa cards
 *      ■ 5 for Master cards
 *      ■ 37 for American Express cards
 *      ■ 6 for Discover cards
 *
 *  Luhn check or the Mod 10 check, which can be described as follows (for illustra-
 *  tion, consider the card number 4388576018402626):
 *
 *  1. Double every second digit from right to left. If doubling of a digit results in a
 *     two-digit number, add up the two digits to get a single-digit number.
 *
 *      Number: 4388576018402626
 *      2 * 2 = 4
 *      2 * 2 = 4
 *      4 * 2 = 8
 *      1 * 2 = 2
 *      6 * 2 = 12 -> (1 + 2 = 3)
 *      5 * 2 = 10 -> (1 + 0 = 1)
 *      8 * 2 = 16 -> (1 + 6 = 7)
 *      4 * 2 = 8
 *
 *  2. Now add all single-digit numbers from Step 1.
 *
 *      4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 37
 *
 *  3. Add all digits in the odd places from right to left in the card number.
 *
 *      6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38
 *
 *  4. Sum the results from Step 2 and Step 3.
 *
 *      37 + 38 = 75
 *
 *  5. If the result from Step 4 is divisible by 10, the card number is valid; other-
 *     wise, it is invalid. For example, the number 4388576018402626 is invalid,
 *     but the number 4388576018410707 is valid.
 *
 *  Write a program that prompts the user to enter a credit card number as a long
 *  integer. Display whether the number is valid or invalid. Design your program to
 *  use the following methods:
 */
package chapter06.exercise.exercise06_31;

import java.util.Scanner;

/**
 * credit card number validation
 * @author emaph
 */
public class CreditCardNumberValidation {
    public static void main(String[] args) {
        final int codeLenght = 16;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a credit card number as a long integer: ");
        long number = input.nextLong();

        if (isValid(number))
            System.out.println(number + "is valid");
        else
            System.out.println(number + "is invalid");
    }

    /** Return true if the card number is valid */
    public static boolean isValid(long number) {
        boolean size = getSize(number) >= 13 && getSize(number) <= 16;
        boolean prefix = checkPrefix(number);
        boolean checkSum = (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0;

        return size && prefix && checkSum;
    }



    /** Check number prefixes for companies */
    static boolean checkPrefix(long number) {
        boolean check = prefixMatched(number, 4)   // visa
                     || prefixMatched(number, 5)   // Master card
                     || prefixMatched(number, 37)  // American express
                     || prefixMatched(number, 6);  // Discover
        return check;
    }

    /** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        while (number > 0) {
            number /= 10;  // skip odd, to get even
            sum += getDigit((int)(number % 10) * 2);
            //System.out.print(getDigit((int)(number % 10) * 2) + " ");  // test
            number /= 10; // move to next even
        }
        return sum;
    }

    /** Return this number if it is a single digit, otherwise,
      * return the sum of the two digits */
    public static int getDigit(int number) {
        if (number < 10)
            return number;
        else {
            int num1 = number % 10;
            int num2 = number / 10;
            return num1 + num2;
        }
    }

    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            //System.out.print((number % 10) + " ");  // test code;
            number /= 100;   // skip 2 digits
        }
        return sum;
    }

    /** Return true if the number prfx is a prefix for number */
    public static boolean prefixMatched(long number, int prfx) {
        long prefix = getPrefix(number, getSize(prfx));
        return prefix == prfx;
    }

    /** Return the number of digits in d */
    public static int getSize(long d) {
        int size = 0;
        while (d > 0) {
            size++;
            d /= 10;
        }
        return size;
    }

    /** Return the first k number of digits from; number. If the
      * number of digits in number is less than k, return number. */
    public static long getPrefix(long number, int k) {
        int size = getSize(number);
        for (int i = 0; i < size - k; i++)  // whittle down the number
            number /= 10;                   // until k
        return number;
    }

}

// invalid:  4388576018402626
//   valid:  4388576018410707