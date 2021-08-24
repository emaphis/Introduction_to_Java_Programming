/*
 * Example 8.1
 */
package chapter08.example.examples;

/**
 * Distances
 * @author emaph
 */
public class Distances {
    public static void main(String[] args) {
        double[][] distances = {
            {0, 983, 787, 714, 1375, 967, 1087},
            {983, 0, 214, 1102, 1763, 1723, 1842},
            {787, 214, 0, 888, 1549, 1548, 1627},
            {714, 1102, 888, 0, 661, 781, 810},
            {1375, 1763, 1549, 661, 0, 1426, 1187},
            {967, 1723, 1548, 781, 1426, 0, 239},
            {1087, 1842, 1627, 810, 1187, 239, 0},
        };
        String[] cities = {
            "Chicago", "Boston", "New York", "Atlanta",
            "Miami", "Dallas", "Houston"
        };


        System.out.print("         ");
        for (int i = 0; i < 7; i++) {
            System.out.printf("%8s ", cities[i]);
        }
        System.out.println();

        for (int i = 0; i < 7; i++) {
            System.out.printf("%8s ", cities[i]);
            for (int j = 0; j < 7; j++) {
                System.out.printf("%8.1f ", distances[i][j]);
            }
            System.out.println();
        }
    }

}
