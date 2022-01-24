/*
 * Exercise 1.12
 * (Average speed in kilometers) Assume that a runner runs 24 miles in 1 hour, 40
 * minutes, and 35 seconds. Write a program that displays the average speed in
 * kilometers per hour. (Note 1 mile is equal to 1.6 kilometers.)
 */
package chapter01.exercise01_12;

/**
 * Average speed of runner
 * @author emaph
 */
public class AverageSpeed {

    public static void main(String[] agrs) {
        System.out.print("Average speed: ");
        System.out.println((24 / (1 + (40 / 60.0) + (35 / 3600.0))) * 1.6);
    }

}
