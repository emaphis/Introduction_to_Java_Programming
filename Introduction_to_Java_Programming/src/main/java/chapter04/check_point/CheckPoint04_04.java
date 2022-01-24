/*
 * Check Point 4.4
 * The String Type
 */
package chapter04.check_point;

/**
 * @author emaph
 */
public class CheckPoint04_04 {

    // .4.1 Suppose s1, s2, and s3 are three strings, given as follows:
    static void strings1() {
        String s1 = "Welcome to Java";
        String s2 = "Programming is fun";
        String s3 = "Welcome to Java";

        System.out.println("(a) " + (s1 == s2)); // false
        System.out.println("(b) " + (s2 == s3)); // false
        System.out.println("(c) " + (s1.equals(s2))); // false
        System.out.println("(d) " + (s1.equals(s3))); // true
        System.out.println("(e) " + (s1.compareTo(s2))); // +7
        System.out.println("(f) " + (s2.compareTo(s3))); // -7
        System.out.println("(g) " + (s2.compareTo(s2))); // 0
        System.out.println("(h) " + (s1.charAt(0)));     // 'W'
        System.out.println("(i) " + (s1.indexOf('j')));  // -1
        System.out.println("(j) " + (s1.indexOf("to"))); // 8
        System.out.println("(k) " + (s1.lastIndexOf('a')));     // 14
        System.out.println("(l) " + (s1.lastIndexOf("o", 15))); // 9
        System.out.println("(m) " + (s1.length()));          // 15
        System.out.println("(n) " + (s1.substring(5)));      // me to Java
        System.out.println("(o) " + (s1.substring(5, 11)));  // me to
        System.out.println("(p) " + (s1.startsWith("Wel"))); // true
        System.out.println("(q) " + (s1.endsWith("Java")));  // true
        System.out.println("(r) " + (s1.toLowerCase())); // welcome to java
        System.out.println("(s) " + (s1.toUpperCase())); // WELCOME TO JAVA
        System.out.println("(t) " + (s1.concat(s2)));    // Welcome to JavaProgramming is fun
        System.out.println("(u) " + (s1.contains(s2)));  // fakse
        System.out.println("(u) " + ("\t Wel \t".trim())); // Wel
    }

    // 4.4.2 Suppose s1 and s2 are two strings. Which of the following statements or expres-
    //       sions are incorrect?
    static void string2() {
        String s1 = "string1";
        String s2 = "string2";

        String s = "Welcome to Java";  // good
        String s3 = s1 + s2;           // good
        // s3 = s1 - s2;               // bad operand type
        boolean b1 = s1 == s2;         // bad practice
        // s1 >= s2;                   // bad operand type
        s1.compareTo(s2);              // good
        int i = s1.length();           // good
        // char c = s1(0);             // bad operand
        //char c = s1.charAt(s1.length()); // dout of bounds
        System.out.println(s + " - " + s3 + " - " + b1 + " - ");
    }

    // 4.4.3 Show the output of the following statements (write a program to verify your
    //       results):
    static void strings3() {
        System.out.println("1" + 1);   // 11
        System.out.println('1' + 1);   // 50
        System.out.println("1" + 1 + 1);   // 111
        System.out.println("1" + (1 + 1)); // 12
        System.out.println('1' + 1 + 1);   // 51
    }

    // 4.4.4 Evaluate the following expressions (write a program to verify your results):
    static void strings4() {
        System.out.println(1 + "Welcome " + 1 + 1);    // 1Welcome 11
        System.out.println(1 + "Welcome " + (1 + 1));  // 1Welcome 2
        System.out.println(1 + "Welcome " + ('\u0001' + 1)); // 1Welcome 2
        System.out.println(1 + "Welcome " + 'a' + 1);  // 1Welcome a1
    }

    // 4.4.5  Let s1 be " Welcome " and s2 be " welcome ". Write the code for the
    //        following statements:
    static void strings5() {
        String s1 = " Welcome ";
        String s2 = " welcome ";

        // (a) Check whether s1 is equal to s2 and assign the result to a Boolean variable
        //     isEqual.
        boolean isEqual =  s1.equals(s2);
        System.out.println("(a) isEqual: "  + isEqual);
        // false

        // (b) Check whether s1 is equal to s2, ignoring case, and assign the result to a Bool-
        //     ean variable isEqual.
        isEqual = s1.equalsIgnoreCase(s2);
        System.out.println("(b) isEqual: "  + isEqual);
        // true

        // (c) Compare s1 with s2 and assign the result to an int variable x.
        int x = s1.compareTo(s2);
        System.out.println("(c) x: " + x);
        // -32

        // (d) Compare s1 with s2, ignoring case, and assign the result to an int variable x.
        x = s1.compareToIgnoreCase(s2);
        System.out.println("(d) x: " + x);
        // 0

        // (e) Check whether s1 has the prefix AAA and assign the result to a Boolean
        //     variable b.
        boolean b = s1.startsWith("AAA");
        System.out.println("(e) b: " + b);
        // false

        // (f) Check whether s1 has the suffix AAA and assign the result to a Boolean
        //     variable b.
        b = s1.endsWith("AAA");
        System.out.println("(e) b: " + b);
        // false

        // (g) Assign the length of s1 to an int variable x.
        x = s1.length();
        System.out.println("(g) x: " + x);
        // 9

        // (h) Assign the first character of s1 to a char variable x.
        char cx = s1.charAt(0);
        System.out.println("(h) cx: " + cx);
        // ' '

        // (i) Create a new string s3 that combines s1 with s2.
        String s3 = s1 + s2;
        System.out.println("(i) s3: " + s3);
        //  Welcome  welcome

        // (j) Create a substring of s1 starting from index 1.
        String sub1 = s1.substring(1);
        System.out.println("(j) sub1: " + sub1);
        // Welcome

        // (k) Create a substring of s1 from index 1 to index 4.
        sub1 = s1.substring(1, 5);
        System.out.println("(k) sub1: " + sub1);
        //  Wel

        // (l) Create a new string s3 that converts s1 to lowercase.
        s3 = s1.toLowerCase();
        System.out.println("(l) s3: " + s3);
        //  welcome

        // (m) Create a new string s3 that converts s1 to uppercase.
        s3 = s1.toUpperCase();
        System.out.println("(m) s3: " + s3);
        //   WELCOME

        // (n) Create a new string s3 that trims whitespaces on both ends of s1.
        s3 = s1.trim();
        System.out.println("(n) s3: " + s3);
        // Welcome

        // (o) Assign the index of the first occurrence of the character e in s1 to an int variable x.
        x = s1.indexOf('e');
        System.out.println("(o) x: "  + x);
        // 2

        // (p) Assign the index of the last occurrence of the string abc in s1 to an int variable x.
        x = s1.lastIndexOf("abc");
        System.out.println("(o) x: "  + x);
        // -1
    }

    // 4.4.6 Write one statement to return the number of digits in an integer i.
    static void strings6() {
        int i = 9999;
        int len =  ("" + i).length();
        System.out.println("lenght: " + len);  // 4
    }

    // 4.4.7 Write one statement to return the number of digits in a double value d.
    static void strings7() {
        double d = Math.PI;
        int len = ("" + d).length();
        System.out.println("lenght: " + len);  // 17
    }

    public static void main(String[] args) {
        strings7();
    }
}
