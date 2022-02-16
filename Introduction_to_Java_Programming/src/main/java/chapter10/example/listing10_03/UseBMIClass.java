/*
 * Listing 10.3
 * 10.3 Thinking in Objects
 */
package chapter10.example.listing10_03;

/**
 * Exercise BMI class
 * @author emaph
 */
public class UseBMIClass {
    public static void main(String[] args) {
        BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);
        System.out.println("The BMI for " + bmi1.getName() + " is "
            + bmi1.getBMI() + " " + bmi1.getStatus());

        BMI bmi2 = new BMI("Susan King", 215, 70);
        System.out.println("The BMI for " + bmi2.getName() + " is "
            + bmi2.getBMI() + " " + bmi2.getStatus());
    }
}

/*
The BMI for Kim Yang is 20.81 Normal
The BMI for Susan King is 30.85 Obese
*/
