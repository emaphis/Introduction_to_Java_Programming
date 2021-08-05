/*
 * Exercise 4.25
 *  (Generate vehicle plate numbers) Assume that a vehicle plate number consists
 *  of three uppercase letters followed by four digits. Write a program to generate a
 *  plate number.
 */
package chapter04.exercise.exercise04_25;

/**
 *
 * @author emaph
 */
public class GenerateVehiclePlateNumbers {
    public static void main(String[] args) {
        // Generate 3 random uppercas latters
        char chr1 = (char)(65 + (int)(Math.random() * 26));
        char chr2 = (char)(65 + (int)(Math.random() * 26));
        char chr3 = (char)(65 + (int)(Math.random() * 26));

        // Generate 4 random digits
        int dig1 = (int)(Math.random() * 10);
        int dig2 = (int)(Math.random() * 10);
        int dig3 = (int)(Math.random() * 10);
        int dig4 = (int)(Math.random() * 10);

        String licence = "" + chr1 + chr2 + chr3 + "-" + dig1 + dig2 + dig3 + dig4;

        System.out.println("License number: " + licence);
    }
}
