/*
 * Exercise 10.23
 * A String class
 */
package chapter10.exercise.exercise10_23;

import java.util.Arrays;

/**
 * Implement the String class
 * @author emaph
 */
class MyString2 {
    private char[] chars;

    public MyString2(String s) {
        this.chars = s.toCharArray();
    }

    public int compare(String s) {
        return Arrays.compare(chars, s.toCharArray());
    }

    public MyString2 substring(int begin) {
        char[] temp = new char[chars.length - begin];
        System.arraycopy(chars, begin, temp, 0, chars.length - begin);
        return new MyString2(new String(temp));
    }

    public MyString2 toUpperCase() {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            temp.append(chars[i]);
        }
        return new MyString2(temp.toString().toUpperCase());
    }

    public char[] toChars() {
        return chars;
    }

    public static MyString2 valueOf(boolean b) {
        if (b)
            return new MyString2("true");
        else
            return new MyString2("false");
    }

    /** Protected utility function for testing */
    String getString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            builder.append(chars[i]);
        }

        return builder.toString();
    }
}
