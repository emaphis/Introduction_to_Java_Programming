/*
 * Check Point 10.11
 * 10.11 The StringBuilder and StringBuffer Classes
 */
package chapter10.check_point;

/**
 *
 * @author emaph
 */
public class CheckPoint10_11 {
    // 10.11.1 What is the difference between StringBuilder and StringBuffer?
    // a- StringBuilder is nonsyncronized so works well with single-threaded programs
    //    StringBuffers works well with multi-threaded programs that concurrently
    //    access the StringBuffer


    static void test02() {
    // 10.11.2 How do you create a string builder from a string? How do you return a string
    //         from a string builder?
    // a-  constructor
        StringBuilder builder = new StringBuilder("A string");
        builder.append(" is built.");

    // b- .toString()
        String str = builder.toString();

        System.out.println(str);
    }


    // 10.11.3 Write three statements to reverse a string s using the reverse method in the
    //         StringBuilder class.
    static void test03() {
        StringBuilder builder = new StringBuilder("A Java String");
        builder.reverse();
        System.out.println(builder.toString());
    }


    // 10.11.4 Write three statements to delete a substring from a string s of 20 characters,
    //         starting at index 4 and ending with index 10. Use the delete method in the
    //         StringBuilder class.
    static void test04() {
        StringBuilder builder = new StringBuilder("Java and HTML are OK");
        builder.delete(4, 10);
        System.out.println(builder.toString());
    }


    // 10.11.5 What is the internal storage for characters in a string and a string builder?
    // a- A char array.


    static void test06() {
    // 10.11.6 Suppose s1 and s2 are given as follows:
        StringBuilder s1 = new StringBuilder("Java");
        StringBuilder s2 = new StringBuilder("HTML");

    // Show the value of s1 after each of the following statements. Assume the
    // statements are independent.

    // a. s1.append(" is fun");
    // a- Java is fun
    //    System.out.println("a. " + (s1.append(" is fun")));

    // b. s1.append(s2);
    // a- JavaHTML
    //    System.out.println("b. " + (s1.append(s2)));

    // c. s1.insert(2, "is fun");
    // a- Jais fun
    //    System.out.println("c. " + (s1.insert(2, "is fun")));

    // d. s1.insert(1, s2);
    // a- JHTMLava
    //    System.out.println("d. " + (s1.insert(1, s2)));

    // e. s1.charAt(2);
    // a- v
    //    System.out.println("e. " + (s1.charAt(2)));

    // f. s1.length();
    // a- 4
    //    System.out.println("f. " + (s1.length()));

    // g. s1.deleteCharAt(3);
    // a- Jav
    //    System.out.println("g. " + (s1.deleteCharAt(3)));

    // h. s1.delete(1, 3);
    // a- Ja
    //    System.out.println("h. " + (s1.delete(1, 3)));

    // i. s1.reverse();
    // a- avaJ
    //    System.out.println("i. " + (s1.reverse()));

    // j. s1.replace(1, 3, "Computer");
    // a. JComputera
    //    System.out.println("j. " + s1.replace(1, 3, "Computer"));

    // k. s1.substring(1, 3);
    // a- av
    //    System.out.println("k. " + (s1.substring(1, 3)));

    // l. s1.substring(2);
    // a- va
        System.out.println("l. " + (s1.substring(2)));
    }


    // 10.11.7 Show the output of the following program:
    // a- Java
    //    Java and HTML
    static void test07() {
        String s = "Java";
        StringBuilder builder = new StringBuilder(s);
        change(s, builder);

        System.out.println(s);
        System.out.println(builder);
    }

    private static void change(String s, StringBuilder builder) {
        s = s + "and HTML";
        builder.append(" and HTML");
    }


    public static void main(String[] args) {
        //test02();
        //test03();
        //test04();
        //test06();
        test07();
    }
}
