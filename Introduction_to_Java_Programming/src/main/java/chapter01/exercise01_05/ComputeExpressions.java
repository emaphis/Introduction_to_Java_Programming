/*
 * Exercise 1.5
 * (Compute expressions) Write a program that displays the result of
*         9.5 * 4.5 - 2.5 * 3
*        -----------------------
*                45.5 - 3.5
 */
package chapter01.exercise01_05;

/**
 * Compute expressions
 *
 * @author emaph
 */
public class ComputeExpressions {

    public static void main(String[] args) {
        System.out.println("9.5 X 4.5 - 2.5 X 3");
        System.out.println("-------------------");
        System.out.println("     45.5 - 3.5");
        System.out.println("");
        System.out.println((9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5));
    }
}
