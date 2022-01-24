/*
 * Check Point 3.10
 */
package chapter03;

import java.util.Scanner;

/**
 *
 * @author emaph
 */
public class CheckPoint03_10 {

    // 3.10.1  Assuming that x is 1, show the result of the following Boolean expressions:
    static void booleanExpressions1() {
        int x = 1;
        System.out.println((true) && (3 > 4));    // false
        System.out.println(!(x > 0) && (x > 0));  // false
        System.out.println((x > 0) || (x < 0));      // true
        System.out.println((x != 0) || (x == 0));   // true
        System.out.println((x >= 0) || (x < 0));    // true
        System.out.println((x != 1) == !(x == 1));  // true
    }

    // 3.10.2 (a) Write a Boolean expression that evaluates to true if a number stored in vari-
    // able num is between 1 and 100. (b) Write a Boolean expression that evaluates to
    //  true if a number stored in variable num is between 1 and 100 or the number is
    // negative.
    static void booleanExpressions2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to test ");;
        int num = input.nextInt();

        // a.
        System.out.println((num > 1) && (num < 100));

        // b
        System.out.println(((num > 1) && (num < 100)) || (num < 0));
    }

    // 3.10.3  (a) Write a Boolean expression for | x - 5 | < 4.5. (b) Write a Boolean expres-
    //             sion for | x - 5 | > 4.5.
    static void booleanExpressions3() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to test ");;
        double x = input.nextDouble();

        // a
        System.out.println((x - 5) < 4.5 && (x - 5) > -4.5);

        // b
        System.out.println((x - 5) > 4.5 || (x - 5) < -4.5);
    }

    // 3.10.4   Assume x and y are int type. Which of the following are legal Java expressions?
    static void booleanExpressions4() {
        int x = 0;
        int y = 0;

        //boolean b1 = x > y > 0;   // bad expression
        // x = y && y;    // bad expression
        x /= y;   // ok
        // boolean b3 = x or y;
        //x and y;
        // boolean b5 = (x != 0) || (x = 0 );  // bad expression
    }

    // 3.10.5  Are the following two expressions the same?
    // yes.
    static void booleanExpressions5() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = input.nextInt();

        // a.
        boolean a = x % 2 == 0 && x % 3 == 0;
        // b
        boolean b = x % 6 == 0;

        System.out.println(a + " " + b);
    }

    // 3.10.6  What is the value of the expression x >= 50 && x <= 100 if x is 45, 67, or 101?
    // 45  false
    // 67  true
    // 101 false
    static void booleanExpressions6() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = input.nextInt();

        System.out.println(x >= 50 && x <= 100);
    }

    // 3.10.7   Suppose, when you run the following program, you enter the input 2 3 6 from
    //              the console. What is the output?
    // true trure false true false
    static void test() {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();

        System.out.println("(x < y && y < z) is " + (x < y && y < z));
        System.out.println("(x < y || y < z) is " + (x < y || y < z));
        System.out.println("!(x < y) is " + !(x < y));
        System.out.println("(x + y < z) is " + (x + y < z));
        System.out.println("(x + y > z) is " + (x + y > z));
    }

    // 3.10.8  Write a Boolean expression that evaluates to true if age is greater than 13 and
    //             less than 18.
    static void booleanExpressions8() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = input.nextInt();

        boolean teen = age > 13 && age < 18;
        System.out.println("teen: " + teen);
    }

    // 3.10.9  Write a Boolean expression that evaluates to true if weight is greater than 50
    //              pounds or height is greater than 60 inches.
    static void booleanExpressions9() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter wieght and height: ");
        int weight = input.nextInt();
        int height = input.nextInt();

        boolean bmi =  weight > 50 || height > 60;
        System.out.println("bmi: " + bmi);
    }

    // 3.10.10  Write a Boolean expression that evaluates to true if weight is greater than 50
    //               pounds and height is greater than 60 inches.
    static void booleanExpressions10() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter wieght and height: ");
        int weight = input.nextInt();
        int height = input.nextInt();

        boolean bmi =  weight > 50 && height > 60;
        System.out.println("bmi: " + bmi);
    }

    // 3.10.11  Write a Boolean expression that evaluates to true if either weight is greater than
    //               50 pounds or height is greater than 60 inches, but not both.
    static void booleanExpressions11() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter wieght and height: ");
        int weight = input.nextInt();
        int height = input.nextInt();

        boolean bmi = weight > 50 ^ height > 60;
        System.out.println("bmi: " + bmi);
    }

    // main program.
    public static void main(String args[]) {
        booleanExpressions11();
        //test();
    }
}
