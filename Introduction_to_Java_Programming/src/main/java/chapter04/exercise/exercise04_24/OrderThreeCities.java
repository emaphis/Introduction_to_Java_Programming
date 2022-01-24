/*
 * Exercise 4.24
 *  (Order three cities) Write a program that prompts the user to enter three cities
 *  and displays them in ascending order.
 *  See Exercise 3.8
 */
package chapter04.exercise.exercise04_24;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class OrderThreeCities {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();
        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();

        String temp;
        if ((city2.compareTo(city1) < 0) && (city2.compareTo(city3) < 0)) {
            temp = city1;
            city1 = city2;
            city2 = temp;
        }
        if ((city3.compareTo(city1) < 0) && (city3.compareTo(city2) < 0)) {
            temp = city1;
            city1 = city3;
            city3 = temp;

        }
        if (city3.compareTo(city2) < 0) {
            temp = city2;
            city2 = city3;
            city3 = temp;
        }

        System.out.println("The three cities in alphabetical order are "
                + city1 + " " + city2 + " " + city3);
    }
}
