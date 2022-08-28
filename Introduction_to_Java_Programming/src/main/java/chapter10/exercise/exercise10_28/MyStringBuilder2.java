/*
 * Exercise 10.28
 * Implement part of a StringBuilder class
 */
package chapter10.exercise.exercise10_28;


/**
 * MyStringbulder class
 * @author emaph
 */
public class MyStringBuilder2 {
    private char[] buffer;
    private int numchars;

    /** Create a new MyStringBuilder with a default space of 10 */
    // small default size to make MyStringBuilder easy to test.
    public MyStringBuilder2() {
        this.buffer = new char[10];
        this.numchars = 0;  // but it is empty
    }

    /** create a new MyStringBuilder from an array of chars */
    public MyStringBuilder2(char[] chars) {
        this.buffer = new char[2 * chars.length];
        System.arraycopy(chars, 0, this.buffer, 0, chars.length);
        this.numchars = chars.length;
    }

    /** create a new MyStringBuilder from a given string */
    public MyStringBuilder2(String s) {
        this.buffer = new char[2 * s.length()];
        for (int i = 0; i < s.length(); i++) {
            this.buffer[i] = s.charAt(i);
        }
        this.numchars = s.length();
    }

    /** Insert a given MyStringBuilder at a given offset int this builder */
    // Exercise 8.30 ...
    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        int newNumchars = this.numchars + s.numchars;
        char[] newBuffer = new char[2 * newNumchars];

        // Copy first part of this buffer
        System.arraycopy(this.buffer, 0, newBuffer, 0, offset);

        // copy s.buffer after offset position
        System.arraycopy(s.buffer, 0, newBuffer, offset, s.buffer.length);

        // Copy rest of this.buffer
        System.arraycopy(this.buffer, offset, newBuffer, offset + s.getLength(), numchars - offset);

        this.numchars += s.numchars;
        this.buffer = newBuffer;
        return this;
    }

    /** reverse the chars in this builder */
    public MyStringBuilder2 reverse() {
        char[] temp = new char[numchars];
        int idx = 0;
        for (int i = numchars - 1; i >= 0; i--) {
            temp[idx] = this.buffer[i];
            idx++;
        }

        this.buffer = temp;
        return this;
    }


    public MyStringBuilder2 substring(int begin) {
     char[] temp = new char[this.numchars - begin];
        System.arraycopy(this.buffer, begin, temp, 0, temp.length);
        return new MyStringBuilder2(temp);
    }

    /** Convert the chars in this builder to uppercase */
    public MyStringBuilder2 toUpperCase() {
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = Character.toUpperCase(buffer[i]);
        }
        return this;
    }

    /** return a String representation of this builder */
    @Override
    public String toString() {
        char[] temp = new char[this.numchars];
        System.arraycopy(this.buffer, 0, temp, 0, this.numchars);
        return new String(temp);
    }

    /** protected testing function */
    int getLength() {
        return this.numchars;
    }
}
