/*
 *  Exercise 7.33
 *   (Culture: Chinese Zodiac) Simplify Listing 3.9 using an array of strings to store
 *   the animal names.
 */
package chapter07.exercise.exercise07_33;

import java.util.Scanner;

/**
 * Chinese Zodiac
 * @author emaph
 */
public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        String[] zodiacs = {"monkey", "rooster", "dog", "pig", "rat", "ox",
			"tiget","rabbit", "dragon", "snake", "horse", "sheep"};

        String sign = zodiacs[year % 12];
        System.out.println("Sign " + sign);
    }
}
