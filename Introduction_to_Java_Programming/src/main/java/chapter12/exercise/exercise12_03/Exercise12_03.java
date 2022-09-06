/*
 * Exercise 12.3
 *  (ArrayIndexOutOfBoundsException) Write a program that meets the
 *  following requirements:
 *
 *  ■ Creates an array with 100 randomly chosen integers.
 *  ■ Prompts the user to enter the index of the array, then displays the
 *    corresponding element value. If the specified index is out of bounds,
 *    display the message "Out of Bounds".
 */
package chapter12.exercise.exercise12_03;

import java.util.Scanner;

/**
 * ArrayIndexOutOfBoundsException
 * @author emaph
 */
public class Exercise12_03 {
    public static void main(String[] args) {
        int[] array = createArray(100);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter index of integer value: ");
        int i = input.nextInt();
        input.close();
        int value = getValue(i, array);
        System.out.println("The value is " + value);
    }

    static int[] createArray(int number) {
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * number);
        }
        return array;
    }

    static int getValue(int i, int[] array) {
        int value = 0;
        try {
            value = array[i];
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds");
            System.exit(0);
        }
        return value;
    }
}

/*
Enter index of integer value: -1
Out of Bounds

Enter index of integer value: 50
The value is 74

Enter index of integer value: 110
Out of Bounds
*/