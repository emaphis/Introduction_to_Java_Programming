/*
 * 7.13 Command-Line Arguments
 */
package chapter07.example.examples;

/**
 * Print out args values
 * @author emaph
 */
public class TestMain {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
