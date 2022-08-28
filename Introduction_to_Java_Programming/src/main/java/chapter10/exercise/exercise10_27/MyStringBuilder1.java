/*
 * Exercise 10.27
 *  (Implement the StringBuilder class)
 */
package chapter10.exercise.exercise10_27;


/**
 * An implementation of StringBuilder
 * @author emaph
 */
public class MyStringBuilder1 {
    private char[] buffer;
    private int numchars;

    public MyStringBuilder1(String s) {
        this.numchars = s.length();
        this.buffer = new char[2 * s.length()];
        for (int i = 0; i < s.length(); i++) {
            buffer[i] = s.charAt(i);
        }
    }

    private MyStringBuilder1(char[] array) {
        this.buffer = array;
        this.numchars = array.length;
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        return append(s.buffer, s.numchars);
    }


    /** Append digits of the passed integer */
    public MyStringBuilder1 append(int i) {
        // get the digits and a count
        int count = 0;
        int[] intbuffer = new int[20];
        while (i >= 1) {
            intbuffer[count + 1] =  i % 10;
            i /= 10;
            count++;
        }

        // reverse digits and convert to chars
        char[] digits = new char[count];
        int idx = 0;
        for (int j = count; j > 0; j--) {
            digits[idx] = Character.forDigit(intbuffer[j], 10);
            idx++;
        }

        return append(digits, count);
    }

     public MyStringBuilder1 append(char[] chars, int length) {
        if (this.buffer.length <= this.numchars + chars.length) {
            int newLength = 2 * (this.numchars + chars.length);
            char[] temp = new char[newLength];
            System.arraycopy(this.buffer, 0, temp, 0, this.buffer.length);
            buffer = temp;
        }
        System.arraycopy(chars, 0, this.buffer, this.numchars, chars.length);
        this.numchars = this.numchars + length;

        return this;
    }

    public int length() {
        return numchars;
    }


    public char charAt(int index) {
        return buffer[index];
    }

    public MyStringBuilder1 toLowerCase() {
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = Character.toLowerCase(buffer[i]);
        }
        return this;
    }

    public MyStringBuilder1 substring(int begin, int end) {
        char[] temp = new char[end - begin];
        System.arraycopy(this.buffer, begin, temp, 0, temp.length);
        return new MyStringBuilder1(temp);
    }

    /** return a String representation of this builder */
    @Override
    public String toString() {
        char[] temp = new char[this.numchars];
        System.arraycopy(this.buffer, 0, temp, 0, this.numchars);
        return new String(temp);
    }
}
