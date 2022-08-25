/*
 * Exercise 10.22
 *  (Implement the String class) The String class is provided in the Java library.
 *  Provide your own implementation for the following methods (name the new
 *  class MyString1):
 *
 *   public MyString1(char[] chars);
 *   public char charAt(int index);
 *   public int length();
 *   public MyString1 substring(int begin, int end);
 *   public MyString1 toLowerCase();
 *   public boolean equals(MyString1 s);
 *   public static MyString1 valueOf(int i);
 */

package chapter10.exercise.exercise10_22;

import java.util.Arrays;

/**
 * Exercise MyString1 class
 * @author emaph
 */
public class Exercise10_22 {
    public static void main(String[] args) {
        MyString1 s1 = new MyString1(new char[] {'a', 'b', 'c'});
        MyString1 s2 = new MyString1(new char[] {'a', 'b', 'd'});
        MyString1 s3 = new MyString1(new char[] {'A', 'b', 'C'});
        System.out.println(s1.length());
        System.out.println(s1.charAt(1));
        System.out.println(s1.charAt(2));
        System.out.println(s1.equals(new MyString1(new char[] {'a', 'b', 'c'})));
        System.out.println(s1.equals(s2));
        System.out.println(s1.substring(1, 3).getString());
        System.out.println(s3.toLowerCase().getString());

        MyString1 dig = MyString1.valueOf(345);
        System.out.println(dig.getString());
    }
}
