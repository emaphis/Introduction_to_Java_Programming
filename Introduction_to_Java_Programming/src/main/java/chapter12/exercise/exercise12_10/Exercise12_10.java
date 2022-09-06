/*
 * Exercise 12.10
 *  (OutOfMemoryError) Write a program that couses the JVM to throw an
 *  OutOFMemoryError and catches and handels this error.
 */
package chapter12.exercise.exercise12_10;

/**
 * OutOfMemoryError
 * @author emaph
 */
public class Exercise12_10 {
    public static void main(String[] args) {
        char[] array = null;
        try {
            array = new char[Integer.MAX_VALUE];
        }
        catch (OutOfMemoryError er) {
            System.out.println("Error: " + er.getMessage());
            // Opps. Let's allocate something more resonalble.
            array = new char[1000000];
        }

        System.out.println("Array length: " + array.length);
    }
}

/*
Error: Requested array size exceeds VM limit
Array length: 1000000
*/