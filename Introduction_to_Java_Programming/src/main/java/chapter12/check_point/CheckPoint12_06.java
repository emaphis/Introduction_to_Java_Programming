/*
 * Check Point 12.6 - When to Use Exceptions
 */
package chapter12.check_point;

public class CheckPoint12_06 {

    // 12.6.1 The following method checks whether a string is a numeric string:
    public static boolean isNumeric(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (java.lang.NumberFormatException ex) {
            return false;
        }
    }

    // Is it correct? Rewrite it without using exceptions.
    // a- It is correct.
    //  But you can use regex 'matches' method to determine if something is a string.
    //  (We don't "know about" 'regex' yet, lol)
    public static boolean isNumeric2(String token) {
        return token.matches("[0-9]+[\\.]?[0-9]*");
    }

    // see: https://www.tutorialcup.com/java/how-to-check-if-a-string-is-a-number-in-java.htm

    public static void main(String[] args) {
        String str1 = "12345";
        String str2 = "abcde";
        System.out.println(isNumeric(str1));
        System.out.println(isNumeric(str2));

        System.out.println(isNumeric2(str1));
        System.out.println(isNumeric2(str2));


    }
}
