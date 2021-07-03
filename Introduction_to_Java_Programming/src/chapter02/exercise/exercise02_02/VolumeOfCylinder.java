/*
 * Exercise 2.2
 *   (Compute the volume of a cylinder) Write a program that reads in the radius
 *   and length of a cylinder and computes the area and volume using the following
 *   formulas:
 *
 *     area = radius * radius * π
 *     volume = area * length
 */
package chapter02.exercise.exercise02_02;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * Math.PI;
        System.out.println("The area is " + area);

        double volume = area * length;
        System.out.println("The volume is " + volume);
    }

}
