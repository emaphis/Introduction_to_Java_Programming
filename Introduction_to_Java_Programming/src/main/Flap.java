
// Program to run experiments

package main;

public class Flap {

    static void testParameter(int parameter) {
        parameter = 10101;  // Eh, what?
        System.out.println("Parameter = " + parameter);
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        testParameter(123);
    }
}
