/*
 *  Exercise 3.6
 *   (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to
 *   let the user enter weight, feet, and inches. For example, if a person is 5 feet and
 *   10 inches, you will enter 5 for feet and 10 for inches.
 */
package chapter03.exercise.exercise03_06;

import java.util.Scanner;

/**
 * BMI Calculator
 * @author emaph
 */
public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        // Prompt the user to enter height in feet
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();

        // Promt the user to enter rest of heigh in inches
        System.out.print("Enter inches ");
        double inches = input.nextDouble();

        // Calcuate height from feet and inches
        double height = (feet * 12) + inches;

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        // Compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // Display the result
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
