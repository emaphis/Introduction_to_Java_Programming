/*
 * Check Point 9.3
 *
 */
package chapter09.check_point;

/**
 *
 * @author emaph
 */
public class CheckPoint09_03 {
    // 9.3.1 Describe the relationship between an object and its defining class.
    // a. Class provides a template for a class, it's definition.
    //    Object is an instance of a class ddfinition

    // 9.3.2 How do you define a class?
    // a. class keyword - class name - class body
    static class A {
        // body.
    }

    // 9.3.3 How do you declare an object’s reference variable?
    // a. Class label - object name
    static void meth() {
        A a;
    }

    // 9.3.4 How do you create an object?
    // a.using new keyword  then a contructor call.
    static void meth2() {
        A a = new A();
    }

    public static void main(String[] args) {
        meth();
        meth2();
    }
}
