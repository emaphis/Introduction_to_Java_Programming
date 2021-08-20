/*
 * Listing 7.5
 * .9 Variable-Length Argument Lists
 */
package chapter07.example.listing07_05;

/**
 *
 * @author emaph
 */
public class VarArgsDemo {
    public static void main(String[] args) {
        printMax(34, 3, 3, 2, 56, 5);
        printMax(new double[] {1, 2, 3});
    }

    public static void printMax(double ... numbers) {
        if (numbers.length == 0) {
            System.out.println("No arguemetns passed");
            return;
        }

        double result = numbers[0];

        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] > result)
                result = numbers[i];

        System.out.println("The max value " + result);
    }

}
