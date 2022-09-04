/*
 * Check Point 12.2
 * 12.2 Exception-Handling Overview
 */
package chapter12.check_point;

public class CheckPoint12_02 {

    // 12.2.1 What is the advantage of using exception handling?
    // a- The error cn be delt with at the callng method.
    // 12.2.2 Which of the following statements will throw an exception?
    // a- the first statement thows the exception
    static void test02() {
        // System.out.println(1 / 0);
        // Exception in thread "main" java.lang.ArithmeticException: / by zero

        System.out.println(1.0 / 0);  //Infinity
    }

    // 12.2.3 Point out the problem in the following code. Does the code throw any exceptions?
    // a- no exception, but the code overflows.
    static void test03() {
        long value = Long.MAX_VALUE + 1;
        System.out.println(value);  // -9223372036854775808
    }

    // 12.2.4 What does the JVM do when an exception occurs? How do you catch an
    //        exception?
    // a- It creates an exception object and then looks for a handler for the exception.
    //    You can use a try-catch block to handle an exception somewher in the calling code.
    // 12.2.5 What is the output of the following code?
    // a- "Value is too small"
    //    "Continue after the catch block"
    // What would be the output if value were set to 50.
    // a- "Continue after the catch block"
    static void test05() {
        try {
            int value = 50;
            if (value < 40) {
                throw new Exception("Value is too small");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Continue after the catch block");
    }

    // 12.2.6 Show the output of the following code:
    // a-  0 1
    static void test06a() {
        for (int i = 0; i < 2; i++) {
            System.out.print(i + " ");
            try {
                System.out.println(1 / 0);
            } catch (Exception e) {
            }
        }
    }

    // b- 0
    // the loop only loops once.
    static void test06b() {
        try {
            for (int i = 0; i < 2; i++) {
                System.out.print(i + " ");
                System.out.println(1 / 0);
            }
        } catch (Exception ex) {
        }
    }


    public static void main(String[] args) {
        //test02();
        //test03();
        //test05();
        test06b();
    }
}
