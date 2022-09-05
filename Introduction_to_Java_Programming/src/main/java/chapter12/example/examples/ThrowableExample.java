/*
 * Chapter 12.3
 * Example of Throwable
 */
package chapter12.example.examples;

/**
 * Throwable test
 * @author emaph
 */
public class ThrowableExample {
    public static void main(String[] args) {
        try {
            System.out.println("I got here");
            throw new Throwable("I've been thrown");
        } catch (Throwable th) {
            System.out.println("I caught: " + th.getMessage());
        }
    }
}

/*
I got here
I caught: I've been thrown

I guess Trowable isn't an abstract class.
*/