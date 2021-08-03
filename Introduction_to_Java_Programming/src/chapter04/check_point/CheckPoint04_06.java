/*
 * Check Point 4.6
 * Formatting Console Output
 */
package chapter04.check_point;

/*
Table:
    Format
    Specifier   Output                                      Example
    ---------   ------                                      ------------
    %b          A Boolean value                             True or false
    %c          A character                                 'a’
    %d          A decimal integer                           200
    %f          A floating-point number                     45.460000
    %e          A number in standard scientific notation    4.556000e+01
    %s          A string                                    “Java is cool”

    Example     Output
    %5c         Output the character and add four spaces before the character item, because the width
                is 5.
    %6b         Output the Boolean value and add one space before the false value and two spaces
                before the true value.
    %5d         Output the integer item with width 5. If the number of digits in the item is 65, add
                spaces before the number. If the number of digits in the item is 75, the width is auto-
                matically increased.
    %10.2f      Output the floating-point item with width 10 including a decimal point and two digits
                after the point. Thus, there are seven digits allocated before the decimal point. If the
                number of digits before the decimal point in the item is 67, add spaces before the
                number. If the number of digits before the decimal point in the item is 77, the width
                is automatically increased.
    %10.2e      Output the floating-point item with width 10 including a decimal point, two digits
                after the point and the exponent part. If the displayed number in scientific notation has
                width 610, add spaces before the number.
    %12s        Output the string with width 12 characters. If the string item has fewer than 12 char-
                acters, add spaces before the string. If the string item has more than 12 characters, the
                width is automatically increased.

 */
/**
 * @author emaph
 */
public class CheckPoint04_06 {

    // 4.6.1 What are the format specifiers for outputting a Boolean value, a character, a decimal
    //       integer, a floating-point number, and a string?
    // boolean %b, character %c,  integer i%,
    // decimal %d, floating point %f, string %s

    // 4.6.2 What is wrong in the following statements?
    static void statements2() {
        // (a)  too many parameters
        //System.out.printf("%5d %d", 1, 2, 3);

        // (b)  too few items
        //System.out.printf("%5d %f", 1);

        // (c)  wrong types
        //System.out.printf("%5d %f", 1, 2);

        // (d)  bad format string
        //System.out.printf("%.2f\n%0.3f\n", 1.23456, 2.34);

        // (e)  bad format string
        //System.out.printf("%08s\n", "Java");
    }

    // 4.6.3 Show the output of the following statements:
    static void statements3() {
        // (a) - amount is 32.320000 3.232000e+01
        //System.out.printf("amount is %f %e\n", 32.32, 32.32);

        // (b) - amount is 32.33% 3.2320e+01
        //System.out.printf("amount is %5.2f%% %5.4e\n", 32.327, 32.32);

        // (c) - false
        //System.out.printf("%6b\n", (1 > 2));

        // (d) - Java
        //System.out.printf("%6s\n", "Java");

        // (e) - false Java
        //System.out.printf("%-6b%s\n", (1 > 2), "Java");

        // (f) -  falseJava
        //System.out.printf("%6b%-8s\n", (1 > 2), "Java");

        // (g) - 312,342 315,562.9
        //System.out.printf("%,5d %,6.1f\n", 312342, 315562.932);

        // (h) - 00032 0032.3
        //System.out.printf("%05d %06.1f\n", 32, 32.32);
    }

    public static void main(String[] args) {
        statements3();
    }
}
