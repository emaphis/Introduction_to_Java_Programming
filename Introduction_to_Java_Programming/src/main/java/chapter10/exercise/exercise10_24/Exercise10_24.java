/*
 * Exercise 10.24
 *  (Implement the Character class) The Character class is provided in the Java
 *  library. Provide your own implementation for this class. Name the new class
 *  MyCharacter.
 */

package chapter10.exercise.exercise10_24;

/**
 * Exercise the MyCharacter Class
 * @author emaph
 */
public class Exercise10_24 {
    public static void main(String[] args) {
        MyCharacter chrA = new MyCharacter('A');
        MyCharacter chra = new MyCharacter('a');
        MyCharacter chrAst = new MyCharacter('@');
        MyCharacter chr5 = new MyCharacter('5');

        System.out.println("getValue: " + chrA.getValue());
        System.out.println("getValue: " + chra.getValue());
        System.out.println("getValue: " + chrAst.getValue());
        System.out.println("getValue: " + chr5.getValue());


        System.out.println("valueOf: " + MyCharacter.valueOf('A').getValue());
        System.out.println("valueOf: " + MyCharacter.valueOf('a').getValue());
        System.out.println("valueOf: " + MyCharacter.valueOf('#').getValue());
        System.out.println("valueOf: " + MyCharacter.valueOf('9').getValue());

        System.out.println("A compareTo a: " + chrA.compareTo(chra));
        System.out.println("a compareTo A: " + chra.compareTo(chrA));

        System.out.println("a isLetter " + chra.isLetter());
        System.out.println("A isLetter " + chrA.isLetter());
        System.out.println("@ isLetter " + chrAst.isLetter());
        System.out.println("5 isLetter " + chr5.isLetter());

        System.out.println("a isDigit " + chra.isDigit());
        System.out.println("A isDigit " + chrA.isDigit());
        System.out.println("5 isDigit " + chr5.isDigit());
        System.out.println("@ isDigit " + chrAst.isDigit());

        System.out.println("a isLetterOrDigit " + chra.isLetterOrDigit());
        System.out.println("A isLetterOrDigit " + chrA.isLetterOrDigit());
        System.out.println("@ isLetterOrDigit " + chrAst.isLetterOrDigit());
        System.out.println("5 isLetterOrDigit " + chr5.isLetterOrDigit());

        System.out.println("a isLowerCase " + chra.isLowerCase());
        System.out.println("A isLowerCase " + chrA.isLowerCase());

        System.out.println("a isUpperCase " + chra.isUpperCase());
        System.out.println("A isUpperCase " + chrA.isUpperCase());

    }
}