/*
 * 10.11 The StringBuilder and StringBuffer Classes
 *
 */
package chapter10.example.examples;

/**
 *Test the StringBuilder Class
 * @author emaph
 */
public class TestStringBuilder {
    public static void main(String[] args) {

        // 10.11.1 Modifying Strings in the StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Wecome");
        stringBuilder.append(' ');
        stringBuilder.append("to");
        stringBuilder.append(' ');
        stringBuilder.append("Java");
        System.out.println("sb = " + stringBuilder);

        stringBuilder.insert(10, "HTML and ");
        System.out.println("sb = " + stringBuilder);

        StringBuilder stringBuilder1 = stringBuilder.reverse();
        System.out.println("sb1 = " + stringBuilder1);

        // 10.11.3 Case Study: Ignoring Nonalphanumeric Characters When
        //         Checking Palindromes
        // See Listing10_10.java

        System.out.println("Ok Ok Ok");
    }
}
