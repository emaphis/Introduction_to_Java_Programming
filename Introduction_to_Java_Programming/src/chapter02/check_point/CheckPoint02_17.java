/*
 *  Check Point 2.17
 */
package chapter02.check_point;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class CheckPoint02_17 {
    // 2.17.1 How would you write the following arithmetic expression?
    static void quadraticFormula() {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // the formula
        double out = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        System.out.println("output: "  + out);
    }
    public static void main(String[] args) {
        quadraticFormula();
    }
}
