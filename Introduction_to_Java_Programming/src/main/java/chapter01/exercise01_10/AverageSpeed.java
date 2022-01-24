/*
 * Exercise 1.10
 * (Average speed in miles) Assume that a runner runs 14 kilometers in 45 minutes
 * and 30 seconds. Write a program that displays the average speed in miles per
 * hour. (Note 1 mile is equal to 1.6 kilometers.)
 */
package chapter01.exercise01_10;

/**
 * Calculate average speed of a runner
 * @author emaph
 */
public class AverageSpeed {

    public static void main(String[] args) {
        System.out.print("Average speed: ");
        System.out.println((14 / 1.6) / (45.5 / 60));
    }

}
