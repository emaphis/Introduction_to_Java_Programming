/*
 * Check Point 12.9 - Defining Custom Exception Classes
 */
package chapter12.check_point;

import chapter12.example.listing12_10.CircleWithCustomException;


public class CheckPoint12_09 {

    // 12.9.1 How do you define a custom exception class?
    // a- Create a class that extend java.util.Exception.

    // 12.9.2 Suppose that the setRadius method throws the InvalidRadiusException
    //        defined in Listing 12.10. What is displayed when running the
    //        following program?
    // a- RuntimeException in method()"
    //    After the method call
    // The custom Exception is a subclass of Exception.

    public static void main(String[] args) {
        try {
            method();
            System.out.println("After the method call");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException in main");
        } catch (Exception ex) {
            System.out.println("Exception in main");
        }
    }

    static void method() throws Exception {
        try {
            CircleWithCustomException c1 = new CircleWithCustomException(1);
            c1.setRadius(-1);
            System.out.println(c1.getRadius());
        }
        catch (RuntimeException ex) {
            System.out.println("RuntimeException in method()\"");
        }
        catch (Exception ex) {
            System.out.println("Exception in method()");
            throw ex;
        }
    }
}
