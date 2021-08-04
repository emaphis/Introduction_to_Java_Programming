/*
 * Exercise 4.16
 *  (Random character) Write a program that displays a random uppercase letter
 * using the Math.random() method.
 */
package chapter04.exercise.exercise04_16;

/*
    A=65 Z=90
    90 - 65 = 25
*/

/**
 * @author emaph
 */
public class RandomCharacter {
    public static void main(String[] args) {
        int num = 65 + (int) (Math.random() * 26);
        char chr = (char) num;
        System.out.println("Letter = " + chr);
    }
}
