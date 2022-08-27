/*
 * Exercise 10.24
 * A Character Class
 */
package chapter10.exercise.exercise10_24;

/**
 * Implement the Character class)
 * @author emaph
 */
public class MyCharacter {
    private final char value;

    /** Chreat a MyCharacter from a passed char */
    public MyCharacter(char value) {
        this.value = value;
    }

    /** Get char value of MyCharacter */
    public char getValue() {
        return value;
    }

    /** Return a MyCharacter from a passed char */
    public static MyCharacter valueOf(char chr) {
        return new MyCharacter(chr);
    }

    public int compareTo(MyCharacter other) {
        return value - other.value;
    }

    public boolean equals(MyCharacter other) {
        return value == other.value;
    }

    /**  Returns true if the character is a digit.*/
    public boolean isDigit() {
        return(value >= '0' && value <= '9');
    }

    /** Returns true if the character is a letter. */
    public boolean isLetter() {
        return value >= 'A' && value <= 'Z' ||
                value >= 'a' && value <= 'z';
    }

    /**  Returns true if the character is a letter or digit. */
    public boolean isLetterOrDigit() {
        return isLetter() || isDigit();
    }

    /**  Returns true if the character is a lowercase letter. */
    public boolean isLowerCase() {
        return value >= 'a' && value <= 'z';
    }

    /**  Returns true if the character is an uppercase letter. */
    public boolean isUpperCase() {
        return  value >= 'A' && value <= 'Z';
    }

    /**  Returns the lowercase of the character. */
    public char toLowerCase(MyCharacter ch) {
        if (isUpperCase())
            return (char) (value + ('a' - 'A'));
        else
            return value;
    }

    /**  Returns the uppercase of the character. */
    public char toUpperCase() {
        if (isLowerCase())
            return (char)(value - ('a' - 'A'));
        else
            return value;
    }
}
