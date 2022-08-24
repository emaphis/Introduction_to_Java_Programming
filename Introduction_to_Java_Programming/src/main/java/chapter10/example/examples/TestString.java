/*
 * 10.10 The String Class.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter10.example.examples;

/**
 *
 * @author emaph
 */
public class TestString {
    public static void main(String[] args) {
        String message1 = new String("Welcome to Java");
        String message2 = "Welcome to Java";

        char[] charArray = {'G', 'o', 'o', 'd', ' ', 'D', 'a', 'y'};
        String message3 = new String(charArray);

        System.out.println( message1 + "\n" + message2 + "\n" + message3);

        // 10.10.1 Immutable Strings and Interned Strings
        String s = "Java";
        s = "HTML";  // updates reference.

        // interned strings
        String s1 = "Welcome to Java";
        String s2 = new String("Welcome to Java");
        String s3 = "Welcome to Java";  //interned
        String s4 = new String("Welcome to Java"); // new object

        System.out.println("s1 == s2 is " + (s1 == s2));  // false
        System.out.println("s1 == s3 is " + (s1 == s3));  // true
        System.out.println("s2 == s4 is " + (s2 == s4));  // false

        // 10.10.2 Replacing ans Splitting Strings
        System.out.println("Welcome".replace('e', 'A'));
        System.out.println("Welcome".replaceFirst("e", "AB"));
        System.out.println("Welcome".replace("e", "AB"));
        System.out.println("Welcome".replace("el", "AB"));
        System.out.println("Welcome".replaceAll("e", "AB"));

        String[] tokens = "Java#HTML#Perl".split("#");
        for (int i = 0; i < tokens.length; i++) {
            System.out.print(tokens[i] + " ");
        }
        System.out.println();

        // 10.10.3  Matching Replacing and Splitting by Patterns

        // all true
        System.out.println("Java".matches("Java"));
        System.out.println("Java".equals("Java"));

        // all true
        System.out.println("Java is fun".matches("Java.*"));
        System.out.println("Java is cool".matches("Java.*"));
        System.out.println("Java is powerful".matches("Java.*"));

        String[] tokens2 = "Java,C?C#,C++".split("[.,:;?]");
        for (int i = 0; i < tokens.length; i++)
            System.out.println(tokens2[i]);

        // 10.10.4 Conversion between Strings and Arrays
        char[] chars ="Java".toCharArray();

        char[] dst = {'J', 'A', 'V', 'A', '1', '3', '0', '1'};
        System.out.println(dst);
        "CS3720".getChars(2, 6, dst, 4);
        System.out.println(dst);

        String str1 = new String(new char[]{'J', 'a', 'v', 'a'});
        String str2 = String.valueOf(new char[]{'J', 'a', 'v', 'a'});
        System.out.println(str1 + ", " + str2);

        // 10.10.3 Converting Characters and Numeric Values to Strings
        double num1 = Double.parseDouble("3.0");
        int num2 = Integer.parseInt("3");

        String strNum = String.valueOf(5.44);
        System.out.println(num1 + ", " + num2 + ", " + strNum);

        // 10.10.6 Formating Strings
        String s5 = String.format("%7.2f%6d%-4s", num1, num2, "AB");
        System.out.println(s5);
    }
}
