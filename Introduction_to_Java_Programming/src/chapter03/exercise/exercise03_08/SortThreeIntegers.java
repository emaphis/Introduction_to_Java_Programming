/*
 * Exercise 3.8
 *  (Sort three integers) Write a program that prompts the user to enter three integers
 *  and display the integers in non-decreasing order.
 */
package chapter03.exercise.exercise03_08;

import java.util.Scanner;

/**
 * Sort three integers.
 * Lol, see: <https://codereview.stackexchange.com/questions/38247/inputting-and-sorting-three-integers>
 * @author emaph
 */
public class SortThreeIntegers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three integers to sort: ");
        int a = input.nextInt();
        int c = input.nextInt();
        int b = input.nextInt();
        int temp;

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Sorted: " + a + ", " + b + ", " + c);
    }
}
