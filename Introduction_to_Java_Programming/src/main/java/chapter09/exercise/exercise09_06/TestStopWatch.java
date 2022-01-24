/*
 * Exercise 9.6
 *  (Stopwatch) Design a class named StopWatch. The class contains:
 *
 *  ■ Private data fields startTime and endTime with getter methods.
 *  ■ A no-arg constructor that initializes startTime with the current time.
 *  ■ A method named start() that resets the startTime to the current time.
 *  ■ A method named stop() that sets the endTime to the current time.
 *  ■ A method named getElapsedTime() that returns the elapsed time for the
 *    stopwatch in milliseconds.
 *
 *  Draw the UML diagram for the class then implement the class. Write a test program
 *  that measures the execution time of sorting 100,000 numbers using selection sort.
 */
package chapter09.exercise.exercise09_06;

/**
 * Test the StopWatch class.
 * @author emaph
 */
public class TestStopWatch {
    public static void main(String[] args) {
        final int SIZE = 100_000;
        StopWatch timer = new StopWatch();
        int[] array = getArray(SIZE);

        timer.start();
        sort(array);
        timer.stop();

        System.out.println("Ellapsed time of the sort: " + timer.getElapsedTime());
    }

    private static int[] getArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * size);
        }
        return array;
    }

    private static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int idx = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    idx = j;
                }
            }

            if (i != idx) {
                array[idx] = array[i];
                array[i] = min;
            }
        }
    }
}

// Ellapsed time of the sort: 2802
