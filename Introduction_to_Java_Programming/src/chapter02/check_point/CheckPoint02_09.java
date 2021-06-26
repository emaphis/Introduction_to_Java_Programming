package chapter02.check_point;

/**
 *
 * @author emaph
 */
public class CheckPoint02_09 {

    // 2.9.1  - Find the largest and smallest byte, short, int, long, float, and double
    static void sizes() {
        System.out.println("smallist byte: " + Byte.MIN_VALUE);
        System.out.println("largest byte: " + Byte.MAX_VALUE);
        System.out.println("smallest short: " + Short.MIN_VALUE);
        System.out.println("largest short: " + Short.MAX_VALUE);
        System.out.println("smallets int: " + Integer.MIN_VALUE);
        System.out.println("largest ing: " + Integer.MAX_VALUE);
        System.out.println("smallest long: " + Long.MIN_VALUE);
        System.out.println("largest long: " + Long.MAX_VALUE);
        System.out.println("smallest float: " + Float.MIN_VALUE);
        System.out.println("largest float" + Float.MAX_VALUE);
        System.out.println("smallest double: " + Double.MIN_VALUE);
        System.out.println("largest doulbe  " + Double.MAX_VALUE);
        System.out.println();
    }

    // 2.9.2 Show the result of the following remainders
    static void remainders() {
        System.out.println("56 % 6: " + 56 % 6);
        System.out.println("78 % -4: " + 78 % -4);
        System.out.println("-34 % 5: " + -34 % 5);
        System.out.println("34 % -5: " + 34 % -5);
        System.out.println("5 % 1: " + 5 % 1);
        System.out.println("1 % 5: " + 1 % 5);
        System.out.println();
    }

    // 2.9.3 - If today is Tuesday, what will be the day in 100 days?
    static void days() {
        System.out.println("Day: " + (3 + 100) % 7);  // 5 thursdays
        System.out.println();
    }

    // 2.9.4 - What is the result of 25 / 4? How would you rewrite the expression if you wished
    //            the result to be a floating-point number?
    static void division() {
        System.out.println("25 / 4: " + 25 / 4);
        System.out.println("25.0 / 4::" + 25.0 / 4);
        System.out.println();
    }

    // 2.9.5 Show the result of the following code:
    static void code1() {
        System.out.println(2 * (5 / 2 + 5 / 2));   // 8
        System.out.println(2 * 5 / 2 + 2 * 5 / 2);  // 10
        System.out.println(2 * (5 / 2));   // 4
        System.out.println(2 * 5 / 2);   // 5
        System.out.println();
    }

    // 2.9.6 Are the following statements correct? If so, show the output.
    // yes it's valid
    static void statements() {
        System.out.println("25 / 4 is " + 25 / 4);         // 6
        System.out.println("25 / 4.0 is " + 25 / 4.0);    // 6.24
        System.out.println("3 * 2 / 4 is " + 3 * 2 / 4);    // 1
        System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4);  // 1.5
        System.out.println();
    }

    // 2.9.7 Write a statement to display the result of 23.5.
    static void pow1() {
        System.out.println("pow of 2 to 3.5: " + Math.pow(2, 3.5));
        System.out.println();
    }

    // 2.9.8 Suppose m and r are integers. Write a Java expression for mr2 to obtain a
    //          floating-point result.
   static void pow2() {
       int m = 10;
       int r = 5;
       System.out.println(1.0 * m * Math.pow(r,  2));
       System.out.println();
   }

    public static void main(String[] args) {
        sizes();
        remainders();
        days();
        division();
        code1();
        statements();
        pow1();
        pow2();
    }

}
