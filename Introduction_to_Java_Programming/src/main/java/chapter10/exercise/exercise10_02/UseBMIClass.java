/*
 * Exercise 10.2
 * (The BMI class) Add the following new constructor in the BMI class:
 *
 *      ///** Construct a BMI with the specified name, age, weight,
 *         * feet, and inches
 *      public BMI(String name, int age, double weight, double feet,
 *                  double inches)
 */
package chapter10.exercise.exercise10_02;

/**
 * Exercise BMI class
 *
 * @author emaph
 */
public class UseBMIClass {
    public static void main(String[] args) {
        BMI bmi1 = new BMI("Kim Yang", 18, 145, 5, 10);
        printBMI(bmi1);

        BMI bmi2 = new BMI("Susan King", 215, 5, 10);
        printBMI(bmi2);
    }

    static void printBMI(BMI bmi) {
        System.out.println("The BMI for " + bmi.getName() + " is "
                + bmi.getBMI() + " " + bmi.getStatus());
    }
}

// he BMI for Kim Yang is 20.81 Normal
// The BMI for Susan King is 30.85 Obese
