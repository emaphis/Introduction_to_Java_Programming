/*
 * Exercise 8.21
 *  (Central city) Given a set of cities, the central city is the city that has the shortest
 *  total distance to all other cities. Write a program that prompts the user to enter
 *  the number of cities and the locations of the cities (coordinates), and finds the
 *  central city and its total distance to all other cities.
 */
package chapter08.exercise.exercise08_21;

import java.util.Scanner;

/**
 * Central city
 * @author emaph
 */
public class CentralCities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of cities: ");
        int num = input.nextInt();
        System.out.println("Enter the coordinates of the cites: ");
        double[][] cities = new double[num][2];
        for (int i = 0; i < num; i++) {
            cities[i][0] = input.nextDouble();
            cities[i][1] = input.nextDouble();
        }

        double shortest[] = distances(cities);

        System.out.println("The center of the city is at (" + shortest[0]
                + ", " + shortest[1] + ")");
        System.out.println("The total distance to all other cites is " + shortest[2]);
    }

    public static double[] distances(double[][] cities) {
        double[] output = new double[3];
        double min = 99999;

        for (int i = 0; i < cities.length; i++) {
            double dist = 0;
            for (int j = 0; j < cities.length; j++) {
                dist += distance(cities[i], cities[j]);
            }

            if (dist < min && dist != 0.0) {
                min = dist;
                output[0] = cities[i][0];
                output[1] = cities[i][1];
                output[2] = dist;
            }
        }
        return output;
    }



    /** Compute the distance between two points (x1, y1) and (x2, y2)*/
    public static double distance(double[] city1, double[] city2) {
        double x1 = city1[0];
        double y1 = city1[1];
        double x2 = city2[0];
        double y2 = city2[1];
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

}
