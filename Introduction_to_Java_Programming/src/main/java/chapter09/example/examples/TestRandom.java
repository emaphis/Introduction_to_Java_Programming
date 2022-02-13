/*
 * Example from 9.6.2  The Random class
 * 9.6 Using Classes from the Java Library
 */
package chapter09.example.examples;

import java.util.Random;

/**
 *
 * @author emaph
 */
public class TestRandom {
    public static void main(String[] args) {
        Random generator1 = new Random(3);
        System.out.print("From generator1: ");
        for (int i = 0; i < 10; i++)
            System.out.print(generator1.nextInt(1000) + " ");

        // Same seed gives the same sequence
        Random generator2 = new Random(3);
        System.out.print("\nFrom generator2: ");
        for (int i = 0; i < 10; i++)
            System.out.print(generator2.nextInt(1000) + " ");
    }
}

/*
From generator1: 734 660 210 581 128 202 549 564 459 961
From generator2: 734 660 210 581 128 202 549 564 459 961 
*/