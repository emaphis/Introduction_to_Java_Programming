/*
 * Exercise 10.23
 *  (Implement the String class) The String class is provided in the Java library.
 *  Provide your own implementation for the following methods (name the new
 *  class MyString2):
 *
 *  public MyString2(String s);
 *  public int compare(String s);
 *  public MyString2 substring(int begin);
 *  public MyString2 toUpperCase();
 *  public char[] toChars();
 *  public static MyString2 valueOf(boolean b);
 */
package chapter10.exercise.exercise10_23;

/**
 *
 * @author emaph
 */
public class Exercise10_23 {
    public static void main(String[] args) {
        MyString2 s1 = new MyString2("abc");
        MyString2 s2 = new MyString2("AbC");

        System.out.println("compare: " + s1.compare("abc"));
        System.out.println("compare: " + s1.compare("def"));

        System.out.println("substring: " + s1.substring(0).getString());
        System.out.println("substring: " + s1.substring(1).getString());

        System.out.println("toUpperCase: " + s1.toUpperCase().getString());
        System.out.println("toUpperCase: " + s2.toUpperCase().getString());

        System.out.println("valueOf: " + MyString2.valueOf(true).getString());
        System.out.println("valueOf: " + MyString2.valueOf(false).getString());
    }
}
