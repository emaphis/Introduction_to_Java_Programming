/*
 * Check Point 6.8
 * Method overloading
 */
package chapter06.check_point;

/**
 *  Method overloading
 * @author emaph
 */
public class CheckPoint06_08 {

    // 6.8.1 What is method overloading? Is it permissible to define two methods that have the
    //       same name but different parameter types? Is it permissible to define two methods
    //       in a class that have identical method names and parameter lists, but different return
    //       value types or different modifiers?

    // a. Given two methods in a class thes same anem.
    //    Yes, but the parameters must have different names or different parameter numbers
    //    No, differing return types don't distinguish overloaded methods
    //    Methods only differ in return types, this is illegal.


    // 6.8.2 What is wrong in the following program?
    public static void method2(int x) {
    }

  //  public static int method2(int y) {
  //      return y;
  //  }


    // 6.8.3 Given two method definitions,

    public static double m(double x, double y) { return 1.0; }

    public static double m(int x, double y) { return 2.0; }

    // ell which of the two methods is invoked for:

    static void method3() {
        // a
        double z1 = m(4, 5);  // second

        // b
        double z2 = m(4, 5.4);  // second

        // c
        double z3 = m(4.5, 5.4);  // first

        System.out.println("a= " + z1 + " b= " + z2 + " c= " + z3);
    }

    public static void main(String[] args) {
        method3();
    }
}
