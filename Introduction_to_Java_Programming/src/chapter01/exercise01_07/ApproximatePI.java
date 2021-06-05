/*
 * Exercise 1.7
 */
package chapter01.exercise01_07;

/**
 *
 * @author emaph
 */
public class ApproximatePI {

    public static void main(String[] args) {

        System.out.println(4 * (1.0 - (1 / 3) + (1 / 5)
                - (1 / 7) + (1 / 9) - (1 / 11)));
        
        System.out.println(4 * (1.0 - (1 / 3) + (1 / 5) - (1 / 7)
                + (1 / 9) - (1 / 11) + (1 / 13)));
    }
}
