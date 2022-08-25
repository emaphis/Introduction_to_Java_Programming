/*
 * Exercise 10.22
 * Create a String class
 */
package chapter10.exercise.exercise10_22;

import java.util.Arrays;

/**
 * A String Class
 * @author emaph
 */
public class MyString1 {
    private char[] data;

    /** Create a MyString from a char array */
    public MyString1(char[] chars) {
        this.data = new char[chars.length];
        System.arraycopy(chars, 0, this.data, 0, chars.length);
    }

    /** return the char at the index position of the string */
    public char charAt(int index) {
        return data[index];
    }

    /** Return length of the string */
    public int length() {
        return data.length;
    }

    /** Get a substring of this string */
    public MyString1 substring(int begin, int end) {
        char[] temp = new char[end - begin];
        int idx = 0;
        for (int i = begin; i < end; i++) {
            temp[idx] = this.data[i];
            idx++;
        }

        return new MyString1(temp);
    }

    /** Return a new string with lowercase chars */
    public MyString1 toLowerCase() {
        char[] temp = new char[data.length];
        for (int i = 0; i < data.length; i++) {
            temp[i] = Character.toLowerCase(data[i]);
        }

        return new MyString1(temp);
    }

    /** Returns true if the strings are equal */
    public boolean equals(MyString1 s) {
        if (data.length != s.length())
            return false;

        for (int i = 0; i < data.length; i++) {
            if (data[i] != s.charAt(i))
                return false;
        }

        return true;
    }

    /** Convert int to a string */
    public static MyString1 valueOf(int i) {
        // get the digits
        int count = 0;
        int[] digitBuffer = new int[20];
        while (i >= 1) {
            digitBuffer[count + 1] = i % 10;
            i /= 10;
            count++;
        }

        // reverse digits and convert to chars
        char[] chars = new char[count];
        int idx = 0;
        for (int j = count; j > 0; j--) {
            chars[idx] = Character.forDigit(digitBuffer[j], 10);
            idx++;
        }

        return new MyString1(chars);
    }

    /** Protected utility function for testing */
    String getString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            builder.append(data[i]);
        }

        return builder.toString();
    }
}
