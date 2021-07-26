/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter03.exercise.exercise03_19;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class PerimeterOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of a triangle: ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();

        if (s1 > (s2 + s3) || s2 > (s1 + s3) || s3 > (s1 + s2)) {
            System.out.println("Invalid triangle");
        } else {
            double perimeter = s1 + s2 + s3;
            System.out.println("Triangle perimeter is " + perimeter);
        }
    }
}
