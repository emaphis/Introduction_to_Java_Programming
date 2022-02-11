/*
 * Listng 6.10
 *  Case Study: Generating Random Characters
 */
package chapter06.example.listing06_10;

/**
 * Generating Random Characters
 * @author emaph
 */
public class RandomCharacter {
    /** Generate a random character between ch1 and ch2 */
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    /** Generate a random lowercase letter */
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }


    /** Generate a random lowercase letter */
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }


    /** Generate a random digit letter */
    public static char getRandomDigitCaseCharacter() {
        return getRandomCharacter('0', '9');
    }


    /** Generate a random letter */
    public static char getRandomDCharacter() {
        return getRandomCharacter('0', '9');
    }

}
