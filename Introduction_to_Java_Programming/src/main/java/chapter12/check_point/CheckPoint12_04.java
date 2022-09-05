/*
 * Check Point 12.4
 * 12.4 Declaring, Throwing, and Catching Exceptions
 */
package chapter12.check_point;

public class CheckPoint12_04 {

    // 12.4.1 What is the purpose of declaring exceptions? How do you declare an exception
    //        and where? Can you declare multiple exceptions in a method header?
    // a- Declare esception so the compiler know the method throws an exception.
    //    You declare the exception with the 'throws' in the method header
    //    Yes, you can declare multiple exceptions in a method using commas.

    // 12.4.2 How do you throw an exception? Can you throw multiple exceptions in one
    //        throw statement?
    // a- use the 'throw' keyword, creating a new exception
    //    No.

    // 12.4.3 What is the keyword throw used for? What is the keyword throws used for?
    // a- 'throw' throws a new exception
    //    'throws' declares a exception signature for a method.

    // 12.4.4 Suppose statement2 causes an exception in the following try-catch block:
    /*
    try {
        statement1;
        statement2;
        statement3;
    }
    catch (Exception1 ex1) {
    }
    catch (Exception2 ex2) {
    }
    statement4;
     */
    // Answer the following questions:
    // ■ Will statement3 be executed?
    //   No,
    // ■ If the exception is not caught, will statement4 be executed?
    //   No.
    // ■ If the exception is caught in the catch block, will statement4 be executed?
    //   Yes.

     // 12.4.5 What is displayed when running the following program?
    // a- RuntimeException
    static void test05() {
        try {
            int[] list = new int[10];
            System.out.println("list[10] is " + list[10]);
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException");
        } catch (RuntimeException ex) {
            System.out.println("RuntimeException");
        } catch (Exception ex) {
            System.out.println("Exception");
        }
    }

    // 12.4.6 What is displayed when running the following program?
    // a- ArithmeticException
    static void test06() {
        try {
            method1();
            System.out.println("After the method call");
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException");
        } catch (RuntimeException ex) {
            System.out.println("RuntimeException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

    static void method1() throws Exception {
        System.out.println("div = " + (1 / 0));
    }

    // 12.4.7 What is displayed when running the following program?
    // a- RuntimeException in method()
    //    After the method call
    static void test07() {
        try {
            method2();
            System.out.println("After the method call");
        } catch (RuntimeException ex) {
            System.out.println("RuntimeException in main");
        } catch (Exception ex) {
            System.out.println("Exception in main");
        }
    }

    static void method2() throws Exception {
        try {
            String s = "abc";
            System.out.println(s.charAt(3));
        } catch (RuntimeException ex) {
            System.out.println("RuntimeException in method()");
        } catch (Exception ex) {
            System.out.println("Exception in method()");
        }
    }

    // 12.4.8 What does the method getMessage() do?
    // a- Returns the string the Exception was created with.

    // 12.4.9 What does the method printStackTrace() do?
    // a- Prints the stack of the functions that called the offending method.

    // 12.4.10 Does the presence of a try-catch block impose overhead when no exception
    //         occurs?
    // a- No.


    // 12.4.11 Correct a compile error in the following code:
    public void m(int value) throws Exception {  // add exception declaration
        if (value < 40) {
            throw new Exception("value is too small");
        }
    }


    public static void main(String[] args) {
        //test06();
        test07();
    }
}
