/*
 * Check Point 10.10
 * 10.10 The String Class
 */
package chapter10.check_point;

import java.util.Arrays;

/**
 * Check Point 10.10
 *
 * @author emaph
 */
public class CheckPoint10_10 {

    static void test01() {
        // 10.10.1 Suppose s1, s2, s3, and s4 are four strings, given as follows:
        String s1 = "Welcome to Java";
        String s2 = s1;
        String s3 = new String("Welcome to Java");
        String s4 = "Welcome to Java";


        //What are the results of the following expressions?

        // a. s1 == s2 - true  same object
        System.out.println("a. " + (s1 == s2));

        // b. s1 == s3  - false
        System.out.println("b. " + (s1 == s3));

        // c. s1 == s4  - true
        System.out.println("c. " + (s1 == s4));

        // d. s1.equals(s3)  -ctrue
        System.out.println("d. " + (s1.equals(s3)));

        // e. s1.equals(s4) - true
        System.out.println("e. " + (s1.equals(s4)));

        // f. "Welcome to Java".replace("Java", "HTML")
        // a-  Welcome to HTML
        System.out.println("f. " + ("Welcome to Java".replace("Java", "HTML")));

        // g. s1.replace('o', 'T')
        // a - WelcTme tT Java
        System.out.println("g. " + (s1.replace('o', 'T')));

        // h. s1.replaceAll("o", "T")
        // a-  WelcTme tT Java
        System.out.println("h. " + (s1.replaceAll("o", "T")));

        // i. s1.replaceFirst("o", "T")
        // a- WelcTme to Java
        System.out.println("i> " + (s1.replaceFirst("o", "T")));

        // j. s1.toCharArray()
        // a- char array 15 units long
        char[] arr = s1.toCharArray();
        System.out.println("j. " + arr.length);
    }


    // 10.10.2 To create the string Welcome to Java, you may use a statement like this:
    // String s1 = "Welcome to Java";
    // .. or ..
    //  String s2 = new String("Welcome to Java");
    // a- First method is better, It creates the string as an interned String


    static void test03() {
    // 10.10.3 What is the output of the following code
    // a- "Welcome to Java";
    //    "Welcabcme tabc Java";
        String s1 = "Welcome to Java";
        String s2 = s1.replace("o", "abc");
        System.out.println(s1);
        System.out.println(s2);
    }


    static void test04() {
    // 10.10.4 Write the code for the fol￾lowing statements:
        String s1 = " Welcome ";
        String s2 = " welcome ";

    // a. Replace all occurrences of the character e with E in s1 and assign the new
    //     string to s3
    // a-  WElcomE
        String s3 = s1.replace('e', 'E');
        System.out.println("a. " + s3);

    // b. Replace all occurrences of the character e with E in s1 and assign the new
    //     string to s3.
    // a - Welcome, to
        String[] tokens = "Welcome to Java and HTML".split(" ");
        s1 = tokens[0];
        s2 = tokens[1];
        System.out.println(s1 + ", " + s2);
    }

    // 10.10.5 Does any method in the String class change the contents of the string?
    // a-  No. String class is immutable

   static void test06() {
   // 10.10.6 Suppose string s is created using new String(); what is s.length()?
   // a- 0 chars
        String s = new String();
        System.out.println("s.length = " + s.length());
   }

   // 10.10.7 How do you convert a char, an array of characters, or a number to a string?
   static void test07() {
       String s1 = 'a' + "";
       char[] array = {'H', 'e', 'l', 'l', 'o'};
       String s2 = String.valueOf(array);
       String s3 = String.valueOf(33);
       System.out.println(s1 + ", " + s2 + ", " + s3);
   }

   // 10.10.8 Why does the following code cause a NullPointerException?
   // a- text is never initializeds
   static class Test1 {
       private String text;

       public Test1(String s) {
           String text = s;
       }

       public static void main(String[] args) {
           Test1 test = new Test1("ABC");
           System.out.println(test.text.toLowerCase());
       }
   }

   static void test08() {
       Test1 test = new Test1("Hello, Java");

   }

   // 10.10.9 What is wrong in the following program?
   // Test(String s) is a contructor so can't be declaired 'void'


   // 10.10.10 Show the output of the following code:
   // a- false
   //    true
   //    A,B;C
   //    A#B#C
   //    A B C
   static void test10() {
        System.out.println("Hi, ABC, good".matches("ABC "));
        System.out.println("Hi, ABC, good".matches(".*ABC.*"));
        System.out.println("A,B;C".replaceAll(",;", "#"));
        System.out.println("A,B;C".replaceAll("[,;]", "#"));
        String[] tokens = "A,B;C".split("[,;]");
        for (int i = 0; i < tokens.length; i++)
        System.out.print(tokens[i] + " ");
   }

   // 10.10.11 Show the output of the following code:
   // a- 3
   static void test11() {
        String s = "Hi, Good Morning";
        System.out.println(m(s));
   }

   static int m(String s) {
       int count = 0;
       for (int i = 0; i < s.length(); i++) {
           if (Character.isUpperCase(s.charAt(i)))
               count++;
       }
       return count;
   }


    public static void main(String[] args) {
        //test01();
        //test03();
        //test04();
        //test06();
        //test07();
        //test08();
        //test10();
        test11();
    }
}
