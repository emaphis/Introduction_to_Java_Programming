/*
 *
 *  various untilities
 */
package utilities;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class Utilities {

    public static int[] getIntArray(Scanner input, int size) {
        int[] out = new int[size];
        for (int i = 0; i < size; i++) {
            out[i] = input.nextInt();
        }
        return out;
    }

    public static double[] getDoubleArray(Scanner input, int size) {
        double[] out = new double[size];
        for (int i = 0; i < size; i++) {
            out[i] = input.nextDouble();
        }
        return out;
    }

    public static void printArray(int[] list) {
        for (int elem : list) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

}
