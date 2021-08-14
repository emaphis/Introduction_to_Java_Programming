/*
 * Listing 6.4
 * 6.5 Passing Arguments by Values
 */
package chapter06.example.listing06_04;

/**
 * Testing passing by value
 * @author emaph
 */
public class Increment {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the call, x is " + x);
        increment(x);
        System.out.println("After the call x is " + x);
    }

    public static void increment(int n) {
        n++;
        System.out.println("n inside the method is " + n);
    }
}
