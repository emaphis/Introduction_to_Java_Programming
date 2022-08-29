/*
 * Check Point 11.3.1
 *
 */
package chapter11.check_point;

/**
 * No-arg constructors
 * @author emaph
 */
public class C1 {
    public static void main(String[] args) {
        B1 b = new B1();
    }
}

class B1 extends A1 {
    public B1() {}
}

class A1 {
    public A1(int x) { }

    // get this to compiles
    public A1() {}
}
